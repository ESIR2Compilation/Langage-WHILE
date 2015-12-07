/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.EXPR#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPR#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getEXPR()
 * @model
 * @generated
 */
public interface EXPR extends EObject
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(EXPRSIMPLE)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPR_E1()
   * @model containment="true"
   * @generated
   */
  EXPRSIMPLE getE1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPR#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(EXPRSIMPLE value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(EXPRAND)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPR_Ex()
   * @model containment="true"
   * @generated
   */
  EXPRAND getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPR#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(EXPRAND value);

} // EXPR
