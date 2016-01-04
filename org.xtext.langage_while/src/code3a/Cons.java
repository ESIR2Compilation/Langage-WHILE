package code3a;

import libWhile.BinTree;

public class Cons {

	private BinTree<Chevron> arbre;
	
	private Cons(BinTree<Chevron> a,BinTree<Chevron> b){
		
		this.arbre=new BinTree<Chevron>();
		arbre.addHd(a);
		arbre.addTl(b);
	}

	
}
