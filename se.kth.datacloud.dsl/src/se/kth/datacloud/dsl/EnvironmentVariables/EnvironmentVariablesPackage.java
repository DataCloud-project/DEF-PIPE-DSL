/**
 */
package se.kth.datacloud.dsl.EnvironmentVariables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesFactory
 * @model kind="package"
 * @generated
 */
public interface EnvironmentVariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EnvironmentVariables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/EnvironmentVariables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EnvironmentVariables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentVariablesPackage eINSTANCE = se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariableImpl
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl#getEnvironmentVariable()
	 * @generated
	 */
	int ENVIRONMENT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable</em>'.
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable
	 * @generated
	 */
	EClass getEnvironmentVariable();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getValue()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getName()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentVariablesFactory getEnvironmentVariablesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariableImpl
		 * @see se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl#getEnvironmentVariable()
		 * @generated
		 */
		EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__VALUE = eINSTANCE.getEnvironmentVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__NAME = eINSTANCE.getEnvironmentVariable_Name();

	}

} //EnvironmentVariablesPackage
