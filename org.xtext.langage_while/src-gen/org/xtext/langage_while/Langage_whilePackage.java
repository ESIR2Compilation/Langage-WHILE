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
   * The feature id for the '<em><b>Pp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PP = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NOM = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__D = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__IN = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__C = 1;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__O = 2;

  /**
   * The number of structural features of the '<em>Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__IN = 0;

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
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__O = 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 1;


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
   * Returns the meta object for the attribute '{@link org.xtext.langage_while.Def#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C</em>'.
   * @see org.xtext.langage_while.Def#getC()
   * @see #getDef()
   * @generated
   */
  EAttribute getDef_C();

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
   * Returns the meta object for class '{@link org.xtext.langage_while.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.langage_while.Output
   * @generated
   */
  EClass getOutput();

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
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NOM = eINSTANCE.getFunction_Nom();

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
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__IN = eINSTANCE.getDef_In();

    /**
     * The meta object literal for the '<em><b>C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF__C = eINSTANCE.getDef_C();

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
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__IN = eINSTANCE.getInput_In();

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
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__O = eINSTANCE.getOutput_O();

  }

} //Langage_whilePackage
