package libWhile;

public class BinTree<E> {
	public static final BinTree<String> NIL = new BinTree<String>("nil");
	private E racine;
	private BinTree<E> fg;
	private BinTree<E> fd;
	
	//==========================constructeurs================================
    public BinTree(E val){
    	this.racine=val;
    	this.fd=null;
    	this.fg=null;
    }
    
    
    public BinTree(){
    	this.racine=null;
    	this.fd=null;
    	this.fg=null;
    }
    
	public BinTree(E racine, BinTree<E> fg, BinTree<E> fd) {
		super();
		this.racine = racine;
		this.fg = fg;
		this.fd = fd;
	}

	public E getRacine() {
		return racine;
	}

	public void setRacine(E racine) {
		this.racine = racine;
	}

	public BinTree<E> getTl() {
		return fg;
	}

	public void setTl(BinTree<E> fg) {
		this.fg = fg;
	}

	public BinTree<E> getHd() {
		return fd;
	}

	public void setHd(BinTree<E> fd) {
		this.fd = fd;
	}
	
	//========================Méthodes pratiques================
	public boolean estVide(){
		return (this.racine==null && this.fd==null && this.fg==null );
	}
	
	public boolean existHd(){
		assert(!estVide()):" appel de existFd sur un arbre vide";
		return (this.fd!=null && !this.fd.estVide());
	}
	
	public boolean existTl(){
		assert(!estVide()):"appel de existFg sur un arbre vide";
		return (this.fg!=null && !this.fg.estVide());
	}
	
	public boolean estFeuille(){
		assert(!estVide());
		return (!existTl()&& !existHd());
	}
	
	public int taille(){
		if(estVide()) return 0;
		else{
			if(existHd() && existTl()) return 1+getHd().taille()+getTl().taille();
			else if(existHd()) return 1+getHd().taille();
			else if(existTl()) return 1+getTl().taille();
			else return 1;
		}
	}
	
	public int nbTl(){
		if(!existTl()) return 0;
		else return 1+getTl().nbTl();
	}
	
	public int nbHd(){
		if(!existHd()) return 0;
		else return 1+getHd().nbHd();
	}
	
	public boolean isNil(){
		return this==NIL;
	}
	
	public void addTl(BinTree<E> b){
		assert(!estVide()):"appel de addFg sur un arbre vide!!!";
		if(!existTl()) this.setTl(b);
		else{
			BinTree<E> tmp=this.getTl();
			while(tmp.existTl()){
				tmp=tmp.getTl();
			}
			tmp.setTl(b);
		}
	}
	
	public void addHd(BinTree<E> b){
		assert(!estVide()):"appel de addFd sur un arbre vide!!!";
		if(!existHd()) this.setHd(b);
		else{
			BinTree<E> tmp=this.getHd();
			while(tmp.existHd()){
				tmp=tmp.getHd();
			}
			tmp.setHd(b);
		}
	}

}
