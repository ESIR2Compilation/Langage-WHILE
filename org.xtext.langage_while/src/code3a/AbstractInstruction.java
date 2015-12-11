package code3a;



/**

 * Représentation abstraite d'un instruction :

 * 	- Abstract Command

 *  - Abstract Expression

 */

public abstract class AbstractInstruction {

	

	/**

	 * Génère le code 3@ de l'instruction

	 * @param offset : niveau de "profondeur" de l'instruction (pour l'affichage)

	 * @return

	 */

	public abstract String genCode3A(int offset);

}