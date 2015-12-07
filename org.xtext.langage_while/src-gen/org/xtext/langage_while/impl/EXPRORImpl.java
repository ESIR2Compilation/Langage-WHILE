/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.EXPRNOT;
import org.xtext.langage_while.EXPROR;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPROR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.EXPRORImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRORImpl#getLc1 <em>Lc1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRORImpl#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRORImpl#getE2 <em>E2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPRORImpl extends MinimalEObjectImpl.Container implements EXPROR
{
  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected EXPRNOT e1;

  /**
   * The cached value of the '{@link #getLc1() <em>Lc1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc1()
   * @generated
   * @ordered
   */
  protected LCs lc1;

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
   * The cached value of the '{@link #getE2() <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE2()
   * @generated
   * @ordered
   */
  protected EXPROR e2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRORImpl()
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
    return Langage_whilePackage.Literals.EXPROR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRNOT getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(EXPRNOT newE1, NotificationChain msgs)
  {
    EXPRNOT oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(EXPRNOT newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc1()
  {
    return lc1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc1(LCs newLc1, NotificationChain msgs)
  {
    LCs oldLc1 = lc1;
    lc1 = newLc1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__LC1, oldLc1, newLc1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc1(LCs newLc1)
  {
    if (newLc1 != lc1)
    {
      NotificationChain msgs = null;
      if (lc1 != null)
        msgs = ((InternalEObject)lc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__LC1, null, msgs);
      if (newLc1 != null)
        msgs = ((InternalEObject)newLc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__LC1, null, msgs);
      msgs = basicSetLc1(newLc1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__LC1, newLc1, newLc1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__LC2, oldLc2, newLc2);
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
        msgs = ((InternalEObject)lc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__LC2, null, msgs);
      if (newLc2 != null)
        msgs = ((InternalEObject)newLc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__LC2, null, msgs);
      msgs = basicSetLc2(newLc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__LC2, newLc2, newLc2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPROR getE2()
  {
    return e2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE2(EXPROR newE2, NotificationChain msgs)
  {
    EXPROR oldE2 = e2;
    e2 = newE2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__E2, oldE2, newE2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE2(EXPROR newE2)
  {
    if (newE2 != e2)
    {
      NotificationChain msgs = null;
      if (e2 != null)
        msgs = ((InternalEObject)e2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__E2, null, msgs);
      if (newE2 != null)
        msgs = ((InternalEObject)newE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPROR__E2, null, msgs);
      msgs = basicSetE2(newE2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPROR__E2, newE2, newE2));
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
      case Langage_whilePackage.EXPROR__E1:
        return basicSetE1(null, msgs);
      case Langage_whilePackage.EXPROR__LC1:
        return basicSetLc1(null, msgs);
      case Langage_whilePackage.EXPROR__LC2:
        return basicSetLc2(null, msgs);
      case Langage_whilePackage.EXPROR__E2:
        return basicSetE2(null, msgs);
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
      case Langage_whilePackage.EXPROR__E1:
        return getE1();
      case Langage_whilePackage.EXPROR__LC1:
        return getLc1();
      case Langage_whilePackage.EXPROR__LC2:
        return getLc2();
      case Langage_whilePackage.EXPROR__E2:
        return getE2();
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
      case Langage_whilePackage.EXPROR__E1:
        setE1((EXPRNOT)newValue);
        return;
      case Langage_whilePackage.EXPROR__LC1:
        setLc1((LCs)newValue);
        return;
      case Langage_whilePackage.EXPROR__LC2:
        setLc2((LCs)newValue);
        return;
      case Langage_whilePackage.EXPROR__E2:
        setE2((EXPROR)newValue);
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
      case Langage_whilePackage.EXPROR__E1:
        setE1((EXPRNOT)null);
        return;
      case Langage_whilePackage.EXPROR__LC1:
        setLc1((LCs)null);
        return;
      case Langage_whilePackage.EXPROR__LC2:
        setLc2((LCs)null);
        return;
      case Langage_whilePackage.EXPROR__E2:
        setE2((EXPROR)null);
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
      case Langage_whilePackage.EXPROR__E1:
        return e1 != null;
      case Langage_whilePackage.EXPROR__LC1:
        return lc1 != null;
      case Langage_whilePackage.EXPROR__LC2:
        return lc2 != null;
      case Langage_whilePackage.EXPROR__E2:
        return e2 != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPRORImpl
