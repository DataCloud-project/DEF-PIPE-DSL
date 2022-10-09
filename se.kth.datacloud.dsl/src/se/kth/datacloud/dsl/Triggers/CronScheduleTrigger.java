/**
 */
package se.kth.datacloud.dsl.Triggers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger#getCronExpression <em>Cron Expression</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getCronScheduleTrigger()
 * @model
 * @generated
 */
public interface CronScheduleTrigger extends ScheduleTrigger {
	/**
	 * Returns the value of the '<em><b>Cron Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron Expression</em>' attribute.
	 * @see #setCronExpression(String)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getCronScheduleTrigger_CronExpression()
	 * @model
	 * @generated
	 */
	String getCronExpression();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger#getCronExpression <em>Cron Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron Expression</em>' attribute.
	 * @see #getCronExpression()
	 * @generated
	 */
	void setCronExpression(String value);

} // CronScheduleTrigger
