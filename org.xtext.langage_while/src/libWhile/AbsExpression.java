package libWhile;

public abstract class AbsExpression {
	private String code;

	public AbsExpression() {
		super();
		this.code = "";
	}
	
	public abstract  BinTree evaluer(); 
	

}
