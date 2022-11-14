/**
 */
package se.kth.datacloud.dsl.dsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesFactory;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory;

import se.kth.datacloud.dsl.Triggers.TriggersFactory;

import se.kth.datacloud.dsl.dsl.AbstractStep;
import se.kth.datacloud.dsl.dsl.DslFactory;
import se.kth.datacloud.dsl.dsl.DslPackage;

/**
 * This is the item provider adapter for a {@link se.kth.datacloud.dsl.dsl.AbstractStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractStepItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStepItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPreviousPropertyDescriptor(object);
			addControlParemeterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractStep_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractStep_name_feature", "_UI_AbstractStep_type"),
				 DslPackage.Literals.ABSTRACT_STEP__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractStep_previous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractStep_previous_feature", "_UI_AbstractStep_type"),
				 DslPackage.Literals.ABSTRACT_STEP__PREVIOUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Paremeter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlParemeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractStep_controlParemeter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractStep_controlParemeter_feature", "_UI_AbstractStep_type"),
				 DslPackage.Literals.ABSTRACT_STEP__CONTROL_PAREMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS);
			childrenFeatures.add(DslPackage.Literals.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET);
			childrenFeatures.add(DslPackage.Literals.ABSTRACT_STEP__RESOURCE_PROVIDER);
			childrenFeatures.add(DslPackage.Literals.ABSTRACT_STEP__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(DslPackage.Literals.ABSTRACT_STEP__IMPLEMENTATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractStep_type") :
			getString("_UI_AbstractStep_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractStep.class)) {
			case DslPackage.ABSTRACT_STEP__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DslPackage.ABSTRACT_STEP__TRIGGERS:
			case DslPackage.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET:
			case DslPackage.ABSTRACT_STEP__RESOURCE_PROVIDER:
			case DslPackage.ABSTRACT_STEP__ENVIRONMENT_VARIABLES:
			case DslPackage.ABSTRACT_STEP__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createScheduleTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createExternalEventTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createOneTimeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createCronScheduleTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createIntervalScheduleTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createPollDatabaseTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createPollMessageQueueTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__TRIGGERS,
				 TriggersFactory.eINSTANCE.createPollWebServiceTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET,
				 ExecutionRequirementsFactory.eINSTANCE.createExecutionRequirementSet()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__RESOURCE_PROVIDER,
				 ResourceProvidersFactory.eINSTANCE.createCloudProvider()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__RESOURCE_PROVIDER,
				 ResourceProvidersFactory.eINSTANCE.createFogProvider()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__RESOURCE_PROVIDER,
				 ResourceProvidersFactory.eINSTANCE.createEdgeProvider()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__ENVIRONMENT_VARIABLES,
				 EnvironmentVariablesFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DslPackage.Literals.ABSTRACT_STEP__IMPLEMENTATION,
				 DslFactory.eINSTANCE.createContainerImplementation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataclouddslbaseEditPlugin.INSTANCE;
	}

}
