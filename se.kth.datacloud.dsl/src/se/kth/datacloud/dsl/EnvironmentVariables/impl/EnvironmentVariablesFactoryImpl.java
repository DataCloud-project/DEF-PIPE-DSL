/**
 */
package se.kth.datacloud.dsl.EnvironmentVariables.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.EnvironmentVariables.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentVariablesFactoryImpl extends EFactoryImpl implements EnvironmentVariablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnvironmentVariablesFactory init() {
		try {
			EnvironmentVariablesFactory theEnvironmentVariablesFactory = (EnvironmentVariablesFactory)EPackage.Registry.INSTANCE.getEFactory(EnvironmentVariablesPackage.eNS_URI);
			if (theEnvironmentVariablesFactory != null) {
				return theEnvironmentVariablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnvironmentVariablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentVariablesFactoryImpl() {
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
			case EnvironmentVariablesPackage.ENVIRONMENT_VARIABLE: return createEnvironmentVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentVariable createEnvironmentVariable() {
		EnvironmentVariableImpl environmentVariable = new EnvironmentVariableImpl();
		return environmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentVariablesPackage getEnvironmentVariablesPackage() {
		return (EnvironmentVariablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnvironmentVariablesPackage getPackage() {
		return EnvironmentVariablesPackage.eINSTANCE;
	}

} //EnvironmentVariablesFactoryImpl
