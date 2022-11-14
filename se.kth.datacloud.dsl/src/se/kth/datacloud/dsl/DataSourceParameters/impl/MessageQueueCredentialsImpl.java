/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.impl;

import org.eclipse.emf.ecore.EClass;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;
import se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Queue Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MessageQueueCredentialsImpl extends DataSourceCredentialsImpl implements MessageQueueCredentials {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageQueueCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSourceParametersPackage.Literals.MESSAGE_QUEUE_CREDENTIALS;
	}

} //MessageQueueCredentialsImpl
