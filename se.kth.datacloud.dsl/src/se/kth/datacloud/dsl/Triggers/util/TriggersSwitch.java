/**
 */
package se.kth.datacloud.dsl.Triggers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import se.kth.datacloud.dsl.Triggers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage
 * @generated
 */
public class TriggersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TriggersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersSwitch() {
		if (modelPackage == null) {
			modelPackage = TriggersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TriggersPackage.SCHEDULE_TRIGGER: {
				ScheduleTrigger scheduleTrigger = (ScheduleTrigger)theEObject;
				T result = caseScheduleTrigger(scheduleTrigger);
				if (result == null) result = caseTrigger(scheduleTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.EXTERNAL_EVENT_TRIGGER: {
				ExternalEventTrigger externalEventTrigger = (ExternalEventTrigger)theEObject;
				T result = caseExternalEventTrigger(externalEventTrigger);
				if (result == null) result = caseTrigger(externalEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.ONE_TIME_TRIGGER: {
				OneTimeTrigger oneTimeTrigger = (OneTimeTrigger)theEObject;
				T result = caseOneTimeTrigger(oneTimeTrigger);
				if (result == null) result = caseTrigger(oneTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.CRON_SCHEDULE_TRIGGER: {
				CronScheduleTrigger cronScheduleTrigger = (CronScheduleTrigger)theEObject;
				T result = caseCronScheduleTrigger(cronScheduleTrigger);
				if (result == null) result = caseScheduleTrigger(cronScheduleTrigger);
				if (result == null) result = caseTrigger(cronScheduleTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER: {
				IntervalScheduleTrigger intervalScheduleTrigger = (IntervalScheduleTrigger)theEObject;
				T result = caseIntervalScheduleTrigger(intervalScheduleTrigger);
				if (result == null) result = caseScheduleTrigger(intervalScheduleTrigger);
				if (result == null) result = caseTrigger(intervalScheduleTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.POLLING_TRIGGER: {
				PollingTrigger pollingTrigger = (PollingTrigger)theEObject;
				T result = casePollingTrigger(pollingTrigger);
				if (result == null) result = caseTrigger(pollingTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.POLL_DATABASE_TRIGGER: {
				PollDatabaseTrigger pollDatabaseTrigger = (PollDatabaseTrigger)theEObject;
				T result = casePollDatabaseTrigger(pollDatabaseTrigger);
				if (result == null) result = casePollingTrigger(pollDatabaseTrigger);
				if (result == null) result = caseTrigger(pollDatabaseTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER: {
				PollMessageQueueTrigger pollMessageQueueTrigger = (PollMessageQueueTrigger)theEObject;
				T result = casePollMessageQueueTrigger(pollMessageQueueTrigger);
				if (result == null) result = casePollingTrigger(pollMessageQueueTrigger);
				if (result == null) result = caseTrigger(pollMessageQueueTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER: {
				PollWebServiceTrigger pollWebServiceTrigger = (PollWebServiceTrigger)theEObject;
				T result = casePollWebServiceTrigger(pollWebServiceTrigger);
				if (result == null) result = casePollingTrigger(pollWebServiceTrigger);
				if (result == null) result = caseTrigger(pollWebServiceTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleTrigger(ScheduleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEventTrigger(ExternalEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneTimeTrigger(OneTimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cron Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cron Schedule Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCronScheduleTrigger(CronScheduleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Schedule Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalScheduleTrigger(IntervalScheduleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polling Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polling Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollingTrigger(PollingTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Database Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Database Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollDatabaseTrigger(PollDatabaseTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Message Queue Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Message Queue Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollMessageQueueTrigger(PollMessageQueueTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Web Service Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Web Service Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollWebServiceTrigger(PollWebServiceTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TriggersSwitch
