/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.Function#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.Function#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.langage_while.Function#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.langage_while.Function#getD <em>D</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getFunction_N()
   * @model containment="true"
   * @generated
   */
  LCs getN();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Function#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(LCs value);

  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getFunction_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Function#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getFunction_T()
   * @model containment="true"
   * @generated
   */
  LCs getT();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Function#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(LCs value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Def)
   * @see org.xtext.langage_while.Langage_whilePackage#getFunction_D()
   * @model containment="true"
   * @generated
   */
  Def getD();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.Function#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Def value);

} // Function
