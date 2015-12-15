/**
 */
package org.xtext.langage_while;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.langage_while.Langage_whileFactory
 * @model kind="package"
 * @generated
 */
public interface Langage_whilePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "langage_while";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Langage_while";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "langage_while";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Langage_whilePackage eINSTANCE = org.xtext.langage_while.impl.Langage_whilePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ModelImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Nn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ProgramImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__F = 0;

  /**
   * The feature id for the '<em><b>U</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__U = 1;

  /**
   * The feature id for the '<em><b>Pp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PP = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.FunctionImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEF = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.DefinitionImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 3;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__IN = 0;

  /**
   * The feature id for the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__COM = 1;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__OUT = 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.InputImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getInput()
   * @generated
   */
  int INPUT = 4;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__V = 0;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.OutputImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 5;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__V = 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.CommandsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 6;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__C = 0;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.CommandImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 7;

  /**
   * The feature id for the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NOP = 0;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ASSIGN = 1;

  /**
   * The feature id for the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__WH = 2;

  /**
   * The feature id for the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FOR = 3;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__IF = 4;

  /**
   * The feature id for the '<em><b>Fore</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FORE = 5;

  /**
   * The feature id for the '<em><b>Ifc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__IFC = 6;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.AssignImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 8;

  /**
   * The feature id for the '<em><b>Vs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VS = 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__EX = 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.WhileImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getWhile()
   * @generated
   */
  int WHILE = 9;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EX = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__C = 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ForImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFor()
   * @generated
   */
  int FOR = 10;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__EX = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__C = 1;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.IfImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getIf()
   * @generated
   */
  int IF = 11;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EX = 0;

  /**
   * The feature id for the '<em><b>Ct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CT = 1;

  /**
   * The feature id for the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CE = 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ForeachImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 12;

  /**
   * The feature id for the '<em><b>Ex1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EX1 = 0;

  /**
   * The feature id for the '<em><b>Ex2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EX2 = 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__C = 2;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.IfconfortImpl <em>Ifconfort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.IfconfortImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getIfconfort()
   * @generated
   */
  int IFCONFORT = 13;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFCONFORT__EX = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFCONFORT__C = 1;

  /**
   * The number of structural features of the '<em>Ifconfort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFCONFORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.VarsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVars()
   * @generated
   */
  int VARS = 14;

  /**
   * The feature id for the '<em><b>Vs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VS = 0;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprsImpl <em>Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprs()
   * @generated
   */
  int EXPRS = 15;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EX = 0;

  /**
   * The number of structural features of the '<em>Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExpr()
   * @generated
   */
  int EXPR = 16;

  /**
   * The feature id for the '<em><b>Exs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXS = 0;

  /**
   * The feature id for the '<em><b>Exa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXA = 1;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprSimpleImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprSimple()
   * @generated
   */
  int EXPR_SIMPLE = 17;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__NIL = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__V = 1;

  /**
   * The feature id for the '<em><b>Sym</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYM = 2;

  /**
   * The feature id for the '<em><b>Mot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__MOT = 3;

  /**
   * The feature id for the '<em><b>Lex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LEX = 4;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EX = 5;

  /**
   * The number of structural features of the '<em>Expr Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LExprImpl <em>LExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LExprImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLExpr()
   * @generated
   */
  int LEXPR = 18;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__E = 0;

  /**
   * The number of structural features of the '<em>LExpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprAndImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 19;

  /**
   * The feature id for the '<em><b>Exo1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXO1 = 0;

  /**
   * The feature id for the '<em><b>Exo2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXO2 = 1;

  /**
   * The number of structural features of the '<em>Expr And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprOrImpl <em>Expr Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprOrImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprOr()
   * @generated
   */
  int EXPR_OR = 20;

  /**
   * The feature id for the '<em><b>Exn1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXN1 = 0;

  /**
   * The feature id for the '<em><b>Exn2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXN2 = 1;

  /**
   * The number of structural features of the '<em>Expr Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprNotImpl <em>Expr Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprNotImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprNot()
   * @generated
   */
  int EXPR_NOT = 21;

  /**
   * The feature id for the '<em><b>Ex Q1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EX_Q1 = 0;

  /**
   * The feature id for the '<em><b>Ex Q2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EX_Q2 = 1;

  /**
   * The number of structural features of the '<em>Expr Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ExprEqImpl <em>Expr Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ExprEqImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprEq()
   * @generated
   */
  int EXPR_EQ = 22;

  /**
   * The feature id for the '<em><b>Ex S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EX_S1 = 0;

  /**
   * The feature id for the '<em><b>Ex S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EX_S2 = 1;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EX = 2;

  /**
   * The number of structural features of the '<em>Expr Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.VARImpl <em>VAR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.VARImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVAR()
   * @generated
   */
  int VAR = 23;

  /**
   * The feature id for the '<em><b>Bv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__BV = 0;

  /**
   * The feature id for the '<em><b>Cf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__CF = 1;

  /**
   * The number of structural features of the '<em>VAR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.SYMBImpl <em>SYMB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.SYMBImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getSYMB()
   * @generated
   */
  int SYMB = 24;

  /**
   * The feature id for the '<em><b>Bs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMB__BS = 0;

  /**
   * The feature id for the '<em><b>Cf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMB__CF = 1;

  /**
   * The number of structural features of the '<em>SYMB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMB_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.langage_while.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Model#getNn <em>Nn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nn</em>'.
   * @see org.xtext.langage_while.Model#getNn()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Nn();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.langage_while.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Program#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>F</em>'.
   * @see org.xtext.langage_while.Program#getF()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_F();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Program#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>U</em>'.
   * @see org.xtext.langage_while.Program#getU()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_U();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Program#getPp <em>Pp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pp</em>'.
   * @see org.xtext.langage_while.Program#getPp()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Pp();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.langage_while.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.langage_while.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Function#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.xtext.langage_while.Function#getDef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Def();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.xtext.langage_while.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Definition#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.langage_while.Definition#getIn()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_In();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Definition#getCom <em>Com</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com</em>'.
   * @see org.xtext.langage_while.Definition#getCom()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Com();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Definition#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.xtext.langage_while.Definition#getOut()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Out();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.langage_while.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Input#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>V</em>'.
   * @see org.xtext.langage_while.Input#getV()
   * @see #getInput()
   * @generated
   */
  EReference getInput_V();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.langage_while.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Output#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>V</em>'.
   * @see org.xtext.langage_while.Output#getV()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_V();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commands</em>'.
   * @see org.xtext.langage_while.Commands
   * @generated
   */
  EClass getCommands();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Commands#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>C</em>'.
   * @see org.xtext.langage_while.Commands#getC()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_C();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.langage_while.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Command#getNop <em>Nop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nop</em>'.
   * @see org.xtext.langage_while.Command#getNop()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Nop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign</em>'.
   * @see org.xtext.langage_while.Command#getAssign()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Assign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getWh <em>Wh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wh</em>'.
   * @see org.xtext.langage_while.Command#getWh()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Wh();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For</em>'.
   * @see org.xtext.langage_while.Command#getFor()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_For();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.langage_while.Command#getIf()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_If();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getFore <em>Fore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fore</em>'.
   * @see org.xtext.langage_while.Command#getFore()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Fore();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getIfc <em>Ifc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifc</em>'.
   * @see org.xtext.langage_while.Command#getIfc()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Ifc();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see org.xtext.langage_while.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getVs <em>Vs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vs</em>'.
   * @see org.xtext.langage_while.Assign#getVs()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Vs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.Assign#getEx()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.xtext.langage_while.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.While#getEx()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.While#getC()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_C();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.xtext.langage_while.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.For#getEx()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.For#getC()
   * @see #getFor()
   * @generated
   */
  EReference getFor_C();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.xtext.langage_while.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.If#getEx()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getCt <em>Ct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ct</em>'.
   * @see org.xtext.langage_while.If#getCt()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Ct();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ce</em>'.
   * @see org.xtext.langage_while.If#getCe()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Ce();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach</em>'.
   * @see org.xtext.langage_while.Foreach
   * @generated
   */
  EClass getForeach();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getEx1 <em>Ex1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex1</em>'.
   * @see org.xtext.langage_while.Foreach#getEx1()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Ex1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getEx2 <em>Ex2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex2</em>'.
   * @see org.xtext.langage_while.Foreach#getEx2()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Ex2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.Foreach#getC()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_C();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Ifconfort <em>Ifconfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ifconfort</em>'.
   * @see org.xtext.langage_while.Ifconfort
   * @generated
   */
  EClass getIfconfort();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Ifconfort#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.Ifconfort#getEx()
   * @see #getIfconfort()
   * @generated
   */
  EReference getIfconfort_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Ifconfort#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.Ifconfort#getC()
   * @see #getIfconfort()
   * @generated
   */
  EReference getIfconfort_C();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vars</em>'.
   * @see org.xtext.langage_while.Vars
   * @generated
   */
  EClass getVars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Vars#getVs <em>Vs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vs</em>'.
   * @see org.xtext.langage_while.Vars#getVs()
   * @see #getVars()
   * @generated
   */
  EReference getVars_Vs();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exprs</em>'.
   * @see org.xtext.langage_while.Exprs
   * @generated
   */
  EClass getExprs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Exprs#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ex</em>'.
   * @see org.xtext.langage_while.Exprs#getEx()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.langage_while.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Expr#getExs <em>Exs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exs</em>'.
   * @see org.xtext.langage_while.Expr#getExs()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Exs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Expr#getExa <em>Exa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exa</em>'.
   * @see org.xtext.langage_while.Expr#getExa()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Exa();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Simple</em>'.
   * @see org.xtext.langage_while.ExprSimple
   * @generated
   */
  EClass getExprSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.ExprSimple#getNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.xtext.langage_while.ExprSimple#getNil()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Nil();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprSimple#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.xtext.langage_while.ExprSimple#getV()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_V();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprSimple#getSym <em>Sym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sym</em>'.
   * @see org.xtext.langage_while.ExprSimple#getSym()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Sym();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.ExprSimple#getMot <em>Mot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mot</em>'.
   * @see org.xtext.langage_while.ExprSimple#getMot()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Mot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprSimple#getLex <em>Lex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lex</em>'.
   * @see org.xtext.langage_while.ExprSimple#getLex()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Lex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprSimple#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.ExprSimple#getEx()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.LExpr <em>LExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LExpr</em>'.
   * @see org.xtext.langage_while.LExpr
   * @generated
   */
  EClass getLExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.LExpr#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.xtext.langage_while.LExpr#getE()
   * @see #getLExpr()
   * @generated
   */
  EReference getLExpr_E();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr And</em>'.
   * @see org.xtext.langage_while.ExprAnd
   * @generated
   */
  EClass getExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprAnd#getExo1 <em>Exo1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exo1</em>'.
   * @see org.xtext.langage_while.ExprAnd#getExo1()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Exo1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.ExprAnd#getExo2 <em>Exo2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exo2</em>'.
   * @see org.xtext.langage_while.ExprAnd#getExo2()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Exo2();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Or</em>'.
   * @see org.xtext.langage_while.ExprOr
   * @generated
   */
  EClass getExprOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprOr#getExn1 <em>Exn1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exn1</em>'.
   * @see org.xtext.langage_while.ExprOr#getExn1()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Exn1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.ExprOr#getExn2 <em>Exn2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exn2</em>'.
   * @see org.xtext.langage_while.ExprOr#getExn2()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Exn2();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.ExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not</em>'.
   * @see org.xtext.langage_while.ExprNot
   * @generated
   */
  EClass getExprNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprNot#getExQ1 <em>Ex Q1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex Q1</em>'.
   * @see org.xtext.langage_while.ExprNot#getExQ1()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExQ1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprNot#getExQ2 <em>Ex Q2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex Q2</em>'.
   * @see org.xtext.langage_while.ExprNot#getExQ2()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExQ2();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.ExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Eq</em>'.
   * @see org.xtext.langage_while.ExprEq
   * @generated
   */
  EClass getExprEq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprEq#getExS1 <em>Ex S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex S1</em>'.
   * @see org.xtext.langage_while.ExprEq#getExS1()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExS1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprEq#getExS2 <em>Ex S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex S2</em>'.
   * @see org.xtext.langage_while.ExprEq#getExS2()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExS2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.ExprEq#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.ExprEq#getEx()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.VAR <em>VAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VAR</em>'.
   * @see org.xtext.langage_while.VAR
   * @generated
   */
  EClass getVAR();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.VAR#getBv <em>Bv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bv</em>'.
   * @see org.xtext.langage_while.VAR#getBv()
   * @see #getVAR()
   * @generated
   */
  EAttribute getVAR_Bv();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.VAR#getCf <em>Cf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cf</em>'.
   * @see org.xtext.langage_while.VAR#getCf()
   * @see #getVAR()
   * @generated
   */
  EAttribute getVAR_Cf();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.SYMB <em>SYMB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SYMB</em>'.
   * @see org.xtext.langage_while.SYMB
   * @generated
   */
  EClass getSYMB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.SYMB#getBs <em>Bs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bs</em>'.
   * @see org.xtext.langage_while.SYMB#getBs()
   * @see #getSYMB()
   * @generated
   */
  EAttribute getSYMB_Bs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.SYMB#getCf <em>Cf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cf</em>'.
   * @see org.xtext.langage_while.SYMB#getCf()
   * @see #getSYMB()
   * @generated
   */
  EAttribute getSYMB_Cf();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Langage_whileFactory getLangage_whileFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ModelImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Nn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NN = eINSTANCE.getModel_Nn();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ProgramImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__F = eINSTANCE.getProgram_F();

    /**
     * The meta object literal for the '<em><b>U</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__U = eINSTANCE.getProgram_U();

    /**
     * The meta object literal for the '<em><b>Pp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PP = eINSTANCE.getProgram_Pp();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.FunctionImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEF = eINSTANCE.getFunction_Def();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.DefinitionImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__IN = eINSTANCE.getDefinition_In();

    /**
     * The meta object literal for the '<em><b>Com</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__COM = eINSTANCE.getDefinition_Com();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__OUT = eINSTANCE.getDefinition_Out();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.InputImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__V = eINSTANCE.getInput_V();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.OutputImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__V = eINSTANCE.getOutput_V();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.CommandsImpl <em>Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.CommandsImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommands()
     * @generated
     */
    EClass COMMANDS = eINSTANCE.getCommands();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__C = eINSTANCE.getCommands_C();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.CommandImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Nop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NOP = eINSTANCE.getCommand_Nop();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ASSIGN = eINSTANCE.getCommand_Assign();

    /**
     * The meta object literal for the '<em><b>Wh</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__WH = eINSTANCE.getCommand_Wh();

    /**
     * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__FOR = eINSTANCE.getCommand_For();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__IF = eINSTANCE.getCommand_If();

    /**
     * The meta object literal for the '<em><b>Fore</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__FORE = eINSTANCE.getCommand_Fore();

    /**
     * The meta object literal for the '<em><b>Ifc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__IFC = eINSTANCE.getCommand_Ifc();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.AssignImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Vs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VS = eINSTANCE.getAssign_Vs();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__EX = eINSTANCE.getAssign_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.WhileImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EX = eINSTANCE.getWhile_Ex();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__C = eINSTANCE.getWhile_C();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ForImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__EX = eINSTANCE.getFor_Ex();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__C = eINSTANCE.getFor_C();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.IfImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EX = eINSTANCE.getIf_Ex();

    /**
     * The meta object literal for the '<em><b>Ct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CT = eINSTANCE.getIf_Ct();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CE = eINSTANCE.getIf_Ce();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ForeachImpl <em>Foreach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ForeachImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getForeach()
     * @generated
     */
    EClass FOREACH = eINSTANCE.getForeach();

    /**
     * The meta object literal for the '<em><b>Ex1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__EX1 = eINSTANCE.getForeach_Ex1();

    /**
     * The meta object literal for the '<em><b>Ex2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__EX2 = eINSTANCE.getForeach_Ex2();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__C = eINSTANCE.getForeach_C();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.IfconfortImpl <em>Ifconfort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.IfconfortImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getIfconfort()
     * @generated
     */
    EClass IFCONFORT = eINSTANCE.getIfconfort();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFCONFORT__EX = eINSTANCE.getIfconfort_Ex();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFCONFORT__C = eINSTANCE.getIfconfort_C();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.VarsImpl <em>Vars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.VarsImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVars()
     * @generated
     */
    EClass VARS = eINSTANCE.getVars();

    /**
     * The meta object literal for the '<em><b>Vs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARS__VS = eINSTANCE.getVars_Vs();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprsImpl <em>Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprsImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprs()
     * @generated
     */
    EClass EXPRS = eINSTANCE.getExprs();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EX = eINSTANCE.getExprs_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Exs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXS = eINSTANCE.getExpr_Exs();

    /**
     * The meta object literal for the '<em><b>Exa</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXA = eINSTANCE.getExpr_Exa();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprSimpleImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprSimple()
     * @generated
     */
    EClass EXPR_SIMPLE = eINSTANCE.getExprSimple();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__NIL = eINSTANCE.getExprSimple_Nil();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__V = eINSTANCE.getExprSimple_V();

    /**
     * The meta object literal for the '<em><b>Sym</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__SYM = eINSTANCE.getExprSimple_Sym();

    /**
     * The meta object literal for the '<em><b>Mot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__MOT = eINSTANCE.getExprSimple_Mot();

    /**
     * The meta object literal for the '<em><b>Lex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LEX = eINSTANCE.getExprSimple_Lex();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EX = eINSTANCE.getExprSimple_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.LExprImpl <em>LExpr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.LExprImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLExpr()
     * @generated
     */
    EClass LEXPR = eINSTANCE.getLExpr();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__E = eINSTANCE.getLExpr_E();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprAndImpl <em>Expr And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprAndImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprAnd()
     * @generated
     */
    EClass EXPR_AND = eINSTANCE.getExprAnd();

    /**
     * The meta object literal for the '<em><b>Exo1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXO1 = eINSTANCE.getExprAnd_Exo1();

    /**
     * The meta object literal for the '<em><b>Exo2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXO2 = eINSTANCE.getExprAnd_Exo2();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprOrImpl <em>Expr Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprOrImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprOr()
     * @generated
     */
    EClass EXPR_OR = eINSTANCE.getExprOr();

    /**
     * The meta object literal for the '<em><b>Exn1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXN1 = eINSTANCE.getExprOr_Exn1();

    /**
     * The meta object literal for the '<em><b>Exn2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXN2 = eINSTANCE.getExprOr_Exn2();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprNotImpl <em>Expr Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprNotImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprNot()
     * @generated
     */
    EClass EXPR_NOT = eINSTANCE.getExprNot();

    /**
     * The meta object literal for the '<em><b>Ex Q1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EX_Q1 = eINSTANCE.getExprNot_ExQ1();

    /**
     * The meta object literal for the '<em><b>Ex Q2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EX_Q2 = eINSTANCE.getExprNot_ExQ2();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.ExprEqImpl <em>Expr Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.ExprEqImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getExprEq()
     * @generated
     */
    EClass EXPR_EQ = eINSTANCE.getExprEq();

    /**
     * The meta object literal for the '<em><b>Ex S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EX_S1 = eINSTANCE.getExprEq_ExS1();

    /**
     * The meta object literal for the '<em><b>Ex S2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EX_S2 = eINSTANCE.getExprEq_ExS2();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EX = eINSTANCE.getExprEq_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.VARImpl <em>VAR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.VARImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVAR()
     * @generated
     */
    EClass VAR = eINSTANCE.getVAR();

    /**
     * The meta object literal for the '<em><b>Bv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__BV = eINSTANCE.getVAR_Bv();

    /**
     * The meta object literal for the '<em><b>Cf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__CF = eINSTANCE.getVAR_Cf();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.SYMBImpl <em>SYMB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.SYMBImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getSYMB()
     * @generated
     */
    EClass SYMB = eINSTANCE.getSYMB();

    /**
     * The meta object literal for the '<em><b>Bs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMB__BS = eINSTANCE.getSYMB_Bs();

    /**
     * The meta object literal for the '<em><b>Cf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMB__CF = eINSTANCE.getSYMB_Cf();

  }

} //Langage_whilePackage
