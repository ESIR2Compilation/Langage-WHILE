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
import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getLl <em>Ll</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getEe <em>Ee</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getK <em>K</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.WhileImpl#getLc <em>Lc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileImpl extends MinimalEObjectImpl.Container implements While
{
  /**
   * The cached value of the '{@link #getLl() <em>Ll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLl()
   * @generated
   * @ordered
   */
  protected LCs ll;

  /**
   * The cached value of the '{@link #getEe() <em>Ee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEe()
   * @generated
   * @ordered
   */
  protected EXPR ee;

  /**
   * The cached value of the '{@link #getCc() <em>Cc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCc()
   * @generated
   * @ordered
   */
  protected LCs cc;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected LCs z;

  /**
   * The cached value of the '{@link #getK() <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK()
   * @generated
   * @ordered
   */
  protected Commands k;

  /**
   * The cached value of the '{@link #getLc() <em>Lc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc()
   * @generated
   * @ordered
   */
  protected LCs lc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileImpl()
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
    return Langage_whilePackage.Literals.WHILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLl()
  {
    return ll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLl(LCs newLl, NotificationChain msgs)
  {
    LCs oldLl = ll;
    ll = newLl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__LL, oldLl, newLl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLl(LCs newLl)
  {
    if (newLl != ll)
    {
      NotificationChain msgs = null;
      if (ll != null)
        msgs = ((InternalEObject)ll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__LL, null, msgs);
      if (newLl != null)
        msgs = ((InternalEObject)newLl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__LL, null, msgs);
      msgs = basicSetLl(newLl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__LL, newLl, newLl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getEe()
  {
    return ee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEe(EXPR newEe, NotificationChain msgs)
  {
    EXPR oldEe = ee;
    ee = newEe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__EE, oldEe, newEe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEe(EXPR newEe)
  {
    if (newEe != ee)
    {
      NotificationChain msgs = null;
      if (ee != null)
        msgs = ((InternalEObject)ee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__EE, null, msgs);
      if (newEe != null)
        msgs = ((InternalEObject)newEe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__EE, null, msgs);
      msgs = basicSetEe(newEe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__EE, newEe, newEe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getCc()
  {
    return cc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCc(LCs newCc, NotificationChain msgs)
  {
    LCs oldCc = cc;
    cc = newCc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__CC, oldCc, newCc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCc(LCs newCc)
  {
    if (newCc != cc)
    {
      NotificationChain msgs = null;
      if (cc != null)
        msgs = ((InternalEObject)cc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__CC, null, msgs);
      if (newCc != null)
        msgs = ((InternalEObject)newCc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__CC, null, msgs);
      msgs = basicSetCc(newCc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__CC, newCc, newCc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZ(LCs newZ, NotificationChain msgs)
  {
    LCs oldZ = z;
    z = newZ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__Z, oldZ, newZ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(LCs newZ)
  {
    if (newZ != z)
    {
      NotificationChain msgs = null;
      if (z != null)
        msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__Z, null, msgs);
      if (newZ != null)
        msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__Z, null, msgs);
      msgs = basicSetZ(newZ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__Z, newZ, newZ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getK()
  {
    return k;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetK(Commands newK, NotificationChain msgs)
  {
    Commands oldK = k;
    k = newK;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__K, oldK, newK);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setK(Commands newK)
  {
    if (newK != k)
    {
      NotificationChain msgs = null;
      if (k != null)
        msgs = ((InternalEObject)k).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__K, null, msgs);
      if (newK != null)
        msgs = ((InternalEObject)newK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__K, null, msgs);
      msgs = basicSetK(newK, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__K, newK, newK));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc()
  {
    return lc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc(LCs newLc, NotificationChain msgs)
  {
    LCs oldLc = lc;
    lc = newLc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__LC, oldLc, newLc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc(LCs newLc)
  {
    if (newLc != lc)
    {
      NotificationChain msgs = null;
      if (lc != null)
        msgs = ((InternalEObject)lc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__LC, null, msgs);
      if (newLc != null)
        msgs = ((InternalEObject)newLc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.WHILE__LC, null, msgs);
      msgs = basicSetLc(newLc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.WHILE__LC, newLc, newLc));
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
      case Langage_whilePackage.WHILE__LL:
        return basicSetLl(null, msgs);
      case Langage_whilePackage.WHILE__EE:
        return basicSetEe(null, msgs);
      case Langage_whilePackage.WHILE__CC:
        return basicSetCc(null, msgs);
      case Langage_whilePackage.WHILE__Z:
        return basicSetZ(null, msgs);
      case Langage_whilePackage.WHILE__K:
        return basicSetK(null, msgs);
      case Langage_whilePackage.WHILE__LC:
        return basicSetLc(null, msgs);
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
      case Langage_whilePackage.WHILE__LL:
        return getLl();
      case Langage_whilePackage.WHILE__EE:
        return getEe();
      case Langage_whilePackage.WHILE__CC:
        return getCc();
      case Langage_whilePackage.WHILE__Z:
        return getZ();
      case Langage_whilePackage.WHILE__K:
        return getK();
      case Langage_whilePackage.WHILE__LC:
        return getLc();
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
      case Langage_whilePackage.WHILE__LL:
        setLl((LCs)newValue);
        return;
      case Langage_whilePackage.WHILE__EE:
        setEe((EXPR)newValue);
        return;
      case Langage_whilePackage.WHILE__CC:
        setCc((LCs)newValue);
        return;
      case Langage_whilePackage.WHILE__Z:
        setZ((LCs)newValue);
        return;
      case Langage_whilePackage.WHILE__K:
        setK((Commands)newValue);
        return;
      case Langage_whilePackage.WHILE__LC:
        setLc((LCs)newValue);
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
      case Langage_whilePackage.WHILE__LL:
        setLl((LCs)null);
        return;
      case Langage_whilePackage.WHILE__EE:
        setEe((EXPR)null);
        return;
      case Langage_whilePackage.WHILE__CC:
        setCc((LCs)null);
        return;
      case Langage_whilePackage.WHILE__Z:
        setZ((LCs)null);
        return;
      case Langage_whilePackage.WHILE__K:
        setK((Commands)null);
        return;
      case Langage_whilePackage.WHILE__LC:
        setLc((LCs)null);
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
      case Langage_whilePackage.WHILE__LL:
        return ll != null;
      case Langage_whilePackage.WHILE__EE:
        return ee != null;
      case Langage_whilePackage.WHILE__CC:
        return cc != null;
      case Langage_whilePackage.WHILE__Z:
        return z != null;
      case Langage_whilePackage.WHILE__K:
        return k != null;
      case Langage_whilePackage.WHILE__LC:
        return lc != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileImpl
