/**
 */
package se.kth.datacloud.dsl.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.CompositeStep#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getCompositeStep()
 * @model
 * @generated
 */
public interface CompositeStep extends AbstractStep {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.dsl.AbstractStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getCompositeStep_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractStep> getSteps();

} // CompositeStep
