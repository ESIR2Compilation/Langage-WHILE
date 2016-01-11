/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.VAR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VAR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.VARImpl#getBv <em>Bv</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.VARImpl#getCf <em>Cf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VARImpl extends MinimalEObjectImpl.Container implements VAR
{
  /**
   * The default value of the '{@link #getBv() <em>Bv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBv()
   * @generated
   * @ordered
   */
  protected static final String BV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBv() <em>Bv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBv()
   * @generated
   * @ordered
   */
  protected String bv = BV_EDEFAULT;

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
  protected VARImpl()
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
    return Langage_whilePackage.Literals.VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBv()
  {
    return bv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBv(String newBv)
  {
    String oldBv = bv;
    bv = newBv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VAR__BV, oldBv, bv));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.VAR__CF, oldCf, cf));
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
      case Langage_whilePackage.VAR__BV:
        return getBv();
      case Langage_whilePackage.VAR__CF:
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
      case Langage_whilePackage.VAR__BV:
        setBv((String)newValue);
        return;
      case Langage_whilePackage.VAR__CF:
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
      case Langage_whilePackage.VAR__BV:
        setBv(BV_EDEFAULT);
        return;
      case Langage_whilePackage.VAR__CF:
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
      case Langage_whilePackage.VAR__BV:
        return BV_EDEFAULT == null ? bv != null : !BV_EDEFAULT.equals(bv);
      case Langage_whilePackage.VAR__CF:
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
    result.append(" (bv: ");
    result.append(bv);
    result.append(", cf: ");
    result.append(cf);
    result.append(')');
    return result.toString();
  }

} //VARImpl
