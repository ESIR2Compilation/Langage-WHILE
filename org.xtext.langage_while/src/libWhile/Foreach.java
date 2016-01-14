package libWhile;

public class Foreach extends AbsCommande{
	private BinTree expr;
	private BinTree x;
	private AbsCommande commande;
	
	public Foreach(BinTree expr, BinTree x, AbsCommande commande) {
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
