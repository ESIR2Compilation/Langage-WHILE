package compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.tools.javac.Main;

class JavaCode {
	
	public static final String FILENAME = "Main";
	
	public static void main(String[] args1)
	{
		String[] args = new String[] { "toCompile/" + FILENAME + ".java"};
		System.out.println("=== Compilation en cours ===");
		int status = Main.compile(args);
		
		if (status == 0){
			System.out.println("=== Java compilé avec succès. ===");
			Runtime rt = Runtime.getRuntime();
			try { 
				System.out.println("=== Exécution en cours ===");
				Process p = rt.exec("java -cp \"toCompile\" " + FILENAME);

				InputStream is = p.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader buff = new BufferedReader (isr);

				String line;
				while((line = buff.readLine()) != null)
				    System.out.println(line);
				
			} catch (IOException e) { e.printStackTrace(); }
			System.out.println("=== Exécution terminé ===");
		}
		else 
			System.out.println("=== Erreur de compilation du fichier Java ===");
	}
}