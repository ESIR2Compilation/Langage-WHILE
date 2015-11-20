/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Program#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.langage_while.Program#getPp <em>Pp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(Function)
   * @see org.xtext.langage_while.Langage_whilePackage#getProgram_F()
   * @model containment="true"
   * @generated
   */
  Function getF();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Program#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(Function value);

  /**
   * Returns the value of the '<em><b>Pp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pp</em>' containment reference.
   * @see #setPp(Program)
   * @see org.xtext.langage_while.Langage_whilePackage#getProgram_Pp()
   * @model containment="true"
   * @generated
   */
  Program getPp();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Program#getPp <em>Pp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pp</em>' containment reference.
   * @see #getPp()
   * @generated
   */
  void setPp(Program value);

} // Program
