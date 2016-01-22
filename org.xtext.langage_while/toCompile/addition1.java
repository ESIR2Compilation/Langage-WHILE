import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Steven, Ali, Ilyass, Othman
 * @group C, ESIR2Compilation
 * @teacher M.Ridoux - Compilation
 *
 **/

public class addition1 {

	public static List<BinTree> funct1(
	BinTree var0,BinTree var1,BinTree var2)
	{
		List<BinTree> res= new ArrayList<BinTree>();
		BinTree tmp1 = new BinTree(" tmp1",var0, var1);
		 //*********Affectation*******
		 List<BinTree> varTmp1=new ArrayList<BinTree>(); 
		   varTmp1.add(var1);
		   varTmp1.add(var2);
		   varTmp1.add(tmp1);
		   int cmpt1=0;
		   var0 = varTmp1.get(cmpt1);
		 cmpt1++;
		   var1 = varTmp1.get(cmpt1);
		 cmpt1++;
		   var2 = varTmp1.get(cmpt1);
		 cmpt1++;
		//******endAffectation*******
		
		res.add(var0);
		res.add(var1);
		res.add(var2);
		return res;
	}


	public static void main(String[] args) {

		if (args.length != 3) {
			System.err.println("[Erreur] Mauvais nombre d'arguments. Le programme attend 3 arguments.");
			System.exit(1);
		}

		BinTree arg0 = BinTree.NIL;
		BinTree arg1 = BinTree.NIL;
		BinTree arg2 = BinTree.NIL;
		try {
			arg0 = new BinTree(Integer.parseInt(args[0]));
			arg1 = new BinTree(Integer.parseInt(args[1]));
			arg2 = new BinTree(Integer.parseInt(args[2]));
		} catch (Exception e) {
			System.err.println("[Erreur] Malformation d'un ou de plusieurs arguments.");
			System.exit(1);
		}

		System.out.println(funct1(arg0, arg1, arg2));
	}
}