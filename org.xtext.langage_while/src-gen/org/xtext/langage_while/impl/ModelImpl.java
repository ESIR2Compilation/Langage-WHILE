/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Model;
import org.xtext.langage_while.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ModelImpl#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGreetings() <em>Greetings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetings()
   * @generated
   * @ordered
   */
  protected Program greetings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return Langage_whilePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getGreetings()
  {
    return greetings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGreetings(Program newGreetings, NotificationChain msgs)
  {
    Program oldGreetings = greetings;
    greetings = newGreetings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.MODEL__GREETINGS, oldGreetings, newGreetings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreetings(Program newGreetings)
  {
    if (newGreetings != greetings)
    {
      NotificationChain msgs = null;
      if (greetings != null)
        msgs = ((InternalEObject)greetings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.MODEL__GREETINGS, null, msgs);
      if (newGreetings != null)
        msgs = ((InternalEObject)newGreetings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.MODEL__GREETINGS, null, msgs);
      msgs = basicSetGreetings(newGreetings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.MODEL__GREETINGS, newGreetings, newGreetings));
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
      case Langage_whilePackage.MODEL__GREETINGS:
        return basicSetGreetings(null, msgs);
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
      case Langage_whilePackage.MODEL__GREETINGS:
        return getGreetings();
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
      case Langage_whilePackage.MODEL__GREETINGS:
        setGreetings((Program)newValue);
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
      case Langage_whilePackage.MODEL__GREETINGS:
        setGreetings((Program)null);
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
      case Langage_whilePackage.MODEL__GREETINGS:
        return greetings != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
