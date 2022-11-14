/**
 */
package se.kth.datacloud.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.Pipeline#getSteps <em>Steps</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.Pipeline#getCommunicationMedium <em>Communication Medium</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.Pipeline#getEnvironmentVariables <em>Environment Variables</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.dsl.AbstractStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getPipeline_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Communication Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Medium</em>' containment reference.
	 * @see #setCommunicationMedium(CommunicationMedium)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getPipeline_CommunicationMedium()
	 * @model containment="true"
	 * @generated
	 */
	CommunicationMedium getCommunicationMedium();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.Pipeline#getCommunicationMedium <em>Communication Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Medium</em>' containment reference.
	 * @see #getCommunicationMedium()
	 * @generated
	 */
	void setCommunicationMedium(CommunicationMedium value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getPipeline_EnvironmentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentVariable> getEnvironmentVariables();

} // Pipeline
