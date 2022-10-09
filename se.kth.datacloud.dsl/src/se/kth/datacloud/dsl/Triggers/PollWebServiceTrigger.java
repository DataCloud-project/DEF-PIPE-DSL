/**
 */
package se.kth.datacloud.dsl.Triggers;

import se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll Web Service Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollWebServiceTrigger()
 * @model
 * @generated
 */
public interface PollWebServiceTrigger extends PollingTrigger {
	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference.
	 * @see #setCredentials(WebApiCredentials)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollWebServiceTrigger_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	WebApiCredentials getCredentials();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(WebApiCredentials value);

} // PollWebServiceTrigger
