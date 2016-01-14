package code3a;

import tabSymb.TabSymbole;

public class Nil extends Chevron{
	private String opCode;
	
	public Nil() {
		super("", "", "");
		this.opCode="Nil";
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Nil,_,_,_>";
	}
	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		// TODO Auto-generated method stub
		return "NIL";
	}

}
