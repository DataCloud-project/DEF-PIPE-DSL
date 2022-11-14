/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials;

import se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Web Service Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollWebServiceTriggerImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PollWebServiceTriggerImpl extends PollingTriggerImpl implements PollWebServiceTrigger {
	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected WebApiCredentials credentials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollWebServiceTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.POLL_WEB_SERVICE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApiCredentials getCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(WebApiCredentials newCredentials, NotificationChain msgs) {
		WebApiCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS, oldCredentials, newCredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(WebApiCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS:
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
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS:
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
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS:
				setCredentials((WebApiCredentials)newValue);
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
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS:
				setCredentials((WebApiCredentials)null);
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
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER__CREDENTIALS:
				return credentials != null;
		}
		return super.eIsSet(featureID);
	}

} //PollWebServiceTriggerImpl
