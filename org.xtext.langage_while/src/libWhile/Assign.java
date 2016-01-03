package libWhile;

import java.util.*;

public class Assign extends AbsCommande{
	private List<BinTree<String>> vars;
	private List<BinTree<String>> exprs;
	
	public Assign(List<BinTree<String>> vras, List<BinTree<String>> exprs) {
		super();
		this.vars = vras;
		this.exprs = exprs;
	}


	public void executer() {
		 List<BinTree<String>> tmp=new ArrayList<BinTree<String>>();
		 for(BinTree<String> x:exprs){
			 //x.evaluer();???
			 tmp.add(x);
		 }
		 int i=0;
		 for(BinTree<String> x:tmp){
			 vars.set(i, x);
		 }
	}

}
