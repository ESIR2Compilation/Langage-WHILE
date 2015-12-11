/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Assign;
import org.xtext.langage_while.Command;
import org.xtext.langage_while.For;
import org.xtext.langage_while.Foreach;
import org.xtext.langage_while.If;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getAffect <em>Affect</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getWh <em>Wh</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getForr <em>Forr</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getFore <em>Fore</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getIff <em>Iff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The default value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected static final String NOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected String nop = NOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAffect() <em>Affect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffect()
   * @generated
   * @ordered
   */
  protected Assign affect;

  /**
   * The cached value of the '{@link #getWh() <em>Wh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWh()
   * @generated
   * @ordered
   */
  protected While wh;

  /**
   * The cached value of the '{@link #getForr() <em>Forr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForr()
   * @generated
   * @ordered
   */
  protected For forr;

  /**
   * The cached value of the '{@link #getFore() <em>Fore</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFore()
   * @generated
   * @ordered
   */
  protected Foreach fore;

  /**
   * The cached value of the '{@link #getIff() <em>Iff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIff()
   * @generated
   * @ordered
   */
  protected If iff;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return Langage_whilePackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNop()
  {
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNop(String newNop)
  {
    String oldNop = nop;
    nop = newNop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__NOP, oldNop, nop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign getAffect()
  {
    return affect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAffect(Assign newAffect, NotificationChain msgs)
  {
    Assign oldAffect = affect;
    affect = newAffect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__AFFECT, oldAffect, newAffect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAffect(Assign newAffect)
  {
    if (newAffect != affect)
    {
      NotificationChain msgs = null;
      if (affect != null)
        msgs = ((InternalEObject)affect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__AFFECT, null, msgs);
      if (newAffect != null)
        msgs = ((InternalEObject)newAffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__AFFECT, null, msgs);
      msgs = basicSetAffect(newAffect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__AFFECT, newAffect, newAffect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While getWh()
  {
    return wh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWh(While newWh, NotificationChain msgs)
  {
    While oldWh = wh;
    wh = newWh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__WH, oldWh, newWh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWh(While newWh)
  {
    if (newWh != wh)
    {
      NotificationChain msgs = null;
      if (wh != null)
        msgs = ((InternalEObject)wh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__WH, null, msgs);
      if (newWh != null)
        msgs = ((InternalEObject)newWh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__WH, null, msgs);
      msgs = basicSetWh(newWh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__WH, newWh, newWh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For getForr()
  {
    return forr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForr(For newForr, NotificationChain msgs)
  {
    For oldForr = forr;
    forr = newForr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FORR, oldForr, newForr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForr(For newForr)
  {
    if (newForr != forr)
    {
      NotificationChain msgs = null;
      if (forr != null)
        msgs = ((InternalEObject)forr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FORR, null, msgs);
      if (newForr != null)
        msgs = ((InternalEObject)newForr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FORR, null, msgs);
      msgs = basicSetForr(newForr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FORR, newForr, newForr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foreach getFore()
  {
    return fore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFore(Foreach newFore, NotificationChain msgs)
  {
    Foreach oldFore = fore;
    fore = newFore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FORE, oldFore, newFore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFore(Foreach newFore)
  {
    if (newFore != fore)
    {
      NotificationChain msgs = null;
      if (fore != null)
        msgs = ((InternalEObject)fore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FORE, null, msgs);
      if (newFore != null)
        msgs = ((InternalEObject)newFore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FORE, null, msgs);
      msgs = basicSetFore(newFore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FORE, newFore, newFore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If getIff()
  {
    return iff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIff(If newIff, NotificationChain msgs)
  {
    If oldIff = iff;
    iff = newIff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IFF, oldIff, newIff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIff(If newIff)
  {
    if (newIff != iff)
    {
      NotificationChain msgs = null;
      if (iff != null)
        msgs = ((InternalEObject)iff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IFF, null, msgs);
      if (newIff != null)
        msgs = ((InternalEObject)newIff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IFF, null, msgs);
      msgs = basicSetIff(newIff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IFF, newIff, newIff));
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
      case Langage_whilePackage.COMMAND__AFFECT:
        return basicSetAffect(null, msgs);
      case Langage_whilePackage.COMMAND__WH:
        return basicSetWh(null, msgs);
      case Langage_whilePackage.COMMAND__FORR:
        return basicSetForr(null, msgs);
      case Langage_whilePackage.COMMAND__FORE:
        return basicSetFore(null, msgs);
      case Langage_whilePackage.COMMAND__IFF:
        return basicSetIff(null, msgs);
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
      case Langage_whilePackage.COMMAND__NOP:
        return getNop();
      case Langage_whilePackage.COMMAND__AFFECT:
        return getAffect();
      case Langage_whilePackage.COMMAND__WH:
        return getWh();
      case Langage_whilePackage.COMMAND__FORR:
        return getForr();
      case Langage_whilePackage.COMMAND__FORE:
        return getFore();
      case Langage_whilePackage.COMMAND__IFF:
        return getIff();
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
      case Langage_whilePackage.COMMAND__NOP:
        setNop((String)newValue);
        return;
      case Langage_whilePackage.COMMAND__AFFECT:
        setAffect((Assign)newValue);
        return;
      case Langage_whilePackage.COMMAND__WH:
        setWh((While)newValue);
        return;
      case Langage_whilePackage.COMMAND__FORR:
        setForr((For)newValue);
        return;
      case Langage_whilePackage.COMMAND__FORE:
        setFore((Foreach)newValue);
        return;
      case Langage_whilePackage.COMMAND__IFF:
        setIff((If)newValue);
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
      case Langage_whilePackage.COMMAND__NOP:
        setNop(NOP_EDEFAULT);
        return;
      case Langage_whilePackage.COMMAND__AFFECT:
        setAffect((Assign)null);
        return;
      case Langage_whilePackage.COMMAND__WH:
        setWh((While)null);
        return;
      case Langage_whilePackage.COMMAND__FORR:
        setForr((For)null);
        return;
      case Langage_whilePackage.COMMAND__FORE:
        setFore((Foreach)null);
        return;
      case Langage_whilePackage.COMMAND__IFF:
        setIff((If)null);
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
      case Langage_whilePackage.COMMAND__NOP:
        return NOP_EDEFAULT == null ? nop != null : !NOP_EDEFAULT.equals(nop);
      case Langage_whilePackage.COMMAND__AFFECT:
        return affect != null;
      case Langage_whilePackage.COMMAND__WH:
        return wh != null;
      case Langage_whilePackage.COMMAND__FORR:
        return forr != null;
      case Langage_whilePackage.COMMAND__FORE:
        return fore != null;
      case Langage_whilePackage.COMMAND__IFF:
        return iff != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nop: ");
    result.append(nop);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
