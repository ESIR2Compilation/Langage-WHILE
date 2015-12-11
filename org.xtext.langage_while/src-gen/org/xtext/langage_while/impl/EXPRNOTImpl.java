/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.EXPREQ;
import org.xtext.langage_while.EXPRNOT;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRNOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.EXPRNOTImpl#getLc1 <em>Lc1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRNOTImpl#getE1 <em>E1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPRNOTImpl extends MinimalEObjectImpl.Container implements EXPRNOT
{
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
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected EXPREQ e1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRNOTImpl()
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
    return Langage_whilePackage.Literals.EXPRNOT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRNOT__LC1, oldLc1, newLc1);
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
        msgs = ((InternalEObject)lc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRNOT__LC1, null, msgs);
      if (newLc1 != null)
        msgs = ((InternalEObject)newLc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRNOT__LC1, null, msgs);
      msgs = basicSetLc1(newLc1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRNOT__LC1, newLc1, newLc1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPREQ getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(EXPREQ newE1, NotificationChain msgs)
  {
    EXPREQ oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRNOT__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(EXPREQ newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRNOT__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRNOT__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRNOT__E1, newE1, newE1));
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
      case Langage_whilePackage.EXPRNOT__LC1:
        return basicSetLc1(null, msgs);
      case Langage_whilePackage.EXPRNOT__E1:
        return basicSetE1(null, msgs);
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
      case Langage_whilePackage.EXPRNOT__LC1:
        return getLc1();
      case Langage_whilePackage.EXPRNOT__E1:
        return getE1();
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
      case Langage_whilePackage.EXPRNOT__LC1:
        setLc1((LCs)newValue);
        return;
      case Langage_whilePackage.EXPRNOT__E1:
        setE1((EXPREQ)newValue);
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
      case Langage_whilePackage.EXPRNOT__LC1:
        setLc1((LCs)null);
        return;
      case Langage_whilePackage.EXPRNOT__E1:
        setE1((EXPREQ)null);
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
      case Langage_whilePackage.EXPRNOT__LC1:
        return lc1 != null;
      case Langage_whilePackage.EXPRNOT__E1:
        return e1 != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPRNOTImpl
