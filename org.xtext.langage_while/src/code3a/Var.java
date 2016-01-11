package code3a;

public class Var extends Chevron {
	private String opcode;

	public Var(String write) {
		super(write, "_", "_");
		this.opcode="Var";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Var,"+getWrite()+",_,_>";
	}

	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return "Bintree<Sttring> "+getWrite()+" = new Bintree<String>();";
	}

}
