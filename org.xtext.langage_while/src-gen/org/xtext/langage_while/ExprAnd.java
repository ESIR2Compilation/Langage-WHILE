/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.ExprAnd#getExo1 <em>Exo1</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprAnd#getExo2 <em>Exo2</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprAnd()
 * @model
 * @generated
 */
public interface ExprAnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Exo1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exo1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exo1</em>' containment reference.
   * @see #setExo1(ExprOr)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprAnd_Exo1()
   * @model containment="true"
   * @generated
   */
  ExprOr getExo1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprAnd#getExo1 <em>Exo1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exo1</em>' containment reference.
   * @see #getExo1()
   * @generated
   */
  void setExo1(ExprOr value);

  /**
   * Returns the value of the '<em><b>Exo2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.ExprOr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exo2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exo2</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getExprAnd_Exo2()
   * @model containment="true"
   * @generated
   */
  EList<ExprOr> getExo2();

} // ExprAnd
