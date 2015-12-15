/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Model#getNn <em>Nn</em>}</li>
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
   * Returns the value of the '<em><b>Nn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nn</em>' containment reference.
   * @see #setNn(Program)
   * @see org.xtext.langage_while.Langage_whilePackage#getModel_Nn()
   * @model containment="true"
   * @generated
   */
  Program getNn();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Model#getNn <em>Nn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nn</em>' containment reference.
   * @see #getNn()
   * @generated
   */
  void setNn(Program value);

} // Model
