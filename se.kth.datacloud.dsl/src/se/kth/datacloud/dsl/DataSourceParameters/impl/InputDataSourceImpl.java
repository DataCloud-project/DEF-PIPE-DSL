/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials;
import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;
import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;
import se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl#getDatasourcecredentials <em>Datasourcecredentials</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.impl.InputDataSourceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputDataSourceImpl extends MinimalEObjectImpl.Container implements InputDataSource {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ParameterValueTypes value;

	/**
	 * The cached value of the '{@link #getDatasourcecredentials() <em>Datasourcecredentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasourcecredentials()
	 * @generated
	 * @ordered
	 */
	protected DataSourceCredentials datasourcecredentials;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSourceParametersPackage.Literals.INPUT_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueTypes getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ParameterValueTypes newValue, NotificationChain msgs) {
		ParameterValueTypes oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ParameterValueTypes newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceCredentials getDatasourcecredentials() {
		return datasourcecredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasourcecredentials(DataSourceCredentials newDatasourcecredentials, NotificationChain msgs) {
		DataSourceCredentials oldDatasourcecredentials = datasourcecredentials;
		datasourcecredentials = newDatasourcecredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS, oldDatasourcecredentials, newDatasourcecredentials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasourcecredentials(DataSourceCredentials newDatasourcecredentials) {
		if (newDatasourcecredentials != datasourcecredentials) {
			NotificationChain msgs = null;
			if (datasourcecredentials != null)
				msgs = ((InternalEObject)datasourcecredentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS, null, msgs);
			if (newDatasourcecredentials != null)
				msgs = ((InternalEObject)newDatasourcecredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS, null, msgs);
			msgs = basicSetDatasourcecredentials(newDatasourcecredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS, newDatasourcecredentials, newDatasourcecredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSourceParametersPackage.INPUT_DATA_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE:
				return basicSetValue(null, msgs);
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS:
				return basicSetDatasourcecredentials(null, msgs);
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
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE:
				return getValue();
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS:
				return getDatasourcecredentials();
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__NAME:
				return getName();
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
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE:
				setValue((ParameterValueTypes)newValue);
				return;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS:
				setDatasourcecredentials((DataSourceCredentials)newValue);
				return;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__NAME:
				setName((String)newValue);
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
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE:
				setValue((ParameterValueTypes)null);
				return;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS:
				setDatasourcecredentials((DataSourceCredentials)null);
				return;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__NAME:
				setName(NAME_EDEFAULT);
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
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__VALUE:
				return value != null;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__DATASOURCECREDENTIALS:
				return datasourcecredentials != null;
			case DataSourceParametersPackage.INPUT_DATA_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InputDataSourceImpl
