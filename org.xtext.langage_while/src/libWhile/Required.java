package libWhile;

public class Required {

	public final static String CODE_ERREUR = "[ERROR]";

	private final static String IMPORT = "import java.util.ArrayList;\nimport java.util.List;\n";
	private final static String AUTHORS = "\n/**" +
										  "\n *" +
										  "\n * @authors Steven, Ali, Ilyass, Othman" +
										  "\n * @from XText, ESIR2Compilation, Groupe C" +
										  "\n *" +
										  "\n **/\n";
	private final static String CLASS = "\npublic class ";

	public static String getPrelude(String name){
		return IMPORT + AUTHORS + CLASS + name + " {\n\n";
	}

	private final static String MAIN = "\n\n\tpublic static void main(String[] args) {\n\n";
	private final static String END_MAIN = "\n\t}";
	private final static String END_CLASS = "\n}";

	public static String getPostlude(String main, int args){
		StringBuilder st = new StringBuilder(MAIN);

		if (! main.equals(CODE_ERREUR)){
			// On check si le nombre d'argument est correct
			st.append("\t\tif (args.length != " + args + ") {\n");
			st.append("\t\t\tSystem.err.println(\"[Erreur] Mauvais nombre d'arguments. Le programme attend " + args + " arguments.\");\n");
			st.append("\t\t\tSystem.exit(1);\n");
			st.append("\t\t}\n\n");

			// On check la malformation des paramètres, en parallèle de générer les paramètres de la callee while.
			st.append("\t\ttry {\n");
			for(int i = 0; i < args; ++i)
				st.append("\t\t\tBinTree arg" + i + " = new BinTree(Integer.parseInt(args[" + i + "]));\n");
			st.append("\t\t} catch (Exception e) {\n");
			st.append("\t\t\tSystem.err.println(\"[Erreur] Malformation d'un ou de plusieurs arguments.\");\n");
			st.append("\t\t\tSystem.exit(1);\n");
			st.append("\t\t}\n\n");

			st.append("\t\tSystem.out.println(" + main + "(");
			for(int i = 0; i < (args - 1); ++i)
				st.append("arg" + i +", ");
			st.append("arg" + (args - 1) + "));");

		}
		else
			st.append("\t\tSystem.out.println(\"Le fichier while ne contient aucune fonction.\");");
		
		st.append(END_MAIN);
		st.append(END_CLASS);

		return st.toString();
	}

	public String indenter(String sourceCode){
		String[] instructions = sourceCode.split("\n");
		StringBuilder st = new StringBuilder();
		for(int i = 0; i < instructions.length; ++i)
			st.append("\t" + instructions[i] + "\n");
		return st.toString();
	}

	// Fonction de test
	public static void main(String[] args){
		System.out.print(getPrelude("Main"));
		System.out.print("\t// === le code source généré est ici === ");
		System.out.print(getPostlude("yolo", 1));
	}
}