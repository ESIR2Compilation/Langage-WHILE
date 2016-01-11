/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.ExprOr#getExn1 <em>Exn1</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprOr#getExn2 <em>Exn2</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprOr()
 * @model
 * @generated
 */
public interface ExprOr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exn1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exn1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exn1</em>' containment reference.
   * @see #setExn1(ExprNot)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprOr_Exn1()
   * @model containment="true"
   * @generated
   */
  ExprNot getExn1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprOr#getExn1 <em>Exn1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exn1</em>' containment reference.
   * @see #getExn1()
   * @generated
   */
  void setExn1(ExprNot value);

  /**
   * Returns the value of the '<em><b>Exn2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.ExprNot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exn2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exn2</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getExprOr_Exn2()
   * @model containment="true"
   * @generated
   */
  EList<ExprNot> getExn2();

} // ExprOr
