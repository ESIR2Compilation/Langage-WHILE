package libWhile;

public class While extends AbsInstruction {

	private BinTree<String> exp;
	private AbsInstruction commande;
	
	public While(BinTree<String> exp, AbsInstruction commande) {
		super();
		this.exp = exp;
		this.commande = commande;
	}

	public BinTree<String> evaluer() {
		while(!exp.isNil()){
			commande.evaluer();
			exp=exp.getTl();
		}
		
		return BinTree.NIL;
	}

}
