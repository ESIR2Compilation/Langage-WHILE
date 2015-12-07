package tabSymb;

import java.util.*;

public class TabSymbole {
	private HashMap<String,Fonction> tabFunct;
	private ArrayList<String> tabSymb;
	//constructeur
	public TabSymbole(){
		tabFunct = new HashMap<String, Fonction>();
		tabSymb= new ArrayList<String>();
	}
	public HashMap<String, Fonction> getTabFunct() {
		return tabFunct;
	}
	public void setTabFunct(HashMap<String, Fonction> tabFunct) {
		this.tabFunct = tabFunct;
	}
	public ArrayList<String> getTabSymb() {
		return tabSymb;
	}
	public void setTabSymb(ArrayList<String> tabSymb) {
		this.tabSymb = tabSymb;
	}
	
	public String toString(){
		String res="Fonctions{\n";
		Set<String> ens = tabFunct.keySet();
		for(String s:ens){
			res+="("+s+":"+tabFunct.get(s).toString()+")\n";
		}
		res+="}\n\nSymboles{";
		int i=0;
		for(String sub: tabSymb){
			res+=sub+":symb"+i+",  ";
			i++;
		}
		res+="}";
		return res;
	}
	
	public void afficher(){
		System.out.println("========================Table des symboles======================"); 
		System.out.println(this.toString());
		System.out.println("================================================================");
	}
	
	public void addFonction(String identifiant,Fonction valeur){
		this.tabFunct.put(identifiant, valeur);
	}
	
	public void addSymbole(String identifiant){
		tabSymb.add(identifiant);
	}
	
	public int nbFonctions(){
		return tabFunct.size();
	}
	
	public int nbSymb(){
		return tabSymb.size();
	}

}
