package org.eclipse.incquery.examples.cps.generator.tests.constraints

import org.eclipse.incquery.examples.cps.generator.dtos.MinMaxData
import org.eclipse.incquery.examples.cps.generator.impl.dtos.AppClass
import org.eclipse.incquery.examples.cps.generator.impl.dtos.HostClass
import org.eclipse.incquery.examples.cps.generator.impl.interfaces.ICPSConstraints
import java.util.HashMap
import org.eclipse.incquery.examples.cps.generator.dtos.Percentage

class DemoCPSConstraints implements ICPSConstraints {
	
	override getNumberOfSignals() {
		new MinMaxData(1, 10);
	}
	
	override getApplicationClasses() {
		val firstAppClassAllocations = new HashMap();
		#[
			new AppClass(
				"FirstAppClass",
				new MinMaxData(1, 3), // AppTypes
				new MinMaxData(1, 10), // AppInstances
				new MinMaxData(3, 5), // States
				new MinMaxData(3, 10) // Transitions
				, new Percentage(80)
				, firstAppClassAllocations
			),
			
			new AppClass(
				"SecondAppClass",
				new MinMaxData(1, 3), // AppTypes       
				new MinMaxData(1, 10), // AppInstances  
				new MinMaxData(3, 5), // States         
				new MinMaxData(3, 10) // Transitions
				, new Percentage(100)
				, firstAppClassAllocations   		
			)
	];
	}
	
	override getHostClasses() {
		#[
			new HostClass(
				"FirstHostClass",
				new MinMaxData(1, 3), // HostTypes
				new MinMaxData(3, 10), // HostInstances
				new MinMaxData(1, 3) // CommLines
			),
			new HostClass(
				"SecondHostClass",
				new MinMaxData(1, 1), // HostTypes
				new MinMaxData(3, 3), // HostInstances
				new MinMaxData(1, 5) // CommLines		
			)
		];
	}
	
	
}