package libWhile;

import java.util.TreeSet;

/**
 * Représentation abstraite d'une commande While :

 * 	 Nop

 *   While

 *   For

 *   Foreach

 *   If

 *   IfElse

 *   Aff
======

 * 	 Nil

 *   Cons

 *   List

 *   Hd

 *   Tl

 *   EgalWH

 *   And

 *   Or

 *   Not
 */

public abstract class AbsCommande {

	String code;

	public AbsCommande() {
		super();
		this.code = "";
	}

	/**

	 * Génère le code 3@ de l'instruction

	 * @param offset : niveau de "profondeur" de l'instruction (pour l'affichage)

	 * @return

	 */
	public abstract void executer();


}