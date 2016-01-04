/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Exprs#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getExprs_Ex()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getEx();

} // Exprs
