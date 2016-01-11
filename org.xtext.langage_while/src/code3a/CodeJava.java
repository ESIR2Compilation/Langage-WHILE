package code3a;

import java.util.*;

public class CodeJava {
	public static String genereCodeJava(List<Chevron> l){
		String res="import libWhile.*\n \n\n";
		for(Chevron ch:l){
			res+=ch.getCodeJava()+"\n";
		}
		return res;
	}
	
	//public static void afficher()

}
