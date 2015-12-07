package tabSymb;

import java.util.*;

public class Fonction {

	private String nomCible;
	private int nbEntree;
	private int nbSortie;
	private  ArrayList<String> tabVars;

	//constructeur
	public Fonction(String nom){
		this.nomCible=nom;
		this.nbEntree=0;
		this.nbSortie=0;
		tabVars= new ArrayList<String>();
	}

	public Fonction(String nomCible, int nbEntree, int nbSortie,
			ArrayList<String> tabVars) {
		this.nomCible = nomCible;
		this.nbEntree = nbEntree;
		this.nbSortie = nbSortie;
		this.tabVars = tabVars;
	}

	public String getNomCible() {
		return nomCible;
	}

	public void setNomCible(String nomCible) {
		this.nomCible = nomCible;
	}

	public int getNbEntree() {
		return nbEntree;
	}

	public void setNbEntree(int nbEntree) {
		this.nbEntree = nbEntree;
	}

	public int getNbSortie() {
		return nbSortie;
	}

	public void setNbSortie(int nbSortie) {
		this.nbSortie = nbSortie;
	}

	public ArrayList<String> getTabVars() {
		return tabVars;
	}

	public void setTabVars(ArrayList<String> tabVars) {
		this.tabVars = tabVars;
	}

	public String toString(){
		String res=this.nomCible+"; nbEntrees = "+nbEntree+"; nbSorties ="+nbSortie+"; tabVars=[";
		int i=0;
		for(String s:tabVars){
			res+=s+":var"+i+",";
			i++;
		}
		res+="]";
		return res;
	}

	public void incNbEntree(){
		this.nbEntree++;
	}

	public void incNbSortie(){
		nbSortie++;
	}

	public void addVariable(String var){
		tabVars.add(var);
	}

	public int nbVars(){
		return tabVars.size();
	}
	
	public boolean supprimerVar(String x){
		return tabVars.remove(x);
	}

}
