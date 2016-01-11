/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.ExprEq#getExS1 <em>Ex S1</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprEq#getExS2 <em>Ex S2</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprEq#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprEq()
 * @model
 * @generated
 */
public interface ExprEq extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex S1</em>' containment reference.
   * @see #setExS1(ExprSimple)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprEq_ExS1()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExS1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprEq#getExS1 <em>Ex S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex S1</em>' containment reference.
   * @see #getExS1()
   * @generated
   */
  void setExS1(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Ex S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex S2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex S2</em>' containment reference.
   * @see #setExS2(ExprSimple)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprEq_ExS2()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExS2();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprEq#getExS2 <em>Ex S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex S2</em>' containment reference.
   * @see #getExS2()
   * @generated
   */
  void setExS2(ExprSimple value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getExprEq_Ex()
   * @model containment="true"
   * @generated
   */
  Expr getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprEq#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Expr value);

} // ExprEq
