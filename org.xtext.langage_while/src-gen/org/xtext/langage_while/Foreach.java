/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.Foreach#getEx1 <em>Ex1</em>}</li>
 *   <li>{@link org.xtext.langage_while.Foreach#getEx2 <em>Ex2</em>}</li>
 *   <li>{@link org.xtext.langage_while.Foreach#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getForeach()
 * @model
 * @generated
 */
public interface Foreach extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex1</em>' containment reference.
   * @see #setEx1(Expr)
   * @see org.xtext.langage_while.Langage_whilePackage#getForeach_Ex1()
   * @model containment="true"
   * @generated
   */
  Expr getEx1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Foreach#getEx1 <em>Ex1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex1</em>' containment reference.
   * @see #getEx1()
   * @generated
   */
  void setEx1(Expr value);

  /**
   * Returns the value of the '<em><b>Ex2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex2</em>' containment reference.
   * @see #setEx2(Expr)
   * @see org.xtext.langage_while.Langage_whilePackage#getForeach_Ex2()
   * @model containment="true"
   * @generated
   */
  Expr getEx2();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Foreach#getEx2 <em>Ex2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex2</em>' containment reference.
   * @see #getEx2()
   * @generated
   */
  void setEx2(Expr value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getForeach_C()
   * @model containment="true"
   * @generated
   */
  Commands getC();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Foreach#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Commands value);

} // Foreach
