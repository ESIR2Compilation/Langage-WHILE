package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import libWhile.Required;
import org.xtext.generator.Langage_whileGenerator;
import code3a.Chevron;
import com.sun.tools.javac.Main;
import tabSymb.TabSymbole;

public class Compilateur {

	public final static String NOM_FICHIER = "dummy4";

	public static void main(String[] args) {
		Langage_whileGenerator generator = new Langage_whileGenerator();

		// La fonction getSourceJava génère le code source ainsi que la table des symboles
		String contentJava = generator.getSourceJava("src/entries/", NOM_FICHIER + ".while");

		// On enrichit le code généré d'un prélude et d'un postlude
		contentJava = EnrichirFichierGenere(contentJava, generator.getTableSymbole());

		//On enregistre le fichier java désormais complet
		enregistrerFichierJava(contentJava);
		
		//On enregistre le code 3 adresses désormais complet
		enregistrerCodeAdresses(generator.getCodeAdresses());

		// Si la compilation s'est bien passée, on passe à l'exécution
		if (compiler())
			executer();
	}

	private static String EnrichirFichierGenere(String content, TabSymbole ts){
		// On ajoute le prélude et le postlude au code java nouvellement généré
		StringBuilder st = new StringBuilder(Required.getPrelude(NOM_FICHIER));
		st.append(Required.indenter(content));

		Object[] functions = ts.getTabFunct().keySet().toArray();
		String function;
		int arguments;

		if (functions.length != 0) {
			function = (String) functions[functions.length - 1];
			arguments = ts.getTabFunct().get(function).getNbEntree();
			function = ts.getTabFunct().get(function).getNomCible();
		}
		else {
			function = Required.CODE_ERREUR;
			arguments = 0;
		}

		st.append(Required.getPostlude(function, arguments));
		return st.toString();
	}

	private static void enregistrerFichierJava(String content){
		FileWriter fw;
		try {
			fw = new FileWriter("toCompile/" + NOM_FICHIER + ".java", false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void enregistrerCodeAdresses(List<Chevron> codeAdresses) {
		FileWriter fw;
		try {
			fw = new FileWriter("src/outputs/" + NOM_FICHIER + ".3ad", false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(codeAdresses.toString());
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean compiler(){
		String[] args = new String[] { "toCompile/" + NOM_FICHIER + ".java"};
		return Main.compile(args) == 0;
	}
	
	private static boolean genererJar(){
		//TODO
		Runtime rt = Runtime.getRuntime();
		try { 
			Process p = rt.exec("java -cp \"toCompile\" " + NOM_FICHIER);

			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buff = new BufferedReader (isr);

			String line;
			while((line = buff.readLine()) != null)
				System.out.println(line);

		} catch (IOException e) { e.printStackTrace(); }
		return false;
	}

	private static void executer(){
		Runtime rt = Runtime.getRuntime();
		try { 
			Process p = rt.exec("java -jar \"toExecute\" " + NOM_FICHIER + ".jar\"");

			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buff = new BufferedReader (isr);

			String line;
			while((line = buff.readLine()) != null)
				System.out.println(line);

		} catch (IOException e) { e.printStackTrace(); }
	}
}
