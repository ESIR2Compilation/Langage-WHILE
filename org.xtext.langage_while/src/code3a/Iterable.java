package code3a;

import java.util.*;

import libWhile.BinTree;

public  class Iterable implements Chevron {
	private List<Chevron> commandes;
	private String write1;
	private String write2;
	private BinTree<String> expr;
	private String name;
	
	private Iterable(List<Chevron> commandes, String write1, String write2, BinTree<String> expr) {
		super();
		this.commandes = commandes;
		this.write1 = write1;
		this.write2 = write2;
		this.expr = expr;
	}
	
	public Iterable createFor(List<Chevron> commandes,BinTree<String> expr){
		return new Iterable(commandes, "For", "For", expr);
	}
	
	public Iterable createWhile(List<Chevron> commandes,BinTree<String> expr){
		return new Iterable(commandes, "While", "While", expr);
	}
	
	public Iterable createForeach(List<Chevron> commandes,BinTree<String> expr){
		return new Iterable(commandes, "Foreach", "Foreach", expr);
	}
	
	public List<Chevron> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Chevron> commandes) {
		this.commandes = commandes;
	}

	public String getWrite1() {
		return write1;
	}

	public void setWrite1(String write1) {
		this.write1 = write1;
	}

	public String getWrite2() {
		return write2;
	}

	public void setWrite2(String write2) {
		this.write2 = write2;
	}

	public BinTree<String> getExpr() {
		return expr;
	}

	public void setExpr(BinTree<String> expr) {
		this.expr = expr;
	}

	public String getName(){
		return this.write1;
	}
	
	public void addCommande(Chevron cmd){
		this.commandes.add(cmd);
	}

}
