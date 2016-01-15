package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

	public final static String NOM_FICHIER = "addition";

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
		if (compiler()){
			genererJar();
			executer();
		}
	}

	private static void copierFichierCompile(){
		copyFile(new File("toCompile/" + NOM_FICHIER + ".class"), new File(NOM_FICHIER + ".class"));
		copyFile(new File("src/libWhile/BinTree.class"), new File("BinTree.class"));
	}

	private static boolean copyFile(File source, File dest){
		try{
			FileInputStream sourceFile = new FileInputStream(source);
			try{
				FileOutputStream destinationFile = null;
				try{
					destinationFile = new FileOutputStream(dest);
					byte buffer[] = new byte[512 * 1024];
					int nbLecture;
					while ((nbLecture = sourceFile.read(buffer)) != -1)
						destinationFile.write(buffer, 0, nbLecture);
				} finally { destinationFile.close(); }
			} finally { sourceFile.close(); }
		} catch (IOException e){ e.printStackTrace(); return false; }
		return true;
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
		String[] optionsAndSources = {
				"-encoding", "UTF-8",
				"-classpath", "src/libWhile", 
				"toCompile/" + NOM_FICHIER + ".java"};
		return Main.compile(optionsAndSources) == 0;
	}

	private static void genererJar(){
		copierFichierCompile();

		Runtime rt = Runtime.getRuntime();
		try { 
			Process p = rt.exec("jar cvfe " +
					"toExecute/" + NOM_FICHIER + ".jar " +
					NOM_FICHIER + " " +
					NOM_FICHIER + ".class " +
					"BinTree.class");

			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buff = new BufferedReader (isr);

			String line;
			while((line = buff.readLine()) != null)
				System.out.println(line);

		} catch (IOException e) { e.printStackTrace(); }

		nettoyerClass();
	}

	private static void nettoyerClass(){
		File file = new File("BinTree.class");
		file.delete();
		file = new File(NOM_FICHIER + ".class");
		file.delete();
	}

	private static void executer(){
		Runtime rt = Runtime.getRuntime();
		try { 
			Process p = rt.exec("java -jar \"toExecute\\" + NOM_FICHIER + ".jar\"");

			// REAL PROGRAM
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buff = new BufferedReader (isr);

			String line;
			while((line = buff.readLine()) != null)
				System.out.println(line);

			//ERROR
			is = p.getErrorStream();
			isr = new InputStreamReader(is);
			buff = new BufferedReader (isr);
			while((line = buff.readLine()) != null)
				System.err.println(line);

		} catch (IOException e) { e.printStackTrace(); }
	}
}
