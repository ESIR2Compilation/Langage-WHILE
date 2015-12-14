/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPRSIMPLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getSym <em>Sym</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getMot <em>Mot</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getLex <em>Lex</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.EXPRSIMPLE#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE()
 * @model
 * @generated
 */
public interface EXPRSIMPLE extends EObject
{
  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_Nil()
   * @model
   * @generated
   */
  String getNil();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #getNil()
   * @generated
   */
  void setNil(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' attribute.
   * @see #setV(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_V()
   * @model
   * @generated
   */
  String getV();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getV <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' attribute.
   * @see #getV()
   * @generated
   */
  void setV(String value);

  /**
   * Returns the value of the '<em><b>Sym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sym</em>' attribute.
   * @see #setSym(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_Sym()
   * @model
   * @generated
   */
  String getSym();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getSym <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sym</em>' attribute.
   * @see #getSym()
   * @generated
   */
  void setSym(String value);

  /**
   * Returns the value of the '<em><b>Mot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mot</em>' attribute.
   * @see #setMot(String)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_Mot()
   * @model
   * @generated
   */
  String getMot();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getMot <em>Mot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mot</em>' attribute.
   * @see #getMot()
   * @generated
   */
  void setMot(String value);

  /**
   * Returns the value of the '<em><b>Lex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lex</em>' containment reference.
   * @see #setLex(LEXPR)
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_Lex()
   * @model containment="true"
   * @generated
   */
  LEXPR getLex();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getLex <em>Lex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lex</em>' containment reference.
   * @see #getLex()
   * @generated
   */
  void setLex(LEXPR value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_L()
   * @model containment="true"
   * @generated
   */
  LCs getL();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(LCs value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getEXPRSIMPLE_Ex()
   * @model containment="true"
   * @generated
   */
  EXPR getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.EXPRSIMPLE#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(EXPR value);

} // EXPRSIMPLE
