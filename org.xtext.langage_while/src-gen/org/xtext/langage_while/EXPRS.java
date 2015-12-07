/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.EXPRS#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRS#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRS#getE2 <em>E2</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getEXPRS()
 * @model
 * @generated
 */
public interface EXPRS extends EObject
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
   * @see #setF(EXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRS_F()
   * @model containment="true"
   * @generated
   */
  EXPR getF();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRS#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(EXPR value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRS_L()
   * @model containment="true"
   * @generated
   */
  LCs getL();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRS#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LCs value);

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference.
   * @see #setE2(EXPRS)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRS_E2()
   * @model containment="true"
   * @generated
   */
  EXPRS getE2();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRS#getE2 <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E2</em>' containment reference.
   * @see #getE2()
   * @generated
   */
  void setE2(EXPRS value);

} // EXPRS
