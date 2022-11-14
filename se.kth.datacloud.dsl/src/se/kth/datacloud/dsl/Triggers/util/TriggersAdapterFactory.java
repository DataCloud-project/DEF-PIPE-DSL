/**
 */
package se.kth.datacloud.dsl.Triggers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.Triggers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage
 * @generated
 */
public class TriggersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TriggersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TriggersPackage.eINSTANCE;
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
	protected TriggersSwitch<Adapter> modelSwitch =
		new TriggersSwitch<Adapter>() {
			@Override
			public Adapter caseScheduleTrigger(ScheduleTrigger object) {
				return createScheduleTriggerAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseExternalEventTrigger(ExternalEventTrigger object) {
				return createExternalEventTriggerAdapter();
			}
			@Override
			public Adapter caseOneTimeTrigger(OneTimeTrigger object) {
				return createOneTimeTriggerAdapter();
			}
			@Override
			public Adapter caseCronScheduleTrigger(CronScheduleTrigger object) {
				return createCronScheduleTriggerAdapter();
			}
			@Override
			public Adapter caseIntervalScheduleTrigger(IntervalScheduleTrigger object) {
				return createIntervalScheduleTriggerAdapter();
			}
			@Override
			public Adapter casePollingTrigger(PollingTrigger object) {
				return createPollingTriggerAdapter();
			}
			@Override
			public Adapter casePollDatabaseTrigger(PollDatabaseTrigger object) {
				return createPollDatabaseTriggerAdapter();
			}
			@Override
			public Adapter casePollMessageQueueTrigger(PollMessageQueueTrigger object) {
				return createPollMessageQueueTriggerAdapter();
			}
			@Override
			public Adapter casePollWebServiceTrigger(PollWebServiceTrigger object) {
				return createPollWebServiceTriggerAdapter();
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
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.ScheduleTrigger
	 * @generated
	 */
	public Adapter createScheduleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.ExternalEventTrigger <em>External Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.ExternalEventTrigger
	 * @generated
	 */
	public Adapter createExternalEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger <em>One Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.OneTimeTrigger
	 * @generated
	 */
	public Adapter createOneTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger <em>Cron Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.CronScheduleTrigger
	 * @generated
	 */
	public Adapter createCronScheduleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger <em>Interval Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger
	 * @generated
	 */
	public Adapter createIntervalScheduleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger <em>Polling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.PollingTrigger
	 * @generated
	 */
	public Adapter createPollingTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger <em>Poll Database Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger
	 * @generated
	 */
	public Adapter createPollDatabaseTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger <em>Poll Message Queue Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger
	 * @generated
	 */
	public Adapter createPollMessageQueueTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger <em>Poll Web Service Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger
	 * @generated
	 */
	public Adapter createPollWebServiceTriggerAdapter() {
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

} //TriggersAdapterFactory
