package code3a;

import java.util.ArrayList;
import java.util.List;

import tabSymb.TabSymbole;

public class IfConf extends Chevron {
	private List<Chevron> commandes;

	private IfConf(List<Chevron>commandes,String write, String read1, String read2) {
		super(write, read1, read2);
		this.commandes=commandes;
	}

	public static IfConf createIfConf(String exp){
		return new IfConf(new ArrayList<Chevron>(), "_", exp, "_");
	}
	
	public void addCommande(Chevron cmd){
		this.commandes.add(cmd);
	}
	
	@Override
	public String toString() {
		return "<IfConf{"+commandes.toString()+"},"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava(TabSymbole tab,String idFonct) {
		int ind1=tab.getFonction(idFonct).getTabVars().indexOf(getRead1());
		String s="";
		if(ind1>=0) s="var"+ind1;
		else s=getRead1();
		String code="if(!var"+s+".isNill()){\n";
		for(Chevron ch: commandes){
			code+=ch.getCodeJava(tab,idFonct)+"\n";
		}
		code+="}\n";
		return code;
	}

}
