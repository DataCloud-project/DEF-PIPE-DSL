/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimization Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getOptimisationFunction <em>Optimisation Function</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOptimizationRequirement()
 * @model
 * @generated
 */
public interface OptimizationRequirement extends SoftRequirement {
	/**
	 * Returns the value of the '<em><b>Optimisation Function</b></em>' attribute.
	 * The default value is <code>"MINIMIZE"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Function</em>' attribute.
	 * @see #setOptimisationFunction(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOptimizationRequirement_OptimisationFunction()
	 * @model default="MINIMIZE"
	 * @generated
	 */
	String getOptimisationFunction();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getOptimisationFunction <em>Optimisation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimisation Function</em>' attribute.
	 * @see #getOptimisationFunction()
	 * @generated
	 */
	void setOptimisationFunction(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOptimizationRequirement_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

} // OptimizationRequirement
