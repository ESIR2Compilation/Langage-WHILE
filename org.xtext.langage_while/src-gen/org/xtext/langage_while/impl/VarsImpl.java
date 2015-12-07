/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Vars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.VarsImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.VarsImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.VarsImpl#getU <em>U</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarsImpl extends MinimalEObjectImpl.Container implements Vars
{
  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final String A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected String a = A_EDEFAULT;

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
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected Vars u;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarsImpl()
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
    return Langage_whilePackage.Literals.VARS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(String newA)
  {
    String oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VARS__A, oldA, a));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VARS__L, oldL, newL);
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
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.VARS__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.VARS__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VARS__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(Vars newU, NotificationChain msgs)
  {
    Vars oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VARS__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(Vars newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.VARS__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.VARS__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VARS__U, newU, newU));
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
      case Langage_whilePackage.VARS__L:
        return basicSetL(null, msgs);
      case Langage_whilePackage.VARS__U:
        return basicSetU(null, msgs);
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
      case Langage_whilePackage.VARS__A:
        return getA();
      case Langage_whilePackage.VARS__L:
        return getL();
      case Langage_whilePackage.VARS__U:
        return getU();
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
      case Langage_whilePackage.VARS__A:
        setA((String)newValue);
        return;
      case Langage_whilePackage.VARS__L:
        setL((LCs)newValue);
        return;
      case Langage_whilePackage.VARS__U:
        setU((Vars)newValue);
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
      case Langage_whilePackage.VARS__A:
        setA(A_EDEFAULT);
        return;
      case Langage_whilePackage.VARS__L:
        setL((LCs)null);
        return;
      case Langage_whilePackage.VARS__U:
        setU((Vars)null);
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
      case Langage_whilePackage.VARS__A:
        return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
      case Langage_whilePackage.VARS__L:
        return l != null;
      case Langage_whilePackage.VARS__U:
        return u != null;
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
    result.append(" (a: ");
    result.append(a);
    result.append(')');
    return result.toString();
  }

} //VarsImpl
