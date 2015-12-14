/**
 */
package org.xtext.langage_while.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.langage_while.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Langage_whileFactoryImpl extends EFactoryImpl implements Langage_whileFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Langage_whileFactory init()
  {
    try
    {
      Langage_whileFactory theLangage_whileFactory = (Langage_whileFactory)EPackage.Registry.INSTANCE.getEFactory(Langage_whilePackage.eNS_URI);
      if (theLangage_whileFactory != null)
      {
        return theLangage_whileFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Langage_whileFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Langage_whileFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Langage_whilePackage.MODEL: return createModel();
      case Langage_whilePackage.FUNCTION: return createFunction();
      case Langage_whilePackage.DEF: return createDef();
      case Langage_whilePackage.INPUT: return createInput();
      case Langage_whilePackage.OUTPUT: return createOutput();
      case Langage_whilePackage.COMMANDS: return createCommands();
      case Langage_whilePackage.COMMAND: return createCommand();
      case Langage_whilePackage.ASSIGN: return createAssign();
      case Langage_whilePackage.WHILE: return createWhile();
      case Langage_whilePackage.FOR: return createFor();
      case Langage_whilePackage.IF: return createIf();
      case Langage_whilePackage.FOREACH: return createForeach();
      case Langage_whilePackage.VARS: return createVars();
      case Langage_whilePackage.EXPRS: return createEXPRS();
      case Langage_whilePackage.EXPR: return createEXPR();
      case Langage_whilePackage.EXPRSIMPLE: return createEXPRSIMPLE();
      case Langage_whilePackage.LEXPR: return createLEXPR();
      case Langage_whilePackage.EXPRAND: return createEXPRAND();
      case Langage_whilePackage.EXPROR: return createEXPROR();
      case Langage_whilePackage.EXPRNOT: return createEXPRNOT();
      case Langage_whilePackage.EXPREQ: return createEXPREQ();
      case Langage_whilePackage.VARIABLE: return createVariable();
      case Langage_whilePackage.LCS: return createLCs();
      case Langage_whilePackage.LC: return createLC();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Def createDef()
  {
    DefImpl def = new DefImpl();
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands createCommands()
  {
    CommandsImpl commands = new CommandsImpl();
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foreach createForeach()
  {
    ForeachImpl foreach = new ForeachImpl();
    return foreach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars createVars()
  {
    VarsImpl vars = new VarsImpl();
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRS createEXPRS()
  {
    EXPRSImpl exprs = new EXPRSImpl();
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPR createEXPR()
  {
    EXPRImpl expr = new EXPRImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRSIMPLE createEXPRSIMPLE()
  {
    EXPRSIMPLEImpl exprsimple = new EXPRSIMPLEImpl();
    return exprsimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEXPR createLEXPR()
  {
    LEXPRImpl lexpr = new LEXPRImpl();
    return lexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRAND createEXPRAND()
  {
    EXPRANDImpl exprand = new EXPRANDImpl();
    return exprand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPROR createEXPROR()
  {
    EXPRORImpl expror = new EXPRORImpl();
    return expror;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRNOT createEXPRNOT()
  {
    EXPRNOTImpl exprnot = new EXPRNOTImpl();
    return exprnot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPREQ createEXPREQ()
  {
    EXPREQImpl expreq = new EXPREQImpl();
    return expreq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LCs createLCs()
  {
    LCsImpl lCs = new LCsImpl();
    return lCs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LC createLC()
  {
    LCImpl lc = new LCImpl();
    return lc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Langage_whilePackage getLangage_whilePackage()
  {
    return (Langage_whilePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Langage_whilePackage getPackage()
  {
    return Langage_whilePackage.eINSTANCE;
  }

} //Langage_whileFactoryImpl
