package code3a;

public class Read extends SimpleCommande {

	private String variable;

	public Read(String var){
		this.variable=var;
	}
	
	public String getVar(){
		return this.variable;
	}
	
	@Override
	public String toString(){
		return "<Read, " + variable + ">";
	}
}
