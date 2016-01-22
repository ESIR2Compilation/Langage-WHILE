package code3a;

import java.util.ArrayList;
import java.util.List;

import tabSymb.TabSymbole;

public class If extends Chevron {
	
	private List<Chevron> commandes1;
	private List<Chevron> commandes2;
	
	private If(List<Chevron> commandes1,List<Chevron> commandes2, String write, String read1, String read2) {
		super(write, read1, read2);
		this.commandes1 = commandes1;
		this.commandes2 = commandes2;

	}
	
	public static If createIf(String expr){
		return new If(new ArrayList<Chevron>(),new ArrayList<Chevron>(), "_", expr, "_");
	}

	public List<Chevron> getCommandes1() {
		return commandes1;
	}
	
	public List<Chevron> getCommandes2() {
		return commandes1;
	}
	
	public void setCommandes1(List<Chevron> commandes) {
		this.commandes1 = commandes;
	}
	
	public void setCommandes2(List<Chevron> commandes) {
		this.commandes2 = commandes;
	}
	
	public void addCommande1(Chevron cmd){
		this.commandes1.add(cmd);
	}
	
	public void addCommande2(Chevron cmd){
		this.commandes2.add(cmd);
	}
	
	public String getName(){
		return this.getWrite();
	}



	@Override
	public String toString() {
		return  "<If"+"[!  C1{"+commandes1.toString()+"} C2{"+commandes2.toString()+"}  !] ,"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		String s="";
		if(ind1>=0) s="var"+ind1;
		else s=getRead1();
		String code="if( "+s+".isNil()){\n";
		for(Chevron ch: commandes2){
			code+="  "+ch.getCodeJava(tab,idFonct)+"\n";
		}
		code+="}\n else{\n";
		for(Chevron ch: commandes1){
			code+="  "+ch.getCodeJava(tab,idFonct)+"\n";
		}
		code+="}\n";
		return code;//"For f= new For("+getRead1()+getCommandes().get(0).getRead1()+")";
	}
}

