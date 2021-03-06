package org.eclipse.incquery.examples.cps.generator.phases

import com.google.common.collect.ImmutableList
import com.google.common.collect.Lists
import org.apache.log4j.Logger
import org.eclipse.incquery.examples.cps.cyberPhysicalSystem.ApplicationType
import org.eclipse.incquery.examples.cps.generator.dtos.CPSFragment
import org.eclipse.incquery.examples.cps.generator.operations.ActionGenerationOperation
import org.eclipse.incquery.examples.cps.generator.queries.TransitionsMatcher
import org.eclipse.incquery.examples.cps.generator.utils.RandomUtils
import org.eclipse.incquery.examples.cps.planexecutor.api.IPhase
import org.eclipse.incquery.examples.cps.cyberPhysicalSystem.HostType
import org.eclipse.incquery.examples.cps.generator.queries.ReachableAppTypesMatcher

class CPSPhaseActionGeneration implements IPhase<CPSFragment>{
	
	private extension RandomUtils randUtil = new RandomUtils;
	private extension Logger logger = Logger.getLogger("cps.generator.impl.CPSPhaseActionGeneration");
	
	public static String WAIT_METHOD_NAME = "waitForSignal";
	public static String SEND_METHOD_NAME = "sendSignal";
	
	override getOperations(CPSFragment fragment) {
		val operations = Lists.newArrayList();
		
		for(appClass : fragment.applicationTypes.keySet){
			var appTypes = fragment.applicationTypes.get(appClass);
			if(appTypes != null){
				for(appType : appTypes){
					for(transition : getTransitionsOf(appType, fragment)){
						// Generate Action or not
						if(appClass.probabilityOfActionGeneration.randBooleanWithPercentageOfTrue(fragment.random)){
							// Generate action
							if(appClass.probabilityOfSendAction.randBooleanWithPercentageOfTrue(fragment.random)){
								// Generate SendSignal(AppTypeID, SignalID)
								val signalNumber = fragment.numberOfSignals.randIntOneToMax(fragment.random);
								val possibleTypeList = getPossibleAppTypesOf(appType, fragment).toList
								
								val targetAppType = possibleTypeList.randElementExcept(ImmutableList.of(appType), fragment.random);

								if(targetAppType != null){
									val action = SEND_METHOD_NAME + "(" + targetAppType.id + ", "+ signalNumber + ")";
									debug(action)
									operations.add(new ActionGenerationOperation(action, transition));
								}else{
									debug("#Warning: Cannot find target application type for Action of " + appType.id);
								}
							}else{
								// Generate WaitSignal(SignalID)
								val signalNumber = fragment.numberOfSignals.randIntOneToMax(fragment.random);
								val action = WAIT_METHOD_NAME + "(" + signalNumber + ")";
								debug(action)
								operations.add(new ActionGenerationOperation(action, transition));
							}
						}
					}
				}
			}
		}
		
		return operations;
	}
	
	def getTransitionsOf(ApplicationType type, CPSFragment fragment) {
		TransitionsMatcher.on(fragment.engine).getAllValuesOft(type.behavior);
	}
	
	def getPossibleAppTypesOf(ApplicationType type, CPSFragment fragment) {
		ReachableAppTypesMatcher.on(fragment.engine).getAllValuesOfTo(type);
	}
	
}