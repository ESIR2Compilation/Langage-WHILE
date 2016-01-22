import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Steven, Ali, Ilyass, Othman
 * @group C, ESIR2Compilation
 * @teacher M.Ridoux - Compilation
 *
 **/

public class busy2 {

	public static List<BinTree> funct1(
	BinTree var0)
	{
		List<BinTree> res= new ArrayList<BinTree>();
		BinTree tmp1 = new BinTree(" tmp1",BinTree.NIL, var0);
		while( !var0.isNil() ){
			  final int cpt1=var0.nbHd();
			 for(int i1=0;i1<cpt1;i1++){
				   //*********Affectation*******
				 List<BinTree> varTmp1=new ArrayList<BinTree>(); 
				   varTmp1.add(tmp1);
				   int cmpt1=0;
				   var0 = varTmp1.get(cmpt1);
				 cmpt1++;
				//******endAffectation*******
				
			}
			
		}
		
		res.add(var0);
		return res;
	}


	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("[Erreur] Mauvais nombre d'arguments. Le programme attend 1 arguments.");
			System.exit(1);
		}

		BinTree arg0 = BinTree.NIL;
		try {
			arg0 = new BinTree(Integer.parseInt(args[0]));
		} catch (Exception e) {
			System.err.println("[Erreur] Malformation d'un ou de plusieurs arguments.");
			System.exit(1);
		}

		System.out.println(funct1(arg0));
	}
}