package libWhile;

public class Required {

	public final static String CODE_ERREUR = "[ERROR]";

	private final static String IMPORT = "import java.util.ArrayList;\n" +
										 "import java.util.List;\n";
	private final static String AUTHORS = "\n/**" +
										  "\n *" +
										  "\n * @authors Steven, Ali, Ilyass, Othman" +
										  "\n * @group C, ESIR2Compilation" +
										  "\n * @teacher M.Ridoux - Compilation" +
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

			// On déclare toutes les variables nécessaires
			for(int i = 0; i < args; ++i)
				st.append("\t\tBinTree arg" + i + " = BinTree.NIL;\n");
			// On check la malformation des paramètres, en parallèle de générer les paramètres de la callee while.
			st.append("\t\ttry {\n");
			for(int i = 0; i < args; ++i)
				st.append("\t\t\targ" + i + " = new BinTree(Integer.parseInt(args[" + i + "]));\n");
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

	public static String indenter(String sourceCode){
		String indent = "\t";
		String[] instructions = sourceCode.split("\n");
		StringBuilder st = new StringBuilder();
		for(int i = 0; i < instructions.length; ++i){
			if (instructions[i].contains("{")){
				st.append(indent);
				st.append(instructions[i]);
				indent += "\t";
			}
			else if (instructions[i].contains("}")){
				indent = indent.substring(0, indent.length() - 1);
				st.append(indent);
				st.append(instructions[i]);
			}
			else {
				st.append(indent);
				st.append(instructions[i]);
			}
			st.append("\n");
		}
			
		return st.toString();
	}
}