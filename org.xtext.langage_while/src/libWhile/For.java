package libWhile;

public class For extends AbsCommande{

	private BinTree<String> expr;
	private AbsCommande commande;
	
	public For(BinTree<String> expr, AbsCommande commande) {
		super();
		this.expr = expr;
		this.commande = commande;
	}

	public void executer() {

		final int cpt =expr.nbTl(); 
		for(int i=0;i<cpt;i++){
			commande.executer();
		}
	}

}