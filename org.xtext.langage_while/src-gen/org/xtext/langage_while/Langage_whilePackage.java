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
   * The feature id for the '<em><b>Prog</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROG = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.FunctionImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__N = 0;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NOM = 1;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__T = 2;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__D = 3;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.DefImpl <em>Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.DefImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getDef()
   * @generated
   */
  int DEF = 2;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__L = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__IN = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__Z = 2;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__V = 3;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__S = 4;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__U = 5;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__O = 6;

  /**
   * The number of structural features of the '<em>Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.InputImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getInput()
   * @generated
   */
  int INPUT = 3;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__V = 0;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__Z = 1;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__IN = 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__Y = 3;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.OutputImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 4;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__N = 0;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__Q = 1;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__O = 2;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__S = 3;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.CommandsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 5;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__A = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__L = 1;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__S = 2;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.CommandImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 6;

  /**
   * The feature id for the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NOP = 0;

  /**
   * The feature id for the '<em><b>Affect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__AFFECT = 1;

  /**
   * The feature id for the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__WH = 2;

  /**
   * The feature id for the '<em><b>Forr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FORR = 3;

  /**
   * The feature id for the '<em><b>Fore</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FORE = 4;

  /**
   * The feature id for the '<em><b>Iff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__IFF = 5;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.AssignImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 7;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__E = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__L = 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__C = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__N = 3;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.WhileImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getWhile()
   * @generated
   */
  int WHILE = 8;

  /**
   * The feature id for the '<em><b>Ll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__LL = 0;

  /**
   * The feature id for the '<em><b>Ee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EE = 1;

  /**
   * The feature id for the '<em><b>Cc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CC = 2;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__Z = 3;

  /**
   * The feature id for the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__K = 4;

  /**
   * The feature id for the '<em><b>Lc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__LC = 5;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ForImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getFor()
   * @generated
   */
  int FOR = 9;

  /**
   * The feature id for the '<em><b>Cc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CC = 0;

  /**
   * The feature id for the '<em><b>Hh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__HH = 1;

  /**
   * The feature id for the '<em><b>Tt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__TT = 2;

  /**
   * The feature id for the '<em><b>Vv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__VV = 3;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__C1 = 4;

  /**
   * The feature id for the '<em><b>Ss</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__SS = 5;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.IfImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getIf()
   * @generated
   */
  int IF = 10;

  /**
   * The feature id for the '<em><b>Mm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__MM = 0;

  /**
   * The feature id for the '<em><b>Jj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__JJ = 1;

  /**
   * The feature id for the '<em><b>Kk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__KK = 2;

  /**
   * The feature id for the '<em><b>Hg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__HG = 3;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__C2 = 4;

  /**
   * The feature id for the '<em><b>Gg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__GG = 5;

  /**
   * The feature id for the '<em><b>Ff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__FF = 6;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__O = 7;

  /**
   * The feature id for the '<em><b>Dd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__DD = 8;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.ForeachImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 11;

  /**
   * The feature id for the '<em><b>Sq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__SQ = 0;

  /**
   * The feature id for the '<em><b>Wx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__WX = 1;

  /**
   * The feature id for the '<em><b>Lc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__LC = 2;

  /**
   * The feature id for the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__LC2 = 3;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__E1 = 4;

  /**
   * The feature id for the '<em><b>Lc3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__LC3 = 5;

  /**
   * The feature id for the '<em><b>Lc4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__LC4 = 6;

  /**
   * The feature id for the '<em><b>C3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__C3 = 7;

  /**
   * The feature id for the '<em><b>Lc5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__LC5 = 8;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.VarsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVars()
   * @generated
   */
  int VARS = 12;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__A = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__L = 1;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__U = 2;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRSImpl <em>EXPRS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRSImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRS()
   * @generated
   */
  int EXPRS = 13;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__F = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__L = 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__E2 = 2;

  /**
   * The number of structural features of the '<em>EXPRS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRImpl <em>EXPR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPR()
   * @generated
   */
  int EXPR = 14;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__E1 = 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EX = 1;

  /**
   * The number of structural features of the '<em>EXPR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl <em>EXPRSIMPLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRSIMPLEImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRSIMPLE()
   * @generated
   */
  int EXPRSIMPLE = 15;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__NIL = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__V = 1;

  /**
   * The feature id for the '<em><b>Sym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__SYM = 2;

  /**
   * The feature id for the '<em><b>Mot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__MOT = 3;

  /**
   * The feature id for the '<em><b>Lex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__LEX = 4;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__L = 5;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__EX = 6;

  /**
   * The number of structural features of the '<em>EXPRSIMPLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LEXPRImpl <em>LEXPR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LEXPRImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLEXPR()
   * @generated
   */
  int LEXPR = 16;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__F = 0;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__N = 1;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__T = 2;

  /**
   * The number of structural features of the '<em>LEXPR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRANDImpl <em>EXPRAND</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRANDImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRAND()
   * @generated
   */
  int EXPRAND = 17;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRAND__F = 0;

  /**
   * The feature id for the '<em><b>Lc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRAND__LC1 = 1;

  /**
   * The feature id for the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRAND__LC2 = 2;

  /**
   * The feature id for the '<em><b>Ee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRAND__EE = 3;

  /**
   * The number of structural features of the '<em>EXPRAND</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRAND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRORImpl <em>EXPROR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRORImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPROR()
   * @generated
   */
  int EXPROR = 18;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPROR__E1 = 0;

  /**
   * The feature id for the '<em><b>Lc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPROR__LC1 = 1;

  /**
   * The feature id for the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPROR__LC2 = 2;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPROR__E2 = 3;

  /**
   * The number of structural features of the '<em>EXPROR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPROR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPRNOTImpl <em>EXPRNOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPRNOTImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRNOT()
   * @generated
   */
  int EXPRNOT = 19;

  /**
   * The feature id for the '<em><b>Lc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRNOT__LC1 = 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRNOT__E1 = 1;

  /**
   * The number of structural features of the '<em>EXPRNOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRNOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.EXPREQImpl <em>EXPREQ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.EXPREQImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPREQ()
   * @generated
   */
  int EXPREQ = 20;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ__E1 = 0;

  /**
   * The feature id for the '<em><b>Ccc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ__CCC = 1;

  /**
   * The feature id for the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ__LC2 = 2;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ__W = 3;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ__EX = 4;

  /**
   * The number of structural features of the '<em>EXPREQ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPREQ_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.VariableImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 21;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__N = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LCsImpl <em>LCs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LCsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLCs()
   * @generated
   */
  int LCS = 22;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__L = 0;

  /**
   * The number of structural features of the '<em>LCs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LCImpl <em>LC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LCImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLC()
   * @generated
   */
  int LC = 23;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LC__A = 0;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LC__Z = 1;

  /**
   * The feature id for the '<em><b>E</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LC__E = 2;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LC__R = 3;

  /**
   * The number of structural features of the '<em>LC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LC_FEATURE_COUNT = 4;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.langage_while.Model#getProg <em>Prog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prog</em>'.
   * @see org.xtext.langage_while.Model#getProg()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Prog();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Function#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.langage_while.Function#getN()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_N();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Function#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see org.xtext.langage_while.Function#getNom()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Nom();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Function#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.xtext.langage_while.Function#getT()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_T();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Function#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see org.xtext.langage_while.Function#getD()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_D();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Def <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def</em>'.
   * @see org.xtext.langage_while.Def
   * @generated
   */
  EClass getDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.Def#getL()
   * @see #getDef()
   * @generated
   */
  EReference getDef_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.langage_while.Def#getIn()
   * @see #getDef()
   * @generated
   */
  EReference getDef_In();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see org.xtext.langage_while.Def#getZ()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Z();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.xtext.langage_while.Def#getV()
   * @see #getDef()
   * @generated
   */
  EReference getDef_V();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.xtext.langage_while.Def#getS()
   * @see #getDef()
   * @generated
   */
  EReference getDef_S();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.xtext.langage_while.Def#getU()
   * @see #getDef()
   * @generated
   */
  EReference getDef_U();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Def#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see org.xtext.langage_while.Def#getO()
   * @see #getDef()
   * @generated
   */
  EReference getDef_O();

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
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Input#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.xtext.langage_while.Input#getV()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_V();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Input#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see org.xtext.langage_while.Input#getZ()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Z();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Input#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.langage_while.Input#getIn()
   * @see #getInput()
   * @generated
   */
  EReference getInput_In();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Input#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.langage_while.Input#getY()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Y();

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
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Output#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.xtext.langage_while.Output#getN()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_N();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Output#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see org.xtext.langage_while.Output#getQ()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Q();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Output#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see org.xtext.langage_while.Output#getO()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_O();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Output#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.xtext.langage_while.Output#getS()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_S();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Commands#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.xtext.langage_while.Commands#getA()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_A();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Commands#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.Commands#getL()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Commands#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.xtext.langage_while.Commands#getS()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_S();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getAffect <em>Affect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Affect</em>'.
   * @see org.xtext.langage_while.Command#getAffect()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Affect();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getForr <em>Forr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forr</em>'.
   * @see org.xtext.langage_while.Command#getForr()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Forr();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getIff <em>Iff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iff</em>'.
   * @see org.xtext.langage_while.Command#getIff()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Iff();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.xtext.langage_while.Assign#getE()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_E();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.Assign#getL()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.Assign#getC()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_C();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Assign#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.langage_while.Assign#getN()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_N();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getLl <em>Ll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ll</em>'.
   * @see org.xtext.langage_while.While#getLl()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ll();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getEe <em>Ee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ee</em>'.
   * @see org.xtext.langage_while.While#getEe()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ee();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cc</em>'.
   * @see org.xtext.langage_while.While#getCc()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Cc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see org.xtext.langage_while.While#getZ()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Z();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getK <em>K</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>K</em>'.
   * @see org.xtext.langage_while.While#getK()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_K();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.While#getLc <em>Lc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc</em>'.
   * @see org.xtext.langage_while.While#getLc()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Lc();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cc</em>'.
   * @see org.xtext.langage_while.For#getCc()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Cc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getHh <em>Hh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hh</em>'.
   * @see org.xtext.langage_while.For#getHh()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Hh();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getTt <em>Tt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tt</em>'.
   * @see org.xtext.langage_while.For#getTt()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Tt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getVv <em>Vv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vv</em>'.
   * @see org.xtext.langage_while.For#getVv()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Vv();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see org.xtext.langage_while.For#getC1()
   * @see #getFor()
   * @generated
   */
  EReference getFor_C1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.For#getSs <em>Ss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ss</em>'.
   * @see org.xtext.langage_while.For#getSs()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Ss();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getMm <em>Mm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mm</em>'.
   * @see org.xtext.langage_while.If#getMm()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Mm();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getJj <em>Jj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jj</em>'.
   * @see org.xtext.langage_while.If#getJj()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Jj();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getKk <em>Kk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kk</em>'.
   * @see org.xtext.langage_while.If#getKk()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Kk();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getHg <em>Hg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hg</em>'.
   * @see org.xtext.langage_while.If#getHg()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Hg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see org.xtext.langage_while.If#getC2()
   * @see #getIf()
   * @generated
   */
  EReference getIf_C2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getGg <em>Gg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gg</em>'.
   * @see org.xtext.langage_while.If#getGg()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Gg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getFf <em>Ff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ff</em>'.
   * @see org.xtext.langage_while.If#getFf()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Ff();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see org.xtext.langage_while.If#getO()
   * @see #getIf()
   * @generated
   */
  EReference getIf_O();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.If#getDd <em>Dd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dd</em>'.
   * @see org.xtext.langage_while.If#getDd()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Dd();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getSq <em>Sq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sq</em>'.
   * @see org.xtext.langage_while.Foreach#getSq()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Sq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getWx <em>Wx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wx</em>'.
   * @see org.xtext.langage_while.Foreach#getWx()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Wx();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getLc <em>Lc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc</em>'.
   * @see org.xtext.langage_while.Foreach#getLc()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Lc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getLc2 <em>Lc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc2</em>'.
   * @see org.xtext.langage_while.Foreach#getLc2()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Lc2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.Foreach#getE1()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getLc3 <em>Lc3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc3</em>'.
   * @see org.xtext.langage_while.Foreach#getLc3()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Lc3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getLc4 <em>Lc4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc4</em>'.
   * @see org.xtext.langage_while.Foreach#getLc4()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Lc4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getC3 <em>C3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C3</em>'.
   * @see org.xtext.langage_while.Foreach#getC3()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_C3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Foreach#getLc5 <em>Lc5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc5</em>'.
   * @see org.xtext.langage_while.Foreach#getLc5()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Lc5();

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
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Vars#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see org.xtext.langage_while.Vars#getA()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_A();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Vars#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.Vars#getL()
   * @see #getVars()
   * @generated
   */
  EReference getVars_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Vars#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.xtext.langage_while.Vars#getU()
   * @see #getVars()
   * @generated
   */
  EReference getVars_U();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPRS <em>EXPRS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRS</em>'.
   * @see org.xtext.langage_while.EXPRS
   * @generated
   */
  EClass getEXPRS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRS#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.xtext.langage_while.EXPRS#getF()
   * @see #getEXPRS()
   * @generated
   */
  EReference getEXPRS_F();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRS#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.EXPRS#getL()
   * @see #getEXPRS()
   * @generated
   */
  EReference getEXPRS_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRS#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.langage_while.EXPRS#getE2()
   * @see #getEXPRS()
   * @generated
   */
  EReference getEXPRS_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPR <em>EXPR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPR</em>'.
   * @see org.xtext.langage_while.EXPR
   * @generated
   */
  EClass getEXPR();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPR#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.EXPR#getE1()
   * @see #getEXPR()
   * @generated
   */
  EReference getEXPR_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPR#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.EXPR#getEx()
   * @see #getEXPR()
   * @generated
   */
  EReference getEXPR_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPRSIMPLE <em>EXPRSIMPLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRSIMPLE</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE
   * @generated
   */
  EClass getEXPRSIMPLE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getNil()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_Nil();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getV()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_V();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getSym <em>Sym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sym</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getSym()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_Sym();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getMot <em>Mot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mot</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getMot()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_Mot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getLex <em>Lex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lex</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getLex()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_Lex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getL()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getEx()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.LEXPR <em>LEXPR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEXPR</em>'.
   * @see org.xtext.langage_while.LEXPR
   * @generated
   */
  EClass getLEXPR();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LEXPR#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.xtext.langage_while.LEXPR#getF()
   * @see #getLEXPR()
   * @generated
   */
  EReference getLEXPR_F();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LEXPR#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.langage_while.LEXPR#getN()
   * @see #getLEXPR()
   * @generated
   */
  EReference getLEXPR_N();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LEXPR#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.xtext.langage_while.LEXPR#getT()
   * @see #getLEXPR()
   * @generated
   */
  EReference getLEXPR_T();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPRAND <em>EXPRAND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRAND</em>'.
   * @see org.xtext.langage_while.EXPRAND
   * @generated
   */
  EClass getEXPRAND();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRAND#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.xtext.langage_while.EXPRAND#getF()
   * @see #getEXPRAND()
   * @generated
   */
  EReference getEXPRAND_F();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRAND#getLc1 <em>Lc1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc1</em>'.
   * @see org.xtext.langage_while.EXPRAND#getLc1()
   * @see #getEXPRAND()
   * @generated
   */
  EReference getEXPRAND_Lc1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRAND#getLc2 <em>Lc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc2</em>'.
   * @see org.xtext.langage_while.EXPRAND#getLc2()
   * @see #getEXPRAND()
   * @generated
   */
  EReference getEXPRAND_Lc2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRAND#getEe <em>Ee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ee</em>'.
   * @see org.xtext.langage_while.EXPRAND#getEe()
   * @see #getEXPRAND()
   * @generated
   */
  EReference getEXPRAND_Ee();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPROR <em>EXPROR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPROR</em>'.
   * @see org.xtext.langage_while.EXPROR
   * @generated
   */
  EClass getEXPROR();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPROR#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.EXPROR#getE1()
   * @see #getEXPROR()
   * @generated
   */
  EReference getEXPROR_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPROR#getLc1 <em>Lc1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc1</em>'.
   * @see org.xtext.langage_while.EXPROR#getLc1()
   * @see #getEXPROR()
   * @generated
   */
  EReference getEXPROR_Lc1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPROR#getLc2 <em>Lc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc2</em>'.
   * @see org.xtext.langage_while.EXPROR#getLc2()
   * @see #getEXPROR()
   * @generated
   */
  EReference getEXPROR_Lc2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPROR#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.langage_while.EXPROR#getE2()
   * @see #getEXPROR()
   * @generated
   */
  EReference getEXPROR_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPRNOT <em>EXPRNOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRNOT</em>'.
   * @see org.xtext.langage_while.EXPRNOT
   * @generated
   */
  EClass getEXPRNOT();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRNOT#getLc1 <em>Lc1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc1</em>'.
   * @see org.xtext.langage_while.EXPRNOT#getLc1()
   * @see #getEXPRNOT()
   * @generated
   */
  EReference getEXPRNOT_Lc1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRNOT#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.EXPRNOT#getE1()
   * @see #getEXPRNOT()
   * @generated
   */
  EReference getEXPRNOT_E1();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.EXPREQ <em>EXPREQ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPREQ</em>'.
   * @see org.xtext.langage_while.EXPREQ
   * @generated
   */
  EClass getEXPREQ();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPREQ#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.EXPREQ#getE1()
   * @see #getEXPREQ()
   * @generated
   */
  EReference getEXPREQ_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPREQ#getCcc <em>Ccc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ccc</em>'.
   * @see org.xtext.langage_while.EXPREQ#getCcc()
   * @see #getEXPREQ()
   * @generated
   */
  EReference getEXPREQ_Ccc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPREQ#getLc2 <em>Lc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc2</em>'.
   * @see org.xtext.langage_while.EXPREQ#getLc2()
   * @see #getEXPREQ()
   * @generated
   */
  EReference getEXPREQ_Lc2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPREQ#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.xtext.langage_while.EXPREQ#getW()
   * @see #getEXPREQ()
   * @generated
   */
  EReference getEXPREQ_W();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPREQ#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.langage_while.EXPREQ#getEx()
   * @see #getEXPREQ()
   * @generated
   */
  EReference getEXPREQ_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.langage_while.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Variable#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.xtext.langage_while.Variable#getN()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_N();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.LCs <em>LCs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LCs</em>'.
   * @see org.xtext.langage_while.LCs
   * @generated
   */
  EClass getLCs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LCs#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.LCs#getL()
   * @see #getLCs()
   * @generated
   */
  EReference getLCs_L();

  /**
   * Returns the meta object for class '{@link org.xtext.langage_while.LC <em>LC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LC</em>'.
   * @see org.xtext.langage_while.LC
   * @generated
   */
  EClass getLC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.LC#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see org.xtext.langage_while.LC#getA()
   * @see #getLC()
   * @generated
   */
  EAttribute getLC_A();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.LC#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.xtext.langage_while.LC#getZ()
   * @see #getLC()
   * @generated
   */
  EAttribute getLC_Z();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.LC#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>E</em>'.
   * @see org.xtext.langage_while.LC#getE()
   * @see #getLC()
   * @generated
   */
  EAttribute getLC_E();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.LC#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.xtext.langage_while.LC#getR()
   * @see #getLC()
   * @generated
   */
  EAttribute getLC_R();

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
     * The meta object literal for the '<em><b>Prog</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROG = eINSTANCE.getModel_Prog();

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
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__N = eINSTANCE.getFunction_N();

    /**
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NOM = eINSTANCE.getFunction_Nom();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__T = eINSTANCE.getFunction_T();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__D = eINSTANCE.getFunction_D();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.DefImpl <em>Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.DefImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getDef()
     * @generated
     */
    EClass DEF = eINSTANCE.getDef();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__L = eINSTANCE.getDef_L();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__IN = eINSTANCE.getDef_In();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__Z = eINSTANCE.getDef_Z();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__V = eINSTANCE.getDef_V();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__S = eINSTANCE.getDef_S();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__U = eINSTANCE.getDef_U();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__O = eINSTANCE.getDef_O();

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
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__V = eINSTANCE.getInput_V();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__Z = eINSTANCE.getInput_Z();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__IN = eINSTANCE.getInput_In();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__Y = eINSTANCE.getInput_Y();

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
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__N = eINSTANCE.getOutput_N();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__Q = eINSTANCE.getOutput_Q();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__O = eINSTANCE.getOutput_O();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__S = eINSTANCE.getOutput_S();

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
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__A = eINSTANCE.getCommands_A();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__L = eINSTANCE.getCommands_L();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__S = eINSTANCE.getCommands_S();

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
     * The meta object literal for the '<em><b>Affect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__AFFECT = eINSTANCE.getCommand_Affect();

    /**
     * The meta object literal for the '<em><b>Wh</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__WH = eINSTANCE.getCommand_Wh();

    /**
     * The meta object literal for the '<em><b>Forr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__FORR = eINSTANCE.getCommand_Forr();

    /**
     * The meta object literal for the '<em><b>Fore</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__FORE = eINSTANCE.getCommand_Fore();

    /**
     * The meta object literal for the '<em><b>Iff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__IFF = eINSTANCE.getCommand_Iff();

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
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__E = eINSTANCE.getAssign_E();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__L = eINSTANCE.getAssign_L();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__C = eINSTANCE.getAssign_C();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__N = eINSTANCE.getAssign_N();

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
     * The meta object literal for the '<em><b>Ll</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__LL = eINSTANCE.getWhile_Ll();

    /**
     * The meta object literal for the '<em><b>Ee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EE = eINSTANCE.getWhile_Ee();

    /**
     * The meta object literal for the '<em><b>Cc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CC = eINSTANCE.getWhile_Cc();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__Z = eINSTANCE.getWhile_Z();

    /**
     * The meta object literal for the '<em><b>K</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__K = eINSTANCE.getWhile_K();

    /**
     * The meta object literal for the '<em><b>Lc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__LC = eINSTANCE.getWhile_Lc();

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
     * The meta object literal for the '<em><b>Cc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__CC = eINSTANCE.getFor_Cc();

    /**
     * The meta object literal for the '<em><b>Hh</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__HH = eINSTANCE.getFor_Hh();

    /**
     * The meta object literal for the '<em><b>Tt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__TT = eINSTANCE.getFor_Tt();

    /**
     * The meta object literal for the '<em><b>Vv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__VV = eINSTANCE.getFor_Vv();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__C1 = eINSTANCE.getFor_C1();

    /**
     * The meta object literal for the '<em><b>Ss</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__SS = eINSTANCE.getFor_Ss();

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
     * The meta object literal for the '<em><b>Mm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__MM = eINSTANCE.getIf_Mm();

    /**
     * The meta object literal for the '<em><b>Jj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__JJ = eINSTANCE.getIf_Jj();

    /**
     * The meta object literal for the '<em><b>Kk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__KK = eINSTANCE.getIf_Kk();

    /**
     * The meta object literal for the '<em><b>Hg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__HG = eINSTANCE.getIf_Hg();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__C2 = eINSTANCE.getIf_C2();

    /**
     * The meta object literal for the '<em><b>Gg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__GG = eINSTANCE.getIf_Gg();

    /**
     * The meta object literal for the '<em><b>Ff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__FF = eINSTANCE.getIf_Ff();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__O = eINSTANCE.getIf_O();

    /**
     * The meta object literal for the '<em><b>Dd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__DD = eINSTANCE.getIf_Dd();

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
     * The meta object literal for the '<em><b>Sq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__SQ = eINSTANCE.getForeach_Sq();

    /**
     * The meta object literal for the '<em><b>Wx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__WX = eINSTANCE.getForeach_Wx();

    /**
     * The meta object literal for the '<em><b>Lc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__LC = eINSTANCE.getForeach_Lc();

    /**
     * The meta object literal for the '<em><b>Lc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__LC2 = eINSTANCE.getForeach_Lc2();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__E1 = eINSTANCE.getForeach_E1();

    /**
     * The meta object literal for the '<em><b>Lc3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__LC3 = eINSTANCE.getForeach_Lc3();

    /**
     * The meta object literal for the '<em><b>Lc4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__LC4 = eINSTANCE.getForeach_Lc4();

    /**
     * The meta object literal for the '<em><b>C3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__C3 = eINSTANCE.getForeach_C3();

    /**
     * The meta object literal for the '<em><b>Lc5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__LC5 = eINSTANCE.getForeach_Lc5();

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
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__A = eINSTANCE.getVars_A();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARS__L = eINSTANCE.getVars_L();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARS__U = eINSTANCE.getVars_U();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRSImpl <em>EXPRS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRSImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRS()
     * @generated
     */
    EClass EXPRS = eINSTANCE.getEXPRS();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__F = eINSTANCE.getEXPRS_F();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__L = eINSTANCE.getEXPRS_L();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__E2 = eINSTANCE.getEXPRS_E2();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRImpl <em>EXPR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPR()
     * @generated
     */
    EClass EXPR = eINSTANCE.getEXPR();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__E1 = eINSTANCE.getEXPR_E1();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EX = eINSTANCE.getEXPR_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRSIMPLEImpl <em>EXPRSIMPLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRSIMPLEImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRSIMPLE()
     * @generated
     */
    EClass EXPRSIMPLE = eINSTANCE.getEXPRSIMPLE();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__NIL = eINSTANCE.getEXPRSIMPLE_Nil();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__V = eINSTANCE.getEXPRSIMPLE_V();

    /**
     * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__SYM = eINSTANCE.getEXPRSIMPLE_Sym();

    /**
     * The meta object literal for the '<em><b>Mot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__MOT = eINSTANCE.getEXPRSIMPLE_Mot();

    /**
     * The meta object literal for the '<em><b>Lex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__LEX = eINSTANCE.getEXPRSIMPLE_Lex();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__L = eINSTANCE.getEXPRSIMPLE_L();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__EX = eINSTANCE.getEXPRSIMPLE_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.LEXPRImpl <em>LEXPR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.LEXPRImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLEXPR()
     * @generated
     */
    EClass LEXPR = eINSTANCE.getLEXPR();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__F = eINSTANCE.getLEXPR_F();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__N = eINSTANCE.getLEXPR_N();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__T = eINSTANCE.getLEXPR_T();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRANDImpl <em>EXPRAND</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRANDImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRAND()
     * @generated
     */
    EClass EXPRAND = eINSTANCE.getEXPRAND();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRAND__F = eINSTANCE.getEXPRAND_F();

    /**
     * The meta object literal for the '<em><b>Lc1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRAND__LC1 = eINSTANCE.getEXPRAND_Lc1();

    /**
     * The meta object literal for the '<em><b>Lc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRAND__LC2 = eINSTANCE.getEXPRAND_Lc2();

    /**
     * The meta object literal for the '<em><b>Ee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRAND__EE = eINSTANCE.getEXPRAND_Ee();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRORImpl <em>EXPROR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRORImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPROR()
     * @generated
     */
    EClass EXPROR = eINSTANCE.getEXPROR();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPROR__E1 = eINSTANCE.getEXPROR_E1();

    /**
     * The meta object literal for the '<em><b>Lc1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPROR__LC1 = eINSTANCE.getEXPROR_Lc1();

    /**
     * The meta object literal for the '<em><b>Lc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPROR__LC2 = eINSTANCE.getEXPROR_Lc2();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPROR__E2 = eINSTANCE.getEXPROR_E2();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPRNOTImpl <em>EXPRNOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPRNOTImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPRNOT()
     * @generated
     */
    EClass EXPRNOT = eINSTANCE.getEXPRNOT();

    /**
     * The meta object literal for the '<em><b>Lc1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRNOT__LC1 = eINSTANCE.getEXPRNOT_Lc1();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRNOT__E1 = eINSTANCE.getEXPRNOT_E1();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.EXPREQImpl <em>EXPREQ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.EXPREQImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getEXPREQ()
     * @generated
     */
    EClass EXPREQ = eINSTANCE.getEXPREQ();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPREQ__E1 = eINSTANCE.getEXPREQ_E1();

    /**
     * The meta object literal for the '<em><b>Ccc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPREQ__CCC = eINSTANCE.getEXPREQ_Ccc();

    /**
     * The meta object literal for the '<em><b>Lc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPREQ__LC2 = eINSTANCE.getEXPREQ_Lc2();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPREQ__W = eINSTANCE.getEXPREQ_W();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPREQ__EX = eINSTANCE.getEXPREQ_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.VariableImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__N = eINSTANCE.getVariable_N();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.LCsImpl <em>LCs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.LCsImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLCs()
     * @generated
     */
    EClass LCS = eINSTANCE.getLCs();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCS__L = eINSTANCE.getLCs_L();

    /**
     * The meta object literal for the '{@link org.xtext.langage_while.impl.LCImpl <em>LC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.langage_while.impl.LCImpl
     * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLC()
     * @generated
     */
    EClass LC = eINSTANCE.getLC();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LC__A = eINSTANCE.getLC_A();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LC__Z = eINSTANCE.getLC_Z();

    /**
     * The meta object literal for the '<em><b>E</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LC__E = eINSTANCE.getLC_E();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LC__R = eINSTANCE.getLC_R();

  }

} //Langage_whilePackage
