package tabSymb;

public class ValeurVariable {

		private String internalRep;
		
		public ValeurVariable() {
			setInternalRep("");
		}
		
		public ValeurVariable(String rep){
			setInternalRep(rep);
		}

		public String getInternalRep() {
			return internalRep;
		}

		public void setInternalRep(String internalRep) {
			this.internalRep = internalRep;
		}
		
		public String toString(){
			return " variable retournée: '" + internalRep + "'";
		}
	
}
