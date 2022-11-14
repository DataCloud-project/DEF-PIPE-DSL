/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.dsl.ComparisonOperatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelCondition()
 * @model
 * @generated
 */
public interface ServiceLevelCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The default value is <code>"GREATER_THAN"</code>.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.ComparisonOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @see #setComparisonOperator(ComparisonOperatorType)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelCondition_ComparisonOperator()
	 * @model default="GREATER_THAN"
	 * @generated
	 */
	ComparisonOperatorType getComparisonOperator();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperatorType value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelCondition_Threshold()
	 * @model default="0"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(Date)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelCondition_Validity()
	 * @model
	 * @generated
	 */
	Date getValidity();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(Date value);

} // ServiceLevelCondition
