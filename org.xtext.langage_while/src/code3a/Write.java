package code3a;

public class Write extends SimpleCommande{

	private String variable;

	public Write(String var){
		this.variable=var;
	}
	
	public String getVar(){
		return this.variable;
	}
}
