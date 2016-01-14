package code3a;

import tabSymb.TabSymbole;

public class Cons extends Chevron {
	private String opCode;

	public Cons(String write, String read1, String read2) {
		super(write, read1, read2);
		this.opCode="Cons";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Cons,"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		int ind2=tab.getFonction(idFonct).getTabVars().indexOf(getRead2());
		String s1="";
		String s2="";
		String res="";//"BinTree<String> "+getRead1()+" = new BinTree('"+getRead1()+"'); \n";
		if(ind1>=0) s1="var"+ind1;
		else s1=getRead1();
		if(ind1>=0) s2="var"+ind2;
		else s2=getRead2();
		 res+="BinTree "+getWrite()+" = new BinTree(\" "+getWrite()+"\","+s1+", "+s2+");";
		return res;
	}

}
