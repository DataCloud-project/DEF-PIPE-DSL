/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPre <em>Pre</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionSet()
 * @model
 * @generated
 */
public interface ConditionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' reference.
	 * @see #setPre(PreCondition)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionSet_Pre()
	 * @model
	 * @generated
	 */
	PreCondition getPre();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPre <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(PreCondition value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' reference.
	 * @see #setPost(PostCondition)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getConditionSet_Post()
	 * @model
	 * @generated
	 */
	PostCondition getPost();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPost <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostCondition value);

} // ConditionSet
