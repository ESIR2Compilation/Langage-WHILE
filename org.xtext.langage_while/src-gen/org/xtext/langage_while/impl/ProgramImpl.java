/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Function;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.ProgramImpl#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.ProgramImpl#getPp <em>Pp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected Function f;

  /**
   * The cached value of the '{@link #getPp() <em>Pp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPp()
   * @generated
   * @ordered
   */
  protected Program pp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return Langage_whilePackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(Function newF, NotificationChain msgs)
  {
    Function oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.PROGRAM__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(Function newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.PROGRAM__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.PROGRAM__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.PROGRAM__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getPp()
  {
    return pp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPp(Program newPp, NotificationChain msgs)
  {
    Program oldPp = pp;
    pp = newPp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.PROGRAM__PP, oldPp, newPp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPp(Program newPp)
  {
    if (newPp != pp)
    {
      NotificationChain msgs = null;
      if (pp != null)
        msgs = ((InternalEObject)pp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.PROGRAM__PP, null, msgs);
      if (newPp != null)
        msgs = ((InternalEObject)newPp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.PROGRAM__PP, null, msgs);
      msgs = basicSetPp(newPp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.PROGRAM__PP, newPp, newPp));
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
      case Langage_whilePackage.PROGRAM__F:
        return basicSetF(null, msgs);
      case Langage_whilePackage.PROGRAM__PP:
        return basicSetPp(null, msgs);
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
      case Langage_whilePackage.PROGRAM__F:
        return getF();
      case Langage_whilePackage.PROGRAM__PP:
        return getPp();
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
      case Langage_whilePackage.PROGRAM__F:
        setF((Function)newValue);
        return;
      case Langage_whilePackage.PROGRAM__PP:
        setPp((Program)newValue);
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
      case Langage_whilePackage.PROGRAM__F:
        setF((Function)null);
        return;
      case Langage_whilePackage.PROGRAM__PP:
        setPp((Program)null);
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
      case Langage_whilePackage.PROGRAM__F:
        return f != null;
      case Langage_whilePackage.PROGRAM__PP:
        return pp != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
