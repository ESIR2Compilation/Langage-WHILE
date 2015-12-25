package libWhile;

public class For extends AbsInstruction{

	private BinTree<String> expr;
	private AbsInstruction commande;
	
	public For(BinTree<String> expr, AbsInstruction commande) {
		super();
		this.expr = expr;
		this.commande = commande;
	}

	public BinTree<String> evaluer() {

		final int cpt =expr.nbTl(); 
		for(int i=0;i<cpt;i++){
			commande.evaluer();
		}
		return BinTree.NIL;
	}

}
