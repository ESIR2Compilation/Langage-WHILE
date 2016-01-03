package libWhile;

public class While extends AbsCommande {

	private BinTree<String> exp;
	private AbsCommande commande;
	
	public While(BinTree<String> exp, AbsCommande commande) {
		super();
		this.exp = exp;
		this.commande = commande;
	}

	public void executer() {
		while(!exp.isNil()){
			commande.executer();
			exp=exp.getTl();
		}
		
	}

}
