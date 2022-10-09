/**
 */
package se.kth.datacloud.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.ControlParameters.ControlParemeter;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvider;

import se.kth.datacloud.dsl.Triggers.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getPrevious <em>Previous</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getControlParemeter <em>Control Paremeter</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getExecutionRequirementSet <em>Execution Requirement Set</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getResourceProvider <em>Resource Provider</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.AbstractStep#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep()
 * @model abstract="true"
 * @generated
 */
public interface AbstractStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.Triggers.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.dsl.AbstractStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_Previous()
	 * @model
	 * @generated
	 */
	EList<AbstractStep> getPrevious();

	/**
	 * Returns the value of the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Paremeter</em>' reference.
	 * @see #setControlParemeter(ControlParemeter)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_ControlParemeter()
	 * @model required="true"
	 * @generated
	 */
	ControlParemeter getControlParemeter();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getControlParemeter <em>Control Paremeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Paremeter</em>' reference.
	 * @see #getControlParemeter()
	 * @generated
	 */
	void setControlParemeter(ControlParemeter value);

	/**
	 * Returns the value of the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Requirement Set</em>' containment reference.
	 * @see #setExecutionRequirementSet(ExecutionRequirementSet)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_ExecutionRequirementSet()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionRequirementSet getExecutionRequirementSet();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getExecutionRequirementSet <em>Execution Requirement Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Requirement Set</em>' containment reference.
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	void setExecutionRequirementSet(ExecutionRequirementSet value);

	/**
	 * Returns the value of the '<em><b>Resource Provider</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Provider</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_ResourceProvider()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceProvider> getResourceProvider();

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_EnvironmentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentVariable> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(StepImplementation)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getAbstractStep_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	StepImplementation getImplementation();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(StepImplementation value);

} // AbstractStep
