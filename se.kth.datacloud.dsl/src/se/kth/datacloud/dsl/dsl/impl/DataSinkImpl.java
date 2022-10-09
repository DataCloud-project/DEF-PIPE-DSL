/**
 */
package se.kth.datacloud.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;

import se.kth.datacloud.dsl.dsl.DataSink;
import se.kth.datacloud.dsl.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.DataSinkImpl#getDataTarget <em>Data Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSinkImpl extends StepTemplateImpl implements DataSink {
	/**
	 * The cached value of the '{@link #getDataTarget() <em>Data Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTarget()
	 * @generated
	 * @ordered
	 */
	protected InputDataSource dataTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.DATA_SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataSource getDataTarget() {
		return dataTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTarget(InputDataSource newDataTarget, NotificationChain msgs) {
		InputDataSource oldDataTarget = dataTarget;
		dataTarget = newDataTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DATA_SINK__DATA_TARGET, oldDataTarget, newDataTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTarget(InputDataSource newDataTarget) {
		if (newDataTarget != dataTarget) {
			NotificationChain msgs = null;
			if (dataTarget != null)
				msgs = ((InternalEObject)dataTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_SINK__DATA_TARGET, null, msgs);
			if (newDataTarget != null)
				msgs = ((InternalEObject)newDataTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_SINK__DATA_TARGET, null, msgs);
			msgs = basicSetDataTarget(newDataTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DATA_SINK__DATA_TARGET, newDataTarget, newDataTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.DATA_SINK__DATA_TARGET:
				return basicSetDataTarget(null, msgs);
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
			case DslPackage.DATA_SINK__DATA_TARGET:
				return getDataTarget();
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
			case DslPackage.DATA_SINK__DATA_TARGET:
				setDataTarget((InputDataSource)newValue);
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
			case DslPackage.DATA_SINK__DATA_TARGET:
				setDataTarget((InputDataSource)null);
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
			case DslPackage.DATA_SINK__DATA_TARGET:
				return dataTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //DataSinkImpl
