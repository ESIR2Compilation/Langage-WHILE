/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.LC;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LCs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.LCsImpl#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.LCsImpl#getA <em>A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCsImpl extends EXPRSIMPLEImpl implements LCs
{
  /**
   * The cached value of the '{@link #getN() <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected EXPR n;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected LC a;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LCsImpl()
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
    return Langage_whilePackage.Literals.LCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN(EXPR newN, NotificationChain msgs)
  {
    EXPR oldN = n;
    n = newN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LCS__N, oldN, newN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(EXPR newN)
  {
    if (newN != n)
    {
      NotificationChain msgs = null;
      if (n != null)
        msgs = ((InternalEObject)n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.LCS__N, null, msgs);
      if (newN != null)
        msgs = ((InternalEObject)newN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.LCS__N, null, msgs);
      msgs = basicSetN(newN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LCS__N, newN, newN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LC getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(LC newA, NotificationChain msgs)
  {
    LC oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LCS__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(LC newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.LCS__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.LCS__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LCS__A, newA, newA));
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
      case Langage_whilePackage.LCS__N:
        return basicSetN(null, msgs);
      case Langage_whilePackage.LCS__A:
        return basicSetA(null, msgs);
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
      case Langage_whilePackage.LCS__N:
        return getN();
      case Langage_whilePackage.LCS__A:
        return getA();
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
      case Langage_whilePackage.LCS__N:
        setN((EXPR)newValue);
        return;
      case Langage_whilePackage.LCS__A:
        setA((LC)newValue);
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
      case Langage_whilePackage.LCS__N:
        setN((EXPR)null);
        return;
      case Langage_whilePackage.LCS__A:
        setA((LC)null);
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
      case Langage_whilePackage.LCS__N:
        return n != null;
      case Langage_whilePackage.LCS__A:
        return a != null;
    }
    return super.eIsSet(featureID);
  }

} //LCsImpl
