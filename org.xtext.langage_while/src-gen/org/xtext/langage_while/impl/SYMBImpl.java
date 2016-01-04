/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.SYMB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SYMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.SYMBImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.SYMBImpl#getCf <em>Cf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SYMBImpl extends MinimalEObjectImpl.Container implements SYMB
{
  /**
   * The default value of the '{@link #getBs() <em>Bs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBs()
   * @generated
   * @ordered
   */
  protected static final String BS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBs() <em>Bs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBs()
   * @generated
   * @ordered
   */
  protected String bs = BS_EDEFAULT;

  /**
   * The default value of the '{@link #getCf() <em>Cf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCf()
   * @generated
   * @ordered
   */
  protected static final String CF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCf() <em>Cf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCf()
   * @generated
   * @ordered
   */
  protected String cf = CF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SYMBImpl()
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
    return Langage_whilePackage.Literals.SYMB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBs()
  {
    return bs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBs(String newBs)
  {
    String oldBs = bs;
    bs = newBs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.SYMB__BS, oldBs, bs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCf()
  {
    return cf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCf(String newCf)
  {
    String oldCf = cf;
    cf = newCf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.SYMB__CF, oldCf, cf));
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
      case Langage_whilePackage.SYMB__BS:
        return getBs();
      case Langage_whilePackage.SYMB__CF:
        return getCf();
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
      case Langage_whilePackage.SYMB__BS:
        setBs((String)newValue);
        return;
      case Langage_whilePackage.SYMB__CF:
        setCf((String)newValue);
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
      case Langage_whilePackage.SYMB__BS:
        setBs(BS_EDEFAULT);
        return;
      case Langage_whilePackage.SYMB__CF:
        setCf(CF_EDEFAULT);
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
      case Langage_whilePackage.SYMB__BS:
        return BS_EDEFAULT == null ? bs != null : !BS_EDEFAULT.equals(bs);
      case Langage_whilePackage.SYMB__CF:
        return CF_EDEFAULT == null ? cf != null : !CF_EDEFAULT.equals(cf);
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
    result.append(" (bs: ");
    result.append(bs);
    result.append(", cf: ");
    result.append(cf);
    result.append(')');
    return result.toString();
  }

} //SYMBImpl
