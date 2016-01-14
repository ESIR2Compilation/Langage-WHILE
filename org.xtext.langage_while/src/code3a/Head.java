package code3a;

import tabSymb.TabSymbole;

public class Head extends Chevron {
	private String opCode;

	public Head(String write, String read2) {
		super(write, "", read2);
		this.opCode="Head";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Head,"+getWrite()+",_,"+getRead2()+">";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind2=tab.getFonction(idFonct).getTabVars().indexOf(getRead2());
		String res="";//"BinTree<String> "+getRead1()+" = new BinTree<String>('"+getRead1()+"'); \n";
		 //res+="BinTree<String> "+getRead2()+" = new BinTree<String>('"+getRead2()+"'); \n";
		 res+="BinTree<String> "+getWrite()+" = new BinTree<String>( nil, var"+ind2+");";
		return res;
	}

}
