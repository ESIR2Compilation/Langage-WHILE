package steven;

import java.util.ArrayList;
import java.util.List;


/**
 * @author steven
 */

public class BinTree {

	public static final BinTree NIL = new BinTree("NIL");
	private String name;
	private BinTree fg;
	private BinTree fd;
	private int depth;

	//========================== constructeurs ================================

	public BinTree(int profondeur){
		BinTree tmp = new BinTree("cons(NIL NIL)", NIL, NIL);

		// -2 car la feuille et la racine est codé manuellement
		for(int i = 0; i < (profondeur - 2); ++i){
			tmp = cons(NIL, tmp);
			tmp.setProfondeur(i);
		}

		setNom("cons(NIL " + tmp.getNom() + ")");
		setTail(NIL);
		setHead(tmp);
		setProfondeur(profondeur);
	}

	private static BinTree cons(BinTree sag, BinTree sad){
		BinTree res = new BinTree("cons(" + sag.getNom() + " " + sad.getNom() + ")");
		res.setTail(sag);
		res.setHead(sad);
		res.setProfondeur(Math.max(sag.getProfondeur(), sad.getProfondeur()));
		return res;
	}

	private BinTree(String name){
		super();
		setNom(name);
		setHead(fd);
		setTail(fg);
	}

	public BinTree(String name, BinTree fg, BinTree fd) {
		this.name = name;
		this.fg = fg;
		this.fd = fd;
	}

	//========================Méthodes pratiques================
	
	
	public boolean estNil(){
		return this.equals(NIL);
	}

	public boolean existHead(){
		return ! (estNil() && getHead().estNil());
	}

	public boolean existTail(){
		return ! (estNil() && getTail().estNil());
	}

	public int nbTail(){
		if(estNil()) return 0;
		return 1 + getTail().nbTail();
	}

	public int nbHead(){
		if(estNil()) return 0;
		return 1 + getHead().nbHead();
	}

	@Override
	public String toString(){
		return getNom() + ", [DEPTH = " + getProfondeur() + "]";
	}
	
	// =========== Accesseurs =========
	public String getNom() {
		return name;
	}

	public void setNom(String name) {
		this.name = name;
	}

	public BinTree getTail() {
		return fg;
	}

	public void setTail(BinTree fg) {
		this.fg = fg;
	}

	public BinTree getHead() {
		return fd;
	}

	public void setHead(BinTree fd) {
		this.fd = fd;
	}
	
	private void setProfondeur(int depth) {
		this.depth = depth;
	}

	public int getProfondeur(){
		return depth;
	}
	
	// ======== Affichage ==========

	 public static void print(BinTree root)
	    {
	        List<List<String>> lines = new ArrayList<List<String>>();

	        List<BinTree> level = new ArrayList<BinTree>();
	        List<BinTree> next = new ArrayList<BinTree>();

	        level.add(root);
	        int nn = 1;

	        int widest = 0;

	        while (nn != 0) {
	            List<String> line = new ArrayList<String>();

	            nn = 0;

	            for (BinTree n : level) {
	                if (n == null) {
	                    line.add(null);

	                    next.add(null);
	                    next.add(null);
	                } else {
	                    String aa = n.getNom();
	                    line.add(aa);
	                    if (aa.length() > widest) widest = aa.length();

	                    next.add(n.getTail());
	                    next.add(n.getHead());

	                    if (n.getTail() != null) nn++;
	                    if (n.getHead() != null) nn++;
	                }
	            }

	            if (widest % 2 == 1) widest++;

	            lines.add(line);

	            List<BinTree> tmp = level;
	            level = next;
	            next = tmp;
	            next.clear();
	        }

	        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
	        for (int i = 0; i < lines.size(); i++) {
	            List<String> line = lines.get(i);
	            int hpw = (int) Math.floor(perpiece / 2f) - 1;

	            if (i > 0) {
	                for (int j = 0; j < line.size(); j++) {

	                    // split node
	                    char c = ' ';
	                    if (j % 2 == 1) {
	                        if (line.get(j - 1) != null) {
	                            c = (line.get(j) != null) ? '┴' : '┘';
	                        } else {
	                            if (j < line.size() && line.get(j) != null) c = '└';
	                        }
	                    }
	                    System.out.print(c);

	                    // lines and spaces
	                    if (line.get(j) == null) {
	                        for (int k = 0; k < perpiece - 1; k++) {
	                            System.out.print(" ");
	                        }
	                    } else {

	                        for (int k = 0; k < hpw; k++) {
	                            System.out.print(j % 2 == 0 ? " " : "─");
	                        }
	                        System.out.print(j % 2 == 0 ? "┌" : "┐");
	                        for (int k = 0; k < hpw; k++) {
	                            System.out.print(j % 2 == 0 ? "─" : " ");
	                        }
	                    }
	                }
	                System.out.println();
	            }

	            // print line of numbers
	            for (int j = 0; j < line.size(); j++) {

	                String f = line.get(j);
	                if (f == null) f = "";
	                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
	                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

	                // a number
	                for (int k = 0; k < gap1; k++) {
	                    System.out.print(" ");
	                }
	                System.out.print(f);
	                for (int k = 0; k < gap2; k++) {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();

	            perpiece /= 2;
	        }
	    }
	 
	public static void main(String[] args){
		print(new BinTree(2));
	}
}