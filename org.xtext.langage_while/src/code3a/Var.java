package code3a;

import tabSymb.TabSymbole;

public class Var extends Chevron {
	private String opcode;

	public Var(String write) {
		super(write, "_", "_");
		this.opcode="Var";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "<Var,"+getWrite()+",_,_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		// TODO Auto-generated method stub
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getWrite());
		String s="";
		if(ind1>=0) s="var"+ind1;
		else s=getWrite();
		return "Bintree "+s+" = Bintree.NIL;";
	}

}
