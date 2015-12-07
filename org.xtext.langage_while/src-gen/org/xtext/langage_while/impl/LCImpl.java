/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.LC;
import org.xtext.langage_while.Langage_whilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.LCImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.LCImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.LCImpl#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.LCImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCImpl extends MinimalEObjectImpl.Container implements LC
{
  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final String A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected String a = A_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final String Z_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected String z = Z_EDEFAULT;

  /**
   * The default value of the '{@link #getE() <em>E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected static final String E_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected String e = E_EDEFAULT;

  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final String R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected String r = R_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LCImpl()
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
    return Langage_whilePackage.Literals.LC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(String newA)
  {
    String oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LC__A, oldA, a));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(String newZ)
  {
    String oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LC__Z, oldZ, z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(String newE)
  {
    String oldE = e;
    e = newE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LC__E, oldE, e));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(String newR)
  {
    String oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.LC__R, oldR, r));
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
      case Langage_whilePackage.LC__A:
        return getA();
      case Langage_whilePackage.LC__Z:
        return getZ();
      case Langage_whilePackage.LC__E:
        return getE();
      case Langage_whilePackage.LC__R:
        return getR();
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
      case Langage_whilePackage.LC__A:
        setA((String)newValue);
        return;
      case Langage_whilePackage.LC__Z:
        setZ((String)newValue);
        return;
      case Langage_whilePackage.LC__E:
        setE((String)newValue);
        return;
      case Langage_whilePackage.LC__R:
        setR((String)newValue);
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
      case Langage_whilePackage.LC__A:
        setA(A_EDEFAULT);
        return;
      case Langage_whilePackage.LC__Z:
        setZ(Z_EDEFAULT);
        return;
      case Langage_whilePackage.LC__E:
        setE(E_EDEFAULT);
        return;
      case Langage_whilePackage.LC__R:
        setR(R_EDEFAULT);
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
      case Langage_whilePackage.LC__A:
        return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
      case Langage_whilePackage.LC__Z:
        return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
      case Langage_whilePackage.LC__E:
        return E_EDEFAULT == null ? e != null : !E_EDEFAULT.equals(e);
      case Langage_whilePackage.LC__R:
        return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
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
    result.append(" (a: ");
    result.append(a);
    result.append(", z: ");
    result.append(z);
    result.append(", e: ");
    result.append(e);
    result.append(", r: ");
    result.append(r);
    result.append(')');
    return result.toString();
  }

} //LCImpl
