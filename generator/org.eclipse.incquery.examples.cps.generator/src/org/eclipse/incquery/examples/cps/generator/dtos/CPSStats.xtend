package org.eclipse.incquery.examples.cps.generator.dtos

import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.incquery.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem
import org.eclipse.incquery.examples.cps.cyberPhysicalSystem.CyberPhysicalSystemPackage
import org.eclipse.incquery.examples.cps.cyberPhysicalSystem.Transition
import org.eclipse.incquery.examples.cps.generator.phases.CPSPhaseActionGeneration
import org.eclipse.incquery.examples.cps.generator.queries.AllocatedAppInstancesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.AppInstancesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.AppTypesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.ConnectedHostsMatcher
import org.eclipse.incquery.examples.cps.generator.queries.HostInstancesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.HostTypesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.StatesMatcher
import org.eclipse.incquery.examples.cps.generator.queries.TransitionMatcher
import org.eclipse.incquery.examples.cps.generator.utils.StatsUtil
import org.eclipse.incquery.examples.cps.generator.utils.SumProcessor
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.base.api.IEStructuralFeatureProcessor
import org.eclipse.incquery.runtime.base.api.IncQueryBaseFactory

class CPSStats extends ModelStats {
	
	private Logger logger = Logger.getLogger("cps.generator.StatsUtil.CPSStats")
	
	public int appTypeCount = 0;
	public int appInstanceCount = 0;
	public int hostTypeCount = 0;
	public int hostInstanceCount = 0;
	public int stateCount = 0;
	public int transitionCount = 0;
	public int allocatedAppCount = 0;
	public int connectedHostCount = 0;
	public int sendActions = 0;
	public int waitActions = 0;

	new(IncQueryEngine engine, CyberPhysicalSystem model){
		this.appTypeCount = AppTypesMatcher.on(engine).countMatches;
		this.appInstanceCount = AppInstancesMatcher.on(engine).countMatches;
		this.hostTypeCount = HostTypesMatcher.on(engine).countMatches;
		this.hostInstanceCount = HostInstancesMatcher.on(engine).countMatches;
		this.stateCount = StatesMatcher.on(engine).countMatches;
		this.transitionCount = TransitionMatcher.on(engine).countMatches;
		this.allocatedAppCount = AllocatedAppInstancesMatcher.on(engine).countMatches;
		this.connectedHostCount = ConnectedHostsMatcher.on(engine).countMatches;
		this.eObjects = model.eAllContents.size;
		this.eReferences = StatsUtil.countEdges(model)
		
		val baseIndex = IncQueryBaseFactory.getInstance.createNavigationHelper(model.eResource.resourceSet, true, logger)
		
		// EFeatures
		val sp2 = new SumProcessor
		baseIndex.processAllFeatureInstances(CyberPhysicalSystemPackage.Literals.TRANSITION__ACTION, new IEStructuralFeatureProcessor(){
			override process(EStructuralFeature feature, EObject source, Object target) {
				if(source instanceof Transition){
					val Transition t = source as Transition
					if(t.action.startsWith(CPSPhaseActionGeneration.SEND_METHOD_NAME)){
						sendActions++
					}else if(t.action.startsWith(CPSPhaseActionGeneration.WAIT_METHOD_NAME)){
						waitActions++
					}
				}
			}
		})	
		sp2.resetSum
		
	}
	
	def log() {
		logger.info("====================================================================")
		logger.info("= CPS Stats: ");
		logger.info("=   ApplicationTypes: " + appTypeCount);
		logger.info("=   ApplicationInstances: " + appInstanceCount);
		logger.info("=   HostTypes: " + hostTypeCount);
		logger.info("=   HostInstances: " + hostInstanceCount);
		logger.info("=   States: " + stateCount);
		logger.info("=   Transitions: " + transitionCount);
		logger.info("=     Send: " + sendActions);
		logger.info("=     Wait: " + waitActions);
		logger.info("=   Allocated AppInstances: " + allocatedAppCount);
		logger.info("=   Connected HostsInstances: " + connectedHostCount);
		logger.info("=   EObjects: " + eObjects);
		logger.info("=   EReferences: " + eReferences);
		logger.info("====================================================================")
	}
	
}