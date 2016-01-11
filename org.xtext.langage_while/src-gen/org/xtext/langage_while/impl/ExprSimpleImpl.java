/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Expr;
import org.xtext.langage_while.ExprSimple;
import org.xtext.langage_while.LExpr;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.SYMB;
import org.xtext.langage_while.VAR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getMot <em>Mot</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getLex <em>Lex</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprSimpleImpl#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected static final String NIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected String nil = NIL_EDEFAULT;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected VAR v;

  /**
   * The cached value of the '{@link #getSym() <em>Sym</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected SYMB sym;

  /**
   * The default value of the '{@link #getMot() <em>Mot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMot()
   * @generated
   * @ordered
   */
  protected static final String MOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMot() <em>Mot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMot()
   * @generated
   * @ordered
   */
  protected String mot = MOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLex() <em>Lex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLex()
   * @generated
   * @ordered
   */
  protected LExpr lex;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected Expr ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSimpleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Langage_whilePackage.Literals.EXPR_SIMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(String newNil)
  {
    String oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(VAR newV, NotificationChain msgs)
  {
    VAR oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(VAR newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SYMB getSym()
  {
    return sym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSym(SYMB newSym, NotificationChain msgs)
  {
    SYMB oldSym = sym;
    sym = newSym;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__SYM, oldSym, newSym);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSym(SYMB newSym)
  {
    if (newSym != sym)
    {
      NotificationChain msgs = null;
      if (sym != null)
        msgs = ((InternalEObject)sym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__SYM, null, msgs);
      if (newSym != null)
        msgs = ((InternalEObject)newSym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__SYM, null, msgs);
      msgs = basicSetSym(newSym, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__SYM, newSym, newSym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMot()
  {
    return mot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMot(String newMot)
  {
    String oldMot = mot;
    mot = newMot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__MOT, oldMot, mot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpr getLex()
  {
    return lex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLex(LExpr newLex, NotificationChain msgs)
  {
    LExpr oldLex = lex;
    lex = newLex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__LEX, oldLex, newLex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLex(LExpr newLex)
  {
    if (newLex != lex)
    {
      NotificationChain msgs = null;
      if (lex != null)
        msgs = ((InternalEObject)lex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__LEX, null, msgs);
      if (newLex != null)
        msgs = ((InternalEObject)newLex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__LEX, null, msgs);
      msgs = basicSetLex(newLex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__LEX, newLex, newLex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(Expr newEx, NotificationChain msgs)
  {
    Expr oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(Expr newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_SIMPLE__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_SIMPLE__EX, newEx, newEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_SIMPLE__V:
        return basicSetV(null, msgs);
      case Langage_whilePackage.EXPR_SIMPLE__SYM:
        return basicSetSym(null, msgs);
      case Langage_whilePackage.EXPR_SIMPLE__LEX:
        return basicSetLex(null, msgs);
      case Langage_whilePackage.EXPR_SIMPLE__EX:
        return basicSetEx(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_SIMPLE__NIL:
        return getNil();
      case Langage_whilePackage.EXPR_SIMPLE__V:
        return getV();
      case Langage_whilePackage.EXPR_SIMPLE__SYM:
        return getSym();
      case Langage_whilePackage.EXPR_SIMPLE__MOT:
        return getMot();
      case Langage_whilePackage.EXPR_SIMPLE__LEX:
        return getLex();
      case Langage_whilePackage.EXPR_SIMPLE__EX:
        return getEx();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_SIMPLE__NIL:
        setNil((String)newValue);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__V:
        setV((VAR)newValue);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__SYM:
        setSym((SYMB)newValue);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__MOT:
        setMot((String)newValue);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__LEX:
        setLex((LExpr)newValue);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__EX:
        setEx((Expr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_SIMPLE__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__V:
        setV((VAR)null);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__SYM:
        setSym((SYMB)null);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__MOT:
        setMot(MOT_EDEFAULT);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__LEX:
        setLex((LExpr)null);
        return;
      case Langage_whilePackage.EXPR_SIMPLE__EX:
        setEx((Expr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_SIMPLE__NIL:
        return NIL_EDEFAULT == null ? nil != null : !NIL_EDEFAULT.equals(nil);
      case Langage_whilePackage.EXPR_SIMPLE__V:
        return v != null;
      case Langage_whilePackage.EXPR_SIMPLE__SYM:
        return sym != null;
      case Langage_whilePackage.EXPR_SIMPLE__MOT:
        return MOT_EDEFAULT == null ? mot != null : !MOT_EDEFAULT.equals(mot);
      case Langage_whilePackage.EXPR_SIMPLE__LEX:
        return lex != null;
      case Langage_whilePackage.EXPR_SIMPLE__EX:
        return ex != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nil: ");
    result.append(nil);
    result.append(", mot: ");
    result.append(mot);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl
