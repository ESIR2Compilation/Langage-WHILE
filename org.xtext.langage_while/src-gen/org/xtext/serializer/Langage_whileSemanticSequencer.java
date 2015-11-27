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
import org.xtext.langage_while.Command;
import org.xtext.langage_while.Commands;
import org.xtext.langage_while.Def;
import org.xtext.langage_while.EXPR;
import org.xtext.langage_while.EXPRAND;
import org.xtext.langage_while.EXPREQ;
import org.xtext.langage_while.EXPRNOT;
import org.xtext.langage_while.EXPROR;
import org.xtext.langage_while.EXPRS;
import org.xtext.langage_while.EXPRSIMPLE;
import org.xtext.langage_while.Function;
import org.xtext.langage_while.Input;
import org.xtext.langage_while.LC;
import org.xtext.langage_while.LCs;
import org.xtext.langage_while.LEXPR;
import org.xtext.langage_while.Langage_whilePackage;
import org.xtext.langage_while.Model;
import org.xtext.langage_while.Output;
import org.xtext.langage_while.Program;
import org.xtext.langage_while.Variable;
import org.xtext.langage_while.Vars;
import org.xtext.services.Langage_whileGrammarAccess;

@SuppressWarnings("all")
public class Langage_whileSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Langage_whileGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Langage_whilePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Langage_whilePackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case Langage_whilePackage.COMMANDS:
				sequence_Commands(context, (Commands) semanticObject); 
				return; 
			case Langage_whilePackage.DEF:
				sequence_Def(context, (Def) semanticObject); 
				return; 
			case Langage_whilePackage.EXPR:
				sequence_EXPR(context, (EXPR) semanticObject); 
				return; 
			case Langage_whilePackage.EXPRAND:
				sequence_EXPRAND(context, (EXPRAND) semanticObject); 
				return; 
			case Langage_whilePackage.EXPREQ:
				sequence_EXPREQ(context, (EXPREQ) semanticObject); 
				return; 
			case Langage_whilePackage.EXPRNOT:
				sequence_EXPRNOT(context, (EXPRNOT) semanticObject); 
				return; 
			case Langage_whilePackage.EXPROR:
				sequence_EXPROR(context, (EXPROR) semanticObject); 
				return; 
			case Langage_whilePackage.EXPRS:
				sequence_EXPRS(context, (EXPRS) semanticObject); 
				return; 
			case Langage_whilePackage.EXPRSIMPLE:
				sequence_EXPRSIMPLE(context, (EXPRSIMPLE) semanticObject); 
				return; 
			case Langage_whilePackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case Langage_whilePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case Langage_whilePackage.LC:
				sequence_LC(context, (LC) semanticObject); 
				return; 
			case Langage_whilePackage.LCS:
				if(context == grammarAccess.getEXPRSIMPLERule()) {
					sequence_EXPRSIMPLE_LCs(context, (LCs) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLCsRule()) {
					sequence_LCs(context, (LCs) semanticObject); 
					return; 
				}
				else break;
			case Langage_whilePackage.LEXPR:
				sequence_LEXPR(context, (LEXPR) semanticObject); 
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
			case Langage_whilePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case Langage_whilePackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (e=Vars l=LCs c=LCs n=EXPRS) | 
	 *         (
	 *             ll=LCs 
	 *             ee=EXPR 
	 *             cc=LCs 
	 *             z=LCs 
	 *             k=Commands 
	 *             lc=LCs
	 *         ) | 
	 *         (
	 *             cc=LCs 
	 *             hh=EXPR 
	 *             tt=LCs 
	 *             vv=LCs 
	 *             c1=Commands 
	 *             ss=LCs
	 *         ) | 
	 *         (
	 *             mm=LCs 
	 *             jj=EXPR 
	 *             kk=LCs 
	 *             hg=LCs 
	 *             c2=Commands 
	 *             gg=LCs 
	 *             (ff=LCs o=Commands dd=LCs)?
	 *         ) | 
	 *         (
	 *             sq=LCs 
	 *             wx=EXPR 
	 *             lc=LCs 
	 *             lc2=LCs 
	 *             e1=EXPR 
	 *             lc3=LCs 
	 *             lc4=LCs 
	 *             c3=Commands 
	 *             lc5=LCs
	 *         )
	 *     )?
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Command (l=LCs s=Commands)?)
	 */
	protected void sequence_Commands(EObject context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         l=LCs 
	 *         in=Input 
	 *         z=LCs 
	 *         v=Commands 
	 *         s=LCs 
	 *         u=LCs 
	 *         o=Output
	 *     )
	 */
	protected void sequence_Def(EObject context, Def semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__L) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__L));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__IN));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__Z));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__V));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__S));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__U) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__U));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.DEF__O) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.DEF__O));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefAccess().getLLCsParserRuleCall_1_0(), semanticObject.getL());
		feeder.accept(grammarAccess.getDefAccess().getInInputParserRuleCall_2_0(), semanticObject.getIn());
		feeder.accept(grammarAccess.getDefAccess().getZLCsParserRuleCall_3_0(), semanticObject.getZ());
		feeder.accept(grammarAccess.getDefAccess().getVCommandsParserRuleCall_5_0(), semanticObject.getV());
		feeder.accept(grammarAccess.getDefAccess().getSLCsParserRuleCall_6_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getDefAccess().getULCsParserRuleCall_9_0(), semanticObject.getU());
		feeder.accept(grammarAccess.getDefAccess().getOOutputParserRuleCall_10_0(), semanticObject.getO());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (f=EXPROR (lc1=LCs lc2=LCs ee=EXPRAND)?)
	 */
	protected void sequence_EXPRAND(EObject context, EXPRAND semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((e1=EXPRSIMPLE ccc=LCs lc2=LCs w=EXPRSIMPLE) | ex=EXPR)
	 */
	protected void sequence_EXPREQ(EObject context, EXPREQ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lc1=LCs? e1=EXPREQ)
	 */
	protected void sequence_EXPRNOT(EObject context, EXPRNOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (e1=EXPRNOT (lc1=LCs lc2=LCs e2=EXPROR)?)
	 */
	protected void sequence_EXPROR(EObject context, EXPROR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((l=VAR | s=SYM)? | yy=LEXPR | b=LEXPR | (u=LCs g=EXPR) | (v=SYM w=LEXPR))
	 */
	protected void sequence_EXPRSIMPLE(EObject context, EXPRSIMPLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=LC n=EXPR)
	 */
	protected void sequence_EXPRSIMPLE_LCs(EObject context, LCs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (f=EXPR (l=LCs e2=EXPRS)?)
	 */
	protected void sequence_EXPRS(EObject context, EXPRS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (e1=EXPRSIMPLE | ex=EXPRAND)
	 */
	protected void sequence_EXPR(EObject context, EXPR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (n=LCs nom=SYM t=LCs d=Def)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__N));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__NOM));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__T) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__T));
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.FUNCTION__D) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.FUNCTION__D));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getNLCsParserRuleCall_1_0(), semanticObject.getN());
		feeder.accept(grammarAccess.getFunctionAccess().getNomSYMTerminalRuleCall_2_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getFunctionAccess().getTLCsParserRuleCall_4_0(), semanticObject.getT());
		feeder.accept(grammarAccess.getFunctionAccess().getDDefParserRuleCall_5_0(), semanticObject.getD());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((v=VAR z=LCs in=Input) | y=VAR)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=SP | z=CR | e=TAB | r=LF)
	 */
	protected void sequence_LC(EObject context, LC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     a=LC?
	 */
	protected void sequence_LCs(EObject context, LCs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (f=LCs n=EXPR t=LEXPR?)
	 */
	protected void sequence_LEXPR(EObject context, LEXPR semanticObject) {
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
	 *     ((n=VAR q=LCs o=Output) | s=VAR)
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (f+=Function* (u=CR pp=Program)?)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     n=VAR
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Langage_whilePackage.Literals.VARIABLE__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Langage_whilePackage.Literals.VARIABLE__N));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNVARTerminalRuleCall_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (a=VAR (l=LCs u=Vars)?)
	 */
	protected void sequence_Vars(EObject context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
