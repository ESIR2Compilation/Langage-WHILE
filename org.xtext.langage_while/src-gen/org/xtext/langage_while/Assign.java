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
 * <ul>
 *   <li>{@link org.xtext.langage_while.Assign#getVs <em>Vs</em>}</li>
 *   <li>{@link org.xtext.langage_while.Assign#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends EObject
{
  /**
   * Returns the value of the '<em><b>Vs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vs</em>' containment reference.
   * @see #setVs(Vars)
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_Vs()
   * @model containment="true"
   * @generated
   */
  Vars getVs();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getVs <em>Vs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vs</em>' containment reference.
   * @see #getVs()
   * @generated
   */
  void setVs(Vars value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(Exprs)
   * @see org.xtext.langage_while.Langage_whilePackage#getAssign_Ex()
   * @model containment="true"
   * @generated
   */
  Exprs getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Assign#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Exprs value);

} // Assign
