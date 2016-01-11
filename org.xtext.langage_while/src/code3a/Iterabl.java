package code3a;

import java.util.*;

public class Iterabl extends Chevron {
	private List<Chevron> commandes;
	private String type;
	
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
		return  "<"+type+"{"+commandes.toString()+"},"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava() {
		return "For f= new For("+getRead1()+getCommandes().get(0).getRead1()+")";
	}
}
