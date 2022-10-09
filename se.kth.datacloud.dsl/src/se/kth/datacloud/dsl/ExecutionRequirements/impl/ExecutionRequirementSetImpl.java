/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet;
import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective;
import se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Requirement Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getServiceLevelObjective <em>Service Level Objective</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getSecurityRequirement <em>Security Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getHorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getVerticalScaleRequirement <em>Vertical Scale Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getOsRequirement <em>Os Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getImageRequirement <em>Image Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getNetworkRequirement <em>Network Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl#getOptimizationRequirement <em>Optimization Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionRequirementSetImpl extends MinimalEObjectImpl.Container implements ExecutionRequirementSet {
	/**
	 * The cached value of the '{@link #getServiceLevelObjective() <em>Service Level Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelObjective()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelObjective serviceLevelObjective;

	/**
	 * The cached value of the '{@link #getSecurityRequirement() <em>Security Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRequirement()
	 * @generated
	 * @ordered
	 */
	protected SecurityRequirement securityRequirement;

	/**
	 * The cached value of the '{@link #getHorizontalScaleRequirement() <em>Horizontal Scale Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 * @ordered
	 */
	protected HorizontalScaleRequirement horizontalScaleRequirement;

	/**
	 * The cached value of the '{@link #getVerticalScaleRequirement() <em>Vertical Scale Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 * @ordered
	 */
	protected VerticalScaleRequirement verticalScaleRequirement;

	/**
	 * The cached value of the '{@link #getOsRequirement() <em>Os Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsRequirement()
	 * @generated
	 * @ordered
	 */
	protected OSRequirement osRequirement;

	/**
	 * The cached value of the '{@link #getImageRequirement() <em>Image Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRequirement()
	 * @generated
	 * @ordered
	 */
	protected ImageRequirement imageRequirement;

	/**
	 * The cached value of the '{@link #getQualitativeHardwareRequirement() <em>Qualitative Hardware Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 * @ordered
	 */
	protected QualitativeHardwareRequirement qualitativeHardwareRequirement;

	/**
	 * The cached value of the '{@link #getQuantitativeHardwareRequirement() <em>Quantitative Hardware Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 * @ordered
	 */
	protected QuantitativeHardwareRequirement quantitativeHardwareRequirement;

	/**
	 * The cached value of the '{@link #getNetworkRequirement() <em>Network Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkRequirement()
	 * @generated
	 * @ordered
	 */
	protected NetworkRequirement networkRequirement;

	/**
	 * The cached value of the '{@link #getOptimizationRequirement() <em>Optimization Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizationRequirement()
	 * @generated
	 * @ordered
	 */
	protected OptimizationRequirement optimizationRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionRequirementSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.EXECUTION_REQUIREMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjective getServiceLevelObjective() {
		return serviceLevelObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLevelObjective(ServiceLevelObjective newServiceLevelObjective, NotificationChain msgs) {
		ServiceLevelObjective oldServiceLevelObjective = serviceLevelObjective;
		serviceLevelObjective = newServiceLevelObjective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE, oldServiceLevelObjective, newServiceLevelObjective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevelObjective(ServiceLevelObjective newServiceLevelObjective) {
		if (newServiceLevelObjective != serviceLevelObjective) {
			NotificationChain msgs = null;
			if (serviceLevelObjective != null)
				msgs = ((InternalEObject)serviceLevelObjective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE, null, msgs);
			if (newServiceLevelObjective != null)
				msgs = ((InternalEObject)newServiceLevelObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE, null, msgs);
			msgs = basicSetServiceLevelObjective(newServiceLevelObjective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE, newServiceLevelObjective, newServiceLevelObjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement getSecurityRequirement() {
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRequirement(SecurityRequirement newSecurityRequirement, NotificationChain msgs) {
		SecurityRequirement oldSecurityRequirement = securityRequirement;
		securityRequirement = newSecurityRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT, oldSecurityRequirement, newSecurityRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRequirement(SecurityRequirement newSecurityRequirement) {
		if (newSecurityRequirement != securityRequirement) {
			NotificationChain msgs = null;
			if (securityRequirement != null)
				msgs = ((InternalEObject)securityRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT, null, msgs);
			if (newSecurityRequirement != null)
				msgs = ((InternalEObject)newSecurityRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT, null, msgs);
			msgs = basicSetSecurityRequirement(newSecurityRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT, newSecurityRequirement, newSecurityRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalScaleRequirement getHorizontalScaleRequirement() {
		return horizontalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHorizontalScaleRequirement(HorizontalScaleRequirement newHorizontalScaleRequirement, NotificationChain msgs) {
		HorizontalScaleRequirement oldHorizontalScaleRequirement = horizontalScaleRequirement;
		horizontalScaleRequirement = newHorizontalScaleRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT, oldHorizontalScaleRequirement, newHorizontalScaleRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalScaleRequirement(HorizontalScaleRequirement newHorizontalScaleRequirement) {
		if (newHorizontalScaleRequirement != horizontalScaleRequirement) {
			NotificationChain msgs = null;
			if (horizontalScaleRequirement != null)
				msgs = ((InternalEObject)horizontalScaleRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT, null, msgs);
			if (newHorizontalScaleRequirement != null)
				msgs = ((InternalEObject)newHorizontalScaleRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT, null, msgs);
			msgs = basicSetHorizontalScaleRequirement(newHorizontalScaleRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT, newHorizontalScaleRequirement, newHorizontalScaleRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalScaleRequirement getVerticalScaleRequirement() {
		return verticalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalScaleRequirement(VerticalScaleRequirement newVerticalScaleRequirement, NotificationChain msgs) {
		VerticalScaleRequirement oldVerticalScaleRequirement = verticalScaleRequirement;
		verticalScaleRequirement = newVerticalScaleRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT, oldVerticalScaleRequirement, newVerticalScaleRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalScaleRequirement(VerticalScaleRequirement newVerticalScaleRequirement) {
		if (newVerticalScaleRequirement != verticalScaleRequirement) {
			NotificationChain msgs = null;
			if (verticalScaleRequirement != null)
				msgs = ((InternalEObject)verticalScaleRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT, null, msgs);
			if (newVerticalScaleRequirement != null)
				msgs = ((InternalEObject)newVerticalScaleRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT, null, msgs);
			msgs = basicSetVerticalScaleRequirement(newVerticalScaleRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT, newVerticalScaleRequirement, newVerticalScaleRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSRequirement getOsRequirement() {
		return osRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsRequirement(OSRequirement newOsRequirement, NotificationChain msgs) {
		OSRequirement oldOsRequirement = osRequirement;
		osRequirement = newOsRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT, oldOsRequirement, newOsRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsRequirement(OSRequirement newOsRequirement) {
		if (newOsRequirement != osRequirement) {
			NotificationChain msgs = null;
			if (osRequirement != null)
				msgs = ((InternalEObject)osRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT, null, msgs);
			if (newOsRequirement != null)
				msgs = ((InternalEObject)newOsRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT, null, msgs);
			msgs = basicSetOsRequirement(newOsRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT, newOsRequirement, newOsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageRequirement getImageRequirement() {
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageRequirement(ImageRequirement newImageRequirement, NotificationChain msgs) {
		ImageRequirement oldImageRequirement = imageRequirement;
		imageRequirement = newImageRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT, oldImageRequirement, newImageRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageRequirement(ImageRequirement newImageRequirement) {
		if (newImageRequirement != imageRequirement) {
			NotificationChain msgs = null;
			if (imageRequirement != null)
				msgs = ((InternalEObject)imageRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT, null, msgs);
			if (newImageRequirement != null)
				msgs = ((InternalEObject)newImageRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT, null, msgs);
			msgs = basicSetImageRequirement(newImageRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT, newImageRequirement, newImageRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirement getQualitativeHardwareRequirement() {
		return qualitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualitativeHardwareRequirement(QualitativeHardwareRequirement newQualitativeHardwareRequirement, NotificationChain msgs) {
		QualitativeHardwareRequirement oldQualitativeHardwareRequirement = qualitativeHardwareRequirement;
		qualitativeHardwareRequirement = newQualitativeHardwareRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, oldQualitativeHardwareRequirement, newQualitativeHardwareRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeHardwareRequirement(QualitativeHardwareRequirement newQualitativeHardwareRequirement) {
		if (newQualitativeHardwareRequirement != qualitativeHardwareRequirement) {
			NotificationChain msgs = null;
			if (qualitativeHardwareRequirement != null)
				msgs = ((InternalEObject)qualitativeHardwareRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, null, msgs);
			if (newQualitativeHardwareRequirement != null)
				msgs = ((InternalEObject)newQualitativeHardwareRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, null, msgs);
			msgs = basicSetQualitativeHardwareRequirement(newQualitativeHardwareRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT, newQualitativeHardwareRequirement, newQualitativeHardwareRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeHardwareRequirement getQuantitativeHardwareRequirement() {
		return quantitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantitativeHardwareRequirement(QuantitativeHardwareRequirement newQuantitativeHardwareRequirement, NotificationChain msgs) {
		QuantitativeHardwareRequirement oldQuantitativeHardwareRequirement = quantitativeHardwareRequirement;
		quantitativeHardwareRequirement = newQuantitativeHardwareRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, oldQuantitativeHardwareRequirement, newQuantitativeHardwareRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement newQuantitativeHardwareRequirement) {
		if (newQuantitativeHardwareRequirement != quantitativeHardwareRequirement) {
			NotificationChain msgs = null;
			if (quantitativeHardwareRequirement != null)
				msgs = ((InternalEObject)quantitativeHardwareRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, null, msgs);
			if (newQuantitativeHardwareRequirement != null)
				msgs = ((InternalEObject)newQuantitativeHardwareRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, null, msgs);
			msgs = basicSetQuantitativeHardwareRequirement(newQuantitativeHardwareRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT, newQuantitativeHardwareRequirement, newQuantitativeHardwareRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkRequirement getNetworkRequirement() {
		return networkRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkRequirement(NetworkRequirement newNetworkRequirement, NotificationChain msgs) {
		NetworkRequirement oldNetworkRequirement = networkRequirement;
		networkRequirement = newNetworkRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT, oldNetworkRequirement, newNetworkRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkRequirement(NetworkRequirement newNetworkRequirement) {
		if (newNetworkRequirement != networkRequirement) {
			NotificationChain msgs = null;
			if (networkRequirement != null)
				msgs = ((InternalEObject)networkRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT, null, msgs);
			if (newNetworkRequirement != null)
				msgs = ((InternalEObject)newNetworkRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT, null, msgs);
			msgs = basicSetNetworkRequirement(newNetworkRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT, newNetworkRequirement, newNetworkRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationRequirement getOptimizationRequirement() {
		return optimizationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimizationRequirement(OptimizationRequirement newOptimizationRequirement, NotificationChain msgs) {
		OptimizationRequirement oldOptimizationRequirement = optimizationRequirement;
		optimizationRequirement = newOptimizationRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT, oldOptimizationRequirement, newOptimizationRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizationRequirement(OptimizationRequirement newOptimizationRequirement) {
		if (newOptimizationRequirement != optimizationRequirement) {
			NotificationChain msgs = null;
			if (optimizationRequirement != null)
				msgs = ((InternalEObject)optimizationRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT, null, msgs);
			if (newOptimizationRequirement != null)
				msgs = ((InternalEObject)newOptimizationRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT, null, msgs);
			msgs = basicSetOptimizationRequirement(newOptimizationRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT, newOptimizationRequirement, newOptimizationRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE:
				return basicSetServiceLevelObjective(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT:
				return basicSetSecurityRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT:
				return basicSetHorizontalScaleRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT:
				return basicSetVerticalScaleRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT:
				return basicSetOsRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT:
				return basicSetImageRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT:
				return basicSetQualitativeHardwareRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT:
				return basicSetQuantitativeHardwareRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT:
				return basicSetNetworkRequirement(null, msgs);
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT:
				return basicSetOptimizationRequirement(null, msgs);
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
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE:
				return getServiceLevelObjective();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT:
				return getSecurityRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT:
				return getHorizontalScaleRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT:
				return getVerticalScaleRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT:
				return getOsRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT:
				return getImageRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT:
				return getQualitativeHardwareRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT:
				return getQuantitativeHardwareRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT:
				return getNetworkRequirement();
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT:
				return getOptimizationRequirement();
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
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE:
				setServiceLevelObjective((ServiceLevelObjective)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT:
				setSecurityRequirement((SecurityRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT:
				setHorizontalScaleRequirement((HorizontalScaleRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT:
				setVerticalScaleRequirement((VerticalScaleRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT:
				setOsRequirement((OSRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT:
				setImageRequirement((ImageRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT:
				setQualitativeHardwareRequirement((QualitativeHardwareRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT:
				setQuantitativeHardwareRequirement((QuantitativeHardwareRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT:
				setNetworkRequirement((NetworkRequirement)newValue);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT:
				setOptimizationRequirement((OptimizationRequirement)newValue);
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
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE:
				setServiceLevelObjective((ServiceLevelObjective)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT:
				setSecurityRequirement((SecurityRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT:
				setHorizontalScaleRequirement((HorizontalScaleRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT:
				setVerticalScaleRequirement((VerticalScaleRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT:
				setOsRequirement((OSRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT:
				setImageRequirement((ImageRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT:
				setQualitativeHardwareRequirement((QualitativeHardwareRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT:
				setQuantitativeHardwareRequirement((QuantitativeHardwareRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT:
				setNetworkRequirement((NetworkRequirement)null);
				return;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT:
				setOptimizationRequirement((OptimizationRequirement)null);
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
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE:
				return serviceLevelObjective != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT:
				return securityRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT:
				return horizontalScaleRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT:
				return verticalScaleRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT:
				return osRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT:
				return imageRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT:
				return qualitativeHardwareRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT:
				return quantitativeHardwareRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT:
				return networkRequirement != null;
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT:
				return optimizationRequirement != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionRequirementSetImpl
