/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ControlParameters.Condition;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.dsl.ComparisonOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl#getComparatorOperator <em>Comparator Operator</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl#getSourceProcessingScriptName <em>Source Processing Script Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends AbstractConditionImpl implements Condition {
	/**
	 * The default value of the '{@link #getComparatorOperator() <em>Comparator Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparatorOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperatorType COMPARATOR_OPERATOR_EDEFAULT = ComparisonOperatorType.EQUAL;

	/**
	 * The cached value of the '{@link #getComparatorOperator() <em>Comparator Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparatorOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperatorType comparatorOperator = COMPARATOR_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceProcessingScriptName() <em>Source Processing Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessingScriptName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PROCESSING_SCRIPT_NAME_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getSourceProcessingScriptName() <em>Source Processing Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessingScriptName()
	 * @generated
	 * @ordered
	 */
	protected String sourceProcessingScriptName = SOURCE_PROCESSING_SCRIPT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType getComparatorOperator() {
		return comparatorOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparatorOperator(ComparisonOperatorType newComparatorOperator) {
		ComparisonOperatorType oldComparatorOperator = comparatorOperator;
		comparatorOperator = newComparatorOperator == null ? COMPARATOR_OPERATOR_EDEFAULT : newComparatorOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION__COMPARATOR_OPERATOR, oldComparatorOperator, comparatorOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceProcessingScriptName() {
		return sourceProcessingScriptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProcessingScriptName(String newSourceProcessingScriptName) {
		String oldSourceProcessingScriptName = sourceProcessingScriptName;
		sourceProcessingScriptName = newSourceProcessingScriptName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION__SOURCE_PROCESSING_SCRIPT_NAME, oldSourceProcessingScriptName, sourceProcessingScriptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlParametersPackage.CONDITION__COMPARATOR_OPERATOR:
				return getComparatorOperator();
			case ControlParametersPackage.CONDITION__SOURCE:
				return getSource();
			case ControlParametersPackage.CONDITION__TARGET:
				return getTarget();
			case ControlParametersPackage.CONDITION__SOURCE_PROCESSING_SCRIPT_NAME:
				return getSourceProcessingScriptName();
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
			case ControlParametersPackage.CONDITION__COMPARATOR_OPERATOR:
				setComparatorOperator((ComparisonOperatorType)newValue);
				return;
			case ControlParametersPackage.CONDITION__SOURCE:
				setSource((String)newValue);
				return;
			case ControlParametersPackage.CONDITION__TARGET:
				setTarget((String)newValue);
				return;
			case ControlParametersPackage.CONDITION__SOURCE_PROCESSING_SCRIPT_NAME:
				setSourceProcessingScriptName((String)newValue);
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
			case ControlParametersPackage.CONDITION__COMPARATOR_OPERATOR:
				setComparatorOperator(COMPARATOR_OPERATOR_EDEFAULT);
				return;
			case ControlParametersPackage.CONDITION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ControlParametersPackage.CONDITION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case ControlParametersPackage.CONDITION__SOURCE_PROCESSING_SCRIPT_NAME:
				setSourceProcessingScriptName(SOURCE_PROCESSING_SCRIPT_NAME_EDEFAULT);
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
			case ControlParametersPackage.CONDITION__COMPARATOR_OPERATOR:
				return comparatorOperator != COMPARATOR_OPERATOR_EDEFAULT;
			case ControlParametersPackage.CONDITION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ControlParametersPackage.CONDITION__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case ControlParametersPackage.CONDITION__SOURCE_PROCESSING_SCRIPT_NAME:
				return SOURCE_PROCESSING_SCRIPT_NAME_EDEFAULT == null ? sourceProcessingScriptName != null : !SOURCE_PROCESSING_SCRIPT_NAME_EDEFAULT.equals(sourceProcessingScriptName);
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
		result.append(" (comparatorOperator: ");
		result.append(comparatorOperator);
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", sourceProcessingScriptName: ");
		result.append(sourceProcessingScriptName);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
