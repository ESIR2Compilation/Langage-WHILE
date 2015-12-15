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
      case Langage_whilePackage.PROGRAM: return createProgram();
      case Langage_whilePackage.FUNCTION: return createFunction();
      case Langage_whilePackage.DEFINITION: return createDefinition();
      case Langage_whilePackage.INPUT: return createInput();
      case Langage_whilePackage.OUTPUT: return createOutput();
      case Langage_whilePackage.COMMANDS: return createCommands();
      case Langage_whilePackage.COMMAND: return createCommand();
      case Langage_whilePackage.ASSIGN: return createAssign();
      case Langage_whilePackage.WHILE: return createWhile();
      case Langage_whilePackage.FOR: return createFor();
      case Langage_whilePackage.IF: return createIf();
      case Langage_whilePackage.FOREACH: return createForeach();
      case Langage_whilePackage.IFCONFORT: return createIfconfort();
      case Langage_whilePackage.VARS: return createVars();
      case Langage_whilePackage.EXPRS: return createExprs();
      case Langage_whilePackage.EXPR: return createExpr();
      case Langage_whilePackage.EXPR_SIMPLE: return createExprSimple();
      case Langage_whilePackage.LEXPR: return createLExpr();
      case Langage_whilePackage.EXPR_AND: return createExprAnd();
      case Langage_whilePackage.EXPR_OR: return createExprOr();
      case Langage_whilePackage.EXPR_NOT: return createExprNot();
      case Langage_whilePackage.EXPR_EQ: return createExprEq();
      case Langage_whilePackage.VAR: return createVAR();
      case Langage_whilePackage.SYMB: return createSYMB();
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
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
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
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
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
  public Ifconfort createIfconfort()
  {
    IfconfortImpl ifconfort = new IfconfortImpl();
    return ifconfort;
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
  public Exprs createExprs()
  {
    ExprsImpl exprs = new ExprsImpl();
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple createExprSimple()
  {
    ExprSimpleImpl exprSimple = new ExprSimpleImpl();
    return exprSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpr createLExpr()
  {
    LExprImpl lExpr = new LExprImpl();
    return lExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd createExprAnd()
  {
    ExprAndImpl exprAnd = new ExprAndImpl();
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr createExprOr()
  {
    ExprOrImpl exprOr = new ExprOrImpl();
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot createExprNot()
  {
    ExprNotImpl exprNot = new ExprNotImpl();
    return exprNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq createExprEq()
  {
    ExprEqImpl exprEq = new ExprEqImpl();
    return exprEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR createVAR()
  {
    VARImpl var = new VARImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SYMB createSYMB()
  {
    SYMBImpl symb = new SYMBImpl();
    return symb;
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
