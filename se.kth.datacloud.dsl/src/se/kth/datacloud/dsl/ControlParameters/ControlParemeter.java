/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Paremeter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getLoop <em>Loop</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getControlParemeter()
 * @model
 * @generated
 */
public interface ControlParemeter extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(Loop)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getControlParemeter_Loop()
	 * @model
	 * @generated
	 */
	Loop getLoop();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(Loop value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ConditionSet)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getControlParemeter_Condition()
	 * @model
	 * @generated
	 */
	ConditionSet getCondition();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionSet value);

} // ControlParemeter
