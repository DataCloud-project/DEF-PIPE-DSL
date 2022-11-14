/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

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

import se.kth.datacloud.dsl.ControlParameters.ConditionStepPair;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;
import se.kth.datacloud.dsl.ControlParameters.PreCondition;

import se.kth.datacloud.dsl.dsl.LogicalOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl#getConditionStepList <em>Condition Step List</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreConditionImpl extends MinimalEObjectImpl.Container implements PreCondition {
	/**
	 * The cached value of the '{@link #getConditionStepList() <em>Condition Step List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionStepList()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionStepPair> conditionStepList;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperatorType TYPE_EDEFAULT = LogicalOperatorType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.PRE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionStepPair> getConditionStepList() {
		if (conditionStepList == null) {
			conditionStepList = new EObjectContainmentEList<ConditionStepPair>(ConditionStepPair.class, this, ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST);
		}
		return conditionStepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LogicalOperatorType newType) {
		LogicalOperatorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.PRE_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST:
				return ((InternalEList<?>)getConditionStepList()).basicRemove(otherEnd, msgs);
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
			case ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST:
				return getConditionStepList();
			case ControlParametersPackage.PRE_CONDITION__TYPE:
				return getType();
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
			case ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST:
				getConditionStepList().clear();
				getConditionStepList().addAll((Collection<? extends ConditionStepPair>)newValue);
				return;
			case ControlParametersPackage.PRE_CONDITION__TYPE:
				setType((LogicalOperatorType)newValue);
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
			case ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST:
				getConditionStepList().clear();
				return;
			case ControlParametersPackage.PRE_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ControlParametersPackage.PRE_CONDITION__CONDITION_STEP_LIST:
				return conditionStepList != null && !conditionStepList.isEmpty();
			case ControlParametersPackage.PRE_CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PreConditionImpl
