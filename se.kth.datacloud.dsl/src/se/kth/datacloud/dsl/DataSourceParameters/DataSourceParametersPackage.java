/**
 */
package se.kth.datacloud.dsl.DataSourceParameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersFactory
 * @model kind="package"
 * @generated
 */
public interface DataSourceParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataSourceParameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/DataSourceParameters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataSourceParameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSourceParametersPackage eINSTANCE = se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl <em>Input Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getInputDataSource()
	 * @generated
	 */
	int INPUT_DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_SOURCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_SOURCE__DATASOURCECREDENTIALS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_SOURCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Input Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.ParameterValueTypesImpl <em>Parameter Value Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.ParameterValueTypesImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getParameterValueTypes()
	 * @generated
	 */
	int PARAMETER_VALUE_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Value Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceCredentialsImpl <em>Data Source Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceCredentialsImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDataSourceCredentials()
	 * @generated
	 */
	int DATA_SOURCE_CREDENTIALS = 2;

	/**
	 * The number of structural features of the '<em>Data Source Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CREDENTIALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Source Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageImpl <em>Block Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getBlockStorage()
	 * @generated
	 */
	int BLOCK_STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE__VALUE = INPUT_DATA_SOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE__DATASOURCECREDENTIALS = INPUT_DATA_SOURCE__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE__NAME = INPUT_DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Block Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE_FEATURE_COUNT = INPUT_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE_OPERATION_COUNT = INPUT_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VALUE = INPUT_DATA_SOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATASOURCECREDENTIALS = INPUT_DATA_SOURCE__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = INPUT_DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = INPUT_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = INPUT_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueImpl <em>Message Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getMessageQueue()
	 * @generated
	 */
	int MESSAGE_QUEUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE__VALUE = INPUT_DATA_SOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE__DATASOURCECREDENTIALS = INPUT_DATA_SOURCE__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE__NAME = INPUT_DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Message Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE_FEATURE_COUNT = INPUT_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE_OPERATION_COUNT = INPUT_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiImpl <em>Web Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getWebApi()
	 * @generated
	 */
	int WEB_API = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API__VALUE = INPUT_DATA_SOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API__DATASOURCECREDENTIALS = INPUT_DATA_SOURCE__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API__NAME = INPUT_DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Web Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API_FEATURE_COUNT = INPUT_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API_OPERATION_COUNT = INPUT_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiCredentialsImpl <em>Web Api Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiCredentialsImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getWebApiCredentials()
	 * @generated
	 */
	int WEB_API_CREDENTIALS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API_CREDENTIALS__NAME = DATA_SOURCE_CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Api Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API_CREDENTIALS_FEATURE_COUNT = DATA_SOURCE_CREDENTIALS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web Api Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_API_CREDENTIALS_OPERATION_COUNT = DATA_SOURCE_CREDENTIALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueCredentialsImpl <em>Message Queue Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueCredentialsImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getMessageQueueCredentials()
	 * @generated
	 */
	int MESSAGE_QUEUE_CREDENTIALS = 8;

	/**
	 * The number of structural features of the '<em>Message Queue Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE_CREDENTIALS_FEATURE_COUNT = DATA_SOURCE_CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Queue Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUE_CREDENTIALS_OPERATION_COUNT = DATA_SOURCE_CREDENTIALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseCredentialsImpl <em>Database Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseCredentialsImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDatabaseCredentials()
	 * @generated
	 */
	int DATABASE_CREDENTIALS = 9;

	/**
	 * The number of structural features of the '<em>Database Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CREDENTIALS_FEATURE_COUNT = DATA_SOURCE_CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CREDENTIALS_OPERATION_COUNT = DATA_SOURCE_CREDENTIALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageCredentialsImpl <em>Block Storage Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageCredentialsImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getBlockStorageCredentials()
	 * @generated
	 */
	int BLOCK_STORAGE_CREDENTIALS = 10;

	/**
	 * The number of structural features of the '<em>Block Storage Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE_CREDENTIALS_FEATURE_COUNT = DATA_SOURCE_CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Storage Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STORAGE_CREDENTIALS_OPERATION_COUNT = DATA_SOURCE_CREDENTIALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.FTPImpl <em>FTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.FTPImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getFTP()
	 * @generated
	 */
	int FTP = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP__VALUE = INPUT_DATA_SOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP__DATASOURCECREDENTIALS = INPUT_DATA_SOURCE__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP__NAME = INPUT_DATA_SOURCE__NAME;

	/**
	 * The number of structural features of the '<em>FTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_FEATURE_COUNT = INPUT_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_OPERATION_COUNT = INPUT_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.SFTPImpl <em>SFTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.SFTPImpl
	 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getSFTP()
	 * @generated
	 */
	int SFTP = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFTP__VALUE = FTP__VALUE;

	/**
	 * The feature id for the '<em><b>Datasourcecredentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFTP__DATASOURCECREDENTIALS = FTP__DATASOURCECREDENTIALS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFTP__NAME = FTP__NAME;

	/**
	 * The number of structural features of the '<em>SFTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFTP_FEATURE_COUNT = FTP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFTP_OPERATION_COUNT = FTP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource <em>Input Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data Source</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.InputDataSource
	 * @generated
	 */
	EClass getInputDataSource();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getValue()
	 * @see #getInputDataSource()
	 * @generated
	 */
	EReference getInputDataSource_Value();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getDatasourcecredentials <em>Datasourcecredentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datasourcecredentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getDatasourcecredentials()
	 * @see #getInputDataSource()
	 * @generated
	 */
	EReference getInputDataSource_Datasourcecredentials();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.InputDataSource#getName()
	 * @see #getInputDataSource()
	 * @generated
	 */
	EAttribute getInputDataSource_Name();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes <em>Parameter Value Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Types</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes
	 * @generated
	 */
	EClass getParameterValueTypes();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials <em>Data Source Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Credentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials
	 * @generated
	 */
	EClass getDataSourceCredentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.BlockStorage <em>Block Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Storage</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.BlockStorage
	 * @generated
	 */
	EClass getBlockStorage();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.MessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Queue</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.MessageQueue
	 * @generated
	 */
	EClass getMessageQueue();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApi <em>Web Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Api</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.WebApi
	 * @generated
	 */
	EClass getWebApi();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials <em>Web Api Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Api Credentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials
	 * @generated
	 */
	EClass getWebApiCredentials();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials#getName()
	 * @see #getWebApiCredentials()
	 * @generated
	 */
	EAttribute getWebApiCredentials_Name();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials <em>Message Queue Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Queue Credentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials
	 * @generated
	 */
	EClass getMessageQueueCredentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials <em>Database Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Credentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials
	 * @generated
	 */
	EClass getDatabaseCredentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.BlockStorageCredentials <em>Block Storage Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Storage Credentials</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.BlockStorageCredentials
	 * @generated
	 */
	EClass getBlockStorageCredentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.FTP <em>FTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTP</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.FTP
	 * @generated
	 */
	EClass getFTP();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.DataSourceParameters.SFTP <em>SFTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFTP</em>'.
	 * @see se.kth.datacloud.dsl.DataSourceParameters.SFTP
	 * @generated
	 */
	EClass getSFTP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataSourceParametersFactory getDataSourceParametersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl <em>Input Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getInputDataSource()
		 * @generated
		 */
		EClass INPUT_DATA_SOURCE = eINSTANCE.getInputDataSource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_DATA_SOURCE__VALUE = eINSTANCE.getInputDataSource_Value();

		/**
		 * The meta object literal for the '<em><b>Datasourcecredentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_DATA_SOURCE__DATASOURCECREDENTIALS = eINSTANCE.getInputDataSource_Datasourcecredentials();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DATA_SOURCE__NAME = eINSTANCE.getInputDataSource_Name();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.ParameterValueTypesImpl <em>Parameter Value Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.ParameterValueTypesImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getParameterValueTypes()
		 * @generated
		 */
		EClass PARAMETER_VALUE_TYPES = eINSTANCE.getParameterValueTypes();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceCredentialsImpl <em>Data Source Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceCredentialsImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDataSourceCredentials()
		 * @generated
		 */
		EClass DATA_SOURCE_CREDENTIALS = eINSTANCE.getDataSourceCredentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageImpl <em>Block Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getBlockStorage()
		 * @generated
		 */
		EClass BLOCK_STORAGE = eINSTANCE.getBlockStorage();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueImpl <em>Message Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getMessageQueue()
		 * @generated
		 */
		EClass MESSAGE_QUEUE = eINSTANCE.getMessageQueue();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiImpl <em>Web Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getWebApi()
		 * @generated
		 */
		EClass WEB_API = eINSTANCE.getWebApi();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiCredentialsImpl <em>Web Api Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.WebApiCredentialsImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getWebApiCredentials()
		 * @generated
		 */
		EClass WEB_API_CREDENTIALS = eINSTANCE.getWebApiCredentials();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_API_CREDENTIALS__NAME = eINSTANCE.getWebApiCredentials_Name();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueCredentialsImpl <em>Message Queue Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.MessageQueueCredentialsImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getMessageQueueCredentials()
		 * @generated
		 */
		EClass MESSAGE_QUEUE_CREDENTIALS = eINSTANCE.getMessageQueueCredentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseCredentialsImpl <em>Database Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DatabaseCredentialsImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getDatabaseCredentials()
		 * @generated
		 */
		EClass DATABASE_CREDENTIALS = eINSTANCE.getDatabaseCredentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageCredentialsImpl <em>Block Storage Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.BlockStorageCredentialsImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getBlockStorageCredentials()
		 * @generated
		 */
		EClass BLOCK_STORAGE_CREDENTIALS = eINSTANCE.getBlockStorageCredentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.FTPImpl <em>FTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.FTPImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getFTP()
		 * @generated
		 */
		EClass FTP = eINSTANCE.getFTP();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.DataSourceParameters.impl.SFTPImpl <em>SFTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.SFTPImpl
		 * @see se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl#getSFTP()
		 * @generated
		 */
		EClass SFTP = eINSTANCE.getSFTP();

	}

} //DataSourceParametersPackage
