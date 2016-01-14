package code3a;

import tabSymb.TabSymbole;

public class Nop extends Chevron {
	private String opCode;
	
	public Nop() {
		super("", "", "");
		this.opCode="Nop";
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Nop,_,_,_>";
	}
	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		// TODO Auto-generated method stub
		return "System.out.println(\"Nop\");";
	}

}
