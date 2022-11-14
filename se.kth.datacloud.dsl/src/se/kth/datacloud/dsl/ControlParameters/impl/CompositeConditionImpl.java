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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.kth.datacloud.dsl.ControlParameters.AbstractCondition;
import se.kth.datacloud.dsl.ControlParameters.CompositeCondition;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.dsl.LogicalOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends AbstractConditionImpl implements CompositeCondition {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCondition> conditions;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperatorType OPERATOR_EDEFAULT = LogicalOperatorType.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorType operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<AbstractCondition>(AbstractCondition.class, this, ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LogicalOperatorType newOperator) {
		LogicalOperatorType oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.COMPOSITE_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS:
				return getConditions();
			case ControlParametersPackage.COMPOSITE_CONDITION__OPERATOR:
				return getOperator();
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
			case ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends AbstractCondition>)newValue);
				return;
			case ControlParametersPackage.COMPOSITE_CONDITION__OPERATOR:
				setOperator((LogicalOperatorType)newValue);
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
			case ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
				return;
			case ControlParametersPackage.COMPOSITE_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case ControlParametersPackage.COMPOSITE_CONDITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case ControlParametersPackage.COMPOSITE_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
