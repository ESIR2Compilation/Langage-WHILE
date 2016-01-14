package code3a;

import java.util.*;

import tabSymb.TabSymbole;

public class Iterabl extends Chevron {
	private List<Chevron> commandes;
	private String type;
	private static int cpt=0;
	
	private Iterabl(List<Chevron> commandes, String write, String read1, String read2,String type) {
		super(write, read1, read2);
		this.commandes = commandes;
		this.type=type;
	}
	
	public static Iterabl createFor(String expr){
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, "_","For");
	}
	
	public static Iterabl createWhile(String expr){
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, "_","While");
	}
	
	public static Iterabl createForeach(String expr,String x){
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, x,"ForeEach");
	}
	
	public List<Chevron> getCommandes() {
		return commandes;
	}
	
	public void setCommandes(List<Chevron> commandes) {
		this.commandes = commandes;
	}
	
	public void addCommande(Chevron cmd){
		this.commandes.add(cmd);
	}
	
	public String getName(){
		return this.getWrite();
	}



	@Override
	public String toString() {
		return  "<"+type+"{"+commandes.toString()+"},"+getWrite()+","+getRead1()+","+getRead2()+">End"+type;
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		String code="";
		if(type=="For"){
			this.cpt++;
			String s="";
			if(ind1>=0) s="var"+ind1;
			else s=getRead1();
			 code="final int cpt"+this.cpt+"="+s+".nbTl();\n for(int i"+this.cpt+"=0;i"+this.cpt+"<cpt"+this.cpt+";i"+this.cpt+"++){\n";
			for(Chevron ch:commandes){
				code+="  "+ch.getCodeJava(tab,idFonct)+"\n";
			}
			code+="}\n";
		}
		else if(type=="While"){
			String s="";
			if(ind1>=0) s="var"+ind1;
			else s=getRead1();
			code="while( !"+s+".isNil() ){\n";
			for(Chevron ch:commandes){
				code+="  "+ch.getCodeJava(tab,idFonct)+"\n";
			}
			code+="}\n";
		}
		else{
			 this.cpt++;
			 String s="";
				if(ind1>=0) s="var"+ind1;
				else s=getRead1();
				 code="final int cpt"+this.cpt+"="+s+".nbTl();\n for(int i"+this.cpt+"=0;i"+this.cpt+"<cpt"+this.cpt+";i"+this.cpt+"++){\n";
				for(Chevron ch:commandes){
					code+="  "+ch.getCodeJava(tab,idFonct)+"\n";
				}
				code+="  "+getRead2()+"="+getRead1()+".getTl();\n}";
		}
		
		return code;
	}
}
