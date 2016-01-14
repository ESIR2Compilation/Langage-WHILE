package code3a;

import tabSymb.TabSymbole;

public class Teal extends Chevron {
	private String opCode;

	public Teal(String write, String read1) {
		super(write, read1, "");
		this.opCode="Teal";
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
		String res="";//"BinTree<String> "+getRead1()+" = new BinTree<String>('"+getRead1()+"'); \n";
		 //res+="BinTree<String> "+getRead2()+" = new BinTree<String>('"+getRead2()+"'); \n";
		 res+="BinTree<String> "+getWrite()+" = new BinTree<String>( var "+ind2+", nil);";
		return res;
	}

}
