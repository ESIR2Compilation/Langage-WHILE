package code3a;

import java.util.*;

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

public abstract class AbstractInstruction {

	String code;

	public AbstractInstruction() {
		super();
		this.code = "";
	}

	/**

	 * Génère le code 3@ de l'instruction

	 * @param offset : niveau de "profondeur" de l'instruction (pour l'affichage)

	 * @return

	 */
	public abstract TreeSet<String> evaluer();
	public String genCode3A(){
		evaluer();
		return code;
	}

}