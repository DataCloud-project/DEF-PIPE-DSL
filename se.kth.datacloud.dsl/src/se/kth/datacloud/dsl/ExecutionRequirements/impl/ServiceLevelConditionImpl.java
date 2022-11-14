/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition;

import se.kth.datacloud.dsl.dsl.ComparisonOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelConditionImpl extends MinimalEObjectImpl.Container implements ServiceLevelCondition {
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
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperatorType COMPARISON_OPERATOR_EDEFAULT = ComparisonOperatorType.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperatorType comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected Date validity = VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.SERVICE_LEVEL_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperatorType newComparisonOperator) {
		ComparisonOperatorType oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidity(Date newValidity) {
		Date oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__NAME:
				return getName();
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__THRESHOLD:
				return getThreshold();
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__VALIDITY:
				return getValidity();
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__NAME:
				setName((String)newValue);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperatorType)newValue);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__VALIDITY:
				setValidity((Date)newValue);
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR:
				setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR:
				return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION__VALIDITY:
				return VALIDITY_EDEFAULT == null ? validity != null : !VALIDITY_EDEFAULT.equals(validity);
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
		result.append(", comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", validity: ");
		result.append(validity);
		result.append(')');
		return result.toString();
	}

} //ServiceLevelConditionImpl
