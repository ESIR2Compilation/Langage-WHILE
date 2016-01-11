package code3a;

public class Nop extends Chevron {
	private String opCode;
	
	public Nop() {
		super("", "", "");
		this.opCode="Nop";
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Nop,_,_,_>";
	}
	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return "System.out.println('Nop');";
	}

}
