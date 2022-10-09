/**
 */
package se.kth.datacloud.dsl.Triggers;

import se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll Message Queue Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getConsumerQueueName <em>Consumer Queue Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollMessageQueueTrigger()
 * @model
 * @generated
 */
public interface PollMessageQueueTrigger extends PollingTrigger {
	/**
	 * Returns the value of the '<em><b>Consumer Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Queue Name</em>' attribute.
	 * @see #setConsumerQueueName(String)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollMessageQueueTrigger_ConsumerQueueName()
	 * @model
	 * @generated
	 */
	String getConsumerQueueName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getConsumerQueueName <em>Consumer Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Queue Name</em>' attribute.
	 * @see #getConsumerQueueName()
	 * @generated
	 */
	void setConsumerQueueName(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference.
	 * @see #setCredentials(MessageQueueCredentials)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollMessageQueueTrigger_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	MessageQueueCredentials getCredentials();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(MessageQueueCredentials value);

} // PollMessageQueueTrigger
