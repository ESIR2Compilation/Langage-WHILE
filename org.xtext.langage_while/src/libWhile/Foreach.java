package libWhile;

public class Foreach extends AbsCommande{
	private BinTree<String> expr;
	private BinTree<String> x;
	private AbsCommande commande;
	
	public Foreach(BinTree<String> expr, BinTree<String> x, AbsCommande commande) {
		super();
		this.expr = expr;
		this.x = x;
		this.commande = commande;
	}

	

	@Override
	public void executer() {
		final int cpt =expr.nbTl(); 
		for(int i=0;i<cpt;i++){
			commande.executer();
			x=expr.getTl();
		}		
	}

}
