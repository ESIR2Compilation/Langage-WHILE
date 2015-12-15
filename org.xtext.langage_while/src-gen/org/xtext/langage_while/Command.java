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
 *   <li>{@link org.xtext.langage_while.Command#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getWh <em>Wh</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getFore <em>Fore</em>}</li>
 *   <li>{@link org.xtext.langage_while.Command#getIfc <em>Ifc</em>}</li>
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
   * Returns the value of the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference.
   * @see #setAssign(Assign)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Assign()
   * @model containment="true"
   * @generated
   */
  Assign getAssign();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(Assign value);

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
   * Returns the value of the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' containment reference.
   * @see #setFor(For)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_For()
   * @model containment="true"
   * @generated
   */
  For getFor();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getFor <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' containment reference.
   * @see #getFor()
   * @generated
   */
  void setFor(For value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(If)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_If()
   * @model containment="true"
   * @generated
   */
  If getIf();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(If value);

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
   * Returns the value of the '<em><b>Ifc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifc</em>' containment reference.
   * @see #setIfc(Ifconfort)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommand_Ifc()
   * @model containment="true"
   * @generated
   */
  Ifconfort getIfc();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Command#getIfc <em>Ifc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifc</em>' containment reference.
   * @see #getIfc()
   * @generated
   */
  void setIfc(Ifconfort value);

} // Command
