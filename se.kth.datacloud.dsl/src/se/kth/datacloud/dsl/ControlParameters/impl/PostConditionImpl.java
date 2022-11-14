/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.kth.datacloud.dsl.ControlParameters.ConditionStepPair;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;
import se.kth.datacloud.dsl.ControlParameters.PostCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.PostConditionImpl#getConditionStepList <em>Condition Step List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostConditionImpl extends MinimalEObjectImpl.Container implements PostCondition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.POST_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionStepPair> getConditionStepList() {
		if (conditionStepList == null) {
			conditionStepList = new EObjectContainmentEList<ConditionStepPair>(ConditionStepPair.class, this, ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST);
		}
		return conditionStepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST:
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
			case ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST:
				return getConditionStepList();
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
			case ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST:
				getConditionStepList().clear();
				getConditionStepList().addAll((Collection<? extends ConditionStepPair>)newValue);
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
			case ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST:
				getConditionStepList().clear();
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
			case ControlParametersPackage.POST_CONDITION__CONDITION_STEP_LIST:
				return conditionStepList != null && !conditionStepList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostConditionImpl
