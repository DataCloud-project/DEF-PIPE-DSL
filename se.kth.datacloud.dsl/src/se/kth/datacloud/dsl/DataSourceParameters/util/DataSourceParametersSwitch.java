/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import se.kth.datacloud.dsl.DataSourceParameters.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage
 * @generated
 */
public class DataSourceParametersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataSourceParametersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceParametersSwitch() {
		if (modelPackage == null) {
			modelPackage = DataSourceParametersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataSourceParametersPackage.INPUT_DATA_SOURCE: {
				InputDataSource inputDataSource = (InputDataSource)theEObject;
				T result = caseInputDataSource(inputDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.PARAMETER_VALUE_TYPES: {
				ParameterValueTypes parameterValueTypes = (ParameterValueTypes)theEObject;
				T result = caseParameterValueTypes(parameterValueTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.DATA_SOURCE_CREDENTIALS: {
				DataSourceCredentials dataSourceCredentials = (DataSourceCredentials)theEObject;
				T result = caseDataSourceCredentials(dataSourceCredentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.BLOCK_STORAGE: {
				BlockStorage blockStorage = (BlockStorage)theEObject;
				T result = caseBlockStorage(blockStorage);
				if (result == null) result = caseInputDataSource(blockStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseInputDataSource(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.MESSAGE_QUEUE: {
				MessageQueue messageQueue = (MessageQueue)theEObject;
				T result = caseMessageQueue(messageQueue);
				if (result == null) result = caseInputDataSource(messageQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.WEB_API: {
				WebApi webApi = (WebApi)theEObject;
				T result = caseWebApi(webApi);
				if (result == null) result = caseInputDataSource(webApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.WEB_API_CREDENTIALS: {
				WebApiCredentials webApiCredentials = (WebApiCredentials)theEObject;
				T result = caseWebApiCredentials(webApiCredentials);
				if (result == null) result = caseDataSourceCredentials(webApiCredentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.MESSAGE_QUEUE_CREDENTIALS: {
				MessageQueueCredentials messageQueueCredentials = (MessageQueueCredentials)theEObject;
				T result = caseMessageQueueCredentials(messageQueueCredentials);
				if (result == null) result = caseDataSourceCredentials(messageQueueCredentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.DATABASE_CREDENTIALS: {
				DatabaseCredentials databaseCredentials = (DatabaseCredentials)theEObject;
				T result = caseDatabaseCredentials(databaseCredentials);
				if (result == null) result = caseDataSourceCredentials(databaseCredentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.BLOCK_STORAGE_CREDENTIALS: {
				BlockStorageCredentials blockStorageCredentials = (BlockStorageCredentials)theEObject;
				T result = caseBlockStorageCredentials(blockStorageCredentials);
				if (result == null) result = caseDataSourceCredentials(blockStorageCredentials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.FTP: {
				FTP ftp = (FTP)theEObject;
				T result = caseFTP(ftp);
				if (result == null) result = caseInputDataSource(ftp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSourceParametersPackage.SFTP: {
				SFTP sftp = (SFTP)theEObject;
				T result = caseSFTP(sftp);
				if (result == null) result = caseFTP(sftp);
				if (result == null) result = caseInputDataSource(sftp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDataSource(InputDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueTypes(ParameterValueTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceCredentials(DataSourceCredentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockStorage(BlockStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageQueue(MessageQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApi(WebApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Api Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Api Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApiCredentials(WebApiCredentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Queue Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Queue Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageQueueCredentials(MessageQueueCredentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseCredentials(DatabaseCredentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Storage Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Storage Credentials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockStorageCredentials(BlockStorageCredentials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTP(FTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFTP(SFTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataSourceParametersSwitch
