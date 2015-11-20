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
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getS <em>S</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getYy <em>Yy</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getB <em>B</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getU <em>U</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getG <em>G</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl#getW <em>W</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPRSIMPLEImpl extends MinimalEObjectImpl.Container implements EXPRSIMPLE
{
  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final String L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected String l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected static final String S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected String s = S_EDEFAULT;

  /**
   * The cached value of the '{@link #getYy() <em>Yy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYy()
   * @generated
   * @ordered
   */
  protected LEXPR yy;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected LEXPR b;

  /**
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected LCs u;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected EXPR g;

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
   * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected LEXPR w;

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
  public String getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(String newL)
  {
    String oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(String newS)
  {
    String oldS = s;
    s = newS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__S, oldS, s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEXPR getYy()
  {
    return yy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYy(LEXPR newYy, NotificationChain msgs)
  {
    LEXPR oldYy = yy;
    yy = newYy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__YY, oldYy, newYy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYy(LEXPR newYy)
  {
    if (newYy != yy)
    {
      NotificationChain msgs = null;
      if (yy != null)
        msgs = ((InternalEObject)yy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__YY, null, msgs);
      if (newYy != null)
        msgs = ((InternalEObject)newYy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__YY, null, msgs);
      msgs = basicSetYy(newYy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__YY, newYy, newYy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEXPR getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(LEXPR newB, NotificationChain msgs)
  {
    LEXPR oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(LEXPR newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(LCs newU, NotificationChain msgs)
  {
    LCs oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(LCs newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__U, newU, newU));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getG()
  {
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetG(EXPR newG, NotificationChain msgs)
  {
    EXPR oldG = g;
    g = newG;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__G, oldG, newG);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setG(EXPR newG)
  {
    if (newG != g)
    {
      NotificationChain msgs = null;
      if (g != null)
        msgs = ((InternalEObject)g).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__G, null, msgs);
      if (newG != null)
        msgs = ((InternalEObject)newG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__G, null, msgs);
      msgs = basicSetG(newG, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__G, newG, newG));
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
  public LEXPR getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW(LEXPR newW, NotificationChain msgs)
  {
    LEXPR oldW = w;
    w = newW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__W, oldW, newW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(LEXPR newW)
  {
    if (newW != w)
    {
      NotificationChain msgs = null;
      if (w != null)
        msgs = ((InternalEObject)w).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__W, null, msgs);
      if (newW != null)
        msgs = ((InternalEObject)newW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRSIMPLE__W, null, msgs);
      msgs = basicSetW(newW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRSIMPLE__W, newW, newW));
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
      case Langage_whilePackage.EXPRSIMPLE__YY:
        return basicSetYy(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__B:
        return basicSetB(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__U:
        return basicSetU(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__G:
        return basicSetG(null, msgs);
      case Langage_whilePackage.EXPRSIMPLE__W:
        return basicSetW(null, msgs);
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
      case Langage_whilePackage.EXPRSIMPLE__L:
        return getL();
      case Langage_whilePackage.EXPRSIMPLE__S:
        return getS();
      case Langage_whilePackage.EXPRSIMPLE__YY:
        return getYy();
      case Langage_whilePackage.EXPRSIMPLE__B:
        return getB();
      case Langage_whilePackage.EXPRSIMPLE__U:
        return getU();
      case Langage_whilePackage.EXPRSIMPLE__G:
        return getG();
      case Langage_whilePackage.EXPRSIMPLE__V:
        return getV();
      case Langage_whilePackage.EXPRSIMPLE__W:
        return getW();
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
      case Langage_whilePackage.EXPRSIMPLE__L:
        setL((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__S:
        setS((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__YY:
        setYy((LEXPR)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__B:
        setB((LEXPR)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__U:
        setU((LCs)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__G:
        setG((EXPR)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__V:
        setV((String)newValue);
        return;
      case Langage_whilePackage.EXPRSIMPLE__W:
        setW((LEXPR)newValue);
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
      case Langage_whilePackage.EXPRSIMPLE__L:
        setL(L_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__S:
        setS(S_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__YY:
        setYy((LEXPR)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__B:
        setB((LEXPR)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__U:
        setU((LCs)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__G:
        setG((EXPR)null);
        return;
      case Langage_whilePackage.EXPRSIMPLE__V:
        setV(V_EDEFAULT);
        return;
      case Langage_whilePackage.EXPRSIMPLE__W:
        setW((LEXPR)null);
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
      case Langage_whilePackage.EXPRSIMPLE__L:
        return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
      case Langage_whilePackage.EXPRSIMPLE__S:
        return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
      case Langage_whilePackage.EXPRSIMPLE__YY:
        return yy != null;
      case Langage_whilePackage.EXPRSIMPLE__B:
        return b != null;
      case Langage_whilePackage.EXPRSIMPLE__U:
        return u != null;
      case Langage_whilePackage.EXPRSIMPLE__G:
        return g != null;
      case Langage_whilePackage.EXPRSIMPLE__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
      case Langage_whilePackage.EXPRSIMPLE__W:
        return w != null;
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
    result.append(" (l: ");
    result.append(l);
    result.append(", s: ");
    result.append(s);
    result.append(", v: ");
    result.append(v);
    result.append(')');
    return result.toString();
  }

} //EXPRSIMPLEImpl
