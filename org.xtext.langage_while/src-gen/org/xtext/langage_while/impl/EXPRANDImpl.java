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

import org.xtext.langage_while.ExprAnd;
import org.xtext.langage_while.ExprOr;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprAndImpl#getExo1 <em>Exo1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprAndImpl#getExo2 <em>Exo2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprAndImpl extends MinimalEObjectImpl.Container implements ExprAnd
{
  /**
   * The cached value of the '{@link #getExo1() <em>Exo1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExo1()
   * @generated
   * @ordered
   */
  protected ExprOr exo1;

  /**
   * The cached value of the '{@link #getExo2() <em>Exo2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExo2()
   * @generated
   * @ordered
   */
  protected EList<ExprOr> exo2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprAndImpl()
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
    return Langage_whilePackage.Literals.EXPR_AND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr getExo1()
  {
    return exo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExo1(ExprOr newExo1, NotificationChain msgs)
  {
    ExprOr oldExo1 = exo1;
    exo1 = newExo1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_AND__EXO1, oldExo1, newExo1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExo1(ExprOr newExo1)
  {
    if (newExo1 != exo1)
    {
      NotificationChain msgs = null;
      if (exo1 != null)
        msgs = ((InternalEObject)exo1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_AND__EXO1, null, msgs);
      if (newExo1 != null)
        msgs = ((InternalEObject)newExo1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR_AND__EXO1, null, msgs);
      msgs = basicSetExo1(newExo1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR_AND__EXO1, newExo1, newExo1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprOr> getExo2()
  {
    if (exo2 == null)
    {
      exo2 = new EObjectContainmentEList<ExprOr>(ExprOr.class, this, Langage_whilePackage.EXPR_AND__EXO2);
    }
    return exo2;
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
      case Langage_whilePackage.EXPR_AND__EXO1:
        return basicSetExo1(null, msgs);
      case Langage_whilePackage.EXPR_AND__EXO2:
        return ((InternalEList<?>)getExo2()).basicRemove(otherEnd, msgs);
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
      case Langage_whilePackage.EXPR_AND__EXO1:
        return getExo1();
      case Langage_whilePackage.EXPR_AND__EXO2:
        return getExo2();
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
      case Langage_whilePackage.EXPR_AND__EXO1:
        setExo1((ExprOr)newValue);
        return;
      case Langage_whilePackage.EXPR_AND__EXO2:
        getExo2().clear();
        getExo2().addAll((Collection<? extends ExprOr>)newValue);
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
      case Langage_whilePackage.EXPR_AND__EXO1:
        setExo1((ExprOr)null);
        return;
      case Langage_whilePackage.EXPR_AND__EXO2:
        getExo2().clear();
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
      case Langage_whilePackage.EXPR_AND__EXO1:
        return exo1 != null;
      case Langage_whilePackage.EXPR_AND__EXO2:
        return exo2 != null && !exo2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprAndImpl
