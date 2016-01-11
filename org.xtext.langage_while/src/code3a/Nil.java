package code3a;

public class Nil extends Chevron{
	private String opCode;
	
	public Nil() {
		super("", "", "");
		this.opCode="Nil";
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Nil,_,_,_>";
	}
	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return null;
	}

}
