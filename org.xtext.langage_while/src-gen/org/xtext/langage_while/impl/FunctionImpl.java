/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Def;
import org.xtext.langage_while.Function;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.FunctionImpl#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.FunctionImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.FunctionImpl#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.FunctionImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
  /**
   * The cached value of the '{@link #getN() <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected LCs n;

  /**
   * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected static final String NOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected String nom = NOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected LCs t;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Def d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return Langage_whilePackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN(LCs newN, NotificationChain msgs)
  {
    LCs oldN = n;
    n = newN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__N, oldN, newN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(LCs newN)
  {
    if (newN != n)
    {
      NotificationChain msgs = null;
      if (n != null)
        msgs = ((InternalEObject)n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__N, null, msgs);
      if (newN != null)
        msgs = ((InternalEObject)newN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__N, null, msgs);
      msgs = basicSetN(newN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__N, newN, newN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNom()
  {
    return nom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNom(String newNom)
  {
    String oldNom = nom;
    nom = newNom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__NOM, oldNom, nom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(LCs newT, NotificationChain msgs)
  {
    LCs oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(LCs newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Def getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(Def newD, NotificationChain msgs)
  {
    Def oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(Def newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.FUNCTION__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.FUNCTION__D, newD, newD));
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
      case Langage_whilePackage.FUNCTION__N:
        return basicSetN(null, msgs);
      case Langage_whilePackage.FUNCTION__T:
        return basicSetT(null, msgs);
      case Langage_whilePackage.FUNCTION__D:
        return basicSetD(null, msgs);
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
      case Langage_whilePackage.FUNCTION__N:
        return getN();
      case Langage_whilePackage.FUNCTION__NOM:
        return getNom();
      case Langage_whilePackage.FUNCTION__T:
        return getT();
      case Langage_whilePackage.FUNCTION__D:
        return getD();
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
      case Langage_whilePackage.FUNCTION__N:
        setN((LCs)newValue);
        return;
      case Langage_whilePackage.FUNCTION__NOM:
        setNom((String)newValue);
        return;
      case Langage_whilePackage.FUNCTION__T:
        setT((LCs)newValue);
        return;
      case Langage_whilePackage.FUNCTION__D:
        setD((Def)newValue);
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
      case Langage_whilePackage.FUNCTION__N:
        setN((LCs)null);
        return;
      case Langage_whilePackage.FUNCTION__NOM:
        setNom(NOM_EDEFAULT);
        return;
      case Langage_whilePackage.FUNCTION__T:
        setT((LCs)null);
        return;
      case Langage_whilePackage.FUNCTION__D:
        setD((Def)null);
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
      case Langage_whilePackage.FUNCTION__N:
        return n != null;
      case Langage_whilePackage.FUNCTION__NOM:
        return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
      case Langage_whilePackage.FUNCTION__T:
        return t != null;
      case Langage_whilePackage.FUNCTION__D:
        return d != null;
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
    result.append(" (nom: ");
    result.append(nom);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
