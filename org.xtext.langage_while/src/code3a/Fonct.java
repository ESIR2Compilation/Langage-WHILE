package code3a;

public class Fonct extends Chevron {
	private String opcode;
	
	public Fonct(String read1) {
		super("", read1, "");
		this.opcode="Funct";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "<Funct,_,"+getRead1()+",_>";
	}

	@Override
	public String getCodeJava() {
		return "public static List<BinTree> "+getRead1()+"(";
	}

}
