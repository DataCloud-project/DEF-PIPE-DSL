/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.DataSourceParameters.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSourceParametersFactoryImpl extends EFactoryImpl implements DataSourceParametersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataSourceParametersFactory init() {
		try {
			DataSourceParametersFactory theDataSourceParametersFactory = (DataSourceParametersFactory)EPackage.Registry.INSTANCE.getEFactory(DataSourceParametersPackage.eNS_URI);
			if (theDataSourceParametersFactory != null) {
				return theDataSourceParametersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataSourceParametersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceParametersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataSourceParametersPackage.INPUT_DATA_SOURCE: return createInputDataSource();
			case DataSourceParametersPackage.PARAMETER_VALUE_TYPES: return createParameterValueTypes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataSource createInputDataSource() {
		InputDataSourceImpl inputDataSource = new InputDataSourceImpl();
		return inputDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueTypes createParameterValueTypes() {
		ParameterValueTypesImpl parameterValueTypes = new ParameterValueTypesImpl();
		return parameterValueTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceParametersPackage getDataSourceParametersPackage() {
		return (DataSourceParametersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataSourceParametersPackage getPackage() {
		return DataSourceParametersPackage.eINSTANCE;
	}

} //DataSourceParametersFactoryImpl
