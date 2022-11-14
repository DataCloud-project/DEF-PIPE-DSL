/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;

import se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage;

import se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet;
import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.HardRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.HardwareRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.Metric;
import se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.OSOrImageRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ScaleRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl;
import se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective;
import se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement;
import se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage;

import se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl;

import se.kth.datacloud.dsl.Triggers.TriggersPackage;

import se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl;

import se.kth.datacloud.dsl.dsl.DslPackage;

import se.kth.datacloud.dsl.dsl.impl.DslPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionRequirementsPackageImpl extends EPackageImpl implements ExecutionRequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionRequirementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalScaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeHardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osOrImageRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalScaleRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeHardwareRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionRequirementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionRequirementsPackageImpl() {
		super(eNS_URI, ExecutionRequirementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExecutionRequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionRequirementsPackage init() {
		if (isInited) return (ExecutionRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExecutionRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExecutionRequirementsPackageImpl theExecutionRequirementsPackage = registeredExecutionRequirementsPackage instanceof ExecutionRequirementsPackageImpl ? (ExecutionRequirementsPackageImpl)registeredExecutionRequirementsPackage : new ExecutionRequirementsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		DslPackageImpl theDslPackage = (DslPackageImpl)(registeredPackage instanceof DslPackageImpl ? registeredPackage : DslPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		EnvironmentVariablesPackageImpl theEnvironmentVariablesPackage = (EnvironmentVariablesPackageImpl)(registeredPackage instanceof EnvironmentVariablesPackageImpl ? registeredPackage : EnvironmentVariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		ControlParametersPackageImpl theControlParametersPackage = (ControlParametersPackageImpl)(registeredPackage instanceof ControlParametersPackageImpl ? registeredPackage : ControlParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = (ResourceProvidersPackageImpl)(registeredPackage instanceof ResourceProvidersPackageImpl ? registeredPackage : ResourceProvidersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = (DataSourceParametersPackageImpl)(registeredPackage instanceof DataSourceParametersPackageImpl ? registeredPackage : DataSourceParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionRequirementsPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theControlParametersPackage.createPackageContents();
		theResourceProvidersPackage.createPackageContents();
		theDataSourceParametersPackage.createPackageContents();

		// Initialize created meta-data
		theExecutionRequirementsPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theControlParametersPackage.initializePackageContents();
		theResourceProvidersPackage.initializePackageContents();
		theDataSourceParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionRequirementsPackage.eNS_URI, theExecutionRequirementsPackage);
		return theExecutionRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionRequirementSet() {
		return executionRequirementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_ServiceLevelObjective() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_SecurityRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_HorizontalScaleRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_VerticalScaleRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_OsRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_ImageRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_QualitativeHardwareRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_QuantitativeHardwareRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_NetworkRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionRequirementSet_OptimizationRequirement() {
		return (EReference)executionRequirementSetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardRequirement() {
		return hardRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftRequirement() {
		return softRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftRequirement_Priority() {
		return (EAttribute)softRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_ValueDirection() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_IsVariable() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimizationRequirement() {
		return optimizationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizationRequirement_OptimisationFunction() {
		return (EAttribute)optimizationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimizationRequirement_Metric() {
		return (EReference)optimizationRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareRequirement() {
		return hardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelCondition() {
		return serviceLevelConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelCondition_Name() {
		return (EAttribute)serviceLevelConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelCondition_ComparisonOperator() {
		return (EAttribute)serviceLevelConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelCondition_Threshold() {
		return (EAttribute)serviceLevelConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelCondition_Validity() {
		return (EAttribute)serviceLevelConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalScaleRequirement() {
		return horizontalScaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalScaleRequirement_MinInstance() {
		return (EAttribute)horizontalScaleRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalScaleRequirement_MaxInstance() {
		return (EAttribute)horizontalScaleRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRequirement_SecurityParameters() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSRequirement() {
		return osRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSRequirement_OsType() {
		return (EAttribute)osRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSRequirement_Is64os() {
		return (EAttribute)osRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelObjective() {
		return serviceLevelObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelObjective_CustomServiceLevel() {
		return (EReference)serviceLevelObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityControl() {
		return securityControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Name() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityControl_Specification() {
		return (EAttribute)securityControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativeHardwareRequirement() {
		return quantitativeHardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinCpu() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxCpu() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinRamMiB() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxRamMiB() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MinStorageMB() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_MaxStorageMB() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_CpuFrequency() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_CpuNumberOfCores() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeHardwareRequirement_GpuAvailability() {
		return (EAttribute)quantitativeHardwareRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleRequirement() {
		return scaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSOrImageRequirement() {
		return osOrImageRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageRequirement() {
		return imageRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageRequirement_ImageId() {
		return (EAttribute)imageRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalScaleRequirement() {
		return verticalScaleRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinCpu() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxCpu() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinRamMiB() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxRamMiB() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinCores() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxCores() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MinStorageMB() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScaleRequirement_MaxStorageMB() {
		return (EAttribute)verticalScaleRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitativeHardwareRequirement() {
		return qualitativeHardwareRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_MinBenchmark() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_MaxBenchmark() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_CpuArchitecture() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeHardwareRequirement_GpuArchitecture() {
		return (EAttribute)qualitativeHardwareRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkRequirement() {
		return networkRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkRequirement_MinBandwidth() {
		return (EAttribute)networkRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkRequirement_MaxBandwidth() {
		return (EAttribute)networkRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkRequirement_MinLatency() {
		return (EAttribute)networkRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkRequirement_MaxLatency() {
		return (EAttribute)networkRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionRequirement() {
		return executionRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsFactory getExecutionRequirementsFactory() {
		return (ExecutionRequirementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executionRequirementSetEClass = createEClass(EXECUTION_REQUIREMENT_SET);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT);
		createEReference(executionRequirementSetEClass, EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT);

		hardRequirementEClass = createEClass(HARD_REQUIREMENT);

		softRequirementEClass = createEClass(SOFT_REQUIREMENT);
		createEAttribute(softRequirementEClass, SOFT_REQUIREMENT__PRIORITY);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__VALUE_DIRECTION);
		createEAttribute(metricEClass, METRIC__IS_VARIABLE);

		optimizationRequirementEClass = createEClass(OPTIMIZATION_REQUIREMENT);
		createEAttribute(optimizationRequirementEClass, OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION);
		createEReference(optimizationRequirementEClass, OPTIMIZATION_REQUIREMENT__METRIC);

		hardwareRequirementEClass = createEClass(HARDWARE_REQUIREMENT);

		serviceLevelConditionEClass = createEClass(SERVICE_LEVEL_CONDITION);
		createEAttribute(serviceLevelConditionEClass, SERVICE_LEVEL_CONDITION__NAME);
		createEAttribute(serviceLevelConditionEClass, SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR);
		createEAttribute(serviceLevelConditionEClass, SERVICE_LEVEL_CONDITION__THRESHOLD);
		createEAttribute(serviceLevelConditionEClass, SERVICE_LEVEL_CONDITION__VALIDITY);

		horizontalScaleRequirementEClass = createEClass(HORIZONTAL_SCALE_REQUIREMENT);
		createEAttribute(horizontalScaleRequirementEClass, HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE);
		createEAttribute(horizontalScaleRequirementEClass, HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_PARAMETERS);

		osRequirementEClass = createEClass(OS_REQUIREMENT);
		createEAttribute(osRequirementEClass, OS_REQUIREMENT__OS_TYPE);
		createEAttribute(osRequirementEClass, OS_REQUIREMENT__IS64OS);

		serviceLevelObjectiveEClass = createEClass(SERVICE_LEVEL_OBJECTIVE);
		createEReference(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL);

		securityControlEClass = createEClass(SECURITY_CONTROL);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__NAME);
		createEAttribute(securityControlEClass, SECURITY_CONTROL__SPECIFICATION);

		quantitativeHardwareRequirementEClass = createEClass(QUANTITATIVE_HARDWARE_REQUIREMENT);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES);
		createEAttribute(quantitativeHardwareRequirementEClass, QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY);

		scaleRequirementEClass = createEClass(SCALE_REQUIREMENT);

		osOrImageRequirementEClass = createEClass(OS_OR_IMAGE_REQUIREMENT);

		imageRequirementEClass = createEClass(IMAGE_REQUIREMENT);
		createEAttribute(imageRequirementEClass, IMAGE_REQUIREMENT__IMAGE_ID);

		verticalScaleRequirementEClass = createEClass(VERTICAL_SCALE_REQUIREMENT);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_CPU);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_CPU);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_CORES);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_CORES);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB);
		createEAttribute(verticalScaleRequirementEClass, VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB);

		qualitativeHardwareRequirementEClass = createEClass(QUALITATIVE_HARDWARE_REQUIREMENT);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE);
		createEAttribute(qualitativeHardwareRequirementEClass, QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE);

		networkRequirementEClass = createEClass(NETWORK_REQUIREMENT);
		createEAttribute(networkRequirementEClass, NETWORK_REQUIREMENT__MIN_BANDWIDTH);
		createEAttribute(networkRequirementEClass, NETWORK_REQUIREMENT__MAX_BANDWIDTH);
		createEAttribute(networkRequirementEClass, NETWORK_REQUIREMENT__MIN_LATENCY);
		createEAttribute(networkRequirementEClass, NETWORK_REQUIREMENT__MAX_LATENCY);

		executionRequirementEClass = createEClass(EXECUTION_REQUIREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DslPackage theDslPackage = (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hardRequirementEClass.getESuperTypes().add(this.getExecutionRequirement());
		softRequirementEClass.getESuperTypes().add(this.getExecutionRequirement());
		optimizationRequirementEClass.getESuperTypes().add(this.getSoftRequirement());
		hardwareRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		horizontalScaleRequirementEClass.getESuperTypes().add(this.getScaleRequirement());
		securityRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		osRequirementEClass.getESuperTypes().add(this.getOSOrImageRequirement());
		serviceLevelObjectiveEClass.getESuperTypes().add(this.getHardRequirement());
		quantitativeHardwareRequirementEClass.getESuperTypes().add(this.getHardwareRequirement());
		scaleRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		osOrImageRequirementEClass.getESuperTypes().add(this.getHardRequirement());
		imageRequirementEClass.getESuperTypes().add(this.getOSOrImageRequirement());
		verticalScaleRequirementEClass.getESuperTypes().add(this.getScaleRequirement());
		qualitativeHardwareRequirementEClass.getESuperTypes().add(this.getHardwareRequirement());
		networkRequirementEClass.getESuperTypes().add(this.getHardwareRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(executionRequirementSetEClass, ExecutionRequirementSet.class, "ExecutionRequirementSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionRequirementSet_ServiceLevelObjective(), this.getServiceLevelObjective(), null, "serviceLevelObjective", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_SecurityRequirement(), this.getSecurityRequirement(), null, "securityRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_HorizontalScaleRequirement(), this.getHorizontalScaleRequirement(), null, "horizontalScaleRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_VerticalScaleRequirement(), this.getVerticalScaleRequirement(), null, "verticalScaleRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_OsRequirement(), this.getOSRequirement(), null, "osRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_ImageRequirement(), this.getImageRequirement(), null, "imageRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_QualitativeHardwareRequirement(), this.getQualitativeHardwareRequirement(), null, "qualitativeHardwareRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_QuantitativeHardwareRequirement(), this.getQuantitativeHardwareRequirement(), null, "quantitativeHardwareRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_NetworkRequirement(), this.getNetworkRequirement(), null, "networkRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionRequirementSet_OptimizationRequirement(), this.getOptimizationRequirement(), null, "optimizationRequirement", null, 0, 1, ExecutionRequirementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardRequirementEClass, HardRequirement.class, "HardRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softRequirementEClass, SoftRequirement.class, "SoftRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftRequirement_Priority(), ecorePackage.getEDouble(), "priority", null, 0, 1, SoftRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_ValueDirection(), ecorePackage.getEShort(), "valueDirection", "0", 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_IsVariable(), ecorePackage.getEBoolean(), "isVariable", "false", 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimizationRequirementEClass, OptimizationRequirement.class, "OptimizationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimizationRequirement_OptimisationFunction(), ecorePackage.getEString(), "optimisationFunction", "MINIMIZE", 0, 1, OptimizationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizationRequirement_Metric(), this.getMetric(), null, "metric", null, 1, 1, OptimizationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareRequirementEClass, HardwareRequirement.class, "HardwareRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceLevelConditionEClass, ServiceLevelCondition.class, "ServiceLevelCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceLevelCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelCondition_ComparisonOperator(), theDslPackage.getComparisonOperatorType(), "comparisonOperator", "GREATER_THAN", 0, 1, ServiceLevelCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelCondition_Threshold(), ecorePackage.getEDouble(), "threshold", "0", 0, 1, ServiceLevelCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelCondition_Validity(), ecorePackage.getEDate(), "validity", null, 0, 1, ServiceLevelCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalScaleRequirementEClass, HorizontalScaleRequirement.class, "HorizontalScaleRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalScaleRequirement_MinInstance(), ecorePackage.getEInt(), "minInstance", "0", 0, 1, HorizontalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalScaleRequirement_MaxInstance(), ecorePackage.getEInt(), "maxInstance", "0", 0, 1, HorizontalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirement_SecurityParameters(), this.getSecurityControl(), null, "securityParameters", null, 1, -1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osRequirementEClass, OSRequirement.class, "OSRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSRequirement_OsType(), ecorePackage.getEString(), "osType", null, 0, 1, OSRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSRequirement_Is64os(), ecorePackage.getEBoolean(), "is64os", "true", 0, 1, OSRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelObjectiveEClass, ServiceLevelObjective.class, "ServiceLevelObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjective_CustomServiceLevel(), this.getServiceLevelCondition(), null, "customServiceLevel", null, 1, 1, ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityControlEClass, SecurityControl.class, "SecurityControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityControl_Specification(), ecorePackage.getEString(), "specification", null, 0, 1, SecurityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeHardwareRequirementEClass, QuantitativeHardwareRequirement.class, "QuantitativeHardwareRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativeHardwareRequirement_MinCpu(), ecorePackage.getEDouble(), "minCpu", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxCpu(), ecorePackage.getEDouble(), "maxCpu", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MinRamMiB(), ecorePackage.getEInt(), "minRamMiB", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxRamMiB(), ecorePackage.getEInt(), "maxRamMiB", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MinStorageMB(), ecorePackage.getEInt(), "minStorageMB", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_MaxStorageMB(), ecorePackage.getEInt(), "maxStorageMB", "0", 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_CpuFrequency(), ecorePackage.getEDouble(), "cpuFrequency", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_CpuNumberOfCores(), ecorePackage.getEInt(), "cpuNumberOfCores", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeHardwareRequirement_GpuAvailability(), ecorePackage.getEBoolean(), "gpuAvailability", null, 0, 1, QuantitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleRequirementEClass, ScaleRequirement.class, "ScaleRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osOrImageRequirementEClass, OSOrImageRequirement.class, "OSOrImageRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageRequirementEClass, ImageRequirement.class, "ImageRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageRequirement_ImageId(), ecorePackage.getEString(), "imageId", null, 0, 1, ImageRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verticalScaleRequirementEClass, VerticalScaleRequirement.class, "VerticalScaleRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalScaleRequirement_MinCpu(), ecorePackage.getEDouble(), "minCpu", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxCpu(), ecorePackage.getEDouble(), "maxCpu", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinRamMiB(), ecorePackage.getEInt(), "minRamMiB", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxRamMiB(), ecorePackage.getEInt(), "maxRamMiB", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinCores(), ecorePackage.getEInt(), "minCores", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxCores(), ecorePackage.getEInt(), "maxCores", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MinStorageMB(), ecorePackage.getEInt(), "minStorageMB", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalScaleRequirement_MaxStorageMB(), ecorePackage.getEInt(), "maxStorageMB", "0", 0, 1, VerticalScaleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeHardwareRequirementEClass, QualitativeHardwareRequirement.class, "QualitativeHardwareRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualitativeHardwareRequirement_MinBenchmark(), ecorePackage.getEDouble(), "minBenchmark", "0", 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualitativeHardwareRequirement_MaxBenchmark(), ecorePackage.getEDouble(), "maxBenchmark", "0", 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualitativeHardwareRequirement_CpuArchitecture(), ecorePackage.getEString(), "cpuArchitecture", null, 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualitativeHardwareRequirement_GpuArchitecture(), ecorePackage.getEString(), "gpuArchitecture", null, 0, 1, QualitativeHardwareRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkRequirementEClass, NetworkRequirement.class, "NetworkRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkRequirement_MinBandwidth(), ecorePackage.getEDouble(), "minBandwidth", "0.0", 0, 1, NetworkRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkRequirement_MaxBandwidth(), ecorePackage.getEDouble(), "maxBandwidth", null, 0, 1, NetworkRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkRequirement_MinLatency(), ecorePackage.getEInt(), "minLatency", null, 0, 1, NetworkRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkRequirement_MaxLatency(), ecorePackage.getEInt(), "maxLatency", null, 0, 1, NetworkRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionRequirementEClass, ExecutionRequirement.class, "ExecutionRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutionRequirementsPackageImpl
