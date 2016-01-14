package code3a;

import tabSymb.TabSymbole;

public class Tail extends Chevron {
	private String opCode;

	public Tail(String write, String read1) {
		super(write, read1, "");
		this.opCode="Tail";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Teal,"+getWrite()+","+getRead2()+",_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind2=tab.getFonction(idFonct).getTabVars().indexOf(getRead2());
		String res="";//"BinTree "+getRead1()+" = new BinTree('"+getRead1()+"'); \n";
		 //res+="BinTree "+getRead2()+" = new BinTree('"+getRead2()+"'); \n";
		 res+="BinTree "+getWrite()+" = new BinTree( var "+ind2+", nil);";
		return res;
	}

}
