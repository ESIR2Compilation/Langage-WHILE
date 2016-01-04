package code3a;

import java.util.ArrayList;
import java.util.List;

import libWhile.BinTree;

public class If implements Chevron{

	private BinTree<String> expression;
	private List<Chevron> ifc;
	private List<Chevron> elsec;


	public If(BinTree<String> expression) {
		super();
		this.expression = expression;
		this.ifc = new ArrayList<Chevron>();
		this.elsec = new ArrayList<Chevron>();;
	}


	public BinTree<String> getExpression() {
		return expression;
	}

	public List<Chevron> getIfc() {
		return ifc;
	}

	public List<Chevron> getElsec() {
		return elsec;
	}

	public void addCommandIf(Chevron c){
		ifc.add(c);
	}
	
	public void addCommandElse(Chevron c){
		elsec.add(c);
	}
}
