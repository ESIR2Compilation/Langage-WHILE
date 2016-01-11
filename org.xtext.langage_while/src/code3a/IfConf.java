package code3a;

import java.util.ArrayList;
import java.util.List;

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
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return null;
	}

}
