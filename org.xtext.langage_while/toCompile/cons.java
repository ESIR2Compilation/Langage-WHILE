import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Steven, Ali, Ilyass, Othman
 * @group C, ESIR2Compilation
 * @teacher M.Ridoux - Compilation
 *
 **/

public class cons {

	public static List<BinTree> funct1(
	BinTree var0,BinTree var1)
	{
		List<BinTree> res= new ArrayList<BinTree>();
		BinTree tmp1 = new BinTree(" tmp1",BinTree.NIL, var0);
		 //*********Affectation*******
		 List<BinTree> varTmp1=new ArrayList<BinTree>(); 
		   varTmp1.add(tmp1);
		   int cmpt1=0;
		   var0 = varTmp1.get(cmpt1);
		 cmpt1++;
		//******endAffectation*******
		
		BinTree tmp2 = new BinTree(" tmp2",BinTree.NIL, var0);
		if( var1.isNil()){
			  System.out.println("Nop");
		}
		 else{
			   //*********Affectation*******
			 List<BinTree> varTmp2=new ArrayList<BinTree>(); 
			   varTmp2.add(tmp2);
			   int cmpt2=0;
			   var0 = varTmp2.get(cmpt2);
			 cmpt2++;
			//******endAffectation*******
			
		}
		
		res.add(var0);
		return res;
	}


	public static void main(String[] args) {

		if (args.length != 2) {
			System.err.println("[Erreur] Mauvais nombre d'arguments. Le programme attend 2 arguments.");
			System.exit(1);
		}

		BinTree arg0 = BinTree.NIL;
		BinTree arg1 = BinTree.NIL;
		try {
			arg0 = new BinTree(Integer.parseInt(args[0]));
			arg1 = new BinTree(Integer.parseInt(args[1]));
		} catch (Exception e) {
			System.err.println("[Erreur] Malformation d'un ou de plusieurs arguments.");
			System.exit(1);
		}

		System.out.println(funct1(arg0, arg1));
	}
}