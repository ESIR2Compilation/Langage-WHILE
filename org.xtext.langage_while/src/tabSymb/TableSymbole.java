package tabSymb;


//import java.text.Normalizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class TableSymbole {
	
	
	/**
	 * @param args
	 */
	
	private HashMap <String,ValeurFonction> fun;
	
	private HashMap<String, HashMap<String,ValeurVariable>> var;

	private HashMap<String, HashMap<String,ValeurSymbol>> sym;
	
	
	
	public TableSymbole(){
		fun = new HashMap<String,ValeurFonction>();
		var = new HashMap<String,HashMap<String,ValeurVariable>>();
		sym = new HashMap<String,HashMap<String,ValeurSymbol>>();
	}
	
	
	private static TableSymbole TableSymboleInst;
	
	public static synchronized TableSymbole CreateInstance(){
		if(TableSymboleInst == null) TableSymboleInst= new TableSymbole();
		return TableSymboleInst;
	}
	
	public void ajouterFonction(String nom){
		if( !fun.containsKey(nom) ){
			ValeurFonction valeur = new ValeurFonction();
			valeur.setInternalRep( ReadConvertFun(nom) + "_" + fun.size());
			
			fun.put(nom, valeur);
		}

		if( !var.containsKey(nom) ){
			var.put(nom, new HashMap<String,ValeurVariable>());
		}

		if( !sym.containsKey(nom) ){
			sym.put(nom, new HashMap<String,ValeurSymbol>());
		}

	}
	
	public void ajouterVariable(String nomVariable, String nomFonction){
		{
			HashMap<String, ValeurVariable> mapV =  var.get(nomFonction);
			
			if(!mapV.containsKey(nomVariable)){
				String rep = ReadConvertFun(nomVariable) + "_" + mapV.size();
				mapV.put(nomVariable, new ValeurVariable(rep));
			}
		}	}

	
	
	public void ajouterSymbol(String nomSymbol, String nomFonction)
	{
		HashMap<String, ValeurSymbol> mapS = sym.get(nomFonction);
		
		if(!mapS.containsKey(nomSymbol)){
			String rep = ReadConvertFun(nomSymbol) + "_" + mapS.size();
			mapS.put(nomSymbol, new ValeurSymbol(rep));
		}
	}
	
	/**
	 * Modifier nombre des sorties de la fonction
	 * @param nom
	 * @param newOutput
	 */
	public void ModifOutputFun(String nom, int newOutput){
		fun.get(nom).setNbOutput(newOutput);
	}
	
	/**
	 * Modifier nombre des entrées de la fonction
	 * @param nom
	 * @param newInput
	 */
	public void ModifInputFunction(String nom, int newInput){
		fun.get(nom).setNbInput(newInput);
	}
	
	
	private static String ReadConvertFun(String nom) {

		StringBuffer sbuff = new StringBuffer(); //like String
		String output = "";

	//	nom = Normalizer.normalize(nom, Normalizer.Form.NFD); //suppresion des accents
		char[] StringCharre = nom.toCharArray(); //convertir le string en char

		// Remplacement des caractÃ¨res spÃ©ciaux par leur valeur ASCII
		for(int i = 0; i < StringCharre.length; i++){
			if((StringCharre[i] == '>') | (StringCharre[i] == '+') | (StringCharre[i] == '.')  | (StringCharre[i] == '/') | 
				(StringCharre[i] == '?') | (StringCharre[i] == '&') | (StringCharre[i] == '?') | (StringCharre[i] == '!')){
				sbuff.append("_"+(int)StringCharre[i]);
			}else{
				sbuff.append(StringCharre[i]);
			}
		}
		output = sbuff.toString();
		output = output.substring(0,1).toLowerCase() + output.substring(1);
		return output;
	}
	
	
	
	@SuppressWarnings("unused")
	private void ToStringFun(){
		Set<String> keys = fun.keySet(); 
		Iterator<String> it = keys.iterator(); 
		if(it.hasNext())
			System.out.println("--- Les fonctions ---");
		while( it.hasNext() ){
			String key = it.next();
			System.out.println("{ function: " + key + " -> " + fun.get(key) + " }" );
		}
	}
	
	

	
}

