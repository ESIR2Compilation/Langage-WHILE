package code3a;

public class EndFunct extends Chevron {
	private String opCode;
	
	public EndFunct() {
		super("", "", "");
		this.opCode="";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<EndFunct,_,_,_>";
	}

	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return "return res;\n"+"}";
	}

}
