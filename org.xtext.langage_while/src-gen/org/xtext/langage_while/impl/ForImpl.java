/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Commands;
import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.For;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getHh <em>Hh</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getVv <em>Vv</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForImpl#getSs <em>Ss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForImpl extends MinimalEObjectImpl.Container implements For
{
  /**
   * The cached value of the '{@link #getCc() <em>Cc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCc()
   * @generated
   * @ordered
   */
  protected LCs cc;

  /**
   * The cached value of the '{@link #getHh() <em>Hh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHh()
   * @generated
   * @ordered
   */
  protected EXPR hh;

  /**
   * The cached value of the '{@link #getTt() <em>Tt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTt()
   * @generated
   * @ordered
   */
  protected LCs tt;

  /**
   * The cached value of the '{@link #getVv() <em>Vv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVv()
   * @generated
   * @ordered
   */
  protected LCs vv;

  /**
   * The cached value of the '{@link #getC1() <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC1()
   * @generated
   * @ordered
   */
  protected Commands c1;

  /**
   * The cached value of the '{@link #getSs() <em>Ss</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSs()
   * @generated
   * @ordered
   */
  protected LCs ss;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForImpl()
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
    return Langage_whilePackage.Literals.FOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getCc()
  {
    return cc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCc(LCs newCc, NotificationChain msgs)
  {
    LCs oldCc = cc;
    cc = newCc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__CC, oldCc, newCc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCc(LCs newCc)
  {
    if (newCc != cc)
    {
      NotificationChain msgs = null;
      if (cc != null)
        msgs = ((InternalEObject)cc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__CC, null, msgs);
      if (newCc != null)
        msgs = ((InternalEObject)newCc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__CC, null, msgs);
      msgs = basicSetCc(newCc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__CC, newCc, newCc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getHh()
  {
    return hh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHh(EXPR newHh, NotificationChain msgs)
  {
    EXPR oldHh = hh;
    hh = newHh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__HH, oldHh, newHh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHh(EXPR newHh)
  {
    if (newHh != hh)
    {
      NotificationChain msgs = null;
      if (hh != null)
        msgs = ((InternalEObject)hh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__HH, null, msgs);
      if (newHh != null)
        msgs = ((InternalEObject)newHh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__HH, null, msgs);
      msgs = basicSetHh(newHh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__HH, newHh, newHh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getTt()
  {
    return tt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTt(LCs newTt, NotificationChain msgs)
  {
    LCs oldTt = tt;
    tt = newTt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__TT, oldTt, newTt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTt(LCs newTt)
  {
    if (newTt != tt)
    {
      NotificationChain msgs = null;
      if (tt != null)
        msgs = ((InternalEObject)tt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__TT, null, msgs);
      if (newTt != null)
        msgs = ((InternalEObject)newTt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__TT, null, msgs);
      msgs = basicSetTt(newTt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__TT, newTt, newTt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getVv()
  {
    return vv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVv(LCs newVv, NotificationChain msgs)
  {
    LCs oldVv = vv;
    vv = newVv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__VV, oldVv, newVv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVv(LCs newVv)
  {
    if (newVv != vv)
    {
      NotificationChain msgs = null;
      if (vv != null)
        msgs = ((InternalEObject)vv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__VV, null, msgs);
      if (newVv != null)
        msgs = ((InternalEObject)newVv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__VV, null, msgs);
      msgs = basicSetVv(newVv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__VV, newVv, newVv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC1()
  {
    return c1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC1(Commands newC1, NotificationChain msgs)
  {
    Commands oldC1 = c1;
    c1 = newC1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__C1, oldC1, newC1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC1(Commands newC1)
  {
    if (newC1 != c1)
    {
      NotificationChain msgs = null;
      if (c1 != null)
        msgs = ((InternalEObject)c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__C1, null, msgs);
      if (newC1 != null)
        msgs = ((InternalEObject)newC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__C1, null, msgs);
      msgs = basicSetC1(newC1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__C1, newC1, newC1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getSs()
  {
    return ss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSs(LCs newSs, NotificationChain msgs)
  {
    LCs oldSs = ss;
    ss = newSs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__SS, oldSs, newSs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSs(LCs newSs)
  {
    if (newSs != ss)
    {
      NotificationChain msgs = null;
      if (ss != null)
        msgs = ((InternalEObject)ss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__SS, null, msgs);
      if (newSs != null)
        msgs = ((InternalEObject)newSs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOR__SS, null, msgs);
      msgs = basicSetSs(newSs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOR__SS, newSs, newSs));
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
      case Langage_whilePackage.FOR__CC:
        return basicSetCc(null, msgs);
      case Langage_whilePackage.FOR__HH:
        return basicSetHh(null, msgs);
      case Langage_whilePackage.FOR__TT:
        return basicSetTt(null, msgs);
      case Langage_whilePackage.FOR__VV:
        return basicSetVv(null, msgs);
      case Langage_whilePackage.FOR__C1:
        return basicSetC1(null, msgs);
      case Langage_whilePackage.FOR__SS:
        return basicSetSs(null, msgs);
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
      case Langage_whilePackage.FOR__CC:
        return getCc();
      case Langage_whilePackage.FOR__HH:
        return getHh();
      case Langage_whilePackage.FOR__TT:
        return getTt();
      case Langage_whilePackage.FOR__VV:
        return getVv();
      case Langage_whilePackage.FOR__C1:
        return getC1();
      case Langage_whilePackage.FOR__SS:
        return getSs();
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
      case Langage_whilePackage.FOR__CC:
        setCc((LCs)newValue);
        return;
      case Langage_whilePackage.FOR__HH:
        setHh((EXPR)newValue);
        return;
      case Langage_whilePackage.FOR__TT:
        setTt((LCs)newValue);
        return;
      case Langage_whilePackage.FOR__VV:
        setVv((LCs)newValue);
        return;
      case Langage_whilePackage.FOR__C1:
        setC1((Commands)newValue);
        return;
      case Langage_whilePackage.FOR__SS:
        setSs((LCs)newValue);
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
      case Langage_whilePackage.FOR__CC:
        setCc((LCs)null);
        return;
      case Langage_whilePackage.FOR__HH:
        setHh((EXPR)null);
        return;
      case Langage_whilePackage.FOR__TT:
        setTt((LCs)null);
        return;
      case Langage_whilePackage.FOR__VV:
        setVv((LCs)null);
        return;
      case Langage_whilePackage.FOR__C1:
        setC1((Commands)null);
        return;
      case Langage_whilePackage.FOR__SS:
        setSs((LCs)null);
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
      case Langage_whilePackage.FOR__CC:
        return cc != null;
      case Langage_whilePackage.FOR__HH:
        return hh != null;
      case Langage_whilePackage.FOR__TT:
        return tt != null;
      case Langage_whilePackage.FOR__VV:
        return vv != null;
      case Langage_whilePackage.FOR__C1:
        return c1 != null;
      case Langage_whilePackage.FOR__SS:
        return ss != null;
    }
    return super.eIsSet(featureID);
  }

} //ForImpl
