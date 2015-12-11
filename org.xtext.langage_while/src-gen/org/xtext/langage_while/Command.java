/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Command#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getAffect <em>Affect</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getWh <em>Wh</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getForr <em>Forr</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getFore <em>Fore</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getIff <em>Iff</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nop</em>' attribute.
   * @see #setNop(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Nop()
   * @model
   * @generated
   */
  String getNop();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getNop <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nop</em>' attribute.
   * @see #getNop()
   * @generated
   */
  void setNop(String value);

  /**
   * Returns the value of the '<em><b>Affect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affect</em>' containment reference.
   * @see #setAffect(Assign)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Affect()
   * @model containment="true"
   * @generated
   */
  Assign getAffect();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getAffect <em>Affect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affect</em>' containment reference.
   * @see #getAffect()
   * @generated
   */
  void setAffect(Assign value);

  /**
   * Returns the value of the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wh</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wh</em>' containment reference.
   * @see #setWh(While)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Wh()
   * @model containment="true"
   * @generated
   */
  While getWh();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getWh <em>Wh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wh</em>' containment reference.
   * @see #getWh()
   * @generated
   */
  void setWh(While value);

  /**
   * Returns the value of the '<em><b>Forr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forr</em>' containment reference.
   * @see #setForr(For)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Forr()
   * @model containment="true"
   * @generated
   */
  For getForr();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getForr <em>Forr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forr</em>' containment reference.
   * @see #getForr()
   * @generated
   */
  void setForr(For value);

  /**
   * Returns the value of the '<em><b>Fore</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fore</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fore</em>' containment reference.
   * @see #setFore(Foreach)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Fore()
   * @model containment="true"
   * @generated
   */
  Foreach getFore();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getFore <em>Fore</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fore</em>' containment reference.
   * @see #getFore()
   * @generated
   */
  void setFore(Foreach value);

  /**
   * Returns the value of the '<em><b>Iff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iff</em>' containment reference.
   * @see #setIff(If)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Iff()
   * @model containment="true"
   * @generated
   */
  If getIff();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getIff <em>Iff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iff</em>' containment reference.
   * @see #getIff()
   * @generated
   */
  void setIff(If value);

} // Command
