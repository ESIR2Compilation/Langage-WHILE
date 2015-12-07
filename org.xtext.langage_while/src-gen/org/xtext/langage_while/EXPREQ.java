/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPREQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.EXPREQ#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPREQ#getCcc <em>Ccc</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPREQ#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPREQ#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPREQ#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ()
 * @model
 * @generated
 */
public interface EXPREQ extends EObject
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(EXPRSIMPLE)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ_E1()
   * @model containment="true"
   * @generated
   */
  EXPRSIMPLE getE1();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPREQ#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(EXPRSIMPLE value);

  /**
   * Returns the value of the '<em><b>Ccc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ccc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ccc</em>' containment reference.
   * @see #setCcc(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ_Ccc()
   * @model containment="true"
   * @generated
   */
  LCs getCcc();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPREQ#getCcc <em>Ccc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ccc</em>' containment reference.
   * @see #getCcc()
   * @generated
   */
  void setCcc(LCs value);

  /**
   * Returns the value of the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lc2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lc2</em>' containment reference.
   * @see #setLc2(LCs)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ_Lc2()
   * @model containment="true"
   * @generated
   */
  LCs getLc2();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPREQ#getLc2 <em>Lc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lc2</em>' containment reference.
   * @see #getLc2()
   * @generated
   */
  void setLc2(LCs value);

  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference.
   * @see #setW(EXPRSIMPLE)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ_W()
   * @model containment="true"
   * @generated
   */
  EXPRSIMPLE getW();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPREQ#getW <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' containment reference.
   * @see #getW()
   * @generated
   */
  void setW(EXPRSIMPLE value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(EXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPREQ_Ex()
   * @model containment="true"
   * @generated
   */
  EXPR getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPREQ#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(EXPR value);

} // EXPREQ
