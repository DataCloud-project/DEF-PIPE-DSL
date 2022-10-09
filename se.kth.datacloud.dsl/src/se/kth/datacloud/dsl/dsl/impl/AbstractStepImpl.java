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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.kth.datacloud.dsl.ControlParameters.ControlParemeter;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvider;

import se.kth.datacloud.dsl.Triggers.Trigger;

import se.kth.datacloud.dsl.dsl.AbstractStep;
import se.kth.datacloud.dsl.dsl.DslPackage;
import se.kth.datacloud.dsl.dsl.StepImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getControlParemeter <em>Control Paremeter</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getExecutionRequirementSet <em>Execution Requirement Set</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getResourceProvider <em>Resource Provider</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStepImpl extends MinimalEObjectImpl.Container implements AbstractStep {
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
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStep> previous;

	/**
	 * The cached value of the '{@link #getControlParemeter() <em>Control Paremeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParemeter()
	 * @generated
	 * @ordered
	 */
	protected ControlParemeter controlParemeter;

	/**
	 * The cached value of the '{@link #getExecutionRequirementSet() <em>Execution Requirement Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRequirementSet()
	 * @generated
	 * @ordered
	 */
	protected ExecutionRequirementSet executionRequirementSet;

	/**
	 * The cached value of the '{@link #getResourceProvider() <em>Resource Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceProvider> resourceProvider;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentVariable> environmentVariables;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected StepImplementation implementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ABSTRACT_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, DslPackage.ABSTRACT_STEP__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStep> getPrevious() {
		if (previous == null) {
			previous = new EObjectResolvingEList<AbstractStep>(AbstractStep.class, this, DslPackage.ABSTRACT_STEP__PREVIOUS);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParemeter getControlParemeter() {
		if (controlParemeter != null && controlParemeter.eIsProxy()) {
			InternalEObject oldControlParemeter = (InternalEObject)controlParemeter;
			controlParemeter = (ControlParemeter)eResolveProxy(oldControlParemeter);
			if (controlParemeter != oldControlParemeter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER, oldControlParemeter, controlParemeter));
			}
		}
		return controlParemeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParemeter basicGetControlParemeter() {
		return controlParemeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlParemeter(ControlParemeter newControlParemeter) {
		ControlParemeter oldControlParemeter = controlParemeter;
		controlParemeter = newControlParemeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER, oldControlParemeter, controlParemeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementSet getExecutionRequirementSet() {
		return executionRequirementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionRequirementSet(ExecutionRequirementSet newExecutionRequirementSet, NotificationChain msgs) {
		ExecutionRequirementSet oldExecutionRequirementSet = executionRequirementSet;
		executionRequirementSet = newExecutionRequirementSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET, oldExecutionRequirementSet, newExecutionRequirementSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionRequirementSet(ExecutionRequirementSet newExecutionRequirementSet) {
		if (newExecutionRequirementSet != executionRequirementSet) {
			NotificationChain msgs = null;
			if (executionRequirementSet != null)
				msgs = ((InternalEObject)executionRequirementSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET, null, msgs);
			if (newExecutionRequirementSet != null)
				msgs = ((InternalEObject)newExecutionRequirementSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET, null, msgs);
			msgs = basicSetExecutionRequirementSet(newExecutionRequirementSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET, newExecutionRequirementSet, newExecutionRequirementSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceProvider> getResourceProvider() {
		if (resourceProvider == null) {
			resourceProvider = new EObjectContainmentEList<ResourceProvider>(ResourceProvider.class, this, DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER);
		}
		return resourceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentVariable> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(StepImplementation newImplementation, NotificationChain msgs) {
		StepImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(StepImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.ABSTRACT_STEP__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.ABSTRACT_STEP__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ABSTRACT_STEP__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
				return basicSetExecutionRequirementSet(null, msgs);
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
				return ((InternalEList<?>)getResourceProvider()).basicRemove(otherEnd, msgs);
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
				return ((InternalEList<?>)getEnvironmentVariables()).basicRemove(otherEnd, msgs);
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
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
			case DslPackage.ABSTRACT_STEP__NAME:
				return getName();
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
				return getTriggers();
			case DslPackage.ABSTRACT_STEP__PREVIOUS:
				return getPrevious();
			case DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER:
				if (resolve) return getControlParemeter();
				return basicGetControlParemeter();
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
				return getExecutionRequirementSet();
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
				return getResourceProvider();
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
				return getEnvironmentVariables();
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				return getImplementation();
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
			case DslPackage.ABSTRACT_STEP__NAME:
				setName((String)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection<? extends AbstractStep>)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER:
				setControlParemeter((ControlParemeter)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
				setExecutionRequirementSet((ExecutionRequirementSet)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
				getResourceProvider().clear();
				getResourceProvider().addAll((Collection<? extends ResourceProvider>)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
				getEnvironmentVariables().addAll((Collection<? extends EnvironmentVariable>)newValue);
				return;
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				setImplementation((StepImplementation)newValue);
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
			case DslPackage.ABSTRACT_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
				getTriggers().clear();
				return;
			case DslPackage.ABSTRACT_STEP__PREVIOUS:
				getPrevious().clear();
				return;
			case DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER:
				setControlParemeter((ControlParemeter)null);
				return;
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
				setExecutionRequirementSet((ExecutionRequirementSet)null);
				return;
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
				getResourceProvider().clear();
				return;
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
				return;
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				setImplementation((StepImplementation)null);
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
			case DslPackage.ABSTRACT_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case DslPackage.ABSTRACT_STEP__PREVIOUS:
				return previous != null && !previous.isEmpty();
			case DslPackage.ABSTRACT_STEP__CONTROL_PAREMETER:
				return controlParemeter != null;
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
				return executionRequirementSet != null;
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
				return resourceProvider != null && !resourceProvider.isEmpty();
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
				return environmentVariables != null && !environmentVariables.isEmpty();
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				return implementation != null;
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

} //AbstractStepImpl
