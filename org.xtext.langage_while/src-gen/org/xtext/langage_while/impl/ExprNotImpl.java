/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.ExprEq;
import org.xtext.langage_while.ExprNot;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprNotImpl#getExQ1 <em>Ex Q1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprNotImpl#getExQ2 <em>Ex Q2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprNotImpl extends MinimalEObjectImpl.Container implements ExprNot
{
  /**
   * The cached value of the '{@link #getExQ1() <em>Ex Q1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExQ1()
   * @generated
   * @ordered
   */
  protected ExprEq exQ1;

  /**
   * The cached value of the '{@link #getExQ2() <em>Ex Q2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExQ2()
   * @generated
   * @ordered
   */
  protected ExprEq exQ2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotImpl()
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
    return Langage_whilePackage.Literals.EXPR_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq getExQ1()
  {
    return exQ1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExQ1(ExprEq newExQ1, NotificationChain msgs)
  {
    ExprEq oldExQ1 = exQ1;
    exQ1 = newExQ1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_NOT__EX_Q1, oldExQ1, newExQ1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExQ1(ExprEq newExQ1)
  {
    if (newExQ1 != exQ1)
    {
      NotificationChain msgs = null;
      if (exQ1 != null)
        msgs = ((InternalEObject)exQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_NOT__EX_Q1, null, msgs);
      if (newExQ1 != null)
        msgs = ((InternalEObject)newExQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_NOT__EX_Q1, null, msgs);
      msgs = basicSetExQ1(newExQ1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_NOT__EX_Q1, newExQ1, newExQ1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq getExQ2()
  {
    return exQ2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExQ2(ExprEq newExQ2, NotificationChain msgs)
  {
    ExprEq oldExQ2 = exQ2;
    exQ2 = newExQ2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_NOT__EX_Q2, oldExQ2, newExQ2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExQ2(ExprEq newExQ2)
  {
    if (newExQ2 != exQ2)
    {
      NotificationChain msgs = null;
      if (exQ2 != null)
        msgs = ((InternalEObject)exQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_NOT__EX_Q2, null, msgs);
      if (newExQ2 != null)
        msgs = ((InternalEObject)newExQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_NOT__EX_Q2, null, msgs);
      msgs = basicSetExQ2(newExQ2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_NOT__EX_Q2, newExQ2, newExQ2));
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
      case Langage_whilePackage.EXPR_NOT__EX_Q1:
        return basicSetExQ1(null, msgs);
      case Langage_whilePackage.EXPR_NOT__EX_Q2:
        return basicSetExQ2(null, msgs);
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
      case Langage_whilePackage.EXPR_NOT__EX_Q1:
        return getExQ1();
      case Langage_whilePackage.EXPR_NOT__EX_Q2:
        return getExQ2();
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
      case Langage_whilePackage.EXPR_NOT__EX_Q1:
        setExQ1((ExprEq)newValue);
        return;
      case Langage_whilePackage.EXPR_NOT__EX_Q2:
        setExQ2((ExprEq)newValue);
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
      case Langage_whilePackage.EXPR_NOT__EX_Q1:
        setExQ1((ExprEq)null);
        return;
      case Langage_whilePackage.EXPR_NOT__EX_Q2:
        setExQ2((ExprEq)null);
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
      case Langage_whilePackage.EXPR_NOT__EX_Q1:
        return exQ1 != null;
      case Langage_whilePackage.EXPR_NOT__EX_Q2:
        return exQ2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotImpl
