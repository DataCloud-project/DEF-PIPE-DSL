/*
 * generated by Xtext 2.27.0
 */
package se.kth.datacloud.dsl.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import se.kth.datacloud.dsl.dsl.DataSink
import se.kth.datacloud.dsl.dsl.Pipeline
import se.kth.datacloud.dsl.xtext.services.DataCloudDSLGrammarAccess

class DataCloudDSLFormatter extends AbstractFormatter2 {
	
	@Inject extension DataCloudDSLGrammarAccess

	def dispatch void format(Pipeline pipeline, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		pipeline.communicationMedium.format
		for (environmentVariable : pipeline.environmentVariables) {
			environmentVariable.format
		}
		for (abstractStep : pipeline.steps) {
			abstractStep.format
		}
	}

	def dispatch void format(DataSink dataSink, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (environmentVariable : dataSink.environmentVariables) {
			environmentVariable.format
		}
		dataSink.executionRequirementSet.format
		for (resourceProvider : dataSink.resourceProvider) {
			resourceProvider.format
		}
		dataSink.dataTarget.format
		for (trigger : dataSink.triggers) {
			trigger.format
		}
	}
	
	// TODO: implement for DataSource, DataProcesssing, CompositeStep, FTP, SFTP, Database, MessageQueue, WebApi, ExecutionRequirementSet, SecurityRequirement, ServiceLevelObjective
}
