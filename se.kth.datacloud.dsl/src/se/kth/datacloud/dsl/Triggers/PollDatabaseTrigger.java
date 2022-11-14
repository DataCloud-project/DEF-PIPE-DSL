/**
 */
package se.kth.datacloud.dsl.Triggers;

import se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll Database Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getQueryScript <em>Query Script</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollDatabaseTrigger()
 * @model
 * @generated
 */
public interface PollDatabaseTrigger extends PollingTrigger {
	/**
	 * Returns the value of the '<em><b>Query Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Script</em>' attribute.
	 * @see #setQueryScript(String)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollDatabaseTrigger_QueryScript()
	 * @model
	 * @generated
	 */
	String getQueryScript();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getQueryScript <em>Query Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Script</em>' attribute.
	 * @see #getQueryScript()
	 * @generated
	 */
	void setQueryScript(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference.
	 * @see #setCredentials(DatabaseCredentials)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollDatabaseTrigger_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	DatabaseCredentials getCredentials();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(DatabaseCredentials value);

} // PollDatabaseTrigger
