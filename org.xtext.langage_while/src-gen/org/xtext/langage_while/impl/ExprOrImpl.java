/**
 */
package org.xtext.langage_while.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.langage_while.ExprNot;
import org.xtext.langage_while.ExprOr;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprOrImpl#getExn1 <em>Exn1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprOrImpl#getExn2 <em>Exn2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprOrImpl extends MinimalEObjectImpl.Container implements ExprOr
{
  /**
   * The cached value of the '{@link #getExn1() <em>Exn1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExn1()
   * @generated
   * @ordered
   */
  protected ExprNot exn1;

  /**
   * The cached value of the '{@link #getExn2() <em>Exn2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExn2()
   * @generated
   * @ordered
   */
  protected EList<ExprNot> exn2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprOrImpl()
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
    return Langage_whilePackage.Literals.EXPR_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot getExn1()
  {
    return exn1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExn1(ExprNot newExn1, NotificationChain msgs)
  {
    ExprNot oldExn1 = exn1;
    exn1 = newExn1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_OR__EXN1, oldExn1, newExn1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExn1(ExprNot newExn1)
  {
    if (newExn1 != exn1)
    {
      NotificationChain msgs = null;
      if (exn1 != null)
        msgs = ((InternalEObject)exn1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_OR__EXN1, null, msgs);
      if (newExn1 != null)
        msgs = ((InternalEObject)newExn1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_OR__EXN1, null, msgs);
      msgs = basicSetExn1(newExn1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_OR__EXN1, newExn1, newExn1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprNot> getExn2()
  {
    if (exn2 == null)
    {
      exn2 = new EObjectContainmentEList<ExprNot>(ExprNot.class, this, Langage_whilePackage.EXPR_OR__EXN2);
    }
    return exn2;
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
      case Langage_whilePackage.EXPR_OR__EXN1:
        return basicSetExn1(null, msgs);
      case Langage_whilePackage.EXPR_OR__EXN2:
        return ((InternalEList<?>)getExn2()).basicRemove(otherEnd, msgs);
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
      case Langage_whilePackage.EXPR_OR__EXN1:
        return getExn1();
      case Langage_whilePackage.EXPR_OR__EXN2:
        return getExn2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Langage_whilePackage.EXPR_OR__EXN1:
        setExn1((ExprNot)newValue);
        return;
      case Langage_whilePackage.EXPR_OR__EXN2:
        getExn2().clear();
        getExn2().addAll((Collection<? extends ExprNot>)newValue);
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
      case Langage_whilePackage.EXPR_OR__EXN1:
        setExn1((ExprNot)null);
        return;
      case Langage_whilePackage.EXPR_OR__EXN2:
        getExn2().clear();
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
      case Langage_whilePackage.EXPR_OR__EXN1:
        return exn1 != null;
      case Langage_whilePackage.EXPR_OR__EXN2:
        return exn2 != null && !exn2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprOrImpl
