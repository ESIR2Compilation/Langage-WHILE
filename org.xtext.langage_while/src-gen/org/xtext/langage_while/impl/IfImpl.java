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
import org.xtext.langage_while.If;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getMm <em>Mm</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getJj <em>Jj</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getKk <em>Kk</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getHg <em>Hg</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getGg <em>Gg</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getFf <em>Ff</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getO <em>O</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.IfImpl#getDd <em>Dd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If
{
  /**
   * The cached value of the '{@link #getMm() <em>Mm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMm()
   * @generated
   * @ordered
   */
  protected LCs mm;

  /**
   * The cached value of the '{@link #getJj() <em>Jj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJj()
   * @generated
   * @ordered
   */
  protected EXPR jj;

  /**
   * The cached value of the '{@link #getKk() <em>Kk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKk()
   * @generated
   * @ordered
   */
  protected LCs kk;

  /**
   * The cached value of the '{@link #getHg() <em>Hg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHg()
   * @generated
   * @ordered
   */
  protected LCs hg;

  /**
   * The cached value of the '{@link #getC2() <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC2()
   * @generated
   * @ordered
   */
  protected Commands c2;

  /**
   * The cached value of the '{@link #getGg() <em>Gg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGg()
   * @generated
   * @ordered
   */
  protected LCs gg;

  /**
   * The cached value of the '{@link #getFf() <em>Ff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFf()
   * @generated
   * @ordered
   */
  protected LCs ff;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected Commands o;

  /**
   * The cached value of the '{@link #getDd() <em>Dd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDd()
   * @generated
   * @ordered
   */
  protected LCs dd;

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
  public LCs getMm()
  {
    return mm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMm(LCs newMm, NotificationChain msgs)
  {
    LCs oldMm = mm;
    mm = newMm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__MM, oldMm, newMm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMm(LCs newMm)
  {
    if (newMm != mm)
    {
      NotificationChain msgs = null;
      if (mm != null)
        msgs = ((InternalEObject)mm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__MM, null, msgs);
      if (newMm != null)
        msgs = ((InternalEObject)newMm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__MM, null, msgs);
      msgs = basicSetMm(newMm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__MM, newMm, newMm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getJj()
  {
    return jj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJj(EXPR newJj, NotificationChain msgs)
  {
    EXPR oldJj = jj;
    jj = newJj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__JJ, oldJj, newJj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJj(EXPR newJj)
  {
    if (newJj != jj)
    {
      NotificationChain msgs = null;
      if (jj != null)
        msgs = ((InternalEObject)jj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__JJ, null, msgs);
      if (newJj != null)
        msgs = ((InternalEObject)newJj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__JJ, null, msgs);
      msgs = basicSetJj(newJj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__JJ, newJj, newJj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getKk()
  {
    return kk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKk(LCs newKk, NotificationChain msgs)
  {
    LCs oldKk = kk;
    kk = newKk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__KK, oldKk, newKk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKk(LCs newKk)
  {
    if (newKk != kk)
    {
      NotificationChain msgs = null;
      if (kk != null)
        msgs = ((InternalEObject)kk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__KK, null, msgs);
      if (newKk != null)
        msgs = ((InternalEObject)newKk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__KK, null, msgs);
      msgs = basicSetKk(newKk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__KK, newKk, newKk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getHg()
  {
    return hg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHg(LCs newHg, NotificationChain msgs)
  {
    LCs oldHg = hg;
    hg = newHg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__HG, oldHg, newHg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHg(LCs newHg)
  {
    if (newHg != hg)
    {
      NotificationChain msgs = null;
      if (hg != null)
        msgs = ((InternalEObject)hg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__HG, null, msgs);
      if (newHg != null)
        msgs = ((InternalEObject)newHg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__HG, null, msgs);
      msgs = basicSetHg(newHg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__HG, newHg, newHg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC2()
  {
    return c2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC2(Commands newC2, NotificationChain msgs)
  {
    Commands oldC2 = c2;
    c2 = newC2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__C2, oldC2, newC2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC2(Commands newC2)
  {
    if (newC2 != c2)
    {
      NotificationChain msgs = null;
      if (c2 != null)
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__C2, newC2, newC2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getGg()
  {
    return gg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGg(LCs newGg, NotificationChain msgs)
  {
    LCs oldGg = gg;
    gg = newGg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__GG, oldGg, newGg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGg(LCs newGg)
  {
    if (newGg != gg)
    {
      NotificationChain msgs = null;
      if (gg != null)
        msgs = ((InternalEObject)gg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__GG, null, msgs);
      if (newGg != null)
        msgs = ((InternalEObject)newGg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__GG, null, msgs);
      msgs = basicSetGg(newGg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__GG, newGg, newGg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getFf()
  {
    return ff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFf(LCs newFf, NotificationChain msgs)
  {
    LCs oldFf = ff;
    ff = newFf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__FF, oldFf, newFf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFf(LCs newFf)
  {
    if (newFf != ff)
    {
      NotificationChain msgs = null;
      if (ff != null)
        msgs = ((InternalEObject)ff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__FF, null, msgs);
      if (newFf != null)
        msgs = ((InternalEObject)newFf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__FF, null, msgs);
      msgs = basicSetFf(newFf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__FF, newFf, newFf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(Commands newO, NotificationChain msgs)
  {
    Commands oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(Commands newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__O, newO, newO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getDd()
  {
    return dd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDd(LCs newDd, NotificationChain msgs)
  {
    LCs oldDd = dd;
    dd = newDd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__DD, oldDd, newDd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDd(LCs newDd)
  {
    if (newDd != dd)
    {
      NotificationChain msgs = null;
      if (dd != null)
        msgs = ((InternalEObject)dd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__DD, null, msgs);
      if (newDd != null)
        msgs = ((InternalEObject)newDd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.IF__DD, null, msgs);
      msgs = basicSetDd(newDd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.IF__DD, newDd, newDd));
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
      case Langage_whilePackage.IF__MM:
        return basicSetMm(null, msgs);
      case Langage_whilePackage.IF__JJ:
        return basicSetJj(null, msgs);
      case Langage_whilePackage.IF__KK:
        return basicSetKk(null, msgs);
      case Langage_whilePackage.IF__HG:
        return basicSetHg(null, msgs);
      case Langage_whilePackage.IF__C2:
        return basicSetC2(null, msgs);
      case Langage_whilePackage.IF__GG:
        return basicSetGg(null, msgs);
      case Langage_whilePackage.IF__FF:
        return basicSetFf(null, msgs);
      case Langage_whilePackage.IF__O:
        return basicSetO(null, msgs);
      case Langage_whilePackage.IF__DD:
        return basicSetDd(null, msgs);
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
      case Langage_whilePackage.IF__MM:
        return getMm();
      case Langage_whilePackage.IF__JJ:
        return getJj();
      case Langage_whilePackage.IF__KK:
        return getKk();
      case Langage_whilePackage.IF__HG:
        return getHg();
      case Langage_whilePackage.IF__C2:
        return getC2();
      case Langage_whilePackage.IF__GG:
        return getGg();
      case Langage_whilePackage.IF__FF:
        return getFf();
      case Langage_whilePackage.IF__O:
        return getO();
      case Langage_whilePackage.IF__DD:
        return getDd();
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
      case Langage_whilePackage.IF__MM:
        setMm((LCs)newValue);
        return;
      case Langage_whilePackage.IF__JJ:
        setJj((EXPR)newValue);
        return;
      case Langage_whilePackage.IF__KK:
        setKk((LCs)newValue);
        return;
      case Langage_whilePackage.IF__HG:
        setHg((LCs)newValue);
        return;
      case Langage_whilePackage.IF__C2:
        setC2((Commands)newValue);
        return;
      case Langage_whilePackage.IF__GG:
        setGg((LCs)newValue);
        return;
      case Langage_whilePackage.IF__FF:
        setFf((LCs)newValue);
        return;
      case Langage_whilePackage.IF__O:
        setO((Commands)newValue);
        return;
      case Langage_whilePackage.IF__DD:
        setDd((LCs)newValue);
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
      case Langage_whilePackage.IF__MM:
        setMm((LCs)null);
        return;
      case Langage_whilePackage.IF__JJ:
        setJj((EXPR)null);
        return;
      case Langage_whilePackage.IF__KK:
        setKk((LCs)null);
        return;
      case Langage_whilePackage.IF__HG:
        setHg((LCs)null);
        return;
      case Langage_whilePackage.IF__C2:
        setC2((Commands)null);
        return;
      case Langage_whilePackage.IF__GG:
        setGg((LCs)null);
        return;
      case Langage_whilePackage.IF__FF:
        setFf((LCs)null);
        return;
      case Langage_whilePackage.IF__O:
        setO((Commands)null);
        return;
      case Langage_whilePackage.IF__DD:
        setDd((LCs)null);
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
      case Langage_whilePackage.IF__MM:
        return mm != null;
      case Langage_whilePackage.IF__JJ:
        return jj != null;
      case Langage_whilePackage.IF__KK:
        return kk != null;
      case Langage_whilePackage.IF__HG:
        return hg != null;
      case Langage_whilePackage.IF__C2:
        return c2 != null;
      case Langage_whilePackage.IF__GG:
        return gg != null;
      case Langage_whilePackage.IF__FF:
        return ff != null;
      case Langage_whilePackage.IF__O:
        return o != null;
      case Langage_whilePackage.IF__DD:
        return dd != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
