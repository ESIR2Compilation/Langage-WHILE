package code3a;

public class Cons extends Chevron {
	private String opCode;

	public Cons(String write, String read1, String read2) {
		super(write, read1, read2);
		this.opCode="Cons";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<Cons,"+getWrite()+","+getRead1()+","+getRead2()+">";
	}

	@Override
	public String getCodeJava() {
		String res="BinTree<String> "+getRead1()+" = new BinTree<String>('"+getRead1()+"'); \n";
		 res+="BinTree<String> "+getRead2()+" = new BinTree<String>('"+getRead2()+"'); \n";
		 res+="BinTree<String> "+getWrite()+" = new BinTree<String>("+getRead1()+","+getRead2()+");";
		return res;
	}

}
