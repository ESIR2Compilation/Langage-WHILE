/*
 * generated by Xtext
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.langage_while.Def;
import org.xtext.langage_while.Function;
import org.xtext.langage_while.Input;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Model;
import org.xtext.langage_while.Output;
import org.xtext.langage_while.Program;
import org.xtext.services.Langage_whileGrammarAccess;

@SuppressWarnings("all")
public class Langage_whileSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Langage_whileGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Langage_whilePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Langage_whilePackage.DEF:
				sequence_Def(context, (Def) semanticObject); 
				return; 
			case Langage_whilePackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case Langage_whilePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case Langage_whilePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Langage_whilePackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case Langage_whilePackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (in=Input c=Commands o=Output)
	 */
	protected void sequence_Def(EObject context, Def semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__IN));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__C) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__C));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__O) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__O));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefAccess().getInInputParserRuleCall_2_0(), semanticObject.getIn());
		feeder.accept(grammarAccess.getDefAccess().getCCommandsParserRuleCall_5_0(), semanticObject.getC());
		feeder.accept(grammarAccess.getDefAccess().getOOutputParserRuleCall_10_0(), semanticObject.getO());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nom=SYM d=Def)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__NOM));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__D) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__D));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getNomSYMTerminalRuleCall_2_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getFunctionAccess().getDDefParserRuleCall_5_0(), semanticObject.getD());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     in=Input?
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings=Program
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.MODEL__GREETINGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.MODEL__GREETINGS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0(), semanticObject.getGreetings());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     o=Output?
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (f+=Function* pp=Program?)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
