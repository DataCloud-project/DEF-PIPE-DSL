/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.dsl.AbstractStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Step Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getCondition <em>Condition</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionStepPair()
 * @model
 * @generated
 */
public interface ConditionStepPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(AbstractCondition)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionStepPair_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractCondition getCondition();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(AbstractCondition value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(AbstractStep)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionStepPair_Step()
	 * @model
	 * @generated
	 */
	AbstractStep getStep();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(AbstractStep value);

} // ConditionStepPair
