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
import org.xtext.langage_while.If;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getCe <em>Ce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If
{
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
   * The cached value of the '{@link #getCt() <em>Ct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCt()
   * @generated
   * @ordered
   */
  protected Commands ct;

  /**
   * The cached value of the '{@link #getCe() <em>Ce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCe()
   * @generated
   * @ordered
   */
  protected Commands ce;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
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
    return Langage_whilePackage.Literals.IF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__EX, oldEx, newEx);
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
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__EX, newEx, newEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCt()
  {
    return ct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCt(Commands newCt, NotificationChain msgs)
  {
    Commands oldCt = ct;
    ct = newCt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__CT, oldCt, newCt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCt(Commands newCt)
  {
    if (newCt != ct)
    {
      NotificationChain msgs = null;
      if (ct != null)
        msgs = ((InternalEObject)ct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__CT, null, msgs);
      if (newCt != null)
        msgs = ((InternalEObject)newCt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__CT, null, msgs);
      msgs = basicSetCt(newCt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__CT, newCt, newCt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCe()
  {
    return ce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCe(Commands newCe, NotificationChain msgs)
  {
    Commands oldCe = ce;
    ce = newCe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__CE, oldCe, newCe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCe(Commands newCe)
  {
    if (newCe != ce)
    {
      NotificationChain msgs = null;
      if (ce != null)
        msgs = ((InternalEObject)ce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__CE, null, msgs);
      if (newCe != null)
        msgs = ((InternalEObject)newCe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__CE, null, msgs);
      msgs = basicSetCe(newCe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__CE, newCe, newCe));
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
      case Langage_whilePackage.IF__EX:
        return basicSetEx(null, msgs);
      case Langage_whilePackage.IF__CT:
        return basicSetCt(null, msgs);
      case Langage_whilePackage.IF__CE:
        return basicSetCe(null, msgs);
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
      case Langage_whilePackage.IF__EX:
        return getEx();
      case Langage_whilePackage.IF__CT:
        return getCt();
      case Langage_whilePackage.IF__CE:
        return getCe();
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
      case Langage_whilePackage.IF__EX:
        setEx((Expr)newValue);
        return;
      case Langage_whilePackage.IF__CT:
        setCt((Commands)newValue);
        return;
      case Langage_whilePackage.IF__CE:
        setCe((Commands)newValue);
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
      case Langage_whilePackage.IF__EX:
        setEx((Expr)null);
        return;
      case Langage_whilePackage.IF__CT:
        setCt((Commands)null);
        return;
      case Langage_whilePackage.IF__CE:
        setCe((Commands)null);
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
      case Langage_whilePackage.IF__EX:
        return ex != null;
      case Langage_whilePackage.IF__CT:
        return ct != null;
      case Langage_whilePackage.IF__CE:
        return ce != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
