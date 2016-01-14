package code3a;

import java.util.*;

import tabSymb.TabSymbole;

public class CodeJava {
	public static String genereCodeJava(List<Chevron> l,TabSymbole tab){
		String res="";
		String s="";
		int nbRead=0;
		for(Chevron ch:l){
			int ind=ch.getClass().getName().lastIndexOf(".");
			if(ch.getClass().getName().substring(ind+1).equals("Fonct")){
				s=ch.getRead1(); //le nom de la fonction
			}
			if(ch.getClass().getName().substring(ind+1).equals("Read")){
				int n=tab.getFonction(s).getNbEntree();
				res+=((Read)ch).getCodeJava(n,tab, s);
				nbRead++;
				if(nbRead==n) {
					int nbVar=tab.getFonction(s).getTabVars().size();
					res+="\n";
					for(int i=n;i<nbVar;i++){
						res+="BinTree<String> var"+i+" = BinTree.NIL;\n";
					}
					nbRead=0;
				}
			}
			else res+=ch.getCodeJava(tab,s)+"\n";
			//if(!ch.getClass().getName().substring(ind+1).equals("Read")) res+="\n";
		}
		return res;
	}
	
	//public static void afficher()

}
