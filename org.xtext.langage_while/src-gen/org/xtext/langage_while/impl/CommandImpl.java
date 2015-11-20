/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.langage_while.Command;
import org.xtext.langage_while.Commands;
import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.EXPRS;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Vars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLl <em>Ll</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getEe <em>Ee</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getK <em>K</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLc <em>Lc</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getHh <em>Hh</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getVv <em>Vv</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getSs <em>Ss</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getMm <em>Mm</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getJj <em>Jj</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getKk <em>Kk</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getHg <em>Hg</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getGg <em>Gg</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getFf <em>Ff</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getO <em>O</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getDd <em>Dd</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getSq <em>Sq</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getWx <em>Wx</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLc2 <em>Lc2</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLc3 <em>Lc3</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLc4 <em>Lc4</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getC3 <em>C3</em>}</li>
 *   <li>{@link org.xtext.langage_while.impl.CommandImpl#getLc5 <em>Lc5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Vars e;

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
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected LCs c;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected EXPRS n;

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
   * The cached value of the '{@link #getHh() <em>Hh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHh()
   * @generated
   * @ordered
   */
  protected EXPR hh;

  /**
   * The cached value of the '{@link #getTt() <em>Tt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTt()
   * @generated
   * @ordered
   */
  protected LCs tt;

  /**
   * The cached value of the '{@link #getVv() <em>Vv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVv()
   * @generated
   * @ordered
   */
  protected LCs vv;

  /**
   * The cached value of the '{@link #getC1() <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC1()
   * @generated
   * @ordered
   */
  protected Commands c1;

  /**
   * The cached value of the '{@link #getSs() <em>Ss</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSs()
   * @generated
   * @ordered
   */
  protected LCs ss;

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
   * The cached value of the '{@link #getSq() <em>Sq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSq()
   * @generated
   * @ordered
   */
  protected LCs sq;

  /**
   * The cached value of the '{@link #getWx() <em>Wx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWx()
   * @generated
   * @ordered
   */
  protected EXPR wx;

  /**
   * The cached value of the '{@link #getLc2() <em>Lc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc2()
   * @generated
   * @ordered
   */
  protected LCs lc2;

  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected EXPR e1;

  /**
   * The cached value of the '{@link #getLc3() <em>Lc3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc3()
   * @generated
   * @ordered
   */
  protected LCs lc3;

  /**
   * The cached value of the '{@link #getLc4() <em>Lc4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc4()
   * @generated
   * @ordered
   */
  protected LCs lc4;

  /**
   * The cached value of the '{@link #getC3() <em>C3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC3()
   * @generated
   * @ordered
   */
  protected Commands c3;

  /**
   * The cached value of the '{@link #getLc5() <em>Lc5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLc5()
   * @generated
   * @ordered
   */
  protected LCs lc5;

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
  public Vars getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Vars newE, NotificationChain msgs)
  {
    Vars oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Vars newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__E, newE, newE));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__L, oldL, newL);
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
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(LCs newC, NotificationChain msgs)
  {
    LCs oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(LCs newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRS getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN(EXPRS newN, NotificationChain msgs)
  {
    EXPRS oldN = n;
    n = newN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__N, oldN, newN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(EXPRS newN)
  {
    if (newN != n)
    {
      NotificationChain msgs = null;
      if (n != null)
        msgs = ((InternalEObject)n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__N, null, msgs);
      if (newN != null)
        msgs = ((InternalEObject)newN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__N, null, msgs);
      msgs = basicSetN(newN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__N, newN, newN));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LL, oldLl, newLl);
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
        msgs = ((InternalEObject)ll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LL, null, msgs);
      if (newLl != null)
        msgs = ((InternalEObject)newLl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LL, null, msgs);
      msgs = basicSetLl(newLl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LL, newLl, newLl));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__EE, oldEe, newEe);
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
        msgs = ((InternalEObject)ee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__EE, null, msgs);
      if (newEe != null)
        msgs = ((InternalEObject)newEe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__EE, null, msgs);
      msgs = basicSetEe(newEe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__EE, newEe, newEe));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__CC, oldCc, newCc);
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
        msgs = ((InternalEObject)cc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__CC, null, msgs);
      if (newCc != null)
        msgs = ((InternalEObject)newCc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__CC, null, msgs);
      msgs = basicSetCc(newCc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__CC, newCc, newCc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__Z, oldZ, newZ);
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
        msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__Z, null, msgs);
      if (newZ != null)
        msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__Z, null, msgs);
      msgs = basicSetZ(newZ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__Z, newZ, newZ));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__K, oldK, newK);
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
        msgs = ((InternalEObject)k).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__K, null, msgs);
      if (newK != null)
        msgs = ((InternalEObject)newK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__K, null, msgs);
      msgs = basicSetK(newK, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__K, newK, newK));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC, oldLc, newLc);
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
        msgs = ((InternalEObject)lc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC, null, msgs);
      if (newLc != null)
        msgs = ((InternalEObject)newLc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC, null, msgs);
      msgs = basicSetLc(newLc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC, newLc, newLc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getHh()
  {
    return hh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHh(EXPR newHh, NotificationChain msgs)
  {
    EXPR oldHh = hh;
    hh = newHh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__HH, oldHh, newHh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHh(EXPR newHh)
  {
    if (newHh != hh)
    {
      NotificationChain msgs = null;
      if (hh != null)
        msgs = ((InternalEObject)hh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__HH, null, msgs);
      if (newHh != null)
        msgs = ((InternalEObject)newHh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__HH, null, msgs);
      msgs = basicSetHh(newHh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__HH, newHh, newHh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getTt()
  {
    return tt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTt(LCs newTt, NotificationChain msgs)
  {
    LCs oldTt = tt;
    tt = newTt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__TT, oldTt, newTt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTt(LCs newTt)
  {
    if (newTt != tt)
    {
      NotificationChain msgs = null;
      if (tt != null)
        msgs = ((InternalEObject)tt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__TT, null, msgs);
      if (newTt != null)
        msgs = ((InternalEObject)newTt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__TT, null, msgs);
      msgs = basicSetTt(newTt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__TT, newTt, newTt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getVv()
  {
    return vv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVv(LCs newVv, NotificationChain msgs)
  {
    LCs oldVv = vv;
    vv = newVv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__VV, oldVv, newVv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVv(LCs newVv)
  {
    if (newVv != vv)
    {
      NotificationChain msgs = null;
      if (vv != null)
        msgs = ((InternalEObject)vv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__VV, null, msgs);
      if (newVv != null)
        msgs = ((InternalEObject)newVv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__VV, null, msgs);
      msgs = basicSetVv(newVv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__VV, newVv, newVv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC1()
  {
    return c1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC1(Commands newC1, NotificationChain msgs)
  {
    Commands oldC1 = c1;
    c1 = newC1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C1, oldC1, newC1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC1(Commands newC1)
  {
    if (newC1 != c1)
    {
      NotificationChain msgs = null;
      if (c1 != null)
        msgs = ((InternalEObject)c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C1, null, msgs);
      if (newC1 != null)
        msgs = ((InternalEObject)newC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C1, null, msgs);
      msgs = basicSetC1(newC1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C1, newC1, newC1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getSs()
  {
    return ss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSs(LCs newSs, NotificationChain msgs)
  {
    LCs oldSs = ss;
    ss = newSs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__SS, oldSs, newSs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSs(LCs newSs)
  {
    if (newSs != ss)
    {
      NotificationChain msgs = null;
      if (ss != null)
        msgs = ((InternalEObject)ss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__SS, null, msgs);
      if (newSs != null)
        msgs = ((InternalEObject)newSs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__SS, null, msgs);
      msgs = basicSetSs(newSs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__SS, newSs, newSs));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__MM, oldMm, newMm);
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
        msgs = ((InternalEObject)mm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__MM, null, msgs);
      if (newMm != null)
        msgs = ((InternalEObject)newMm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__MM, null, msgs);
      msgs = basicSetMm(newMm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__MM, newMm, newMm));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__JJ, oldJj, newJj);
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
        msgs = ((InternalEObject)jj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__JJ, null, msgs);
      if (newJj != null)
        msgs = ((InternalEObject)newJj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__JJ, null, msgs);
      msgs = basicSetJj(newJj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__JJ, newJj, newJj));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__KK, oldKk, newKk);
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
        msgs = ((InternalEObject)kk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__KK, null, msgs);
      if (newKk != null)
        msgs = ((InternalEObject)newKk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__KK, null, msgs);
      msgs = basicSetKk(newKk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__KK, newKk, newKk));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__HG, oldHg, newHg);
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
        msgs = ((InternalEObject)hg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__HG, null, msgs);
      if (newHg != null)
        msgs = ((InternalEObject)newHg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__HG, null, msgs);
      msgs = basicSetHg(newHg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__HG, newHg, newHg));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C2, oldC2, newC2);
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
        msgs = ((InternalEObject)c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C2, null, msgs);
      if (newC2 != null)
        msgs = ((InternalEObject)newC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C2, null, msgs);
      msgs = basicSetC2(newC2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C2, newC2, newC2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__GG, oldGg, newGg);
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
        msgs = ((InternalEObject)gg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__GG, null, msgs);
      if (newGg != null)
        msgs = ((InternalEObject)newGg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__GG, null, msgs);
      msgs = basicSetGg(newGg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__GG, newGg, newGg));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FF, oldFf, newFf);
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
        msgs = ((InternalEObject)ff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FF, null, msgs);
      if (newFf != null)
        msgs = ((InternalEObject)newFf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__FF, null, msgs);
      msgs = basicSetFf(newFf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__FF, newFf, newFf));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__O, oldO, newO);
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
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__O, newO, newO));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__DD, oldDd, newDd);
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
        msgs = ((InternalEObject)dd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__DD, null, msgs);
      if (newDd != null)
        msgs = ((InternalEObject)newDd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__DD, null, msgs);
      msgs = basicSetDd(newDd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__DD, newDd, newDd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getSq()
  {
    return sq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSq(LCs newSq, NotificationChain msgs)
  {
    LCs oldSq = sq;
    sq = newSq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__SQ, oldSq, newSq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSq(LCs newSq)
  {
    if (newSq != sq)
    {
      NotificationChain msgs = null;
      if (sq != null)
        msgs = ((InternalEObject)sq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__SQ, null, msgs);
      if (newSq != null)
        msgs = ((InternalEObject)newSq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__SQ, null, msgs);
      msgs = basicSetSq(newSq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__SQ, newSq, newSq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getWx()
  {
    return wx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWx(EXPR newWx, NotificationChain msgs)
  {
    EXPR oldWx = wx;
    wx = newWx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__WX, oldWx, newWx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWx(EXPR newWx)
  {
    if (newWx != wx)
    {
      NotificationChain msgs = null;
      if (wx != null)
        msgs = ((InternalEObject)wx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__WX, null, msgs);
      if (newWx != null)
        msgs = ((InternalEObject)newWx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__WX, null, msgs);
      msgs = basicSetWx(newWx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__WX, newWx, newWx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc2()
  {
    return lc2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc2(LCs newLc2, NotificationChain msgs)
  {
    LCs oldLc2 = lc2;
    lc2 = newLc2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC2, oldLc2, newLc2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc2(LCs newLc2)
  {
    if (newLc2 != lc2)
    {
      NotificationChain msgs = null;
      if (lc2 != null)
        msgs = ((InternalEObject)lc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC2, null, msgs);
      if (newLc2 != null)
        msgs = ((InternalEObject)newLc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC2, null, msgs);
      msgs = basicSetLc2(newLc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC2, newLc2, newLc2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(EXPR newE1, NotificationChain msgs)
  {
    EXPR oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(EXPR newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc3()
  {
    return lc3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc3(LCs newLc3, NotificationChain msgs)
  {
    LCs oldLc3 = lc3;
    lc3 = newLc3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC3, oldLc3, newLc3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc3(LCs newLc3)
  {
    if (newLc3 != lc3)
    {
      NotificationChain msgs = null;
      if (lc3 != null)
        msgs = ((InternalEObject)lc3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC3, null, msgs);
      if (newLc3 != null)
        msgs = ((InternalEObject)newLc3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC3, null, msgs);
      msgs = basicSetLc3(newLc3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC3, newLc3, newLc3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc4()
  {
    return lc4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc4(LCs newLc4, NotificationChain msgs)
  {
    LCs oldLc4 = lc4;
    lc4 = newLc4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC4, oldLc4, newLc4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc4(LCs newLc4)
  {
    if (newLc4 != lc4)
    {
      NotificationChain msgs = null;
      if (lc4 != null)
        msgs = ((InternalEObject)lc4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC4, null, msgs);
      if (newLc4 != null)
        msgs = ((InternalEObject)newLc4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC4, null, msgs);
      msgs = basicSetLc4(newLc4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC4, newLc4, newLc4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC3()
  {
    return c3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC3(Commands newC3, NotificationChain msgs)
  {
    Commands oldC3 = c3;
    c3 = newC3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C3, oldC3, newC3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC3(Commands newC3)
  {
    if (newC3 != c3)
    {
      NotificationChain msgs = null;
      if (c3 != null)
        msgs = ((InternalEObject)c3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C3, null, msgs);
      if (newC3 != null)
        msgs = ((InternalEObject)newC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__C3, null, msgs);
      msgs = basicSetC3(newC3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__C3, newC3, newC3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs getLc5()
  {
    return lc5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLc5(LCs newLc5, NotificationChain msgs)
  {
    LCs oldLc5 = lc5;
    lc5 = newLc5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC5, oldLc5, newLc5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLc5(LCs newLc5)
  {
    if (newLc5 != lc5)
    {
      NotificationChain msgs = null;
      if (lc5 != null)
        msgs = ((InternalEObject)lc5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC5, null, msgs);
      if (newLc5 != null)
        msgs = ((InternalEObject)newLc5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Langage_whilePackage.COMMAND__LC5, null, msgs);
      msgs = basicSetLc5(newLc5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Langage_whilePackage.COMMAND__LC5, newLc5, newLc5));
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
      case Langage_whilePackage.COMMAND__E:
        return basicSetE(null, msgs);
      case Langage_whilePackage.COMMAND__L:
        return basicSetL(null, msgs);
      case Langage_whilePackage.COMMAND__C:
        return basicSetC(null, msgs);
      case Langage_whilePackage.COMMAND__N:
        return basicSetN(null, msgs);
      case Langage_whilePackage.COMMAND__LL:
        return basicSetLl(null, msgs);
      case Langage_whilePackage.COMMAND__EE:
        return basicSetEe(null, msgs);
      case Langage_whilePackage.COMMAND__CC:
        return basicSetCc(null, msgs);
      case Langage_whilePackage.COMMAND__Z:
        return basicSetZ(null, msgs);
      case Langage_whilePackage.COMMAND__K:
        return basicSetK(null, msgs);
      case Langage_whilePackage.COMMAND__LC:
        return basicSetLc(null, msgs);
      case Langage_whilePackage.COMMAND__HH:
        return basicSetHh(null, msgs);
      case Langage_whilePackage.COMMAND__TT:
        return basicSetTt(null, msgs);
      case Langage_whilePackage.COMMAND__VV:
        return basicSetVv(null, msgs);
      case Langage_whilePackage.COMMAND__C1:
        return basicSetC1(null, msgs);
      case Langage_whilePackage.COMMAND__SS:
        return basicSetSs(null, msgs);
      case Langage_whilePackage.COMMAND__MM:
        return basicSetMm(null, msgs);
      case Langage_whilePackage.COMMAND__JJ:
        return basicSetJj(null, msgs);
      case Langage_whilePackage.COMMAND__KK:
        return basicSetKk(null, msgs);
      case Langage_whilePackage.COMMAND__HG:
        return basicSetHg(null, msgs);
      case Langage_whilePackage.COMMAND__C2:
        return basicSetC2(null, msgs);
      case Langage_whilePackage.COMMAND__GG:
        return basicSetGg(null, msgs);
      case Langage_whilePackage.COMMAND__FF:
        return basicSetFf(null, msgs);
      case Langage_whilePackage.COMMAND__O:
        return basicSetO(null, msgs);
      case Langage_whilePackage.COMMAND__DD:
        return basicSetDd(null, msgs);
      case Langage_whilePackage.COMMAND__SQ:
        return basicSetSq(null, msgs);
      case Langage_whilePackage.COMMAND__WX:
        return basicSetWx(null, msgs);
      case Langage_whilePackage.COMMAND__LC2:
        return basicSetLc2(null, msgs);
      case Langage_whilePackage.COMMAND__E1:
        return basicSetE1(null, msgs);
      case Langage_whilePackage.COMMAND__LC3:
        return basicSetLc3(null, msgs);
      case Langage_whilePackage.COMMAND__LC4:
        return basicSetLc4(null, msgs);
      case Langage_whilePackage.COMMAND__C3:
        return basicSetC3(null, msgs);
      case Langage_whilePackage.COMMAND__LC5:
        return basicSetLc5(null, msgs);
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
      case Langage_whilePackage.COMMAND__E:
        return getE();
      case Langage_whilePackage.COMMAND__L:
        return getL();
      case Langage_whilePackage.COMMAND__C:
        return getC();
      case Langage_whilePackage.COMMAND__N:
        return getN();
      case Langage_whilePackage.COMMAND__LL:
        return getLl();
      case Langage_whilePackage.COMMAND__EE:
        return getEe();
      case Langage_whilePackage.COMMAND__CC:
        return getCc();
      case Langage_whilePackage.COMMAND__Z:
        return getZ();
      case Langage_whilePackage.COMMAND__K:
        return getK();
      case Langage_whilePackage.COMMAND__LC:
        return getLc();
      case Langage_whilePackage.COMMAND__HH:
        return getHh();
      case Langage_whilePackage.COMMAND__TT:
        return getTt();
      case Langage_whilePackage.COMMAND__VV:
        return getVv();
      case Langage_whilePackage.COMMAND__C1:
        return getC1();
      case Langage_whilePackage.COMMAND__SS:
        return getSs();
      case Langage_whilePackage.COMMAND__MM:
        return getMm();
      case Langage_whilePackage.COMMAND__JJ:
        return getJj();
      case Langage_whilePackage.COMMAND__KK:
        return getKk();
      case Langage_whilePackage.COMMAND__HG:
        return getHg();
      case Langage_whilePackage.COMMAND__C2:
        return getC2();
      case Langage_whilePackage.COMMAND__GG:
        return getGg();
      case Langage_whilePackage.COMMAND__FF:
        return getFf();
      case Langage_whilePackage.COMMAND__O:
        return getO();
      case Langage_whilePackage.COMMAND__DD:
        return getDd();
      case Langage_whilePackage.COMMAND__SQ:
        return getSq();
      case Langage_whilePackage.COMMAND__WX:
        return getWx();
      case Langage_whilePackage.COMMAND__LC2:
        return getLc2();
      case Langage_whilePackage.COMMAND__E1:
        return getE1();
      case Langage_whilePackage.COMMAND__LC3:
        return getLc3();
      case Langage_whilePackage.COMMAND__LC4:
        return getLc4();
      case Langage_whilePackage.COMMAND__C3:
        return getC3();
      case Langage_whilePackage.COMMAND__LC5:
        return getLc5();
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
      case Langage_whilePackage.COMMAND__E:
        setE((Vars)newValue);
        return;
      case Langage_whilePackage.COMMAND__L:
        setL((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__C:
        setC((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__N:
        setN((EXPRS)newValue);
        return;
      case Langage_whilePackage.COMMAND__LL:
        setLl((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__EE:
        setEe((EXPR)newValue);
        return;
      case Langage_whilePackage.COMMAND__CC:
        setCc((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__Z:
        setZ((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__K:
        setK((Commands)newValue);
        return;
      case Langage_whilePackage.COMMAND__LC:
        setLc((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__HH:
        setHh((EXPR)newValue);
        return;
      case Langage_whilePackage.COMMAND__TT:
        setTt((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__VV:
        setVv((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__C1:
        setC1((Commands)newValue);
        return;
      case Langage_whilePackage.COMMAND__SS:
        setSs((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__MM:
        setMm((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__JJ:
        setJj((EXPR)newValue);
        return;
      case Langage_whilePackage.COMMAND__KK:
        setKk((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__HG:
        setHg((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__C2:
        setC2((Commands)newValue);
        return;
      case Langage_whilePackage.COMMAND__GG:
        setGg((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__FF:
        setFf((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__O:
        setO((Commands)newValue);
        return;
      case Langage_whilePackage.COMMAND__DD:
        setDd((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__SQ:
        setSq((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__WX:
        setWx((EXPR)newValue);
        return;
      case Langage_whilePackage.COMMAND__LC2:
        setLc2((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__E1:
        setE1((EXPR)newValue);
        return;
      case Langage_whilePackage.COMMAND__LC3:
        setLc3((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__LC4:
        setLc4((LCs)newValue);
        return;
      case Langage_whilePackage.COMMAND__C3:
        setC3((Commands)newValue);
        return;
      case Langage_whilePackage.COMMAND__LC5:
        setLc5((LCs)newValue);
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
      case Langage_whilePackage.COMMAND__E:
        setE((Vars)null);
        return;
      case Langage_whilePackage.COMMAND__L:
        setL((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__C:
        setC((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__N:
        setN((EXPRS)null);
        return;
      case Langage_whilePackage.COMMAND__LL:
        setLl((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__EE:
        setEe((EXPR)null);
        return;
      case Langage_whilePackage.COMMAND__CC:
        setCc((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__Z:
        setZ((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__K:
        setK((Commands)null);
        return;
      case Langage_whilePackage.COMMAND__LC:
        setLc((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__HH:
        setHh((EXPR)null);
        return;
      case Langage_whilePackage.COMMAND__TT:
        setTt((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__VV:
        setVv((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__C1:
        setC1((Commands)null);
        return;
      case Langage_whilePackage.COMMAND__SS:
        setSs((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__MM:
        setMm((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__JJ:
        setJj((EXPR)null);
        return;
      case Langage_whilePackage.COMMAND__KK:
        setKk((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__HG:
        setHg((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__C2:
        setC2((Commands)null);
        return;
      case Langage_whilePackage.COMMAND__GG:
        setGg((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__FF:
        setFf((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__O:
        setO((Commands)null);
        return;
      case Langage_whilePackage.COMMAND__DD:
        setDd((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__SQ:
        setSq((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__WX:
        setWx((EXPR)null);
        return;
      case Langage_whilePackage.COMMAND__LC2:
        setLc2((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__E1:
        setE1((EXPR)null);
        return;
      case Langage_whilePackage.COMMAND__LC3:
        setLc3((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__LC4:
        setLc4((LCs)null);
        return;
      case Langage_whilePackage.COMMAND__C3:
        setC3((Commands)null);
        return;
      case Langage_whilePackage.COMMAND__LC5:
        setLc5((LCs)null);
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
      case Langage_whilePackage.COMMAND__E:
        return e != null;
      case Langage_whilePackage.COMMAND__L:
        return l != null;
      case Langage_whilePackage.COMMAND__C:
        return c != null;
      case Langage_whilePackage.COMMAND__N:
        return n != null;
      case Langage_whilePackage.COMMAND__LL:
        return ll != null;
      case Langage_whilePackage.COMMAND__EE:
        return ee != null;
      case Langage_whilePackage.COMMAND__CC:
        return cc != null;
      case Langage_whilePackage.COMMAND__Z:
        return z != null;
      case Langage_whilePackage.COMMAND__K:
        return k != null;
      case Langage_whilePackage.COMMAND__LC:
        return lc != null;
      case Langage_whilePackage.COMMAND__HH:
        return hh != null;
      case Langage_whilePackage.COMMAND__TT:
        return tt != null;
      case Langage_whilePackage.COMMAND__VV:
        return vv != null;
      case Langage_whilePackage.COMMAND__C1:
        return c1 != null;
      case Langage_whilePackage.COMMAND__SS:
        return ss != null;
      case Langage_whilePackage.COMMAND__MM:
        return mm != null;
      case Langage_whilePackage.COMMAND__JJ:
        return jj != null;
      case Langage_whilePackage.COMMAND__KK:
        return kk != null;
      case Langage_whilePackage.COMMAND__HG:
        return hg != null;
      case Langage_whilePackage.COMMAND__C2:
        return c2 != null;
      case Langage_whilePackage.COMMAND__GG:
        return gg != null;
      case Langage_whilePackage.COMMAND__FF:
        return ff != null;
      case Langage_whilePackage.COMMAND__O:
        return o != null;
      case Langage_whilePackage.COMMAND__DD:
        return dd != null;
      case Langage_whilePackage.COMMAND__SQ:
        return sq != null;
      case Langage_whilePackage.COMMAND__WX:
        return wx != null;
      case Langage_whilePackage.COMMAND__LC2:
        return lc2 != null;
      case Langage_whilePackage.COMMAND__E1:
        return e1 != null;
      case Langage_whilePackage.COMMAND__LC3:
        return lc3 != null;
      case Langage_whilePackage.COMMAND__LC4:
        return lc4 != null;
      case Langage_whilePackage.COMMAND__C3:
        return c3 != null;
      case Langage_whilePackage.COMMAND__LC5:
        return lc5 != null;
    }
    return super.eIsSet(featureID);
  }

} //CommandImpl
