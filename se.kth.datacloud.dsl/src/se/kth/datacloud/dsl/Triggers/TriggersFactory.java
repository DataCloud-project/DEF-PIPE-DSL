/**
 */
package se.kth.datacloud.dsl.Triggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage
 * @generated
 */
public interface TriggersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersFactory eINSTANCE = se.kth.datacloud.dsl.Triggers.impl.TriggersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Trigger</em>'.
	 * @generated
	 */
	ScheduleTrigger createScheduleTrigger();

	/**
	 * Returns a new object of class '<em>External Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Event Trigger</em>'.
	 * @generated
	 */
	ExternalEventTrigger createExternalEventTrigger();

	/**
	 * Returns a new object of class '<em>One Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Time Trigger</em>'.
	 * @generated
	 */
	OneTimeTrigger createOneTimeTrigger();

	/**
	 * Returns a new object of class '<em>Cron Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Schedule Trigger</em>'.
	 * @generated
	 */
	CronScheduleTrigger createCronScheduleTrigger();

	/**
	 * Returns a new object of class '<em>Interval Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval Schedule Trigger</em>'.
	 * @generated
	 */
	IntervalScheduleTrigger createIntervalScheduleTrigger();

	/**
	 * Returns a new object of class '<em>Poll Database Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll Database Trigger</em>'.
	 * @generated
	 */
	PollDatabaseTrigger createPollDatabaseTrigger();

	/**
	 * Returns a new object of class '<em>Poll Message Queue Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll Message Queue Trigger</em>'.
	 * @generated
	 */
	PollMessageQueueTrigger createPollMessageQueueTrigger();

	/**
	 * Returns a new object of class '<em>Poll Web Service Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll Web Service Trigger</em>'.
	 * @generated
	 */
	PollWebServiceTrigger createPollWebServiceTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TriggersPackage getTriggersPackage();

} //TriggersFactory
