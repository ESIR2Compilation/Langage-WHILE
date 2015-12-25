package libWhile;

public class TreeWhile {
	
	public static BinTree<String> creerTreeWhile(String val){
		return new BinTree<String>(val);
	}
	
	public static BinTree<String> creerTreeWhile(String val,BinTree<String> fg, BinTree<String> fd){
		return new BinTree<String>(val,fg,fd);
	}
	
	public static BinTree<String> creerTreeWhile(){
		return new BinTree<String>();
	}
}