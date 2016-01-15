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
		return "<Tail,"+getWrite()+","+getRead1()+",_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind2=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		String res="";//"BinTree "+getRead1()+" = new BinTree('"+getRead1()+"'); \n";
		 //res+="BinTree "+getRead2()+" = new BinTree('"+getRead2()+"'); \n";
		String s="";
		if(ind2>=0) s="var"+ind2;
		else s=getRead1();
		 res+="BinTree "+getWrite()+" ="+s+".getTl();\n";
		return res;
	}

}
