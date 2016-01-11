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
import org.xtext.langage_while.Ifconfort;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getWh <em>Wh</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getFore <em>Fore</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getIfc <em>Ifc</em>}</li>
 * </ul>
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
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected Assign assign;

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
   * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected For for_;

  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected If if_;

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
   * The cached value of the '{@link #getIfc() <em>Ifc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfc()
   * @generated
   * @ordered
   */
  protected Ifconfort ifc;

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
  public Assign getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssign(Assign newAssign, NotificationChain msgs)
  {
    Assign oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__ASSIGN, oldAssign, newAssign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(Assign newAssign)
  {
    if (newAssign != assign)
    {
      NotificationChain msgs = null;
      if (assign != null)
        msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__ASSIGN, null, msgs);
      if (newAssign != null)
        msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__ASSIGN, null, msgs);
      msgs = basicSetAssign(newAssign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__ASSIGN, newAssign, newAssign));
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
  public For getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor(For newFor, NotificationChain msgs)
  {
    For oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FOR, oldFor, newFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(For newFor)
  {
    if (newFor != for_)
    {
      NotificationChain msgs = null;
      if (for_ != null)
        msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FOR, null, msgs);
      if (newFor != null)
        msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FOR, null, msgs);
      msgs = basicSetFor(newFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FOR, newFor, newFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(If newIf, NotificationChain msgs)
  {
    If oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(If newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IF, newIf, newIf));
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
  public Ifconfort getIfc()
  {
    return ifc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfc(Ifconfort newIfc, NotificationChain msgs)
  {
    Ifconfort oldIfc = ifc;
    ifc = newIfc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IFC, oldIfc, newIfc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfc(Ifconfort newIfc)
  {
    if (newIfc != ifc)
    {
      NotificationChain msgs = null;
      if (ifc != null)
        msgs = ((InternalEObject)ifc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IFC, null, msgs);
      if (newIfc != null)
        msgs = ((InternalEObject)newIfc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__IFC, null, msgs);
      msgs = basicSetIfc(newIfc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__IFC, newIfc, newIfc));
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
      case Langage_whilePackage.COMMAND__ASSIGN:
        return basicSetAssign(null, msgs);
      case Langage_whilePackage.COMMAND__WH:
        return basicSetWh(null, msgs);
      case Langage_whilePackage.COMMAND__FOR:
        return basicSetFor(null, msgs);
      case Langage_whilePackage.COMMAND__IF:
        return basicSetIf(null, msgs);
      case Langage_whilePackage.COMMAND__FORE:
        return basicSetFore(null, msgs);
      case Langage_whilePackage.COMMAND__IFC:
        return basicSetIfc(null, msgs);
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
      case Langage_whilePackage.COMMAND__ASSIGN:
        return getAssign();
      case Langage_whilePackage.COMMAND__WH:
        return getWh();
      case Langage_whilePackage.COMMAND__FOR:
        return getFor();
      case Langage_whilePackage.COMMAND__IF:
        return getIf();
      case Langage_whilePackage.COMMAND__FORE:
        return getFore();
      case Langage_whilePackage.COMMAND__IFC:
        return getIfc();
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
      case Langage_whilePackage.COMMAND__ASSIGN:
        setAssign((Assign)newValue);
        return;
      case Langage_whilePackage.COMMAND__WH:
        setWh((While)newValue);
        return;
      case Langage_whilePackage.COMMAND__FOR:
        setFor((For)newValue);
        return;
      case Langage_whilePackage.COMMAND__IF:
        setIf((If)newValue);
        return;
      case Langage_whilePackage.COMMAND__FORE:
        setFore((Foreach)newValue);
        return;
      case Langage_whilePackage.COMMAND__IFC:
        setIfc((Ifconfort)newValue);
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
      case Langage_whilePackage.COMMAND__ASSIGN:
        setAssign((Assign)null);
        return;
      case Langage_whilePackage.COMMAND__WH:
        setWh((While)null);
        return;
      case Langage_whilePackage.COMMAND__FOR:
        setFor((For)null);
        return;
      case Langage_whilePackage.COMMAND__IF:
        setIf((If)null);
        return;
      case Langage_whilePackage.COMMAND__FORE:
        setFore((Foreach)null);
        return;
      case Langage_whilePackage.COMMAND__IFC:
        setIfc((Ifconfort)null);
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
      case Langage_whilePackage.COMMAND__ASSIGN:
        return assign != null;
      case Langage_whilePackage.COMMAND__WH:
        return wh != null;
      case Langage_whilePackage.COMMAND__FOR:
        return for_ != null;
      case Langage_whilePackage.COMMAND__IF:
        return if_ != null;
      case Langage_whilePackage.COMMAND__FORE:
        return fore != null;
      case Langage_whilePackage.COMMAND__IFC:
        return ifc != null;
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
