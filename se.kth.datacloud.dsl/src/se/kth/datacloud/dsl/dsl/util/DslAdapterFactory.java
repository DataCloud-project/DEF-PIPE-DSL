/**
 */
package se.kth.datacloud.dsl.dsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.dsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslSwitch<Adapter> modelSwitch =
		new DslSwitch<Adapter>() {
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseAbstractStep(AbstractStep object) {
				return createAbstractStepAdapter();
			}
			@Override
			public Adapter caseCommunicationMedium(CommunicationMedium object) {
				return createCommunicationMediumAdapter();
			}
			@Override
			public Adapter caseStepImplementation(StepImplementation object) {
				return createStepImplementationAdapter();
			}
			@Override
			public Adapter caseContainerImplementation(ContainerImplementation object) {
				return createContainerImplementationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseCompositeStep(CompositeStep object) {
				return createCompositeStepAdapter();
			}
			@Override
			public Adapter caseStepTemplate(StepTemplate object) {
				return createStepTemplateAdapter();
			}
			@Override
			public Adapter caseParameterGroup(ParameterGroup object) {
				return createParameterGroupAdapter();
			}
			@Override
			public Adapter caseDataProcesssing(DataProcesssing object) {
				return createDataProcesssingAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSink(DataSink object) {
				return createDataSinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.AbstractStep <em>Abstract Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep
	 * @generated
	 */
	public Adapter createAbstractStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.CommunicationMedium <em>Communication Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMedium
	 * @generated
	 */
	public Adapter createCommunicationMediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.StepImplementation <em>Step Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.StepImplementation
	 * @generated
	 */
	public Adapter createStepImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.ContainerImplementation <em>Container Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.ContainerImplementation
	 * @generated
	 */
	public Adapter createContainerImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.CompositeStep <em>Composite Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.CompositeStep
	 * @generated
	 */
	public Adapter createCompositeStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.StepTemplate <em>Step Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.StepTemplate
	 * @generated
	 */
	public Adapter createStepTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.ParameterGroup
	 * @generated
	 */
	public Adapter createParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.DataProcesssing <em>Data Processsing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.DataProcesssing
	 * @generated
	 */
	public Adapter createDataProcesssingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.dsl.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.dsl.DataSink
	 * @generated
	 */
	public Adapter createDataSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DslAdapterFactory
