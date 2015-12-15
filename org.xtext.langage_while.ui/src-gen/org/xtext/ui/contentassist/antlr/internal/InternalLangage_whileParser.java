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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_BASEVAR", "RULE_CONF", "RULE_BASESYMB", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'('", "')'", "'and'", "'or'", "'not'", "'=?'", "'nop'", "'nil'"
    };
    public static final int RULE_LF=7;
    public static final int RULE_CR=5;
    public static final int RULE_TAB=6;
    public static final int RULE_BASESYMB=10;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SP=4;
    public static final int RULE_ID=11;
    public static final int RULE_CONF=9;
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
    public static final int RULE_BASEVAR=8;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:70:1: ruleModel : ( ( rule__Model__NnAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:74:2: ( ( ( rule__Model__NnAssignment ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__NnAssignment ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__NnAssignment ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:76:1: ( rule__Model__NnAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNnAssignment()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:1: ( rule__Model__NnAssignment )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:2: rule__Model__NnAssignment
            {
            pushFollow(FOLLOW_rule__Model__NnAssignment_in_ruleModel100);
            rule__Model__NnAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNnAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleDefinition"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:145:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:146:1: ( ruleDefinition EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:147:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition247);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:154:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:158:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Definition__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:160:1: ( rule__Definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:1: ( rule__Definition__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition280);
            rule__Definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:182:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:186:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Input__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:188:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:1: ( rule__Input__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput340);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:210:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:214:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Output__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Output__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:216:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:1: ( rule__Output__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput400);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleAssign"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:285:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:286:1: ( ruleAssign EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:287:1: ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign547);
            ruleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign554); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:294:1: ruleAssign : ( ( rule__Assign__Group__0 ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:298:2: ( ( ( rule__Assign__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:299:1: ( ( rule__Assign__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:299:1: ( ( rule__Assign__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:300:1: ( rule__Assign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:301:1: ( rule__Assign__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:301:2: rule__Assign__Group__0
            {
            pushFollow(FOLLOW_rule__Assign__Group__0_in_ruleAssign580);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:313:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:314:1: ( ruleWhile EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:315:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile607);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile614); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:322:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:326:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:327:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:327:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:328:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:1: ( rule__While__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile640);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:341:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:342:1: ( ruleFor EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:343:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor667);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor674); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:350:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:354:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:355:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:355:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:356:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:1: ( rule__For__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor700);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:369:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:370:1: ( ruleIf EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:371:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf727);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf734); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:378:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:382:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:383:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:383:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:384:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:1: ( rule__If__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf760);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:397:1: entryRuleForeach : ruleForeach EOF ;
    public final void entryRuleForeach() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:398:1: ( ruleForeach EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:399:1: ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach787);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach794); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:406:1: ruleForeach : ( ( rule__Foreach__Group__0 ) ) ;
    public final void ruleForeach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:410:2: ( ( ( rule__Foreach__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:411:1: ( ( rule__Foreach__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:411:1: ( ( rule__Foreach__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:412:1: ( rule__Foreach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:1: ( rule__Foreach__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:2: rule__Foreach__Group__0
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0_in_ruleForeach820);
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


    // $ANTLR start "entryRuleIfconfort"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:425:1: entryRuleIfconfort : ruleIfconfort EOF ;
    public final void entryRuleIfconfort() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:426:1: ( ruleIfconfort EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:427:1: ruleIfconfort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortRule()); 
            }
            pushFollow(FOLLOW_ruleIfconfort_in_entryRuleIfconfort847);
            ruleIfconfort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfconfort854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfconfort"


    // $ANTLR start "ruleIfconfort"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:434:1: ruleIfconfort : ( ( rule__Ifconfort__Group__0 ) ) ;
    public final void ruleIfconfort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:438:2: ( ( ( rule__Ifconfort__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:439:1: ( ( rule__Ifconfort__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:439:1: ( ( rule__Ifconfort__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:440:1: ( rule__Ifconfort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:1: ( rule__Ifconfort__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:2: rule__Ifconfort__Group__0
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__0_in_ruleIfconfort880);
            rule__Ifconfort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfconfort"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:453:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:454:1: ( ruleVars EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:455:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars907);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars914); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:462:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:466:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:467:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:467:1: ( ( rule__Vars__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:468:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:1: ( rule__Vars__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars940);
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


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:481:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:482:1: ( ruleExprs EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:483:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs967);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:490:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:494:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:495:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:495:1: ( ( rule__Exprs__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:496:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:1: ( rule__Exprs__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs1000);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:509:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:510:1: ( ruleExpr EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:511:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1027);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:518:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:522:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:523:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:523:1: ( ( rule__Expr__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:524:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:1: ( rule__Expr__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr1060);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:537:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:538:1: ( ruleExprSimple EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:539:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple1087);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:546:1: ruleExprSimple : ( ( rule__ExprSimple__Alternatives ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:550:2: ( ( ( rule__ExprSimple__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:551:1: ( ( rule__ExprSimple__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:551:1: ( ( rule__ExprSimple__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:552:1: ( rule__ExprSimple__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:1: ( rule__ExprSimple__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:2: rule__ExprSimple__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple1120);
            rule__ExprSimple__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLExpr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:565:1: entryRuleLExpr : ruleLExpr EOF ;
    public final void entryRuleLExpr() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:566:1: ( ruleLExpr EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:567:1: ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr1147);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:574:1: ruleLExpr : ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) ) ;
    public final void ruleLExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:578:2: ( ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:579:1: ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:579:1: ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:580:1: ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:580:1: ( ( rule__LExpr__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:581:1: ( rule__LExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:582:1: ( rule__LExpr__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:582:2: rule__LExpr__Group__0
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1182);
            rule__LExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getGroup()); 
            }

            }

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:585:1: ( ( rule__LExpr__Group__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:586:1: ( rule__LExpr__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:587:1: ( rule__LExpr__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SP && LA1_0<=RULE_BASEVAR)||LA1_0==RULE_BASESYMB||LA1_0==40||LA1_0==44||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:587:2: rule__LExpr__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1194);
            	    rule__LExpr__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprAnd"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:600:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:601:1: ( ruleExprAnd EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:602:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd1224);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd1231); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:609:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:613:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:614:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:614:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:615:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:616:1: ( rule__ExprAnd__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:616:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1257);
            rule__ExprAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:628:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:629:1: ( ruleExprOr EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:630:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr1284);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr1291); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:637:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:641:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:642:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:642:1: ( ( rule__ExprOr__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:643:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:644:1: ( rule__ExprOr__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:644:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1317);
            rule__ExprOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:656:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:657:1: ( ruleExprNot EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:658:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1344);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1351); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:665:1: ruleExprNot : ( ( rule__ExprNot__Alternatives ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:669:2: ( ( ( rule__ExprNot__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:670:1: ( ( rule__ExprNot__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:670:1: ( ( rule__ExprNot__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:671:1: ( rule__ExprNot__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:672:1: ( rule__ExprNot__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:672:2: rule__ExprNot__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1377);
            rule__ExprNot__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:684:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:685:1: ( ruleExprEq EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:686:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1404);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1411); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:693:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:697:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:698:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:698:1: ( ( rule__ExprEq__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:699:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:700:1: ( rule__ExprEq__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:700:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1437);
            rule__ExprEq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleVAR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:712:1: entryRuleVAR : ruleVAR EOF ;
    public final void entryRuleVAR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:713:1: ( ruleVAR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:714:1: ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_entryRuleVAR1464);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR1471); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:721:1: ruleVAR : ( ( rule__VAR__Group__0 ) ) ;
    public final void ruleVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:725:2: ( ( ( rule__VAR__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:726:1: ( ( rule__VAR__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:726:1: ( ( rule__VAR__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:727:1: ( rule__VAR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:728:1: ( rule__VAR__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:728:2: rule__VAR__Group__0
            {
            pushFollow(FOLLOW_rule__VAR__Group__0_in_ruleVAR1497);
            rule__VAR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleSYMB"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:740:1: entryRuleSYMB : ruleSYMB EOF ;
    public final void entryRuleSYMB() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:741:1: ( ruleSYMB EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:742:1: ruleSYMB EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBRule()); 
            }
            pushFollow(FOLLOW_ruleSYMB_in_entryRuleSYMB1524);
            ruleSYMB();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSYMB1531); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSYMB"


    // $ANTLR start "ruleSYMB"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:749:1: ruleSYMB : ( ( rule__SYMB__Group__0 ) ) ;
    public final void ruleSYMB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:753:2: ( ( ( rule__SYMB__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:754:1: ( ( rule__SYMB__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:754:1: ( ( rule__SYMB__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:755:1: ( rule__SYMB__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:756:1: ( rule__SYMB__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:756:2: rule__SYMB__Group__0
            {
            pushFollow(FOLLOW_rule__SYMB__Group__0_in_ruleSYMB1557);
            rule__SYMB__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSYMB"


    // $ANTLR start "entryRuleLC"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:768:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:769:1: ( ruleLC EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:770:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1584);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1591); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:777:1: ruleLC : ( ( ruleLCs )? ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:781:2: ( ( ( ruleLCs )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:782:1: ( ( ruleLCs )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:782:1: ( ( ruleLCs )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:783:1: ( ruleLCs )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getLCsParserRuleCall()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:784:1: ( ruleLCs )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_LF)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:784:3: ruleLCs
                    {
                    pushFollow(FOLLOW_ruleLCs_in_ruleLC1618);
                    ruleLCs();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getLCsParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleLCs"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:796:1: entryRuleLCs : ruleLCs EOF ;
    public final void entryRuleLCs() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:797:1: ( ruleLCs EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:798:1: ruleLCs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsRule()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_entryRuleLCs1646);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCs1653); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:805:1: ruleLCs : ( ( rule__LCs__Alternatives ) ) ;
    public final void ruleLCs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:809:2: ( ( ( rule__LCs__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:810:1: ( ( rule__LCs__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:810:1: ( ( rule__LCs__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:811:1: ( rule__LCs__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:812:1: ( rule__LCs__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:812:2: rule__LCs__Alternatives
            {
            pushFollow(FOLLOW_rule__LCs__Alternatives_in_ruleLCs1679);
            rule__LCs__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Command__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:824:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AssignAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForAssignment_3 ) ) | ( ( rule__Command__IfAssignment_4 ) ) | ( ( rule__Command__ForeAssignment_5 ) ) | ( ( rule__Command__IfcAssignment_6 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:828:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AssignAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForAssignment_3 ) ) | ( ( rule__Command__IfAssignment_4 ) ) | ( ( rule__Command__ForeAssignment_5 ) ) | ( ( rule__Command__IfcAssignment_6 ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case RULE_BASEVAR:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 34:
                {
                int LA3_5 = input.LA(2);

                if ( (synpred7_InternalLangage_while()) ) {
                    alt3=5;
                }
                else if ( (true) ) {
                    alt3=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:829:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:829:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:830:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:831:1: ( rule__Command__NopAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:831:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1715);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:835:6: ( ( rule__Command__AssignAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:835:6: ( ( rule__Command__AssignAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( rule__Command__AssignAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getAssignAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:837:1: ( rule__Command__AssignAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:837:2: rule__Command__AssignAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Command__AssignAssignment_1_in_rule__Command__Alternatives1733);
                    rule__Command__AssignAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getAssignAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:841:6: ( ( rule__Command__WhAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:841:6: ( ( rule__Command__WhAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:842:1: ( rule__Command__WhAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getWhAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:843:1: ( rule__Command__WhAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:843:2: rule__Command__WhAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1751);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:847:6: ( ( rule__Command__ForAssignment_3 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:847:6: ( ( rule__Command__ForAssignment_3 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:848:1: ( rule__Command__ForAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForAssignment_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:849:1: ( rule__Command__ForAssignment_3 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:849:2: rule__Command__ForAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__ForAssignment_3_in_rule__Command__Alternatives1769);
                    rule__Command__ForAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getForAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:6: ( ( rule__Command__IfAssignment_4 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:6: ( ( rule__Command__IfAssignment_4 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:854:1: ( rule__Command__IfAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getIfAssignment_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:855:1: ( rule__Command__IfAssignment_4 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:855:2: rule__Command__IfAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__IfAssignment_4_in_rule__Command__Alternatives1787);
                    rule__Command__IfAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getIfAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:859:6: ( ( rule__Command__ForeAssignment_5 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:859:6: ( ( rule__Command__ForeAssignment_5 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:860:1: ( rule__Command__ForeAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForeAssignment_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:861:1: ( rule__Command__ForeAssignment_5 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:861:2: rule__Command__ForeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Command__ForeAssignment_5_in_rule__Command__Alternatives1805);
                    rule__Command__ForeAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getForeAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:865:6: ( ( rule__Command__IfcAssignment_6 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:865:6: ( ( rule__Command__IfcAssignment_6 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:1: ( rule__Command__IfcAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getIfcAssignment_6()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:867:1: ( rule__Command__IfcAssignment_6 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:867:2: rule__Command__IfcAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Command__IfcAssignment_6_in_rule__Command__Alternatives1823);
                    rule__Command__IfcAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getIfcAssignment_6()); 
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


    // $ANTLR start "rule__Expr__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:876:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExsAssignment_0 ) ) | ( ( rule__Expr__ExaAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:880:1: ( ( ( rule__Expr__ExsAssignment_0 ) ) | ( ( rule__Expr__ExaAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_BASEVAR:
            case RULE_BASESYMB:
            case 47:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred9_InternalLangage_while()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt4=2;
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: ( ( rule__Expr__ExsAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: ( ( rule__Expr__ExsAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:882:1: ( rule__Expr__ExsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExsAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:883:1: ( rule__Expr__ExsAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:883:2: rule__Expr__ExsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExsAssignment_0_in_rule__Expr__Alternatives1856);
                    rule__Expr__ExsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:887:6: ( ( rule__Expr__ExaAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:887:6: ( ( rule__Expr__ExaAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:888:1: ( rule__Expr__ExaAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExaAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:889:1: ( rule__Expr__ExaAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:889:2: rule__Expr__ExaAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExaAssignment_1_in_rule__Expr__Alternatives1874);
                    rule__Expr__ExaAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExaAssignment_1()); 
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
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:898:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__NilAssignment_0 ) ) | ( ( rule__ExprSimple__VAssignment_1 ) ) | ( ( rule__ExprSimple__SymAssignment_2 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:902:1: ( ( ( rule__ExprSimple__NilAssignment_0 ) ) | ( ( rule__ExprSimple__VAssignment_1 ) ) | ( ( rule__ExprSimple__SymAssignment_2 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case RULE_BASEVAR:
                {
                alt5=2;
                }
                break;
            case RULE_BASESYMB:
                {
                alt5=3;
                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 20:
                case 21:
                    {
                    alt5=5;
                    }
                    break;
                case 18:
                case 19:
                    {
                    alt5=4;
                    }
                    break;
                case RULE_BASESYMB:
                    {
                    alt5=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }

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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:903:1: ( ( rule__ExprSimple__NilAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:903:1: ( ( rule__ExprSimple__NilAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:904:1: ( rule__ExprSimple__NilAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getNilAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:905:1: ( rule__ExprSimple__NilAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:905:2: rule__ExprSimple__NilAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__NilAssignment_0_in_rule__ExprSimple__Alternatives1907);
                    rule__ExprSimple__NilAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getNilAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:909:6: ( ( rule__ExprSimple__VAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:909:6: ( ( rule__ExprSimple__VAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:910:1: ( rule__ExprSimple__VAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:911:1: ( rule__ExprSimple__VAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:911:2: rule__ExprSimple__VAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VAssignment_1_in_rule__ExprSimple__Alternatives1925);
                    rule__ExprSimple__VAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getVAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:915:6: ( ( rule__ExprSimple__SymAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:915:6: ( ( rule__ExprSimple__SymAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:916:1: ( rule__ExprSimple__SymAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:917:1: ( rule__ExprSimple__SymAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:917:2: rule__ExprSimple__SymAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymAssignment_2_in_rule__ExprSimple__Alternatives1943);
                    rule__ExprSimple__SymAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getSymAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:921:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:921:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:922:1: ( rule__ExprSimple__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:923:1: ( rule__ExprSimple__Group_3__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:923:2: rule__ExprSimple__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1961);
                    rule__ExprSimple__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:927:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:927:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:928:1: ( rule__ExprSimple__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:929:1: ( rule__ExprSimple__Group_4__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:929:2: rule__ExprSimple__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1979);
                    rule__ExprSimple__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:933:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:933:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:934:1: ( rule__ExprSimple__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:935:1: ( rule__ExprSimple__Group_5__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:935:2: rule__ExprSimple__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1997);
                    rule__ExprSimple__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ExprSimple__Alternatives"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_3_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:944:1: rule__ExprSimple__MotAlternatives_3_1_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__ExprSimple__MotAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:948:1: ( ( 'cons' ) | ( 'list' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:949:1: ( 'cons' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:949:1: ( 'cons' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:950:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotConsKeyword_3_1_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ExprSimple__MotAlternatives_3_1_02031); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotConsKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:957:6: ( 'list' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:957:6: ( 'list' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:958:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotListKeyword_3_1_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__ExprSimple__MotAlternatives_3_1_02051); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotListKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__MotAlternatives_3_1_0"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_4_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:970:1: rule__ExprSimple__MotAlternatives_4_1_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__ExprSimple__MotAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:974:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:975:1: ( 'hd' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:975:1: ( 'hd' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:976:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotHdKeyword_4_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__ExprSimple__MotAlternatives_4_1_02086); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotHdKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:983:6: ( 'tl' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:983:6: ( 'tl' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:984:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotTlKeyword_4_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__ExprSimple__MotAlternatives_4_1_02106); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotTlKeyword_4_1_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__MotAlternatives_4_1_0"


    // $ANTLR start "rule__ExprNot__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:996:1: rule__ExprNot__Alternatives : ( ( ( rule__ExprNot__Group_0__0 ) ) | ( ( rule__ExprNot__ExQ2Assignment_1 ) ) );
    public final void rule__ExprNot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1000:1: ( ( ( rule__ExprNot__Group_0__0 ) ) | ( ( rule__ExprNot__ExQ2Assignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1001:1: ( ( rule__ExprNot__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1001:1: ( ( rule__ExprNot__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1002:1: ( rule__ExprNot__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1003:1: ( rule__ExprNot__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1003:2: rule__ExprNot__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__Group_0__0_in_rule__ExprNot__Alternatives2140);
                    rule__ExprNot__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprNotAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1007:6: ( ( rule__ExprNot__ExQ2Assignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1007:6: ( ( rule__ExprNot__ExQ2Assignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1008:1: ( rule__ExprNot__ExQ2Assignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getExQ2Assignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1009:1: ( rule__ExprNot__ExQ2Assignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1009:2: rule__ExprNot__ExQ2Assignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprNot__ExQ2Assignment_1_in_rule__ExprNot__Alternatives2158);
                    rule__ExprNot__ExQ2Assignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprNotAccess().getExQ2Assignment_1()); 
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
    // $ANTLR end "rule__ExprNot__Alternatives"


    // $ANTLR start "rule__ExprEq__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1018:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1022:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred18_InternalLangage_while()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1023:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1023:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1024:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1025:1: ( rule__ExprEq__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1025:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2191);
                    rule__ExprEq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1029:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1029:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1030:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1031:1: ( rule__ExprEq__Group_1__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1031:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2209);
                    rule__ExprEq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ExprEq__Alternatives"


    // $ANTLR start "rule__LCs__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1040:1: rule__LCs__Alternatives : ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) );
    public final void rule__LCs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1044:1: ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt10=1;
                }
                break;
            case RULE_CR:
                {
                alt10=2;
                }
                break;
            case RULE_TAB:
                {
                alt10=3;
                }
                break;
            case RULE_LF:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1045:1: ( RULE_SP )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1045:1: ( RULE_SP )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1046:1: RULE_SP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCsAccess().getSPTerminalRuleCall_0()); 
                    }
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LCs__Alternatives2242); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCsAccess().getSPTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1051:6: ( RULE_CR )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1051:6: ( RULE_CR )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1052:1: RULE_CR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCsAccess().getCRTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LCs__Alternatives2259); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCsAccess().getCRTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1057:6: ( RULE_TAB )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1057:6: ( RULE_TAB )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1058:1: RULE_TAB
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCsAccess().getTABTerminalRuleCall_2()); 
                    }
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LCs__Alternatives2276); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCsAccess().getTABTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1063:6: ( RULE_LF )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1063:6: ( RULE_LF )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1064:1: RULE_LF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCsAccess().getLFTerminalRuleCall_3()); 
                    }
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LCs__Alternatives2293); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCsAccess().getLFTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__LCs__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1076:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1080:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1081:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02323);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02326);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1088:1: rule__Program__Group__0__Impl : ( ( rule__Program__FAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1092:1: ( ( ( rule__Program__FAssignment_0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1093:1: ( ( rule__Program__FAssignment_0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1093:1: ( ( rule__Program__FAssignment_0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1094:1: ( rule__Program__FAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1095:1: ( rule__Program__FAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1095:2: rule__Program__FAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Program__FAssignment_0_in_rule__Program__Group__0__Impl2353);
            	    rule__Program__FAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1105:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1109:1: ( rule__Program__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1110:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12384);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1116:1: rule__Program__Group__1__Impl : ( ( rule__Program__Group_1__0 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1120:1: ( ( ( rule__Program__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1121:1: ( ( rule__Program__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1121:1: ( ( rule__Program__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1122:1: ( rule__Program__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1123:1: ( rule__Program__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1123:2: rule__Program__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl2411);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1137:1: rule__Program__Group_1__0 : rule__Program__Group_1__0__Impl rule__Program__Group_1__1 ;
    public final void rule__Program__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1141:1: ( rule__Program__Group_1__0__Impl rule__Program__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1142:2: rule__Program__Group_1__0__Impl rule__Program__Group_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__02446);
            rule__Program__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__02449);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1149:1: rule__Program__Group_1__0__Impl : ( ( rule__Program__UAssignment_1_0 ) ) ;
    public final void rule__Program__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1153:1: ( ( ( rule__Program__UAssignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1154:1: ( ( rule__Program__UAssignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1154:1: ( ( rule__Program__UAssignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1155:1: ( rule__Program__UAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getUAssignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1156:1: ( rule__Program__UAssignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1156:2: rule__Program__UAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Program__UAssignment_1_0_in_rule__Program__Group_1__0__Impl2476);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1166:1: rule__Program__Group_1__1 : rule__Program__Group_1__1__Impl ;
    public final void rule__Program__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1170:1: ( rule__Program__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1171:2: rule__Program__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__12506);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1177:1: rule__Program__Group_1__1__Impl : ( ( rule__Program__PpAssignment_1_1 ) ) ;
    public final void rule__Program__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1181:1: ( ( ( rule__Program__PpAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1182:1: ( ( rule__Program__PpAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1182:1: ( ( rule__Program__PpAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1183:1: ( rule__Program__PpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPpAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1184:1: ( rule__Program__PpAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1184:2: rule__Program__PpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Program__PpAssignment_1_1_in_rule__Program__Group_1__1__Impl2533);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1198:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1202:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1203:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02567);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02570);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1210:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1214:1: ( ( 'function' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1215:1: ( 'function' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1215:1: ( 'function' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1216:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Function__Group__0__Impl2598); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1229:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1233:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1234:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12629);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12632);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1241:1: rule__Function__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1245:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1246:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1246:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1247:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Function__Group__1__Impl2659);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1258:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1262:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1263:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22688);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22691);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1270:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1274:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1275:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1275:1: ( ( rule__Function__NameAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1276:1: ( rule__Function__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1277:1: ( rule__Function__NameAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1277:2: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_2_in_rule__Function__Group__2__Impl2718);
            rule__Function__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1287:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1291:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1292:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32748);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32751);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1299:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1303:1: ( ( ':' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:1: ( ':' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:1: ( ':' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1305:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Function__Group__3__Impl2779); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1318:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1322:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1323:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42810);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42813);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1330:1: rule__Function__Group__4__Impl : ( ruleLC ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1334:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1335:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1335:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1336:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Function__Group__4__Impl2840);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCParserRuleCall_4()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1347:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1351:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1352:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52869);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1358:1: rule__Function__Group__5__Impl : ( ( rule__Function__DefAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1362:1: ( ( ( rule__Function__DefAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1363:1: ( ( rule__Function__DefAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1363:1: ( ( rule__Function__DefAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1364:1: ( rule__Function__DefAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1365:1: ( rule__Function__DefAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1365:2: rule__Function__DefAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2896);
            rule__Function__DefAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Definition__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1387:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1391:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1392:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02938);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02941);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1399:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1403:1: ( ( 'read' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1404:1: ( 'read' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1404:1: ( 'read' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1405:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Definition__Group__0__Impl2969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1418:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1422:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1423:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13000);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13003);
            rule__Definition__Group__2();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1430:1: rule__Definition__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1434:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1435:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1435:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1436:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Definition__Group__1__Impl3030);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1447:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1451:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1452:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23059);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23062);
            rule__Definition__Group__3();

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
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1459:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__InAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1463:1: ( ( ( rule__Definition__InAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1464:1: ( ( rule__Definition__InAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1464:1: ( ( rule__Definition__InAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1465:1: ( rule__Definition__InAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1466:1: ( rule__Definition__InAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1466:2: rule__Definition__InAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__InAssignment_2_in_rule__Definition__Group__2__Impl3089);
            rule__Definition__InAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1476:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1480:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1481:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33119);
            rule__Definition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33122);
            rule__Definition__Group__4();

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
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1488:1: rule__Definition__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1492:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1493:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1493:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1494:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Definition__Group__3__Impl3149);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1505:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1509:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1510:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43178);
            rule__Definition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__43181);
            rule__Definition__Group__5();

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
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1517:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1521:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1522:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1522:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1523:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__Definition__Group__4__Impl3209); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1536:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1540:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1541:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53240);
            rule__Definition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__53243);
            rule__Definition__Group__6();

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
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1548:1: rule__Definition__Group__5__Impl : ( ( rule__Definition__ComAssignment_5 ) ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1552:1: ( ( ( rule__Definition__ComAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1553:1: ( ( rule__Definition__ComAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1553:1: ( ( rule__Definition__ComAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1554:1: ( rule__Definition__ComAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getComAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1555:1: ( rule__Definition__ComAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1555:2: rule__Definition__ComAssignment_5
            {
            pushFollow(FOLLOW_rule__Definition__ComAssignment_5_in_rule__Definition__Group__5__Impl3270);
            rule__Definition__ComAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getComAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1565:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl rule__Definition__Group__7 ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1569:1: ( rule__Definition__Group__6__Impl rule__Definition__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1570:2: rule__Definition__Group__6__Impl rule__Definition__Group__7
            {
            pushFollow(FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__63300);
            rule__Definition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__7_in_rule__Definition__Group__63303);
            rule__Definition__Group__7();

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
    // $ANTLR end "rule__Definition__Group__6"


    // $ANTLR start "rule__Definition__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1577:1: rule__Definition__Group__6__Impl : ( ruleLC ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1581:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1582:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1582:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1583:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getLCParserRuleCall_6()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Definition__Group__6__Impl3330);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getLCParserRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6__Impl"


    // $ANTLR start "rule__Definition__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1594:1: rule__Definition__Group__7 : rule__Definition__Group__7__Impl rule__Definition__Group__8 ;
    public final void rule__Definition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1598:1: ( rule__Definition__Group__7__Impl rule__Definition__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1599:2: rule__Definition__Group__7__Impl rule__Definition__Group__8
            {
            pushFollow(FOLLOW_rule__Definition__Group__7__Impl_in_rule__Definition__Group__73359);
            rule__Definition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__8_in_rule__Definition__Group__73362);
            rule__Definition__Group__8();

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
    // $ANTLR end "rule__Definition__Group__7"


    // $ANTLR start "rule__Definition__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1606:1: rule__Definition__Group__7__Impl : ( '%' ) ;
    public final void rule__Definition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1610:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1611:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1611:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1612:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_7()); 
            }
            match(input,25,FOLLOW_25_in_rule__Definition__Group__7__Impl3390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__7__Impl"


    // $ANTLR start "rule__Definition__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1625:1: rule__Definition__Group__8 : rule__Definition__Group__8__Impl rule__Definition__Group__9 ;
    public final void rule__Definition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1629:1: ( rule__Definition__Group__8__Impl rule__Definition__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1630:2: rule__Definition__Group__8__Impl rule__Definition__Group__9
            {
            pushFollow(FOLLOW_rule__Definition__Group__8__Impl_in_rule__Definition__Group__83421);
            rule__Definition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__9_in_rule__Definition__Group__83424);
            rule__Definition__Group__9();

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
    // $ANTLR end "rule__Definition__Group__8"


    // $ANTLR start "rule__Definition__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1637:1: rule__Definition__Group__8__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1641:1: ( ( 'write' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1642:1: ( 'write' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1642:1: ( 'write' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1643:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getWriteKeyword_8()); 
            }
            match(input,26,FOLLOW_26_in_rule__Definition__Group__8__Impl3452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getWriteKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__8__Impl"


    // $ANTLR start "rule__Definition__Group__9"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1656:1: rule__Definition__Group__9 : rule__Definition__Group__9__Impl rule__Definition__Group__10 ;
    public final void rule__Definition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1660:1: ( rule__Definition__Group__9__Impl rule__Definition__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1661:2: rule__Definition__Group__9__Impl rule__Definition__Group__10
            {
            pushFollow(FOLLOW_rule__Definition__Group__9__Impl_in_rule__Definition__Group__93483);
            rule__Definition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__10_in_rule__Definition__Group__93486);
            rule__Definition__Group__10();

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
    // $ANTLR end "rule__Definition__Group__9"


    // $ANTLR start "rule__Definition__Group__9__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1668:1: rule__Definition__Group__9__Impl : ( ruleLC ) ;
    public final void rule__Definition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1672:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1673:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1673:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1674:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Definition__Group__9__Impl3513);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__9__Impl"


    // $ANTLR start "rule__Definition__Group__10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1685:1: rule__Definition__Group__10 : rule__Definition__Group__10__Impl ;
    public final void rule__Definition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1689:1: ( rule__Definition__Group__10__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1690:2: rule__Definition__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__10__Impl_in_rule__Definition__Group__103542);
            rule__Definition__Group__10__Impl();

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
    // $ANTLR end "rule__Definition__Group__10"


    // $ANTLR start "rule__Definition__Group__10__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1696:1: rule__Definition__Group__10__Impl : ( ( rule__Definition__OutAssignment_10 ) ) ;
    public final void rule__Definition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1700:1: ( ( ( rule__Definition__OutAssignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1701:1: ( ( rule__Definition__OutAssignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1701:1: ( ( rule__Definition__OutAssignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1702:1: ( rule__Definition__OutAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutAssignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1703:1: ( rule__Definition__OutAssignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1703:2: rule__Definition__OutAssignment_10
            {
            pushFollow(FOLLOW_rule__Definition__OutAssignment_10_in_rule__Definition__Group__10__Impl3569);
            rule__Definition__OutAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1735:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1739:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1740:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03621);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03624);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1747:1: rule__Input__Group__0__Impl : ( ( rule__Input__VAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1751:1: ( ( ( rule__Input__VAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1752:1: ( ( rule__Input__VAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1752:1: ( ( rule__Input__VAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1753:1: ( rule__Input__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1754:1: ( rule__Input__VAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1754:2: rule__Input__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl3651);
            rule__Input__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1764:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1768:1: ( rule__Input__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1769:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13681);
            rule__Input__Group__1__Impl();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1775:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1779:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1780:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1780:1: ( ( rule__Input__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1781:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1782:1: ( rule__Input__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1782:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3708);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1796:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1800:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1801:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03743);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03746);
            rule__Input__Group_1__1();

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
    // $ANTLR end "rule__Input__Group_1__0"


    // $ANTLR start "rule__Input__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1808:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1812:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1813:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1813:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1814:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Input__Group_1__0__Impl3774); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0__Impl"


    // $ANTLR start "rule__Input__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1827:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1831:1: ( rule__Input__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1832:2: rule__Input__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13805);
            rule__Input__Group_1__1__Impl();

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
    // $ANTLR end "rule__Input__Group_1__1"


    // $ANTLR start "rule__Input__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1838:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__VAssignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1842:1: ( ( ( rule__Input__VAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1843:1: ( ( rule__Input__VAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1843:1: ( ( rule__Input__VAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1844:1: ( rule__Input__VAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1845:1: ( rule__Input__VAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1845:2: rule__Input__VAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_1_1_in_rule__Input__Group_1__1__Impl3832);
            rule__Input__VAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1859:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1863:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1864:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03866);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03869);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1871:1: rule__Output__Group__0__Impl : ( ( rule__Output__VAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1875:1: ( ( ( rule__Output__VAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1876:1: ( ( rule__Output__VAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1876:1: ( ( rule__Output__VAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1877:1: ( rule__Output__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1878:1: ( rule__Output__VAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1878:2: rule__Output__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3896);
            rule__Output__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1888:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1892:1: ( rule__Output__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1893:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13926);
            rule__Output__Group__1__Impl();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1899:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1903:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1904:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1904:1: ( ( rule__Output__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1905:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1906:1: ( rule__Output__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1906:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3953);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1920:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1924:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1925:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03988);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03991);
            rule__Output__Group_1__1();

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
    // $ANTLR end "rule__Output__Group_1__0"


    // $ANTLR start "rule__Output__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1932:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1936:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1937:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1937:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1938:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Output__Group_1__0__Impl4019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0__Impl"


    // $ANTLR start "rule__Output__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1951:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1955:1: ( rule__Output__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1956:2: rule__Output__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__14050);
            rule__Output__Group_1__1__Impl();

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
    // $ANTLR end "rule__Output__Group_1__1"


    // $ANTLR start "rule__Output__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1962:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__VAssignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1966:1: ( ( ( rule__Output__VAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1967:1: ( ( rule__Output__VAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1967:1: ( ( rule__Output__VAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1968:1: ( rule__Output__VAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1969:1: ( rule__Output__VAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1969:2: rule__Output__VAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Output__VAssignment_1_1_in_rule__Output__Group_1__1__Impl4077);
            rule__Output__VAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1983:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1987:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1988:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__04111);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__04114);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1995:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1999:1: ( ( ( rule__Commands__CAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2000:1: ( ( rule__Commands__CAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2000:1: ( ( rule__Commands__CAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2001:1: ( rule__Commands__CAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2002:1: ( rule__Commands__CAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2002:2: rule__Commands__CAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl4141);
            rule__Commands__CAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2012:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2016:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2017:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__14171);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2023:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2027:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2028:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2028:1: ( ( rule__Commands__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2029:1: ( rule__Commands__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2030:1: ( rule__Commands__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2030:2: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl4198);
            	    rule__Commands__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2044:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2048:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2049:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__04233);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__04236);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2056:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2060:1: ( ( ';' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2061:1: ( ';' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2061:1: ( ';' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2062:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Commands__Group_1__0__Impl4264); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2075:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2079:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2080:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__14295);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__14298);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2087:1: rule__Commands__Group_1__1__Impl : ( ruleLC ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2091:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2092:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2092:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2093:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Commands__Group_1__1__Impl4325);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2104:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2108:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2109:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__24354);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2115:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__CAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2119:1: ( ( ( rule__Commands__CAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2120:1: ( ( rule__Commands__CAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2120:1: ( ( rule__Commands__CAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2121:1: ( rule__Commands__CAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2122:1: ( rule__Commands__CAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2122:2: rule__Commands__CAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl4381);
            rule__Commands__CAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2138:1: rule__Assign__Group__0 : rule__Assign__Group__0__Impl rule__Assign__Group__1 ;
    public final void rule__Assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2142:1: ( rule__Assign__Group__0__Impl rule__Assign__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2143:2: rule__Assign__Group__0__Impl rule__Assign__Group__1
            {
            pushFollow(FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04417);
            rule__Assign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04420);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2150:1: rule__Assign__Group__0__Impl : ( ( rule__Assign__VsAssignment_0 ) ) ;
    public final void rule__Assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2154:1: ( ( ( rule__Assign__VsAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2155:1: ( ( rule__Assign__VsAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2155:1: ( ( rule__Assign__VsAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2156:1: ( rule__Assign__VsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getVsAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2157:1: ( rule__Assign__VsAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2157:2: rule__Assign__VsAssignment_0
            {
            pushFollow(FOLLOW_rule__Assign__VsAssignment_0_in_rule__Assign__Group__0__Impl4447);
            rule__Assign__VsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getVsAssignment_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2167:1: rule__Assign__Group__1 : rule__Assign__Group__1__Impl rule__Assign__Group__2 ;
    public final void rule__Assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2171:1: ( rule__Assign__Group__1__Impl rule__Assign__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2172:2: rule__Assign__Group__1__Impl rule__Assign__Group__2
            {
            pushFollow(FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14477);
            rule__Assign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14480);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2179:1: rule__Assign__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2183:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2184:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2184:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2185:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Assign__Group__1__Impl4507);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2196:1: rule__Assign__Group__2 : rule__Assign__Group__2__Impl rule__Assign__Group__3 ;
    public final void rule__Assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2200:1: ( rule__Assign__Group__2__Impl rule__Assign__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2201:2: rule__Assign__Group__2__Impl rule__Assign__Group__3
            {
            pushFollow(FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24536);
            rule__Assign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24539);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2208:1: rule__Assign__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2212:1: ( ( ':=' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ':=' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ':=' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2214:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Assign__Group__2__Impl4567); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2227:1: rule__Assign__Group__3 : rule__Assign__Group__3__Impl rule__Assign__Group__4 ;
    public final void rule__Assign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2231:1: ( rule__Assign__Group__3__Impl rule__Assign__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2232:2: rule__Assign__Group__3__Impl rule__Assign__Group__4
            {
            pushFollow(FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34598);
            rule__Assign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34601);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2239:1: rule__Assign__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Assign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2243:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2244:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2244:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2245:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Assign__Group__3__Impl4628);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2256:1: rule__Assign__Group__4 : rule__Assign__Group__4__Impl ;
    public final void rule__Assign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2260:1: ( rule__Assign__Group__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2261:2: rule__Assign__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44657);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2267:1: rule__Assign__Group__4__Impl : ( ( rule__Assign__ExAssignment_4 ) ) ;
    public final void rule__Assign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2271:1: ( ( ( rule__Assign__ExAssignment_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2272:1: ( ( rule__Assign__ExAssignment_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2272:1: ( ( rule__Assign__ExAssignment_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2273:1: ( rule__Assign__ExAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getExAssignment_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2274:1: ( rule__Assign__ExAssignment_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2274:2: rule__Assign__ExAssignment_4
            {
            pushFollow(FOLLOW_rule__Assign__ExAssignment_4_in_rule__Assign__Group__4__Impl4684);
            rule__Assign__ExAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getExAssignment_4()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2294:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2298:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2299:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04724);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04727);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2306:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2310:1: ( ( 'while' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2311:1: ( 'while' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2311:1: ( 'while' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2312:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__While__Group__0__Impl4755); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2325:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2329:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2330:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14786);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14789);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2337:1: rule__While__Group__1__Impl : ( ruleLC ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2341:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2342:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2342:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2343:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__1__Impl4816);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2354:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2358:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2359:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24845);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24848);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2366:1: rule__While__Group__2__Impl : ( ( rule__While__ExAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2370:1: ( ( ( rule__While__ExAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2371:1: ( ( rule__While__ExAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2371:1: ( ( rule__While__ExAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2372:1: ( rule__While__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2373:1: ( rule__While__ExAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2373:2: rule__While__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl4875);
            rule__While__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2383:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2387:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2388:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34905);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34908);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2395:1: rule__While__Group__3__Impl : ( ruleLC ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2399:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2400:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2400:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2401:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__3__Impl4935);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2412:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2416:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2417:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44964);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44967);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2424:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2428:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2429:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2429:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2430:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__While__Group__4__Impl4995); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2443:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2447:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2448:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__55026);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__55029);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2455:1: rule__While__Group__5__Impl : ( ruleLC ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2459:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2460:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2460:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2461:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__5__Impl5056);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2472:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2476:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2477:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__65085);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__65088);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2484:1: rule__While__Group__6__Impl : ( ( rule__While__CAssignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2488:1: ( ( ( rule__While__CAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2489:1: ( ( rule__While__CAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2489:1: ( ( rule__While__CAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2490:1: ( rule__While__CAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2491:1: ( rule__While__CAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2491:2: rule__While__CAssignment_6
            {
            pushFollow(FOLLOW_rule__While__CAssignment_6_in_rule__While__Group__6__Impl5115);
            rule__While__CAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCAssignment_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2501:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2505:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2506:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75145);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__75148);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2513:1: rule__While__Group__7__Impl : ( ruleLC ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2517:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2518:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2518:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2519:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__7__Impl5175);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2530:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2534:1: ( rule__While__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2535:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85204);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2541:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2545:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2546:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2546:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2547:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,32,FOLLOW_32_in_rule__While__Group__8__Impl5232); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2578:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2582:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2583:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05281);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__05284);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2590:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2594:1: ( ( 'for' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2595:1: ( 'for' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2595:1: ( 'for' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2596:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__For__Group__0__Impl5312); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2609:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2613:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2614:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15343);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__15346);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2621:1: rule__For__Group__1__Impl : ( ruleLC ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2625:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2626:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2626:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2627:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__1__Impl5373);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2638:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2642:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2643:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25402);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25405);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2650:1: rule__For__Group__2__Impl : ( ( rule__For__ExAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2654:1: ( ( ( rule__For__ExAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2655:1: ( ( rule__For__ExAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2655:1: ( ( rule__For__ExAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2656:1: ( rule__For__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2657:1: ( rule__For__ExAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2657:2: rule__For__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__For__ExAssignment_2_in_rule__For__Group__2__Impl5432);
            rule__For__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getExAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2667:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2671:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2672:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35462);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35465);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2679:1: rule__For__Group__3__Impl : ( ruleLC ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2683:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2684:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2684:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2685:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__3__Impl5492);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2696:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2700:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2701:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45521);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45524);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2708:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2712:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2713:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2713:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2714:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__4__Impl5552); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2727:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2731:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2732:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55583);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55586);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2739:1: rule__For__Group__5__Impl : ( ruleLC ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2743:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2744:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2744:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2745:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__5__Impl5613);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2756:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2760:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2761:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65642);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65645);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2768:1: rule__For__Group__6__Impl : ( ( rule__For__CAssignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2772:1: ( ( ( rule__For__CAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2773:1: ( ( rule__For__CAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2773:1: ( ( rule__For__CAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2774:1: ( rule__For__CAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2775:1: ( rule__For__CAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2775:2: rule__For__CAssignment_6
            {
            pushFollow(FOLLOW_rule__For__CAssignment_6_in_rule__For__Group__6__Impl5672);
            rule__For__CAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCAssignment_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2785:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2789:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2790:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75702);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75705);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2797:1: rule__For__Group__7__Impl : ( ruleLC ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2801:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2802:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2802:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2803:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__7__Impl5732);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2814:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2818:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2819:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85761);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2825:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2829:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2830:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2830:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2831:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,32,FOLLOW_32_in_rule__For__Group__8__Impl5789); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2862:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2866:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2867:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05838);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05841);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2874:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2878:1: ( ( 'if' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2879:1: ( 'if' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2879:1: ( 'if' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2880:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__0__Impl5869); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2893:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2897:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2898:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15900);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15903);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2905:1: rule__If__Group__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2909:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2910:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2910:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2911:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__1__Impl5930);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2922:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2926:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2927:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25959);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25962);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2934:1: rule__If__Group__2__Impl : ( ( rule__If__ExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2938:1: ( ( ( rule__If__ExAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2939:1: ( ( rule__If__ExAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2939:1: ( ( rule__If__ExAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2940:1: ( rule__If__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2941:1: ( rule__If__ExAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2941:2: rule__If__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl5989);
            rule__If__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2951:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2955:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2956:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36019);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__36022);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2963:1: rule__If__Group__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2967:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2968:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2968:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2969:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__3__Impl6049);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2980:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2984:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2985:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46078);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__46081);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2992:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2996:1: ( ( 'then' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2997:1: ( 'then' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2997:1: ( 'then' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2998:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group__4__Impl6109); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3011:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3015:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3016:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56140);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__56143);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3023:1: rule__If__Group__5__Impl : ( ruleLC ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3027:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3028:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3028:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3029:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__5__Impl6170);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3040:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3044:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3045:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66199);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__66202);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3052:1: rule__If__Group__6__Impl : ( ( rule__If__CtAssignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3056:1: ( ( ( rule__If__CtAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3057:1: ( ( rule__If__CtAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3057:1: ( ( rule__If__CtAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3058:1: ( rule__If__CtAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCtAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3059:1: ( rule__If__CtAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3059:2: rule__If__CtAssignment_6
            {
            pushFollow(FOLLOW_rule__If__CtAssignment_6_in_rule__If__Group__6__Impl6229);
            rule__If__CtAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCtAssignment_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3069:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3073:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3074:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76259);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__76262);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3081:1: rule__If__Group__7__Impl : ( ruleLC ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3085:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3086:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3086:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3087:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__7__Impl6289);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3098:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3102:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3103:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86318);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__86321);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3110:1: rule__If__Group__8__Impl : ( 'else' ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3114:1: ( ( 'else' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3115:1: ( 'else' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3115:1: ( 'else' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3116:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8()); 
            }
            match(input,36,FOLLOW_36_in_rule__If__Group__8__Impl6349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_8()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3129:1: rule__If__Group__9 : rule__If__Group__9__Impl rule__If__Group__10 ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3133:1: ( rule__If__Group__9__Impl rule__If__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3134:2: rule__If__Group__9__Impl rule__If__Group__10
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96380);
            rule__If__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__10_in_rule__If__Group__96383);
            rule__If__Group__10();

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3141:1: rule__If__Group__9__Impl : ( ruleLC ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3145:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3146:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3146:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3147:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__9__Impl6410);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_9()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__If__Group__10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3158:1: rule__If__Group__10 : rule__If__Group__10__Impl rule__If__Group__11 ;
    public final void rule__If__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3162:1: ( rule__If__Group__10__Impl rule__If__Group__11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3163:2: rule__If__Group__10__Impl rule__If__Group__11
            {
            pushFollow(FOLLOW_rule__If__Group__10__Impl_in_rule__If__Group__106439);
            rule__If__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__11_in_rule__If__Group__106442);
            rule__If__Group__11();

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
    // $ANTLR end "rule__If__Group__10"


    // $ANTLR start "rule__If__Group__10__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3170:1: rule__If__Group__10__Impl : ( ( rule__If__CeAssignment_10 ) ) ;
    public final void rule__If__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3174:1: ( ( ( rule__If__CeAssignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3175:1: ( ( rule__If__CeAssignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3175:1: ( ( rule__If__CeAssignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3176:1: ( rule__If__CeAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCeAssignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3177:1: ( rule__If__CeAssignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3177:2: rule__If__CeAssignment_10
            {
            pushFollow(FOLLOW_rule__If__CeAssignment_10_in_rule__If__Group__10__Impl6469);
            rule__If__CeAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCeAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__10__Impl"


    // $ANTLR start "rule__If__Group__11"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3187:1: rule__If__Group__11 : rule__If__Group__11__Impl rule__If__Group__12 ;
    public final void rule__If__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3191:1: ( rule__If__Group__11__Impl rule__If__Group__12 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3192:2: rule__If__Group__11__Impl rule__If__Group__12
            {
            pushFollow(FOLLOW_rule__If__Group__11__Impl_in_rule__If__Group__116499);
            rule__If__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__12_in_rule__If__Group__116502);
            rule__If__Group__12();

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
    // $ANTLR end "rule__If__Group__11"


    // $ANTLR start "rule__If__Group__11__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3199:1: rule__If__Group__11__Impl : ( ruleLC ) ;
    public final void rule__If__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3203:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3204:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3204:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3205:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_11()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__11__Impl6529);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__11__Impl"


    // $ANTLR start "rule__If__Group__12"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3216:1: rule__If__Group__12 : rule__If__Group__12__Impl ;
    public final void rule__If__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3220:1: ( rule__If__Group__12__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3221:2: rule__If__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__12__Impl_in_rule__If__Group__126558);
            rule__If__Group__12__Impl();

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
    // $ANTLR end "rule__If__Group__12"


    // $ANTLR start "rule__If__Group__12__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3227:1: rule__If__Group__12__Impl : ( 'fi' ) ;
    public final void rule__If__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3231:1: ( ( 'fi' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3232:1: ( 'fi' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3232:1: ( 'fi' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3233:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_12()); 
            }
            match(input,37,FOLLOW_37_in_rule__If__Group__12__Impl6586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getFiKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__12__Impl"


    // $ANTLR start "rule__Foreach__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3272:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3276:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3277:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06643);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06646);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3284:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3288:1: ( ( 'foreach' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3289:1: ( 'foreach' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3289:1: ( 'foreach' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3290:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Foreach__Group__0__Impl6674); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3303:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3307:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3308:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16705);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16708);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3315:1: rule__Foreach__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3319:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3320:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3320:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3321:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6735);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3332:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3336:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3337:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26764);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26767);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3344:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__Ex1Assignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3348:1: ( ( ( rule__Foreach__Ex1Assignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3349:1: ( ( rule__Foreach__Ex1Assignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3349:1: ( ( rule__Foreach__Ex1Assignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3350:1: ( rule__Foreach__Ex1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getEx1Assignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3351:1: ( rule__Foreach__Ex1Assignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3351:2: rule__Foreach__Ex1Assignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__Ex1Assignment_2_in_rule__Foreach__Group__2__Impl6794);
            rule__Foreach__Ex1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getEx1Assignment_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3361:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3365:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3366:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36824);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36827);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3373:1: rule__Foreach__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3377:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3378:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3378:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3379:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6854);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3390:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3394:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3395:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46883);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46886);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3402:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3406:1: ( ( 'in' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3407:1: ( 'in' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3407:1: ( 'in' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3408:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__Foreach__Group__4__Impl6914); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3421:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3425:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3426:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56945);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56948);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3433:1: rule__Foreach__Group__5__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3437:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3438:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3438:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3439:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6975);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3450:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3454:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3455:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__67004);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__67007);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3462:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__Ex2Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3466:1: ( ( ( rule__Foreach__Ex2Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3467:1: ( ( rule__Foreach__Ex2Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3467:1: ( ( rule__Foreach__Ex2Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3468:1: ( rule__Foreach__Ex2Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getEx2Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3469:1: ( rule__Foreach__Ex2Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3469:2: rule__Foreach__Ex2Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__Ex2Assignment_6_in_rule__Foreach__Group__6__Impl7034);
            rule__Foreach__Ex2Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getEx2Assignment_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3479:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3483:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3484:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__77064);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__77067);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3491:1: rule__Foreach__Group__7__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3495:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3496:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3496:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3497:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl7094);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3508:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3512:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3513:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87123);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87126);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3520:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3524:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3525:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3525:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3526:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,31,FOLLOW_31_in_rule__Foreach__Group__8__Impl7154); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3539:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3543:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3544:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97185);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97188);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3551:1: rule__Foreach__Group__9__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3555:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3556:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3556:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3557:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7215);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3568:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3572:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3573:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107244);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107247);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3580:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__CAssignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3584:1: ( ( ( rule__Foreach__CAssignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3585:1: ( ( rule__Foreach__CAssignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3585:1: ( ( rule__Foreach__CAssignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3586:1: ( rule__Foreach__CAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCAssignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3587:1: ( rule__Foreach__CAssignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3587:2: rule__Foreach__CAssignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__CAssignment_10_in_rule__Foreach__Group__10__Impl7274);
            rule__Foreach__CAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getCAssignment_10()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3597:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3601:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3602:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117304);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117307);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3609:1: rule__Foreach__Group__11__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3613:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3614:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3614:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3615:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7334);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3626:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3630:1: ( rule__Foreach__Group__12__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3631:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127363);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3637:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3641:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3642:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3642:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3643:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,32,FOLLOW_32_in_rule__Foreach__Group__12__Impl7391); if (state.failed) return ;
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


    // $ANTLR start "rule__Ifconfort__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3682:1: rule__Ifconfort__Group__0 : rule__Ifconfort__Group__0__Impl rule__Ifconfort__Group__1 ;
    public final void rule__Ifconfort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3686:1: ( rule__Ifconfort__Group__0__Impl rule__Ifconfort__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3687:2: rule__Ifconfort__Group__0__Impl rule__Ifconfort__Group__1
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__0__Impl_in_rule__Ifconfort__Group__07448);
            rule__Ifconfort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__1_in_rule__Ifconfort__Group__07451);
            rule__Ifconfort__Group__1();

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
    // $ANTLR end "rule__Ifconfort__Group__0"


    // $ANTLR start "rule__Ifconfort__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3694:1: rule__Ifconfort__Group__0__Impl : ( 'if' ) ;
    public final void rule__Ifconfort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3698:1: ( ( 'if' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3699:1: ( 'if' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3699:1: ( 'if' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3700:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getIfKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Ifconfort__Group__0__Impl7479); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__0__Impl"


    // $ANTLR start "rule__Ifconfort__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3713:1: rule__Ifconfort__Group__1 : rule__Ifconfort__Group__1__Impl rule__Ifconfort__Group__2 ;
    public final void rule__Ifconfort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3717:1: ( rule__Ifconfort__Group__1__Impl rule__Ifconfort__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3718:2: rule__Ifconfort__Group__1__Impl rule__Ifconfort__Group__2
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__1__Impl_in_rule__Ifconfort__Group__17510);
            rule__Ifconfort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__2_in_rule__Ifconfort__Group__17513);
            rule__Ifconfort__Group__2();

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
    // $ANTLR end "rule__Ifconfort__Group__1"


    // $ANTLR start "rule__Ifconfort__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3725:1: rule__Ifconfort__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Ifconfort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3729:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3730:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3730:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3731:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Ifconfort__Group__1__Impl7540);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__1__Impl"


    // $ANTLR start "rule__Ifconfort__Group__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3742:1: rule__Ifconfort__Group__2 : rule__Ifconfort__Group__2__Impl rule__Ifconfort__Group__3 ;
    public final void rule__Ifconfort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3746:1: ( rule__Ifconfort__Group__2__Impl rule__Ifconfort__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3747:2: rule__Ifconfort__Group__2__Impl rule__Ifconfort__Group__3
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__2__Impl_in_rule__Ifconfort__Group__27569);
            rule__Ifconfort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__3_in_rule__Ifconfort__Group__27572);
            rule__Ifconfort__Group__3();

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
    // $ANTLR end "rule__Ifconfort__Group__2"


    // $ANTLR start "rule__Ifconfort__Group__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3754:1: rule__Ifconfort__Group__2__Impl : ( ( rule__Ifconfort__ExAssignment_2 ) ) ;
    public final void rule__Ifconfort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3758:1: ( ( ( rule__Ifconfort__ExAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3759:1: ( ( rule__Ifconfort__ExAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3759:1: ( ( rule__Ifconfort__ExAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3760:1: ( rule__Ifconfort__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getExAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3761:1: ( rule__Ifconfort__ExAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3761:2: rule__Ifconfort__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__Ifconfort__ExAssignment_2_in_rule__Ifconfort__Group__2__Impl7599);
            rule__Ifconfort__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getExAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__2__Impl"


    // $ANTLR start "rule__Ifconfort__Group__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3771:1: rule__Ifconfort__Group__3 : rule__Ifconfort__Group__3__Impl rule__Ifconfort__Group__4 ;
    public final void rule__Ifconfort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3775:1: ( rule__Ifconfort__Group__3__Impl rule__Ifconfort__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3776:2: rule__Ifconfort__Group__3__Impl rule__Ifconfort__Group__4
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__3__Impl_in_rule__Ifconfort__Group__37629);
            rule__Ifconfort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__4_in_rule__Ifconfort__Group__37632);
            rule__Ifconfort__Group__4();

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
    // $ANTLR end "rule__Ifconfort__Group__3"


    // $ANTLR start "rule__Ifconfort__Group__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3783:1: rule__Ifconfort__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Ifconfort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3787:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3788:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3788:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3789:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Ifconfort__Group__3__Impl7659);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__3__Impl"


    // $ANTLR start "rule__Ifconfort__Group__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3800:1: rule__Ifconfort__Group__4 : rule__Ifconfort__Group__4__Impl rule__Ifconfort__Group__5 ;
    public final void rule__Ifconfort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3804:1: ( rule__Ifconfort__Group__4__Impl rule__Ifconfort__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3805:2: rule__Ifconfort__Group__4__Impl rule__Ifconfort__Group__5
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__4__Impl_in_rule__Ifconfort__Group__47688);
            rule__Ifconfort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__5_in_rule__Ifconfort__Group__47691);
            rule__Ifconfort__Group__5();

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
    // $ANTLR end "rule__Ifconfort__Group__4"


    // $ANTLR start "rule__Ifconfort__Group__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3812:1: rule__Ifconfort__Group__4__Impl : ( 'then' ) ;
    public final void rule__Ifconfort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3816:1: ( ( 'then' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3817:1: ( 'then' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3817:1: ( 'then' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3818:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getThenKeyword_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__Ifconfort__Group__4__Impl7719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getThenKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__4__Impl"


    // $ANTLR start "rule__Ifconfort__Group__5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3831:1: rule__Ifconfort__Group__5 : rule__Ifconfort__Group__5__Impl rule__Ifconfort__Group__6 ;
    public final void rule__Ifconfort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3835:1: ( rule__Ifconfort__Group__5__Impl rule__Ifconfort__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3836:2: rule__Ifconfort__Group__5__Impl rule__Ifconfort__Group__6
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__5__Impl_in_rule__Ifconfort__Group__57750);
            rule__Ifconfort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__6_in_rule__Ifconfort__Group__57753);
            rule__Ifconfort__Group__6();

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
    // $ANTLR end "rule__Ifconfort__Group__5"


    // $ANTLR start "rule__Ifconfort__Group__5__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3843:1: rule__Ifconfort__Group__5__Impl : ( ruleLC ) ;
    public final void rule__Ifconfort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3847:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3848:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3848:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3849:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Ifconfort__Group__5__Impl7780);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__5__Impl"


    // $ANTLR start "rule__Ifconfort__Group__6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3860:1: rule__Ifconfort__Group__6 : rule__Ifconfort__Group__6__Impl rule__Ifconfort__Group__7 ;
    public final void rule__Ifconfort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3864:1: ( rule__Ifconfort__Group__6__Impl rule__Ifconfort__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3865:2: rule__Ifconfort__Group__6__Impl rule__Ifconfort__Group__7
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__6__Impl_in_rule__Ifconfort__Group__67809);
            rule__Ifconfort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__7_in_rule__Ifconfort__Group__67812);
            rule__Ifconfort__Group__7();

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
    // $ANTLR end "rule__Ifconfort__Group__6"


    // $ANTLR start "rule__Ifconfort__Group__6__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3872:1: rule__Ifconfort__Group__6__Impl : ( ( rule__Ifconfort__CAssignment_6 ) ) ;
    public final void rule__Ifconfort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3876:1: ( ( ( rule__Ifconfort__CAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3877:1: ( ( rule__Ifconfort__CAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3877:1: ( ( rule__Ifconfort__CAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3878:1: ( rule__Ifconfort__CAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getCAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3879:1: ( rule__Ifconfort__CAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3879:2: rule__Ifconfort__CAssignment_6
            {
            pushFollow(FOLLOW_rule__Ifconfort__CAssignment_6_in_rule__Ifconfort__Group__6__Impl7839);
            rule__Ifconfort__CAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getCAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__6__Impl"


    // $ANTLR start "rule__Ifconfort__Group__7"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3889:1: rule__Ifconfort__Group__7 : rule__Ifconfort__Group__7__Impl rule__Ifconfort__Group__8 ;
    public final void rule__Ifconfort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3893:1: ( rule__Ifconfort__Group__7__Impl rule__Ifconfort__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3894:2: rule__Ifconfort__Group__7__Impl rule__Ifconfort__Group__8
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__7__Impl_in_rule__Ifconfort__Group__77869);
            rule__Ifconfort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ifconfort__Group__8_in_rule__Ifconfort__Group__77872);
            rule__Ifconfort__Group__8();

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
    // $ANTLR end "rule__Ifconfort__Group__7"


    // $ANTLR start "rule__Ifconfort__Group__7__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3901:1: rule__Ifconfort__Group__7__Impl : ( ruleLC ) ;
    public final void rule__Ifconfort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3905:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3906:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3906:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3907:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Ifconfort__Group__7__Impl7899);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__7__Impl"


    // $ANTLR start "rule__Ifconfort__Group__8"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3918:1: rule__Ifconfort__Group__8 : rule__Ifconfort__Group__8__Impl ;
    public final void rule__Ifconfort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3922:1: ( rule__Ifconfort__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3923:2: rule__Ifconfort__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Ifconfort__Group__8__Impl_in_rule__Ifconfort__Group__87928);
            rule__Ifconfort__Group__8__Impl();

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
    // $ANTLR end "rule__Ifconfort__Group__8"


    // $ANTLR start "rule__Ifconfort__Group__8__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3929:1: rule__Ifconfort__Group__8__Impl : ( 'fi' ) ;
    public final void rule__Ifconfort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3933:1: ( ( 'fi' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3934:1: ( 'fi' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3934:1: ( 'fi' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3935:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getFiKeyword_8()); 
            }
            match(input,37,FOLLOW_37_in_rule__Ifconfort__Group__8__Impl7956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getFiKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__Group__8__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3966:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3970:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3971:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__08005);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__08008);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3978:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__VsAssignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3982:1: ( ( ( rule__Vars__VsAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3983:1: ( ( rule__Vars__VsAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3983:1: ( ( rule__Vars__VsAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3984:1: ( rule__Vars__VsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVsAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3985:1: ( rule__Vars__VsAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3985:2: rule__Vars__VsAssignment_0
            {
            pushFollow(FOLLOW_rule__Vars__VsAssignment_0_in_rule__Vars__Group__0__Impl8035);
            rule__Vars__VsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVsAssignment_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3995:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3999:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4000:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__18065);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4006:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4010:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4011:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4011:1: ( ( rule__Vars__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4012:1: ( rule__Vars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4013:1: ( rule__Vars__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4013:2: rule__Vars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl8092);
            	    rule__Vars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4027:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4031:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4032:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__08127);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__08130);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4039:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4043:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4044:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4044:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4045:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Vars__Group_1__0__Impl8158); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4058:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4062:1: ( rule__Vars__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4063:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__18189);
            rule__Vars__Group_1__1__Impl();

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4069:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__VsAssignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4073:1: ( ( ( rule__Vars__VsAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4074:1: ( ( rule__Vars__VsAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4074:1: ( ( rule__Vars__VsAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4075:1: ( rule__Vars__VsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVsAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4076:1: ( rule__Vars__VsAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4076:2: rule__Vars__VsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__VsAssignment_1_1_in_rule__Vars__Group_1__1__Impl8216);
            rule__Vars__VsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVsAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Exprs__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4090:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4094:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4095:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__08250);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__08253);
            rule__Exprs__Group__1();

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
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4102:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4106:1: ( ( ( rule__Exprs__ExAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4107:1: ( ( rule__Exprs__ExAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4107:1: ( ( rule__Exprs__ExAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4108:1: ( rule__Exprs__ExAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4109:1: ( rule__Exprs__ExAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4109:2: rule__Exprs__ExAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExAssignment_0_in_rule__Exprs__Group__0__Impl8280);
            rule__Exprs__ExAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4119:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4123:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4124:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__18310);
            rule__Exprs__Group__1__Impl();

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
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4130:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4134:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4135:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4135:1: ( ( rule__Exprs__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4136:1: ( rule__Exprs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4137:1: ( rule__Exprs__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4137:2: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl8337);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4151:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4155:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4156:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__08372);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__08375);
            rule__Exprs__Group_1__1();

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
    // $ANTLR end "rule__Exprs__Group_1__0"


    // $ANTLR start "rule__Exprs__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4163:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4167:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4168:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4168:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4169:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Exprs__Group_1__0__Impl8403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0__Impl"


    // $ANTLR start "rule__Exprs__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4182:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4186:1: ( rule__Exprs__Group_1__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4187:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__18434);
            rule__Exprs__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exprs__Group_1__1"


    // $ANTLR start "rule__Exprs__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4193:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExAssignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4197:1: ( ( ( rule__Exprs__ExAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4198:1: ( ( rule__Exprs__ExAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4198:1: ( ( rule__Exprs__ExAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4199:1: ( rule__Exprs__ExAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4200:1: ( rule__Exprs__ExAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4200:2: rule__Exprs__ExAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExAssignment_1_1_in_rule__Exprs__Group_1__1__Impl8461);
            rule__Exprs__ExAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4214:1: rule__ExprSimple__Group_3__0 : rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 ;
    public final void rule__ExprSimple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4218:1: ( rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4219:2: rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__08495);
            rule__ExprSimple__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__08498);
            rule__ExprSimple__Group_3__1();

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
    // $ANTLR end "rule__ExprSimple__Group_3__0"


    // $ANTLR start "rule__ExprSimple__Group_3__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4226:1: rule__ExprSimple__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4230:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4231:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4231:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4232:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprSimple__Group_3__0__Impl8526); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4245:1: rule__ExprSimple__Group_3__1 : rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 ;
    public final void rule__ExprSimple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4249:1: ( rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4250:2: rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__18557);
            rule__ExprSimple__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__18560);
            rule__ExprSimple__Group_3__2();

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
    // $ANTLR end "rule__ExprSimple__Group_3__1"


    // $ANTLR start "rule__ExprSimple__Group_3__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4257:1: rule__ExprSimple__Group_3__1__Impl : ( ( rule__ExprSimple__MotAssignment_3_1 ) ) ;
    public final void rule__ExprSimple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4261:1: ( ( ( rule__ExprSimple__MotAssignment_3_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4262:1: ( ( rule__ExprSimple__MotAssignment_3_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4262:1: ( ( rule__ExprSimple__MotAssignment_3_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4263:1: ( rule__ExprSimple__MotAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_3_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4264:1: ( rule__ExprSimple__MotAssignment_3_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4264:2: rule__ExprSimple__MotAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl8587);
            rule__ExprSimple__MotAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4274:1: rule__ExprSimple__Group_3__2 : rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 ;
    public final void rule__ExprSimple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4278:1: ( rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4279:2: rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__28617);
            rule__ExprSimple__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__28620);
            rule__ExprSimple__Group_3__3();

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
    // $ANTLR end "rule__ExprSimple__Group_3__2"


    // $ANTLR start "rule__ExprSimple__Group_3__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4286:1: rule__ExprSimple__Group_3__2__Impl : ( ( rule__ExprSimple__LexAssignment_3_2 ) ) ;
    public final void rule__ExprSimple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4290:1: ( ( ( rule__ExprSimple__LexAssignment_3_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4291:1: ( ( rule__ExprSimple__LexAssignment_3_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4291:1: ( ( rule__ExprSimple__LexAssignment_3_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4292:1: ( rule__ExprSimple__LexAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexAssignment_3_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4293:1: ( rule__ExprSimple__LexAssignment_3_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4293:2: rule__ExprSimple__LexAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__LexAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl8647);
            rule__ExprSimple__LexAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4303:1: rule__ExprSimple__Group_3__3 : rule__ExprSimple__Group_3__3__Impl ;
    public final void rule__ExprSimple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4307:1: ( rule__ExprSimple__Group_3__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4308:2: rule__ExprSimple__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__38677);
            rule__ExprSimple__Group_3__3__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group_3__3"


    // $ANTLR start "rule__ExprSimple__Group_3__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4314:1: rule__ExprSimple__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4318:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4319:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4319:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4320:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprSimple__Group_3__3__Impl8705); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4341:1: rule__ExprSimple__Group_4__0 : rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 ;
    public final void rule__ExprSimple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4345:1: ( rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4346:2: rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__08744);
            rule__ExprSimple__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__08747);
            rule__ExprSimple__Group_4__1();

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
    // $ANTLR end "rule__ExprSimple__Group_4__0"


    // $ANTLR start "rule__ExprSimple__Group_4__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4353:1: rule__ExprSimple__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4357:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4358:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4358:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4359:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprSimple__Group_4__0__Impl8775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4372:1: rule__ExprSimple__Group_4__1 : rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 ;
    public final void rule__ExprSimple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4376:1: ( rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4377:2: rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__18806);
            rule__ExprSimple__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__18809);
            rule__ExprSimple__Group_4__2();

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
    // $ANTLR end "rule__ExprSimple__Group_4__1"


    // $ANTLR start "rule__ExprSimple__Group_4__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4384:1: rule__ExprSimple__Group_4__1__Impl : ( ( rule__ExprSimple__MotAssignment_4_1 ) ) ;
    public final void rule__ExprSimple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4388:1: ( ( ( rule__ExprSimple__MotAssignment_4_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4389:1: ( ( rule__ExprSimple__MotAssignment_4_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4389:1: ( ( rule__ExprSimple__MotAssignment_4_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4390:1: ( rule__ExprSimple__MotAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_4_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4391:1: ( rule__ExprSimple__MotAssignment_4_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4391:2: rule__ExprSimple__MotAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl8836);
            rule__ExprSimple__MotAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4401:1: rule__ExprSimple__Group_4__2 : rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 ;
    public final void rule__ExprSimple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4405:1: ( rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4406:2: rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__28866);
            rule__ExprSimple__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__28869);
            rule__ExprSimple__Group_4__3();

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
    // $ANTLR end "rule__ExprSimple__Group_4__2"


    // $ANTLR start "rule__ExprSimple__Group_4__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4413:1: rule__ExprSimple__Group_4__2__Impl : ( ruleLC ) ;
    public final void rule__ExprSimple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4417:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4418:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4418:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4419:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprSimple__Group_4__2__Impl8896);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4430:1: rule__ExprSimple__Group_4__3 : rule__ExprSimple__Group_4__3__Impl rule__ExprSimple__Group_4__4 ;
    public final void rule__ExprSimple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4434:1: ( rule__ExprSimple__Group_4__3__Impl rule__ExprSimple__Group_4__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4435:2: rule__ExprSimple__Group_4__3__Impl rule__ExprSimple__Group_4__4
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__38925);
            rule__ExprSimple__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__4_in_rule__ExprSimple__Group_4__38928);
            rule__ExprSimple__Group_4__4();

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
    // $ANTLR end "rule__ExprSimple__Group_4__3"


    // $ANTLR start "rule__ExprSimple__Group_4__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4442:1: rule__ExprSimple__Group_4__3__Impl : ( ( rule__ExprSimple__ExAssignment_4_3 ) ) ;
    public final void rule__ExprSimple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4446:1: ( ( ( rule__ExprSimple__ExAssignment_4_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4447:1: ( ( rule__ExprSimple__ExAssignment_4_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4447:1: ( ( rule__ExprSimple__ExAssignment_4_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4448:1: ( rule__ExprSimple__ExAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExAssignment_4_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4449:1: ( rule__ExprSimple__ExAssignment_4_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4449:2: rule__ExprSimple__ExAssignment_4_3
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExAssignment_4_3_in_rule__ExprSimple__Group_4__3__Impl8955);
            rule__ExprSimple__ExAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4459:1: rule__ExprSimple__Group_4__4 : rule__ExprSimple__Group_4__4__Impl ;
    public final void rule__ExprSimple__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4463:1: ( rule__ExprSimple__Group_4__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4464:2: rule__ExprSimple__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__4__Impl_in_rule__ExprSimple__Group_4__48985);
            rule__ExprSimple__Group_4__4__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group_4__4"


    // $ANTLR start "rule__ExprSimple__Group_4__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4470:1: rule__ExprSimple__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4474:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4475:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4475:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4476:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprSimple__Group_4__4__Impl9013); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__4__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4499:1: rule__ExprSimple__Group_5__0 : rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 ;
    public final void rule__ExprSimple__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4503:1: ( rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4504:2: rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__09054);
            rule__ExprSimple__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__09057);
            rule__ExprSimple__Group_5__1();

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
    // $ANTLR end "rule__ExprSimple__Group_5__0"


    // $ANTLR start "rule__ExprSimple__Group_5__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4511:1: rule__ExprSimple__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4515:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4516:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4516:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4517:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprSimple__Group_5__0__Impl9085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4530:1: rule__ExprSimple__Group_5__1 : rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 ;
    public final void rule__ExprSimple__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4534:1: ( rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4535:2: rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__19116);
            rule__ExprSimple__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__19119);
            rule__ExprSimple__Group_5__2();

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
    // $ANTLR end "rule__ExprSimple__Group_5__1"


    // $ANTLR start "rule__ExprSimple__Group_5__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4542:1: rule__ExprSimple__Group_5__1__Impl : ( ( rule__ExprSimple__SymAssignment_5_1 ) ) ;
    public final void rule__ExprSimple__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4546:1: ( ( ( rule__ExprSimple__SymAssignment_5_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4547:1: ( ( rule__ExprSimple__SymAssignment_5_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4547:1: ( ( rule__ExprSimple__SymAssignment_5_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4548:1: ( rule__ExprSimple__SymAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymAssignment_5_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4549:1: ( rule__ExprSimple__SymAssignment_5_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4549:2: rule__ExprSimple__SymAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__SymAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl9146);
            rule__ExprSimple__SymAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4559:1: rule__ExprSimple__Group_5__2 : rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 ;
    public final void rule__ExprSimple__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4563:1: ( rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4564:2: rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__29176);
            rule__ExprSimple__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__29179);
            rule__ExprSimple__Group_5__3();

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
    // $ANTLR end "rule__ExprSimple__Group_5__2"


    // $ANTLR start "rule__ExprSimple__Group_5__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4571:1: rule__ExprSimple__Group_5__2__Impl : ( ( rule__ExprSimple__LexAssignment_5_2 ) ) ;
    public final void rule__ExprSimple__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4575:1: ( ( ( rule__ExprSimple__LexAssignment_5_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4576:1: ( ( rule__ExprSimple__LexAssignment_5_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4576:1: ( ( rule__ExprSimple__LexAssignment_5_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4577:1: ( rule__ExprSimple__LexAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexAssignment_5_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4578:1: ( rule__ExprSimple__LexAssignment_5_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4578:2: rule__ExprSimple__LexAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__LexAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl9206);
            rule__ExprSimple__LexAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4588:1: rule__ExprSimple__Group_5__3 : rule__ExprSimple__Group_5__3__Impl ;
    public final void rule__ExprSimple__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4592:1: ( rule__ExprSimple__Group_5__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4593:2: rule__ExprSimple__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__39236);
            rule__ExprSimple__Group_5__3__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group_5__3"


    // $ANTLR start "rule__ExprSimple__Group_5__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4599:1: rule__ExprSimple__Group_5__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4603:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4604:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4604:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4605:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprSimple__Group_5__3__Impl9264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__3__Impl"


    // $ANTLR start "rule__LExpr__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4626:1: rule__LExpr__Group__0 : rule__LExpr__Group__0__Impl rule__LExpr__Group__1 ;
    public final void rule__LExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4630:1: ( rule__LExpr__Group__0__Impl rule__LExpr__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4631:2: rule__LExpr__Group__0__Impl rule__LExpr__Group__1
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09303);
            rule__LExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09306);
            rule__LExpr__Group__1();

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
    // $ANTLR end "rule__LExpr__Group__0"


    // $ANTLR start "rule__LExpr__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4638:1: rule__LExpr__Group__0__Impl : ( ruleLC ) ;
    public final void rule__LExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4642:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4643:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4643:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4644:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9333);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__0__Impl"


    // $ANTLR start "rule__LExpr__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4655:1: rule__LExpr__Group__1 : rule__LExpr__Group__1__Impl ;
    public final void rule__LExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4659:1: ( rule__LExpr__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4660:2: rule__LExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19362);
            rule__LExpr__Group__1__Impl();

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
    // $ANTLR end "rule__LExpr__Group__1"


    // $ANTLR start "rule__LExpr__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4666:1: rule__LExpr__Group__1__Impl : ( ( rule__LExpr__EAssignment_1 ) ) ;
    public final void rule__LExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4670:1: ( ( ( rule__LExpr__EAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4671:1: ( ( rule__LExpr__EAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4671:1: ( ( rule__LExpr__EAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4672:1: ( rule__LExpr__EAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getEAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4673:1: ( rule__LExpr__EAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4673:2: rule__LExpr__EAssignment_1
            {
            pushFollow(FOLLOW_rule__LExpr__EAssignment_1_in_rule__LExpr__Group__1__Impl9389);
            rule__LExpr__EAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getEAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4687:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4691:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4692:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09423);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09426);
            rule__ExprAnd__Group__1();

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
    // $ANTLR end "rule__ExprAnd__Group__0"


    // $ANTLR start "rule__ExprAnd__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4699:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__Exo1Assignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4703:1: ( ( ( rule__ExprAnd__Exo1Assignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4704:1: ( ( rule__ExprAnd__Exo1Assignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4704:1: ( ( rule__ExprAnd__Exo1Assignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4705:1: ( rule__ExprAnd__Exo1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExo1Assignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4706:1: ( rule__ExprAnd__Exo1Assignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4706:2: rule__ExprAnd__Exo1Assignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Exo1Assignment_0_in_rule__ExprAnd__Group__0__Impl9453);
            rule__ExprAnd__Exo1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExo1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4716:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4720:1: ( rule__ExprAnd__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4721:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19483);
            rule__ExprAnd__Group__1__Impl();

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
    // $ANTLR end "rule__ExprAnd__Group__1"


    // $ANTLR start "rule__ExprAnd__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4727:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )* ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4731:1: ( ( ( rule__ExprAnd__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4732:1: ( ( rule__ExprAnd__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4732:1: ( ( rule__ExprAnd__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4733:1: ( rule__ExprAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4734:1: ( rule__ExprAnd__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==42) ) {
                        alt18=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3==42) ) {
                        alt18=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (LA18_4==42) ) {
                        alt18=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (LA18_5==42) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 42:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4734:2: rule__ExprAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9510);
            	    rule__ExprAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4748:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4752:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4753:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09545);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09548);
            rule__ExprAnd__Group_1__1();

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
    // $ANTLR end "rule__ExprAnd__Group_1__0"


    // $ANTLR start "rule__ExprAnd__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4760:1: rule__ExprAnd__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4764:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4765:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4765:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4766:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9575);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4777:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4781:1: ( rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4782:2: rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19604);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19607);
            rule__ExprAnd__Group_1__2();

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
    // $ANTLR end "rule__ExprAnd__Group_1__1"


    // $ANTLR start "rule__ExprAnd__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4789:1: rule__ExprAnd__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4793:1: ( ( 'and' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4794:1: ( 'and' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4794:1: ( 'and' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4795:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4808:1: rule__ExprAnd__Group_1__2 : rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 ;
    public final void rule__ExprAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4812:1: ( rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4813:2: rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29666);
            rule__ExprAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29669);
            rule__ExprAnd__Group_1__3();

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
    // $ANTLR end "rule__ExprAnd__Group_1__2"


    // $ANTLR start "rule__ExprAnd__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4820:1: rule__ExprAnd__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4824:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4825:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4825:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4826:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9696);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__2__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4837:1: rule__ExprAnd__Group_1__3 : rule__ExprAnd__Group_1__3__Impl ;
    public final void rule__ExprAnd__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4841:1: ( rule__ExprAnd__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4842:2: rule__ExprAnd__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39725);
            rule__ExprAnd__Group_1__3__Impl();

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
    // $ANTLR end "rule__ExprAnd__Group_1__3"


    // $ANTLR start "rule__ExprAnd__Group_1__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4848:1: rule__ExprAnd__Group_1__3__Impl : ( ( rule__ExprAnd__Exo2Assignment_1_3 ) ) ;
    public final void rule__ExprAnd__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4852:1: ( ( ( rule__ExprAnd__Exo2Assignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4853:1: ( ( rule__ExprAnd__Exo2Assignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4853:1: ( ( rule__ExprAnd__Exo2Assignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4854:1: ( rule__ExprAnd__Exo2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExo2Assignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4855:1: ( rule__ExprAnd__Exo2Assignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4855:2: rule__ExprAnd__Exo2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprAnd__Exo2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9752);
            rule__ExprAnd__Exo2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExo2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__3__Impl"


    // $ANTLR start "rule__ExprOr__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4873:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4877:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4878:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09790);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09793);
            rule__ExprOr__Group__1();

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
    // $ANTLR end "rule__ExprOr__Group__0"


    // $ANTLR start "rule__ExprOr__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4885:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__Exn1Assignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4889:1: ( ( ( rule__ExprOr__Exn1Assignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4890:1: ( ( rule__ExprOr__Exn1Assignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4890:1: ( ( rule__ExprOr__Exn1Assignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4891:1: ( rule__ExprOr__Exn1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExn1Assignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4892:1: ( rule__ExprOr__Exn1Assignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4892:2: rule__ExprOr__Exn1Assignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__Exn1Assignment_0_in_rule__ExprOr__Group__0__Impl9820);
            rule__ExprOr__Exn1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExn1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0__Impl"


    // $ANTLR start "rule__ExprOr__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4902:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4906:1: ( rule__ExprOr__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4907:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19850);
            rule__ExprOr__Group__1__Impl();

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
    // $ANTLR end "rule__ExprOr__Group__1"


    // $ANTLR start "rule__ExprOr__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4913:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )* ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4917:1: ( ( ( rule__ExprOr__Group_1__0 )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4918:1: ( ( rule__ExprOr__Group_1__0 )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4918:1: ( ( rule__ExprOr__Group_1__0 )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4919:1: ( rule__ExprOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4920:1: ( rule__ExprOr__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==43) ) {
                        alt19=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (LA19_3==43) ) {
                        alt19=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (LA19_4==43) ) {
                        alt19=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (LA19_5==43) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 43:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4920:2: rule__ExprOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9877);
            	    rule__ExprOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4934:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4938:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4939:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09912);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09915);
            rule__ExprOr__Group_1__1();

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
    // $ANTLR end "rule__ExprOr__Group_1__0"


    // $ANTLR start "rule__ExprOr__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4946:1: rule__ExprOr__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4950:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4951:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4951:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4952:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9942);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4963:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4967:1: ( rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4968:2: rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19971);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19974);
            rule__ExprOr__Group_1__2();

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
    // $ANTLR end "rule__ExprOr__Group_1__1"


    // $ANTLR start "rule__ExprOr__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4975:1: rule__ExprOr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4979:1: ( ( 'or' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4980:1: ( 'or' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4980:1: ( 'or' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4981:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl10002); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4994:1: rule__ExprOr__Group_1__2 : rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 ;
    public final void rule__ExprOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4998:1: ( rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4999:2: rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__210033);
            rule__ExprOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__210036);
            rule__ExprOr__Group_1__3();

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
    // $ANTLR end "rule__ExprOr__Group_1__2"


    // $ANTLR start "rule__ExprOr__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5006:1: rule__ExprOr__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5010:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5011:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5011:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5012:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10063);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__2__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5023:1: rule__ExprOr__Group_1__3 : rule__ExprOr__Group_1__3__Impl ;
    public final void rule__ExprOr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5027:1: ( rule__ExprOr__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5028:2: rule__ExprOr__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310092);
            rule__ExprOr__Group_1__3__Impl();

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
    // $ANTLR end "rule__ExprOr__Group_1__3"


    // $ANTLR start "rule__ExprOr__Group_1__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5034:1: rule__ExprOr__Group_1__3__Impl : ( ( rule__ExprOr__Exn2Assignment_1_3 ) ) ;
    public final void rule__ExprOr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5038:1: ( ( ( rule__ExprOr__Exn2Assignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5039:1: ( ( rule__ExprOr__Exn2Assignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5039:1: ( ( rule__ExprOr__Exn2Assignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5040:1: ( rule__ExprOr__Exn2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExn2Assignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5041:1: ( rule__ExprOr__Exn2Assignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5041:2: rule__ExprOr__Exn2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprOr__Exn2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10119);
            rule__ExprOr__Exn2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExn2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__3__Impl"


    // $ANTLR start "rule__ExprNot__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5059:1: rule__ExprNot__Group_0__0 : rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1 ;
    public final void rule__ExprNot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5063:1: ( rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5064:2: rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group_0__0__Impl_in_rule__ExprNot__Group_0__010157);
            rule__ExprNot__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group_0__1_in_rule__ExprNot__Group_0__010160);
            rule__ExprNot__Group_0__1();

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
    // $ANTLR end "rule__ExprNot__Group_0__0"


    // $ANTLR start "rule__ExprNot__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5071:1: rule__ExprNot__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__ExprNot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5075:1: ( ( 'not' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5076:1: ( 'not' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5076:1: ( 'not' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5077:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ExprNot__Group_0__0__Impl10188); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__0__Impl"


    // $ANTLR start "rule__ExprNot__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5090:1: rule__ExprNot__Group_0__1 : rule__ExprNot__Group_0__1__Impl rule__ExprNot__Group_0__2 ;
    public final void rule__ExprNot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5094:1: ( rule__ExprNot__Group_0__1__Impl rule__ExprNot__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5095:2: rule__ExprNot__Group_0__1__Impl rule__ExprNot__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprNot__Group_0__1__Impl_in_rule__ExprNot__Group_0__110219);
            rule__ExprNot__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group_0__2_in_rule__ExprNot__Group_0__110222);
            rule__ExprNot__Group_0__2();

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
    // $ANTLR end "rule__ExprNot__Group_0__1"


    // $ANTLR start "rule__ExprNot__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5102:1: rule__ExprNot__Group_0__1__Impl : ( ruleLC ) ;
    public final void rule__ExprNot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5106:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5107:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5107:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5108:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprNot__Group_0__1__Impl10249);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__1__Impl"


    // $ANTLR start "rule__ExprNot__Group_0__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5119:1: rule__ExprNot__Group_0__2 : rule__ExprNot__Group_0__2__Impl ;
    public final void rule__ExprNot__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5123:1: ( rule__ExprNot__Group_0__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5124:2: rule__ExprNot__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group_0__2__Impl_in_rule__ExprNot__Group_0__210278);
            rule__ExprNot__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExprNot__Group_0__2"


    // $ANTLR start "rule__ExprNot__Group_0__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5130:1: rule__ExprNot__Group_0__2__Impl : ( ( rule__ExprNot__ExQ1Assignment_0_2 ) ) ;
    public final void rule__ExprNot__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5134:1: ( ( ( rule__ExprNot__ExQ1Assignment_0_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5135:1: ( ( rule__ExprNot__ExQ1Assignment_0_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5135:1: ( ( rule__ExprNot__ExQ1Assignment_0_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5136:1: ( rule__ExprNot__ExQ1Assignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExQ1Assignment_0_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5137:1: ( rule__ExprNot__ExQ1Assignment_0_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5137:2: rule__ExprNot__ExQ1Assignment_0_2
            {
            pushFollow(FOLLOW_rule__ExprNot__ExQ1Assignment_0_2_in_rule__ExprNot__Group_0__2__Impl10305);
            rule__ExprNot__ExQ1Assignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExQ1Assignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__2__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5153:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5157:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5158:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010341);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010344);
            rule__ExprEq__Group_0__1();

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
    // $ANTLR end "rule__ExprEq__Group_0__0"


    // $ANTLR start "rule__ExprEq__Group_0__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5165:1: rule__ExprEq__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5169:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5170:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5170:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5171:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprEq__Group_0__0__Impl10372); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5184:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5188:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5189:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110403);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110406);
            rule__ExprEq__Group_0__2();

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
    // $ANTLR end "rule__ExprEq__Group_0__1"


    // $ANTLR start "rule__ExprEq__Group_0__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5196:1: rule__ExprEq__Group_0__1__Impl : ( ( rule__ExprEq__ExS1Assignment_0_1 ) ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5200:1: ( ( ( rule__ExprEq__ExS1Assignment_0_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5201:1: ( ( rule__ExprEq__ExS1Assignment_0_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5201:1: ( ( rule__ExprEq__ExS1Assignment_0_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5202:1: ( rule__ExprEq__ExS1Assignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExS1Assignment_0_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5203:1: ( rule__ExprEq__ExS1Assignment_0_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5203:2: rule__ExprEq__ExS1Assignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExS1Assignment_0_1_in_rule__ExprEq__Group_0__1__Impl10433);
            rule__ExprEq__ExS1Assignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExS1Assignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5213:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl rule__ExprEq__Group_0__3 ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5217:1: ( rule__ExprEq__Group_0__2__Impl rule__ExprEq__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5218:2: rule__ExprEq__Group_0__2__Impl rule__ExprEq__Group_0__3
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210463);
            rule__ExprEq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__3_in_rule__ExprEq__Group_0__210466);
            rule__ExprEq__Group_0__3();

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
    // $ANTLR end "rule__ExprEq__Group_0__2"


    // $ANTLR start "rule__ExprEq__Group_0__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5225:1: rule__ExprEq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5229:1: ( ( '=?' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5230:1: ( '=?' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5230:1: ( '=?' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5231:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__ExprEq__Group_0__2__Impl10494); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5244:1: rule__ExprEq__Group_0__3 : rule__ExprEq__Group_0__3__Impl rule__ExprEq__Group_0__4 ;
    public final void rule__ExprEq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5248:1: ( rule__ExprEq__Group_0__3__Impl rule__ExprEq__Group_0__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5249:2: rule__ExprEq__Group_0__3__Impl rule__ExprEq__Group_0__4
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__3__Impl_in_rule__ExprEq__Group_0__310525);
            rule__ExprEq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__4_in_rule__ExprEq__Group_0__310528);
            rule__ExprEq__Group_0__4();

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
    // $ANTLR end "rule__ExprEq__Group_0__3"


    // $ANTLR start "rule__ExprEq__Group_0__3__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5256:1: rule__ExprEq__Group_0__3__Impl : ( ( rule__ExprEq__ExS2Assignment_0_3 ) ) ;
    public final void rule__ExprEq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5260:1: ( ( ( rule__ExprEq__ExS2Assignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5261:1: ( ( rule__ExprEq__ExS2Assignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5261:1: ( ( rule__ExprEq__ExS2Assignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5262:1: ( rule__ExprEq__ExS2Assignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExS2Assignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5263:1: ( rule__ExprEq__ExS2Assignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5263:2: rule__ExprEq__ExS2Assignment_0_3
            {
            pushFollow(FOLLOW_rule__ExprEq__ExS2Assignment_0_3_in_rule__ExprEq__Group_0__3__Impl10555);
            rule__ExprEq__ExS2Assignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExS2Assignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__3__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5273:1: rule__ExprEq__Group_0__4 : rule__ExprEq__Group_0__4__Impl ;
    public final void rule__ExprEq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5277:1: ( rule__ExprEq__Group_0__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5278:2: rule__ExprEq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__4__Impl_in_rule__ExprEq__Group_0__410585);
            rule__ExprEq__Group_0__4__Impl();

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
    // $ANTLR end "rule__ExprEq__Group_0__4"


    // $ANTLR start "rule__ExprEq__Group_0__4__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5284:1: rule__ExprEq__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5288:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5289:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5289:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5290:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprEq__Group_0__4__Impl10613); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__4__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5313:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5317:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5318:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010654);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010657);
            rule__ExprEq__Group_1__1();

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
    // $ANTLR end "rule__ExprEq__Group_1__0"


    // $ANTLR start "rule__ExprEq__Group_1__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5325:1: rule__ExprEq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5329:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5330:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5330:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5331:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprEq__Group_1__0__Impl10685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5344:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5348:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5349:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110716);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110719);
            rule__ExprEq__Group_1__2();

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
    // $ANTLR end "rule__ExprEq__Group_1__1"


    // $ANTLR start "rule__ExprEq__Group_1__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5356:1: rule__ExprEq__Group_1__1__Impl : ( ( rule__ExprEq__ExAssignment_1_1 ) ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5360:1: ( ( ( rule__ExprEq__ExAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5361:1: ( ( rule__ExprEq__ExAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5361:1: ( ( rule__ExprEq__ExAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5362:1: ( rule__ExprEq__ExAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5363:1: ( rule__ExprEq__ExAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5363:2: rule__ExprEq__ExAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10746);
            rule__ExprEq__ExAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5373:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5377:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5378:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210776);
            rule__ExprEq__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExprEq__Group_1__2"


    // $ANTLR start "rule__ExprEq__Group_1__2__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5384:1: rule__ExprEq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5388:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5389:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5389:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5390:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprEq__Group_1__2__Impl10804); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2__Impl"


    // $ANTLR start "rule__VAR__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5409:1: rule__VAR__Group__0 : rule__VAR__Group__0__Impl rule__VAR__Group__1 ;
    public final void rule__VAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5413:1: ( rule__VAR__Group__0__Impl rule__VAR__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5414:2: rule__VAR__Group__0__Impl rule__VAR__Group__1
            {
            pushFollow(FOLLOW_rule__VAR__Group__0__Impl_in_rule__VAR__Group__010841);
            rule__VAR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VAR__Group__1_in_rule__VAR__Group__010844);
            rule__VAR__Group__1();

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
    // $ANTLR end "rule__VAR__Group__0"


    // $ANTLR start "rule__VAR__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5421:1: rule__VAR__Group__0__Impl : ( ( rule__VAR__BvAssignment_0 ) ) ;
    public final void rule__VAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5425:1: ( ( ( rule__VAR__BvAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5426:1: ( ( rule__VAR__BvAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5426:1: ( ( rule__VAR__BvAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5427:1: ( rule__VAR__BvAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getBvAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5428:1: ( rule__VAR__BvAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5428:2: rule__VAR__BvAssignment_0
            {
            pushFollow(FOLLOW_rule__VAR__BvAssignment_0_in_rule__VAR__Group__0__Impl10871);
            rule__VAR__BvAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getBvAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAR__Group__0__Impl"


    // $ANTLR start "rule__VAR__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5438:1: rule__VAR__Group__1 : rule__VAR__Group__1__Impl ;
    public final void rule__VAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5442:1: ( rule__VAR__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5443:2: rule__VAR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VAR__Group__1__Impl_in_rule__VAR__Group__110901);
            rule__VAR__Group__1__Impl();

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
    // $ANTLR end "rule__VAR__Group__1"


    // $ANTLR start "rule__VAR__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5449:1: rule__VAR__Group__1__Impl : ( ( rule__VAR__CfAssignment_1 ) ) ;
    public final void rule__VAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5453:1: ( ( ( rule__VAR__CfAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5454:1: ( ( rule__VAR__CfAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5454:1: ( ( rule__VAR__CfAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5455:1: ( rule__VAR__CfAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getCfAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5456:1: ( rule__VAR__CfAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5456:2: rule__VAR__CfAssignment_1
            {
            pushFollow(FOLLOW_rule__VAR__CfAssignment_1_in_rule__VAR__Group__1__Impl10928);
            rule__VAR__CfAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getCfAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAR__Group__1__Impl"


    // $ANTLR start "rule__SYMB__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5470:1: rule__SYMB__Group__0 : rule__SYMB__Group__0__Impl rule__SYMB__Group__1 ;
    public final void rule__SYMB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5474:1: ( rule__SYMB__Group__0__Impl rule__SYMB__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5475:2: rule__SYMB__Group__0__Impl rule__SYMB__Group__1
            {
            pushFollow(FOLLOW_rule__SYMB__Group__0__Impl_in_rule__SYMB__Group__010962);
            rule__SYMB__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SYMB__Group__1_in_rule__SYMB__Group__010965);
            rule__SYMB__Group__1();

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
    // $ANTLR end "rule__SYMB__Group__0"


    // $ANTLR start "rule__SYMB__Group__0__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5482:1: rule__SYMB__Group__0__Impl : ( ( rule__SYMB__BsAssignment_0 ) ) ;
    public final void rule__SYMB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5486:1: ( ( ( rule__SYMB__BsAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5487:1: ( ( rule__SYMB__BsAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5487:1: ( ( rule__SYMB__BsAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5488:1: ( rule__SYMB__BsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBAccess().getBsAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5489:1: ( rule__SYMB__BsAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5489:2: rule__SYMB__BsAssignment_0
            {
            pushFollow(FOLLOW_rule__SYMB__BsAssignment_0_in_rule__SYMB__Group__0__Impl10992);
            rule__SYMB__BsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBAccess().getBsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SYMB__Group__0__Impl"


    // $ANTLR start "rule__SYMB__Group__1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5499:1: rule__SYMB__Group__1 : rule__SYMB__Group__1__Impl ;
    public final void rule__SYMB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5503:1: ( rule__SYMB__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5504:2: rule__SYMB__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SYMB__Group__1__Impl_in_rule__SYMB__Group__111022);
            rule__SYMB__Group__1__Impl();

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
    // $ANTLR end "rule__SYMB__Group__1"


    // $ANTLR start "rule__SYMB__Group__1__Impl"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5510:1: rule__SYMB__Group__1__Impl : ( ( rule__SYMB__CfAssignment_1 ) ) ;
    public final void rule__SYMB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5514:1: ( ( ( rule__SYMB__CfAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5515:1: ( ( rule__SYMB__CfAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5515:1: ( ( rule__SYMB__CfAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5516:1: ( rule__SYMB__CfAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBAccess().getCfAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5517:1: ( rule__SYMB__CfAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5517:2: rule__SYMB__CfAssignment_1
            {
            pushFollow(FOLLOW_rule__SYMB__CfAssignment_1_in_rule__SYMB__Group__1__Impl11049);
            rule__SYMB__CfAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBAccess().getCfAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SYMB__Group__1__Impl"


    // $ANTLR start "rule__Model__NnAssignment"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5532:1: rule__Model__NnAssignment : ( ruleProgram ) ;
    public final void rule__Model__NnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5536:1: ( ( ruleProgram ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5537:1: ( ruleProgram )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5537:1: ( ruleProgram )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5538:1: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNnProgramParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_rule__Model__NnAssignment11088);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNnProgramParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NnAssignment"


    // $ANTLR start "rule__Program__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5547:1: rule__Program__FAssignment_0 : ( ruleFunction ) ;
    public final void rule__Program__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5551:1: ( ( ruleFunction ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5552:1: ( ruleFunction )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5552:1: ( ruleFunction )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5553:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FAssignment_011119);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5562:1: rule__Program__UAssignment_1_0 : ( RULE_CR ) ;
    public final void rule__Program__UAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5566:1: ( ( RULE_CR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5567:1: ( RULE_CR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5567:1: ( RULE_CR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5568:1: RULE_CR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getUCRTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__Program__UAssignment_1_011150); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5577:1: rule__Program__PpAssignment_1_1 : ( ruleProgram ) ;
    public final void rule__Program__PpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5581:1: ( ( ruleProgram ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5582:1: ( ruleProgram )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5582:1: ( ruleProgram )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5583:1: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPpProgramParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_rule__Program__PpAssignment_1_111181);
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


    // $ANTLR start "rule__Function__NameAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5592:1: rule__Function__NameAssignment_2 : ( ruleSYMB ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5596:1: ( ( ruleSYMB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5597:1: ( ruleSYMB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5597:1: ( ruleSYMB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5598:1: ruleSYMB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameSYMBParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSYMB_in_rule__Function__NameAssignment_211212);
            ruleSYMB();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameSYMBParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__DefAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5607:1: rule__Function__DefAssignment_5 : ( ruleDefinition ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5611:1: ( ( ruleDefinition ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5612:1: ( ruleDefinition )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5612:1: ( ruleDefinition )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5613:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__Function__DefAssignment_511243);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefDefinitionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefAssignment_5"


    // $ANTLR start "rule__Definition__InAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5622:1: rule__Definition__InAssignment_2 : ( ruleInput ) ;
    public final void rule__Definition__InAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5626:1: ( ( ruleInput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5627:1: ( ruleInput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5627:1: ( ruleInput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5628:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definition__InAssignment_211274);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInInputParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__InAssignment_2"


    // $ANTLR start "rule__Definition__ComAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5637:1: rule__Definition__ComAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definition__ComAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5641:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5642:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5642:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5643:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getComCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definition__ComAssignment_511305);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getComCommandsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ComAssignment_5"


    // $ANTLR start "rule__Definition__OutAssignment_10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5652:1: rule__Definition__OutAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definition__OutAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5656:1: ( ( ruleOutput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5657:1: ( ruleOutput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5657:1: ( ruleOutput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5658:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definition__OutAssignment_1011336);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutOutputParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__OutAssignment_10"


    // $ANTLR start "rule__Input__VAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5667:1: rule__Input__VAssignment_0 : ( ruleVAR ) ;
    public final void rule__Input__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5671:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5672:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5672:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5673:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Input__VAssignment_011367);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVVARParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VAssignment_0"


    // $ANTLR start "rule__Input__VAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5682:1: rule__Input__VAssignment_1_1 : ( ruleVAR ) ;
    public final void rule__Input__VAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5686:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5687:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5687:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5688:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Input__VAssignment_1_111398);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVVARParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VAssignment_1_1"


    // $ANTLR start "rule__Output__VAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5697:1: rule__Output__VAssignment_0 : ( ruleVAR ) ;
    public final void rule__Output__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5701:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5702:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5702:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5703:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVVARParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Output__VAssignment_011429);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVVARParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VAssignment_0"


    // $ANTLR start "rule__Output__VAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5712:1: rule__Output__VAssignment_1_1 : ( ruleVAR ) ;
    public final void rule__Output__VAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5716:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5717:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5717:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5718:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVVARParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Output__VAssignment_1_111460);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVVARParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VAssignment_1_1"


    // $ANTLR start "rule__Commands__CAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5727:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5731:1: ( ( ruleCommand ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5732:1: ( ruleCommand )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5732:1: ( ruleCommand )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5733:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_011491);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CAssignment_0"


    // $ANTLR start "rule__Commands__CAssignment_1_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5742:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5746:1: ( ( ruleCommand ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5747:1: ( ruleCommand )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5747:1: ( ruleCommand )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5748:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_211522);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CAssignment_1_2"


    // $ANTLR start "rule__Command__NopAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5757:1: rule__Command__NopAssignment_0 : ( ( 'nop' ) ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5761:1: ( ( ( 'nop' ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5762:1: ( ( 'nop' ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5762:1: ( ( 'nop' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5763:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5764:1: ( 'nop' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5765:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Command__NopAssignment_011558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Command__AssignAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5780:1: rule__Command__AssignAssignment_1 : ( ruleAssign ) ;
    public final void rule__Command__AssignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5784:1: ( ( ruleAssign ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5785:1: ( ruleAssign )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5785:1: ( ruleAssign )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5786:1: ruleAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAssignAssignParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_rule__Command__AssignAssignment_111597);
            ruleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAssignAssignParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__AssignAssignment_1"


    // $ANTLR start "rule__Command__WhAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5795:1: rule__Command__WhAssignment_2 : ( ruleWhile ) ;
    public final void rule__Command__WhAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5799:1: ( ( ruleWhile ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5800:1: ( ruleWhile )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5800:1: ( ruleWhile )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5801:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211628);
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


    // $ANTLR start "rule__Command__ForAssignment_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5810:1: rule__Command__ForAssignment_3 : ( ruleFor ) ;
    public final void rule__Command__ForAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5814:1: ( ( ruleFor ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5815:1: ( ruleFor )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5815:1: ( ruleFor )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5816:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Command__ForAssignment_311659);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForForParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ForAssignment_3"


    // $ANTLR start "rule__Command__IfAssignment_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5825:1: rule__Command__IfAssignment_4 : ( ruleIf ) ;
    public final void rule__Command__IfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5829:1: ( ( ruleIf ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5830:1: ( ruleIf )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5830:1: ( ruleIf )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5831:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getIfIfParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Command__IfAssignment_411690);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getIfIfParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__IfAssignment_4"


    // $ANTLR start "rule__Command__ForeAssignment_5"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5840:1: rule__Command__ForeAssignment_5 : ( ruleForeach ) ;
    public final void rule__Command__ForeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5844:1: ( ( ruleForeach ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5845:1: ( ruleForeach )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5845:1: ( ruleForeach )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5846:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_511721);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ForeAssignment_5"


    // $ANTLR start "rule__Command__IfcAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5855:1: rule__Command__IfcAssignment_6 : ( ruleIfconfort ) ;
    public final void rule__Command__IfcAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5859:1: ( ( ruleIfconfort ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5860:1: ( ruleIfconfort )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5860:1: ( ruleIfconfort )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5861:1: ruleIfconfort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getIfcIfconfortParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleIfconfort_in_rule__Command__IfcAssignment_611752);
            ruleIfconfort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getIfcIfconfortParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__IfcAssignment_6"


    // $ANTLR start "rule__Assign__VsAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5870:1: rule__Assign__VsAssignment_0 : ( ruleVars ) ;
    public final void rule__Assign__VsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5874:1: ( ( ruleVars ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5875:1: ( ruleVars )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5875:1: ( ruleVars )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5876:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getVsVarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Assign__VsAssignment_011783);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getVsVarsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__VsAssignment_0"


    // $ANTLR start "rule__Assign__ExAssignment_4"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5885:1: rule__Assign__ExAssignment_4 : ( ruleExprs ) ;
    public final void rule__Assign__ExAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5889:1: ( ( ruleExprs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5890:1: ( ruleExprs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5890:1: ( ruleExprs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5891:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getExExprsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Assign__ExAssignment_411814);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignAccess().getExExprsParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__ExAssignment_4"


    // $ANTLR start "rule__While__ExAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5900:1: rule__While__ExAssignment_2 : ( ruleExpr ) ;
    public final void rule__While__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5904:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5905:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5905:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5906:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__While__ExAssignment_211845);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ExAssignment_2"


    // $ANTLR start "rule__While__CAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5915:1: rule__While__CAssignment_6 : ( ruleCommands ) ;
    public final void rule__While__CAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5919:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5920:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5920:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5921:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__While__CAssignment_611876);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCCommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__CAssignment_6"


    // $ANTLR start "rule__For__ExAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5930:1: rule__For__ExAssignment_2 : ( ruleExpr ) ;
    public final void rule__For__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5934:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5935:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5935:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5936:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__For__ExAssignment_211907);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getExExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__ExAssignment_2"


    // $ANTLR start "rule__For__CAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5945:1: rule__For__CAssignment_6 : ( ruleCommands ) ;
    public final void rule__For__CAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5949:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5950:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5950:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5951:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__For__CAssignment_611938);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCCommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__CAssignment_6"


    // $ANTLR start "rule__If__ExAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5960:1: rule__If__ExAssignment_2 : ( ruleExpr ) ;
    public final void rule__If__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5964:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5965:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5965:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5966:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__If__ExAssignment_211969);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ExAssignment_2"


    // $ANTLR start "rule__If__CtAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5975:1: rule__If__CtAssignment_6 : ( ruleCommands ) ;
    public final void rule__If__CtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5979:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5980:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5980:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5981:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCtCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__CtAssignment_612000);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCtCommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CtAssignment_6"


    // $ANTLR start "rule__If__CeAssignment_10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5990:1: rule__If__CeAssignment_10 : ( ruleCommands ) ;
    public final void rule__If__CeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5994:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5995:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5995:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5996:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCeCommandsParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__CeAssignment_1012031);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCeCommandsParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CeAssignment_10"


    // $ANTLR start "rule__Foreach__Ex1Assignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6005:1: rule__Foreach__Ex1Assignment_2 : ( ruleExpr ) ;
    public final void rule__Foreach__Ex1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6009:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6010:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6010:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6011:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getEx1ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Ex1Assignment_212062);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getEx1ExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Ex1Assignment_2"


    // $ANTLR start "rule__Foreach__Ex2Assignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6020:1: rule__Foreach__Ex2Assignment_6 : ( ruleExpr ) ;
    public final void rule__Foreach__Ex2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6024:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6025:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6025:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6026:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getEx2ExprParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Ex2Assignment_612093);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getEx2ExprParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Ex2Assignment_6"


    // $ANTLR start "rule__Foreach__CAssignment_10"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6035:1: rule__Foreach__CAssignment_10 : ( ruleCommands ) ;
    public final void rule__Foreach__CAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6039:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6040:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6040:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6041:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCCommandsParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Foreach__CAssignment_1012124);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getCCommandsParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__CAssignment_10"


    // $ANTLR start "rule__Ifconfort__ExAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6050:1: rule__Ifconfort__ExAssignment_2 : ( ruleExpr ) ;
    public final void rule__Ifconfort__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6054:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6055:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6055:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6056:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getExExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Ifconfort__ExAssignment_212155);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getExExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__ExAssignment_2"


    // $ANTLR start "rule__Ifconfort__CAssignment_6"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6065:1: rule__Ifconfort__CAssignment_6 : ( ruleCommands ) ;
    public final void rule__Ifconfort__CAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6069:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6070:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6070:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6071:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfconfortAccess().getCCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Ifconfort__CAssignment_612186);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfconfortAccess().getCCommandsParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ifconfort__CAssignment_6"


    // $ANTLR start "rule__Vars__VsAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6080:1: rule__Vars__VsAssignment_0 : ( ruleVAR ) ;
    public final void rule__Vars__VsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6084:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6085:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6085:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6086:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVsVARParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Vars__VsAssignment_012217);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVsVARParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VsAssignment_0"


    // $ANTLR start "rule__Vars__VsAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6095:1: rule__Vars__VsAssignment_1_1 : ( ruleVAR ) ;
    public final void rule__Vars__VsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6099:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6100:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6100:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6101:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVsVARParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__Vars__VsAssignment_1_112248);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVsVARParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VsAssignment_1_1"


    // $ANTLR start "rule__Exprs__ExAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6110:1: rule__Exprs__ExAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6114:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6115:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6115:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6116:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExAssignment_012279);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExAssignment_0"


    // $ANTLR start "rule__Exprs__ExAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6125:1: rule__Exprs__ExAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6129:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6130:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6130:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6131:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExAssignment_1_112310);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExAssignment_1_1"


    // $ANTLR start "rule__Expr__ExsAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6140:1: rule__Expr__ExsAssignment_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6144:1: ( ( ruleExprSimple ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6145:1: ( ruleExprSimple )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6145:1: ( ruleExprSimple )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6146:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExsExprSimpleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExsAssignment_012341);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExsExprSimpleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExsAssignment_0"


    // $ANTLR start "rule__Expr__ExaAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6155:1: rule__Expr__ExaAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6159:1: ( ( ruleExprAnd ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6160:1: ( ruleExprAnd )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6160:1: ( ruleExprAnd )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6161:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExaExprAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExaAssignment_112372);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExaExprAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExaAssignment_1"


    // $ANTLR start "rule__ExprSimple__NilAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6170:1: rule__ExprSimple__NilAssignment_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__NilAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6174:1: ( ( ( 'nil' ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6175:1: ( ( 'nil' ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6175:1: ( ( 'nil' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6176:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6177:1: ( 'nil' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6178:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ExprSimple__NilAssignment_012408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__NilAssignment_0"


    // $ANTLR start "rule__ExprSimple__VAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6193:1: rule__ExprSimple__VAssignment_1 : ( ruleVAR ) ;
    public final void rule__ExprSimple__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6197:1: ( ( ruleVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6198:1: ( ruleVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6198:1: ( ruleVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6199:1: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVVARParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_rule__ExprSimple__VAssignment_112447);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVVARParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__VAssignment_1"


    // $ANTLR start "rule__ExprSimple__SymAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6208:1: rule__ExprSimple__SymAssignment_2 : ( ruleSYMB ) ;
    public final void rule__ExprSimple__SymAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6212:1: ( ( ruleSYMB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6213:1: ( ruleSYMB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6213:1: ( ruleSYMB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6214:1: ruleSYMB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSYMB_in_rule__ExprSimple__SymAssignment_212478);
            ruleSYMB();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymAssignment_2"


    // $ANTLR start "rule__ExprSimple__MotAssignment_3_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6223:1: rule__ExprSimple__MotAssignment_3_1 : ( ( rule__ExprSimple__MotAlternatives_3_1_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6227:1: ( ( ( rule__ExprSimple__MotAlternatives_3_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6228:1: ( ( rule__ExprSimple__MotAlternatives_3_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6228:1: ( ( rule__ExprSimple__MotAlternatives_3_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6229:1: ( rule__ExprSimple__MotAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_3_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6230:1: ( rule__ExprSimple__MotAlternatives_3_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6230:2: rule__ExprSimple__MotAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_3_1_0_in_rule__ExprSimple__MotAssignment_3_112509);
            rule__ExprSimple__MotAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAssignment_3_1"


    // $ANTLR start "rule__ExprSimple__LexAssignment_3_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6239:1: rule__ExprSimple__LexAssignment_3_2 : ( ruleLExpr ) ;
    public final void rule__ExprSimple__LexAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6243:1: ( ( ruleLExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6244:1: ( ruleLExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6244:1: ( ruleLExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6245:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__ExprSimple__LexAssignment_3_212542);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__LexAssignment_3_2"


    // $ANTLR start "rule__ExprSimple__MotAssignment_4_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6254:1: rule__ExprSimple__MotAssignment_4_1 : ( ( rule__ExprSimple__MotAlternatives_4_1_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6258:1: ( ( ( rule__ExprSimple__MotAlternatives_4_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6259:1: ( ( rule__ExprSimple__MotAlternatives_4_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6259:1: ( ( rule__ExprSimple__MotAlternatives_4_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6260:1: ( rule__ExprSimple__MotAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_4_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6261:1: ( rule__ExprSimple__MotAlternatives_4_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6261:2: rule__ExprSimple__MotAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_4_1_0_in_rule__ExprSimple__MotAssignment_4_112573);
            rule__ExprSimple__MotAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAssignment_4_1"


    // $ANTLR start "rule__ExprSimple__ExAssignment_4_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6270:1: rule__ExprSimple__ExAssignment_4_3 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6274:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6275:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6275:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6276:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExExprParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExAssignment_4_312606);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExExprParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExAssignment_4_3"


    // $ANTLR start "rule__ExprSimple__SymAssignment_5_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6285:1: rule__ExprSimple__SymAssignment_5_1 : ( ruleSYMB ) ;
    public final void rule__ExprSimple__SymAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6289:1: ( ( ruleSYMB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6290:1: ( ruleSYMB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6290:1: ( ruleSYMB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6291:1: ruleSYMB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleSYMB_in_rule__ExprSimple__SymAssignment_5_112637);
            ruleSYMB();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymAssignment_5_1"


    // $ANTLR start "rule__ExprSimple__LexAssignment_5_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6300:1: rule__ExprSimple__LexAssignment_5_2 : ( ruleLExpr ) ;
    public final void rule__ExprSimple__LexAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6304:1: ( ( ruleLExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6305:1: ( ruleLExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6305:1: ( ruleLExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6306:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__ExprSimple__LexAssignment_5_212668);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__LexAssignment_5_2"


    // $ANTLR start "rule__LExpr__EAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6315:1: rule__LExpr__EAssignment_1 : ( ruleExpr ) ;
    public final void rule__LExpr__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6319:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6320:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6320:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6321:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getEExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__LExpr__EAssignment_112699);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getEExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__EAssignment_1"


    // $ANTLR start "rule__ExprAnd__Exo1Assignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6330:1: rule__ExprAnd__Exo1Assignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__Exo1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6334:1: ( ( ruleExprOr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6335:1: ( ruleExprOr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6335:1: ( ruleExprOr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6336:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExo1ExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__Exo1Assignment_012730);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExo1ExprOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Exo1Assignment_0"


    // $ANTLR start "rule__ExprAnd__Exo2Assignment_1_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6345:1: rule__ExprAnd__Exo2Assignment_1_3 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__Exo2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6349:1: ( ( ruleExprOr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6350:1: ( ruleExprOr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6350:1: ( ruleExprOr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6351:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExo2ExprOrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__Exo2Assignment_1_312761);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExo2ExprOrParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Exo2Assignment_1_3"


    // $ANTLR start "rule__ExprOr__Exn1Assignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6360:1: rule__ExprOr__Exn1Assignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__Exn1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6364:1: ( ( ruleExprNot ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6365:1: ( ruleExprNot )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6365:1: ( ruleExprNot )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6366:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExn1ExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__Exn1Assignment_012792);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExn1ExprNotParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Exn1Assignment_0"


    // $ANTLR start "rule__ExprOr__Exn2Assignment_1_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6375:1: rule__ExprOr__Exn2Assignment_1_3 : ( ruleExprNot ) ;
    public final void rule__ExprOr__Exn2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6379:1: ( ( ruleExprNot ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6380:1: ( ruleExprNot )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6380:1: ( ruleExprNot )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6381:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExn2ExprNotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__Exn2Assignment_1_312823);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExn2ExprNotParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Exn2Assignment_1_3"


    // $ANTLR start "rule__ExprNot__ExQ1Assignment_0_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6390:1: rule__ExprNot__ExQ1Assignment_0_2 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExQ1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6394:1: ( ( ruleExprEq ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6395:1: ( ruleExprEq )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6395:1: ( ruleExprEq )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6396:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExQ1ExprEqParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExQ1Assignment_0_212854);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExQ1ExprEqParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__ExQ1Assignment_0_2"


    // $ANTLR start "rule__ExprNot__ExQ2Assignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6405:1: rule__ExprNot__ExQ2Assignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExQ2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6409:1: ( ( ruleExprEq ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6410:1: ( ruleExprEq )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6410:1: ( ruleExprEq )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6411:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExQ2ExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExQ2Assignment_112885);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExQ2ExprEqParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__ExQ2Assignment_1"


    // $ANTLR start "rule__ExprEq__ExS1Assignment_0_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6420:1: rule__ExprEq__ExS1Assignment_0_1 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExS1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6424:1: ( ( ruleExprSimple ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6425:1: ( ruleExprSimple )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6425:1: ( ruleExprSimple )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6426:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExS1ExprSimpleParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExS1Assignment_0_112916);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExS1ExprSimpleParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExS1Assignment_0_1"


    // $ANTLR start "rule__ExprEq__ExS2Assignment_0_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6435:1: rule__ExprEq__ExS2Assignment_0_3 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExS2Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6439:1: ( ( ruleExprSimple ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6440:1: ( ruleExprSimple )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6440:1: ( ruleExprSimple )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6441:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExS2ExprSimpleParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExS2Assignment_0_312947);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExS2ExprSimpleParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExS2Assignment_0_3"


    // $ANTLR start "rule__ExprEq__ExAssignment_1_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6450:1: rule__ExprEq__ExAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6454:1: ( ( ruleExpr ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6455:1: ( ruleExpr )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6455:1: ( ruleExpr )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6456:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExAssignment_1_112978);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExAssignment_1_1"


    // $ANTLR start "rule__VAR__BvAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6465:1: rule__VAR__BvAssignment_0 : ( RULE_BASEVAR ) ;
    public final void rule__VAR__BvAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6469:1: ( ( RULE_BASEVAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6470:1: ( RULE_BASEVAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6470:1: ( RULE_BASEVAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6471:1: RULE_BASEVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getBvBASEVARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_BASEVAR,FOLLOW_RULE_BASEVAR_in_rule__VAR__BvAssignment_013009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getBvBASEVARTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAR__BvAssignment_0"


    // $ANTLR start "rule__VAR__CfAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6480:1: rule__VAR__CfAssignment_1 : ( RULE_CONF ) ;
    public final void rule__VAR__CfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6484:1: ( ( RULE_CONF ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6485:1: ( RULE_CONF )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6485:1: ( RULE_CONF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6486:1: RULE_CONF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getCfCONFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONF,FOLLOW_RULE_CONF_in_rule__VAR__CfAssignment_113040); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getCfCONFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VAR__CfAssignment_1"


    // $ANTLR start "rule__SYMB__BsAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6495:1: rule__SYMB__BsAssignment_0 : ( RULE_BASESYMB ) ;
    public final void rule__SYMB__BsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6499:1: ( ( RULE_BASESYMB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6500:1: ( RULE_BASESYMB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6500:1: ( RULE_BASESYMB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6501:1: RULE_BASESYMB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBAccess().getBsBASESYMBTerminalRuleCall_0_0()); 
            }
            match(input,RULE_BASESYMB,FOLLOW_RULE_BASESYMB_in_rule__SYMB__BsAssignment_013071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBAccess().getBsBASESYMBTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SYMB__BsAssignment_0"


    // $ANTLR start "rule__SYMB__CfAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6510:1: rule__SYMB__CfAssignment_1 : ( RULE_CONF ) ;
    public final void rule__SYMB__CfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6514:1: ( ( RULE_CONF ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6515:1: ( RULE_CONF )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6515:1: ( RULE_CONF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6516:1: RULE_CONF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSYMBAccess().getCfCONFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONF,FOLLOW_RULE_CONF_in_rule__SYMB__CfAssignment_113102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSYMBAccess().getCfCONFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SYMB__CfAssignment_1"

    // $ANTLR start synpred7_InternalLangage_while
    public final void synpred7_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:6: ( ( ( rule__Command__IfAssignment_4 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:6: ( ( rule__Command__IfAssignment_4 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:6: ( ( rule__Command__IfAssignment_4 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:854:1: ( rule__Command__IfAssignment_4 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCommandAccess().getIfAssignment_4()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:855:1: ( rule__Command__IfAssignment_4 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:855:2: rule__Command__IfAssignment_4
        {
        pushFollow(FOLLOW_rule__Command__IfAssignment_4_in_synpred7_InternalLangage_while1787);
        rule__Command__IfAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLangage_while

    // $ANTLR start synpred9_InternalLangage_while
    public final void synpred9_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: ( ( ( rule__Expr__ExsAssignment_0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: ( ( rule__Expr__ExsAssignment_0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:881:1: ( ( rule__Expr__ExsAssignment_0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:882:1: ( rule__Expr__ExsAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExsAssignment_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:883:1: ( rule__Expr__ExsAssignment_0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:883:2: rule__Expr__ExsAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExsAssignment_0_in_synpred9_InternalLangage_while1856);
        rule__Expr__ExsAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalLangage_while

    // $ANTLR start synpred18_InternalLangage_while
    public final void synpred18_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1023:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1023:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1023:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1024:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1025:1: ( rule__ExprEq__Group_0__0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1025:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred18_InternalLangage_while2191);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalLangage_while

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
    public final boolean synpred7_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLangage_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalLangage_while_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__Model__NnAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0_in_ruleAssign580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0_in_ruleForeach820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfconfort_in_entryRuleIfconfort847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfconfort854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__0_in_ruleIfconfort880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1182 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1194 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_entryRuleVAR1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR__Group__0_in_ruleVAR1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_entryRuleSYMB1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSYMB1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMB__Group__0_in_ruleSYMB1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleLC1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_entryRuleLCs1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCs1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LCs__Alternatives_in_ruleLCs1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AssignAssignment_1_in_rule__Command__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForAssignment_3_in_rule__Command__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__IfAssignment_4_in_rule__Command__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForeAssignment_5_in_rule__Command__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__IfcAssignment_6_in_rule__Command__Alternatives1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExsAssignment_0_in_rule__Expr__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExaAssignment_1_in_rule__Expr__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NilAssignment_0_in_rule__ExprSimple__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VAssignment_1_in_rule__ExprSimple__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymAssignment_2_in_rule__ExprSimple__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExprSimple__MotAlternatives_3_1_02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExprSimple__MotAlternatives_3_1_02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExprSimple__MotAlternatives_4_1_02086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExprSimple__MotAlternatives_4_1_02106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__0_in_rule__ExprNot__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExQ2Assignment_1_in_rule__ExprNot__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LCs__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LCs__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LCs__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LCs__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FAssignment_0_in_rule__Program__Group__0__Impl2353 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__02446 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__UAssignment_1_0_in_rule__Program__Group_1__0__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PpAssignment_1_1_in_rule__Program__Group_1__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02567 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Function__Group__0__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12629 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Function__Group__1__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22688 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_2_in_rule__Function__Group__2__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32748 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Function__Group__3__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Function__Group__4__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__02938 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Definition__Group__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13000 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Definition__Group__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23059 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__InAssignment_2_in_rule__Definition__Group__2__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33119 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Definition__Group__3__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43178 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__43181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Definition__Group__4__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__53240 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__53243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ComAssignment_5_in_rule__Definition__Group__5__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__63300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__7_in_rule__Definition__Group__63303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Definition__Group__6__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__7__Impl_in_rule__Definition__Group__73359 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__8_in_rule__Definition__Group__73362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Definition__Group__7__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__8__Impl_in_rule__Definition__Group__83421 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Definition__Group__9_in_rule__Definition__Group__83424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Definition__Group__8__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__9__Impl_in_rule__Definition__Group__93483 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Definition__Group__10_in_rule__Definition__Group__93486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Definition__Group__9__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__10__Impl_in_rule__Definition__Group__103542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__OutAssignment_10_in_rule__Definition__Group__10__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03621 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3708 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03743 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Input__Group_1__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_1_1_in_rule__Input__Group_1__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03866 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3953 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03988 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Output__Group_1__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VAssignment_1_1_in_rule__Output__Group_1__1__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__04111 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__14171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl4198 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__04233 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Commands__Group_1__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__14295 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Commands__Group_1__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__24354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04417 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__VsAssignment_0_in_rule__Assign__Group__0__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14477 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Assign__Group__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24536 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Assign__Group__2__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34598 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Assign__Group__3__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__ExAssignment_4_in_rule__Assign__Group__4__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04724 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__0__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14786 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24845 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34905 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__3__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44964 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__While__Group__4__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__55026 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__55029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__5__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__65085 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__65088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__CAssignment_6_in_rule__While__Group__6__Impl5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75145 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__75148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__7__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__While__Group__8__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05281 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__05284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__For__Group__0__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15343 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__15346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__1__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25402 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ExAssignment_2_in_rule__For__Group__2__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35462 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__3__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45521 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__4__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55583 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__5__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65642 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CAssignment_6_in_rule__For__Group__6__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75702 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__7__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__For__Group__8__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05838 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__0__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15900 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__1__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25959 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36019 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__36022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__3__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46078 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__46081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group__4__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56140 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__56143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__5__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66199 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__66202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CtAssignment_6_in_rule__If__Group__6__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76259 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__76262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__7__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86318 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__86321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__If__Group__8__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96380 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__If__Group__10_in_rule__If__Group__96383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__9__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__10__Impl_in_rule__If__Group__106439 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__11_in_rule__If__Group__106442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CeAssignment_10_in_rule__If__Group__10__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__11__Impl_in_rule__If__Group__116499 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__If__Group__12_in_rule__If__Group__116502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__11__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__12__Impl_in_rule__If__Group__126558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__If__Group__12__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06643 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Foreach__Group__0__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16705 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26764 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Ex1Assignment_2_in_rule__Foreach__Group__2__Impl6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36824 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46883 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Foreach__Group__4__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56945 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__67004 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__67007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Ex2Assignment_6_in_rule__Foreach__Group__6__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__77064 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__77067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87123 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Foreach__Group__8__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97185 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107244 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__CAssignment_10_in_rule__Foreach__Group__10__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117304 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Foreach__Group__12__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__0__Impl_in_rule__Ifconfort__Group__07448 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__1_in_rule__Ifconfort__Group__07451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Ifconfort__Group__0__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__1__Impl_in_rule__Ifconfort__Group__17510 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__2_in_rule__Ifconfort__Group__17513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Ifconfort__Group__1__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__2__Impl_in_rule__Ifconfort__Group__27569 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__3_in_rule__Ifconfort__Group__27572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__ExAssignment_2_in_rule__Ifconfort__Group__2__Impl7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__3__Impl_in_rule__Ifconfort__Group__37629 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__4_in_rule__Ifconfort__Group__37632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Ifconfort__Group__3__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__4__Impl_in_rule__Ifconfort__Group__47688 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__5_in_rule__Ifconfort__Group__47691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Ifconfort__Group__4__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__5__Impl_in_rule__Ifconfort__Group__57750 = new BitSet(new long[]{0x0000404640000100L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__6_in_rule__Ifconfort__Group__57753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Ifconfort__Group__5__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__6__Impl_in_rule__Ifconfort__Group__67809 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__7_in_rule__Ifconfort__Group__67812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__CAssignment_6_in_rule__Ifconfort__Group__6__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__7__Impl_in_rule__Ifconfort__Group__77869 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__8_in_rule__Ifconfort__Group__77872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Ifconfort__Group__7__Impl7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ifconfort__Group__8__Impl_in_rule__Ifconfort__Group__87928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Ifconfort__Group__8__Impl7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__08005 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__08008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VsAssignment_0_in_rule__Vars__Group__0__Impl8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__18065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl8092 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__08127 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__08130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Vars__Group_1__0__Impl8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__18189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VsAssignment_1_1_in_rule__Vars__Group_1__1__Impl8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__08250 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__08253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExAssignment_0_in_rule__Exprs__Group__0__Impl8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__18310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl8337 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__08372 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__08375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Exprs__Group_1__0__Impl8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__18434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExAssignment_1_1_in_rule__Exprs__Group_1__1__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__08495 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__08498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprSimple__Group_3__0__Impl8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__18557 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__18560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__28617 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__28620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__LexAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__38677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprSimple__Group_3__3__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__08744 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__08747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprSimple__Group_4__0__Impl8775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__18806 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__18809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__28866 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__28869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprSimple__Group_4__2__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__38925 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__4_in_rule__ExprSimple__Group_4__38928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExAssignment_4_3_in_rule__ExprSimple__Group_4__3__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__4__Impl_in_rule__ExprSimple__Group_4__48985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprSimple__Group_4__4__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__09054 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__09057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprSimple__Group_5__0__Impl9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__19116 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__19119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__29176 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__29179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__LexAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__39236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprSimple__Group_5__3__Impl9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09303 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__EAssignment_1_in_rule__LExpr__Group__1__Impl9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09423 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Exo1Assignment_0_in_rule__ExprAnd__Group__0__Impl9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9510 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09545 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19604 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29666 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Exo2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09790 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Exn1Assignment_0_in_rule__ExprOr__Group__0__Impl9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9877 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09912 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19971 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__210033 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__210036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Exn2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__0__Impl_in_rule__ExprNot__Group_0__010157 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__1_in_rule__ExprNot__Group_0__010160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExprNot__Group_0__0__Impl10188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__1__Impl_in_rule__ExprNot__Group_0__110219 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__2_in_rule__ExprNot__Group_0__110222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprNot__Group_0__1__Impl10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__2__Impl_in_rule__ExprNot__Group_0__210278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExQ1Assignment_0_2_in_rule__ExprNot__Group_0__2__Impl10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010341 = new BitSet(new long[]{0x0000810000000500L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprEq__Group_0__0__Impl10372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110403 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExS1Assignment_0_1_in_rule__ExprEq__Group_0__1__Impl10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210463 = new BitSet(new long[]{0x0000810000000500L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__3_in_rule__ExprEq__Group_0__210466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExprEq__Group_0__2__Impl10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__3__Impl_in_rule__ExprEq__Group_0__310525 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__4_in_rule__ExprEq__Group_0__310528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExS2Assignment_0_3_in_rule__ExprEq__Group_0__3__Impl10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__4__Impl_in_rule__ExprEq__Group_0__410585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprEq__Group_0__4__Impl10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010654 = new BitSet(new long[]{0x0000910000000500L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprEq__Group_1__0__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110716 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprEq__Group_1__2__Impl10804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR__Group__0__Impl_in_rule__VAR__Group__010841 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__VAR__Group__1_in_rule__VAR__Group__010844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR__BvAssignment_0_in_rule__VAR__Group__0__Impl10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR__Group__1__Impl_in_rule__VAR__Group__110901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR__CfAssignment_1_in_rule__VAR__Group__1__Impl10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMB__Group__0__Impl_in_rule__SYMB__Group__010962 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SYMB__Group__1_in_rule__SYMB__Group__010965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMB__BsAssignment_0_in_rule__SYMB__Group__0__Impl10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMB__Group__1__Impl_in_rule__SYMB__Group__111022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SYMB__CfAssignment_1_in_rule__SYMB__Group__1__Impl11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Model__NnAssignment11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FAssignment_011119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__Program__UAssignment_1_011150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__Program__PpAssignment_1_111181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_rule__Function__NameAssignment_211212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Function__DefAssignment_511243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definition__InAssignment_211274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definition__ComAssignment_511305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definition__OutAssignment_1011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Input__VAssignment_011367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Input__VAssignment_1_111398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Output__VAssignment_011429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Output__VAssignment_1_111460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_011491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_211522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Command__NopAssignment_011558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_rule__Command__AssignAssignment_111597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Command__ForAssignment_311659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Command__IfAssignment_411690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_511721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfconfort_in_rule__Command__IfcAssignment_611752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Assign__VsAssignment_011783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Assign__ExAssignment_411814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__While__ExAssignment_211845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__While__CAssignment_611876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__For__ExAssignment_211907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__For__CAssignment_611938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__If__ExAssignment_211969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__CtAssignment_612000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__CeAssignment_1012031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Ex1Assignment_212062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Ex2Assignment_612093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Foreach__CAssignment_1012124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Ifconfort__ExAssignment_212155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Ifconfort__CAssignment_612186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Vars__VsAssignment_012217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__Vars__VsAssignment_1_112248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExAssignment_012279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExAssignment_1_112310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExsAssignment_012341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExaAssignment_112372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExprSimple__NilAssignment_012408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_rule__ExprSimple__VAssignment_112447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_rule__ExprSimple__SymAssignment_212478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_3_1_0_in_rule__ExprSimple__MotAssignment_3_112509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__ExprSimple__LexAssignment_3_212542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_4_1_0_in_rule__ExprSimple__MotAssignment_4_112573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExAssignment_4_312606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_rule__ExprSimple__SymAssignment_5_112637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__ExprSimple__LexAssignment_5_212668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__LExpr__EAssignment_112699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__Exo1Assignment_012730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__Exo2Assignment_1_312761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__Exn1Assignment_012792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__Exn2Assignment_1_312823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExQ1Assignment_0_212854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExQ2Assignment_112885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExS1Assignment_0_112916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExS2Assignment_0_312947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExAssignment_1_112978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASEVAR_in_rule__VAR__BvAssignment_013009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONF_in_rule__VAR__CfAssignment_113040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASESYMB_in_rule__SYMB__BsAssignment_013071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONF_in_rule__SYMB__CfAssignment_113102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__IfAssignment_4_in_synpred7_InternalLangage_while1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExsAssignment_0_in_synpred9_InternalLangage_while1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred18_InternalLangage_while2191 = new BitSet(new long[]{0x0000000000000002L});

}