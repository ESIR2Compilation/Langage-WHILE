package tabSymb;

public class ValeurFonction {


	private int nbInput;
	private int nbOutput;
	private String internString;
	
	public ValeurFonction(int nbIn, int nbOut, String rep){
		nbInput = nbIn;
		nbOutput = nbOut;
		internString = rep;
	}
	
	public ValeurFonction(){
		nbInput = 0;
		nbOutput = 0;
		internString = "";
	}

	public String getInternalRep() {
		return internString;
	}

	public int getNbInput() {
		return nbInput;
	}

	public int getNbOutput() {
		return nbOutput;
	}
	
	public void IncrNbInput() {
		nbInput++;
	}

	public void IncrNbOutput() {
		nbOutput++;
	}

	public void setInternString(String internalRep) {
		this.internString = internalRep;
	}
	
	public String toString(){
		return "nbInput: " + nbInput + " nbOutput: " + nbOutput + " internString: " + internString + " ";
	}
	
}
