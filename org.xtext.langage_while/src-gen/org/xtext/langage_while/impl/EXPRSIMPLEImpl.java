/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.EXPRSIMPLE;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.LEXPR;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRSIMPLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getMot <em>Mot</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getLex <em>Lex</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPRSIMPLEImpl extends MinimalEObjectImpl.Container implements EXPRSIMPLE
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
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected static final String V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected String v = V_EDEFAULT;

  /**
   * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected static final String SYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected String sym = SYM_EDEFAULT;

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
  protected LEXPR lex;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected LCs l;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected EXPR ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRSIMPLEImpl()
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
    return Langage_whilePackage.Literals.EXPRSIMPLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(String newV)
  {
    String oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSym()
  {
    return sym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSym(String newSym)
  {
    String oldSym = sym;
    sym = newSym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__SYM, oldSym, sym));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__MOT, oldMot, mot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEXPR getLex()
  {
    return lex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLex(LEXPR newLex, NotificationChain msgs)
  {
    LEXPR oldLex = lex;
    lex = newLex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__LEX, oldLex, newLex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLex(LEXPR newLex)
  {
    if (newLex != lex)
    {
      NotificationChain msgs = null;
      if (lex != null)
        msgs = ((InternalEObject)lex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__LEX, null, msgs);
      if (newLex != null)
        msgs = ((InternalEObject)newLex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__LEX, null, msgs);
      msgs = basicSetLex(newLex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__LEX, newLex, newLex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(LCs newL, NotificationChain msgs)
  {
    LCs oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(LCs newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(EXPR newEx, NotificationChain msgs)
  {
    EXPR oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(EXPR newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__EX, newEx, newEx));
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
      case Langage_whilePackage.EXPRSIMPLE__LEX:
        return basicSetLex(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__L:
        return basicSetL(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__EX:
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
      case Langage_whilePackage.EXPRSIMPLE__NIL:
        return getNil();
      case Langage_whilePackage.EXPRSIMPLE__V:
        return getV();
      case Langage_whilePackage.EXPRSIMPLE__SYM:
        return getSym();
      case Langage_whilePackage.EXPRSIMPLE__MOT:
        return getMot();
      case Langage_whilePackage.EXPRSIMPLE__LEX:
        return getLex();
      case Langage_whilePackage.EXPRSIMPLE__L:
        return getL();
      case Langage_whilePackage.EXPRSIMPLE__EX:
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
      case Langage_whilePackage.EXPRSIMPLE__NIL:
        setNil((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__V:
        setV((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__SYM:
        setSym((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__MOT:
        setMot((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__LEX:
        setLex((LEXPR)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__L:
        setL((LCs)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__EX:
        setEx((EXPR)newValue);
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
      case Langage_whilePackage.EXPRSIMPLE__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__V:
        setV(V_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__SYM:
        setSym(SYM_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__MOT:
        setMot(MOT_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__LEX:
        setLex((LEXPR)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__L:
        setL((LCs)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__EX:
        setEx((EXPR)null);
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
      case Langage_whilePackage.EXPRSIMPLE__NIL:
        return NIL_EDEFAULT == null ? nil != null : !NIL_EDEFAULT.equals(nil);
      case Langage_whilePackage.EXPRSIMPLE__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
      case Langage_whilePackage.EXPRSIMPLE__SYM:
        return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
      case Langage_whilePackage.EXPRSIMPLE__MOT:
        return MOT_EDEFAULT == null ? mot != null : !MOT_EDEFAULT.equals(mot);
      case Langage_whilePackage.EXPRSIMPLE__LEX:
        return lex != null;
      case Langage_whilePackage.EXPRSIMPLE__L:
        return l != null;
      case Langage_whilePackage.EXPRSIMPLE__EX:
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
    result.append(", v: ");
    result.append(v);
    result.append(", sym: ");
    result.append(sym);
    result.append(", mot: ");
    result.append(mot);
    result.append(')');
    return result.toString();
  }

} //EXPRSIMPLEImpl
