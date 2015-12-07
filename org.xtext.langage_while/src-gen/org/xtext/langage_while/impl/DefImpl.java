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
import org.xtext.langage_while.Def;
import org.xtext.langage_while.Input;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getS <em>S</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getU <em>U</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.DefImpl#getO <em>O</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefImpl extends MinimalEObjectImpl.Container implements Def
{
  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected LCs l;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected Input in;

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
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Commands v;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected LCs s;

  /**
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected LCs u;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected Output o;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefImpl()
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
    return Langage_whilePackage.Literals.DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(LCs newL, NotificationChain msgs)
  {
    LCs oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(LCs newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn(Input newIn, NotificationChain msgs)
  {
    Input oldIn = in;
    in = newIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__IN, oldIn, newIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(Input newIn)
  {
    if (newIn != in)
    {
      NotificationChain msgs = null;
      if (in != null)
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__IN, newIn, newIn));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__Z, oldZ, newZ);
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
        msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__Z, null, msgs);
      if (newZ != null)
        msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__Z, null, msgs);
      msgs = basicSetZ(newZ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__Z, newZ, newZ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Commands newV, NotificationChain msgs)
  {
    Commands oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Commands newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(LCs newS, NotificationChain msgs)
  {
    LCs oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(LCs newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(LCs newU, NotificationChain msgs)
  {
    LCs oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(LCs newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__U, newU, newU));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(Output newO, NotificationChain msgs)
  {
    Output oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(Output newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.DEF__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.DEF__O, newO, newO));
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
      case Langage_whilePackage.DEF__L:
        return basicSetL(null, msgs);
      case Langage_whilePackage.DEF__IN:
        return basicSetIn(null, msgs);
      case Langage_whilePackage.DEF__Z:
        return basicSetZ(null, msgs);
      case Langage_whilePackage.DEF__V:
        return basicSetV(null, msgs);
      case Langage_whilePackage.DEF__S:
        return basicSetS(null, msgs);
      case Langage_whilePackage.DEF__U:
        return basicSetU(null, msgs);
      case Langage_whilePackage.DEF__O:
        return basicSetO(null, msgs);
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
      case Langage_whilePackage.DEF__L:
        return getL();
      case Langage_whilePackage.DEF__IN:
        return getIn();
      case Langage_whilePackage.DEF__Z:
        return getZ();
      case Langage_whilePackage.DEF__V:
        return getV();
      case Langage_whilePackage.DEF__S:
        return getS();
      case Langage_whilePackage.DEF__U:
        return getU();
      case Langage_whilePackage.DEF__O:
        return getO();
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
      case Langage_whilePackage.DEF__L:
        setL((LCs)newValue);
        return;
      case Langage_whilePackage.DEF__IN:
        setIn((Input)newValue);
        return;
      case Langage_whilePackage.DEF__Z:
        setZ((LCs)newValue);
        return;
      case Langage_whilePackage.DEF__V:
        setV((Commands)newValue);
        return;
      case Langage_whilePackage.DEF__S:
        setS((LCs)newValue);
        return;
      case Langage_whilePackage.DEF__U:
        setU((LCs)newValue);
        return;
      case Langage_whilePackage.DEF__O:
        setO((Output)newValue);
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
      case Langage_whilePackage.DEF__L:
        setL((LCs)null);
        return;
      case Langage_whilePackage.DEF__IN:
        setIn((Input)null);
        return;
      case Langage_whilePackage.DEF__Z:
        setZ((LCs)null);
        return;
      case Langage_whilePackage.DEF__V:
        setV((Commands)null);
        return;
      case Langage_whilePackage.DEF__S:
        setS((LCs)null);
        return;
      case Langage_whilePackage.DEF__U:
        setU((LCs)null);
        return;
      case Langage_whilePackage.DEF__O:
        setO((Output)null);
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
      case Langage_whilePackage.DEF__L:
        return l != null;
      case Langage_whilePackage.DEF__IN:
        return in != null;
      case Langage_whilePackage.DEF__Z:
        return z != null;
      case Langage_whilePackage.DEF__V:
        return v != null;
      case Langage_whilePackage.DEF__S:
        return s != null;
      case Langage_whilePackage.DEF__U:
        return u != null;
      case Langage_whilePackage.DEF__O:
        return o != null;
    }
    return super.eIsSet(featureID);
  }

} //DefImpl
