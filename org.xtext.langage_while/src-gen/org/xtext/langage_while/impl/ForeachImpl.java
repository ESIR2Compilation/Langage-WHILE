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
import org.xtext.langage_while.Foreach;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getSq <em>Sq</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getWx <em>Wx</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getLc <em>Lc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getLc3 <em>Lc3</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getLc4 <em>Lc4</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getC3 <em>C3</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getLc5 <em>Lc5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
  /**
   * The cached value of the '{@link #getSq() <em>Sq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSq()
   * @generated
   * @ordered
   */
  protected LCs sq;

  /**
   * The cached value of the '{@link #getWx() <em>Wx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWx()
   * @generated
   * @ordered
   */
  protected EXPR wx;

  /**
   * The cached value of the '{@link #getLc() <em>Lc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc()
   * @generated
   * @ordered
   */
  protected LCs lc;

  /**
   * The cached value of the '{@link #getLc2() <em>Lc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc2()
   * @generated
   * @ordered
   */
  protected LCs lc2;

  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected EXPR e1;

  /**
   * The cached value of the '{@link #getLc3() <em>Lc3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc3()
   * @generated
   * @ordered
   */
  protected LCs lc3;

  /**
   * The cached value of the '{@link #getLc4() <em>Lc4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc4()
   * @generated
   * @ordered
   */
  protected LCs lc4;

  /**
   * The cached value of the '{@link #getC3() <em>C3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC3()
   * @generated
   * @ordered
   */
  protected Commands c3;

  /**
   * The cached value of the '{@link #getLc5() <em>Lc5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc5()
   * @generated
   * @ordered
   */
  protected LCs lc5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachImpl()
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
    return Langage_whilePackage.Literals.FOREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getSq()
  {
    return sq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSq(LCs newSq, NotificationChain msgs)
  {
    LCs oldSq = sq;
    sq = newSq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__SQ, oldSq, newSq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSq(LCs newSq)
  {
    if (newSq != sq)
    {
      NotificationChain msgs = null;
      if (sq != null)
        msgs = ((InternalEObject)sq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__SQ, null, msgs);
      if (newSq != null)
        msgs = ((InternalEObject)newSq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__SQ, null, msgs);
      msgs = basicSetSq(newSq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__SQ, newSq, newSq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getWx()
  {
    return wx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWx(EXPR newWx, NotificationChain msgs)
  {
    EXPR oldWx = wx;
    wx = newWx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__WX, oldWx, newWx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWx(EXPR newWx)
  {
    if (newWx != wx)
    {
      NotificationChain msgs = null;
      if (wx != null)
        msgs = ((InternalEObject)wx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__WX, null, msgs);
      if (newWx != null)
        msgs = ((InternalEObject)newWx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__WX, null, msgs);
      msgs = basicSetWx(newWx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__WX, newWx, newWx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc()
  {
    return lc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc(LCs newLc, NotificationChain msgs)
  {
    LCs oldLc = lc;
    lc = newLc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC, oldLc, newLc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc(LCs newLc)
  {
    if (newLc != lc)
    {
      NotificationChain msgs = null;
      if (lc != null)
        msgs = ((InternalEObject)lc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC, null, msgs);
      if (newLc != null)
        msgs = ((InternalEObject)newLc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC, null, msgs);
      msgs = basicSetLc(newLc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC, newLc, newLc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc2()
  {
    return lc2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc2(LCs newLc2, NotificationChain msgs)
  {
    LCs oldLc2 = lc2;
    lc2 = newLc2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC2, oldLc2, newLc2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc2(LCs newLc2)
  {
    if (newLc2 != lc2)
    {
      NotificationChain msgs = null;
      if (lc2 != null)
        msgs = ((InternalEObject)lc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC2, null, msgs);
      if (newLc2 != null)
        msgs = ((InternalEObject)newLc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC2, null, msgs);
      msgs = basicSetLc2(newLc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC2, newLc2, newLc2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(EXPR newE1, NotificationChain msgs)
  {
    EXPR oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(EXPR newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc3()
  {
    return lc3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc3(LCs newLc3, NotificationChain msgs)
  {
    LCs oldLc3 = lc3;
    lc3 = newLc3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC3, oldLc3, newLc3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc3(LCs newLc3)
  {
    if (newLc3 != lc3)
    {
      NotificationChain msgs = null;
      if (lc3 != null)
        msgs = ((InternalEObject)lc3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC3, null, msgs);
      if (newLc3 != null)
        msgs = ((InternalEObject)newLc3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC3, null, msgs);
      msgs = basicSetLc3(newLc3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC3, newLc3, newLc3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc4()
  {
    return lc4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc4(LCs newLc4, NotificationChain msgs)
  {
    LCs oldLc4 = lc4;
    lc4 = newLc4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC4, oldLc4, newLc4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc4(LCs newLc4)
  {
    if (newLc4 != lc4)
    {
      NotificationChain msgs = null;
      if (lc4 != null)
        msgs = ((InternalEObject)lc4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC4, null, msgs);
      if (newLc4 != null)
        msgs = ((InternalEObject)newLc4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC4, null, msgs);
      msgs = basicSetLc4(newLc4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC4, newLc4, newLc4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC3()
  {
    return c3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC3(Commands newC3, NotificationChain msgs)
  {
    Commands oldC3 = c3;
    c3 = newC3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__C3, oldC3, newC3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC3(Commands newC3)
  {
    if (newC3 != c3)
    {
      NotificationChain msgs = null;
      if (c3 != null)
        msgs = ((InternalEObject)c3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__C3, null, msgs);
      if (newC3 != null)
        msgs = ((InternalEObject)newC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__C3, null, msgs);
      msgs = basicSetC3(newC3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__C3, newC3, newC3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc5()
  {
    return lc5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc5(LCs newLc5, NotificationChain msgs)
  {
    LCs oldLc5 = lc5;
    lc5 = newLc5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC5, oldLc5, newLc5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc5(LCs newLc5)
  {
    if (newLc5 != lc5)
    {
      NotificationChain msgs = null;
      if (lc5 != null)
        msgs = ((InternalEObject)lc5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC5, null, msgs);
      if (newLc5 != null)
        msgs = ((InternalEObject)newLc5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__LC5, null, msgs);
      msgs = basicSetLc5(newLc5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__LC5, newLc5, newLc5));
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
      case Langage_whilePackage.FOREACH__SQ:
        return basicSetSq(null, msgs);
      case Langage_whilePackage.FOREACH__WX:
        return basicSetWx(null, msgs);
      case Langage_whilePackage.FOREACH__LC:
        return basicSetLc(null, msgs);
      case Langage_whilePackage.FOREACH__LC2:
        return basicSetLc2(null, msgs);
      case Langage_whilePackage.FOREACH__E1:
        return basicSetE1(null, msgs);
      case Langage_whilePackage.FOREACH__LC3:
        return basicSetLc3(null, msgs);
      case Langage_whilePackage.FOREACH__LC4:
        return basicSetLc4(null, msgs);
      case Langage_whilePackage.FOREACH__C3:
        return basicSetC3(null, msgs);
      case Langage_whilePackage.FOREACH__LC5:
        return basicSetLc5(null, msgs);
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
      case Langage_whilePackage.FOREACH__SQ:
        return getSq();
      case Langage_whilePackage.FOREACH__WX:
        return getWx();
      case Langage_whilePackage.FOREACH__LC:
        return getLc();
      case Langage_whilePackage.FOREACH__LC2:
        return getLc2();
      case Langage_whilePackage.FOREACH__E1:
        return getE1();
      case Langage_whilePackage.FOREACH__LC3:
        return getLc3();
      case Langage_whilePackage.FOREACH__LC4:
        return getLc4();
      case Langage_whilePackage.FOREACH__C3:
        return getC3();
      case Langage_whilePackage.FOREACH__LC5:
        return getLc5();
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
      case Langage_whilePackage.FOREACH__SQ:
        setSq((LCs)newValue);
        return;
      case Langage_whilePackage.FOREACH__WX:
        setWx((EXPR)newValue);
        return;
      case Langage_whilePackage.FOREACH__LC:
        setLc((LCs)newValue);
        return;
      case Langage_whilePackage.FOREACH__LC2:
        setLc2((LCs)newValue);
        return;
      case Langage_whilePackage.FOREACH__E1:
        setE1((EXPR)newValue);
        return;
      case Langage_whilePackage.FOREACH__LC3:
        setLc3((LCs)newValue);
        return;
      case Langage_whilePackage.FOREACH__LC4:
        setLc4((LCs)newValue);
        return;
      case Langage_whilePackage.FOREACH__C3:
        setC3((Commands)newValue);
        return;
      case Langage_whilePackage.FOREACH__LC5:
        setLc5((LCs)newValue);
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
      case Langage_whilePackage.FOREACH__SQ:
        setSq((LCs)null);
        return;
      case Langage_whilePackage.FOREACH__WX:
        setWx((EXPR)null);
        return;
      case Langage_whilePackage.FOREACH__LC:
        setLc((LCs)null);
        return;
      case Langage_whilePackage.FOREACH__LC2:
        setLc2((LCs)null);
        return;
      case Langage_whilePackage.FOREACH__E1:
        setE1((EXPR)null);
        return;
      case Langage_whilePackage.FOREACH__LC3:
        setLc3((LCs)null);
        return;
      case Langage_whilePackage.FOREACH__LC4:
        setLc4((LCs)null);
        return;
      case Langage_whilePackage.FOREACH__C3:
        setC3((Commands)null);
        return;
      case Langage_whilePackage.FOREACH__LC5:
        setLc5((LCs)null);
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
      case Langage_whilePackage.FOREACH__SQ:
        return sq != null;
      case Langage_whilePackage.FOREACH__WX:
        return wx != null;
      case Langage_whilePackage.FOREACH__LC:
        return lc != null;
      case Langage_whilePackage.FOREACH__LC2:
        return lc2 != null;
      case Langage_whilePackage.FOREACH__E1:
        return e1 != null;
      case Langage_whilePackage.FOREACH__LC3:
        return lc3 != null;
      case Langage_whilePackage.FOREACH__LC4:
        return lc4 != null;
      case Langage_whilePackage.FOREACH__C3:
        return c3 != null;
      case Langage_whilePackage.FOREACH__LC5:
        return lc5 != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
