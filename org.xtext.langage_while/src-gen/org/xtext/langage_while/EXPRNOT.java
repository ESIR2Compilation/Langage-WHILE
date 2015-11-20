/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPRNOT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.EXPRNOT#getLc1 <em>Lc1</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRNOT#getE1 <em>E1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getEXPRNOT()
 * @model
 * @generated
 */
public interface EXPRNOT extends EObject
{
  /**
   * Returns the value of the '<em><b>Lc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lc1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lc1</em>' containment reference.
   * @see #setLc1(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRNOT_Lc1()
   * @model containment="true"
   * @generated
   */
  LCs getLc1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRNOT#getLc1 <em>Lc1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lc1</em>' containment reference.
   * @see #getLc1()
   * @generated
   */
  void setLc1(LCs value);

  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(EXPREQ)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRNOT_E1()
   * @model containment="true"
   * @generated
   */
  EXPREQ getE1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRNOT#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(EXPREQ value);

} // EXPRNOT
