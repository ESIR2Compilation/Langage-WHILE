/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getSym <em>Sym</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getMot <em>Mot</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getLex <em>Lex</em>}</li>
 *   <li>{@link org.xtext.langage_while.ExprSimple#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends EObject
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
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_Nil()
   * @model
   * @generated
   */
  String getNil();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #getNil()
   * @generated
   */
  void setNil(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VAR)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_V()
   * @model containment="true"
   * @generated
   */
  VAR getV();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VAR value);

  /**
   * Returns the value of the '<em><b>Sym</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sym</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sym</em>' containment reference.
   * @see #setSym(SYMB)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_Sym()
   * @model containment="true"
   * @generated
   */
  SYMB getSym();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getSym <em>Sym</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sym</em>' containment reference.
   * @see #getSym()
   * @generated
   */
  void setSym(SYMB value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_Mot()
   * @model
   * @generated
   */
  String getMot();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getMot <em>Mot</em>}' attribute.
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
   * @see #setLex(LExpr)
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_Lex()
   * @model containment="true"
   * @generated
   */
  LExpr getLex();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getLex <em>Lex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lex</em>' containment reference.
   * @see #getLex()
   * @generated
   */
  void setLex(LExpr value);

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
   * @see org.xtext.langage_while.Langage_whilePackage#getExprSimple_Ex()
   * @model containment="true"
   * @generated
   */
  Expr getEx();

  /**
   * Sets the value of the '{@link org.xtext.langage_while.ExprSimple#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Expr value);

} // ExprSimple
