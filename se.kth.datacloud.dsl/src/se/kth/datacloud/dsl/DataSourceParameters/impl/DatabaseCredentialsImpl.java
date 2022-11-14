/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.impl;

import org.eclipse.emf.ecore.EClass;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;
import se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DatabaseCredentialsImpl extends DataSourceCredentialsImpl implements DatabaseCredentials {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSourceParametersPackage.Literals.DATABASE_CREDENTIALS;
	}

} //DatabaseCredentialsImpl
