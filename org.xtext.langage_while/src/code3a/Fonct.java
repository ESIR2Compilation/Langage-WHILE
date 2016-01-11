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
		// TODO Auto-generated method stub
		return "<Funct,_,"+getRead1()+",_>";
	}

	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return "public static List<BinTree> "+getRead1()+"(";
	}

}
