package tests;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* BeautifulPrint Test : 
 * Cette classe sert à détecter si l'indentation respecte certains parametres déclarer au préalables. 
 * True : L'indentation est bien faite
 * False sinon.
 *  
 */

public class BeautifulPrintTest extends AbstractTest{

	@Override
	public void tester() {
		boolean resultat =true;
	//	Map<String,Integer> indentation =new HashMap<String, Integer>();
	//	indentation.put("While",1);
		int niveau =0; // Pour verifier si chaque ligne est indenté correctement par un n niveau
		
		StringBuilder st=null;
		File file1=null;
		FileInputStream input = null;
		InputStreamReader lecture=null;
		BufferedReader buff=null;

		try {
			file1=prettyPrinting("src/entries", entry);
			input=new FileInputStream(file1);
			lecture = new InputStreamReader(input);
			buff=new BufferedReader(lecture);

			st=new StringBuilder();
			String ligne;

			while ((ligne = buff.readLine()) != null)
				st.append(ligne+'\n');
			buff.close();
		}

		catch (Exception e){
			rapport = FAIL + getClass().getSimpleName() + " : Erreur lors de la lecture de " + entry; 
			estValide = false;
			return;
		}
	}
}
