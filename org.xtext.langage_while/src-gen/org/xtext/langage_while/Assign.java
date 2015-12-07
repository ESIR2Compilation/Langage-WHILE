/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.Assign#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.langage_while.Assign#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.Assign#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.langage_while.Assign#getN <em>N</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Vars)
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_E()
   * @model containment="true"
   * @generated
   */
  Vars getE();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Vars value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_L()
   * @model containment="true"
   * @generated
   */
  LCs getL();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LCs value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_C()
   * @model containment="true"
   * @generated
   */
  LCs getC();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(LCs value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(EXPRS)
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_N()
   * @model containment="true"
   * @generated
   */
  EXPRS getN();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(EXPRS value);

} // Assign
