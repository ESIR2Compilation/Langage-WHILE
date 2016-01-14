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
import org.xtext.langage_while.Expr;
import org.xtext.langage_while.Foreach;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getEx1 <em>Ex1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getEx2 <em>Ex2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ForeachImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
  /**
   * The cached value of the '{@link #getEx1() <em>Ex1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx1()
   * @generated
   * @ordered
   */
  protected Expr ex1;

  /**
   * The cached value of the '{@link #getEx2() <em>Ex2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx2()
   * @generated
   * @ordered
   */
  protected Expr ex2;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Commands c;

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
  public Expr getEx1()
  {
    return ex1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx1(Expr newEx1, NotificationChain msgs)
  {
    Expr oldEx1 = ex1;
    ex1 = newEx1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__EX1, oldEx1, newEx1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx1(Expr newEx1)
  {
    if (newEx1 != ex1)
    {
      NotificationChain msgs = null;
      if (ex1 != null)
        msgs = ((InternalEObject)ex1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__EX1, null, msgs);
      if (newEx1 != null)
        msgs = ((InternalEObject)newEx1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__EX1, null, msgs);
      msgs = basicSetEx1(newEx1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__EX1, newEx1, newEx1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getEx2()
  {
    return ex2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx2(Expr newEx2, NotificationChain msgs)
  {
    Expr oldEx2 = ex2;
    ex2 = newEx2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__EX2, oldEx2, newEx2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx2(Expr newEx2)
  {
    if (newEx2 != ex2)
    {
      NotificationChain msgs = null;
      if (ex2 != null)
        msgs = ((InternalEObject)ex2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__EX2, null, msgs);
      if (newEx2 != null)
        msgs = ((InternalEObject)newEx2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__EX2, null, msgs);
      msgs = basicSetEx2(newEx2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__EX2, newEx2, newEx2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Commands newC, NotificationChain msgs)
  {
    Commands oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Commands newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FOREACH__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FOREACH__C, newC, newC));
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
      case Langage_whilePackage.FOREACH__EX1:
        return basicSetEx1(null, msgs);
      case Langage_whilePackage.FOREACH__EX2:
        return basicSetEx2(null, msgs);
      case Langage_whilePackage.FOREACH__C:
        return basicSetC(null, msgs);
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
      case Langage_whilePackage.FOREACH__EX1:
        return getEx1();
      case Langage_whilePackage.FOREACH__EX2:
        return getEx2();
      case Langage_whilePackage.FOREACH__C:
        return getC();
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
      case Langage_whilePackage.FOREACH__EX1:
        setEx1((Expr)newValue);
        return;
      case Langage_whilePackage.FOREACH__EX2:
        setEx2((Expr)newValue);
        return;
      case Langage_whilePackage.FOREACH__C:
        setC((Commands)newValue);
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
      case Langage_whilePackage.FOREACH__EX1:
        setEx1((Expr)null);
        return;
      case Langage_whilePackage.FOREACH__EX2:
        setEx2((Expr)null);
        return;
      case Langage_whilePackage.FOREACH__C:
        setC((Commands)null);
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
      case Langage_whilePackage.FOREACH__EX1:
        return ex1 != null;
      case Langage_whilePackage.FOREACH__EX2:
        return ex2 != null;
      case Langage_whilePackage.FOREACH__C:
        return c != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
