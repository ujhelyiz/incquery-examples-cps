package org.eclipse.incquery.examples.cps.xform.m2t.distributed.utils

import com.google.common.base.CaseFormat

class GeneratorHelper {
	
	def purify(String string){
		return string.replaceAll("[^A-Za-z0-9]", "")
	}
	
	def purifyAndToUpperCamel(String string){
		var String str = string.replace(' ', '_').toLowerCase.purify
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str);
	}
	 
}