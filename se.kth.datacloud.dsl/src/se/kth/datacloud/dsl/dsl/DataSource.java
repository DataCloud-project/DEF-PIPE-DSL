/**
 */
package se.kth.datacloud.dsl.dsl;

import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.DataSource#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends StepTemplate {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(InputDataSource)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getDataSource_DataSource()
	 * @model containment="true"
	 * @generated
	 */
	InputDataSource getDataSource();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.DataSource#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(InputDataSource value);

} // DataSource
