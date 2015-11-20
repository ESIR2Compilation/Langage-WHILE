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
   * The feature id for the '<em><b>Greetings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

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
  int DEF = 3;

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
  int INPUT = 4;

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
  int OUTPUT = 5;

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
  int COMMANDS = 6;

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
  int COMMAND = 7;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__E = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__L = 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__N = 3;

  /**
   * The feature id for the '<em><b>Ll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LL = 4;

  /**
   * The feature id for the '<em><b>Ee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EE = 5;

  /**
   * The feature id for the '<em><b>Cc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CC = 6;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__Z = 7;

  /**
   * The feature id for the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__K = 8;

  /**
   * The feature id for the '<em><b>Lc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LC = 9;

  /**
   * The feature id for the '<em><b>Hh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__HH = 10;

  /**
   * The feature id for the '<em><b>Tt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__TT = 11;

  /**
   * The feature id for the '<em><b>Vv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__VV = 12;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C1 = 13;

  /**
   * The feature id for the '<em><b>Ss</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__SS = 14;

  /**
   * The feature id for the '<em><b>Mm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__MM = 15;

  /**
   * The feature id for the '<em><b>Jj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__JJ = 16;

  /**
   * The feature id for the '<em><b>Kk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__KK = 17;

  /**
   * The feature id for the '<em><b>Hg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__HG = 18;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C2 = 19;

  /**
   * The feature id for the '<em><b>Gg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__GG = 20;

  /**
   * The feature id for the '<em><b>Ff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FF = 21;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__O = 22;

  /**
   * The feature id for the '<em><b>Dd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DD = 23;

  /**
   * The feature id for the '<em><b>Sq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__SQ = 24;

  /**
   * The feature id for the '<em><b>Wx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__WX = 25;

  /**
   * The feature id for the '<em><b>Lc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LC2 = 26;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__E1 = 27;

  /**
   * The feature id for the '<em><b>Lc3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LC3 = 28;

  /**
   * The feature id for the '<em><b>Lc4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LC4 = 29;

  /**
   * The feature id for the '<em><b>C3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__C3 = 30;

  /**
   * The feature id for the '<em><b>Lc5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__LC5 = 31;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 32;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.VarsImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getVars()
   * @generated
   */
  int VARS = 8;

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
  int EXPRS = 9;

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
  int EXPR = 10;

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
  int EXPRSIMPLE = 11;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__L = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__S = 1;

  /**
   * The feature id for the '<em><b>Yy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__YY = 2;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__B = 3;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__U = 4;

  /**
   * The feature id for the '<em><b>G</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__G = 5;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__V = 6;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE__W = 7;

  /**
   * The number of structural features of the '<em>EXPRSIMPLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRSIMPLE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LEXPRImpl <em>LEXPR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LEXPRImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLEXPR()
   * @generated
   */
  int LEXPR = 12;

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
  int EXPRAND = 13;

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
  int EXPROR = 14;

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
  int EXPRNOT = 15;

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
  int EXPREQ = 16;

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
  int VARIABLE = 17;

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
  int LCS = 18;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__L = EXPRSIMPLE__L;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__S = EXPRSIMPLE__S;

  /**
   * The feature id for the '<em><b>Yy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__YY = EXPRSIMPLE__YY;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__B = EXPRSIMPLE__B;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__U = EXPRSIMPLE__U;

  /**
   * The feature id for the '<em><b>G</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__G = EXPRSIMPLE__G;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__V = EXPRSIMPLE__V;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__W = EXPRSIMPLE__W;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__N = EXPRSIMPLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS__A = EXPRSIMPLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LCs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCS_FEATURE_COUNT = EXPRSIMPLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.langage_while.impl.LCImpl <em>LC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.langage_while.impl.LCImpl
   * @see org.xtext.langage_while.impl.Langage_whilePackageImpl#getLC()
   * @generated
   */
  int LC = 19;

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Greetings</em>'.
   * @see org.xtext.langage_while.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.xtext.langage_while.Command#getE()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_E();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.langage_while.Command#getL()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.langage_while.Command#getC()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.langage_while.Command#getN()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_N();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLl <em>Ll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ll</em>'.
   * @see org.xtext.langage_while.Command#getLl()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Ll();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getEe <em>Ee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ee</em>'.
   * @see org.xtext.langage_while.Command#getEe()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Ee();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cc</em>'.
   * @see org.xtext.langage_while.Command#getCc()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Cc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see org.xtext.langage_while.Command#getZ()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Z();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getK <em>K</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>K</em>'.
   * @see org.xtext.langage_while.Command#getK()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_K();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLc <em>Lc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc</em>'.
   * @see org.xtext.langage_while.Command#getLc()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Lc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getHh <em>Hh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hh</em>'.
   * @see org.xtext.langage_while.Command#getHh()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Hh();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getTt <em>Tt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tt</em>'.
   * @see org.xtext.langage_while.Command#getTt()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Tt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getVv <em>Vv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vv</em>'.
   * @see org.xtext.langage_while.Command#getVv()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Vv();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see org.xtext.langage_while.Command#getC1()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getSs <em>Ss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ss</em>'.
   * @see org.xtext.langage_while.Command#getSs()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Ss();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getMm <em>Mm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mm</em>'.
   * @see org.xtext.langage_while.Command#getMm()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Mm();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getJj <em>Jj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jj</em>'.
   * @see org.xtext.langage_while.Command#getJj()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Jj();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getKk <em>Kk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kk</em>'.
   * @see org.xtext.langage_while.Command#getKk()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Kk();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getHg <em>Hg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hg</em>'.
   * @see org.xtext.langage_while.Command#getHg()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Hg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see org.xtext.langage_while.Command#getC2()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getGg <em>Gg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gg</em>'.
   * @see org.xtext.langage_while.Command#getGg()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Gg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getFf <em>Ff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ff</em>'.
   * @see org.xtext.langage_while.Command#getFf()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Ff();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see org.xtext.langage_while.Command#getO()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_O();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getDd <em>Dd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dd</em>'.
   * @see org.xtext.langage_while.Command#getDd()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Dd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getSq <em>Sq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sq</em>'.
   * @see org.xtext.langage_while.Command#getSq()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Sq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getWx <em>Wx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wx</em>'.
   * @see org.xtext.langage_while.Command#getWx()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Wx();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLc2 <em>Lc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc2</em>'.
   * @see org.xtext.langage_while.Command#getLc2()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Lc2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.langage_while.Command#getE1()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLc3 <em>Lc3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc3</em>'.
   * @see org.xtext.langage_while.Command#getLc3()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Lc3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLc4 <em>Lc4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc4</em>'.
   * @see org.xtext.langage_while.Command#getLc4()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Lc4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getC3 <em>C3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C3</em>'.
   * @see org.xtext.langage_while.Command#getC3()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_C3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.Command#getLc5 <em>Lc5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lc5</em>'.
   * @see org.xtext.langage_while.Command#getLc5()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Lc5();

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
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getL()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_L();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.EXPRSIMPLE#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getS()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EAttribute getEXPRSIMPLE_S();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getYy <em>Yy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yy</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getYy()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_Yy();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getB()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_B();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getU()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_U();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>G</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getG()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_G();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.EXPRSIMPLE#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.xtext.langage_while.EXPRSIMPLE#getW()
   * @see #getEXPRSIMPLE()
   * @generated
   */
  EReference getEXPRSIMPLE_W();

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
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LCs#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.langage_while.LCs#getN()
   * @see #getLCs()
   * @generated
   */
  EReference getLCs_N();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.langage_while.LCs#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.xtext.langage_while.LCs#getA()
   * @see #getLCs()
   * @generated
   */
  EReference getLCs_A();

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
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

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
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__E = eINSTANCE.getCommand_E();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__L = eINSTANCE.getCommand_L();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C = eINSTANCE.getCommand_C();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__N = eINSTANCE.getCommand_N();

    /**
     * The meta object literal for the '<em><b>Ll</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LL = eINSTANCE.getCommand_Ll();

    /**
     * The meta object literal for the '<em><b>Ee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EE = eINSTANCE.getCommand_Ee();

    /**
     * The meta object literal for the '<em><b>Cc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__CC = eINSTANCE.getCommand_Cc();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__Z = eINSTANCE.getCommand_Z();

    /**
     * The meta object literal for the '<em><b>K</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__K = eINSTANCE.getCommand_K();

    /**
     * The meta object literal for the '<em><b>Lc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LC = eINSTANCE.getCommand_Lc();

    /**
     * The meta object literal for the '<em><b>Hh</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__HH = eINSTANCE.getCommand_Hh();

    /**
     * The meta object literal for the '<em><b>Tt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__TT = eINSTANCE.getCommand_Tt();

    /**
     * The meta object literal for the '<em><b>Vv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__VV = eINSTANCE.getCommand_Vv();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C1 = eINSTANCE.getCommand_C1();

    /**
     * The meta object literal for the '<em><b>Ss</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__SS = eINSTANCE.getCommand_Ss();

    /**
     * The meta object literal for the '<em><b>Mm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__MM = eINSTANCE.getCommand_Mm();

    /**
     * The meta object literal for the '<em><b>Jj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__JJ = eINSTANCE.getCommand_Jj();

    /**
     * The meta object literal for the '<em><b>Kk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__KK = eINSTANCE.getCommand_Kk();

    /**
     * The meta object literal for the '<em><b>Hg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__HG = eINSTANCE.getCommand_Hg();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C2 = eINSTANCE.getCommand_C2();

    /**
     * The meta object literal for the '<em><b>Gg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__GG = eINSTANCE.getCommand_Gg();

    /**
     * The meta object literal for the '<em><b>Ff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__FF = eINSTANCE.getCommand_Ff();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__O = eINSTANCE.getCommand_O();

    /**
     * The meta object literal for the '<em><b>Dd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__DD = eINSTANCE.getCommand_Dd();

    /**
     * The meta object literal for the '<em><b>Sq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__SQ = eINSTANCE.getCommand_Sq();

    /**
     * The meta object literal for the '<em><b>Wx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__WX = eINSTANCE.getCommand_Wx();

    /**
     * The meta object literal for the '<em><b>Lc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LC2 = eINSTANCE.getCommand_Lc2();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__E1 = eINSTANCE.getCommand_E1();

    /**
     * The meta object literal for the '<em><b>Lc3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LC3 = eINSTANCE.getCommand_Lc3();

    /**
     * The meta object literal for the '<em><b>Lc4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LC4 = eINSTANCE.getCommand_Lc4();

    /**
     * The meta object literal for the '<em><b>C3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__C3 = eINSTANCE.getCommand_C3();

    /**
     * The meta object literal for the '<em><b>Lc5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__LC5 = eINSTANCE.getCommand_Lc5();

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
     * The meta object literal for the '<em><b>L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__L = eINSTANCE.getEXPRSIMPLE_L();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__S = eINSTANCE.getEXPRSIMPLE_S();

    /**
     * The meta object literal for the '<em><b>Yy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__YY = eINSTANCE.getEXPRSIMPLE_Yy();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__B = eINSTANCE.getEXPRSIMPLE_B();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__U = eINSTANCE.getEXPRSIMPLE_U();

    /**
     * The meta object literal for the '<em><b>G</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__G = eINSTANCE.getEXPRSIMPLE_G();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRSIMPLE__V = eINSTANCE.getEXPRSIMPLE_V();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRSIMPLE__W = eINSTANCE.getEXPRSIMPLE_W();

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
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCS__N = eINSTANCE.getLCs_N();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCS__A = eINSTANCE.getLCs_A();

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
