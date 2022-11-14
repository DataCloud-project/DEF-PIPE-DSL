/**
 */
package se.kth.datacloud.dsl.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Communication Medium Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getCommunicationMediumTypes()
 * @model
 * @generated
 */
public enum CommunicationMediumTypes implements Enumerator {
	/**
	 * The '<em><b>MESSAGE QUEUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_QUEUE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_QUEUE(0, "MESSAGE_QUEUE", "MESSAGE_QUEUE"),

	/**
	 * The '<em><b>DISTRIBUTED FILE SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_FILE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTED_FILE_SYSTEM(1, "DISTRIBUTED_FILE_SYSTEM", "DISTRIBUTED_FILE_SYSTEM"),

	/**
	 * The '<em><b>WEB SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SERVICE(2, "WEB_SERVICE", "WEB_SERVICE");

	/**
	 * The '<em><b>MESSAGE QUEUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_QUEUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_QUEUE_VALUE = 0;

	/**
	 * The '<em><b>DISTRIBUTED FILE SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_FILE_SYSTEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTED_FILE_SYSTEM_VALUE = 1;

	/**
	 * The '<em><b>WEB SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SERVICE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Communication Medium Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommunicationMediumTypes[] VALUES_ARRAY =
		new CommunicationMediumTypes[] {
			MESSAGE_QUEUE,
			DISTRIBUTED_FILE_SYSTEM,
			WEB_SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Communication Medium Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommunicationMediumTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Communication Medium Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationMediumTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationMediumTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Medium Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationMediumTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationMediumTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Medium Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationMediumTypes get(int value) {
		switch (value) {
			case MESSAGE_QUEUE_VALUE: return MESSAGE_QUEUE;
			case DISTRIBUTED_FILE_SYSTEM_VALUE: return DISTRIBUTED_FILE_SYSTEM;
			case WEB_SERVICE_VALUE: return WEB_SERVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CommunicationMediumTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CommunicationMediumTypes
