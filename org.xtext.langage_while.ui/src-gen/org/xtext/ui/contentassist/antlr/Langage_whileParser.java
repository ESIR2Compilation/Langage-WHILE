/*
 * generated by Xtext
 */
package org.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.services.Langage_whileGrammarAccess;

public class Langage_whileParser extends AbstractContentAssistParser {
	
	@Inject
	private Langage_whileGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.ui.contentassist.antlr.internal.InternalLangage_whileParser createParser() {
		org.xtext.ui.contentassist.antlr.internal.InternalLangage_whileParser result = new org.xtext.ui.contentassist.antlr.internal.InternalLangage_whileParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputAccess().getAlternatives(), "rule__Input__Alternatives");
					put(grammarAccess.getOutputAccess().getAlternatives(), "rule__Output__Alternatives");
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getEXPRAccess().getAlternatives(), "rule__EXPR__Alternatives");
					put(grammarAccess.getEXPRSIMPLEAccess().getAlternatives(), "rule__EXPRSIMPLE__Alternatives");
					put(grammarAccess.getEXPRSIMPLEAccess().getAlternatives_0(), "rule__EXPRSIMPLE__Alternatives_0");
					put(grammarAccess.getEXPRSIMPLEAccess().getAlternatives_1(), "rule__EXPRSIMPLE__Alternatives_1");
					put(grammarAccess.getEXPRSIMPLEAccess().getAlternatives_2(), "rule__EXPRSIMPLE__Alternatives_2");
					put(grammarAccess.getEXPREQAccess().getAlternatives(), "rule__EXPREQ__Alternatives");
					put(grammarAccess.getLCAccess().getAlternatives(), "rule__LC__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_1(), "rule__Program__Group_1__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDefAccess().getGroup(), "rule__Def__Group__0");
					put(grammarAccess.getInputAccess().getGroup_0(), "rule__Input__Group_0__0");
					put(grammarAccess.getOutputAccess().getGroup_0(), "rule__Output__Group_0__0");
					put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
					put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
					put(grammarAccess.getCommandAccess().getGroup_2(), "rule__Command__Group_2__0");
					put(grammarAccess.getCommandAccess().getGroup_3(), "rule__Command__Group_3__0");
					put(grammarAccess.getCommandAccess().getGroup_4(), "rule__Command__Group_4__0");
					put(grammarAccess.getCommandAccess().getGroup_4_8(), "rule__Command__Group_4_8__0");
					put(grammarAccess.getCommandAccess().getGroup_5(), "rule__Command__Group_5__0");
					put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
					put(grammarAccess.getVarsAccess().getGroup_1(), "rule__Vars__Group_1__0");
					put(grammarAccess.getEXPRSAccess().getGroup(), "rule__EXPRS__Group__0");
					put(grammarAccess.getEXPRSAccess().getGroup_1(), "rule__EXPRS__Group_1__0");
					put(grammarAccess.getEXPRSIMPLEAccess().getGroup_1_0(), "rule__EXPRSIMPLE__Group_1_0__0");
					put(grammarAccess.getEXPRSIMPLEAccess().getGroup_1_1(), "rule__EXPRSIMPLE__Group_1_1__0");
					put(grammarAccess.getEXPRSIMPLEAccess().getGroup_2_0(), "rule__EXPRSIMPLE__Group_2_0__0");
					put(grammarAccess.getEXPRSIMPLEAccess().getGroup_2_1(), "rule__EXPRSIMPLE__Group_2_1__0");
					put(grammarAccess.getEXPRSIMPLEAccess().getGroup_3(), "rule__EXPRSIMPLE__Group_3__0");
					put(grammarAccess.getLEXPRAccess().getGroup(), "rule__LEXPR__Group__0");
					put(grammarAccess.getEXPRANDAccess().getGroup(), "rule__EXPRAND__Group__0");
					put(grammarAccess.getEXPRANDAccess().getGroup_1(), "rule__EXPRAND__Group_1__0");
					put(grammarAccess.getEXPRORAccess().getGroup(), "rule__EXPROR__Group__0");
					put(grammarAccess.getEXPRORAccess().getGroup_1(), "rule__EXPROR__Group_1__0");
					put(grammarAccess.getEXPRNOTAccess().getGroup(), "rule__EXPRNOT__Group__0");
					put(grammarAccess.getEXPRNOTAccess().getGroup_0(), "rule__EXPRNOT__Group_0__0");
					put(grammarAccess.getEXPREQAccess().getGroup_0(), "rule__EXPREQ__Group_0__0");
					put(grammarAccess.getEXPREQAccess().getGroup_1(), "rule__EXPREQ__Group_1__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getProgramAccess().getFAssignment_0(), "rule__Program__FAssignment_0");
					put(grammarAccess.getProgramAccess().getPpAssignment_1_1(), "rule__Program__PpAssignment_1_1");
					put(grammarAccess.getFunctionAccess().getNomAssignment_2(), "rule__Function__NomAssignment_2");
					put(grammarAccess.getFunctionAccess().getDAssignment_5(), "rule__Function__DAssignment_5");
					put(grammarAccess.getDefAccess().getInAssignment_2(), "rule__Def__InAssignment_2");
					put(grammarAccess.getDefAccess().getCAssignment_5(), "rule__Def__CAssignment_5");
					put(grammarAccess.getDefAccess().getOAssignment_10(), "rule__Def__OAssignment_10");
					put(grammarAccess.getInputAccess().getInAssignment_0_3(), "rule__Input__InAssignment_0_3");
					put(grammarAccess.getOutputAccess().getOAssignment_0_3(), "rule__Output__OAssignment_0_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.ui.contentassist.antlr.internal.InternalLangage_whileParser typedParser = (org.xtext.ui.contentassist.antlr.internal.InternalLangage_whileParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public Langage_whileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Langage_whileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
