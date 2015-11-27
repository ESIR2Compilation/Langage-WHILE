package tabSymb;

public class ValeurSymbol {


	private String internalRep;
	
	public ValeurSymbol() {
		setInternalRep("");
	}
	
	public ValeurSymbol(String rep){
		setInternalRep(rep);
	}

	public String getInternalRep() {
		return internalRep;
	}

	public void setInternalRep(String internalRep) {
		this.internalRep = internalRep;
	}
	
	public String toString(){
		return " Symbole retourné: '" + internalRep + "'";
	}
	
}
