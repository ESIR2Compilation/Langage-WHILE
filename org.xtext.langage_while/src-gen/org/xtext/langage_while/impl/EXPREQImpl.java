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
import org.xtext.langage_while.EXPREQ;
import org.xtext.langage_while.EXPRSIMPLE;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPREQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.EXPREQImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPREQImpl#getCcc <em>Ccc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPREQImpl#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPREQImpl#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPREQImpl#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPREQImpl extends MinimalEObjectImpl.Container implements EXPREQ
{
  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected EXPRSIMPLE e1;

  /**
   * The cached value of the '{@link #getCcc() <em>Ccc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCcc()
   * @generated
   * @ordered
   */
  protected LCs ccc;

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
   * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected EXPRSIMPLE w;

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
  protected EXPREQImpl()
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
    return Langage_whilePackage.Literals.EXPREQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRSIMPLE getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(EXPRSIMPLE newE1, NotificationChain msgs)
  {
    EXPRSIMPLE oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(EXPRSIMPLE newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getCcc()
  {
    return ccc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCcc(LCs newCcc, NotificationChain msgs)
  {
    LCs oldCcc = ccc;
    ccc = newCcc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__CCC, oldCcc, newCcc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCcc(LCs newCcc)
  {
    if (newCcc != ccc)
    {
      NotificationChain msgs = null;
      if (ccc != null)
        msgs = ((InternalEObject)ccc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__CCC, null, msgs);
      if (newCcc != null)
        msgs = ((InternalEObject)newCcc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__CCC, null, msgs);
      msgs = basicSetCcc(newCcc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__CCC, newCcc, newCcc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__LC2, oldLc2, newLc2);
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
        msgs = ((InternalEObject)lc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__LC2, null, msgs);
      if (newLc2 != null)
        msgs = ((InternalEObject)newLc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__LC2, null, msgs);
      msgs = basicSetLc2(newLc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__LC2, newLc2, newLc2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRSIMPLE getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW(EXPRSIMPLE newW, NotificationChain msgs)
  {
    EXPRSIMPLE oldW = w;
    w = newW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__W, oldW, newW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(EXPRSIMPLE newW)
  {
    if (newW != w)
    {
      NotificationChain msgs = null;
      if (w != null)
        msgs = ((InternalEObject)w).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__W, null, msgs);
      if (newW != null)
        msgs = ((InternalEObject)newW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__W, null, msgs);
      msgs = basicSetW(newW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__W, newW, newW));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__EX, oldEx, newEx);
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
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPREQ__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPREQ__EX, newEx, newEx));
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
      case Langage_whilePackage.EXPREQ__E1:
        return basicSetE1(null, msgs);
      case Langage_whilePackage.EXPREQ__CCC:
        return basicSetCcc(null, msgs);
      case Langage_whilePackage.EXPREQ__LC2:
        return basicSetLc2(null, msgs);
      case Langage_whilePackage.EXPREQ__W:
        return basicSetW(null, msgs);
      case Langage_whilePackage.EXPREQ__EX:
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
      case Langage_whilePackage.EXPREQ__E1:
        return getE1();
      case Langage_whilePackage.EXPREQ__CCC:
        return getCcc();
      case Langage_whilePackage.EXPREQ__LC2:
        return getLc2();
      case Langage_whilePackage.EXPREQ__W:
        return getW();
      case Langage_whilePackage.EXPREQ__EX:
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
      case Langage_whilePackage.EXPREQ__E1:
        setE1((EXPRSIMPLE)newValue);
        return;
      case Langage_whilePackage.EXPREQ__CCC:
        setCcc((LCs)newValue);
        return;
      case Langage_whilePackage.EXPREQ__LC2:
        setLc2((LCs)newValue);
        return;
      case Langage_whilePackage.EXPREQ__W:
        setW((EXPRSIMPLE)newValue);
        return;
      case Langage_whilePackage.EXPREQ__EX:
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
      case Langage_whilePackage.EXPREQ__E1:
        setE1((EXPRSIMPLE)null);
        return;
      case Langage_whilePackage.EXPREQ__CCC:
        setCcc((LCs)null);
        return;
      case Langage_whilePackage.EXPREQ__LC2:
        setLc2((LCs)null);
        return;
      case Langage_whilePackage.EXPREQ__W:
        setW((EXPRSIMPLE)null);
        return;
      case Langage_whilePackage.EXPREQ__EX:
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
      case Langage_whilePackage.EXPREQ__E1:
        return e1 != null;
      case Langage_whilePackage.EXPREQ__CCC:
        return ccc != null;
      case Langage_whilePackage.EXPREQ__LC2:
        return lc2 != null;
      case Langage_whilePackage.EXPREQ__W:
        return w != null;
      case Langage_whilePackage.EXPREQ__EX:
        return ex != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPREQImpl
