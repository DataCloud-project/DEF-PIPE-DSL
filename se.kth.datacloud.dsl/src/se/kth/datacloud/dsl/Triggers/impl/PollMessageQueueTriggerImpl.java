/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials;

import se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Message Queue Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl#getConsumerQueueName <em>Consumer Queue Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PollMessageQueueTriggerImpl extends PollingTriggerImpl implements PollMessageQueueTrigger {
	/**
	 * The default value of the '{@link #getConsumerQueueName() <em>Consumer Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerQueueName() <em>Consumer Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerQueueName()
	 * @generated
	 * @ordered
	 */
	protected String consumerQueueName = CONSUMER_QUEUE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected MessageQueueCredentials credentials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollMessageQueueTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.POLL_MESSAGE_QUEUE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerQueueName() {
		return consumerQueueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerQueueName(String newConsumerQueueName) {
		String oldConsumerQueueName = consumerQueueName;
		consumerQueueName = newConsumerQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME, oldConsumerQueueName, consumerQueueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQueueCredentials getCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(MessageQueueCredentials newCredentials, NotificationChain msgs) {
		MessageQueueCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS, oldCredentials, newCredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(MessageQueueCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS:
				return basicSetCredentials(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME:
				return getConsumerQueueName();
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS:
				return getCredentials();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME:
				setConsumerQueueName((String)newValue);
				return;
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS:
				setCredentials((MessageQueueCredentials)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME:
				setConsumerQueueName(CONSUMER_QUEUE_NAME_EDEFAULT);
				return;
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS:
				setCredentials((MessageQueueCredentials)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME:
				return CONSUMER_QUEUE_NAME_EDEFAULT == null ? consumerQueueName != null : !CONSUMER_QUEUE_NAME_EDEFAULT.equals(consumerQueueName);
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS:
				return credentials != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (consumerQueueName: ");
		result.append(consumerQueueName);
		result.append(')');
		return result.toString();
	}

} //PollMessageQueueTriggerImpl
