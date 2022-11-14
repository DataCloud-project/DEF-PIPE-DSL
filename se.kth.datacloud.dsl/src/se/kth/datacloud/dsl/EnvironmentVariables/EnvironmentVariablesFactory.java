/**
 */
package se.kth.datacloud.dsl.EnvironmentVariables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage
 * @generated
 */
public interface EnvironmentVariablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentVariablesFactory eINSTANCE = se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Environment Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Variable</em>'.
	 * @generated
	 */
	EnvironmentVariable createEnvironmentVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvironmentVariablesPackage getEnvironmentVariablesPackage();

} //EnvironmentVariablesFactory
