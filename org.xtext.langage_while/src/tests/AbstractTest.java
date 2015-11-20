package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.xtext.generator.Langage_whileGenerator;

public abstract class AbstractTest {

	private Langage_whileGenerator generator;
	protected static final String OK   = "[OK]    " + " ";
	protected static final String FAIL = "[FAILED]" + " ";
	protected String rapport;
	protected String entry;
	protected boolean estValide;

	public AbstractTest(){
		generator = new Langage_whileGenerator();
	}
	/**
	 * @return Le resultat du test
	 */
	public boolean estValide(){
		return estValide;
	}
	/**
	 * Execute le test et met a true ou false le resultat qui en decoule.
	 */
	public abstract void tester();

	/**
	 *  Genere un fichier du meme nom de classe, pour une entree donnee.
	 */
	public String genererRapport(){
		FileWriter fw;
		try {
			fw = new FileWriter("src/results/" + entry + ".result", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n" + rapport);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return rapport;
	}

	public void setEntry(String entry){
		this.entry = entry;
		rapport = "";
		estValide = false;
	}
	
	public File prettyPrinting(){
		return generator.generate(entry);
	}
}
