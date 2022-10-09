/**
 */
package se.kth.datacloud.dsl.dsl;

import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.DataSink#getDataTarget <em>Data Target</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getDataSink()
 * @model
 * @generated
 */
public interface DataSink extends StepTemplate {
	/**
	 * Returns the value of the '<em><b>Data Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Target</em>' containment reference.
	 * @see #setDataTarget(InputDataSource)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getDataSink_DataTarget()
	 * @model containment="true"
	 * @generated
	 */
	InputDataSource getDataTarget();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.DataSink#getDataTarget <em>Data Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Target</em>' containment reference.
	 * @see #getDataTarget()
	 * @generated
	 */
	void setDataTarget(InputDataSource value);

} // DataSink
