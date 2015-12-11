/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Commands#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.langage_while.Commands#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.Commands#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Command)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommands_A()
   * @model containment="true"
   * @generated
   */
  Command getA();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Commands#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Command value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommands_L()
   * @model containment="true"
   * @generated
   */
  LCs getL();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Commands#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LCs value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getCommands_S()
   * @model containment="true"
   * @generated
   */
  Commands getS();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Commands#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(Commands value);

} // Commands
