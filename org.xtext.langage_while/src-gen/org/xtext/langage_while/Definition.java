/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Definition#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.langage_while.Definition#getCom <em>Com</em>}</li>
 *   <li>{@link org.xtext.langage_while.Definition#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(Input)
   * @see org.xtext.langage_while.Langage_whilePackage#getDefinition_In()
   * @model containment="true"
   * @generated
   */
  Input getIn();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Definition#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(Input value);

  /**
   * Returns the value of the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com</em>' containment reference.
   * @see #setCom(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getDefinition_Com()
   * @model containment="true"
   * @generated
   */
  Commands getCom();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Definition#getCom <em>Com</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com</em>' containment reference.
   * @see #getCom()
   * @generated
   */
  void setCom(Commands value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(Output)
   * @see org.xtext.langage_while.Langage_whilePackage#getDefinition_Out()
   * @model containment="true"
   * @generated
   */
  Output getOut();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Definition#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(Output value);

} // Definition
