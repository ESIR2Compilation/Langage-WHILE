/*
 * generated by Xtext
 */
package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Langage_whileStandaloneSetup extends Langage_whileStandaloneSetupGenerated{

	public static void doSetup() {
		new Langage_whileStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
