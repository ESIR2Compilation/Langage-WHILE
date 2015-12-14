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

/** BeautifulPrint Test : 
 * Cette classe sert à détecter si l'indentation respecte certains parametres déclarer au préalables. 
 * True : L'indentation est bien faite
 * False sinon.
 *  
 */

//TODO Finir le test pour gérer les autres régles
public class BeautifulPrintTest extends AbstractTest{
	private static final String indent_while_for = "\t\t\t";

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

			//st=new StringBuilder();
			String ligne;
			int taille=0;

			while ((ligne = buff.readLine()) != null){

				if(ligne.contains("While")){
					int index = ligne.indexOf("while",0); // partie commune des lignes à garder
					String indent=ligne.substring(0,index);
					if(indent.length()!=indent_while_for.length()) resultat=false; 
					break;
				}

				if(ligne.contains("for")){
					int index = ligne.indexOf("for",0); // partie commune des lignes à garder
					String indent=ligne.substring(0,index);
					if(indent.length()!=indent_while_for.length()) resultat=false;
					break;
				}


			}

			buff.close();
		}		
		catch (Exception e){
			rapport = FAIL + getClass().getSimpleName() + " : Erreur lors de la lecture de " + file1;
			estValide = false;
			return;
		}


		if(resultat=false){
			this.rapport = FAIL + getClass().getSimpleName() + " : Une indentation n'est pas respecté dans la mise en page du pretty printer.";
			estValide=false;
			return;
			
		} else {
			this.rapport =OK + getClass().getSimpleName()+" : L'indentation respecte les parametres définies";
			estValide=true;
			return;
		}
	}

}