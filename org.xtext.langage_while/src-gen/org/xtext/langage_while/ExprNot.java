/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.ExprNot#getExQ1 <em>Ex Q1</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprNot#getExQ2 <em>Ex Q2</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex Q1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex Q1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex Q1</em>' containment reference.
   * @see #setExQ1(ExprEq)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprNot_ExQ1()
   * @model containment="true"
   * @generated
   */
  ExprEq getExQ1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprNot#getExQ1 <em>Ex Q1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex Q1</em>' containment reference.
   * @see #getExQ1()
   * @generated
   */
  void setExQ1(ExprEq value);

  /**
   * Returns the value of the '<em><b>Ex Q2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex Q2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex Q2</em>' containment reference.
   * @see #setExQ2(ExprEq)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprNot_ExQ2()
   * @model containment="true"
   * @generated
   */
  ExprEq getExQ2();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprNot#getExQ2 <em>Ex Q2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex Q2</em>' containment reference.
   * @see #getExQ2()
   * @generated
   */
  void setExQ2(ExprEq value);

} // ExprNot
