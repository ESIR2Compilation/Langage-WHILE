/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.VAR#getBv <em>Bv</em>}</li>
 *   <li>{@link org.xtext.langage_while.VAR#getCf <em>Cf</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getVAR()
 * @model
 * @generated
 */
public interface VAR extends EObject
{
  /**
   * Returns the value of the '<em><b>Bv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bv</em>' attribute.
   * @see #setBv(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getVAR_Bv()
   * @model
   * @generated
   */
  String getBv();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.VAR#getBv <em>Bv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bv</em>' attribute.
   * @see #getBv()
   * @generated
   */
  void setBv(String value);

  /**
   * Returns the value of the '<em><b>Cf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cf</em>' attribute.
   * @see #setCf(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getVAR_Cf()
   * @model
   * @generated
   */
  String getCf();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.VAR#getCf <em>Cf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cf</em>' attribute.
   * @see #getCf()
   * @generated
   */
  void setCf(String value);

} // VAR
