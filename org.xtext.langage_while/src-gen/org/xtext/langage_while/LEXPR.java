/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEXPR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.LEXPR#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.langage_while.LEXPR#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.LEXPR#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getLEXPR()
 * @model
 * @generated
 */
public interface LEXPR extends EObject
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
   * @see #setF(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getLEXPR_F()
   * @model containment="true"
   * @generated
   */
  LCs getF();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.LEXPR#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(LCs value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(EXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getLEXPR_N()
   * @model containment="true"
   * @generated
   */
  EXPR getN();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.LEXPR#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(EXPR value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(LEXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getLEXPR_T()
   * @model containment="true"
   * @generated
   */
  LEXPR getT();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.LEXPR#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(LEXPR value);

} // LEXPR
