package code3a;

public class BinTreeWh {

	public static final BinTreeWh NIL = new BinTreeWh("nil");
	
	private String noeud;
	private BinTreeWh sag;
	private BinTreeWh sad;
	
	private BinTreeWh(String name){
		this.noeud = name;
		sag = null;
		sad = null;
	}
	
	private BinTreeWh(BinTreeWh a, BinTreeWh b) {
		this.noeud = a.getName() + "_" + b.getName();
		this.sag = a;
		this.sad = b;
	}
	
	private void addDroite(BinTreeWh a, String s)
	{ BinTreeWh Actu = a;
	
	 while (Actu.noeud != ""){
			Actu = Actu.sag;
			
		  }
	 
		
	
	}
	
	
	public String getName(){
		return noeud;
	}
	
	public boolean isNil(){
		return (sag == null && sad == null);
	}
	
	/**
	 * Construit un arbre à partir de deux arbres
	 * @param A Arbre while
	 * @param B Arbre while
	 * @return Arbre contenant les deux passés en paramètres
	 */
	public static BinTreeWh cons(BinTreeWh A, BinTreeWh B){
		return new BinTreeWh(A, B);
	}
}
