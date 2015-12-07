/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.EXPRAND;
import org.xtext.langage_while.EXPROR;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRAND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.EXPRANDImpl#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRANDImpl#getLc1 <em>Lc1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRANDImpl#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.EXPRANDImpl#getEe <em>Ee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPRANDImpl extends MinimalEObjectImpl.Container implements EXPRAND
{
  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected EXPROR f;

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
   * The cached value of the '{@link #getEe() <em>Ee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEe()
   * @generated
   * @ordered
   */
  protected EXPRAND ee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRANDImpl()
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
    return Langage_whilePackage.Literals.EXPRAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPROR getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(EXPROR newF, NotificationChain msgs)
  {
    EXPROR oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(EXPROR newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__F, newF, newF));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__LC1, oldLc1, newLc1);
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
        msgs = ((InternalEObject)lc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__LC1, null, msgs);
      if (newLc1 != null)
        msgs = ((InternalEObject)newLc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__LC1, null, msgs);
      msgs = basicSetLc1(newLc1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__LC1, newLc1, newLc1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__LC2, oldLc2, newLc2);
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
        msgs = ((InternalEObject)lc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__LC2, null, msgs);
      if (newLc2 != null)
        msgs = ((InternalEObject)newLc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__LC2, null, msgs);
      msgs = basicSetLc2(newLc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__LC2, newLc2, newLc2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRAND getEe()
  {
    return ee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEe(EXPRAND newEe, NotificationChain msgs)
  {
    EXPRAND oldEe = ee;
    ee = newEe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__EE, oldEe, newEe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEe(EXPRAND newEe)
  {
    if (newEe != ee)
    {
      NotificationChain msgs = null;
      if (ee != null)
        msgs = ((InternalEObject)ee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__EE, null, msgs);
      if (newEe != null)
        msgs = ((InternalEObject)newEe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPRAND__EE, null, msgs);
      msgs = basicSetEe(newEe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPRAND__EE, newEe, newEe));
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
      case Langage_whilePackage.EXPRAND__F:
        return basicSetF(null, msgs);
      case Langage_whilePackage.EXPRAND__LC1:
        return basicSetLc1(null, msgs);
      case Langage_whilePackage.EXPRAND__LC2:
        return basicSetLc2(null, msgs);
      case Langage_whilePackage.EXPRAND__EE:
        return basicSetEe(null, msgs);
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
      case Langage_whilePackage.EXPRAND__F:
        return getF();
      case Langage_whilePackage.EXPRAND__LC1:
        return getLc1();
      case Langage_whilePackage.EXPRAND__LC2:
        return getLc2();
      case Langage_whilePackage.EXPRAND__EE:
        return getEe();
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
      case Langage_whilePackage.EXPRAND__F:
        setF((EXPROR)newValue);
        return;
      case Langage_whilePackage.EXPRAND__LC1:
        setLc1((LCs)newValue);
        return;
      case Langage_whilePackage.EXPRAND__LC2:
        setLc2((LCs)newValue);
        return;
      case Langage_whilePackage.EXPRAND__EE:
        setEe((EXPRAND)newValue);
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
      case Langage_whilePackage.EXPRAND__F:
        setF((EXPROR)null);
        return;
      case Langage_whilePackage.EXPRAND__LC1:
        setLc1((LCs)null);
        return;
      case Langage_whilePackage.EXPRAND__LC2:
        setLc2((LCs)null);
        return;
      case Langage_whilePackage.EXPRAND__EE:
        setEe((EXPRAND)null);
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
      case Langage_whilePackage.EXPRAND__F:
        return f != null;
      case Langage_whilePackage.EXPRAND__LC1:
        return lc1 != null;
      case Langage_whilePackage.EXPRAND__LC2:
        return lc2 != null;
      case Langage_whilePackage.EXPRAND__EE:
        return ee != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPRANDImpl
