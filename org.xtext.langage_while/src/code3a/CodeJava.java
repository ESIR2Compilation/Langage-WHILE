package code3a;

import java.util.*;

public class CodeJava {
	public static String genereCodeJava(List<Chevron> l){
		String res="import libWhile.*\n \n\n";
		for(Chevron ch:l){
			res+=ch.getCodeJava();
			int ind=ch.getClass().getName().lastIndexOf(".");
			if(!ch.getClass().getName().substring(ind+1).equals("Read")) res+="\n";
		}
		return res;
	}
	
	//public static void afficher()

}
