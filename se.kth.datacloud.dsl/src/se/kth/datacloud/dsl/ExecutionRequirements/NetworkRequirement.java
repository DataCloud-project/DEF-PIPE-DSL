/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinBandwidth <em>Min Bandwidth</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxBandwidth <em>Max Bandwidth</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinLatency <em>Min Latency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxLatency <em>Max Latency</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getNetworkRequirement()
 * @model
 * @generated
 */
public interface NetworkRequirement extends HardwareRequirement {
	/**
	 * Returns the value of the '<em><b>Min Bandwidth</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Bandwidth</em>' attribute.
	 * @see #setMinBandwidth(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getNetworkRequirement_MinBandwidth()
	 * @model default="0.0"
	 * @generated
	 */
	double getMinBandwidth();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinBandwidth <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Bandwidth</em>' attribute.
	 * @see #getMinBandwidth()
	 * @generated
	 */
	void setMinBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Max Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Bandwidth</em>' attribute.
	 * @see #setMaxBandwidth(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getNetworkRequirement_MaxBandwidth()
	 * @model
	 * @generated
	 */
	double getMaxBandwidth();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxBandwidth <em>Max Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Bandwidth</em>' attribute.
	 * @see #getMaxBandwidth()
	 * @generated
	 */
	void setMaxBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Min Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Latency</em>' attribute.
	 * @see #setMinLatency(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getNetworkRequirement_MinLatency()
	 * @model
	 * @generated
	 */
	int getMinLatency();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinLatency <em>Min Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Latency</em>' attribute.
	 * @see #getMinLatency()
	 * @generated
	 */
	void setMinLatency(int value);

	/**
	 * Returns the value of the '<em><b>Max Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Latency</em>' attribute.
	 * @see #setMaxLatency(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getNetworkRequirement_MaxLatency()
	 * @model
	 * @generated
	 */
	int getMaxLatency();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxLatency <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Latency</em>' attribute.
	 * @see #getMaxLatency()
	 * @generated
	 */
	void setMaxLatency(int value);

} // NetworkRequirement
