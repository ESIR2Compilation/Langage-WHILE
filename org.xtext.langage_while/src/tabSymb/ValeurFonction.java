package tabSymb;

public class ValeurFonction {


	private int nbInput;
	private int nbOutput;
	private String internalRep;
	
	public ValeurFonction(int nbIn, int nbOut, String rep){
		nbInput = nbIn;
		nbOutput = nbOut;
		internalRep = rep;
	}
	
	public ValeurFonction(){
		nbInput = -1;
		nbOutput = -1;
		internalRep = "";
	}

	public String getInternalRep() {
		return internalRep;
	}

	public int getNbInput() {
		return nbInput;
	}

	public int getNbOutput() {
		return nbOutput;
	}
	
	public void setNbInput(int nbInput) {
		this.nbInput = nbInput;
	}

	public void setNbOutput(int nbOutput) {
		this.nbOutput = nbOutput;
	}

	public void setInternalRep(String internalRep) {
		this.internalRep = internalRep;
	}
	
	public String toString(){
		return "nbInput: " + nbInput + " nbOutput: " + nbOutput + " internalRep: " + internalRep + " ";
	}
	
}
