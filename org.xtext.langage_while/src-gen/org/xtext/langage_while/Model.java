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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference.
   * @see #setGreetings(Program)
   * @see org.xtext.langage_while.Langage_whilePackage#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  Program getGreetings();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Model#getGreetings <em>Greetings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greetings</em>' containment reference.
   * @see #getGreetings()
   * @generated
   */
  void setGreetings(Program value);

} // Model
