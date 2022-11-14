/**
 */
package se.kth.datacloud.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Medium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.CommunicationMedium#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getCommunicationMedium()
 * @model
 * @generated
 */
public interface CommunicationMedium extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.CommunicationMediumTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMediumTypes
	 * @see #setType(CommunicationMediumTypes)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getCommunicationMedium_Type()
	 * @model
	 * @generated
	 */
	CommunicationMediumTypes getType();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.CommunicationMedium#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMediumTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationMediumTypes value);

} // CommunicationMedium
