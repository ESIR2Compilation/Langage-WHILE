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
import org.xtext.langage_while.ExprAnd;
import org.xtext.langage_while.ExprSimple;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ExprImpl#getExs <em>Exs</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ExprImpl#getExa <em>Exa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExs() <em>Exs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExs()
   * @generated
   * @ordered
   */
  protected ExprSimple exs;

  /**
   * The cached value of the '{@link #getExa() <em>Exa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExa()
   * @generated
   * @ordered
   */
  protected ExprAnd exa;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return Langage_whilePackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExs()
  {
    return exs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExs(ExprSimple newExs, NotificationChain msgs)
  {
    ExprSimple oldExs = exs;
    exs = newExs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR__EXS, oldExs, newExs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExs(ExprSimple newExs)
  {
    if (newExs != exs)
    {
      NotificationChain msgs = null;
      if (exs != null)
        msgs = ((InternalEObject)exs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR__EXS, null, msgs);
      if (newExs != null)
        msgs = ((InternalEObject)newExs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR__EXS, null, msgs);
      msgs = basicSetExs(newExs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR__EXS, newExs, newExs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd getExa()
  {
    return exa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExa(ExprAnd newExa, NotificationChain msgs)
  {
    ExprAnd oldExa = exa;
    exa = newExa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR__EXA, oldExa, newExa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExa(ExprAnd newExa)
  {
    if (newExa != exa)
    {
      NotificationChain msgs = null;
      if (exa != null)
        msgs = ((InternalEObject)exa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR__EXA, null, msgs);
      if (newExa != null)
        msgs = ((InternalEObject)newExa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.EXPR__EXA, null, msgs);
      msgs = basicSetExa(newExa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.EXPR__EXA, newExa, newExa));
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
      case Langage_whilePackage.EXPR__EXS:
        return basicSetExs(null, msgs);
      case Langage_whilePackage.EXPR__EXA:
        return basicSetExa(null, msgs);
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
      case Langage_whilePackage.EXPR__EXS:
        return getExs();
      case Langage_whilePackage.EXPR__EXA:
        return getExa();
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
      case Langage_whilePackage.EXPR__EXS:
        setExs((ExprSimple)newValue);
        return;
      case Langage_whilePackage.EXPR__EXA:
        setExa((ExprAnd)newValue);
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
      case Langage_whilePackage.EXPR__EXS:
        setExs((ExprSimple)null);
        return;
      case Langage_whilePackage.EXPR__EXA:
        setExa((ExprAnd)null);
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
      case Langage_whilePackage.EXPR__EXS:
        return exs != null;
      case Langage_whilePackage.EXPR__EXA:
        return exa != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
