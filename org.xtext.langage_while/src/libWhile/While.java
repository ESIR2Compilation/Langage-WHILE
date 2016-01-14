package libWhile;

public class While extends AbsCommande {

	private BinTree exp;
	private AbsCommande commande;
	
	public While(BinTree exp, AbsCommande commande) {
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
