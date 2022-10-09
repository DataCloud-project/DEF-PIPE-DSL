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

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable;

import se.kth.datacloud.dsl.dsl.AbstractStep;
import se.kth.datacloud.dsl.dsl.CommunicationMedium;
import se.kth.datacloud.dsl.dsl.DslPackage;
import se.kth.datacloud.dsl.dsl.Pipeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl#getCommunicationMedium <em>Communication Medium</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
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
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStep> steps;

	/**
	 * The cached value of the '{@link #getCommunicationMedium() <em>Communication Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedium()
	 * @generated
	 * @ordered
	 */
	protected CommunicationMedium communicationMedium;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.PIPELINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PIPELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<AbstractStep>(AbstractStep.class, this, DslPackage.PIPELINE__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedium getCommunicationMedium() {
		return communicationMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationMedium(CommunicationMedium newCommunicationMedium, NotificationChain msgs) {
		CommunicationMedium oldCommunicationMedium = communicationMedium;
		communicationMedium = newCommunicationMedium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PIPELINE__COMMUNICATION_MEDIUM, oldCommunicationMedium, newCommunicationMedium);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationMedium(CommunicationMedium newCommunicationMedium) {
		if (newCommunicationMedium != communicationMedium) {
			NotificationChain msgs = null;
			if (communicationMedium != null)
				msgs = ((InternalEObject)communicationMedium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PIPELINE__COMMUNICATION_MEDIUM, null, msgs);
			if (newCommunicationMedium != null)
				msgs = ((InternalEObject)newCommunicationMedium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PIPELINE__COMMUNICATION_MEDIUM, null, msgs);
			msgs = basicSetCommunicationMedium(newCommunicationMedium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PIPELINE__COMMUNICATION_MEDIUM, newCommunicationMedium, newCommunicationMedium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentVariable> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, DslPackage.PIPELINE__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.PIPELINE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case DslPackage.PIPELINE__COMMUNICATION_MEDIUM:
				return basicSetCommunicationMedium(null, msgs);
			case DslPackage.PIPELINE__ENVIRONMENT_VARIABLES:
				return ((InternalEList<?>)getEnvironmentVariables()).basicRemove(otherEnd, msgs);
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
			case DslPackage.PIPELINE__NAME:
				return getName();
			case DslPackage.PIPELINE__STEPS:
				return getSteps();
			case DslPackage.PIPELINE__COMMUNICATION_MEDIUM:
				return getCommunicationMedium();
			case DslPackage.PIPELINE__ENVIRONMENT_VARIABLES:
				return getEnvironmentVariables();
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
			case DslPackage.PIPELINE__NAME:
				setName((String)newValue);
				return;
			case DslPackage.PIPELINE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends AbstractStep>)newValue);
				return;
			case DslPackage.PIPELINE__COMMUNICATION_MEDIUM:
				setCommunicationMedium((CommunicationMedium)newValue);
				return;
			case DslPackage.PIPELINE__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
				getEnvironmentVariables().addAll((Collection<? extends EnvironmentVariable>)newValue);
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
			case DslPackage.PIPELINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslPackage.PIPELINE__STEPS:
				getSteps().clear();
				return;
			case DslPackage.PIPELINE__COMMUNICATION_MEDIUM:
				setCommunicationMedium((CommunicationMedium)null);
				return;
			case DslPackage.PIPELINE__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
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
			case DslPackage.PIPELINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslPackage.PIPELINE__STEPS:
				return steps != null && !steps.isEmpty();
			case DslPackage.PIPELINE__COMMUNICATION_MEDIUM:
				return communicationMedium != null;
			case DslPackage.PIPELINE__ENVIRONMENT_VARIABLES:
				return environmentVariables != null && !environmentVariables.isEmpty();
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

} //PipelineImpl
