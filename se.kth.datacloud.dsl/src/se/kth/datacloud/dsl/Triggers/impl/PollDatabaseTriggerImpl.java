/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials;

import se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Database Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl#getQueryScript <em>Query Script</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PollDatabaseTriggerImpl extends PollingTriggerImpl implements PollDatabaseTrigger {
	/**
	 * The default value of the '{@link #getQueryScript() <em>Query Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryScript()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryScript() <em>Query Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryScript()
	 * @generated
	 * @ordered
	 */
	protected String queryScript = QUERY_SCRIPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected DatabaseCredentials credentials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollDatabaseTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.POLL_DATABASE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryScript() {
		return queryScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryScript(String newQueryScript) {
		String oldQueryScript = queryScript;
		queryScript = newQueryScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_DATABASE_TRIGGER__QUERY_SCRIPT, oldQueryScript, queryScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseCredentials getCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(DatabaseCredentials newCredentials, NotificationChain msgs) {
		DatabaseCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS, oldCredentials, newCredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(DatabaseCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS:
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
			case TriggersPackage.POLL_DATABASE_TRIGGER__QUERY_SCRIPT:
				return getQueryScript();
			case TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS:
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
			case TriggersPackage.POLL_DATABASE_TRIGGER__QUERY_SCRIPT:
				setQueryScript((String)newValue);
				return;
			case TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS:
				setCredentials((DatabaseCredentials)newValue);
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
			case TriggersPackage.POLL_DATABASE_TRIGGER__QUERY_SCRIPT:
				setQueryScript(QUERY_SCRIPT_EDEFAULT);
				return;
			case TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS:
				setCredentials((DatabaseCredentials)null);
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
			case TriggersPackage.POLL_DATABASE_TRIGGER__QUERY_SCRIPT:
				return QUERY_SCRIPT_EDEFAULT == null ? queryScript != null : !QUERY_SCRIPT_EDEFAULT.equals(queryScript);
			case TriggersPackage.POLL_DATABASE_TRIGGER__CREDENTIALS:
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
		result.append(" (queryScript: ");
		result.append(queryScript);
		result.append(')');
		return result.toString();
	}

} //PollDatabaseTriggerImpl
