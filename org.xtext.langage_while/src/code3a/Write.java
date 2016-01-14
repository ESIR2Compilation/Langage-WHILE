package code3a;

import tabSymb.TabSymbole;

public class Write extends Chevron {

	private String opCode;
	
	public Write(String x) {
		super("", x, "");
		this.opCode="";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Write,_,"+this.getRead1()+",_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		return "res.add(var"+ind1+");";
	}

}
