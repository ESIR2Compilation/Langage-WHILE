/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.Output#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.langage_while.VAR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference list.
   * @see org.xtext.langage_while.Langage_whilePackage#getOutput_V()
   * @model containment="true"
   * @generated
   */
  EList<VAR> getV();

} // Output
