package code3a;

public class Read extends Chevron{
	
	private String opCode;
	private static int cpt=0;

	public Read(String x) {
		super(x, "", "");
		this.opCode="";
		// TODO Auto-generated constructor stub
	}

	public String getOpCode() {
		return opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "<Read,"+this.getWrite() +",_,_>";
	}

	@Override
	public String getCodeJava() {
		// TODO Auto-generated method stub
		return getCodeJava(2);
	}
	
	public String getCodeJava(int cpt){
		String res="BinTree "+getWrite();
		cpt++;
		if(this.cpt >= cpt){
			res+="){"+"res= new ArrayList<BinTree>();";
			this.cpt=0;
		}
		else {
			res+=",";
			this.cpt++;
		}
		return res;
	}

}
