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
			valeur.setInternString( ReadConvertFun(nom) + "  taille :" + fun.size());
			
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
				String rep = ReadConvertFun(nomVariable) + " taille : " + mapV.size();
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
	public void ModifOutputFun(String nom){
		fun.get(nom).IncrNbOutput();
	}
	
	/**
	 * Modifier nombre des entrées de la fonction
	 * @param nom
	 * @param newInput
	 */
	public void ModifInputFunction(String nom){
		fun.get(nom).IncrNbInput();
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
				sbuff.append("-"+StringCharre[i]);
			}else{
				sbuff.append(StringCharre[i]);
			}
		}
		output = sbuff.toString();
		output = output.substring(0,1).toLowerCase() + output.substring(1);
		return output;
	}
	
	
	
	private void ToStringFun(){
		Set<String> keysfun  = fun.keySet(); 
		Iterator<String> it = keysfun.iterator(); 
		if(it.hasNext())
			System.out.println("--- Les fonctions ---");
		while( it.hasNext() ){
			String key = it.next();
			System.out.println("{ function: " + key + " -> " + fun.get(key) + " }" );
		}
	}
	
	
	private void ToStringVar(){
		Set<String> keysVar  = var.keySet(); 
		Iterator<String> it = keysVar.iterator(); 
		if(it.hasNext())
			System.out.println("--- Les variables ---");
		while( it.hasNext() ){
			String key = it.next();
			System.out.println("{ variables: " + key + " -> " + var.get(key) + " }" );
		}
	}
	
	public void ToStringAll(){
		this.ToStringFun();
		System.out.println("");
		this.ToStringVar();
	}
	
	
	
}

