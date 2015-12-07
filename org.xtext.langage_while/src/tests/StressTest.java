package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StressTest extends AbstractTest {

	Map<Integer, Long> courbe;


	public StressTest(){
		super();
		courbe = new HashMap<Integer, Long>();
		setEntry("stressTest.while");
	}

	@Override
	public void tester() {
		creerFichierWhile(1000);
		CalculerTemps(1000);
		creerFichierWhile(10000);
		CalculerTemps(10000);
		creerFichierWhile(20000);
		CalculerTemps(20000);
		creerFichierWhile(30000);
		CalculerTemps(30000);
		creerFichierWhile(40000);
		CalculerTemps(40000);
		creerFichierWhile(50000);
		CalculerTemps(50000);

		supprimerFichierWhile();
		rapport = courbe.toString();
		rapport += "\n" + getCoefficient();
	}

	private void CalculerTemps(int nombre) {
		long time = System.currentTimeMillis();
		prettyPrinting("src/entries/", entry);
		time = System.currentTimeMillis() - time;
		courbe.put(nombre, time);
	}
	
	private long getTemps() {
		long time = System.currentTimeMillis();
		prettyPrinting("src/entries/", entry);
		return System.currentTimeMillis() - time;
	}

	private void creerFichierWhile(int nombreFonction){
		StringBuilder st = new StringBuilder();

		for(int i = 0; i < nombreFonction; ++i)
			st.append("function test1!:read A!%A! := A!%write A!");

		FileWriter fw;
		try {
			fw = new FileWriter("src/entries/" + entry);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(st.toString());
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void creerFichierCSV(String result){

		FileWriter fw;
		try {
			fw = new FileWriter("src/results/points.csv");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(result);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void supprimerFichierWhile(){
		File file = new File("src/entries/" + entry);
		file.delete();

		file = new File("src/outputs/stressTest.whpp");
		file.delete();
	}
	
	public void genererGraphique(int nombrePoint){
		StringBuilder st = new StringBuilder("Lignes de code (loc);");
		for(int i =0; i < nombrePoint; ++i)
			st.append("Temps de compilation (ms) (" + i + ");");
		
		creerFichierWhile(1000);
		st.append("\n1000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");
		
		creerFichierWhile(10000);
		st.append("\n10000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");
		
		creerFichierWhile(20000);
		st.append("\n20000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");
		
		creerFichierWhile(30000);
		st.append("\n30000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");
		
		creerFichierWhile(40000);
		st.append("\n40000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");
		
		creerFichierWhile(50000);
		st.append("\n50000;");
		for(int i = 0; i < nombrePoint; ++i)
			st.append(getTemps() + ";");

		supprimerFichierWhile();
		
		creerFichierCSV(st.toString());
	}
	
	public String getCoefficient(){
		StringBuilder st = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>(courbe.keySet());
		Collections.sort(list);
		
		for(Integer i : list)
			st.append("Coefficient de pente pour " + i + " lignes : " + ((double) courbe.get(i) / i) + "\n");
		return st.toString();
	}
}
