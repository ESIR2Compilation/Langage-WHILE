package libWhile;

public class If extends AbsCommande{
	private BinTree<String> expr;
	private AbsCommande commande1;
	private AbsCommande commande2;
	
	public If(BinTree<String> exp, AbsCommande cmd){
		this.expr=exp;
		this.commande1=cmd;
		this.commande2=null;
	}
	
	public If(BinTree<String> exp, AbsCommande cmd,AbsCommande cmd2){
		this.expr=exp;
		this.commande1=cmd;
		this.commande2=cmd2;
	}
	
	public void executer() {
		//cas if avec else
		if(this.commande2!=null){
			if(expr.isNil()) commande2.executer();
			else commande1.executer();
		}
		else{
			if(!expr.isNil()) commande1.executer();
		}
		
	}
	

}
