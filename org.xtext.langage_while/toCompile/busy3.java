import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Steven, Ali, Ilyass, Othman
 * @group C, ESIR2Compilation
 * @teacher M.Ridoux - Compilation
 *
 **/

public class busy3 {

	public static List<BinTree> funct1(
	BinTree var0)
	{
		List<BinTree> res= new ArrayList<BinTree>();
		BinTree cptExpr1 = new BinTree(" cptExpr1",BinTree.NIL, var0);
		BinTree tmp1 = new BinTree(" tmp1",BinTree.NIL, cptExpr1);
		BinTree cptExpr2 = new BinTree(" cptExpr2",BinTree.NIL, var0);
		final int cpt1=var0.nbHd();
		 for(int i1=0;i1<cpt1;i1++){
			  final int cpt2=var0.nbHd();
			 for(int i2=0;i2<cpt2;i2++){
				  final int cpt3=var0.nbHd();
				 for(int i3=0;i3<cpt3;i3++){
					  System.out.println("Nop");
					   //*********Affectation*******
					 List<BinTree> varTmp1=new ArrayList<BinTree>(); 
					   varTmp1.add(tmp1);
					   int cmpt1=0;
					   var0 = varTmp1.get(cmpt1);
					 cmpt1++;
					//******endAffectation*******
					
				}
				
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