package code3a;

import java.util.*;

public class Affect extends Chevron {
	private List<Chevron> vars;
	private List<Chevron> exprs;

	private Affect(String write, String read1, String read2,List<Chevron> vars,List<Chevron> exprs ) {
		super(write, read1, read2);
		this.exprs=exprs;
		this.vars=vars;
		
	}
	
	public static Affect createAffect(){
		return new Affect("_", "_", "_", new ArrayList<Chevron>(),  new ArrayList<Chevron>());
	}
	
   public void addVars(Chevron var){
	   this.vars.add(var);
   }
   
   public void addExpr(Chevron exp){
	   exprs.add(exp);
   }
	@Override
	public String toString() {
		return "<Assign"+"[Vars{"+vars.toString()+"} Exprs{"+exprs.toString()+"}] ,"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava() {
		
		return "Affectation non implémentée!!!!";
	}

}
