package code3a;

import java.util.*;

import libWhile.BinTree;
import tabSymb.TabSymbole;

public class Affect extends Chevron {
	private List<String> vars;
	private List<String> exprs;
	private static int cptvarTmp=0;

	private Affect(String write, String read1, String read2,List<String> vars,List<String> exprs ) {
		super(write, read1, read2);
		this.exprs=exprs;
		this.vars=vars;
		
	}
	
	public static Affect createAffect(){
		return new Affect("_", "_", "_", new ArrayList<String>(),  new ArrayList<String>());
	}
	
   public void addVars(String var){
	   this.vars.add(var);
   }
   
   public void addExpr(String exp){
	   exprs.add(exp);
   }
	@Override
	public String toString() {
		return "<Assign"+"[!  Vars{"+vars.toString()+"} Exprs{"+exprs.toString()+"}  !] ,"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		cptvarTmp++;
		String res=" //*********Affectation*******\n List<BinTree> varTmp"+cptvarTmp+"=new ArrayList<BinTree>(); \n";
		for(String ex:exprs){
			int i=tab.getFonction(idFonct).getTabVars().indexOf(ex);
			if(i>=0) res+="   varTmp"+cptvarTmp+".add(var"+i+");\n";
			else res+="   varTmp"+cptvarTmp+".add("+ex+");\n";
		}
		//res+="for(BinTree x:varTmp){\n";
		res+="   int cmpt"+cptvarTmp+"=0;\n";
		int cpt=0;
		for(String v:vars){
			if(cpt==exprs.size()) break;
			int ind1=tab.getFonction(idFonct).getTabVars().indexOf(v);
			res+="   var"+ind1+" = "+"varTmp"+cptvarTmp+".get(cmpt"+cptvarTmp+");\n cmpt"+cptvarTmp+"++;\n";
			cpt++;
			
		}
		res+="//******endAffectation*******\n";
		return res;
	}

}
