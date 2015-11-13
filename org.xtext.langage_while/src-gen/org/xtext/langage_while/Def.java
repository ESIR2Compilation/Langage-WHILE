/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Def#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.langage_while.Def#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.langage_while.Def#getO <em>O</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getDef()
 * @model
 * @generated
 */
public interface Def extends EObject
{
  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(Input)
   * @see org.xtext.langage_while.Langage_whilePackage#getDef_In()
   * @model containment="true"
   * @generated
   */
  Input getIn();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Def#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(Input value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getDef_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Def#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

  /**
   * Returns the value of the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>O</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>O</em>' containment reference.
   * @see #setO(Output)
   * @see org.xtext.langage_while.Langage_whilePackage#getDef_O()
   * @model containment="true"
   * @generated
   */
  Output getO();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Def#getO <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>O</em>' containment reference.
   * @see #getO()
   * @generated
   */
  void setO(Output value);

} // Def
