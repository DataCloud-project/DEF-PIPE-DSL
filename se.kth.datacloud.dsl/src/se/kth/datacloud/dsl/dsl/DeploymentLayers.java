/**
 */
package se.kth.datacloud.dsl.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Layers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getDeploymentLayers()
 * @model
 * @generated
 */
public enum DeploymentLayers implements Enumerator {
	/**
	 * The '<em><b>EDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE_VALUE
	 * @generated
	 * @ordered
	 */
	EDGE(1, "EDGE", "EDGE"),

	/**
	 * The '<em><b>FOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOG_VALUE
	 * @generated
	 * @ordered
	 */
	FOG(1, "FOG", "FOG"),

	/**
	 * The '<em><b>CLOUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD(2, "CLOUD", "CLOUD");

	/**
	 * The '<em><b>EDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDGE_VALUE = 1;

	/**
	 * The '<em><b>FOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOG_VALUE = 1;

	/**
	 * The '<em><b>CLOUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Deployment Layers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentLayers[] VALUES_ARRAY =
		new DeploymentLayers[] {
			EDGE,
			FOG,
			CLOUD,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Layers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentLayers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Layers</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLayers get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentLayers result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Layers</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLayers getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentLayers result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Layers</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLayers get(int value) {
		switch (value) {
			case EDGE_VALUE: return EDGE;
			case CLOUD_VALUE: return CLOUD;
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
	private DeploymentLayers(int value, String name, String literal) {
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
	
} //DeploymentLayers
