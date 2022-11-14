/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.DataSourceParameters.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage
 * @generated
 */
public class DataSourceParametersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataSourceParametersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceParametersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataSourceParametersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceParametersSwitch<Adapter> modelSwitch =
		new DataSourceParametersSwitch<Adapter>() {
			@Override
			public Adapter caseInputDataSource(InputDataSource object) {
				return createInputDataSourceAdapter();
			}
			@Override
			public Adapter caseParameterValueTypes(ParameterValueTypes object) {
				return createParameterValueTypesAdapter();
			}
			@Override
			public Adapter caseDataSourceCredentials(DataSourceCredentials object) {
				return createDataSourceCredentialsAdapter();
			}
			@Override
			public Adapter caseBlockStorage(BlockStorage object) {
				return createBlockStorageAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseMessageQueue(MessageQueue object) {
				return createMessageQueueAdapter();
			}
			@Override
			public Adapter caseWebApi(WebApi object) {
				return createWebApiAdapter();
			}
			@Override
			public Adapter caseWebApiCredentials(WebApiCredentials object) {
				return createWebApiCredentialsAdapter();
			}
			@Override
			public Adapter caseMessageQueueCredentials(MessageQueueCredentials object) {
				return createMessageQueueCredentialsAdapter();
			}
			@Override
			public Adapter caseDatabaseCredentials(DatabaseCredentials object) {
				return createDatabaseCredentialsAdapter();
			}
			@Override
			public Adapter caseBlockStorageCredentials(BlockStorageCredentials object) {
				return createBlockStorageCredentialsAdapter();
			}
			@Override
			public Adapter caseFTP(FTP object) {
				return createFTPAdapter();
			}
			@Override
			public Adapter caseSFTP(SFTP object) {
				return createSFTPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource <em>Input Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.InputDataSource
	 * @generated
	 */
	public Adapter createInputDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes <em>Parameter Value Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes
	 * @generated
	 */
	public Adapter createParameterValueTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials <em>Data Source Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials
	 * @generated
	 */
	public Adapter createDataSourceCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.BlockStorage <em>Block Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.BlockStorage
	 * @generated
	 */
	public Adapter createBlockStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.MessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.MessageQueue
	 * @generated
	 */
	public Adapter createMessageQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApi <em>Web Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.WebApi
	 * @generated
	 */
	public Adapter createWebApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials <em>Web Api Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials
	 * @generated
	 */
	public Adapter createWebApiCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials <em>Message Queue Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials
	 * @generated
	 */
	public Adapter createMessageQueueCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials <em>Database Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials
	 * @generated
	 */
	public Adapter createDatabaseCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.BlockStorageCredentials <em>Block Storage Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.BlockStorageCredentials
	 * @generated
	 */
	public Adapter createBlockStorageCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.FTP <em>FTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.FTP
	 * @generated
	 */
	public Adapter createFTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.DataSourceParameters.SFTP <em>SFTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.SFTP
	 * @generated
	 */
	public Adapter createSFTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataSourceParametersAdapterFactory
