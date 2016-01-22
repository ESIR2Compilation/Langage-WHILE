package debug;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Steven, Ali, Ilyass, Othman
 * @group C, ESIR2Compilation
 * @teacher M.Ridoux - Compilation
 *
 **/

public class addition {

	public static List<BinTree> funct1(
	BinTree var0,BinTree var1)
	{
		List<BinTree> res= new ArrayList<BinTree>();
		BinTree tmp1 = new BinTree(" tmp1",BinTree.NIL, var0);
		BinTree tmp2 = var1.getHd();
		BinTree.print(var0);
		final int cpt1=var1.nbTl();
		 for(int i1=0;i1<cpt1;i1++){
			   //*********Affectation*******
			 List<BinTree> varTmp1=new ArrayList<BinTree>(); 
			   varTmp1.add(tmp1);
			   int cmpt1=0;
			   var0 = varTmp1.get(cmpt1);
			 cmpt1++;
			//******endAffectation*******
			
			   //*********Affectation*******
			 List<BinTree> varTmp2=new ArrayList<BinTree>(); 
			   varTmp2.add(tmp2);
			   int cmpt2=0;
			   var1 = varTmp2.get(cmpt2);
			 cmpt2++;
			//******endAffectation*******
			System.out.println("=====");
			BinTree.print(var0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		res.add(var0);
		return res;
	}


	public static void main(String[] args) {
		args = new String[]{"3", "1"};
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