package tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BeautifulPrintTest extends AbstractTest{

	private static final String EXTENSION = "whpp";

	@Override
	public void tester() {
		String output = "null";
		StringBuilder st;
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
			return;
		}

		//TODO maintenant que le fichier est completement stocke dans un stringbuilder, il faut regarder s'il est beau.
		rapport = OK + getClass().getSimpleName();
	}
}
