/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.Vars#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.langage_while.Vars#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.Vars#getU <em>U</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getVars()
 * @model
 * @generated
 */
public interface Vars extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute.
   * @see #setA(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getVars_A()
   * @model
   * @generated
   */
  String getA();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Vars#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(String value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getVars_L()
   * @model containment="true"
   * @generated
   */
  LCs getL();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Vars#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LCs value);

  /**
   * Returns the value of the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>U</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>U</em>' containment reference.
   * @see #setU(Vars)
   * @see org.xtext.langage_while.Langage_whilePackage#getVars_U()
   * @model containment="true"
   * @generated
   */
  Vars getU();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Vars#getU <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>U</em>' containment reference.
   * @see #getU()
   * @generated
   */
  void setU(Vars value);

} // Vars
