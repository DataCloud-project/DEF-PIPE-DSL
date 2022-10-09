/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.Metric;
import se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimization Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl#getOptimisationFunction <em>Optimisation Function</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimizationRequirementImpl extends SoftRequirementImpl implements OptimizationRequirement {
	/**
	 * The default value of the '{@link #getOptimisationFunction() <em>Optimisation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIMISATION_FUNCTION_EDEFAULT = "MINIMIZE";

	/**
	 * The cached value of the '{@link #getOptimisationFunction() <em>Optimisation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisationFunction()
	 * @generated
	 * @ordered
	 */
	protected String optimisationFunction = OPTIMISATION_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metric metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.OPTIMIZATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptimisationFunction() {
		return optimisationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisationFunction(String newOptimisationFunction) {
		String oldOptimisationFunction = optimisationFunction;
		optimisationFunction = newOptimisationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION, oldOptimisationFunction, optimisationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		if (metric != null && metric.eIsProxy()) {
			InternalEObject oldMetric = (InternalEObject)metric;
			metric = (Metric)eResolveProxy(oldMetric);
			if (metric != oldMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC, oldMetric, metric));
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric basicGetMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		Metric oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION:
				return getOptimisationFunction();
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC:
				if (resolve) return getMetric();
				return basicGetMetric();
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
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION:
				setOptimisationFunction((String)newValue);
				return;
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC:
				setMetric((Metric)newValue);
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
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION:
				setOptimisationFunction(OPTIMISATION_FUNCTION_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC:
				setMetric((Metric)null);
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
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION:
				return OPTIMISATION_FUNCTION_EDEFAULT == null ? optimisationFunction != null : !OPTIMISATION_FUNCTION_EDEFAULT.equals(optimisationFunction);
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT__METRIC:
				return metric != null;
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
		result.append(" (optimisationFunction: ");
		result.append(optimisationFunction);
		result.append(')');
		return result.toString();
	}

} //OptimizationRequirementImpl
