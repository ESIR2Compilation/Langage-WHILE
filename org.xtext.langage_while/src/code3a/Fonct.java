package code3a;

import tabSymb.TabSymbole;

public class Fonct extends Chevron {
	private String opcode;
	
	public Fonct(String read1) {
		super("", read1, "");
		this.opcode="Funct";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "<Funct,_,"+getRead1()+",_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		String nom=tab.getFonction(getRead1()).getNomCible();
		return "public static List< BinTree<String> > "+nom+"(";
	}

}
