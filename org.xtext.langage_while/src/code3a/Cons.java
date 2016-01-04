package code3a;

import libWhile.BinTree;

public class Cons {
	private String racine;
	private BinTree<Chevron> arbrein1;
	private BinTree<Chevron> arbrein2;

	
	private Cons(String r,BinTree<Chevron> a,BinTree<Chevron> b){
		this.racine=r;
		this.arbrein1=a;
		this.arbrein2=b;

	}
	public BinTree<Chevron> getArbrein1(){
		return arbrein1;
	}
	
	public BinTree<Chevron> getArbrein2(){
		return arbrein2;
	}


	
}
