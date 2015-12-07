package org.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.Langage_whileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLangage_whileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CR", "RULE_SYM", "RULE_VAR", "RULE_SP", "RULE_TAB", "RULE_LF", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nop'", "'nil'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_LF=9;
    public static final int RULE_CR=4;
    public static final int RULE_TAB=8;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SP=7;
    public static final int RULE_ID=11;
    public static final int RULE_CONF=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SYM=5;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VAR=6;

    // delegates
    // delegators


        public InternalLangage_whileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLangage_whileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLangage_whileParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g"; }


     
     	private Langage_whileGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Langage_whileGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:62:1: ( ruleModel EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:70:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:74:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__GreetingsAssignment ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__GreetingsAssignment ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:76:1: ( rule__Model__GreetingsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:1: ( rule__Model__GreetingsAssignment )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:2: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel100);
            rule__Model__GreetingsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:89:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:90:1: ( ruleProgram EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:91:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram127);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:98:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:102:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:103:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:103:1: ( ( rule__Program__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:104:1: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:105:1: ( rule__Program__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:105:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram160);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:117:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:118:1: ( ruleFunction EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:119:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction187);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:126:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:130:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:131:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:131:1: ( ( rule__Function__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:132:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:133:1: ( rule__Function__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:133:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction220);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDef"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:145:1: entryRuleDef : ruleDef EOF ;
    public final void entryRuleDef() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:146:1: ( ruleDef EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:147:1: ruleDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefRule()); 
            }
            pushFollow(FOLLOW_ruleDef_in_entryRuleDef247);
            ruleDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDef254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:154:1: ruleDef : ( ( rule__Def__Group__0 ) ) ;
    public final void ruleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:158:2: ( ( ( rule__Def__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Def__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Def__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:160:1: ( rule__Def__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:1: ( rule__Def__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:2: rule__Def__Group__0
            {
            pushFollow(FOLLOW_rule__Def__Group__0_in_ruleDef280);
            rule__Def__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:173:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:174:1: ( ruleInput EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:175:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput307);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:182:1: ruleInput : ( ( rule__Input__Alternatives ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:186:2: ( ( ( rule__Input__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Input__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Input__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:188:1: ( rule__Input__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:1: ( rule__Input__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:2: rule__Input__Alternatives
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_in_ruleInput340);
            rule__Input__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:201:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:202:1: ( ruleOutput EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:203:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput367);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:210:1: ruleOutput : ( ( rule__Output__Alternatives ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:214:2: ( ( ( rule__Output__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Output__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Output__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:216:1: ( rule__Output__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:1: ( rule__Output__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:2: rule__Output__Alternatives
            {
            pushFollow(FOLLOW_rule__Output__Alternatives_in_ruleOutput400);
            rule__Output__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:229:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:230:1: ( ruleCommands EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:231:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands427);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:238:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:242:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:243:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:243:1: ( ( rule__Commands__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:244:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:245:1: ( rule__Commands__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:245:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands460);
            rule__Commands__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:257:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:258:1: ( ruleCommand EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:259:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand487);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:266:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:270:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:271:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:271:1: ( ( rule__Command__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:272:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:273:1: ( rule__Command__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:273:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand520);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNop"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:285:1: entryRuleNop : ruleNop EOF ;
    public final void entryRuleNop() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:286:1: ( ruleNop EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:287:1: ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_ruleNop_in_entryRuleNop547);
            ruleNop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNopRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNop554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:294:1: ruleNop : ( 'nop' ) ;
    public final void ruleNop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:298:2: ( ( 'nop' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:299:1: ( 'nop' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:299:1: ( 'nop' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:300:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNopAccess().getNopKeyword()); 
            }
            match(input,18,FOLLOW_18_in_ruleNop581); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNopAccess().getNopKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAssign"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:315:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:316:1: ( ruleAssign EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:317:1: ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign609);
            ruleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign616); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:324:1: ruleAssign : ( ( rule__Assign__Group__0 ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:328:2: ( ( ( rule__Assign__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:1: ( ( rule__Assign__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:1: ( ( rule__Assign__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:330:1: ( rule__Assign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:331:1: ( rule__Assign__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:331:2: rule__Assign__Group__0
            {
            pushFollow(FOLLOW_rule__Assign__Group__0_in_ruleAssign642);
            rule__Assign__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:343:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:344:1: ( ruleWhile EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:345:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile669);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile676); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:352:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:356:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:358:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:359:1: ( rule__While__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:359:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile702);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:371:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:372:1: ( ruleFor EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:373:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor729);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor736); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:380:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:384:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:386:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:387:1: ( rule__For__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:387:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor762);
            rule__For__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:399:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:400:1: ( ruleIf EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:401:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf789);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf796); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:408:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:412:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:414:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:415:1: ( rule__If__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:415:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf822);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeach"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:427:1: entryRuleForeach : ruleForeach EOF ;
    public final void entryRuleForeach() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:428:1: ( ruleForeach EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:429:1: ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach849);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach856); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:436:1: ruleForeach : ( ( rule__Foreach__Group__0 ) ) ;
    public final void ruleForeach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:440:2: ( ( ( rule__Foreach__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:1: ( ( rule__Foreach__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:1: ( ( rule__Foreach__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:442:1: ( rule__Foreach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:443:1: ( rule__Foreach__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:443:2: rule__Foreach__Group__0
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0_in_ruleForeach882);
            rule__Foreach__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:455:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:456:1: ( ruleVars EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:457:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars909);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars916); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:464:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:468:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:1: ( ( rule__Vars__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:470:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:471:1: ( rule__Vars__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:471:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars942);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleEXPRS"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:483:1: entryRuleEXPRS : ruleEXPRS EOF ;
    public final void entryRuleEXPRS() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:484:1: ( ruleEXPRS EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:485:1: ruleEXPRS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_entryRuleEXPRS969);
            ruleEXPRS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRS976); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRS"


    // $ANTLR start "ruleEXPRS"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:492:1: ruleEXPRS : ( ( rule__EXPRS__Group__0 ) ) ;
    public final void ruleEXPRS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:496:2: ( ( ( rule__EXPRS__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:1: ( ( rule__EXPRS__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:1: ( ( rule__EXPRS__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:498:1: ( rule__EXPRS__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:499:1: ( rule__EXPRS__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:499:2: rule__EXPRS__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__0_in_ruleEXPRS1002);
            rule__EXPRS__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRS"


    // $ANTLR start "entryRuleEXPR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:511:1: entryRuleEXPR : ruleEXPR EOF ;
    public final void entryRuleEXPR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:512:1: ( ruleEXPR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:513:1: ruleEXPR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_entryRuleEXPR1029);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPR1036); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPR"


    // $ANTLR start "ruleEXPR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:520:1: ruleEXPR : ( ( rule__EXPR__Alternatives ) ) ;
    public final void ruleEXPR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:524:2: ( ( ( rule__EXPR__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:1: ( ( rule__EXPR__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:1: ( ( rule__EXPR__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:526:1: ( rule__EXPR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:527:1: ( rule__EXPR__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:527:2: rule__EXPR__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPR__Alternatives_in_ruleEXPR1062);
            rule__EXPR__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPR"


    // $ANTLR start "entryRuleEXPRSIMPLE"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:539:1: entryRuleEXPRSIMPLE : ruleEXPRSIMPLE EOF ;
    public final void entryRuleEXPRSIMPLE() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:540:1: ( ruleEXPRSIMPLE EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:541:1: ruleEXPRSIMPLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLERule()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE1089);
            ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLERule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRSIMPLE1096); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRSIMPLE"


    // $ANTLR start "ruleEXPRSIMPLE"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:548:1: ruleEXPRSIMPLE : ( ( rule__EXPRSIMPLE__Alternatives ) ) ;
    public final void ruleEXPRSIMPLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:552:2: ( ( ( rule__EXPRSIMPLE__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:1: ( ( rule__EXPRSIMPLE__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:1: ( ( rule__EXPRSIMPLE__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:554:1: ( rule__EXPRSIMPLE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:555:1: ( rule__EXPRSIMPLE__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:555:2: rule__EXPRSIMPLE__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Alternatives_in_ruleEXPRSIMPLE1122);
            rule__EXPRSIMPLE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRSIMPLE"


    // $ANTLR start "entryRuleLEXPR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:567:1: entryRuleLEXPR : ruleLEXPR EOF ;
    public final void entryRuleLEXPR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:568:1: ( ruleLEXPR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:569:1: ruleLEXPR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_entryRuleLEXPR1149);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEXPR1156); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLEXPR"


    // $ANTLR start "ruleLEXPR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:576:1: ruleLEXPR : ( ( rule__LEXPR__Group__0 ) ) ;
    public final void ruleLEXPR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:580:2: ( ( ( rule__LEXPR__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:581:1: ( ( rule__LEXPR__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:581:1: ( ( rule__LEXPR__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:582:1: ( rule__LEXPR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:583:1: ( rule__LEXPR__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:583:2: rule__LEXPR__Group__0
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__0_in_ruleLEXPR1182);
            rule__LEXPR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLEXPR"


    // $ANTLR start "entryRuleEXPRAND"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:595:1: entryRuleEXPRAND : ruleEXPRAND EOF ;
    public final void entryRuleEXPRAND() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:596:1: ( ruleEXPRAND EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:597:1: ruleEXPRAND EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND1209);
            ruleEXPRAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRAND1216); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRAND"


    // $ANTLR start "ruleEXPRAND"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:604:1: ruleEXPRAND : ( ( rule__EXPRAND__Group__0 ) ) ;
    public final void ruleEXPRAND() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:608:2: ( ( ( rule__EXPRAND__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:609:1: ( ( rule__EXPRAND__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:609:1: ( ( rule__EXPRAND__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:610:1: ( rule__EXPRAND__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:611:1: ( rule__EXPRAND__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:611:2: rule__EXPRAND__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__0_in_ruleEXPRAND1242);
            rule__EXPRAND__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRAND"


    // $ANTLR start "entryRuleEXPROR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:623:1: entryRuleEXPROR : ruleEXPROR EOF ;
    public final void entryRuleEXPROR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:624:1: ( ruleEXPROR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:625:1: ruleEXPROR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORRule()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_entryRuleEXPROR1269);
            ruleEXPROR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPROR1276); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPROR"


    // $ANTLR start "ruleEXPROR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:632:1: ruleEXPROR : ( ( rule__EXPROR__Group__0 ) ) ;
    public final void ruleEXPROR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:636:2: ( ( ( rule__EXPROR__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:637:1: ( ( rule__EXPROR__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:637:1: ( ( rule__EXPROR__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:638:1: ( rule__EXPROR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:639:1: ( rule__EXPROR__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:639:2: rule__EXPROR__Group__0
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__0_in_ruleEXPROR1302);
            rule__EXPROR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPROR"


    // $ANTLR start "entryRuleEXPRNOT"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:651:1: entryRuleEXPRNOT : ruleEXPRNOT EOF ;
    public final void entryRuleEXPRNOT() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:652:1: ( ruleEXPRNOT EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:653:1: ruleEXPRNOT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT1329);
            ruleEXPRNOT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRNOT1336); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRNOT"


    // $ANTLR start "ruleEXPRNOT"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:660:1: ruleEXPRNOT : ( ( rule__EXPRNOT__Group__0 ) ) ;
    public final void ruleEXPRNOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:664:2: ( ( ( rule__EXPRNOT__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:665:1: ( ( rule__EXPRNOT__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:665:1: ( ( rule__EXPRNOT__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:666:1: ( rule__EXPRNOT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:667:1: ( rule__EXPRNOT__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:667:2: rule__EXPRNOT__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__0_in_ruleEXPRNOT1362);
            rule__EXPRNOT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRNOT"


    // $ANTLR start "entryRuleEXPREQ"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:679:1: entryRuleEXPREQ : ruleEXPREQ EOF ;
    public final void entryRuleEXPREQ() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:680:1: ( ruleEXPREQ EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:681:1: ruleEXPREQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQRule()); 
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ1389);
            ruleEXPREQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPREQ1396); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPREQ"


    // $ANTLR start "ruleEXPREQ"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:688:1: ruleEXPREQ : ( ( rule__EXPREQ__Alternatives ) ) ;
    public final void ruleEXPREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:692:2: ( ( ( rule__EXPREQ__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:693:1: ( ( rule__EXPREQ__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:693:1: ( ( rule__EXPREQ__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:694:1: ( rule__EXPREQ__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:695:1: ( rule__EXPREQ__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:695:2: rule__EXPREQ__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPREQ__Alternatives_in_ruleEXPREQ1422);
            rule__EXPREQ__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPREQ"


    // $ANTLR start "entryRuleLCs"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:713:1: entryRuleLCs : ruleLCs EOF ;
    public final void entryRuleLCs() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:714:1: ( ruleLCs EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:715:1: ruleLCs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsRule()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_entryRuleLCs1455);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCs1462); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLCs"


    // $ANTLR start "ruleLCs"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:722:1: ruleLCs : ( ( rule__LCs__AAssignment )? ) ;
    public final void ruleLCs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:726:2: ( ( ( rule__LCs__AAssignment )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:727:1: ( ( rule__LCs__AAssignment )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:727:1: ( ( rule__LCs__AAssignment )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:728:1: ( rule__LCs__AAssignment )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsAccess().getAAssignment()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:729:1: ( rule__LCs__AAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CR||(LA1_0>=RULE_SP && LA1_0<=RULE_LF)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:729:2: rule__LCs__AAssignment
                    {
                    pushFollow(FOLLOW_rule__LCs__AAssignment_in_ruleLCs1488);
                    rule__LCs__AAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsAccess().getAAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLCs"


    // $ANTLR start "entryRuleLC"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:741:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:742:1: ( ruleLC EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:743:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1516);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1523); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:750:1: ruleLC : ( ( rule__LC__Alternatives ) ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:754:2: ( ( ( rule__LC__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:755:1: ( ( rule__LC__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:755:1: ( ( rule__LC__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:756:1: ( rule__LC__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:757:1: ( rule__LC__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:757:2: rule__LC__Alternatives
            {
            pushFollow(FOLLOW_rule__LC__Alternatives_in_ruleLC1549);
            rule__LC__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLC"


    // $ANTLR start "rule__Input__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:769:1: rule__Input__Alternatives : ( ( ( rule__Input__Group_0__0 ) ) | ( ( rule__Input__YAssignment_1 ) ) );
    public final void rule__Input__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:773:1: ( ( ( rule__Input__Group_0__0 ) ) | ( ( rule__Input__YAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_VAR) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_CR||(LA2_1>=RULE_SP && LA2_1<=RULE_LF)||LA2_1==23) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:774:1: ( ( rule__Input__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:774:1: ( ( rule__Input__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:775:1: ( rule__Input__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:776:1: ( rule__Input__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:776:2: rule__Input__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Alternatives1585);
                    rule__Input__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:780:6: ( ( rule__Input__YAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:780:6: ( ( rule__Input__YAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:781:1: ( rule__Input__YAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getYAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:782:1: ( rule__Input__YAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:782:2: rule__Input__YAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Input__YAssignment_1_in_rule__Input__Alternatives1603);
                    rule__Input__YAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getYAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives"


    // $ANTLR start "rule__Output__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:791:1: rule__Output__Alternatives : ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__SAssignment_1 ) ) );
    public final void rule__Output__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:795:1: ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__SAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VAR) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_CR||LA3_1==20) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:796:1: ( ( rule__Output__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:796:1: ( ( rule__Output__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:797:1: ( rule__Output__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:798:1: ( rule__Output__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:798:2: rule__Output__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Alternatives1636);
                    rule__Output__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:802:6: ( ( rule__Output__SAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:802:6: ( ( rule__Output__SAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:803:1: ( rule__Output__SAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getSAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:804:1: ( rule__Output__SAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:804:2: rule__Output__SAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Output__SAssignment_1_in_rule__Output__Alternatives1654);
                    rule__Output__SAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getSAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Alternatives"


    // $ANTLR start "rule__Command__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:813:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AffectAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForrAssignment_3 ) ) | ( ( rule__Command__ForeAssignment_4 ) ) | ( ( rule__Command__IffAssignment_5 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:817:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AffectAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForrAssignment_3 ) ) | ( ( rule__Command__ForeAssignment_4 ) ) | ( ( rule__Command__IffAssignment_5 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case RULE_VAR:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:818:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:818:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:819:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:820:1: ( rule__Command__NopAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:820:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1687);
                    rule__Command__NopAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:824:6: ( ( rule__Command__AffectAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:824:6: ( ( rule__Command__AffectAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:825:1: ( rule__Command__AffectAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getAffectAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:826:1: ( rule__Command__AffectAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:826:2: rule__Command__AffectAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Command__AffectAssignment_1_in_rule__Command__Alternatives1705);
                    rule__Command__AffectAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getAffectAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:830:6: ( ( rule__Command__WhAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:830:6: ( ( rule__Command__WhAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:831:1: ( rule__Command__WhAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getWhAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:832:1: ( rule__Command__WhAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:832:2: rule__Command__WhAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1723);
                    rule__Command__WhAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getWhAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:6: ( ( rule__Command__ForrAssignment_3 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:6: ( ( rule__Command__ForrAssignment_3 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:837:1: ( rule__Command__ForrAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForrAssignment_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:1: ( rule__Command__ForrAssignment_3 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:2: rule__Command__ForrAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__ForrAssignment_3_in_rule__Command__Alternatives1741);
                    rule__Command__ForrAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getForrAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:842:6: ( ( rule__Command__ForeAssignment_4 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:842:6: ( ( rule__Command__ForeAssignment_4 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:843:1: ( rule__Command__ForeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForeAssignment_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:844:1: ( rule__Command__ForeAssignment_4 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:844:2: rule__Command__ForeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__ForeAssignment_4_in_rule__Command__Alternatives1759);
                    rule__Command__ForeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getForeAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:848:6: ( ( rule__Command__IffAssignment_5 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:848:6: ( ( rule__Command__IffAssignment_5 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:849:1: ( rule__Command__IffAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getIffAssignment_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:850:1: ( rule__Command__IffAssignment_5 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:850:2: rule__Command__IffAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Command__IffAssignment_5_in_rule__Command__Alternatives1777);
                    rule__Command__IffAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getIffAssignment_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__EXPR__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:859:1: rule__EXPR__Alternatives : ( ( ( rule__EXPR__E1Assignment_0 ) ) | ( ( rule__EXPR__ExAssignment_1 ) ) );
    public final void rule__EXPR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:863:1: ( ( ( rule__EXPR__E1Assignment_0 ) ) | ( ( rule__EXPR__ExAssignment_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred9_InternalLangage_while()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred9_InternalLangage_while()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred9_InternalLangage_while()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA5_4 = input.LA(2);

                if ( (synpred9_InternalLangage_while()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:1: ( ( rule__EXPR__E1Assignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:1: ( ( rule__EXPR__E1Assignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:865:1: ( rule__EXPR__E1Assignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRAccess().getE1Assignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:1: ( rule__EXPR__E1Assignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:2: rule__EXPR__E1Assignment_0
                    {
                    pushFollow(FOLLOW_rule__EXPR__E1Assignment_0_in_rule__EXPR__Alternatives1810);
                    rule__EXPR__E1Assignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRAccess().getE1Assignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:870:6: ( ( rule__EXPR__ExAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:870:6: ( ( rule__EXPR__ExAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:871:1: ( rule__EXPR__ExAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRAccess().getExAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:872:1: ( rule__EXPR__ExAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:872:2: rule__EXPR__ExAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EXPR__ExAssignment_1_in_rule__EXPR__Alternatives1828);
                    rule__EXPR__ExAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRAccess().getExAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPR__Alternatives"


    // $ANTLR start "rule__EXPRSIMPLE__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: rule__EXPRSIMPLE__Alternatives : ( ( ( rule__EXPRSIMPLE__Alternatives_0 ) ) | ( ( rule__EXPRSIMPLE__Group_1__0 ) ) | ( ( rule__EXPRSIMPLE__Group_2__0 ) ) | ( ( rule__EXPRSIMPLE__Group_3__0 ) ) | ( ( rule__EXPRSIMPLE__Group_4__0 ) ) | ( ( rule__EXPRSIMPLE__Group_5__0 ) ) );
    public final void rule__EXPRSIMPLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:885:1: ( ( ( rule__EXPRSIMPLE__Alternatives_0 ) ) | ( ( rule__EXPRSIMPLE__Group_1__0 ) ) | ( ( rule__EXPRSIMPLE__Group_2__0 ) ) | ( ( rule__EXPRSIMPLE__Group_3__0 ) ) | ( ( rule__EXPRSIMPLE__Group_4__0 ) ) | ( ( rule__EXPRSIMPLE__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SYM && LA6_0<=RULE_VAR)||LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt6=5;
                    }
                    break;
                case 39:
                    {
                    alt6=2;
                    }
                    break;
                case 41:
                    {
                    alt6=3;
                    }
                    break;
                case 42:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_SYM:
                    {
                    alt6=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:886:1: ( ( rule__EXPRSIMPLE__Alternatives_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:886:1: ( ( rule__EXPRSIMPLE__Alternatives_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:887:1: ( rule__EXPRSIMPLE__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getAlternatives_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:888:1: ( rule__EXPRSIMPLE__Alternatives_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:888:2: rule__EXPRSIMPLE__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Alternatives_0_in_rule__EXPRSIMPLE__Alternatives1861);
                    rule__EXPRSIMPLE__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getAlternatives_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:892:6: ( ( rule__EXPRSIMPLE__Group_1__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:892:6: ( ( rule__EXPRSIMPLE__Group_1__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:893:1: ( rule__EXPRSIMPLE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:894:1: ( rule__EXPRSIMPLE__Group_1__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:894:2: rule__EXPRSIMPLE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__0_in_rule__EXPRSIMPLE__Alternatives1879);
                    rule__EXPRSIMPLE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:898:6: ( ( rule__EXPRSIMPLE__Group_2__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:898:6: ( ( rule__EXPRSIMPLE__Group_2__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:899:1: ( rule__EXPRSIMPLE__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:900:1: ( rule__EXPRSIMPLE__Group_2__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:900:2: rule__EXPRSIMPLE__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__0_in_rule__EXPRSIMPLE__Alternatives1897);
                    rule__EXPRSIMPLE__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:904:6: ( ( rule__EXPRSIMPLE__Group_3__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:904:6: ( ( rule__EXPRSIMPLE__Group_3__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:905:1: ( rule__EXPRSIMPLE__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:906:1: ( rule__EXPRSIMPLE__Group_3__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:906:2: rule__EXPRSIMPLE__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__0_in_rule__EXPRSIMPLE__Alternatives1915);
                    rule__EXPRSIMPLE__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:910:6: ( ( rule__EXPRSIMPLE__Group_4__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:910:6: ( ( rule__EXPRSIMPLE__Group_4__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:911:1: ( rule__EXPRSIMPLE__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:912:1: ( rule__EXPRSIMPLE__Group_4__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:912:2: rule__EXPRSIMPLE__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__0_in_rule__EXPRSIMPLE__Alternatives1933);
                    rule__EXPRSIMPLE__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:916:6: ( ( rule__EXPRSIMPLE__Group_5__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:916:6: ( ( rule__EXPRSIMPLE__Group_5__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:917:1: ( rule__EXPRSIMPLE__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:918:1: ( rule__EXPRSIMPLE__Group_5__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:918:2: rule__EXPRSIMPLE__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__0_in_rule__EXPRSIMPLE__Alternatives1951);
                    rule__EXPRSIMPLE__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Alternatives"


    // $ANTLR start "rule__EXPRSIMPLE__Alternatives_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:927:1: rule__EXPRSIMPLE__Alternatives_0 : ( ( 'nil' ) | ( ( rule__EXPRSIMPLE__LAssignment_0_1 ) ) | ( ( rule__EXPRSIMPLE__SAssignment_0_2 ) ) );
    public final void rule__EXPRSIMPLE__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:931:1: ( ( 'nil' ) | ( ( rule__EXPRSIMPLE__LAssignment_0_1 ) ) | ( ( rule__EXPRSIMPLE__SAssignment_0_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case RULE_VAR:
                {
                alt7=2;
                }
                break;
            case RULE_SYM:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:932:1: ( 'nil' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:932:1: ( 'nil' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:933:1: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getNilKeyword_0_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__EXPRSIMPLE__Alternatives_01985); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getNilKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:940:6: ( ( rule__EXPRSIMPLE__LAssignment_0_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:940:6: ( ( rule__EXPRSIMPLE__LAssignment_0_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:941:1: ( rule__EXPRSIMPLE__LAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getLAssignment_0_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:942:1: ( rule__EXPRSIMPLE__LAssignment_0_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:942:2: rule__EXPRSIMPLE__LAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__LAssignment_0_1_in_rule__EXPRSIMPLE__Alternatives_02004);
                    rule__EXPRSIMPLE__LAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getLAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:946:6: ( ( rule__EXPRSIMPLE__SAssignment_0_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:946:6: ( ( rule__EXPRSIMPLE__SAssignment_0_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:947:1: ( rule__EXPRSIMPLE__SAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getSAssignment_0_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:948:1: ( rule__EXPRSIMPLE__SAssignment_0_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:948:2: rule__EXPRSIMPLE__SAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__SAssignment_0_2_in_rule__EXPRSIMPLE__Alternatives_02022);
                    rule__EXPRSIMPLE__SAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getSAssignment_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Alternatives_0"


    // $ANTLR start "rule__EXPREQ__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:957:1: rule__EXPREQ__Alternatives : ( ( ( rule__EXPREQ__Group_0__0 ) ) | ( ( rule__EXPREQ__Group_1__0 ) ) );
    public final void rule__EXPREQ__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:961:1: ( ( ( rule__EXPREQ__Group_0__0 ) ) | ( ( rule__EXPREQ__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SYM && LA8_0<=RULE_VAR)||LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                int LA8_4 = input.LA(2);

                if ( (synpred17_InternalLangage_while()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:1: ( ( rule__EXPREQ__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:1: ( ( rule__EXPREQ__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:963:1: ( rule__EXPREQ__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPREQAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:1: ( rule__EXPREQ__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:2: rule__EXPREQ__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EXPREQ__Group_0__0_in_rule__EXPREQ__Alternatives2055);
                    rule__EXPREQ__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPREQAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:968:6: ( ( rule__EXPREQ__Group_1__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:968:6: ( ( rule__EXPREQ__Group_1__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:969:1: ( rule__EXPREQ__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPREQAccess().getGroup_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:970:1: ( rule__EXPREQ__Group_1__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:970:2: rule__EXPREQ__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPREQ__Group_1__0_in_rule__EXPREQ__Alternatives2073);
                    rule__EXPREQ__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPREQAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Alternatives"


    // $ANTLR start "rule__LC__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:979:1: rule__LC__Alternatives : ( ( ( rule__LC__AAssignment_0 ) ) | ( ( rule__LC__ZAssignment_1 ) ) | ( ( rule__LC__EAssignment_2 ) ) | ( ( rule__LC__RAssignment_3 ) ) );
    public final void rule__LC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:983:1: ( ( ( rule__LC__AAssignment_0 ) ) | ( ( rule__LC__ZAssignment_1 ) ) | ( ( rule__LC__EAssignment_2 ) ) | ( ( rule__LC__RAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt9=1;
                }
                break;
            case RULE_CR:
                {
                alt9=2;
                }
                break;
            case RULE_TAB:
                {
                alt9=3;
                }
                break;
            case RULE_LF:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:984:1: ( ( rule__LC__AAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:984:1: ( ( rule__LC__AAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:985:1: ( rule__LC__AAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getAAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:986:1: ( rule__LC__AAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:986:2: rule__LC__AAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LC__AAssignment_0_in_rule__LC__Alternatives2106);
                    rule__LC__AAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getAAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:990:6: ( ( rule__LC__ZAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:990:6: ( ( rule__LC__ZAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:991:1: ( rule__LC__ZAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getZAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:992:1: ( rule__LC__ZAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:992:2: rule__LC__ZAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LC__ZAssignment_1_in_rule__LC__Alternatives2124);
                    rule__LC__ZAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getZAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:996:6: ( ( rule__LC__EAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:996:6: ( ( rule__LC__EAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:997:1: ( rule__LC__EAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getEAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:998:1: ( rule__LC__EAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:998:2: rule__LC__EAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LC__EAssignment_2_in_rule__LC__Alternatives2142);
                    rule__LC__EAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getEAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1002:6: ( ( rule__LC__RAssignment_3 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1002:6: ( ( rule__LC__RAssignment_3 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1003:1: ( rule__LC__RAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getRAssignment_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1004:1: ( rule__LC__RAssignment_3 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1004:2: rule__LC__RAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LC__RAssignment_3_in_rule__LC__Alternatives2160);
                    rule__LC__RAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getRAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1015:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1019:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1020:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02191);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02194);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1027:1: rule__Program__Group__0__Impl : ( ( rule__Program__FAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1031:1: ( ( ( rule__Program__FAssignment_0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1032:1: ( ( rule__Program__FAssignment_0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1032:1: ( ( rule__Program__FAssignment_0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1033:1: ( rule__Program__FAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1034:1: ( rule__Program__FAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1034:2: rule__Program__FAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Program__FAssignment_0_in_rule__Program__Group__0__Impl2221);
            	    rule__Program__FAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1044:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1048:1: ( rule__Program__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1049:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12252);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1055:1: rule__Program__Group__1__Impl : ( ( rule__Program__Group_1__0 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1059:1: ( ( ( rule__Program__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1060:1: ( ( rule__Program__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1060:1: ( ( rule__Program__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1061:1: ( rule__Program__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1062:1: ( rule__Program__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1062:2: rule__Program__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl2279);
                    rule__Program__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1076:1: rule__Program__Group_1__0 : rule__Program__Group_1__0__Impl rule__Program__Group_1__1 ;
    public final void rule__Program__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1080:1: ( rule__Program__Group_1__0__Impl rule__Program__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1081:2: rule__Program__Group_1__0__Impl rule__Program__Group_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__02314);
            rule__Program__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__02317);
            rule__Program__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__0"


    // $ANTLR start "rule__Program__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1088:1: rule__Program__Group_1__0__Impl : ( ( rule__Program__UAssignment_1_0 ) ) ;
    public final void rule__Program__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1092:1: ( ( ( rule__Program__UAssignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1093:1: ( ( rule__Program__UAssignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1093:1: ( ( rule__Program__UAssignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1094:1: ( rule__Program__UAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getUAssignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1095:1: ( rule__Program__UAssignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1095:2: rule__Program__UAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Program__UAssignment_1_0_in_rule__Program__Group_1__0__Impl2344);
            rule__Program__UAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getUAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__0__Impl"


    // $ANTLR start "rule__Program__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1105:1: rule__Program__Group_1__1 : rule__Program__Group_1__1__Impl ;
    public final void rule__Program__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1109:1: ( rule__Program__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1110:2: rule__Program__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__12374);
            rule__Program__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__1"


    // $ANTLR start "rule__Program__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1116:1: rule__Program__Group_1__1__Impl : ( ( rule__Program__PpAssignment_1_1 ) ) ;
    public final void rule__Program__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1120:1: ( ( ( rule__Program__PpAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1121:1: ( ( rule__Program__PpAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1121:1: ( ( rule__Program__PpAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1122:1: ( rule__Program__PpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPpAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1123:1: ( rule__Program__PpAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1123:2: rule__Program__PpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Program__PpAssignment_1_1_in_rule__Program__Group_1__1__Impl2401);
            rule__Program__PpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getPpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1137:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1141:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1142:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02435);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02438);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1149:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1153:1: ( ( 'function' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1154:1: ( 'function' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1154:1: ( 'function' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1155:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Function__Group__0__Impl2466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1168:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1172:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1173:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12497);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12500);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1180:1: rule__Function__Group__1__Impl : ( ( rule__Function__NAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1184:1: ( ( ( rule__Function__NAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1185:1: ( ( rule__Function__NAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1185:1: ( ( rule__Function__NAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1186:1: ( rule__Function__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1187:1: ( rule__Function__NAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1187:2: rule__Function__NAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NAssignment_1_in_rule__Function__Group__1__Impl2527);
            rule__Function__NAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1197:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1201:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1202:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22557);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22560);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1209:1: rule__Function__Group__2__Impl : ( ( rule__Function__NomAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1213:1: ( ( ( rule__Function__NomAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1214:1: ( ( rule__Function__NomAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1214:1: ( ( rule__Function__NomAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1215:1: ( rule__Function__NomAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1216:1: ( rule__Function__NomAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1216:2: rule__Function__NomAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_2_in_rule__Function__Group__2__Impl2587);
            rule__Function__NomAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1226:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1230:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1231:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32617);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32620);
            rule__Function__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1238:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1242:1: ( ( ':' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1243:1: ( ':' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1243:1: ( ':' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1244:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Function__Group__3__Impl2648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1257:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1261:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1262:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42679);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42682);
            rule__Function__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1269:1: rule__Function__Group__4__Impl : ( ( rule__Function__TAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1273:1: ( ( ( rule__Function__TAssignment_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1274:1: ( ( rule__Function__TAssignment_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1274:1: ( ( rule__Function__TAssignment_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1275:1: ( rule__Function__TAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getTAssignment_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1276:1: ( rule__Function__TAssignment_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1276:2: rule__Function__TAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__TAssignment_4_in_rule__Function__Group__4__Impl2709);
            rule__Function__TAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getTAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1286:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1290:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1291:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52739);
            rule__Function__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1297:1: rule__Function__Group__5__Impl : ( ( rule__Function__DAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1301:1: ( ( ( rule__Function__DAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1302:1: ( ( rule__Function__DAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1302:1: ( ( rule__Function__DAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1303:1: ( rule__Function__DAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:1: ( rule__Function__DAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:2: rule__Function__DAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DAssignment_5_in_rule__Function__Group__5__Impl2766);
            rule__Function__DAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Def__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1326:1: rule__Def__Group__0 : rule__Def__Group__0__Impl rule__Def__Group__1 ;
    public final void rule__Def__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1330:1: ( rule__Def__Group__0__Impl rule__Def__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1331:2: rule__Def__Group__0__Impl rule__Def__Group__1
            {
            pushFollow(FOLLOW_rule__Def__Group__0__Impl_in_rule__Def__Group__02808);
            rule__Def__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__1_in_rule__Def__Group__02811);
            rule__Def__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__0"


    // $ANTLR start "rule__Def__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1338:1: rule__Def__Group__0__Impl : ( 'read' ) ;
    public final void rule__Def__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1342:1: ( ( 'read' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1343:1: ( 'read' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1343:1: ( 'read' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1344:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getReadKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Def__Group__0__Impl2839); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__0__Impl"


    // $ANTLR start "rule__Def__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1357:1: rule__Def__Group__1 : rule__Def__Group__1__Impl rule__Def__Group__2 ;
    public final void rule__Def__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1361:1: ( rule__Def__Group__1__Impl rule__Def__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1362:2: rule__Def__Group__1__Impl rule__Def__Group__2
            {
            pushFollow(FOLLOW_rule__Def__Group__1__Impl_in_rule__Def__Group__12870);
            rule__Def__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__2_in_rule__Def__Group__12873);
            rule__Def__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__1"


    // $ANTLR start "rule__Def__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1369:1: rule__Def__Group__1__Impl : ( ( rule__Def__LAssignment_1 ) ) ;
    public final void rule__Def__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1373:1: ( ( ( rule__Def__LAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1374:1: ( ( rule__Def__LAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1374:1: ( ( rule__Def__LAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1375:1: ( rule__Def__LAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getLAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1376:1: ( rule__Def__LAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1376:2: rule__Def__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Def__LAssignment_1_in_rule__Def__Group__1__Impl2900);
            rule__Def__LAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getLAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__1__Impl"


    // $ANTLR start "rule__Def__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1386:1: rule__Def__Group__2 : rule__Def__Group__2__Impl rule__Def__Group__3 ;
    public final void rule__Def__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1390:1: ( rule__Def__Group__2__Impl rule__Def__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1391:2: rule__Def__Group__2__Impl rule__Def__Group__3
            {
            pushFollow(FOLLOW_rule__Def__Group__2__Impl_in_rule__Def__Group__22930);
            rule__Def__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__3_in_rule__Def__Group__22933);
            rule__Def__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__2"


    // $ANTLR start "rule__Def__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1398:1: rule__Def__Group__2__Impl : ( ( rule__Def__InAssignment_2 ) ) ;
    public final void rule__Def__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1402:1: ( ( ( rule__Def__InAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1403:1: ( ( rule__Def__InAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1403:1: ( ( rule__Def__InAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1404:1: ( rule__Def__InAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getInAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1405:1: ( rule__Def__InAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1405:2: rule__Def__InAssignment_2
            {
            pushFollow(FOLLOW_rule__Def__InAssignment_2_in_rule__Def__Group__2__Impl2960);
            rule__Def__InAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getInAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__2__Impl"


    // $ANTLR start "rule__Def__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1415:1: rule__Def__Group__3 : rule__Def__Group__3__Impl rule__Def__Group__4 ;
    public final void rule__Def__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1419:1: ( rule__Def__Group__3__Impl rule__Def__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1420:2: rule__Def__Group__3__Impl rule__Def__Group__4
            {
            pushFollow(FOLLOW_rule__Def__Group__3__Impl_in_rule__Def__Group__32990);
            rule__Def__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__4_in_rule__Def__Group__32993);
            rule__Def__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__3"


    // $ANTLR start "rule__Def__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1427:1: rule__Def__Group__3__Impl : ( ( rule__Def__ZAssignment_3 ) ) ;
    public final void rule__Def__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1431:1: ( ( ( rule__Def__ZAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1432:1: ( ( rule__Def__ZAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1432:1: ( ( rule__Def__ZAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1433:1: ( rule__Def__ZAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getZAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1434:1: ( rule__Def__ZAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1434:2: rule__Def__ZAssignment_3
            {
            pushFollow(FOLLOW_rule__Def__ZAssignment_3_in_rule__Def__Group__3__Impl3020);
            rule__Def__ZAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getZAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__3__Impl"


    // $ANTLR start "rule__Def__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1444:1: rule__Def__Group__4 : rule__Def__Group__4__Impl rule__Def__Group__5 ;
    public final void rule__Def__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1448:1: ( rule__Def__Group__4__Impl rule__Def__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1449:2: rule__Def__Group__4__Impl rule__Def__Group__5
            {
            pushFollow(FOLLOW_rule__Def__Group__4__Impl_in_rule__Def__Group__43050);
            rule__Def__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__5_in_rule__Def__Group__43053);
            rule__Def__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__4"


    // $ANTLR start "rule__Def__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1456:1: rule__Def__Group__4__Impl : ( '%' ) ;
    public final void rule__Def__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1460:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1461:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1461:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1462:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getPercentSignKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__Def__Group__4__Impl3081); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getPercentSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__4__Impl"


    // $ANTLR start "rule__Def__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1475:1: rule__Def__Group__5 : rule__Def__Group__5__Impl rule__Def__Group__6 ;
    public final void rule__Def__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1479:1: ( rule__Def__Group__5__Impl rule__Def__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1480:2: rule__Def__Group__5__Impl rule__Def__Group__6
            {
            pushFollow(FOLLOW_rule__Def__Group__5__Impl_in_rule__Def__Group__53112);
            rule__Def__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__6_in_rule__Def__Group__53115);
            rule__Def__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__5"


    // $ANTLR start "rule__Def__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1487:1: rule__Def__Group__5__Impl : ( ( rule__Def__VAssignment_5 ) ) ;
    public final void rule__Def__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1491:1: ( ( ( rule__Def__VAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1492:1: ( ( rule__Def__VAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1492:1: ( ( rule__Def__VAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1493:1: ( rule__Def__VAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getVAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1494:1: ( rule__Def__VAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1494:2: rule__Def__VAssignment_5
            {
            pushFollow(FOLLOW_rule__Def__VAssignment_5_in_rule__Def__Group__5__Impl3142);
            rule__Def__VAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getVAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__5__Impl"


    // $ANTLR start "rule__Def__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1504:1: rule__Def__Group__6 : rule__Def__Group__6__Impl rule__Def__Group__7 ;
    public final void rule__Def__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1508:1: ( rule__Def__Group__6__Impl rule__Def__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1509:2: rule__Def__Group__6__Impl rule__Def__Group__7
            {
            pushFollow(FOLLOW_rule__Def__Group__6__Impl_in_rule__Def__Group__63172);
            rule__Def__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__7_in_rule__Def__Group__63175);
            rule__Def__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__6"


    // $ANTLR start "rule__Def__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1516:1: rule__Def__Group__6__Impl : ( ( rule__Def__SAssignment_6 ) ) ;
    public final void rule__Def__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1520:1: ( ( ( rule__Def__SAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1521:1: ( ( rule__Def__SAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1521:1: ( ( rule__Def__SAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1522:1: ( rule__Def__SAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getSAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1523:1: ( rule__Def__SAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1523:2: rule__Def__SAssignment_6
            {
            pushFollow(FOLLOW_rule__Def__SAssignment_6_in_rule__Def__Group__6__Impl3202);
            rule__Def__SAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getSAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__6__Impl"


    // $ANTLR start "rule__Def__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1533:1: rule__Def__Group__7 : rule__Def__Group__7__Impl rule__Def__Group__8 ;
    public final void rule__Def__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1537:1: ( rule__Def__Group__7__Impl rule__Def__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1538:2: rule__Def__Group__7__Impl rule__Def__Group__8
            {
            pushFollow(FOLLOW_rule__Def__Group__7__Impl_in_rule__Def__Group__73232);
            rule__Def__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__8_in_rule__Def__Group__73235);
            rule__Def__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__7"


    // $ANTLR start "rule__Def__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1545:1: rule__Def__Group__7__Impl : ( '%' ) ;
    public final void rule__Def__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1549:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1550:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1550:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1551:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getPercentSignKeyword_7()); 
            }
            match(input,23,FOLLOW_23_in_rule__Def__Group__7__Impl3263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getPercentSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__7__Impl"


    // $ANTLR start "rule__Def__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1564:1: rule__Def__Group__8 : rule__Def__Group__8__Impl rule__Def__Group__9 ;
    public final void rule__Def__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1568:1: ( rule__Def__Group__8__Impl rule__Def__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1569:2: rule__Def__Group__8__Impl rule__Def__Group__9
            {
            pushFollow(FOLLOW_rule__Def__Group__8__Impl_in_rule__Def__Group__83294);
            rule__Def__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__9_in_rule__Def__Group__83297);
            rule__Def__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__8"


    // $ANTLR start "rule__Def__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1576:1: rule__Def__Group__8__Impl : ( 'write' ) ;
    public final void rule__Def__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1580:1: ( ( 'write' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1581:1: ( 'write' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1581:1: ( 'write' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1582:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getWriteKeyword_8()); 
            }
            match(input,24,FOLLOW_24_in_rule__Def__Group__8__Impl3325); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getWriteKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__8__Impl"


    // $ANTLR start "rule__Def__Group__9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1595:1: rule__Def__Group__9 : rule__Def__Group__9__Impl rule__Def__Group__10 ;
    public final void rule__Def__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1599:1: ( rule__Def__Group__9__Impl rule__Def__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1600:2: rule__Def__Group__9__Impl rule__Def__Group__10
            {
            pushFollow(FOLLOW_rule__Def__Group__9__Impl_in_rule__Def__Group__93356);
            rule__Def__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__10_in_rule__Def__Group__93359);
            rule__Def__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__9"


    // $ANTLR start "rule__Def__Group__9__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1607:1: rule__Def__Group__9__Impl : ( ( rule__Def__UAssignment_9 ) ) ;
    public final void rule__Def__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1611:1: ( ( ( rule__Def__UAssignment_9 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1612:1: ( ( rule__Def__UAssignment_9 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1612:1: ( ( rule__Def__UAssignment_9 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1613:1: ( rule__Def__UAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getUAssignment_9()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1614:1: ( rule__Def__UAssignment_9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1614:2: rule__Def__UAssignment_9
            {
            pushFollow(FOLLOW_rule__Def__UAssignment_9_in_rule__Def__Group__9__Impl3386);
            rule__Def__UAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getUAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__9__Impl"


    // $ANTLR start "rule__Def__Group__10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1624:1: rule__Def__Group__10 : rule__Def__Group__10__Impl ;
    public final void rule__Def__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1628:1: ( rule__Def__Group__10__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1629:2: rule__Def__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Def__Group__10__Impl_in_rule__Def__Group__103416);
            rule__Def__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__10"


    // $ANTLR start "rule__Def__Group__10__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1635:1: rule__Def__Group__10__Impl : ( ( rule__Def__OAssignment_10 ) ) ;
    public final void rule__Def__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1639:1: ( ( ( rule__Def__OAssignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1640:1: ( ( rule__Def__OAssignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1640:1: ( ( rule__Def__OAssignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1641:1: ( rule__Def__OAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getOAssignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1642:1: ( rule__Def__OAssignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1642:2: rule__Def__OAssignment_10
            {
            pushFollow(FOLLOW_rule__Def__OAssignment_10_in_rule__Def__Group__10__Impl3443);
            rule__Def__OAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getOAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__10__Impl"


    // $ANTLR start "rule__Input__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1674:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1678:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1679:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__03495);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__03498);
            rule__Input__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0"


    // $ANTLR start "rule__Input__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1686:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1690:1: ( ( ( rule__Input__VAssignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1691:1: ( ( rule__Input__VAssignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1691:1: ( ( rule__Input__VAssignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1692:1: ( rule__Input__VAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1693:1: ( rule__Input__VAssignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1693:2: rule__Input__VAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_0_0_in_rule__Input__Group_0__0__Impl3525);
            rule__Input__VAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0__Impl"


    // $ANTLR start "rule__Input__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1703:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl rule__Input__Group_0__2 ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1707:1: ( rule__Input__Group_0__1__Impl rule__Input__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1708:2: rule__Input__Group_0__1__Impl rule__Input__Group_0__2
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__13555);
            rule__Input__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__2_in_rule__Input__Group_0__13558);
            rule__Input__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1"


    // $ANTLR start "rule__Input__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1715:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1719:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1720:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1720:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1721:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_0__1__Impl3586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1__Impl"


    // $ANTLR start "rule__Input__Group_0__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1734:1: rule__Input__Group_0__2 : rule__Input__Group_0__2__Impl rule__Input__Group_0__3 ;
    public final void rule__Input__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1738:1: ( rule__Input__Group_0__2__Impl rule__Input__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1739:2: rule__Input__Group_0__2__Impl rule__Input__Group_0__3
            {
            pushFollow(FOLLOW_rule__Input__Group_0__2__Impl_in_rule__Input__Group_0__23617);
            rule__Input__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__3_in_rule__Input__Group_0__23620);
            rule__Input__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__2"


    // $ANTLR start "rule__Input__Group_0__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1746:1: rule__Input__Group_0__2__Impl : ( ( rule__Input__ZAssignment_0_2 ) ) ;
    public final void rule__Input__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1750:1: ( ( ( rule__Input__ZAssignment_0_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1751:1: ( ( rule__Input__ZAssignment_0_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1751:1: ( ( rule__Input__ZAssignment_0_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1752:1: ( rule__Input__ZAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getZAssignment_0_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1753:1: ( rule__Input__ZAssignment_0_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1753:2: rule__Input__ZAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Input__ZAssignment_0_2_in_rule__Input__Group_0__2__Impl3647);
            rule__Input__ZAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getZAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__2__Impl"


    // $ANTLR start "rule__Input__Group_0__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1763:1: rule__Input__Group_0__3 : rule__Input__Group_0__3__Impl ;
    public final void rule__Input__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1767:1: ( rule__Input__Group_0__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1768:2: rule__Input__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__3__Impl_in_rule__Input__Group_0__33677);
            rule__Input__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__3"


    // $ANTLR start "rule__Input__Group_0__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1774:1: rule__Input__Group_0__3__Impl : ( ( rule__Input__InAssignment_0_3 ) ) ;
    public final void rule__Input__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1778:1: ( ( ( rule__Input__InAssignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1779:1: ( ( rule__Input__InAssignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1779:1: ( ( rule__Input__InAssignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1780:1: ( rule__Input__InAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getInAssignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1781:1: ( rule__Input__InAssignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1781:2: rule__Input__InAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Input__InAssignment_0_3_in_rule__Input__Group_0__3__Impl3704);
            rule__Input__InAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getInAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__3__Impl"


    // $ANTLR start "rule__Output__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1799:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1803:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1804:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__03742);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__03745);
            rule__Output__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0"


    // $ANTLR start "rule__Output__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1811:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__NAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1815:1: ( ( ( rule__Output__NAssignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1816:1: ( ( rule__Output__NAssignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1816:1: ( ( rule__Output__NAssignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1817:1: ( rule__Output__NAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getNAssignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1818:1: ( rule__Output__NAssignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1818:2: rule__Output__NAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__NAssignment_0_0_in_rule__Output__Group_0__0__Impl3772);
            rule__Output__NAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getNAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0__Impl"


    // $ANTLR start "rule__Output__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1828:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl rule__Output__Group_0__2 ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1832:1: ( rule__Output__Group_0__1__Impl rule__Output__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1833:2: rule__Output__Group_0__1__Impl rule__Output__Group_0__2
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__13802);
            rule__Output__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__2_in_rule__Output__Group_0__13805);
            rule__Output__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1"


    // $ANTLR start "rule__Output__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1840:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1844:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1845:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1845:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1846:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Output__Group_0__1__Impl3833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1__Impl"


    // $ANTLR start "rule__Output__Group_0__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1859:1: rule__Output__Group_0__2 : rule__Output__Group_0__2__Impl rule__Output__Group_0__3 ;
    public final void rule__Output__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1863:1: ( rule__Output__Group_0__2__Impl rule__Output__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1864:2: rule__Output__Group_0__2__Impl rule__Output__Group_0__3
            {
            pushFollow(FOLLOW_rule__Output__Group_0__2__Impl_in_rule__Output__Group_0__23864);
            rule__Output__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__3_in_rule__Output__Group_0__23867);
            rule__Output__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__2"


    // $ANTLR start "rule__Output__Group_0__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1871:1: rule__Output__Group_0__2__Impl : ( ( rule__Output__QAssignment_0_2 ) ) ;
    public final void rule__Output__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1875:1: ( ( ( rule__Output__QAssignment_0_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1876:1: ( ( rule__Output__QAssignment_0_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1876:1: ( ( rule__Output__QAssignment_0_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1877:1: ( rule__Output__QAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getQAssignment_0_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1878:1: ( rule__Output__QAssignment_0_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1878:2: rule__Output__QAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Output__QAssignment_0_2_in_rule__Output__Group_0__2__Impl3894);
            rule__Output__QAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getQAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__2__Impl"


    // $ANTLR start "rule__Output__Group_0__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1888:1: rule__Output__Group_0__3 : rule__Output__Group_0__3__Impl ;
    public final void rule__Output__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1892:1: ( rule__Output__Group_0__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1893:2: rule__Output__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__3__Impl_in_rule__Output__Group_0__33924);
            rule__Output__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__3"


    // $ANTLR start "rule__Output__Group_0__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1899:1: rule__Output__Group_0__3__Impl : ( ( rule__Output__OAssignment_0_3 ) ) ;
    public final void rule__Output__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1903:1: ( ( ( rule__Output__OAssignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1904:1: ( ( rule__Output__OAssignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1904:1: ( ( rule__Output__OAssignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1905:1: ( rule__Output__OAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOAssignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1906:1: ( rule__Output__OAssignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1906:2: rule__Output__OAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Output__OAssignment_0_3_in_rule__Output__Group_0__3__Impl3951);
            rule__Output__OAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__3__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1924:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1928:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1929:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03989);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03992);
            rule__Commands__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1936:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__AAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1940:1: ( ( ( rule__Commands__AAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1941:1: ( ( rule__Commands__AAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1941:1: ( ( rule__Commands__AAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1942:1: ( rule__Commands__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getAAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1943:1: ( rule__Commands__AAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1943:2: rule__Commands__AAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__AAssignment_0_in_rule__Commands__Group__0__Impl4019);
            rule__Commands__AAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getAAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1953:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1957:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1958:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__14049);
            rule__Commands__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1964:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )? ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1968:1: ( ( ( rule__Commands__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1969:1: ( ( rule__Commands__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1969:1: ( ( rule__Commands__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1970:1: ( rule__Commands__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1971:1: ( rule__Commands__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1971:2: rule__Commands__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl4076);
                    rule__Commands__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1985:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1989:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1990:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__04111);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__04114);
            rule__Commands__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0"


    // $ANTLR start "rule__Commands__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1997:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2001:1: ( ( ';' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2002:1: ( ';' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2002:1: ( ';' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2003:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Commands__Group_1__0__Impl4142); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0__Impl"


    // $ANTLR start "rule__Commands__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2016:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2020:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2021:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__14173);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__14176);
            rule__Commands__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1"


    // $ANTLR start "rule__Commands__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2028:1: rule__Commands__Group_1__1__Impl : ( ( rule__Commands__LAssignment_1_1 ) ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2032:1: ( ( ( rule__Commands__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2033:1: ( ( rule__Commands__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2033:1: ( ( rule__Commands__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2034:1: ( rule__Commands__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2035:1: ( rule__Commands__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2035:2: rule__Commands__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Commands__LAssignment_1_1_in_rule__Commands__Group_1__1__Impl4203);
            rule__Commands__LAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2045:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2049:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2050:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__24233);
            rule__Commands__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__2"


    // $ANTLR start "rule__Commands__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2056:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__SAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2060:1: ( ( ( rule__Commands__SAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2061:1: ( ( rule__Commands__SAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2061:1: ( ( rule__Commands__SAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2062:1: ( rule__Commands__SAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2063:1: ( rule__Commands__SAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2063:2: rule__Commands__SAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__SAssignment_1_2_in_rule__Commands__Group_1__2__Impl4260);
            rule__Commands__SAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__2__Impl"


    // $ANTLR start "rule__Assign__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2079:1: rule__Assign__Group__0 : rule__Assign__Group__0__Impl rule__Assign__Group__1 ;
    public final void rule__Assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2083:1: ( rule__Assign__Group__0__Impl rule__Assign__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2084:2: rule__Assign__Group__0__Impl rule__Assign__Group__1
            {
            pushFollow(FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04296);
            rule__Assign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04299);
            rule__Assign__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0"


    // $ANTLR start "rule__Assign__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2091:1: rule__Assign__Group__0__Impl : ( ( rule__Assign__EAssignment_0 ) ) ;
    public final void rule__Assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2095:1: ( ( ( rule__Assign__EAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2096:1: ( ( rule__Assign__EAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2096:1: ( ( rule__Assign__EAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2097:1: ( rule__Assign__EAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getEAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2098:1: ( rule__Assign__EAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2098:2: rule__Assign__EAssignment_0
            {
            pushFollow(FOLLOW_rule__Assign__EAssignment_0_in_rule__Assign__Group__0__Impl4326);
            rule__Assign__EAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getEAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0__Impl"


    // $ANTLR start "rule__Assign__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2108:1: rule__Assign__Group__1 : rule__Assign__Group__1__Impl rule__Assign__Group__2 ;
    public final void rule__Assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2112:1: ( rule__Assign__Group__1__Impl rule__Assign__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2113:2: rule__Assign__Group__1__Impl rule__Assign__Group__2
            {
            pushFollow(FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14356);
            rule__Assign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14359);
            rule__Assign__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1"


    // $ANTLR start "rule__Assign__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2120:1: rule__Assign__Group__1__Impl : ( ( rule__Assign__LAssignment_1 ) ) ;
    public final void rule__Assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2124:1: ( ( ( rule__Assign__LAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2125:1: ( ( rule__Assign__LAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2125:1: ( ( rule__Assign__LAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2126:1: ( rule__Assign__LAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2127:1: ( rule__Assign__LAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2127:2: rule__Assign__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Assign__LAssignment_1_in_rule__Assign__Group__1__Impl4386);
            rule__Assign__LAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getLAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1__Impl"


    // $ANTLR start "rule__Assign__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2137:1: rule__Assign__Group__2 : rule__Assign__Group__2__Impl rule__Assign__Group__3 ;
    public final void rule__Assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2141:1: ( rule__Assign__Group__2__Impl rule__Assign__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2142:2: rule__Assign__Group__2__Impl rule__Assign__Group__3
            {
            pushFollow(FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24416);
            rule__Assign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24419);
            rule__Assign__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2"


    // $ANTLR start "rule__Assign__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2149:1: rule__Assign__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2153:1: ( ( ':=' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2154:1: ( ':=' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2154:1: ( ':=' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2155:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Assign__Group__2__Impl4447); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2__Impl"


    // $ANTLR start "rule__Assign__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2168:1: rule__Assign__Group__3 : rule__Assign__Group__3__Impl rule__Assign__Group__4 ;
    public final void rule__Assign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2172:1: ( rule__Assign__Group__3__Impl rule__Assign__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2173:2: rule__Assign__Group__3__Impl rule__Assign__Group__4
            {
            pushFollow(FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34478);
            rule__Assign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34481);
            rule__Assign__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__3"


    // $ANTLR start "rule__Assign__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2180:1: rule__Assign__Group__3__Impl : ( ( rule__Assign__CAssignment_3 ) ) ;
    public final void rule__Assign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2184:1: ( ( ( rule__Assign__CAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2185:1: ( ( rule__Assign__CAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2185:1: ( ( rule__Assign__CAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2186:1: ( rule__Assign__CAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getCAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2187:1: ( rule__Assign__CAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2187:2: rule__Assign__CAssignment_3
            {
            pushFollow(FOLLOW_rule__Assign__CAssignment_3_in_rule__Assign__Group__3__Impl4508);
            rule__Assign__CAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getCAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__3__Impl"


    // $ANTLR start "rule__Assign__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2197:1: rule__Assign__Group__4 : rule__Assign__Group__4__Impl ;
    public final void rule__Assign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2201:1: ( rule__Assign__Group__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2202:2: rule__Assign__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44538);
            rule__Assign__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__4"


    // $ANTLR start "rule__Assign__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2208:1: rule__Assign__Group__4__Impl : ( ( rule__Assign__NAssignment_4 ) ) ;
    public final void rule__Assign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2212:1: ( ( ( rule__Assign__NAssignment_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ( rule__Assign__NAssignment_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ( rule__Assign__NAssignment_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2214:1: ( rule__Assign__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getNAssignment_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2215:1: ( rule__Assign__NAssignment_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2215:2: rule__Assign__NAssignment_4
            {
            pushFollow(FOLLOW_rule__Assign__NAssignment_4_in_rule__Assign__Group__4__Impl4565);
            rule__Assign__NAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getNAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__4__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2235:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2239:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2240:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04605);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04608);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2247:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2251:1: ( ( 'while' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2252:1: ( 'while' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2252:1: ( 'while' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2253:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__While__Group__0__Impl4636); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2266:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2270:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2271:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14667);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14670);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2278:1: rule__While__Group__1__Impl : ( ( rule__While__LlAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2282:1: ( ( ( rule__While__LlAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2283:1: ( ( rule__While__LlAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2283:1: ( ( rule__While__LlAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2284:1: ( rule__While__LlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLlAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2285:1: ( rule__While__LlAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2285:2: rule__While__LlAssignment_1
            {
            pushFollow(FOLLOW_rule__While__LlAssignment_1_in_rule__While__Group__1__Impl4697);
            rule__While__LlAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLlAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2295:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2299:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2300:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24727);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24730);
            rule__While__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2307:1: rule__While__Group__2__Impl : ( ( rule__While__EeAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2311:1: ( ( ( rule__While__EeAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2312:1: ( ( rule__While__EeAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2312:1: ( ( rule__While__EeAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2313:1: ( rule__While__EeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getEeAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2314:1: ( rule__While__EeAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2314:2: rule__While__EeAssignment_2
            {
            pushFollow(FOLLOW_rule__While__EeAssignment_2_in_rule__While__Group__2__Impl4757);
            rule__While__EeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getEeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2324:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2328:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2329:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34787);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34790);
            rule__While__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2336:1: rule__While__Group__3__Impl : ( ( rule__While__CcAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2340:1: ( ( ( rule__While__CcAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2341:1: ( ( rule__While__CcAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2341:1: ( ( rule__While__CcAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2342:1: ( rule__While__CcAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCcAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2343:1: ( rule__While__CcAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2343:2: rule__While__CcAssignment_3
            {
            pushFollow(FOLLOW_rule__While__CcAssignment_3_in_rule__While__Group__3__Impl4817);
            rule__While__CcAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCcAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2353:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2357:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2358:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44847);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44850);
            rule__While__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2365:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2369:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2370:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2370:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2371:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__While__Group__4__Impl4878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2384:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2388:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2389:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54909);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54912);
            rule__While__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2396:1: rule__While__Group__5__Impl : ( ( rule__While__ZAssignment_5 ) ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2400:1: ( ( ( rule__While__ZAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2401:1: ( ( rule__While__ZAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2401:1: ( ( rule__While__ZAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2402:1: ( rule__While__ZAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getZAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2403:1: ( rule__While__ZAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2403:2: rule__While__ZAssignment_5
            {
            pushFollow(FOLLOW_rule__While__ZAssignment_5_in_rule__While__Group__5__Impl4939);
            rule__While__ZAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getZAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2413:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2417:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2418:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64969);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64972);
            rule__While__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2425:1: rule__While__Group__6__Impl : ( ( rule__While__KAssignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2429:1: ( ( ( rule__While__KAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2430:1: ( ( rule__While__KAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2430:1: ( ( rule__While__KAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2431:1: ( rule__While__KAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getKAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2432:1: ( rule__While__KAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2432:2: rule__While__KAssignment_6
            {
            pushFollow(FOLLOW_rule__While__KAssignment_6_in_rule__While__Group__6__Impl4999);
            rule__While__KAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getKAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2442:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2446:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2447:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75029);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__75032);
            rule__While__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2454:1: rule__While__Group__7__Impl : ( ( rule__While__LcAssignment_7 ) ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2458:1: ( ( ( rule__While__LcAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2459:1: ( ( rule__While__LcAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2459:1: ( ( rule__While__LcAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2460:1: ( rule__While__LcAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLcAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2461:1: ( rule__While__LcAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2461:2: rule__While__LcAssignment_7
            {
            pushFollow(FOLLOW_rule__While__LcAssignment_7_in_rule__While__Group__7__Impl5059);
            rule__While__LcAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLcAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2471:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2475:1: ( rule__While__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2476:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85089);
            rule__While__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__8"


    // $ANTLR start "rule__While__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2482:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2486:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2487:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2487:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2488:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__While__Group__8__Impl5117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__8__Impl"


    // $ANTLR start "rule__For__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2519:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2523:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2524:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05166);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__05169);
            rule__For__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2531:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2535:1: ( ( 'for' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2536:1: ( 'for' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2536:1: ( 'for' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2537:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__0__Impl5197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2550:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2554:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2555:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15228);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__15231);
            rule__For__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2562:1: rule__For__Group__1__Impl : ( ( rule__For__CcAssignment_1 ) ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2566:1: ( ( ( rule__For__CcAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2567:1: ( ( rule__For__CcAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2567:1: ( ( rule__For__CcAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2568:1: ( rule__For__CcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCcAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2569:1: ( rule__For__CcAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2569:2: rule__For__CcAssignment_1
            {
            pushFollow(FOLLOW_rule__For__CcAssignment_1_in_rule__For__Group__1__Impl5258);
            rule__For__CcAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCcAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2579:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2583:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2584:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25288);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25291);
            rule__For__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2591:1: rule__For__Group__2__Impl : ( ( rule__For__HhAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2595:1: ( ( ( rule__For__HhAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2596:1: ( ( rule__For__HhAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2596:1: ( ( rule__For__HhAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2597:1: ( rule__For__HhAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getHhAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2598:1: ( rule__For__HhAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2598:2: rule__For__HhAssignment_2
            {
            pushFollow(FOLLOW_rule__For__HhAssignment_2_in_rule__For__Group__2__Impl5318);
            rule__For__HhAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getHhAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2608:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2612:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2613:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35348);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35351);
            rule__For__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2620:1: rule__For__Group__3__Impl : ( ( rule__For__TtAssignment_3 ) ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2624:1: ( ( ( rule__For__TtAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2625:1: ( ( rule__For__TtAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2625:1: ( ( rule__For__TtAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2626:1: ( rule__For__TtAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getTtAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2627:1: ( rule__For__TtAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2627:2: rule__For__TtAssignment_3
            {
            pushFollow(FOLLOW_rule__For__TtAssignment_3_in_rule__For__Group__3__Impl5378);
            rule__For__TtAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getTtAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2637:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2641:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2642:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45408);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45411);
            rule__For__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2649:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2653:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2654:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2654:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2655:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__For__Group__4__Impl5439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__For__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2668:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2672:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2673:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55470);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55473);
            rule__For__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2680:1: rule__For__Group__5__Impl : ( ( rule__For__VvAssignment_5 ) ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2684:1: ( ( ( rule__For__VvAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2685:1: ( ( rule__For__VvAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2685:1: ( ( rule__For__VvAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2686:1: ( rule__For__VvAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getVvAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2687:1: ( rule__For__VvAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2687:2: rule__For__VvAssignment_5
            {
            pushFollow(FOLLOW_rule__For__VvAssignment_5_in_rule__For__Group__5__Impl5500);
            rule__For__VvAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getVvAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5__Impl"


    // $ANTLR start "rule__For__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2697:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2701:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2702:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65530);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65533);
            rule__For__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6"


    // $ANTLR start "rule__For__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2709:1: rule__For__Group__6__Impl : ( ( rule__For__C1Assignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2713:1: ( ( ( rule__For__C1Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2714:1: ( ( rule__For__C1Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2714:1: ( ( rule__For__C1Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2715:1: ( rule__For__C1Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getC1Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2716:1: ( rule__For__C1Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2716:2: rule__For__C1Assignment_6
            {
            pushFollow(FOLLOW_rule__For__C1Assignment_6_in_rule__For__Group__6__Impl5560);
            rule__For__C1Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getC1Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6__Impl"


    // $ANTLR start "rule__For__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2726:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2730:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2731:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75590);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75593);
            rule__For__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7"


    // $ANTLR start "rule__For__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2738:1: rule__For__Group__7__Impl : ( ( rule__For__SsAssignment_7 ) ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2742:1: ( ( ( rule__For__SsAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2743:1: ( ( rule__For__SsAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2743:1: ( ( rule__For__SsAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2744:1: ( rule__For__SsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSsAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2745:1: ( rule__For__SsAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2745:2: rule__For__SsAssignment_7
            {
            pushFollow(FOLLOW_rule__For__SsAssignment_7_in_rule__For__Group__7__Impl5620);
            rule__For__SsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getSsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7__Impl"


    // $ANTLR start "rule__For__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2755:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2759:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2760:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85650);
            rule__For__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8"


    // $ANTLR start "rule__For__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2766:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2770:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2771:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2771:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2772:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__For__Group__8__Impl5678); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getOdKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2803:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2807:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2808:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05727);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05730);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2815:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2819:1: ( ( 'if' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2820:1: ( 'if' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2820:1: ( 'if' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2821:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__If__Group__0__Impl5758); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2834:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2838:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2839:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15789);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15792);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2846:1: rule__If__Group__1__Impl : ( ( rule__If__MmAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2850:1: ( ( ( rule__If__MmAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2851:1: ( ( rule__If__MmAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2851:1: ( ( rule__If__MmAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2852:1: ( rule__If__MmAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getMmAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2853:1: ( rule__If__MmAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2853:2: rule__If__MmAssignment_1
            {
            pushFollow(FOLLOW_rule__If__MmAssignment_1_in_rule__If__Group__1__Impl5819);
            rule__If__MmAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getMmAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2863:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2867:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2868:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25849);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25852);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2875:1: rule__If__Group__2__Impl : ( ( rule__If__JjAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2879:1: ( ( ( rule__If__JjAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2880:1: ( ( rule__If__JjAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2880:1: ( ( rule__If__JjAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2881:1: ( rule__If__JjAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getJjAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2882:1: ( rule__If__JjAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2882:2: rule__If__JjAssignment_2
            {
            pushFollow(FOLLOW_rule__If__JjAssignment_2_in_rule__If__Group__2__Impl5879);
            rule__If__JjAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getJjAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2892:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2896:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2897:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35909);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__35912);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2904:1: rule__If__Group__3__Impl : ( ( rule__If__KkAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2908:1: ( ( ( rule__If__KkAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2909:1: ( ( rule__If__KkAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2909:1: ( ( rule__If__KkAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2910:1: ( rule__If__KkAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getKkAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2911:1: ( rule__If__KkAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2911:2: rule__If__KkAssignment_3
            {
            pushFollow(FOLLOW_rule__If__KkAssignment_3_in_rule__If__Group__3__Impl5939);
            rule__If__KkAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getKkAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2921:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2925:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2926:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45969);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__45972);
            rule__If__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2933:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2937:1: ( ( 'then' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2938:1: ( 'then' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2938:1: ( 'then' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2939:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__If__Group__4__Impl6000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2952:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2956:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2957:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56031);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__56034);
            rule__If__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2964:1: rule__If__Group__5__Impl : ( ( rule__If__HgAssignment_5 ) ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2968:1: ( ( ( rule__If__HgAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2969:1: ( ( rule__If__HgAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2969:1: ( ( rule__If__HgAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2970:1: ( rule__If__HgAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getHgAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2971:1: ( rule__If__HgAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2971:2: rule__If__HgAssignment_5
            {
            pushFollow(FOLLOW_rule__If__HgAssignment_5_in_rule__If__Group__5__Impl6061);
            rule__If__HgAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getHgAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2981:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2985:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2986:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66091);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__66094);
            rule__If__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2993:1: rule__If__Group__6__Impl : ( ( rule__If__C2Assignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2997:1: ( ( ( rule__If__C2Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2998:1: ( ( rule__If__C2Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2998:1: ( ( rule__If__C2Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2999:1: ( rule__If__C2Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getC2Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3000:1: ( rule__If__C2Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3000:2: rule__If__C2Assignment_6
            {
            pushFollow(FOLLOW_rule__If__C2Assignment_6_in_rule__If__Group__6__Impl6121);
            rule__If__C2Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getC2Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3010:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3014:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3015:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76151);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__76154);
            rule__If__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3022:1: rule__If__Group__7__Impl : ( ( rule__If__GgAssignment_7 ) ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3026:1: ( ( ( rule__If__GgAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3027:1: ( ( rule__If__GgAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3027:1: ( ( rule__If__GgAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3028:1: ( rule__If__GgAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGgAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3029:1: ( rule__If__GgAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3029:2: rule__If__GgAssignment_7
            {
            pushFollow(FOLLOW_rule__If__GgAssignment_7_in_rule__If__Group__7__Impl6181);
            rule__If__GgAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGgAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3039:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3043:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3044:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86211);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__86214);
            rule__If__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3051:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3055:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3056:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3056:1: ( ( rule__If__Group_8__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3057:1: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3058:1: ( rule__If__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3058:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6241);
                    rule__If__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group__9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3068:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3072:1: ( rule__If__Group__9__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3073:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96272);
            rule__If__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__9"


    // $ANTLR start "rule__If__Group__9__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3079:1: rule__If__Group__9__Impl : ( 'fi' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3083:1: ( ( 'fi' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3084:1: ( 'fi' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3084:1: ( 'fi' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3085:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__9__Impl6300); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__9__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3118:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3122:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3123:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06351);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06354);
            rule__If__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3130:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3134:1: ( ( 'else' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3135:1: ( 'else' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3135:1: ( 'else' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3136:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group_8__0__Impl6382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3149:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3153:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3154:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16413);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16416);
            rule__If__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3161:1: rule__If__Group_8__1__Impl : ( ( rule__If__FfAssignment_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3165:1: ( ( ( rule__If__FfAssignment_8_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3166:1: ( ( rule__If__FfAssignment_8_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3166:1: ( ( rule__If__FfAssignment_8_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3167:1: ( rule__If__FfAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFfAssignment_8_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3168:1: ( rule__If__FfAssignment_8_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3168:2: rule__If__FfAssignment_8_1
            {
            pushFollow(FOLLOW_rule__If__FfAssignment_8_1_in_rule__If__Group_8__1__Impl6443);
            rule__If__FfAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getFfAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3178:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3182:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3183:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26473);
            rule__If__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26476);
            rule__If__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2"


    // $ANTLR start "rule__If__Group_8__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3190:1: rule__If__Group_8__2__Impl : ( ( rule__If__OAssignment_8_2 ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3194:1: ( ( ( rule__If__OAssignment_8_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3195:1: ( ( rule__If__OAssignment_8_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3195:1: ( ( rule__If__OAssignment_8_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3196:1: ( rule__If__OAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOAssignment_8_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3197:1: ( rule__If__OAssignment_8_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3197:2: rule__If__OAssignment_8_2
            {
            pushFollow(FOLLOW_rule__If__OAssignment_8_2_in_rule__If__Group_8__2__Impl6503);
            rule__If__OAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2__Impl"


    // $ANTLR start "rule__If__Group_8__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3207:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3211:1: ( rule__If__Group_8__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3212:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36533);
            rule__If__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3"


    // $ANTLR start "rule__If__Group_8__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3218:1: rule__If__Group_8__3__Impl : ( ( rule__If__DdAssignment_8_3 ) ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3222:1: ( ( ( rule__If__DdAssignment_8_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3223:1: ( ( rule__If__DdAssignment_8_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3223:1: ( ( rule__If__DdAssignment_8_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3224:1: ( rule__If__DdAssignment_8_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getDdAssignment_8_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3225:1: ( rule__If__DdAssignment_8_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3225:2: rule__If__DdAssignment_8_3
            {
            pushFollow(FOLLOW_rule__If__DdAssignment_8_3_in_rule__If__Group_8__3__Impl6560);
            rule__If__DdAssignment_8_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getDdAssignment_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3__Impl"


    // $ANTLR start "rule__Foreach__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3243:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3247:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3248:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06598);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06601);
            rule__Foreach__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__0"


    // $ANTLR start "rule__Foreach__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3255:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3259:1: ( ( 'foreach' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3260:1: ( 'foreach' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3260:1: ( 'foreach' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3261:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Foreach__Group__0__Impl6629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__0__Impl"


    // $ANTLR start "rule__Foreach__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3274:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3278:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3279:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16660);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16663);
            rule__Foreach__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__1"


    // $ANTLR start "rule__Foreach__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3286:1: rule__Foreach__Group__1__Impl : ( ( rule__Foreach__SqAssignment_1 ) ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3290:1: ( ( ( rule__Foreach__SqAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3291:1: ( ( rule__Foreach__SqAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3291:1: ( ( rule__Foreach__SqAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3292:1: ( rule__Foreach__SqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getSqAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3293:1: ( rule__Foreach__SqAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3293:2: rule__Foreach__SqAssignment_1
            {
            pushFollow(FOLLOW_rule__Foreach__SqAssignment_1_in_rule__Foreach__Group__1__Impl6690);
            rule__Foreach__SqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getSqAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__1__Impl"


    // $ANTLR start "rule__Foreach__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3303:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3307:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3308:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26720);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26723);
            rule__Foreach__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__2"


    // $ANTLR start "rule__Foreach__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3315:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__WxAssignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3319:1: ( ( ( rule__Foreach__WxAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3320:1: ( ( rule__Foreach__WxAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3320:1: ( ( rule__Foreach__WxAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3321:1: ( rule__Foreach__WxAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getWxAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3322:1: ( rule__Foreach__WxAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3322:2: rule__Foreach__WxAssignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__WxAssignment_2_in_rule__Foreach__Group__2__Impl6750);
            rule__Foreach__WxAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getWxAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__2__Impl"


    // $ANTLR start "rule__Foreach__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3332:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3336:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3337:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36780);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36783);
            rule__Foreach__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__3"


    // $ANTLR start "rule__Foreach__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3344:1: rule__Foreach__Group__3__Impl : ( ( rule__Foreach__LcAssignment_3 ) ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3348:1: ( ( ( rule__Foreach__LcAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3349:1: ( ( rule__Foreach__LcAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3349:1: ( ( rule__Foreach__LcAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3350:1: ( rule__Foreach__LcAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLcAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3351:1: ( rule__Foreach__LcAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3351:2: rule__Foreach__LcAssignment_3
            {
            pushFollow(FOLLOW_rule__Foreach__LcAssignment_3_in_rule__Foreach__Group__3__Impl6810);
            rule__Foreach__LcAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLcAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__3__Impl"


    // $ANTLR start "rule__Foreach__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3361:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3365:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3366:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46840);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46843);
            rule__Foreach__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__4"


    // $ANTLR start "rule__Foreach__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3373:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3377:1: ( ( 'in' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3378:1: ( 'in' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3378:1: ( 'in' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3379:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Foreach__Group__4__Impl6871); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__4__Impl"


    // $ANTLR start "rule__Foreach__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3392:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3396:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3397:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56902);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56905);
            rule__Foreach__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__5"


    // $ANTLR start "rule__Foreach__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3404:1: rule__Foreach__Group__5__Impl : ( ( rule__Foreach__Lc2Assignment_5 ) ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3408:1: ( ( ( rule__Foreach__Lc2Assignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3409:1: ( ( rule__Foreach__Lc2Assignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3409:1: ( ( rule__Foreach__Lc2Assignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3410:1: ( rule__Foreach__Lc2Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc2Assignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3411:1: ( rule__Foreach__Lc2Assignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3411:2: rule__Foreach__Lc2Assignment_5
            {
            pushFollow(FOLLOW_rule__Foreach__Lc2Assignment_5_in_rule__Foreach__Group__5__Impl6932);
            rule__Foreach__Lc2Assignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc2Assignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__5__Impl"


    // $ANTLR start "rule__Foreach__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3421:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3425:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3426:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66962);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66965);
            rule__Foreach__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__6"


    // $ANTLR start "rule__Foreach__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3433:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__E1Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3437:1: ( ( ( rule__Foreach__E1Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3438:1: ( ( rule__Foreach__E1Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3438:1: ( ( rule__Foreach__E1Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3439:1: ( rule__Foreach__E1Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getE1Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3440:1: ( rule__Foreach__E1Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3440:2: rule__Foreach__E1Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__E1Assignment_6_in_rule__Foreach__Group__6__Impl6992);
            rule__Foreach__E1Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getE1Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__6__Impl"


    // $ANTLR start "rule__Foreach__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3450:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3454:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3455:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__77022);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__77025);
            rule__Foreach__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__7"


    // $ANTLR start "rule__Foreach__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3462:1: rule__Foreach__Group__7__Impl : ( ( rule__Foreach__Lc3Assignment_7 ) ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3466:1: ( ( ( rule__Foreach__Lc3Assignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3467:1: ( ( rule__Foreach__Lc3Assignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3467:1: ( ( rule__Foreach__Lc3Assignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3468:1: ( rule__Foreach__Lc3Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc3Assignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3469:1: ( rule__Foreach__Lc3Assignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3469:2: rule__Foreach__Lc3Assignment_7
            {
            pushFollow(FOLLOW_rule__Foreach__Lc3Assignment_7_in_rule__Foreach__Group__7__Impl7052);
            rule__Foreach__Lc3Assignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc3Assignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__7__Impl"


    // $ANTLR start "rule__Foreach__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3479:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3483:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3484:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87082);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87085);
            rule__Foreach__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__8"


    // $ANTLR start "rule__Foreach__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3491:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3495:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3496:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3496:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3497:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Foreach__Group__8__Impl7113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__8__Impl"


    // $ANTLR start "rule__Foreach__Group__9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3510:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3514:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3515:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97144);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97147);
            rule__Foreach__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__9"


    // $ANTLR start "rule__Foreach__Group__9__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3522:1: rule__Foreach__Group__9__Impl : ( ( rule__Foreach__Lc4Assignment_9 ) ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3526:1: ( ( ( rule__Foreach__Lc4Assignment_9 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3527:1: ( ( rule__Foreach__Lc4Assignment_9 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3527:1: ( ( rule__Foreach__Lc4Assignment_9 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3528:1: ( rule__Foreach__Lc4Assignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc4Assignment_9()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3529:1: ( rule__Foreach__Lc4Assignment_9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3529:2: rule__Foreach__Lc4Assignment_9
            {
            pushFollow(FOLLOW_rule__Foreach__Lc4Assignment_9_in_rule__Foreach__Group__9__Impl7174);
            rule__Foreach__Lc4Assignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc4Assignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__9__Impl"


    // $ANTLR start "rule__Foreach__Group__10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3539:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3543:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3544:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107204);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107207);
            rule__Foreach__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__10"


    // $ANTLR start "rule__Foreach__Group__10__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3551:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__C3Assignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3555:1: ( ( ( rule__Foreach__C3Assignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3556:1: ( ( rule__Foreach__C3Assignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3556:1: ( ( rule__Foreach__C3Assignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3557:1: ( rule__Foreach__C3Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getC3Assignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3558:1: ( rule__Foreach__C3Assignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3558:2: rule__Foreach__C3Assignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__C3Assignment_10_in_rule__Foreach__Group__10__Impl7234);
            rule__Foreach__C3Assignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getC3Assignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__10__Impl"


    // $ANTLR start "rule__Foreach__Group__11"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3568:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3572:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3573:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117264);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117267);
            rule__Foreach__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__11"


    // $ANTLR start "rule__Foreach__Group__11__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3580:1: rule__Foreach__Group__11__Impl : ( ( rule__Foreach__Lc5Assignment_11 ) ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3584:1: ( ( ( rule__Foreach__Lc5Assignment_11 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3585:1: ( ( rule__Foreach__Lc5Assignment_11 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3585:1: ( ( rule__Foreach__Lc5Assignment_11 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3586:1: ( rule__Foreach__Lc5Assignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc5Assignment_11()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3587:1: ( rule__Foreach__Lc5Assignment_11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3587:2: rule__Foreach__Lc5Assignment_11
            {
            pushFollow(FOLLOW_rule__Foreach__Lc5Assignment_11_in_rule__Foreach__Group__11__Impl7294);
            rule__Foreach__Lc5Assignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc5Assignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__11__Impl"


    // $ANTLR start "rule__Foreach__Group__12"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3597:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3601:1: ( rule__Foreach__Group__12__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3602:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127324);
            rule__Foreach__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__12"


    // $ANTLR start "rule__Foreach__Group__12__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3608:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3612:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3613:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3613:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3614:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,30,FOLLOW_30_in_rule__Foreach__Group__12__Impl7352); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__12__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3653:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3657:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3658:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07409);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07412);
            rule__Vars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3665:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__AAssignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3669:1: ( ( ( rule__Vars__AAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3670:1: ( ( rule__Vars__AAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3670:1: ( ( rule__Vars__AAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3671:1: ( rule__Vars__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getAAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3672:1: ( rule__Vars__AAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3672:2: rule__Vars__AAssignment_0
            {
            pushFollow(FOLLOW_rule__Vars__AAssignment_0_in_rule__Vars__Group__0__Impl7439);
            rule__Vars__AAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getAAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3682:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3686:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3687:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17469);
            rule__Vars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3693:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3697:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3698:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3698:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3699:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3700:1: ( rule__Vars__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3700:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7496);
                    rule__Vars__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3714:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3718:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3719:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07531);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07534);
            rule__Vars__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0"


    // $ANTLR start "rule__Vars__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3726:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3730:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3731:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3731:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3732:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vars__Group_1__0__Impl7562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0__Impl"


    // $ANTLR start "rule__Vars__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3745:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3749:1: ( rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3750:2: rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17593);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__17596);
            rule__Vars__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1"


    // $ANTLR start "rule__Vars__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3757:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__LAssignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3761:1: ( ( ( rule__Vars__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3762:1: ( ( rule__Vars__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3762:1: ( ( rule__Vars__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3763:1: ( rule__Vars__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3764:1: ( rule__Vars__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3764:2: rule__Vars__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__LAssignment_1_1_in_rule__Vars__Group_1__1__Impl7623);
            rule__Vars__LAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3774:1: rule__Vars__Group_1__2 : rule__Vars__Group_1__2__Impl ;
    public final void rule__Vars__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3778:1: ( rule__Vars__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3779:2: rule__Vars__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__27653);
            rule__Vars__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__2"


    // $ANTLR start "rule__Vars__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3785:1: rule__Vars__Group_1__2__Impl : ( ( rule__Vars__UAssignment_1_2 ) ) ;
    public final void rule__Vars__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3789:1: ( ( ( rule__Vars__UAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3790:1: ( ( rule__Vars__UAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3790:1: ( ( rule__Vars__UAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3791:1: ( rule__Vars__UAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getUAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3792:1: ( rule__Vars__UAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3792:2: rule__Vars__UAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Vars__UAssignment_1_2_in_rule__Vars__Group_1__2__Impl7680);
            rule__Vars__UAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getUAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__2__Impl"


    // $ANTLR start "rule__EXPRS__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3808:1: rule__EXPRS__Group__0 : rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1 ;
    public final void rule__EXPRS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3812:1: ( rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3813:2: rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__0__Impl_in_rule__EXPRS__Group__07716);
            rule__EXPRS__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group__1_in_rule__EXPRS__Group__07719);
            rule__EXPRS__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group__0"


    // $ANTLR start "rule__EXPRS__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3820:1: rule__EXPRS__Group__0__Impl : ( ( rule__EXPRS__FAssignment_0 ) ) ;
    public final void rule__EXPRS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3824:1: ( ( ( rule__EXPRS__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3825:1: ( ( rule__EXPRS__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3825:1: ( ( rule__EXPRS__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3826:1: ( rule__EXPRS__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3827:1: ( rule__EXPRS__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3827:2: rule__EXPRS__FAssignment_0
            {
            pushFollow(FOLLOW_rule__EXPRS__FAssignment_0_in_rule__EXPRS__Group__0__Impl7746);
            rule__EXPRS__FAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getFAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group__0__Impl"


    // $ANTLR start "rule__EXPRS__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3837:1: rule__EXPRS__Group__1 : rule__EXPRS__Group__1__Impl ;
    public final void rule__EXPRS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3841:1: ( rule__EXPRS__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3842:2: rule__EXPRS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__1__Impl_in_rule__EXPRS__Group__17776);
            rule__EXPRS__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group__1"


    // $ANTLR start "rule__EXPRS__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3848:1: rule__EXPRS__Group__1__Impl : ( ( rule__EXPRS__Group_1__0 )? ) ;
    public final void rule__EXPRS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3852:1: ( ( ( rule__EXPRS__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3853:1: ( ( rule__EXPRS__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3853:1: ( ( rule__EXPRS__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3854:1: ( rule__EXPRS__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3855:1: ( rule__EXPRS__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3855:2: rule__EXPRS__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPRS__Group_1__0_in_rule__EXPRS__Group__1__Impl7803);
                    rule__EXPRS__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group__1__Impl"


    // $ANTLR start "rule__EXPRS__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3869:1: rule__EXPRS__Group_1__0 : rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1 ;
    public final void rule__EXPRS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3873:1: ( rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3874:2: rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__0__Impl_in_rule__EXPRS__Group_1__07838);
            rule__EXPRS__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group_1__1_in_rule__EXPRS__Group_1__07841);
            rule__EXPRS__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__0"


    // $ANTLR start "rule__EXPRS__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3881:1: rule__EXPRS__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EXPRS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3885:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3886:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3886:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3887:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__EXPRS__Group_1__0__Impl7869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__0__Impl"


    // $ANTLR start "rule__EXPRS__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3900:1: rule__EXPRS__Group_1__1 : rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2 ;
    public final void rule__EXPRS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3904:1: ( rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3905:2: rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__1__Impl_in_rule__EXPRS__Group_1__17900);
            rule__EXPRS__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group_1__2_in_rule__EXPRS__Group_1__17903);
            rule__EXPRS__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__1"


    // $ANTLR start "rule__EXPRS__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3912:1: rule__EXPRS__Group_1__1__Impl : ( ( rule__EXPRS__LAssignment_1_1 ) ) ;
    public final void rule__EXPRS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3916:1: ( ( ( rule__EXPRS__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3917:1: ( ( rule__EXPRS__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3917:1: ( ( rule__EXPRS__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3918:1: ( rule__EXPRS__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3919:1: ( rule__EXPRS__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3919:2: rule__EXPRS__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EXPRS__LAssignment_1_1_in_rule__EXPRS__Group_1__1__Impl7930);
            rule__EXPRS__LAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__1__Impl"


    // $ANTLR start "rule__EXPRS__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3929:1: rule__EXPRS__Group_1__2 : rule__EXPRS__Group_1__2__Impl ;
    public final void rule__EXPRS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3933:1: ( rule__EXPRS__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3934:2: rule__EXPRS__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__2__Impl_in_rule__EXPRS__Group_1__27960);
            rule__EXPRS__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__2"


    // $ANTLR start "rule__EXPRS__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3940:1: rule__EXPRS__Group_1__2__Impl : ( ( rule__EXPRS__E2Assignment_1_2 ) ) ;
    public final void rule__EXPRS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3944:1: ( ( ( rule__EXPRS__E2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3945:1: ( ( rule__EXPRS__E2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3945:1: ( ( rule__EXPRS__E2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3946:1: ( rule__EXPRS__E2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getE2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3947:1: ( rule__EXPRS__E2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3947:2: rule__EXPRS__E2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPRS__E2Assignment_1_2_in_rule__EXPRS__Group_1__2__Impl7987);
            rule__EXPRS__E2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getE2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__Group_1__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3963:1: rule__EXPRSIMPLE__Group_1__0 : rule__EXPRSIMPLE__Group_1__0__Impl rule__EXPRSIMPLE__Group_1__1 ;
    public final void rule__EXPRSIMPLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3967:1: ( rule__EXPRSIMPLE__Group_1__0__Impl rule__EXPRSIMPLE__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3968:2: rule__EXPRSIMPLE__Group_1__0__Impl rule__EXPRSIMPLE__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__0__Impl_in_rule__EXPRSIMPLE__Group_1__08023);
            rule__EXPRSIMPLE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__1_in_rule__EXPRSIMPLE__Group_1__08026);
            rule__EXPRSIMPLE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__0"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3975:1: rule__EXPRSIMPLE__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3979:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3980:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3980:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3981:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPRSIMPLE__Group_1__0__Impl8054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__0__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3994:1: rule__EXPRSIMPLE__Group_1__1 : rule__EXPRSIMPLE__Group_1__1__Impl rule__EXPRSIMPLE__Group_1__2 ;
    public final void rule__EXPRSIMPLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3998:1: ( rule__EXPRSIMPLE__Group_1__1__Impl rule__EXPRSIMPLE__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3999:2: rule__EXPRSIMPLE__Group_1__1__Impl rule__EXPRSIMPLE__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__1__Impl_in_rule__EXPRSIMPLE__Group_1__18085);
            rule__EXPRSIMPLE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__2_in_rule__EXPRSIMPLE__Group_1__18088);
            rule__EXPRSIMPLE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__1"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4006:1: rule__EXPRSIMPLE__Group_1__1__Impl : ( 'cons' ) ;
    public final void rule__EXPRSIMPLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4010:1: ( ( 'cons' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4011:1: ( 'cons' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4011:1: ( 'cons' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4012:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getConsKeyword_1_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__EXPRSIMPLE__Group_1__1__Impl8116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getConsKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__1__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4025:1: rule__EXPRSIMPLE__Group_1__2 : rule__EXPRSIMPLE__Group_1__2__Impl rule__EXPRSIMPLE__Group_1__3 ;
    public final void rule__EXPRSIMPLE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4029:1: ( rule__EXPRSIMPLE__Group_1__2__Impl rule__EXPRSIMPLE__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4030:2: rule__EXPRSIMPLE__Group_1__2__Impl rule__EXPRSIMPLE__Group_1__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__2__Impl_in_rule__EXPRSIMPLE__Group_1__28147);
            rule__EXPRSIMPLE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__3_in_rule__EXPRSIMPLE__Group_1__28150);
            rule__EXPRSIMPLE__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__2"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4037:1: rule__EXPRSIMPLE__Group_1__2__Impl : ( ( rule__EXPRSIMPLE__YyAssignment_1_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4041:1: ( ( ( rule__EXPRSIMPLE__YyAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4042:1: ( ( rule__EXPRSIMPLE__YyAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4042:1: ( ( rule__EXPRSIMPLE__YyAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4043:1: ( rule__EXPRSIMPLE__YyAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getYyAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4044:1: ( rule__EXPRSIMPLE__YyAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4044:2: rule__EXPRSIMPLE__YyAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__YyAssignment_1_2_in_rule__EXPRSIMPLE__Group_1__2__Impl8177);
            rule__EXPRSIMPLE__YyAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getYyAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4054:1: rule__EXPRSIMPLE__Group_1__3 : rule__EXPRSIMPLE__Group_1__3__Impl ;
    public final void rule__EXPRSIMPLE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4058:1: ( rule__EXPRSIMPLE__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4059:2: rule__EXPRSIMPLE__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_1__3__Impl_in_rule__EXPRSIMPLE__Group_1__38207);
            rule__EXPRSIMPLE__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__3"


    // $ANTLR start "rule__EXPRSIMPLE__Group_1__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4065:1: rule__EXPRSIMPLE__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4069:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4070:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4070:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4071:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPRSIMPLE__Group_1__3__Impl8235); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_1__3__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4092:1: rule__EXPRSIMPLE__Group_2__0 : rule__EXPRSIMPLE__Group_2__0__Impl rule__EXPRSIMPLE__Group_2__1 ;
    public final void rule__EXPRSIMPLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4096:1: ( rule__EXPRSIMPLE__Group_2__0__Impl rule__EXPRSIMPLE__Group_2__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4097:2: rule__EXPRSIMPLE__Group_2__0__Impl rule__EXPRSIMPLE__Group_2__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__0__Impl_in_rule__EXPRSIMPLE__Group_2__08274);
            rule__EXPRSIMPLE__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__1_in_rule__EXPRSIMPLE__Group_2__08277);
            rule__EXPRSIMPLE__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__0"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4104:1: rule__EXPRSIMPLE__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4108:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4109:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4109:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4110:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPRSIMPLE__Group_2__0__Impl8305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__0__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4123:1: rule__EXPRSIMPLE__Group_2__1 : rule__EXPRSIMPLE__Group_2__1__Impl rule__EXPRSIMPLE__Group_2__2 ;
    public final void rule__EXPRSIMPLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4127:1: ( rule__EXPRSIMPLE__Group_2__1__Impl rule__EXPRSIMPLE__Group_2__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4128:2: rule__EXPRSIMPLE__Group_2__1__Impl rule__EXPRSIMPLE__Group_2__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__1__Impl_in_rule__EXPRSIMPLE__Group_2__18336);
            rule__EXPRSIMPLE__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__2_in_rule__EXPRSIMPLE__Group_2__18339);
            rule__EXPRSIMPLE__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__1"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4135:1: rule__EXPRSIMPLE__Group_2__1__Impl : ( 'list' ) ;
    public final void rule__EXPRSIMPLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4139:1: ( ( 'list' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4140:1: ( 'list' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4140:1: ( 'list' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4141:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getListKeyword_2_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__EXPRSIMPLE__Group_2__1__Impl8367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getListKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__1__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4154:1: rule__EXPRSIMPLE__Group_2__2 : rule__EXPRSIMPLE__Group_2__2__Impl rule__EXPRSIMPLE__Group_2__3 ;
    public final void rule__EXPRSIMPLE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4158:1: ( rule__EXPRSIMPLE__Group_2__2__Impl rule__EXPRSIMPLE__Group_2__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4159:2: rule__EXPRSIMPLE__Group_2__2__Impl rule__EXPRSIMPLE__Group_2__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__2__Impl_in_rule__EXPRSIMPLE__Group_2__28398);
            rule__EXPRSIMPLE__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__3_in_rule__EXPRSIMPLE__Group_2__28401);
            rule__EXPRSIMPLE__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__2"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4166:1: rule__EXPRSIMPLE__Group_2__2__Impl : ( ( rule__EXPRSIMPLE__BAssignment_2_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4170:1: ( ( ( rule__EXPRSIMPLE__BAssignment_2_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4171:1: ( ( rule__EXPRSIMPLE__BAssignment_2_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4171:1: ( ( rule__EXPRSIMPLE__BAssignment_2_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4172:1: ( rule__EXPRSIMPLE__BAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getBAssignment_2_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4173:1: ( rule__EXPRSIMPLE__BAssignment_2_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4173:2: rule__EXPRSIMPLE__BAssignment_2_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__BAssignment_2_2_in_rule__EXPRSIMPLE__Group_2__2__Impl8428);
            rule__EXPRSIMPLE__BAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getBAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4183:1: rule__EXPRSIMPLE__Group_2__3 : rule__EXPRSIMPLE__Group_2__3__Impl ;
    public final void rule__EXPRSIMPLE__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4187:1: ( rule__EXPRSIMPLE__Group_2__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4188:2: rule__EXPRSIMPLE__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_2__3__Impl_in_rule__EXPRSIMPLE__Group_2__38458);
            rule__EXPRSIMPLE__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__3"


    // $ANTLR start "rule__EXPRSIMPLE__Group_2__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4194:1: rule__EXPRSIMPLE__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4198:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4199:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4199:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4200:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPRSIMPLE__Group_2__3__Impl8486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_2__3__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4221:1: rule__EXPRSIMPLE__Group_3__0 : rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1 ;
    public final void rule__EXPRSIMPLE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4225:1: ( rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4226:2: rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__0__Impl_in_rule__EXPRSIMPLE__Group_3__08525);
            rule__EXPRSIMPLE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__1_in_rule__EXPRSIMPLE__Group_3__08528);
            rule__EXPRSIMPLE__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__0"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4233:1: rule__EXPRSIMPLE__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4237:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4238:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4238:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4239:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPRSIMPLE__Group_3__0__Impl8556); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__0__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4252:1: rule__EXPRSIMPLE__Group_3__1 : rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2 ;
    public final void rule__EXPRSIMPLE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4256:1: ( rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4257:2: rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__1__Impl_in_rule__EXPRSIMPLE__Group_3__18587);
            rule__EXPRSIMPLE__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__2_in_rule__EXPRSIMPLE__Group_3__18590);
            rule__EXPRSIMPLE__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__1"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4264:1: rule__EXPRSIMPLE__Group_3__1__Impl : ( 'hd' ) ;
    public final void rule__EXPRSIMPLE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4268:1: ( ( 'hd' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4269:1: ( 'hd' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4269:1: ( 'hd' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4270:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getHdKeyword_3_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__EXPRSIMPLE__Group_3__1__Impl8618); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getHdKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__1__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4283:1: rule__EXPRSIMPLE__Group_3__2 : rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3 ;
    public final void rule__EXPRSIMPLE__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4287:1: ( rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4288:2: rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__2__Impl_in_rule__EXPRSIMPLE__Group_3__28649);
            rule__EXPRSIMPLE__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__3_in_rule__EXPRSIMPLE__Group_3__28652);
            rule__EXPRSIMPLE__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__2"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4295:1: rule__EXPRSIMPLE__Group_3__2__Impl : ( ( rule__EXPRSIMPLE__UAssignment_3_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4299:1: ( ( ( rule__EXPRSIMPLE__UAssignment_3_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4300:1: ( ( rule__EXPRSIMPLE__UAssignment_3_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4300:1: ( ( rule__EXPRSIMPLE__UAssignment_3_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4301:1: ( rule__EXPRSIMPLE__UAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getUAssignment_3_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4302:1: ( rule__EXPRSIMPLE__UAssignment_3_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4302:2: rule__EXPRSIMPLE__UAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__UAssignment_3_2_in_rule__EXPRSIMPLE__Group_3__2__Impl8679);
            rule__EXPRSIMPLE__UAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getUAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4312:1: rule__EXPRSIMPLE__Group_3__3 : rule__EXPRSIMPLE__Group_3__3__Impl rule__EXPRSIMPLE__Group_3__4 ;
    public final void rule__EXPRSIMPLE__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4316:1: ( rule__EXPRSIMPLE__Group_3__3__Impl rule__EXPRSIMPLE__Group_3__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4317:2: rule__EXPRSIMPLE__Group_3__3__Impl rule__EXPRSIMPLE__Group_3__4
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__3__Impl_in_rule__EXPRSIMPLE__Group_3__38709);
            rule__EXPRSIMPLE__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__4_in_rule__EXPRSIMPLE__Group_3__38712);
            rule__EXPRSIMPLE__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__3"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4324:1: rule__EXPRSIMPLE__Group_3__3__Impl : ( ( rule__EXPRSIMPLE__GAssignment_3_3 ) ) ;
    public final void rule__EXPRSIMPLE__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4328:1: ( ( ( rule__EXPRSIMPLE__GAssignment_3_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4329:1: ( ( rule__EXPRSIMPLE__GAssignment_3_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4329:1: ( ( rule__EXPRSIMPLE__GAssignment_3_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4330:1: ( rule__EXPRSIMPLE__GAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getGAssignment_3_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4331:1: ( rule__EXPRSIMPLE__GAssignment_3_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4331:2: rule__EXPRSIMPLE__GAssignment_3_3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__GAssignment_3_3_in_rule__EXPRSIMPLE__Group_3__3__Impl8739);
            rule__EXPRSIMPLE__GAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getGAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__3__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4341:1: rule__EXPRSIMPLE__Group_3__4 : rule__EXPRSIMPLE__Group_3__4__Impl ;
    public final void rule__EXPRSIMPLE__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4345:1: ( rule__EXPRSIMPLE__Group_3__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4346:2: rule__EXPRSIMPLE__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__4__Impl_in_rule__EXPRSIMPLE__Group_3__48769);
            rule__EXPRSIMPLE__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__4"


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4352:1: rule__EXPRSIMPLE__Group_3__4__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4356:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4357:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4357:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4358:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPRSIMPLE__Group_3__4__Impl8797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_3__4__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4381:1: rule__EXPRSIMPLE__Group_4__0 : rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1 ;
    public final void rule__EXPRSIMPLE__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4385:1: ( rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4386:2: rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__0__Impl_in_rule__EXPRSIMPLE__Group_4__08838);
            rule__EXPRSIMPLE__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__1_in_rule__EXPRSIMPLE__Group_4__08841);
            rule__EXPRSIMPLE__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__0"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4393:1: rule__EXPRSIMPLE__Group_4__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4397:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4398:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4398:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4399:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPRSIMPLE__Group_4__0__Impl8869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__0__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4412:1: rule__EXPRSIMPLE__Group_4__1 : rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2 ;
    public final void rule__EXPRSIMPLE__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4416:1: ( rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4417:2: rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__1__Impl_in_rule__EXPRSIMPLE__Group_4__18900);
            rule__EXPRSIMPLE__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__2_in_rule__EXPRSIMPLE__Group_4__18903);
            rule__EXPRSIMPLE__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__1"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4424:1: rule__EXPRSIMPLE__Group_4__1__Impl : ( 'tl' ) ;
    public final void rule__EXPRSIMPLE__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4428:1: ( ( 'tl' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4429:1: ( 'tl' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4429:1: ( 'tl' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4430:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getTlKeyword_4_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__EXPRSIMPLE__Group_4__1__Impl8931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getTlKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__1__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4443:1: rule__EXPRSIMPLE__Group_4__2 : rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3 ;
    public final void rule__EXPRSIMPLE__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4447:1: ( rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4448:2: rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__2__Impl_in_rule__EXPRSIMPLE__Group_4__28962);
            rule__EXPRSIMPLE__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__3_in_rule__EXPRSIMPLE__Group_4__28965);
            rule__EXPRSIMPLE__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__2"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4455:1: rule__EXPRSIMPLE__Group_4__2__Impl : ( ruleLCs ) ;
    public final void rule__EXPRSIMPLE__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4459:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4460:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4460:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4461:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLCsParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__Group_4__2__Impl8992);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLCsParserRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4472:1: rule__EXPRSIMPLE__Group_4__3 : rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4 ;
    public final void rule__EXPRSIMPLE__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4476:1: ( rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4477:2: rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__3__Impl_in_rule__EXPRSIMPLE__Group_4__39021);
            rule__EXPRSIMPLE__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__4_in_rule__EXPRSIMPLE__Group_4__39024);
            rule__EXPRSIMPLE__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__3"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4484:1: rule__EXPRSIMPLE__Group_4__3__Impl : ( ( rule__EXPRSIMPLE__NAssignment_4_3 ) ) ;
    public final void rule__EXPRSIMPLE__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4488:1: ( ( ( rule__EXPRSIMPLE__NAssignment_4_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4489:1: ( ( rule__EXPRSIMPLE__NAssignment_4_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4489:1: ( ( rule__EXPRSIMPLE__NAssignment_4_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4490:1: ( rule__EXPRSIMPLE__NAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getNAssignment_4_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4491:1: ( rule__EXPRSIMPLE__NAssignment_4_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4491:2: rule__EXPRSIMPLE__NAssignment_4_3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__NAssignment_4_3_in_rule__EXPRSIMPLE__Group_4__3__Impl9051);
            rule__EXPRSIMPLE__NAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getNAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__3__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4501:1: rule__EXPRSIMPLE__Group_4__4 : rule__EXPRSIMPLE__Group_4__4__Impl ;
    public final void rule__EXPRSIMPLE__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4505:1: ( rule__EXPRSIMPLE__Group_4__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4506:2: rule__EXPRSIMPLE__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__4__Impl_in_rule__EXPRSIMPLE__Group_4__49081);
            rule__EXPRSIMPLE__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__4"


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4512:1: rule__EXPRSIMPLE__Group_4__4__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4516:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4517:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4517:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4518:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPRSIMPLE__Group_4__4__Impl9109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_4__4__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4541:1: rule__EXPRSIMPLE__Group_5__0 : rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1 ;
    public final void rule__EXPRSIMPLE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4545:1: ( rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4546:2: rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__0__Impl_in_rule__EXPRSIMPLE__Group_5__09150);
            rule__EXPRSIMPLE__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__1_in_rule__EXPRSIMPLE__Group_5__09153);
            rule__EXPRSIMPLE__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__0"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4553:1: rule__EXPRSIMPLE__Group_5__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4557:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4558:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4558:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4559:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPRSIMPLE__Group_5__0__Impl9181); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__0__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4572:1: rule__EXPRSIMPLE__Group_5__1 : rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2 ;
    public final void rule__EXPRSIMPLE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4576:1: ( rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4577:2: rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__1__Impl_in_rule__EXPRSIMPLE__Group_5__19212);
            rule__EXPRSIMPLE__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__2_in_rule__EXPRSIMPLE__Group_5__19215);
            rule__EXPRSIMPLE__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__1"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4584:1: rule__EXPRSIMPLE__Group_5__1__Impl : ( ( rule__EXPRSIMPLE__VAssignment_5_1 ) ) ;
    public final void rule__EXPRSIMPLE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4588:1: ( ( ( rule__EXPRSIMPLE__VAssignment_5_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4589:1: ( ( rule__EXPRSIMPLE__VAssignment_5_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4589:1: ( ( rule__EXPRSIMPLE__VAssignment_5_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4590:1: ( rule__EXPRSIMPLE__VAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getVAssignment_5_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4591:1: ( rule__EXPRSIMPLE__VAssignment_5_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4591:2: rule__EXPRSIMPLE__VAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__VAssignment_5_1_in_rule__EXPRSIMPLE__Group_5__1__Impl9242);
            rule__EXPRSIMPLE__VAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getVAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__1__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4601:1: rule__EXPRSIMPLE__Group_5__2 : rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3 ;
    public final void rule__EXPRSIMPLE__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4605:1: ( rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4606:2: rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__2__Impl_in_rule__EXPRSIMPLE__Group_5__29272);
            rule__EXPRSIMPLE__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__3_in_rule__EXPRSIMPLE__Group_5__29275);
            rule__EXPRSIMPLE__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__2"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4613:1: rule__EXPRSIMPLE__Group_5__2__Impl : ( ( rule__EXPRSIMPLE__WAssignment_5_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4617:1: ( ( ( rule__EXPRSIMPLE__WAssignment_5_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4618:1: ( ( rule__EXPRSIMPLE__WAssignment_5_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4618:1: ( ( rule__EXPRSIMPLE__WAssignment_5_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4619:1: ( rule__EXPRSIMPLE__WAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getWAssignment_5_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4620:1: ( rule__EXPRSIMPLE__WAssignment_5_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4620:2: rule__EXPRSIMPLE__WAssignment_5_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__WAssignment_5_2_in_rule__EXPRSIMPLE__Group_5__2__Impl9302);
            rule__EXPRSIMPLE__WAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getWAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__2__Impl"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4630:1: rule__EXPRSIMPLE__Group_5__3 : rule__EXPRSIMPLE__Group_5__3__Impl ;
    public final void rule__EXPRSIMPLE__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4634:1: ( rule__EXPRSIMPLE__Group_5__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4635:2: rule__EXPRSIMPLE__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__3__Impl_in_rule__EXPRSIMPLE__Group_5__39332);
            rule__EXPRSIMPLE__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__3"


    // $ANTLR start "rule__EXPRSIMPLE__Group_5__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4641:1: rule__EXPRSIMPLE__Group_5__3__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4645:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4646:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4646:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4647:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPRSIMPLE__Group_5__3__Impl9360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__Group_5__3__Impl"


    // $ANTLR start "rule__LEXPR__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4668:1: rule__LEXPR__Group__0 : rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1 ;
    public final void rule__LEXPR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4672:1: ( rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4673:2: rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__0__Impl_in_rule__LEXPR__Group__09399);
            rule__LEXPR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LEXPR__Group__1_in_rule__LEXPR__Group__09402);
            rule__LEXPR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__0"


    // $ANTLR start "rule__LEXPR__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4680:1: rule__LEXPR__Group__0__Impl : ( ( rule__LEXPR__FAssignment_0 ) ) ;
    public final void rule__LEXPR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4684:1: ( ( ( rule__LEXPR__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4685:1: ( ( rule__LEXPR__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4685:1: ( ( rule__LEXPR__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4686:1: ( rule__LEXPR__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4687:1: ( rule__LEXPR__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4687:2: rule__LEXPR__FAssignment_0
            {
            pushFollow(FOLLOW_rule__LEXPR__FAssignment_0_in_rule__LEXPR__Group__0__Impl9429);
            rule__LEXPR__FAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getFAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__0__Impl"


    // $ANTLR start "rule__LEXPR__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4697:1: rule__LEXPR__Group__1 : rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2 ;
    public final void rule__LEXPR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4701:1: ( rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4702:2: rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__1__Impl_in_rule__LEXPR__Group__19459);
            rule__LEXPR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LEXPR__Group__2_in_rule__LEXPR__Group__19462);
            rule__LEXPR__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__1"


    // $ANTLR start "rule__LEXPR__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4709:1: rule__LEXPR__Group__1__Impl : ( ( rule__LEXPR__NAssignment_1 ) ) ;
    public final void rule__LEXPR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4713:1: ( ( ( rule__LEXPR__NAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4714:1: ( ( rule__LEXPR__NAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4714:1: ( ( rule__LEXPR__NAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4715:1: ( rule__LEXPR__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getNAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4716:1: ( rule__LEXPR__NAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4716:2: rule__LEXPR__NAssignment_1
            {
            pushFollow(FOLLOW_rule__LEXPR__NAssignment_1_in_rule__LEXPR__Group__1__Impl9489);
            rule__LEXPR__NAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getNAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__1__Impl"


    // $ANTLR start "rule__LEXPR__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4726:1: rule__LEXPR__Group__2 : rule__LEXPR__Group__2__Impl ;
    public final void rule__LEXPR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4730:1: ( rule__LEXPR__Group__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4731:2: rule__LEXPR__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__2__Impl_in_rule__LEXPR__Group__29519);
            rule__LEXPR__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__2"


    // $ANTLR start "rule__LEXPR__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4737:1: rule__LEXPR__Group__2__Impl : ( ( rule__LEXPR__TAssignment_2 )? ) ;
    public final void rule__LEXPR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4741:1: ( ( ( rule__LEXPR__TAssignment_2 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4742:1: ( ( rule__LEXPR__TAssignment_2 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4742:1: ( ( rule__LEXPR__TAssignment_2 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4743:1: ( rule__LEXPR__TAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getTAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4744:1: ( rule__LEXPR__TAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_CR && LA16_0<=RULE_LF)||LA16_0==19||LA16_0==38||LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4744:2: rule__LEXPR__TAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LEXPR__TAssignment_2_in_rule__LEXPR__Group__2__Impl9546);
                    rule__LEXPR__TAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getTAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__Group__2__Impl"


    // $ANTLR start "rule__EXPRAND__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4760:1: rule__EXPRAND__Group__0 : rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1 ;
    public final void rule__EXPRAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4764:1: ( rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4765:2: rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__0__Impl_in_rule__EXPRAND__Group__09583);
            rule__EXPRAND__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group__1_in_rule__EXPRAND__Group__09586);
            rule__EXPRAND__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group__0"


    // $ANTLR start "rule__EXPRAND__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4772:1: rule__EXPRAND__Group__0__Impl : ( ( rule__EXPRAND__FAssignment_0 ) ) ;
    public final void rule__EXPRAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4776:1: ( ( ( rule__EXPRAND__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4777:1: ( ( rule__EXPRAND__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4777:1: ( ( rule__EXPRAND__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4778:1: ( rule__EXPRAND__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4779:1: ( rule__EXPRAND__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4779:2: rule__EXPRAND__FAssignment_0
            {
            pushFollow(FOLLOW_rule__EXPRAND__FAssignment_0_in_rule__EXPRAND__Group__0__Impl9613);
            rule__EXPRAND__FAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getFAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group__0__Impl"


    // $ANTLR start "rule__EXPRAND__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4789:1: rule__EXPRAND__Group__1 : rule__EXPRAND__Group__1__Impl ;
    public final void rule__EXPRAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4793:1: ( rule__EXPRAND__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4794:2: rule__EXPRAND__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__1__Impl_in_rule__EXPRAND__Group__19643);
            rule__EXPRAND__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group__1"


    // $ANTLR start "rule__EXPRAND__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4800:1: rule__EXPRAND__Group__1__Impl : ( ( rule__EXPRAND__Group_1__0 )? ) ;
    public final void rule__EXPRAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4804:1: ( ( ( rule__EXPRAND__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4805:1: ( ( rule__EXPRAND__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4805:1: ( ( rule__EXPRAND__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4806:1: ( rule__EXPRAND__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4807:1: ( rule__EXPRAND__Group_1__0 )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==44) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==44) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==44) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (LA17_4==44) ) {
                        alt17=1;
                    }
                    }
                    break;
                case 44:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4807:2: rule__EXPRAND__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPRAND__Group_1__0_in_rule__EXPRAND__Group__1__Impl9670);
                    rule__EXPRAND__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group__1__Impl"


    // $ANTLR start "rule__EXPRAND__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4821:1: rule__EXPRAND__Group_1__0 : rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1 ;
    public final void rule__EXPRAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4825:1: ( rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4826:2: rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__0__Impl_in_rule__EXPRAND__Group_1__09705);
            rule__EXPRAND__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__1_in_rule__EXPRAND__Group_1__09708);
            rule__EXPRAND__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__0"


    // $ANTLR start "rule__EXPRAND__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4833:1: rule__EXPRAND__Group_1__0__Impl : ( ( rule__EXPRAND__Lc1Assignment_1_0 ) ) ;
    public final void rule__EXPRAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4837:1: ( ( ( rule__EXPRAND__Lc1Assignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4838:1: ( ( rule__EXPRAND__Lc1Assignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4838:1: ( ( rule__EXPRAND__Lc1Assignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4839:1: ( rule__EXPRAND__Lc1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc1Assignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4840:1: ( rule__EXPRAND__Lc1Assignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4840:2: rule__EXPRAND__Lc1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__EXPRAND__Lc1Assignment_1_0_in_rule__EXPRAND__Group_1__0__Impl9735);
            rule__EXPRAND__Lc1Assignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getLc1Assignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__0__Impl"


    // $ANTLR start "rule__EXPRAND__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4850:1: rule__EXPRAND__Group_1__1 : rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2 ;
    public final void rule__EXPRAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4854:1: ( rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4855:2: rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__1__Impl_in_rule__EXPRAND__Group_1__19765);
            rule__EXPRAND__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__2_in_rule__EXPRAND__Group_1__19768);
            rule__EXPRAND__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__1"


    // $ANTLR start "rule__EXPRAND__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4862:1: rule__EXPRAND__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__EXPRAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4866:1: ( ( 'and' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4867:1: ( 'and' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4867:1: ( 'and' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4868:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getAndKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__EXPRAND__Group_1__1__Impl9796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__1__Impl"


    // $ANTLR start "rule__EXPRAND__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4881:1: rule__EXPRAND__Group_1__2 : rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3 ;
    public final void rule__EXPRAND__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4885:1: ( rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4886:2: rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__2__Impl_in_rule__EXPRAND__Group_1__29827);
            rule__EXPRAND__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__3_in_rule__EXPRAND__Group_1__29830);
            rule__EXPRAND__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__2"


    // $ANTLR start "rule__EXPRAND__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4893:1: rule__EXPRAND__Group_1__2__Impl : ( ( rule__EXPRAND__Lc2Assignment_1_2 ) ) ;
    public final void rule__EXPRAND__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4897:1: ( ( ( rule__EXPRAND__Lc2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4898:1: ( ( rule__EXPRAND__Lc2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4898:1: ( ( rule__EXPRAND__Lc2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4899:1: ( rule__EXPRAND__Lc2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4900:1: ( rule__EXPRAND__Lc2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4900:2: rule__EXPRAND__Lc2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPRAND__Lc2Assignment_1_2_in_rule__EXPRAND__Group_1__2__Impl9857);
            rule__EXPRAND__Lc2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getLc2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__2__Impl"


    // $ANTLR start "rule__EXPRAND__Group_1__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4910:1: rule__EXPRAND__Group_1__3 : rule__EXPRAND__Group_1__3__Impl ;
    public final void rule__EXPRAND__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4914:1: ( rule__EXPRAND__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4915:2: rule__EXPRAND__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__3__Impl_in_rule__EXPRAND__Group_1__39887);
            rule__EXPRAND__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__3"


    // $ANTLR start "rule__EXPRAND__Group_1__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4921:1: rule__EXPRAND__Group_1__3__Impl : ( ( rule__EXPRAND__EeAssignment_1_3 ) ) ;
    public final void rule__EXPRAND__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4925:1: ( ( ( rule__EXPRAND__EeAssignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4926:1: ( ( rule__EXPRAND__EeAssignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4926:1: ( ( rule__EXPRAND__EeAssignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4927:1: ( rule__EXPRAND__EeAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getEeAssignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4928:1: ( rule__EXPRAND__EeAssignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4928:2: rule__EXPRAND__EeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__EXPRAND__EeAssignment_1_3_in_rule__EXPRAND__Group_1__3__Impl9914);
            rule__EXPRAND__EeAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getEeAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Group_1__3__Impl"


    // $ANTLR start "rule__EXPROR__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4946:1: rule__EXPROR__Group__0 : rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1 ;
    public final void rule__EXPROR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4950:1: ( rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4951:2: rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__0__Impl_in_rule__EXPROR__Group__09952);
            rule__EXPROR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group__1_in_rule__EXPROR__Group__09955);
            rule__EXPROR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group__0"


    // $ANTLR start "rule__EXPROR__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4958:1: rule__EXPROR__Group__0__Impl : ( ( rule__EXPROR__E1Assignment_0 ) ) ;
    public final void rule__EXPROR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4962:1: ( ( ( rule__EXPROR__E1Assignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4963:1: ( ( rule__EXPROR__E1Assignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4963:1: ( ( rule__EXPROR__E1Assignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4964:1: ( rule__EXPROR__E1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE1Assignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4965:1: ( rule__EXPROR__E1Assignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4965:2: rule__EXPROR__E1Assignment_0
            {
            pushFollow(FOLLOW_rule__EXPROR__E1Assignment_0_in_rule__EXPROR__Group__0__Impl9982);
            rule__EXPROR__E1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getE1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group__0__Impl"


    // $ANTLR start "rule__EXPROR__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4975:1: rule__EXPROR__Group__1 : rule__EXPROR__Group__1__Impl ;
    public final void rule__EXPROR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4979:1: ( rule__EXPROR__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4980:2: rule__EXPROR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__1__Impl_in_rule__EXPROR__Group__110012);
            rule__EXPROR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group__1"


    // $ANTLR start "rule__EXPROR__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4986:1: rule__EXPROR__Group__1__Impl : ( ( rule__EXPROR__Group_1__0 )? ) ;
    public final void rule__EXPROR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4990:1: ( ( ( rule__EXPROR__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4991:1: ( ( rule__EXPROR__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4991:1: ( ( rule__EXPROR__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4992:1: ( rule__EXPROR__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4993:1: ( rule__EXPROR__Group_1__0 )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==45) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==45) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3==45) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (LA18_4==45) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 45:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4993:2: rule__EXPROR__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPROR__Group_1__0_in_rule__EXPROR__Group__1__Impl10039);
                    rule__EXPROR__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group__1__Impl"


    // $ANTLR start "rule__EXPROR__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5007:1: rule__EXPROR__Group_1__0 : rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1 ;
    public final void rule__EXPROR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5011:1: ( rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5012:2: rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__0__Impl_in_rule__EXPROR__Group_1__010074);
            rule__EXPROR__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__1_in_rule__EXPROR__Group_1__010077);
            rule__EXPROR__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__0"


    // $ANTLR start "rule__EXPROR__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5019:1: rule__EXPROR__Group_1__0__Impl : ( ( rule__EXPROR__Lc1Assignment_1_0 ) ) ;
    public final void rule__EXPROR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5023:1: ( ( ( rule__EXPROR__Lc1Assignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5024:1: ( ( rule__EXPROR__Lc1Assignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5024:1: ( ( rule__EXPROR__Lc1Assignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5025:1: ( rule__EXPROR__Lc1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc1Assignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5026:1: ( rule__EXPROR__Lc1Assignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5026:2: rule__EXPROR__Lc1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__EXPROR__Lc1Assignment_1_0_in_rule__EXPROR__Group_1__0__Impl10104);
            rule__EXPROR__Lc1Assignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getLc1Assignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__0__Impl"


    // $ANTLR start "rule__EXPROR__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5036:1: rule__EXPROR__Group_1__1 : rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2 ;
    public final void rule__EXPROR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5040:1: ( rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5041:2: rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__1__Impl_in_rule__EXPROR__Group_1__110134);
            rule__EXPROR__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__2_in_rule__EXPROR__Group_1__110137);
            rule__EXPROR__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__1"


    // $ANTLR start "rule__EXPROR__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5048:1: rule__EXPROR__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__EXPROR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5052:1: ( ( 'or' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5053:1: ( 'or' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5053:1: ( 'or' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5054:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getOrKeyword_1_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__EXPROR__Group_1__1__Impl10165); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__1__Impl"


    // $ANTLR start "rule__EXPROR__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5067:1: rule__EXPROR__Group_1__2 : rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3 ;
    public final void rule__EXPROR__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5071:1: ( rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5072:2: rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__2__Impl_in_rule__EXPROR__Group_1__210196);
            rule__EXPROR__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__3_in_rule__EXPROR__Group_1__210199);
            rule__EXPROR__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__2"


    // $ANTLR start "rule__EXPROR__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5079:1: rule__EXPROR__Group_1__2__Impl : ( ( rule__EXPROR__Lc2Assignment_1_2 ) ) ;
    public final void rule__EXPROR__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5083:1: ( ( ( rule__EXPROR__Lc2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5084:1: ( ( rule__EXPROR__Lc2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5084:1: ( ( rule__EXPROR__Lc2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5085:1: ( rule__EXPROR__Lc2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5086:1: ( rule__EXPROR__Lc2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5086:2: rule__EXPROR__Lc2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPROR__Lc2Assignment_1_2_in_rule__EXPROR__Group_1__2__Impl10226);
            rule__EXPROR__Lc2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getLc2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__2__Impl"


    // $ANTLR start "rule__EXPROR__Group_1__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5096:1: rule__EXPROR__Group_1__3 : rule__EXPROR__Group_1__3__Impl ;
    public final void rule__EXPROR__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5100:1: ( rule__EXPROR__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5101:2: rule__EXPROR__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__3__Impl_in_rule__EXPROR__Group_1__310256);
            rule__EXPROR__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__3"


    // $ANTLR start "rule__EXPROR__Group_1__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5107:1: rule__EXPROR__Group_1__3__Impl : ( ( rule__EXPROR__E2Assignment_1_3 ) ) ;
    public final void rule__EXPROR__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5111:1: ( ( ( rule__EXPROR__E2Assignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5112:1: ( ( rule__EXPROR__E2Assignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5112:1: ( ( rule__EXPROR__E2Assignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5113:1: ( rule__EXPROR__E2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE2Assignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5114:1: ( rule__EXPROR__E2Assignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5114:2: rule__EXPROR__E2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__EXPROR__E2Assignment_1_3_in_rule__EXPROR__Group_1__3__Impl10283);
            rule__EXPROR__E2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getE2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Group_1__3__Impl"


    // $ANTLR start "rule__EXPRNOT__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5132:1: rule__EXPRNOT__Group__0 : rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1 ;
    public final void rule__EXPRNOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5136:1: ( rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5137:2: rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__0__Impl_in_rule__EXPRNOT__Group__010321);
            rule__EXPRNOT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRNOT__Group__1_in_rule__EXPRNOT__Group__010324);
            rule__EXPRNOT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group__0"


    // $ANTLR start "rule__EXPRNOT__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5144:1: rule__EXPRNOT__Group__0__Impl : ( ( rule__EXPRNOT__Group_0__0 )? ) ;
    public final void rule__EXPRNOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5148:1: ( ( ( rule__EXPRNOT__Group_0__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5149:1: ( ( rule__EXPRNOT__Group_0__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5149:1: ( ( rule__EXPRNOT__Group_0__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5150:1: ( rule__EXPRNOT__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getGroup_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5151:1: ( rule__EXPRNOT__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5151:2: rule__EXPRNOT__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EXPRNOT__Group_0__0_in_rule__EXPRNOT__Group__0__Impl10351);
                    rule__EXPRNOT__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group__0__Impl"


    // $ANTLR start "rule__EXPRNOT__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5161:1: rule__EXPRNOT__Group__1 : rule__EXPRNOT__Group__1__Impl ;
    public final void rule__EXPRNOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5165:1: ( rule__EXPRNOT__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5166:2: rule__EXPRNOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__1__Impl_in_rule__EXPRNOT__Group__110382);
            rule__EXPRNOT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group__1"


    // $ANTLR start "rule__EXPRNOT__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5172:1: rule__EXPRNOT__Group__1__Impl : ( ( rule__EXPRNOT__E1Assignment_1 ) ) ;
    public final void rule__EXPRNOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5176:1: ( ( ( rule__EXPRNOT__E1Assignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5177:1: ( ( rule__EXPRNOT__E1Assignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5177:1: ( ( rule__EXPRNOT__E1Assignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5178:1: ( rule__EXPRNOT__E1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getE1Assignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5179:1: ( rule__EXPRNOT__E1Assignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5179:2: rule__EXPRNOT__E1Assignment_1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__E1Assignment_1_in_rule__EXPRNOT__Group__1__Impl10409);
            rule__EXPRNOT__E1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getE1Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group__1__Impl"


    // $ANTLR start "rule__EXPRNOT__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5193:1: rule__EXPRNOT__Group_0__0 : rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1 ;
    public final void rule__EXPRNOT__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5197:1: ( rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5198:2: rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__0__Impl_in_rule__EXPRNOT__Group_0__010443);
            rule__EXPRNOT__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__1_in_rule__EXPRNOT__Group_0__010446);
            rule__EXPRNOT__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group_0__0"


    // $ANTLR start "rule__EXPRNOT__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5205:1: rule__EXPRNOT__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__EXPRNOT__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5209:1: ( ( 'not' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5210:1: ( 'not' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5210:1: ( 'not' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5211:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getNotKeyword_0_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__EXPRNOT__Group_0__0__Impl10474); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group_0__0__Impl"


    // $ANTLR start "rule__EXPRNOT__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5224:1: rule__EXPRNOT__Group_0__1 : rule__EXPRNOT__Group_0__1__Impl ;
    public final void rule__EXPRNOT__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5228:1: ( rule__EXPRNOT__Group_0__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5229:2: rule__EXPRNOT__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__1__Impl_in_rule__EXPRNOT__Group_0__110505);
            rule__EXPRNOT__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group_0__1"


    // $ANTLR start "rule__EXPRNOT__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5235:1: rule__EXPRNOT__Group_0__1__Impl : ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) ) ;
    public final void rule__EXPRNOT__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5239:1: ( ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5240:1: ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5240:1: ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5241:1: ( rule__EXPRNOT__Lc1Assignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getLc1Assignment_0_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5242:1: ( rule__EXPRNOT__Lc1Assignment_0_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5242:2: rule__EXPRNOT__Lc1Assignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Lc1Assignment_0_1_in_rule__EXPRNOT__Group_0__1__Impl10532);
            rule__EXPRNOT__Lc1Assignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getLc1Assignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Group_0__1__Impl"


    // $ANTLR start "rule__EXPREQ__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5256:1: rule__EXPREQ__Group_0__0 : rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1 ;
    public final void rule__EXPREQ__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5260:1: ( rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5261:2: rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__0__Impl_in_rule__EXPREQ__Group_0__010566);
            rule__EXPREQ__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__1_in_rule__EXPREQ__Group_0__010569);
            rule__EXPREQ__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__0"


    // $ANTLR start "rule__EXPREQ__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5268:1: rule__EXPREQ__Group_0__0__Impl : ( ( rule__EXPREQ__E1Assignment_0_0 ) ) ;
    public final void rule__EXPREQ__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5272:1: ( ( ( rule__EXPREQ__E1Assignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5273:1: ( ( rule__EXPREQ__E1Assignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5273:1: ( ( rule__EXPREQ__E1Assignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5274:1: ( rule__EXPREQ__E1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getE1Assignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5275:1: ( rule__EXPREQ__E1Assignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5275:2: rule__EXPREQ__E1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__EXPREQ__E1Assignment_0_0_in_rule__EXPREQ__Group_0__0__Impl10596);
            rule__EXPREQ__E1Assignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getE1Assignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__0__Impl"


    // $ANTLR start "rule__EXPREQ__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5285:1: rule__EXPREQ__Group_0__1 : rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2 ;
    public final void rule__EXPREQ__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5289:1: ( rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5290:2: rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__1__Impl_in_rule__EXPREQ__Group_0__110626);
            rule__EXPREQ__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__2_in_rule__EXPREQ__Group_0__110629);
            rule__EXPREQ__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__1"


    // $ANTLR start "rule__EXPREQ__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5297:1: rule__EXPREQ__Group_0__1__Impl : ( ( rule__EXPREQ__CccAssignment_0_1 ) ) ;
    public final void rule__EXPREQ__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5301:1: ( ( ( rule__EXPREQ__CccAssignment_0_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5302:1: ( ( rule__EXPREQ__CccAssignment_0_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5302:1: ( ( rule__EXPREQ__CccAssignment_0_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5303:1: ( rule__EXPREQ__CccAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getCccAssignment_0_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5304:1: ( rule__EXPREQ__CccAssignment_0_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5304:2: rule__EXPREQ__CccAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPREQ__CccAssignment_0_1_in_rule__EXPREQ__Group_0__1__Impl10656);
            rule__EXPREQ__CccAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getCccAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__1__Impl"


    // $ANTLR start "rule__EXPREQ__Group_0__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5314:1: rule__EXPREQ__Group_0__2 : rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3 ;
    public final void rule__EXPREQ__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5318:1: ( rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5319:2: rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__2__Impl_in_rule__EXPREQ__Group_0__210686);
            rule__EXPREQ__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__3_in_rule__EXPREQ__Group_0__210689);
            rule__EXPREQ__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__2"


    // $ANTLR start "rule__EXPREQ__Group_0__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5326:1: rule__EXPREQ__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__EXPREQ__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5330:1: ( ( '=?' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5331:1: ( '=?' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5331:1: ( '=?' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5332:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__EXPREQ__Group_0__2__Impl10717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__2__Impl"


    // $ANTLR start "rule__EXPREQ__Group_0__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5345:1: rule__EXPREQ__Group_0__3 : rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4 ;
    public final void rule__EXPREQ__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5349:1: ( rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5350:2: rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__3__Impl_in_rule__EXPREQ__Group_0__310748);
            rule__EXPREQ__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__4_in_rule__EXPREQ__Group_0__310751);
            rule__EXPREQ__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__3"


    // $ANTLR start "rule__EXPREQ__Group_0__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5357:1: rule__EXPREQ__Group_0__3__Impl : ( ( rule__EXPREQ__Lc2Assignment_0_3 ) ) ;
    public final void rule__EXPREQ__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5361:1: ( ( ( rule__EXPREQ__Lc2Assignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5362:1: ( ( rule__EXPREQ__Lc2Assignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5362:1: ( ( rule__EXPREQ__Lc2Assignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5363:1: ( rule__EXPREQ__Lc2Assignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLc2Assignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5364:1: ( rule__EXPREQ__Lc2Assignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5364:2: rule__EXPREQ__Lc2Assignment_0_3
            {
            pushFollow(FOLLOW_rule__EXPREQ__Lc2Assignment_0_3_in_rule__EXPREQ__Group_0__3__Impl10778);
            rule__EXPREQ__Lc2Assignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getLc2Assignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__3__Impl"


    // $ANTLR start "rule__EXPREQ__Group_0__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5374:1: rule__EXPREQ__Group_0__4 : rule__EXPREQ__Group_0__4__Impl ;
    public final void rule__EXPREQ__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5378:1: ( rule__EXPREQ__Group_0__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5379:2: rule__EXPREQ__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__4__Impl_in_rule__EXPREQ__Group_0__410808);
            rule__EXPREQ__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__4"


    // $ANTLR start "rule__EXPREQ__Group_0__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5385:1: rule__EXPREQ__Group_0__4__Impl : ( ( rule__EXPREQ__WAssignment_0_4 ) ) ;
    public final void rule__EXPREQ__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5389:1: ( ( ( rule__EXPREQ__WAssignment_0_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5390:1: ( ( rule__EXPREQ__WAssignment_0_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5390:1: ( ( rule__EXPREQ__WAssignment_0_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5391:1: ( rule__EXPREQ__WAssignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getWAssignment_0_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5392:1: ( rule__EXPREQ__WAssignment_0_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5392:2: rule__EXPREQ__WAssignment_0_4
            {
            pushFollow(FOLLOW_rule__EXPREQ__WAssignment_0_4_in_rule__EXPREQ__Group_0__4__Impl10835);
            rule__EXPREQ__WAssignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getWAssignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_0__4__Impl"


    // $ANTLR start "rule__EXPREQ__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5412:1: rule__EXPREQ__Group_1__0 : rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1 ;
    public final void rule__EXPREQ__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5416:1: ( rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5417:2: rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__0__Impl_in_rule__EXPREQ__Group_1__010875);
            rule__EXPREQ__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__1_in_rule__EXPREQ__Group_1__010878);
            rule__EXPREQ__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__0"


    // $ANTLR start "rule__EXPREQ__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5424:1: rule__EXPREQ__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EXPREQ__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5428:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5429:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5429:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5430:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EXPREQ__Group_1__0__Impl10906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__0__Impl"


    // $ANTLR start "rule__EXPREQ__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5443:1: rule__EXPREQ__Group_1__1 : rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2 ;
    public final void rule__EXPREQ__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5447:1: ( rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5448:2: rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__1__Impl_in_rule__EXPREQ__Group_1__110937);
            rule__EXPREQ__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__2_in_rule__EXPREQ__Group_1__110940);
            rule__EXPREQ__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__1"


    // $ANTLR start "rule__EXPREQ__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5455:1: rule__EXPREQ__Group_1__1__Impl : ( ( rule__EXPREQ__ExAssignment_1_1 ) ) ;
    public final void rule__EXPREQ__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5459:1: ( ( ( rule__EXPREQ__ExAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5460:1: ( ( rule__EXPREQ__ExAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5460:1: ( ( rule__EXPREQ__ExAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5461:1: ( rule__EXPREQ__ExAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getExAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5462:1: ( rule__EXPREQ__ExAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5462:2: rule__EXPREQ__ExAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EXPREQ__ExAssignment_1_1_in_rule__EXPREQ__Group_1__1__Impl10967);
            rule__EXPREQ__ExAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getExAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__1__Impl"


    // $ANTLR start "rule__EXPREQ__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5472:1: rule__EXPREQ__Group_1__2 : rule__EXPREQ__Group_1__2__Impl ;
    public final void rule__EXPREQ__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5476:1: ( rule__EXPREQ__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5477:2: rule__EXPREQ__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__2__Impl_in_rule__EXPREQ__Group_1__210997);
            rule__EXPREQ__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__2"


    // $ANTLR start "rule__EXPREQ__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5483:1: rule__EXPREQ__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EXPREQ__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5487:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5488:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5488:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5489:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__EXPREQ__Group_1__2__Impl11025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Group_1__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5509:1: rule__Model__GreetingsAssignment : ( ruleProgram ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5513:1: ( ( ruleProgram ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5514:1: ( ruleProgram )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5514:1: ( ruleProgram )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5515:1: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_rule__Model__GreetingsAssignment11067);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsProgramParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Program__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5524:1: rule__Program__FAssignment_0 : ( ruleFunction ) ;
    public final void rule__Program__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5528:1: ( ( ruleFunction ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5529:1: ( ruleFunction )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5529:1: ( ruleFunction )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5530:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FAssignment_011098);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFFunctionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FAssignment_0"


    // $ANTLR start "rule__Program__UAssignment_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5539:1: rule__Program__UAssignment_1_0 : ( RULE_CR ) ;
    public final void rule__Program__UAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5543:1: ( ( RULE_CR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5544:1: ( RULE_CR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5544:1: ( RULE_CR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5545:1: RULE_CR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getUCRTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__Program__UAssignment_1_011129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getUCRTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__UAssignment_1_0"


    // $ANTLR start "rule__Program__PpAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5554:1: rule__Program__PpAssignment_1_1 : ( ruleProgram ) ;
    public final void rule__Program__PpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5558:1: ( ( ruleProgram ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5559:1: ( ruleProgram )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5559:1: ( ruleProgram )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5560:1: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPpProgramParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_rule__Program__PpAssignment_1_111160);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getPpProgramParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__PpAssignment_1_1"


    // $ANTLR start "rule__Function__NAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5569:1: rule__Function__NAssignment_1 : ( ruleLCs ) ;
    public final void rule__Function__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5573:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5574:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5574:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5575:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Function__NAssignment_111191);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NAssignment_1"


    // $ANTLR start "rule__Function__NomAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5584:1: rule__Function__NomAssignment_2 : ( RULE_SYM ) ;
    public final void rule__Function__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5588:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5589:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5589:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5590:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__Function__NomAssignment_211222); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomSYMTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NomAssignment_2"


    // $ANTLR start "rule__Function__TAssignment_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5599:1: rule__Function__TAssignment_4 : ( ruleLCs ) ;
    public final void rule__Function__TAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5603:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5604:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5604:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5605:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getTLCsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Function__TAssignment_411253);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getTLCsParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__TAssignment_4"


    // $ANTLR start "rule__Function__DAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5614:1: rule__Function__DAssignment_5 : ( ruleDef ) ;
    public final void rule__Function__DAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5618:1: ( ( ruleDef ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5619:1: ( ruleDef )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5619:1: ( ruleDef )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5620:1: ruleDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDDefParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDef_in_rule__Function__DAssignment_511284);
            ruleDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDDefParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DAssignment_5"


    // $ANTLR start "rule__Def__LAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5629:1: rule__Def__LAssignment_1 : ( ruleLCs ) ;
    public final void rule__Def__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5633:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5634:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5634:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5635:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getLLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__LAssignment_111315);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getLLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__LAssignment_1"


    // $ANTLR start "rule__Def__InAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5644:1: rule__Def__InAssignment_2 : ( ruleInput ) ;
    public final void rule__Def__InAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5648:1: ( ( ruleInput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5649:1: ( ruleInput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5649:1: ( ruleInput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5650:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getInInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Def__InAssignment_211346);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getInInputParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__InAssignment_2"


    // $ANTLR start "rule__Def__ZAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5659:1: rule__Def__ZAssignment_3 : ( ruleLCs ) ;
    public final void rule__Def__ZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5663:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5664:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5664:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5665:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getZLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__ZAssignment_311377);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getZLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__ZAssignment_3"


    // $ANTLR start "rule__Def__VAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5674:1: rule__Def__VAssignment_5 : ( ruleCommands ) ;
    public final void rule__Def__VAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5678:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5679:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5679:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5680:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getVCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Def__VAssignment_511408);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getVCommandsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__VAssignment_5"


    // $ANTLR start "rule__Def__SAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5689:1: rule__Def__SAssignment_6 : ( ruleLCs ) ;
    public final void rule__Def__SAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5693:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5694:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5694:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5695:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getSLCsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__SAssignment_611439);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getSLCsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__SAssignment_6"


    // $ANTLR start "rule__Def__UAssignment_9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5704:1: rule__Def__UAssignment_9 : ( ruleLCs ) ;
    public final void rule__Def__UAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5708:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5709:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5709:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5710:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getULCsParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__UAssignment_911470);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getULCsParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__UAssignment_9"


    // $ANTLR start "rule__Def__OAssignment_10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5719:1: rule__Def__OAssignment_10 : ( ruleOutput ) ;
    public final void rule__Def__OAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5723:1: ( ( ruleOutput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5724:1: ( ruleOutput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5724:1: ( ruleOutput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5725:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getOOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Def__OAssignment_1011501);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefAccess().getOOutputParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__OAssignment_10"


    // $ANTLR start "rule__Input__VAssignment_0_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5734:1: rule__Input__VAssignment_0_0 : ( RULE_VAR ) ;
    public final void rule__Input__VAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5738:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5739:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5739:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5740:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__VAssignment_0_011532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVVARTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VAssignment_0_0"


    // $ANTLR start "rule__Input__ZAssignment_0_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5749:1: rule__Input__ZAssignment_0_2 : ( ruleLCs ) ;
    public final void rule__Input__ZAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5753:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5754:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5754:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5755:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getZLCsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Input__ZAssignment_0_211563);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getZLCsParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ZAssignment_0_2"


    // $ANTLR start "rule__Input__InAssignment_0_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5764:1: rule__Input__InAssignment_0_3 : ( ruleInput ) ;
    public final void rule__Input__InAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5768:1: ( ( ruleInput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5769:1: ( ruleInput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5769:1: ( ruleInput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5770:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getInInputParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Input__InAssignment_0_311594);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getInInputParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__InAssignment_0_3"


    // $ANTLR start "rule__Input__YAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5779:1: rule__Input__YAssignment_1 : ( RULE_VAR ) ;
    public final void rule__Input__YAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5783:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5784:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5784:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5785:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getYVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__YAssignment_111625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getYVARTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__YAssignment_1"


    // $ANTLR start "rule__Output__NAssignment_0_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5794:1: rule__Output__NAssignment_0_0 : ( RULE_VAR ) ;
    public final void rule__Output__NAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5798:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5799:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5799:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5800:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getNVARTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__NAssignment_0_011656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getNVARTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NAssignment_0_0"


    // $ANTLR start "rule__Output__QAssignment_0_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5809:1: rule__Output__QAssignment_0_2 : ( ruleLCs ) ;
    public final void rule__Output__QAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5813:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5814:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5814:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5815:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getQLCsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Output__QAssignment_0_211687);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getQLCsParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__QAssignment_0_2"


    // $ANTLR start "rule__Output__OAssignment_0_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5824:1: rule__Output__OAssignment_0_3 : ( ruleOutput ) ;
    public final void rule__Output__OAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5828:1: ( ( ruleOutput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5829:1: ( ruleOutput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5829:1: ( ruleOutput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5830:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOOutputParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Output__OAssignment_0_311718);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOOutputParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OAssignment_0_3"


    // $ANTLR start "rule__Output__SAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5839:1: rule__Output__SAssignment_1 : ( RULE_VAR ) ;
    public final void rule__Output__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5843:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5844:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5844:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5845:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getSVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__SAssignment_111749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getSVARTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__SAssignment_1"


    // $ANTLR start "rule__Commands__AAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5854:1: rule__Commands__AAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5858:1: ( ( ruleCommand ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5859:1: ( ruleCommand )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5859:1: ( ruleCommand )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5860:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getACommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__AAssignment_011780);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getACommandParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__AAssignment_0"


    // $ANTLR start "rule__Commands__LAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5869:1: rule__Commands__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__Commands__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5873:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5874:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5874:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5875:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Commands__LAssignment_1_111811);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getLLCsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__LAssignment_1_1"


    // $ANTLR start "rule__Commands__SAssignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5884:1: rule__Commands__SAssignment_1_2 : ( ruleCommands ) ;
    public final void rule__Commands__SAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5888:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5889:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5889:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5890:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSCommandsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Commands__SAssignment_1_211842);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSCommandsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__SAssignment_1_2"


    // $ANTLR start "rule__Command__NopAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5899:1: rule__Command__NopAssignment_0 : ( ruleNop ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5903:1: ( ( ruleNop ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5904:1: ( ruleNop )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5904:1: ( ruleNop )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5905:1: ruleNop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNop_in_rule__Command__NopAssignment_011873);
            ruleNop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NopAssignment_0"


    // $ANTLR start "rule__Command__AffectAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5914:1: rule__Command__AffectAssignment_1 : ( ruleAssign ) ;
    public final void rule__Command__AffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5918:1: ( ( ruleAssign ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5919:1: ( ruleAssign )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5919:1: ( ruleAssign )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5920:1: ruleAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAffectAssignParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_rule__Command__AffectAssignment_111904);
            ruleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAffectAssignParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__AffectAssignment_1"


    // $ANTLR start "rule__Command__WhAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5929:1: rule__Command__WhAssignment_2 : ( ruleWhile ) ;
    public final void rule__Command__WhAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5933:1: ( ( ruleWhile ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5934:1: ( ruleWhile )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5934:1: ( ruleWhile )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5935:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211935);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__WhAssignment_2"


    // $ANTLR start "rule__Command__ForrAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5944:1: rule__Command__ForrAssignment_3 : ( ruleFor ) ;
    public final void rule__Command__ForrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5948:1: ( ( ruleFor ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5949:1: ( ruleFor )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5949:1: ( ruleFor )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5950:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForrForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Command__ForrAssignment_311966);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForrForParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ForrAssignment_3"


    // $ANTLR start "rule__Command__ForeAssignment_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5959:1: rule__Command__ForeAssignment_4 : ( ruleForeach ) ;
    public final void rule__Command__ForeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5963:1: ( ( ruleForeach ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5964:1: ( ruleForeach )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5964:1: ( ruleForeach )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5965:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_411997);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ForeAssignment_4"


    // $ANTLR start "rule__Command__IffAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5974:1: rule__Command__IffAssignment_5 : ( ruleIf ) ;
    public final void rule__Command__IffAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5978:1: ( ( ruleIf ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5979:1: ( ruleIf )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5979:1: ( ruleIf )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5980:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getIffIfParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Command__IffAssignment_512028);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getIffIfParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__IffAssignment_5"


    // $ANTLR start "rule__Assign__EAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5989:1: rule__Assign__EAssignment_0 : ( ruleVars ) ;
    public final void rule__Assign__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5993:1: ( ( ruleVars ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5994:1: ( ruleVars )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5994:1: ( ruleVars )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5995:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getEVarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Assign__EAssignment_012059);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getEVarsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__EAssignment_0"


    // $ANTLR start "rule__Assign__LAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6004:1: rule__Assign__LAssignment_1 : ( ruleLCs ) ;
    public final void rule__Assign__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6008:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6009:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6009:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6010:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Assign__LAssignment_112090);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getLLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__LAssignment_1"


    // $ANTLR start "rule__Assign__CAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6019:1: rule__Assign__CAssignment_3 : ( ruleLCs ) ;
    public final void rule__Assign__CAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6023:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6024:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6024:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6025:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getCLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Assign__CAssignment_312121);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getCLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__CAssignment_3"


    // $ANTLR start "rule__Assign__NAssignment_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6034:1: rule__Assign__NAssignment_4 : ( ruleEXPRS ) ;
    public final void rule__Assign__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6038:1: ( ( ruleEXPRS ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6039:1: ( ruleEXPRS )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6039:1: ( ruleEXPRS )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6040:1: ruleEXPRS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getNEXPRSParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_rule__Assign__NAssignment_412152);
            ruleEXPRS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getNEXPRSParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__NAssignment_4"


    // $ANTLR start "rule__While__LlAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6049:1: rule__While__LlAssignment_1 : ( ruleLCs ) ;
    public final void rule__While__LlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6053:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6054:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6054:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6055:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLlLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__LlAssignment_112183);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLlLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__LlAssignment_1"


    // $ANTLR start "rule__While__EeAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6064:1: rule__While__EeAssignment_2 : ( ruleEXPR ) ;
    public final void rule__While__EeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6068:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6069:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6069:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6070:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getEeEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__While__EeAssignment_212214);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getEeEXPRParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__EeAssignment_2"


    // $ANTLR start "rule__While__CcAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6079:1: rule__While__CcAssignment_3 : ( ruleLCs ) ;
    public final void rule__While__CcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6083:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6084:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6084:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6085:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCcLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__CcAssignment_312245);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCcLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__CcAssignment_3"


    // $ANTLR start "rule__While__ZAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6094:1: rule__While__ZAssignment_5 : ( ruleLCs ) ;
    public final void rule__While__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6098:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6099:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6099:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6100:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getZLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__ZAssignment_512276);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getZLCsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ZAssignment_5"


    // $ANTLR start "rule__While__KAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6109:1: rule__While__KAssignment_6 : ( ruleCommands ) ;
    public final void rule__While__KAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6113:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6114:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6114:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6115:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getKCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__While__KAssignment_612307);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getKCommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__KAssignment_6"


    // $ANTLR start "rule__While__LcAssignment_7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6124:1: rule__While__LcAssignment_7 : ( ruleLCs ) ;
    public final void rule__While__LcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6128:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6129:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6129:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6130:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLcLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__LcAssignment_712338);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLcLCsParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__LcAssignment_7"


    // $ANTLR start "rule__For__CcAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6139:1: rule__For__CcAssignment_1 : ( ruleLCs ) ;
    public final void rule__For__CcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6143:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6144:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6144:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6145:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCcLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__CcAssignment_112369);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCcLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__CcAssignment_1"


    // $ANTLR start "rule__For__HhAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6154:1: rule__For__HhAssignment_2 : ( ruleEXPR ) ;
    public final void rule__For__HhAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6158:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6159:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6159:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6160:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getHhEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__For__HhAssignment_212400);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getHhEXPRParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__HhAssignment_2"


    // $ANTLR start "rule__For__TtAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6169:1: rule__For__TtAssignment_3 : ( ruleLCs ) ;
    public final void rule__For__TtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6173:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6174:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6174:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6175:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getTtLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__TtAssignment_312431);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getTtLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__TtAssignment_3"


    // $ANTLR start "rule__For__VvAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6184:1: rule__For__VvAssignment_5 : ( ruleLCs ) ;
    public final void rule__For__VvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6188:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6189:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6189:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6190:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getVvLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__VvAssignment_512462);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getVvLCsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__VvAssignment_5"


    // $ANTLR start "rule__For__C1Assignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6199:1: rule__For__C1Assignment_6 : ( ruleCommands ) ;
    public final void rule__For__C1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6203:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6204:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6204:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6205:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getC1CommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__For__C1Assignment_612493);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getC1CommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__C1Assignment_6"


    // $ANTLR start "rule__For__SsAssignment_7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6214:1: rule__For__SsAssignment_7 : ( ruleLCs ) ;
    public final void rule__For__SsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6218:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6219:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6219:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6220:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSsLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__SsAssignment_712524);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getSsLCsParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__SsAssignment_7"


    // $ANTLR start "rule__If__MmAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6229:1: rule__If__MmAssignment_1 : ( ruleLCs ) ;
    public final void rule__If__MmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6233:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6234:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6234:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6235:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getMmLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__MmAssignment_112555);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getMmLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__MmAssignment_1"


    // $ANTLR start "rule__If__JjAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6244:1: rule__If__JjAssignment_2 : ( ruleEXPR ) ;
    public final void rule__If__JjAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6248:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6249:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6249:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6250:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getJjEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__If__JjAssignment_212586);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getJjEXPRParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__JjAssignment_2"


    // $ANTLR start "rule__If__KkAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6259:1: rule__If__KkAssignment_3 : ( ruleLCs ) ;
    public final void rule__If__KkAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6263:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6264:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6264:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6265:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getKkLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__KkAssignment_312617);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getKkLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__KkAssignment_3"


    // $ANTLR start "rule__If__HgAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6274:1: rule__If__HgAssignment_5 : ( ruleLCs ) ;
    public final void rule__If__HgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6278:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6279:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6279:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6280:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getHgLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__HgAssignment_512648);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getHgLCsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__HgAssignment_5"


    // $ANTLR start "rule__If__C2Assignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6289:1: rule__If__C2Assignment_6 : ( ruleCommands ) ;
    public final void rule__If__C2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6293:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6294:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6294:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6295:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getC2CommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__C2Assignment_612679);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getC2CommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__C2Assignment_6"


    // $ANTLR start "rule__If__GgAssignment_7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6304:1: rule__If__GgAssignment_7 : ( ruleLCs ) ;
    public final void rule__If__GgAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6308:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6309:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6309:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6310:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGgLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__GgAssignment_712710);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGgLCsParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__GgAssignment_7"


    // $ANTLR start "rule__If__FfAssignment_8_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6319:1: rule__If__FfAssignment_8_1 : ( ruleLCs ) ;
    public final void rule__If__FfAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6323:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6324:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6324:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6325:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFfLCsParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__FfAssignment_8_112741);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getFfLCsParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__FfAssignment_8_1"


    // $ANTLR start "rule__If__OAssignment_8_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6334:1: rule__If__OAssignment_8_2 : ( ruleCommands ) ;
    public final void rule__If__OAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6338:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6339:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6339:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6340:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOCommandsParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__OAssignment_8_212772);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getOCommandsParserRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OAssignment_8_2"


    // $ANTLR start "rule__If__DdAssignment_8_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6349:1: rule__If__DdAssignment_8_3 : ( ruleLCs ) ;
    public final void rule__If__DdAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6353:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6354:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6354:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6355:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getDdLCsParserRuleCall_8_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__DdAssignment_8_312803);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getDdLCsParserRuleCall_8_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__DdAssignment_8_3"


    // $ANTLR start "rule__Foreach__SqAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6364:1: rule__Foreach__SqAssignment_1 : ( ruleLCs ) ;
    public final void rule__Foreach__SqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6368:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6369:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6369:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6370:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getSqLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__SqAssignment_112834);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getSqLCsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__SqAssignment_1"


    // $ANTLR start "rule__Foreach__WxAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6379:1: rule__Foreach__WxAssignment_2 : ( ruleEXPR ) ;
    public final void rule__Foreach__WxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6383:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6384:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6384:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6385:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getWxEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__Foreach__WxAssignment_212865);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getWxEXPRParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__WxAssignment_2"


    // $ANTLR start "rule__Foreach__LcAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6394:1: rule__Foreach__LcAssignment_3 : ( ruleLCs ) ;
    public final void rule__Foreach__LcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6398:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6399:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6399:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6400:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLcLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__LcAssignment_312896);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLcLCsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__LcAssignment_3"


    // $ANTLR start "rule__Foreach__Lc2Assignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6409:1: rule__Foreach__Lc2Assignment_5 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6413:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6414:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6414:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6415:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc2LCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc2Assignment_512927);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc2LCsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Lc2Assignment_5"


    // $ANTLR start "rule__Foreach__E1Assignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6424:1: rule__Foreach__E1Assignment_6 : ( ruleEXPR ) ;
    public final void rule__Foreach__E1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6428:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6429:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6429:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6430:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getE1EXPRParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__Foreach__E1Assignment_612958);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getE1EXPRParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__E1Assignment_6"


    // $ANTLR start "rule__Foreach__Lc3Assignment_7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6439:1: rule__Foreach__Lc3Assignment_7 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6443:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6444:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6444:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6445:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc3LCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc3Assignment_712989);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc3LCsParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Lc3Assignment_7"


    // $ANTLR start "rule__Foreach__Lc4Assignment_9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6454:1: rule__Foreach__Lc4Assignment_9 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc4Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6458:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6459:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6459:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6460:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc4LCsParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc4Assignment_913020);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc4LCsParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Lc4Assignment_9"


    // $ANTLR start "rule__Foreach__C3Assignment_10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6469:1: rule__Foreach__C3Assignment_10 : ( ruleCommands ) ;
    public final void rule__Foreach__C3Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6473:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6474:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6474:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6475:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getC3CommandsParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Foreach__C3Assignment_1013051);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getC3CommandsParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__C3Assignment_10"


    // $ANTLR start "rule__Foreach__Lc5Assignment_11"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6484:1: rule__Foreach__Lc5Assignment_11 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc5Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6488:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6489:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6489:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6490:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc5LCsParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc5Assignment_1113082);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLc5LCsParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Lc5Assignment_11"


    // $ANTLR start "rule__Vars__AAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6499:1: rule__Vars__AAssignment_0 : ( RULE_VAR ) ;
    public final void rule__Vars__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6503:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6504:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6504:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6505:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getAVARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__AAssignment_013113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getAVARTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__AAssignment_0"


    // $ANTLR start "rule__Vars__LAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6514:1: rule__Vars__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__Vars__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6518:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6519:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6519:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6520:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Vars__LAssignment_1_113144);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getLLCsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__LAssignment_1_1"


    // $ANTLR start "rule__Vars__UAssignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6529:1: rule__Vars__UAssignment_1_2 : ( ruleVars ) ;
    public final void rule__Vars__UAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6533:1: ( ( ruleVars ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6534:1: ( ruleVars )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6534:1: ( ruleVars )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6535:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getUVarsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__UAssignment_1_213175);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getUVarsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__UAssignment_1_2"


    // $ANTLR start "rule__EXPRS__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:1: rule__EXPRS__FAssignment_0 : ( ruleEXPR ) ;
    public final void rule__EXPRS__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6549:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6549:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6550:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getFEXPRParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPRS__FAssignment_013206);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getFEXPRParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__FAssignment_0"


    // $ANTLR start "rule__EXPRS__LAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6559:1: rule__EXPRS__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__EXPRS__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6563:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6564:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6564:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6565:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRS__LAssignment_1_113237);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getLLCsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__LAssignment_1_1"


    // $ANTLR start "rule__EXPRS__E2Assignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6574:1: rule__EXPRS__E2Assignment_1_2 : ( ruleEXPRS ) ;
    public final void rule__EXPRS__E2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6578:1: ( ( ruleEXPRS ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6579:1: ( ruleEXPRS )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6579:1: ( ruleEXPRS )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6580:1: ruleEXPRS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getE2EXPRSParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_rule__EXPRS__E2Assignment_1_213268);
            ruleEXPRS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSAccess().getE2EXPRSParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRS__E2Assignment_1_2"


    // $ANTLR start "rule__EXPR__E1Assignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6589:1: rule__EXPR__E1Assignment_0 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPR__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6593:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6594:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6594:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6595:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getE1EXPRSIMPLEParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPR__E1Assignment_013299);
            ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRAccess().getE1EXPRSIMPLEParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPR__E1Assignment_0"


    // $ANTLR start "rule__EXPR__ExAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6604:1: rule__EXPR__ExAssignment_1 : ( ruleEXPRAND ) ;
    public final void rule__EXPR__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6608:1: ( ( ruleEXPRAND ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6609:1: ( ruleEXPRAND )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6609:1: ( ruleEXPRAND )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6610:1: ruleEXPRAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getExEXPRANDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_rule__EXPR__ExAssignment_113330);
            ruleEXPRAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRAccess().getExEXPRANDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPR__ExAssignment_1"


    // $ANTLR start "rule__EXPRSIMPLE__LAssignment_0_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6619:1: rule__EXPRSIMPLE__LAssignment_0_1 : ( RULE_VAR ) ;
    public final void rule__EXPRSIMPLE__LAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6623:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6624:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6624:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6625:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLVARTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__EXPRSIMPLE__LAssignment_0_113361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLVARTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__LAssignment_0_1"


    // $ANTLR start "rule__EXPRSIMPLE__SAssignment_0_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6634:1: rule__EXPRSIMPLE__SAssignment_0_2 : ( RULE_SYM ) ;
    public final void rule__EXPRSIMPLE__SAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6638:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6639:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6639:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6640:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getSSYMTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SAssignment_0_213392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getSSYMTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__SAssignment_0_2"


    // $ANTLR start "rule__EXPRSIMPLE__YyAssignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6649:1: rule__EXPRSIMPLE__YyAssignment_1_2 : ( ruleLEXPR ) ;
    public final void rule__EXPRSIMPLE__YyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6653:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6654:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6654:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6655:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getYyLEXPRParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__YyAssignment_1_213423);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getYyLEXPRParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__YyAssignment_1_2"


    // $ANTLR start "rule__EXPRSIMPLE__BAssignment_2_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6664:1: rule__EXPRSIMPLE__BAssignment_2_2 : ( ruleLEXPR ) ;
    public final void rule__EXPRSIMPLE__BAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6668:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6669:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6669:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6670:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getBLEXPRParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__BAssignment_2_213454);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getBLEXPRParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__BAssignment_2_2"


    // $ANTLR start "rule__EXPRSIMPLE__UAssignment_3_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6679:1: rule__EXPRSIMPLE__UAssignment_3_2 : ( ruleLCs ) ;
    public final void rule__EXPRSIMPLE__UAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6683:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6684:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6684:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6685:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getULCsParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__UAssignment_3_213485);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getULCsParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__UAssignment_3_2"


    // $ANTLR start "rule__EXPRSIMPLE__GAssignment_3_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6694:1: rule__EXPRSIMPLE__GAssignment_3_3 : ( ruleEXPR ) ;
    public final void rule__EXPRSIMPLE__GAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6698:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6699:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6699:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6700:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getGEXPRParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__GAssignment_3_313516);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getGEXPRParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__GAssignment_3_3"


    // $ANTLR start "rule__EXPRSIMPLE__NAssignment_4_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6709:1: rule__EXPRSIMPLE__NAssignment_4_3 : ( ruleEXPR ) ;
    public final void rule__EXPRSIMPLE__NAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6713:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6714:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6714:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6715:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getNEXPRParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__NAssignment_4_313547);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getNEXPRParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__NAssignment_4_3"


    // $ANTLR start "rule__EXPRSIMPLE__VAssignment_5_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6724:1: rule__EXPRSIMPLE__VAssignment_5_1 : ( RULE_SYM ) ;
    public final void rule__EXPRSIMPLE__VAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6728:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6729:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6729:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6730:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getVSYMTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__VAssignment_5_113578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getVSYMTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__VAssignment_5_1"


    // $ANTLR start "rule__EXPRSIMPLE__WAssignment_5_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6739:1: rule__EXPRSIMPLE__WAssignment_5_2 : ( ruleLEXPR ) ;
    public final void rule__EXPRSIMPLE__WAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6743:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6744:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6744:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6745:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getWLEXPRParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__WAssignment_5_213609);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getWLEXPRParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__WAssignment_5_2"


    // $ANTLR start "rule__LEXPR__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6754:1: rule__LEXPR__FAssignment_0 : ( ruleLCs ) ;
    public final void rule__LEXPR__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6758:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6759:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6759:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6760:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getFLCsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__LEXPR__FAssignment_013640);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getFLCsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__FAssignment_0"


    // $ANTLR start "rule__LEXPR__NAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6769:1: rule__LEXPR__NAssignment_1 : ( ruleEXPR ) ;
    public final void rule__LEXPR__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6773:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6774:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6774:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6775:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getNEXPRParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__LEXPR__NAssignment_113671);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getNEXPRParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__NAssignment_1"


    // $ANTLR start "rule__LEXPR__TAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6784:1: rule__LEXPR__TAssignment_2 : ( ruleLEXPR ) ;
    public final void rule__LEXPR__TAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6788:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6789:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6789:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6790:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getTLEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__LEXPR__TAssignment_213702);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRAccess().getTLEXPRParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEXPR__TAssignment_2"


    // $ANTLR start "rule__EXPRAND__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6799:1: rule__EXPRAND__FAssignment_0 : ( ruleEXPROR ) ;
    public final void rule__EXPRAND__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6803:1: ( ( ruleEXPROR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6804:1: ( ruleEXPROR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6804:1: ( ruleEXPROR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6805:1: ruleEXPROR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getFEXPRORParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_rule__EXPRAND__FAssignment_013733);
            ruleEXPROR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getFEXPRORParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__FAssignment_0"


    // $ANTLR start "rule__EXPRAND__Lc1Assignment_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6814:1: rule__EXPRAND__Lc1Assignment_1_0 : ( ruleLCs ) ;
    public final void rule__EXPRAND__Lc1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6818:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6819:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6819:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6820:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRAND__Lc1Assignment_1_013764);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Lc1Assignment_1_0"


    // $ANTLR start "rule__EXPRAND__Lc2Assignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6829:1: rule__EXPRAND__Lc2Assignment_1_2 : ( ruleLCs ) ;
    public final void rule__EXPRAND__Lc2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6833:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6834:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6834:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6835:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRAND__Lc2Assignment_1_213795);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__Lc2Assignment_1_2"


    // $ANTLR start "rule__EXPRAND__EeAssignment_1_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6844:1: rule__EXPRAND__EeAssignment_1_3 : ( ruleEXPRAND ) ;
    public final void rule__EXPRAND__EeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6848:1: ( ( ruleEXPRAND ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6849:1: ( ruleEXPRAND )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6849:1: ( ruleEXPRAND )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6850:1: ruleEXPRAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getEeEXPRANDParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_rule__EXPRAND__EeAssignment_1_313826);
            ruleEXPRAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDAccess().getEeEXPRANDParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRAND__EeAssignment_1_3"


    // $ANTLR start "rule__EXPROR__E1Assignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6859:1: rule__EXPROR__E1Assignment_0 : ( ruleEXPRNOT ) ;
    public final void rule__EXPROR__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6863:1: ( ( ruleEXPRNOT ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6864:1: ( ruleEXPRNOT )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6864:1: ( ruleEXPRNOT )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6865:1: ruleEXPRNOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE1EXPRNOTParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_rule__EXPROR__E1Assignment_013857);
            ruleEXPRNOT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getE1EXPRNOTParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__E1Assignment_0"


    // $ANTLR start "rule__EXPROR__Lc1Assignment_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6874:1: rule__EXPROR__Lc1Assignment_1_0 : ( ruleLCs ) ;
    public final void rule__EXPROR__Lc1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6878:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6879:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6879:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6880:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPROR__Lc1Assignment_1_013888);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Lc1Assignment_1_0"


    // $ANTLR start "rule__EXPROR__Lc2Assignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6889:1: rule__EXPROR__Lc2Assignment_1_2 : ( ruleLCs ) ;
    public final void rule__EXPROR__Lc2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6893:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6894:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6894:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6895:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPROR__Lc2Assignment_1_213919);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__Lc2Assignment_1_2"


    // $ANTLR start "rule__EXPROR__E2Assignment_1_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6904:1: rule__EXPROR__E2Assignment_1_3 : ( ruleEXPROR ) ;
    public final void rule__EXPROR__E2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6908:1: ( ( ruleEXPROR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6909:1: ( ruleEXPROR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6909:1: ( ruleEXPROR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6910:1: ruleEXPROR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE2EXPRORParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_rule__EXPROR__E2Assignment_1_313950);
            ruleEXPROR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORAccess().getE2EXPRORParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPROR__E2Assignment_1_3"


    // $ANTLR start "rule__EXPRNOT__Lc1Assignment_0_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6919:1: rule__EXPRNOT__Lc1Assignment_0_1 : ( ruleLCs ) ;
    public final void rule__EXPRNOT__Lc1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6923:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6924:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6924:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6925:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getLc1LCsParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRNOT__Lc1Assignment_0_113981);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getLc1LCsParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__Lc1Assignment_0_1"


    // $ANTLR start "rule__EXPRNOT__E1Assignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6934:1: rule__EXPRNOT__E1Assignment_1 : ( ruleEXPREQ ) ;
    public final void rule__EXPRNOT__E1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6938:1: ( ( ruleEXPREQ ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6939:1: ( ruleEXPREQ )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6939:1: ( ruleEXPREQ )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6940:1: ruleEXPREQ
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getE1EXPREQParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_rule__EXPRNOT__E1Assignment_114012);
            ruleEXPREQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTAccess().getE1EXPREQParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRNOT__E1Assignment_1"


    // $ANTLR start "rule__EXPREQ__E1Assignment_0_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6949:1: rule__EXPREQ__E1Assignment_0_0 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPREQ__E1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6953:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6954:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6954:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6955:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getE1EXPRSIMPLEParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__E1Assignment_0_014043);
            ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getE1EXPRSIMPLEParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__E1Assignment_0_0"


    // $ANTLR start "rule__EXPREQ__CccAssignment_0_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6964:1: rule__EXPREQ__CccAssignment_0_1 : ( ruleLCs ) ;
    public final void rule__EXPREQ__CccAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6968:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6969:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6969:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6970:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getCccLCsParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPREQ__CccAssignment_0_114074);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getCccLCsParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__CccAssignment_0_1"


    // $ANTLR start "rule__EXPREQ__Lc2Assignment_0_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6979:1: rule__EXPREQ__Lc2Assignment_0_3 : ( ruleLCs ) ;
    public final void rule__EXPREQ__Lc2Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6983:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6984:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6984:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6985:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLc2LCsParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPREQ__Lc2Assignment_0_314105);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getLc2LCsParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__Lc2Assignment_0_3"


    // $ANTLR start "rule__EXPREQ__WAssignment_0_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6994:1: rule__EXPREQ__WAssignment_0_4 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPREQ__WAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6998:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6999:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6999:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7000:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getWEXPRSIMPLEParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__WAssignment_0_414136);
            ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getWEXPRSIMPLEParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__WAssignment_0_4"


    // $ANTLR start "rule__EXPREQ__ExAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7009:1: rule__EXPREQ__ExAssignment_1_1 : ( ruleEXPR ) ;
    public final void rule__EXPREQ__ExAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7013:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7014:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7014:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7015:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getExEXPRParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPREQ__ExAssignment_1_114167);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQAccess().getExEXPRParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPREQ__ExAssignment_1_1"


    // $ANTLR start "rule__LCs__AAssignment"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7025:1: rule__LCs__AAssignment : ( ruleLC ) ;
    public final void rule__LCs__AAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7029:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7030:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7030:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7031:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsAccess().getALCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LCs__AAssignment14199);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsAccess().getALCParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCs__AAssignment"


    // $ANTLR start "rule__LC__AAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7040:1: rule__LC__AAssignment_0 : ( RULE_SP ) ;
    public final void rule__LC__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7044:1: ( ( RULE_SP ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7045:1: ( RULE_SP )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7045:1: ( RULE_SP )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7046:1: RULE_SP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getASPTerminalRuleCall_0_0()); 
            }
            match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LC__AAssignment_014230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getASPTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__AAssignment_0"


    // $ANTLR start "rule__LC__ZAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7055:1: rule__LC__ZAssignment_1 : ( RULE_CR ) ;
    public final void rule__LC__ZAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7059:1: ( ( RULE_CR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7060:1: ( RULE_CR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7060:1: ( RULE_CR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7061:1: RULE_CR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getZCRTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LC__ZAssignment_114261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getZCRTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__ZAssignment_1"


    // $ANTLR start "rule__LC__EAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7070:1: rule__LC__EAssignment_2 : ( RULE_TAB ) ;
    public final void rule__LC__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7074:1: ( ( RULE_TAB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7075:1: ( RULE_TAB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7075:1: ( RULE_TAB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7076:1: RULE_TAB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getETABTerminalRuleCall_2_0()); 
            }
            match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LC__EAssignment_214292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getETABTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__EAssignment_2"


    // $ANTLR start "rule__LC__RAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7085:1: rule__LC__RAssignment_3 : ( RULE_LF ) ;
    public final void rule__LC__RAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7089:1: ( ( RULE_LF ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7090:1: ( RULE_LF )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7090:1: ( RULE_LF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:7091:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getRLFTerminalRuleCall_3_0()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LC__RAssignment_314323); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getRLFTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__RAssignment_3"

    // $ANTLR start synpred9_InternalLangage_while
    public final void synpred9_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:1: ( ( ( rule__EXPR__E1Assignment_0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:1: ( ( rule__EXPR__E1Assignment_0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:1: ( ( rule__EXPR__E1Assignment_0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:865:1: ( rule__EXPR__E1Assignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRAccess().getE1Assignment_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:1: ( rule__EXPR__E1Assignment_0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:2: rule__EXPR__E1Assignment_0
        {
        pushFollow(FOLLOW_rule__EXPR__E1Assignment_0_in_synpred9_InternalLangage_while1810);
        rule__EXPR__E1Assignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalLangage_while

    // $ANTLR start synpred17_InternalLangage_while
    public final void synpred17_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:1: ( ( ( rule__EXPREQ__Group_0__0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:1: ( ( rule__EXPREQ__Group_0__0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:1: ( ( rule__EXPREQ__Group_0__0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:963:1: ( rule__EXPREQ__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPREQAccess().getGroup_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:1: ( rule__EXPREQ__Group_0__0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:2: rule__EXPREQ__Group_0__0
        {
        pushFollow(FOLLOW_rule__EXPREQ__Group_0__0_in_synpred17_InternalLangage_while2055);
        rule__EXPREQ__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalLangage_while

    // Delegated rules

    public final boolean synpred9_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLangage_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalLangage_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_entryRuleDef247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDef254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__0_in_ruleDef280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_in_ruleInput340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Alternatives_in_ruleOutput400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNop_in_entryRuleNop547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNop554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNop581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0_in_ruleAssign642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0_in_ruleForeach882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_entryRuleEXPRS969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRS976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__0_in_ruleEXPRS1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_entryRuleEXPR1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPR1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__Alternatives_in_ruleEXPR1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRSIMPLE1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Alternatives_in_ruleEXPRSIMPLE1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_entryRuleLEXPR1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEXPR1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__0_in_ruleLEXPR1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRAND1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__0_in_ruleEXPRAND1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_entryRuleEXPROR1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPROR1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__0_in_ruleEXPROR1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRNOT1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__0_in_ruleEXPRNOT1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPREQ1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Alternatives_in_ruleEXPREQ1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_entryRuleLCs1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCs1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LCs__AAssignment_in_ruleLCs1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__Alternatives_in_ruleLC1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__YAssignment_1_in_rule__Input__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__SAssignment_1_in_rule__Output__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AffectAssignment_1_in_rule__Command__Alternatives1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForrAssignment_3_in_rule__Command__Alternatives1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForeAssignment_4_in_rule__Command__Alternatives1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__IffAssignment_5_in_rule__Command__Alternatives1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__E1Assignment_0_in_rule__EXPR__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__ExAssignment_1_in_rule__EXPR__Alternatives1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Alternatives_0_in_rule__EXPRSIMPLE__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__0_in_rule__EXPRSIMPLE__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__0_in_rule__EXPRSIMPLE__Alternatives1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__0_in_rule__EXPRSIMPLE__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__0_in_rule__EXPRSIMPLE__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__0_in_rule__EXPRSIMPLE__Alternatives1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EXPRSIMPLE__Alternatives_01985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__LAssignment_0_1_in_rule__EXPRSIMPLE__Alternatives_02004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__SAssignment_0_2_in_rule__EXPRSIMPLE__Alternatives_02022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0_in_rule__EXPREQ__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__0_in_rule__EXPREQ__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__AAssignment_0_in_rule__LC__Alternatives2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__ZAssignment_1_in_rule__LC__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__EAssignment_2_in_rule__LC__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__RAssignment_3_in_rule__LC__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FAssignment_0_in_rule__Program__Group__0__Impl2221 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__02314 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__02317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__UAssignment_1_0_in_rule__Program__Group_1__0__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PpAssignment_1_1_in_rule__Program__Group_1__1__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02435 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__0__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NAssignment_1_in_rule__Function__Group__1__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22557 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_2_in_rule__Function__Group__2__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32617 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Function__Group__3__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42679 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__TAssignment_4_in_rule__Function__Group__4__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DAssignment_5_in_rule__Function__Group__5__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__0__Impl_in_rule__Def__Group__02808 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Def__Group__1_in_rule__Def__Group__02811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Def__Group__0__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__1__Impl_in_rule__Def__Group__12870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Def__Group__2_in_rule__Def__Group__12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__LAssignment_1_in_rule__Def__Group__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__2__Impl_in_rule__Def__Group__22930 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Def__Group__3_in_rule__Def__Group__22933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__InAssignment_2_in_rule__Def__Group__2__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__3__Impl_in_rule__Def__Group__32990 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Def__Group__4_in_rule__Def__Group__32993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__ZAssignment_3_in_rule__Def__Group__3__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__4__Impl_in_rule__Def__Group__43050 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__Def__Group__5_in_rule__Def__Group__43053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Def__Group__4__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__5__Impl_in_rule__Def__Group__53112 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Def__Group__6_in_rule__Def__Group__53115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__VAssignment_5_in_rule__Def__Group__5__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__6__Impl_in_rule__Def__Group__63172 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Def__Group__7_in_rule__Def__Group__63175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__SAssignment_6_in_rule__Def__Group__6__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__7__Impl_in_rule__Def__Group__73232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Def__Group__8_in_rule__Def__Group__73235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Def__Group__7__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__8__Impl_in_rule__Def__Group__83294 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Def__Group__9_in_rule__Def__Group__83297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Def__Group__8__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__9__Impl_in_rule__Def__Group__93356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Def__Group__10_in_rule__Def__Group__93359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__UAssignment_9_in_rule__Def__Group__9__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__10__Impl_in_rule__Def__Group__103416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__OAssignment_10_in_rule__Def__Group__10__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__03495 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__03498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_0_0_in_rule__Input__Group_0__0__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__13555 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Input__Group_0__2_in_rule__Input__Group_0__13558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_0__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__2__Impl_in_rule__Input__Group_0__23617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Input__Group_0__3_in_rule__Input__Group_0__23620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__ZAssignment_0_2_in_rule__Input__Group_0__2__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__3__Impl_in_rule__Input__Group_0__33677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__InAssignment_0_3_in_rule__Input__Group_0__3__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__03742 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__03745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__NAssignment_0_0_in_rule__Output__Group_0__0__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__13802 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Output__Group_0__2_in_rule__Output__Group_0__13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Output__Group_0__1__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__2__Impl_in_rule__Output__Group_0__23864 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Output__Group_0__3_in_rule__Output__Group_0__23867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__QAssignment_0_2_in_rule__Output__Group_0__2__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__3__Impl_in_rule__Output__Group_0__33924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__OAssignment_0_3_in_rule__Output__Group_0__3__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03989 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__AAssignment_0_in_rule__Commands__Group__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__14049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__04111 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Commands__Group_1__0__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__14173 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__14176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__LAssignment_1_1_in_rule__Commands__Group_1__1__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__24233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__SAssignment_1_2_in_rule__Commands__Group_1__2__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04296 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__EAssignment_0_in_rule__Assign__Group__0__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14356 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__LAssignment_1_in_rule__Assign__Group__1__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24416 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Assign__Group__2__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34478 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__CAssignment_3_in_rule__Assign__Group__3__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__NAssignment_4_in_rule__Assign__Group__4__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04605 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While__Group__0__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14667 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__LlAssignment_1_in_rule__While__Group__1__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24727 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__EeAssignment_2_in_rule__While__Group__2__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34787 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__CcAssignment_3_in_rule__While__Group__3__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44847 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While__Group__4__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54909 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ZAssignment_5_in_rule__While__Group__5__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64969 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__KAssignment_6_in_rule__While__Group__6__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75029 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__75032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__LcAssignment_7_in_rule__While__Group__7__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__8__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05166 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__0__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15228 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CcAssignment_1_in_rule__For__Group__1__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25288 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__HhAssignment_2_in_rule__For__Group__2__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__TtAssignment_3_in_rule__For__Group__3__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45408 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__For__Group__4__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55470 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__VvAssignment_5_in_rule__For__Group__5__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65530 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__C1Assignment_6_in_rule__For__Group__6__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__SsAssignment_7_in_rule__For__Group__7__Impl5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__For__Group__8__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05727 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__If__Group__0__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15789 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__MmAssignment_1_in_rule__If__Group__1__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25849 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__JjAssignment_2_in_rule__If__Group__2__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35909 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__35912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__KkAssignment_3_in_rule__If__Group__3__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45969 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__45972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__If__Group__4__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56031 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__56034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__HgAssignment_5_in_rule__If__Group__5__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66091 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__66094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__C2Assignment_6_in_rule__If__Group__6__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76151 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__76154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__GgAssignment_7_in_rule__If__Group__7__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86211 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__86214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__9__Impl6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06351 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group_8__0__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16413 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__FfAssignment_8_1_in_rule__If__Group_8__1__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26473 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__OAssignment_8_2_in_rule__If__Group_8__2__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__DdAssignment_8_3_in_rule__If__Group_8__3__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06598 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Foreach__Group__0__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16660 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__SqAssignment_1_in_rule__Foreach__Group__1__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26720 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__WxAssignment_2_in_rule__Foreach__Group__2__Impl6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36780 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__LcAssignment_3_in_rule__Foreach__Group__3__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46840 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Foreach__Group__4__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56902 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc2Assignment_5_in_rule__Foreach__Group__5__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66962 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__E1Assignment_6_in_rule__Foreach__Group__6__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__77022 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__77025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc3Assignment_7_in_rule__Foreach__Group__7__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87082 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Foreach__Group__8__Impl7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97144 = new BitSet(new long[]{0x0000001190040040L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc4Assignment_9_in_rule__Foreach__Group__9__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107204 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__C3Assignment_10_in_rule__Foreach__Group__10__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117264 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc5Assignment_11_in_rule__Foreach__Group__11__Impl7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Foreach__Group__12__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__AAssignment_0_in_rule__Vars__Group__0__Impl7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07531 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vars__Group_1__0__Impl7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17593 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__LAssignment_1_1_in_rule__Vars__Group_1__1__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__27653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__UAssignment_1_2_in_rule__Vars__Group_1__2__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__0__Impl_in_rule__EXPRS__Group__07716 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__1_in_rule__EXPRS__Group__07719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__FAssignment_0_in_rule__EXPRS__Group__0__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__1__Impl_in_rule__EXPRS__Group__17776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__0_in_rule__EXPRS__Group__1__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__0__Impl_in_rule__EXPRS__Group_1__07838 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__1_in_rule__EXPRS__Group_1__07841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EXPRS__Group_1__0__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__1__Impl_in_rule__EXPRS__Group_1__17900 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__2_in_rule__EXPRS__Group_1__17903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__LAssignment_1_1_in_rule__EXPRS__Group_1__1__Impl7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__2__Impl_in_rule__EXPRS__Group_1__27960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__E2Assignment_1_2_in_rule__EXPRS__Group_1__2__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__0__Impl_in_rule__EXPRSIMPLE__Group_1__08023 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__1_in_rule__EXPRSIMPLE__Group_1__08026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPRSIMPLE__Group_1__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__1__Impl_in_rule__EXPRSIMPLE__Group_1__18085 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__2_in_rule__EXPRSIMPLE__Group_1__18088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EXPRSIMPLE__Group_1__1__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__2__Impl_in_rule__EXPRSIMPLE__Group_1__28147 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__3_in_rule__EXPRSIMPLE__Group_1__28150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__YyAssignment_1_2_in_rule__EXPRSIMPLE__Group_1__2__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_1__3__Impl_in_rule__EXPRSIMPLE__Group_1__38207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPRSIMPLE__Group_1__3__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__0__Impl_in_rule__EXPRSIMPLE__Group_2__08274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__1_in_rule__EXPRSIMPLE__Group_2__08277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPRSIMPLE__Group_2__0__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__1__Impl_in_rule__EXPRSIMPLE__Group_2__18336 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__2_in_rule__EXPRSIMPLE__Group_2__18339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EXPRSIMPLE__Group_2__1__Impl8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__2__Impl_in_rule__EXPRSIMPLE__Group_2__28398 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__3_in_rule__EXPRSIMPLE__Group_2__28401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__BAssignment_2_2_in_rule__EXPRSIMPLE__Group_2__2__Impl8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_2__3__Impl_in_rule__EXPRSIMPLE__Group_2__38458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPRSIMPLE__Group_2__3__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__0__Impl_in_rule__EXPRSIMPLE__Group_3__08525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__1_in_rule__EXPRSIMPLE__Group_3__08528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPRSIMPLE__Group_3__0__Impl8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__1__Impl_in_rule__EXPRSIMPLE__Group_3__18587 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__2_in_rule__EXPRSIMPLE__Group_3__18590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EXPRSIMPLE__Group_3__1__Impl8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__2__Impl_in_rule__EXPRSIMPLE__Group_3__28649 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__3_in_rule__EXPRSIMPLE__Group_3__28652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__UAssignment_3_2_in_rule__EXPRSIMPLE__Group_3__2__Impl8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__3__Impl_in_rule__EXPRSIMPLE__Group_3__38709 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__4_in_rule__EXPRSIMPLE__Group_3__38712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__GAssignment_3_3_in_rule__EXPRSIMPLE__Group_3__3__Impl8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__4__Impl_in_rule__EXPRSIMPLE__Group_3__48769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPRSIMPLE__Group_3__4__Impl8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__0__Impl_in_rule__EXPRSIMPLE__Group_4__08838 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__1_in_rule__EXPRSIMPLE__Group_4__08841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPRSIMPLE__Group_4__0__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__1__Impl_in_rule__EXPRSIMPLE__Group_4__18900 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__2_in_rule__EXPRSIMPLE__Group_4__18903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EXPRSIMPLE__Group_4__1__Impl8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__2__Impl_in_rule__EXPRSIMPLE__Group_4__28962 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__3_in_rule__EXPRSIMPLE__Group_4__28965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__Group_4__2__Impl8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__3__Impl_in_rule__EXPRSIMPLE__Group_4__39021 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__4_in_rule__EXPRSIMPLE__Group_4__39024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__NAssignment_4_3_in_rule__EXPRSIMPLE__Group_4__3__Impl9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__4__Impl_in_rule__EXPRSIMPLE__Group_4__49081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPRSIMPLE__Group_4__4__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__0__Impl_in_rule__EXPRSIMPLE__Group_5__09150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__1_in_rule__EXPRSIMPLE__Group_5__09153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPRSIMPLE__Group_5__0__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__1__Impl_in_rule__EXPRSIMPLE__Group_5__19212 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__2_in_rule__EXPRSIMPLE__Group_5__19215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__VAssignment_5_1_in_rule__EXPRSIMPLE__Group_5__1__Impl9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__2__Impl_in_rule__EXPRSIMPLE__Group_5__29272 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__3_in_rule__EXPRSIMPLE__Group_5__29275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__WAssignment_5_2_in_rule__EXPRSIMPLE__Group_5__2__Impl9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__3__Impl_in_rule__EXPRSIMPLE__Group_5__39332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPRSIMPLE__Group_5__3__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__0__Impl_in_rule__LEXPR__Group__09399 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__1_in_rule__LEXPR__Group__09402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__FAssignment_0_in_rule__LEXPR__Group__0__Impl9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__1__Impl_in_rule__LEXPR__Group__19459 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__2_in_rule__LEXPR__Group__19462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__NAssignment_1_in_rule__LEXPR__Group__1__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__2__Impl_in_rule__LEXPR__Group__29519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__TAssignment_2_in_rule__LEXPR__Group__2__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__0__Impl_in_rule__EXPRAND__Group__09583 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__1_in_rule__EXPRAND__Group__09586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__FAssignment_0_in_rule__EXPRAND__Group__0__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__1__Impl_in_rule__EXPRAND__Group__19643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__0_in_rule__EXPRAND__Group__1__Impl9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__0__Impl_in_rule__EXPRAND__Group_1__09705 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__1_in_rule__EXPRAND__Group_1__09708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Lc1Assignment_1_0_in_rule__EXPRAND__Group_1__0__Impl9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__1__Impl_in_rule__EXPRAND__Group_1__19765 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__2_in_rule__EXPRAND__Group_1__19768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EXPRAND__Group_1__1__Impl9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__2__Impl_in_rule__EXPRAND__Group_1__29827 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__3_in_rule__EXPRAND__Group_1__29830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Lc2Assignment_1_2_in_rule__EXPRAND__Group_1__2__Impl9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__3__Impl_in_rule__EXPRAND__Group_1__39887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__EeAssignment_1_3_in_rule__EXPRAND__Group_1__3__Impl9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__0__Impl_in_rule__EXPROR__Group__09952 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__1_in_rule__EXPROR__Group__09955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__E1Assignment_0_in_rule__EXPROR__Group__0__Impl9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__1__Impl_in_rule__EXPROR__Group__110012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__0_in_rule__EXPROR__Group__1__Impl10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__0__Impl_in_rule__EXPROR__Group_1__010074 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__1_in_rule__EXPROR__Group_1__010077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Lc1Assignment_1_0_in_rule__EXPROR__Group_1__0__Impl10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__1__Impl_in_rule__EXPROR__Group_1__110134 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__2_in_rule__EXPROR__Group_1__110137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EXPROR__Group_1__1__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__2__Impl_in_rule__EXPROR__Group_1__210196 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__3_in_rule__EXPROR__Group_1__210199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Lc2Assignment_1_2_in_rule__EXPROR__Group_1__2__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__3__Impl_in_rule__EXPROR__Group_1__310256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__E2Assignment_1_3_in_rule__EXPROR__Group_1__3__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__0__Impl_in_rule__EXPRNOT__Group__010321 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__1_in_rule__EXPRNOT__Group__010324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__0_in_rule__EXPRNOT__Group__0__Impl10351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__1__Impl_in_rule__EXPRNOT__Group__110382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__E1Assignment_1_in_rule__EXPRNOT__Group__1__Impl10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__0__Impl_in_rule__EXPRNOT__Group_0__010443 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__1_in_rule__EXPRNOT__Group_0__010446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EXPRNOT__Group_0__0__Impl10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__1__Impl_in_rule__EXPRNOT__Group_0__110505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Lc1Assignment_0_1_in_rule__EXPRNOT__Group_0__1__Impl10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0__Impl_in_rule__EXPREQ__Group_0__010566 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__1_in_rule__EXPREQ__Group_0__010569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__E1Assignment_0_0_in_rule__EXPREQ__Group_0__0__Impl10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__1__Impl_in_rule__EXPREQ__Group_0__110626 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__2_in_rule__EXPREQ__Group_0__110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__CccAssignment_0_1_in_rule__EXPREQ__Group_0__1__Impl10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__2__Impl_in_rule__EXPREQ__Group_0__210686 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__3_in_rule__EXPREQ__Group_0__210689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EXPREQ__Group_0__2__Impl10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__3__Impl_in_rule__EXPREQ__Group_0__310748 = new BitSet(new long[]{0x0000004000080060L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__4_in_rule__EXPREQ__Group_0__310751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Lc2Assignment_0_3_in_rule__EXPREQ__Group_0__3__Impl10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__4__Impl_in_rule__EXPREQ__Group_0__410808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__WAssignment_0_4_in_rule__EXPREQ__Group_0__4__Impl10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__0__Impl_in_rule__EXPREQ__Group_1__010875 = new BitSet(new long[]{0x0000404000080060L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__1_in_rule__EXPREQ__Group_1__010878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EXPREQ__Group_1__0__Impl10906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__1__Impl_in_rule__EXPREQ__Group_1__110937 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__2_in_rule__EXPREQ__Group_1__110940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__ExAssignment_1_1_in_rule__EXPREQ__Group_1__1__Impl10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__2__Impl_in_rule__EXPREQ__Group_1__210997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EXPREQ__Group_1__2__Impl11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Model__GreetingsAssignment11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FAssignment_011098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__Program__UAssignment_1_011129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Program__PpAssignment_1_111160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Function__NAssignment_111191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__Function__NomAssignment_211222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Function__TAssignment_411253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_rule__Function__DAssignment_511284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__LAssignment_111315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Def__InAssignment_211346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__ZAssignment_311377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Def__VAssignment_511408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__SAssignment_611439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__UAssignment_911470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Def__OAssignment_1011501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__VAssignment_0_011532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Input__ZAssignment_0_211563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Input__InAssignment_0_311594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__YAssignment_111625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__NAssignment_0_011656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Output__QAssignment_0_211687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Output__OAssignment_0_311718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__SAssignment_111749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__AAssignment_011780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Commands__LAssignment_1_111811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Commands__SAssignment_1_211842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNop_in_rule__Command__NopAssignment_011873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_rule__Command__AffectAssignment_111904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Command__ForrAssignment_311966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_411997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Command__IffAssignment_512028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Assign__EAssignment_012059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Assign__LAssignment_112090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Assign__CAssignment_312121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_rule__Assign__NAssignment_412152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__LlAssignment_112183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__While__EeAssignment_212214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__CcAssignment_312245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__ZAssignment_512276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__While__KAssignment_612307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__LcAssignment_712338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__CcAssignment_112369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__For__HhAssignment_212400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__TtAssignment_312431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__VvAssignment_512462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__For__C1Assignment_612493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__SsAssignment_712524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__MmAssignment_112555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__If__JjAssignment_212586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__KkAssignment_312617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__HgAssignment_512648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__C2Assignment_612679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__GgAssignment_712710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__FfAssignment_8_112741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__OAssignment_8_212772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__DdAssignment_8_312803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__SqAssignment_112834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__Foreach__WxAssignment_212865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__LcAssignment_312896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc2Assignment_512927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__Foreach__E1Assignment_612958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc3Assignment_712989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc4Assignment_913020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Foreach__C3Assignment_1013051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc5Assignment_1113082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__AAssignment_013113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Vars__LAssignment_1_113144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__UAssignment_1_213175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPRS__FAssignment_013206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRS__LAssignment_1_113237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_rule__EXPRS__E2Assignment_1_213268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPR__E1Assignment_013299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_rule__EXPR__ExAssignment_113330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__EXPRSIMPLE__LAssignment_0_113361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SAssignment_0_213392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__YyAssignment_1_213423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__BAssignment_2_213454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__UAssignment_3_213485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__GAssignment_3_313516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__NAssignment_4_313547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__VAssignment_5_113578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__WAssignment_5_213609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__LEXPR__FAssignment_013640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__LEXPR__NAssignment_113671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__LEXPR__TAssignment_213702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_rule__EXPRAND__FAssignment_013733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRAND__Lc1Assignment_1_013764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRAND__Lc2Assignment_1_213795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_rule__EXPRAND__EeAssignment_1_313826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_rule__EXPROR__E1Assignment_013857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPROR__Lc1Assignment_1_013888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPROR__Lc2Assignment_1_213919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_rule__EXPROR__E2Assignment_1_313950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRNOT__Lc1Assignment_0_113981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_rule__EXPRNOT__E1Assignment_114012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__E1Assignment_0_014043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPREQ__CccAssignment_0_114074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPREQ__Lc2Assignment_0_314105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__WAssignment_0_414136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPREQ__ExAssignment_1_114167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LCs__AAssignment14199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LC__AAssignment_014230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LC__ZAssignment_114261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LC__EAssignment_214292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LC__RAssignment_314323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__E1Assignment_0_in_synpred9_InternalLangage_while1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0_in_synpred17_InternalLangage_while2055 = new BitSet(new long[]{0x0000000000000002L});

}