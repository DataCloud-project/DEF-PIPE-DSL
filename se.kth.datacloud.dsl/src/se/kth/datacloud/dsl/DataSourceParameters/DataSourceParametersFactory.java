/**
 */
package se.kth.datacloud.dsl.DataSourceParameters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage
 * @generated
 */
public interface DataSourceParametersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSourceParametersFactory eINSTANCE = se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Data Source</em>'.
	 * @generated
	 */
	InputDataSource createInputDataSource();

	/**
	 * Returns a new object of class '<em>Parameter Value Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Value Types</em>'.
	 * @generated
	 */
	ParameterValueTypes createParameterValueTypes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataSourceParametersPackage getDataSourceParametersPackage();

} //DataSourceParametersFactory
