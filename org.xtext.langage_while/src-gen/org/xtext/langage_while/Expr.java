/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Expr#getExs <em>Exs</em>}</li>
 *   <li>{@link org.xtext.langage_while.Expr#getExa <em>Exa</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exs</em>' containment reference.
   * @see #setExs(ExprSimple)
   * @see org.xtext.langage_while.Langage_whilePackage#getExpr_Exs()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExs();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Expr#getExs <em>Exs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exs</em>' containment reference.
   * @see #getExs()
   * @generated
   */
  void setExs(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Exa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exa</em>' containment reference.
   * @see #setExa(ExprAnd)
   * @see org.xtext.langage_while.Langage_whilePackage#getExpr_Exa()
   * @model containment="true"
   * @generated
   */
  ExprAnd getExa();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Expr#getExa <em>Exa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exa</em>' containment reference.
   * @see #getExa()
   * @generated
   */
  void setExa(ExprAnd value);

} // Expr
