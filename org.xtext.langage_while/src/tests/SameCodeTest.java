package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SameCodeTest extends AbstractTest{

	private static final String EXTENSION = "whpp";
	
	@Override
	public void tester() {
		StringBuilder st;
		String output = "null";
		String contentEntry, contentOutput;
		
		try {
			InputStream flux = new FileInputStream("./src/entries/" + entry); 
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			st = new StringBuilder();

			String ligne;
			while ((ligne = buff.readLine()) != null)
				st.append(ligne);
			buff.close();
		}		
		catch (Exception e){
			rapport = FAIL + getClass().getSimpleName() + " : Erreur lors de la lecture de " + entry; 
			estValide = false;
			return;
		}
		
		contentEntry = st.toString();
		File file = prettyPrinting();
		
		try {
			int pos = entry.lastIndexOf(".");
			output = entry.substring(0, pos) + "." + EXTENSION;
			InputStream flux = new FileInputStream("./src/outputs/" + output); 
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			st = new StringBuilder();

			String ligne;
			while ((ligne = buff.readLine()) != null)
				st.append(ligne);
			buff.close();
		}		
		catch (Exception e){
			rapport = FAIL + getClass().getSimpleName() + " : Erreur lors de la lecture de " + output;
			estValide = false;
			return;
		}

		contentOutput = st.toString();
		
		//Maintenant que les deux fichiers sont charges, il nous reste plus qu'a les comparer.
		
		//Traitement des deux chaines pour supprimer les mises en forme
		contentEntry = contentEntry.replaceAll("\\s", "");
		contentOutput = contentOutput.replaceAll("\\s", "");
		
		// On a donc uniquement les termes n�cessaires : plus aucune mise en forme existe.
		
		if (contentEntry.equals(contentOutput)){
			rapport = OK + getClass().getSimpleName() + " : Le pretty printing reutilise exactement le m�me nombre de terme employe dans le fichier d'entree.";
			estValide = true;
		}
		else {
			rapport = FAIL + getClass().getSimpleName() + " : Perte ou ajout de terme - autre que la mise en page dans le pretty printing.";
			estValide = false;
		}
	}
	

}
