package code3a;

public class Write extends Chevron {

	private String opCode;
	
	public Write(String x) {
		super("", x, "");
		this.opCode="";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Write,_,"+this.getRead1()+",_>";
	}

	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return "res.add("+getRead1()+");";
	}

}
