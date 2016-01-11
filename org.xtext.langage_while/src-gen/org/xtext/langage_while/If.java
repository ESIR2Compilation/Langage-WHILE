/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.If#getEx <em>Ex</em>}</li>
 *   <li>{@link org.xtext.langage_while.If#getCt <em>Ct</em>}</li>
 *   <li>{@link org.xtext.langage_while.If#getCe <em>Ce</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getIf()
 * @model
 * @generated
 */
public interface If extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(Expr)
   * @see org.xtext.langage_while.Langage_whilePackage#getIf_Ex()
   * @model containment="true"
   * @generated
   */
  Expr getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.If#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Expr value);

  /**
   * Returns the value of the '<em><b>Ct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ct</em>' containment reference.
   * @see #setCt(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getIf_Ct()
   * @model containment="true"
   * @generated
   */
  Commands getCt();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.If#getCt <em>Ct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ct</em>' containment reference.
   * @see #getCt()
   * @generated
   */
  void setCt(Commands value);

  /**
   * Returns the value of the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ce</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ce</em>' containment reference.
   * @see #setCe(Commands)
   * @see org.xtext.langage_while.Langage_whilePackage#getIf_Ce()
   * @model containment="true"
   * @generated
   */
  Commands getCe();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.If#getCe <em>Ce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ce</em>' containment reference.
   * @see #getCe()
   * @generated
   */
  void setCe(Commands value);

} // If
