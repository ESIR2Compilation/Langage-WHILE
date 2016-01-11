package code3a;

import java.util.*;

public class Iterabl extends Chevron {
	private List<Chevron> commandes;
	static String type;
	
	private Iterabl(List<Chevron> commandes, String write, String read1, String read2) {
		super(write, read1, read2);
		this.commandes = commandes;
	}
	
	public static Iterabl createFor(String expr){
		type ="For";
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, "_");
	}
	
	public static Iterabl createWhile(String expr){
		type ="While";
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, "_");
	}
	
	public static Iterabl createForeach(String expr,String x){
		type ="ForEach";
		return new Iterabl(new ArrayList<Chevron>(), "_", expr, x);
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
