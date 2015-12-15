/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifconfort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Ifconfort#getEx <em>Ex</em>}</li>
 *   <li>{@link org.xtext.langage_while.Ifconfort#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getIfconfort()
 * @model
 * @generated
 */
public interface Ifconfort extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(Expr)
   * @see org.xtext.langage_while.Langage_whilePackage#getIfconfort_Ex()
   * @model containment="true"
   * @generated
   */
  Expr getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Ifconfort#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Expr value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getIfconfort_C()
   * @model containment="true"
   * @generated
   */
  Commands getC();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Ifconfort#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Commands value);

} // Ifconfort
