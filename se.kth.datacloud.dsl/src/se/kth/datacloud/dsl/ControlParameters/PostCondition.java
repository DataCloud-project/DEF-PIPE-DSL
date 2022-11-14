/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.PostCondition#getConditionStepList <em>Condition Step List</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getPostCondition()
 * @model
 * @generated
 */
public interface PostCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Step List</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Step List</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getPostCondition_ConditionStepList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionStepPair> getConditionStepList();

} // PostCondition
