/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LExpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.LExpr#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getLExpr()
 * @model
 * @generated
 */
public interface LExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getLExpr_E()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getE();

} // LExpr
