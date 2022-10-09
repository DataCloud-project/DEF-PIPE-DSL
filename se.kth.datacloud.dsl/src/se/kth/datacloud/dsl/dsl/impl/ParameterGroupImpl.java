/**
 */
package se.kth.datacloud.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.kth.datacloud.dsl.dsl.DslPackage;
import se.kth.datacloud.dsl.dsl.LogicalOperatorType;
import se.kth.datacloud.dsl.dsl.Parameter;
import se.kth.datacloud.dsl.dsl.ParameterGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl#getParameterOperator <em>Parameter Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterGroupImpl extends MinimalEObjectImpl.Container implements ParameterGroup {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getParameterOperator() <em>Parameter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperatorType PARAMETER_OPERATOR_EDEFAULT = LogicalOperatorType.AND;

	/**
	 * The cached value of the '{@link #getParameterOperator() <em>Parameter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorType parameterOperator = PARAMETER_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.PARAMETER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, DslPackage.PARAMETER_GROUP__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType getParameterOperator() {
		return parameterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterOperator(LogicalOperatorType newParameterOperator) {
		LogicalOperatorType oldParameterOperator = parameterOperator;
		parameterOperator = newParameterOperator == null ? PARAMETER_OPERATOR_EDEFAULT : newParameterOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PARAMETER_GROUP__PARAMETER_OPERATOR, oldParameterOperator, parameterOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.PARAMETER_GROUP__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case DslPackage.PARAMETER_GROUP__PARAMETER:
				return getParameter();
			case DslPackage.PARAMETER_GROUP__PARAMETER_OPERATOR:
				return getParameterOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPackage.PARAMETER_GROUP__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DslPackage.PARAMETER_GROUP__PARAMETER_OPERATOR:
				setParameterOperator((LogicalOperatorType)newValue);
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
			case DslPackage.PARAMETER_GROUP__PARAMETER:
				getParameter().clear();
				return;
			case DslPackage.PARAMETER_GROUP__PARAMETER_OPERATOR:
				setParameterOperator(PARAMETER_OPERATOR_EDEFAULT);
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
			case DslPackage.PARAMETER_GROUP__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case DslPackage.PARAMETER_GROUP__PARAMETER_OPERATOR:
				return parameterOperator != PARAMETER_OPERATOR_EDEFAULT;
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
		result.append(" (parameterOperator: ");
		result.append(parameterOperator);
		result.append(')');
		return result.toString();
	}

} //ParameterGroupImpl
