package code3a;

import tabSymb.TabSymbole;

public class Symbole extends Chevron {
	private String opCode;
	
	public Symbole(String write) {
		super(write, "_", "_");
		this.opCode="Symb";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Symb,"+getWrite()+",_,_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab, String idFonct) {
		int ind1=tab.getTabSymb().indexOf(getWrite());
		String s="";
		if(ind1>=0) s="symb"+ind1;
		else s=getWrite();
		return "Bintree "+s+" = Bintree.NIL;";
	}

}
