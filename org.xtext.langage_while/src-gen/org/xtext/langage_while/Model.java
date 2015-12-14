/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Model#getProg <em>Prog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Prog</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prog</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prog</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getModel_Prog()
   * @model containment="true"
   * @generated
   */
  EList<Function> getProg();

} // Model
