/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.xtext.langage_while.Program#getU <em>U</em>}</li>
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
   * Returns the value of the '<em><b>F</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getProgram_F()
   * @model containment="true"
   * @generated
   */
  EList<Function> getF();

  /**
   * Returns the value of the '<em><b>U</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>U</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>U</em>' attribute.
   * @see #setU(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getProgram_U()
   * @model
   * @generated
   */
  String getU();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Program#getU <em>U</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>U</em>' attribute.
   * @see #getU()
   * @generated
   */
  void setU(String value);

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
