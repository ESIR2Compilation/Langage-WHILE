/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Expr;
import org.xtext.langage_while.ExprEq;
import org.xtext.langage_while.ExprSimple;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprEqImpl#getExS1 <em>Ex S1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprEqImpl#getExS2 <em>Ex S2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprEqImpl#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExS1() <em>Ex S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExS1()
   * @generated
   * @ordered
   */
  protected ExprSimple exS1;

  /**
   * The cached value of the '{@link #getExS2() <em>Ex S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExS2()
   * @generated
   * @ordered
   */
  protected ExprSimple exS2;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected Expr ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprEqImpl()
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
    return Langage_whilePackage.Literals.EXPR_EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExS1()
  {
    return exS1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExS1(ExprSimple newExS1, NotificationChain msgs)
  {
    ExprSimple oldExS1 = exS1;
    exS1 = newExS1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX_S1, oldExS1, newExS1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExS1(ExprSimple newExS1)
  {
    if (newExS1 != exS1)
    {
      NotificationChain msgs = null;
      if (exS1 != null)
        msgs = ((InternalEObject)exS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX_S1, null, msgs);
      if (newExS1 != null)
        msgs = ((InternalEObject)newExS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX_S1, null, msgs);
      msgs = basicSetExS1(newExS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX_S1, newExS1, newExS1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExS2()
  {
    return exS2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExS2(ExprSimple newExS2, NotificationChain msgs)
  {
    ExprSimple oldExS2 = exS2;
    exS2 = newExS2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX_S2, oldExS2, newExS2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExS2(ExprSimple newExS2)
  {
    if (newExS2 != exS2)
    {
      NotificationChain msgs = null;
      if (exS2 != null)
        msgs = ((InternalEObject)exS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX_S2, null, msgs);
      if (newExS2 != null)
        msgs = ((InternalEObject)newExS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX_S2, null, msgs);
      msgs = basicSetExS2(newExS2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX_S2, newExS2, newExS2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(Expr newEx, NotificationChain msgs)
  {
    Expr oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(Expr newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_EQ__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_EQ__EX, newEx, newEx));
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
      case Langage_whilePackage.EXPR_EQ__EX_S1:
        return basicSetExS1(null, msgs);
      case Langage_whilePackage.EXPR_EQ__EX_S2:
        return basicSetExS2(null, msgs);
      case Langage_whilePackage.EXPR_EQ__EX:
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
      case Langage_whilePackage.EXPR_EQ__EX_S1:
        return getExS1();
      case Langage_whilePackage.EXPR_EQ__EX_S2:
        return getExS2();
      case Langage_whilePackage.EXPR_EQ__EX:
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
      case Langage_whilePackage.EXPR_EQ__EX_S1:
        setExS1((ExprSimple)newValue);
        return;
      case Langage_whilePackage.EXPR_EQ__EX_S2:
        setExS2((ExprSimple)newValue);
        return;
      case Langage_whilePackage.EXPR_EQ__EX:
        setEx((Expr)newValue);
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
      case Langage_whilePackage.EXPR_EQ__EX_S1:
        setExS1((ExprSimple)null);
        return;
      case Langage_whilePackage.EXPR_EQ__EX_S2:
        setExS2((ExprSimple)null);
        return;
      case Langage_whilePackage.EXPR_EQ__EX:
        setEx((Expr)null);
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
      case Langage_whilePackage.EXPR_EQ__EX_S1:
        return exS1 != null;
      case Langage_whilePackage.EXPR_EQ__EX_S2:
        return exS2 != null;
      case Langage_whilePackage.EXPR_EQ__EX:
        return ex != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl
