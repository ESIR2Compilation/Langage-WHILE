package libWhile;

import java.util.*;

public class Assign extends AbsCommande{
	private List<BinTree> vars;
	private List<BinTree> exprs;
	
	public Assign(List<BinTree> vras, List<BinTree> exprs) {
		super();
		this.vars = vras;
		this.exprs = exprs;
	}


	public void executer() {
		 List<BinTree> tmp=new ArrayList<BinTree>();
		 for(BinTree x:exprs){
			 //x.evaluer();???
			 tmp.add(x);
		 }
		 int i=0;
		 for(BinTree x:tmp){
			 if(i>=vars.size())
			 vars.set(i, x);
			 i++;
		 }
		// ArrayList l={"n","b"}
	}

}
