/**
 */
package se.kth.datacloud.dsl.DataSourceParameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getValue <em>Value</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getDatasourcecredentials <em>Datasourcecredentials</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getInputDataSource()
 * @model
 * @generated
 */
public interface InputDataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ParameterValueTypes)
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getInputDataSource_Value()
	 * @model containment="true"
	 * @generated
	 */
	ParameterValueTypes getValue();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ParameterValueTypes value);

	/**
	 * Returns the value of the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasourcecredentials</em>' containment reference.
	 * @see #setDatasourcecredentials(DataSourceCredentials)
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getInputDataSource_Datasourcecredentials()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSourceCredentials getDatasourcecredentials();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getDatasourcecredentials <em>Datasourcecredentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasourcecredentials</em>' containment reference.
	 * @see #getDatasourcecredentials()
	 * @generated
	 */
	void setDatasourcecredentials(DataSourceCredentials value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getInputDataSource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InputDataSource
