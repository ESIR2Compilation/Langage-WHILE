/**
 */
package org.xtext.langage_while;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LCs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.LCs#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.LCs#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getLCs()
 * @model
 * @generated
 */
public interface LCs extends EXPRSIMPLE
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
   * @see #setN(EXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getLCs_N()
   * @model containment="true"
   * @generated
   */
  EXPR getN();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.LCs#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(EXPR value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(LC)
   * @see org.xtext.langage_while.Langage_whilePackage#getLCs_A()
   * @model containment="true"
   * @generated
   */
  LC getA();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.LCs#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(LC value);

} // LCs
