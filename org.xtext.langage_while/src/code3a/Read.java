package code3a;

import tabSymb.TabSymbole;

public class Read extends Chevron{
	
	private String opCode;
	private static int cpt=0;

	public Read(String x) {
		super(x, "", "");
		this.opCode="";
		// TODO Auto-generated constructor stub
	}

	public String getOpCode() {
		return opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "<Read,"+this.getWrite() +",_,_>";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		// TODO Auto-generated method stub
		return getCodeJava(2,tab,idFonct);
	}
	
	public String getCodeJava(int cpt,TabSymbole tab,String idFonct){
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getWrite());
		String res="BinTree<String> var"+ind1;
		this.cpt++;
		if(this.cpt >= cpt){
			res+=")\n{\n"+" ArrayList<BinTree<String>> res= new ArrayList<BinTree<String>>();";
			this.cpt=0;
		}
		else {
			res+=",";
			this.cpt++;
		}
		
		return res;
	}

}
