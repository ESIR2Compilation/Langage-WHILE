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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYM", "RULE_VAR", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nop'", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'('", "')'", "'and'", "'or'", "'not'", "'=?'", "'nil'"
    };
    public static final int RULE_LF=9;
    public static final int RULE_CR=7;
    public static final int RULE_TAB=8;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SP=6;
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
    public static final int RULE_SYM=4;
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
    public static final int RULE_VAR=5;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:70:1: ruleModel : ( ( rule__Model__ProgAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:74:2: ( ( ( rule__Model__ProgAssignment )* ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__ProgAssignment )* )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:75:1: ( ( rule__Model__ProgAssignment )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:76:1: ( rule__Model__ProgAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgAssignment()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:1: ( rule__Model__ProgAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:77:2: rule__Model__ProgAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProgAssignment_in_ruleModel100);
            	    rule__Model__ProgAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:89:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:90:1: ( ruleFunction EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:91:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction128);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction135); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:98:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:102:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:103:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:103:1: ( ( rule__Function__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:104:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:105:1: ( rule__Function__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:105:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction161);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:117:1: entryRuleDef : ruleDef EOF ;
    public final void entryRuleDef() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:118:1: ( ruleDef EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:119:1: ruleDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefRule()); 
            }
            pushFollow(FOLLOW_ruleDef_in_entryRuleDef188);
            ruleDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDef195); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:126:1: ruleDef : ( ( rule__Def__Group__0 ) ) ;
    public final void ruleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:130:2: ( ( ( rule__Def__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:131:1: ( ( rule__Def__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:131:1: ( ( rule__Def__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:132:1: ( rule__Def__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:133:1: ( rule__Def__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:133:2: rule__Def__Group__0
            {
            pushFollow(FOLLOW_rule__Def__Group__0_in_ruleDef221);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:145:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:146:1: ( ruleInput EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:147:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput248);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput255); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:154:1: ruleInput : ( ( rule__Input__Alternatives ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:158:2: ( ( ( rule__Input__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Input__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:159:1: ( ( rule__Input__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:160:1: ( rule__Input__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:1: ( rule__Input__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:161:2: rule__Input__Alternatives
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_in_ruleInput281);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:173:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:174:1: ( ruleOutput EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:175:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput308);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput315); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:182:1: ruleOutput : ( ( rule__Output__Alternatives ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:186:2: ( ( ( rule__Output__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Output__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:187:1: ( ( rule__Output__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:188:1: ( rule__Output__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:1: ( rule__Output__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:189:2: rule__Output__Alternatives
            {
            pushFollow(FOLLOW_rule__Output__Alternatives_in_ruleOutput341);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:201:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:202:1: ( ruleCommands EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:203:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands368);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands375); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:210:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:214:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:215:1: ( ( rule__Commands__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:216:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:1: ( rule__Commands__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:217:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands401);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:229:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:230:1: ( ruleCommand EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:231:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand428);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand435); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:238:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:242:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:243:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:243:1: ( ( rule__Command__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:244:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:245:1: ( rule__Command__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:245:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand461);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:257:1: entryRuleNop : ruleNop EOF ;
    public final void entryRuleNop() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:258:1: ( ruleNop EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:259:1: ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_ruleNop_in_entryRuleNop488);
            ruleNop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNopRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNop495); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:266:1: ruleNop : ( 'nop' ) ;
    public final void ruleNop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:270:2: ( ( 'nop' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:271:1: ( 'nop' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:271:1: ( 'nop' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:272:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNopAccess().getNopKeyword()); 
            }
            match(input,18,FOLLOW_18_in_ruleNop522); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:287:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:288:1: ( ruleAssign EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:289:1: ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign550);
            ruleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign557); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:296:1: ruleAssign : ( ( rule__Assign__Group__0 ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:300:2: ( ( ( rule__Assign__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:301:1: ( ( rule__Assign__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:301:1: ( ( rule__Assign__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:302:1: ( rule__Assign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:303:1: ( rule__Assign__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:303:2: rule__Assign__Group__0
            {
            pushFollow(FOLLOW_rule__Assign__Group__0_in_ruleAssign583);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:315:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:316:1: ( ruleWhile EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:317:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile610);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile617); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:324:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:328:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:329:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:330:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:331:1: ( rule__While__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:331:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile643);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:343:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:344:1: ( ruleFor EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:345:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor670);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor677); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:352:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:356:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:357:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:358:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:359:1: ( rule__For__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:359:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor703);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:371:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:372:1: ( ruleIf EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:373:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf730);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf737); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:380:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:384:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:385:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:386:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:387:1: ( rule__If__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:387:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf763);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:399:1: entryRuleForeach : ruleForeach EOF ;
    public final void entryRuleForeach() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:400:1: ( ruleForeach EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:401:1: ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach790);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach797); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:408:1: ruleForeach : ( ( rule__Foreach__Group__0 ) ) ;
    public final void ruleForeach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:412:2: ( ( ( rule__Foreach__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:1: ( ( rule__Foreach__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:413:1: ( ( rule__Foreach__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:414:1: ( rule__Foreach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:415:1: ( rule__Foreach__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:415:2: rule__Foreach__Group__0
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0_in_ruleForeach823);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:427:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:428:1: ( ruleVars EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:429:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars850);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars857); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:436:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:440:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:441:1: ( ( rule__Vars__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:442:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:443:1: ( rule__Vars__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:443:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars883);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:455:1: entryRuleEXPRS : ruleEXPRS EOF ;
    public final void entryRuleEXPRS() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:456:1: ( ruleEXPRS EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:457:1: ruleEXPRS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_entryRuleEXPRS910);
            ruleEXPRS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRS917); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:464:1: ruleEXPRS : ( ( rule__EXPRS__Group__0 ) ) ;
    public final void ruleEXPRS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:468:2: ( ( ( rule__EXPRS__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:1: ( ( rule__EXPRS__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:469:1: ( ( rule__EXPRS__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:470:1: ( rule__EXPRS__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:471:1: ( rule__EXPRS__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:471:2: rule__EXPRS__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__0_in_ruleEXPRS943);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:483:1: entryRuleEXPR : ruleEXPR EOF ;
    public final void entryRuleEXPR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:484:1: ( ruleEXPR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:485:1: ruleEXPR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_entryRuleEXPR970);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPR977); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:492:1: ruleEXPR : ( ( rule__EXPR__Alternatives ) ) ;
    public final void ruleEXPR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:496:2: ( ( ( rule__EXPR__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:1: ( ( rule__EXPR__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:497:1: ( ( rule__EXPR__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:498:1: ( rule__EXPR__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:499:1: ( rule__EXPR__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:499:2: rule__EXPR__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPR__Alternatives_in_ruleEXPR1003);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:511:1: entryRuleEXPRSIMPLE : ruleEXPRSIMPLE EOF ;
    public final void entryRuleEXPRSIMPLE() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:512:1: ( ruleEXPRSIMPLE EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:513:1: ruleEXPRSIMPLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLERule()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE1030);
            ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLERule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRSIMPLE1037); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:520:1: ruleEXPRSIMPLE : ( ( rule__EXPRSIMPLE__Alternatives ) ) ;
    public final void ruleEXPRSIMPLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:524:2: ( ( ( rule__EXPRSIMPLE__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:1: ( ( rule__EXPRSIMPLE__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:525:1: ( ( rule__EXPRSIMPLE__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:526:1: ( rule__EXPRSIMPLE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:527:1: ( rule__EXPRSIMPLE__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:527:2: rule__EXPRSIMPLE__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Alternatives_in_ruleEXPRSIMPLE1063);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:539:1: entryRuleLEXPR : ruleLEXPR EOF ;
    public final void entryRuleLEXPR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:540:1: ( ruleLEXPR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:541:1: ruleLEXPR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_entryRuleLEXPR1090);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLEXPRRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEXPR1097); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:548:1: ruleLEXPR : ( ( rule__LEXPR__Group__0 ) ) ;
    public final void ruleLEXPR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:552:2: ( ( ( rule__LEXPR__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:1: ( ( rule__LEXPR__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:553:1: ( ( rule__LEXPR__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:554:1: ( rule__LEXPR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:555:1: ( rule__LEXPR__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:555:2: rule__LEXPR__Group__0
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__0_in_ruleLEXPR1123);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:567:1: entryRuleEXPRAND : ruleEXPRAND EOF ;
    public final void entryRuleEXPRAND() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:568:1: ( ruleEXPRAND EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:569:1: ruleEXPRAND EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND1150);
            ruleEXPRAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRANDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRAND1157); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:576:1: ruleEXPRAND : ( ( rule__EXPRAND__Group__0 ) ) ;
    public final void ruleEXPRAND() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:580:2: ( ( ( rule__EXPRAND__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:581:1: ( ( rule__EXPRAND__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:581:1: ( ( rule__EXPRAND__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:582:1: ( rule__EXPRAND__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:583:1: ( rule__EXPRAND__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:583:2: rule__EXPRAND__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__0_in_ruleEXPRAND1183);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:595:1: entryRuleEXPROR : ruleEXPROR EOF ;
    public final void entryRuleEXPROR() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:596:1: ( ruleEXPROR EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:597:1: ruleEXPROR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORRule()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_entryRuleEXPROR1210);
            ruleEXPROR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRORRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPROR1217); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:604:1: ruleEXPROR : ( ( rule__EXPROR__Group__0 ) ) ;
    public final void ruleEXPROR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:608:2: ( ( ( rule__EXPROR__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:609:1: ( ( rule__EXPROR__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:609:1: ( ( rule__EXPROR__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:610:1: ( rule__EXPROR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:611:1: ( rule__EXPROR__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:611:2: rule__EXPROR__Group__0
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__0_in_ruleEXPROR1243);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:623:1: entryRuleEXPRNOT : ruleEXPRNOT EOF ;
    public final void entryRuleEXPRNOT() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:624:1: ( ruleEXPRNOT EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:625:1: ruleEXPRNOT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT1270);
            ruleEXPRNOT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRNOTRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRNOT1277); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:632:1: ruleEXPRNOT : ( ( rule__EXPRNOT__Group__0 ) ) ;
    public final void ruleEXPRNOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:636:2: ( ( ( rule__EXPRNOT__Group__0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:637:1: ( ( rule__EXPRNOT__Group__0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:637:1: ( ( rule__EXPRNOT__Group__0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:638:1: ( rule__EXPRNOT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getGroup()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:639:1: ( rule__EXPRNOT__Group__0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:639:2: rule__EXPRNOT__Group__0
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__0_in_ruleEXPRNOT1303);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:651:1: entryRuleEXPREQ : ruleEXPREQ EOF ;
    public final void entryRuleEXPREQ() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:652:1: ( ruleEXPREQ EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:653:1: ruleEXPREQ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQRule()); 
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ1330);
            ruleEXPREQ();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPREQRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPREQ1337); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:660:1: ruleEXPREQ : ( ( rule__EXPREQ__Alternatives ) ) ;
    public final void ruleEXPREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:664:2: ( ( ( rule__EXPREQ__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:665:1: ( ( rule__EXPREQ__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:665:1: ( ( rule__EXPREQ__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:666:1: ( rule__EXPREQ__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:667:1: ( rule__EXPREQ__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:667:2: rule__EXPREQ__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPREQ__Alternatives_in_ruleEXPREQ1363);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:685:1: entryRuleLCs : ruleLCs EOF ;
    public final void entryRuleLCs() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:686:1: ( ruleLCs EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:687:1: ruleLCs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsRule()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_entryRuleLCs1396);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCs1403); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:694:1: ruleLCs : ( ( rule__LCs__LAssignment )? ) ;
    public final void ruleLCs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:698:2: ( ( ( rule__LCs__LAssignment )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:699:1: ( ( rule__LCs__LAssignment )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:699:1: ( ( rule__LCs__LAssignment )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:700:1: ( rule__LCs__LAssignment )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsAccess().getLAssignment()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:701:1: ( rule__LCs__LAssignment )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_LF)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:701:2: rule__LCs__LAssignment
                    {
                    pushFollow(FOLLOW_rule__LCs__LAssignment_in_ruleLCs1429);
                    rule__LCs__LAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsAccess().getLAssignment()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:713:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:714:1: ( ruleLC EOF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:715:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1457);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1464); if (state.failed) return ;

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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:722:1: ruleLC : ( ( rule__LC__Alternatives ) ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:726:2: ( ( ( rule__LC__Alternatives ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:727:1: ( ( rule__LC__Alternatives ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:727:1: ( ( rule__LC__Alternatives ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:728:1: ( rule__LC__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getAlternatives()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:729:1: ( rule__LC__Alternatives )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:729:2: rule__LC__Alternatives
            {
            pushFollow(FOLLOW_rule__LC__Alternatives_in_ruleLC1490);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:741:1: rule__Input__Alternatives : ( ( ( rule__Input__Group_0__0 ) ) | ( ( rule__Input__YAssignment_1 ) ) );
    public final void rule__Input__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:745:1: ( ( ( rule__Input__Group_0__0 ) ) | ( ( rule__Input__YAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VAR) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_SP && LA3_1<=RULE_LF)||LA3_1==26) ) {
                    alt3=2;
                }
                else if ( (LA3_1==28) ) {
                    alt3=1;
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:746:1: ( ( rule__Input__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:746:1: ( ( rule__Input__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:747:1: ( rule__Input__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:748:1: ( rule__Input__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:748:2: rule__Input__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Alternatives1526);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:752:6: ( ( rule__Input__YAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:752:6: ( ( rule__Input__YAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:753:1: ( rule__Input__YAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getYAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:754:1: ( rule__Input__YAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:754:2: rule__Input__YAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Input__YAssignment_1_in_rule__Input__Alternatives1544);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:763:1: rule__Output__Alternatives : ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__SAssignment_1 ) ) );
    public final void rule__Output__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:767:1: ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__SAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_VAR) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==23) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:768:1: ( ( rule__Output__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:768:1: ( ( rule__Output__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:769:1: ( rule__Output__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:770:1: ( rule__Output__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:770:2: rule__Output__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Alternatives1577);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:774:6: ( ( rule__Output__SAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:774:6: ( ( rule__Output__SAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:775:1: ( rule__Output__SAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getSAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:776:1: ( rule__Output__SAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:776:2: rule__Output__SAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Output__SAssignment_1_in_rule__Output__Alternatives1595);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:785:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AffectAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForrAssignment_3 ) ) | ( ( rule__Command__ForeAssignment_4 ) ) | ( ( rule__Command__IffAssignment_5 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:789:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__AffectAssignment_1 ) ) | ( ( rule__Command__WhAssignment_2 ) ) | ( ( rule__Command__ForrAssignment_3 ) ) | ( ( rule__Command__ForeAssignment_4 ) ) | ( ( rule__Command__IffAssignment_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case RULE_VAR:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 39:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:790:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:790:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:791:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:792:1: ( rule__Command__NopAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:792:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1628);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:796:6: ( ( rule__Command__AffectAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:796:6: ( ( rule__Command__AffectAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:797:1: ( rule__Command__AffectAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getAffectAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:798:1: ( rule__Command__AffectAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:798:2: rule__Command__AffectAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Command__AffectAssignment_1_in_rule__Command__Alternatives1646);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:802:6: ( ( rule__Command__WhAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:802:6: ( ( rule__Command__WhAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:803:1: ( rule__Command__WhAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getWhAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:804:1: ( rule__Command__WhAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:804:2: rule__Command__WhAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1664);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:808:6: ( ( rule__Command__ForrAssignment_3 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:808:6: ( ( rule__Command__ForrAssignment_3 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:809:1: ( rule__Command__ForrAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForrAssignment_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:810:1: ( rule__Command__ForrAssignment_3 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:810:2: rule__Command__ForrAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__ForrAssignment_3_in_rule__Command__Alternatives1682);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:814:6: ( ( rule__Command__ForeAssignment_4 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:814:6: ( ( rule__Command__ForeAssignment_4 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:815:1: ( rule__Command__ForeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getForeAssignment_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:816:1: ( rule__Command__ForeAssignment_4 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:816:2: rule__Command__ForeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__ForeAssignment_4_in_rule__Command__Alternatives1700);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:820:6: ( ( rule__Command__IffAssignment_5 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:820:6: ( ( rule__Command__IffAssignment_5 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:821:1: ( rule__Command__IffAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getIffAssignment_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:822:1: ( rule__Command__IffAssignment_5 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:822:2: rule__Command__IffAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Command__IffAssignment_5_in_rule__Command__Alternatives1718);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:831:1: rule__EXPR__Alternatives : ( ( ( rule__EXPR__E1Assignment_0 ) ) | ( ( rule__EXPR__ExAssignment_1 ) ) );
    public final void rule__EXPR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:835:1: ( ( ( rule__EXPR__E1Assignment_0 ) ) | ( ( rule__EXPR__ExAssignment_1 ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred10_InternalLangage_while()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred10_InternalLangage_while()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred10_InternalLangage_while()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA6_4 = input.LA(2);

                if ( (synpred10_InternalLangage_while()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( ( rule__EXPR__E1Assignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( ( rule__EXPR__E1Assignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:837:1: ( rule__EXPR__E1Assignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRAccess().getE1Assignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:1: ( rule__EXPR__E1Assignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:2: rule__EXPR__E1Assignment_0
                    {
                    pushFollow(FOLLOW_rule__EXPR__E1Assignment_0_in_rule__EXPR__Alternatives1751);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:842:6: ( ( rule__EXPR__ExAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:842:6: ( ( rule__EXPR__ExAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:843:1: ( rule__EXPR__ExAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRAccess().getExAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:844:1: ( rule__EXPR__ExAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:844:2: rule__EXPR__ExAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EXPR__ExAssignment_1_in_rule__EXPR__Alternatives1769);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:853:1: rule__EXPRSIMPLE__Alternatives : ( ( ( rule__EXPRSIMPLE__NilAssignment_0 ) ) | ( ( rule__EXPRSIMPLE__VAssignment_1 ) ) | ( ( rule__EXPRSIMPLE__SymAssignment_2 ) ) | ( ( rule__EXPRSIMPLE__Group_3__0 ) ) | ( ( rule__EXPRSIMPLE__Group_4__0 ) ) | ( ( rule__EXPRSIMPLE__Group_5__0 ) ) );
    public final void rule__EXPRSIMPLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:857:1: ( ( ( rule__EXPRSIMPLE__NilAssignment_0 ) ) | ( ( rule__EXPRSIMPLE__VAssignment_1 ) ) | ( ( rule__EXPRSIMPLE__SymAssignment_2 ) ) | ( ( rule__EXPRSIMPLE__Group_3__0 ) ) | ( ( rule__EXPRSIMPLE__Group_4__0 ) ) | ( ( rule__EXPRSIMPLE__Group_5__0 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 47:
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
            case 41:
                {
                switch ( input.LA(2) ) {
                case 19:
                case 20:
                    {
                    alt7=4;
                    }
                    break;
                case RULE_SYM:
                    {
                    alt7=6;
                    }
                    break;
                case 21:
                case 22:
                    {
                    alt7=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }

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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:858:1: ( ( rule__EXPRSIMPLE__NilAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:858:1: ( ( rule__EXPRSIMPLE__NilAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:859:1: ( rule__EXPRSIMPLE__NilAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getNilAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:860:1: ( rule__EXPRSIMPLE__NilAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:860:2: rule__EXPRSIMPLE__NilAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__NilAssignment_0_in_rule__EXPRSIMPLE__Alternatives1802);
                    rule__EXPRSIMPLE__NilAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getNilAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:6: ( ( rule__EXPRSIMPLE__VAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:864:6: ( ( rule__EXPRSIMPLE__VAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:865:1: ( rule__EXPRSIMPLE__VAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getVAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:1: ( rule__EXPRSIMPLE__VAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:866:2: rule__EXPRSIMPLE__VAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__VAssignment_1_in_rule__EXPRSIMPLE__Alternatives1820);
                    rule__EXPRSIMPLE__VAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getVAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:870:6: ( ( rule__EXPRSIMPLE__SymAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:870:6: ( ( rule__EXPRSIMPLE__SymAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:871:1: ( rule__EXPRSIMPLE__SymAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getSymAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:872:1: ( rule__EXPRSIMPLE__SymAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:872:2: rule__EXPRSIMPLE__SymAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__SymAssignment_2_in_rule__EXPRSIMPLE__Alternatives1838);
                    rule__EXPRSIMPLE__SymAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getSymAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:876:6: ( ( rule__EXPRSIMPLE__Group_3__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:876:6: ( ( rule__EXPRSIMPLE__Group_3__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:877:1: ( rule__EXPRSIMPLE__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:878:1: ( rule__EXPRSIMPLE__Group_3__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:878:2: rule__EXPRSIMPLE__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__0_in_rule__EXPRSIMPLE__Alternatives1856);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:882:6: ( ( rule__EXPRSIMPLE__Group_4__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:882:6: ( ( rule__EXPRSIMPLE__Group_4__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:883:1: ( rule__EXPRSIMPLE__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_4()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:884:1: ( rule__EXPRSIMPLE__Group_4__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:884:2: rule__EXPRSIMPLE__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__0_in_rule__EXPRSIMPLE__Alternatives1874);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:888:6: ( ( rule__EXPRSIMPLE__Group_5__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:888:6: ( ( rule__EXPRSIMPLE__Group_5__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:889:1: ( rule__EXPRSIMPLE__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getGroup_5()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:890:1: ( rule__EXPRSIMPLE__Group_5__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:890:2: rule__EXPRSIMPLE__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__0_in_rule__EXPRSIMPLE__Alternatives1892);
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


    // $ANTLR start "rule__EXPRSIMPLE__MotAlternatives_3_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:899:1: rule__EXPRSIMPLE__MotAlternatives_3_1_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__EXPRSIMPLE__MotAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:903:1: ( ( 'cons' ) | ( 'list' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:904:1: ( 'cons' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:904:1: ( 'cons' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:905:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getMotConsKeyword_3_1_0_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__EXPRSIMPLE__MotAlternatives_3_1_01926); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getMotConsKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:912:6: ( 'list' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:912:6: ( 'list' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:913:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getMotListKeyword_3_1_0_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__EXPRSIMPLE__MotAlternatives_3_1_01946); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getMotListKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__EXPRSIMPLE__MotAlternatives_3_1_0"


    // $ANTLR start "rule__EXPRSIMPLE__MotAlternatives_4_1_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:925:1: rule__EXPRSIMPLE__MotAlternatives_4_1_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__EXPRSIMPLE__MotAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:929:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:930:1: ( 'hd' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:930:1: ( 'hd' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:931:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getMotHdKeyword_4_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__EXPRSIMPLE__MotAlternatives_4_1_01981); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getMotHdKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:938:6: ( 'tl' )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:938:6: ( 'tl' )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:939:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRSIMPLEAccess().getMotTlKeyword_4_1_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__EXPRSIMPLE__MotAlternatives_4_1_02001); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRSIMPLEAccess().getMotTlKeyword_4_1_0_1()); 
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
    // $ANTLR end "rule__EXPRSIMPLE__MotAlternatives_4_1_0"


    // $ANTLR start "rule__EXPREQ__Alternatives"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:951:1: rule__EXPREQ__Alternatives : ( ( ( rule__EXPREQ__Group_0__0 ) ) | ( ( rule__EXPREQ__Group_1__0 ) ) );
    public final void rule__EXPREQ__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:955:1: ( ( ( rule__EXPREQ__Group_0__0 ) ) | ( ( rule__EXPREQ__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SYM && LA10_0<=RULE_VAR)||LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==41) ) {
                int LA10_4 = input.LA(2);

                if ( (synpred18_InternalLangage_while()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:956:1: ( ( rule__EXPREQ__Group_0__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:956:1: ( ( rule__EXPREQ__Group_0__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:957:1: ( rule__EXPREQ__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPREQAccess().getGroup_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:958:1: ( rule__EXPREQ__Group_0__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:958:2: rule__EXPREQ__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EXPREQ__Group_0__0_in_rule__EXPREQ__Alternatives2035);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:6: ( ( rule__EXPREQ__Group_1__0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:962:6: ( ( rule__EXPREQ__Group_1__0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:963:1: ( rule__EXPREQ__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPREQAccess().getGroup_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:1: ( rule__EXPREQ__Group_1__0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:964:2: rule__EXPREQ__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPREQ__Group_1__0_in_rule__EXPREQ__Alternatives2053);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:973:1: rule__LC__Alternatives : ( ( ( rule__LC__AAssignment_0 ) ) | ( ( rule__LC__ZAssignment_1 ) ) | ( ( rule__LC__EAssignment_2 ) ) | ( ( rule__LC__RAssignment_3 ) ) );
    public final void rule__LC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:977:1: ( ( ( rule__LC__AAssignment_0 ) ) | ( ( rule__LC__ZAssignment_1 ) ) | ( ( rule__LC__EAssignment_2 ) ) | ( ( rule__LC__RAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt11=1;
                }
                break;
            case RULE_CR:
                {
                alt11=2;
                }
                break;
            case RULE_TAB:
                {
                alt11=3;
                }
                break;
            case RULE_LF:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:978:1: ( ( rule__LC__AAssignment_0 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:978:1: ( ( rule__LC__AAssignment_0 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:979:1: ( rule__LC__AAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getAAssignment_0()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:980:1: ( rule__LC__AAssignment_0 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:980:2: rule__LC__AAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LC__AAssignment_0_in_rule__LC__Alternatives2086);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:984:6: ( ( rule__LC__ZAssignment_1 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:984:6: ( ( rule__LC__ZAssignment_1 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:985:1: ( rule__LC__ZAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getZAssignment_1()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:986:1: ( rule__LC__ZAssignment_1 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:986:2: rule__LC__ZAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LC__ZAssignment_1_in_rule__LC__Alternatives2104);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:990:6: ( ( rule__LC__EAssignment_2 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:990:6: ( ( rule__LC__EAssignment_2 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:991:1: ( rule__LC__EAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getEAssignment_2()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:992:1: ( rule__LC__EAssignment_2 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:992:2: rule__LC__EAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LC__EAssignment_2_in_rule__LC__Alternatives2122);
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
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:996:6: ( ( rule__LC__RAssignment_3 ) )
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:996:6: ( ( rule__LC__RAssignment_3 ) )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:997:1: ( rule__LC__RAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getRAssignment_3()); 
                    }
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:998:1: ( rule__LC__RAssignment_3 )
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:998:2: rule__LC__RAssignment_3
                    {
                    pushFollow(FOLLOW_rule__LC__RAssignment_3_in_rule__LC__Alternatives2140);
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


    // $ANTLR start "rule__Function__Group__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1009:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1013:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1014:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02171);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02174);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1021:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1025:1: ( ( 'function' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1026:1: ( 'function' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1026:1: ( 'function' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1027:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Function__Group__0__Impl2202); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1040:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1044:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1045:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12233);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12236);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1052:1: rule__Function__Group__1__Impl : ( ( rule__Function__NAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1056:1: ( ( ( rule__Function__NAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1057:1: ( ( rule__Function__NAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1057:1: ( ( rule__Function__NAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1058:1: ( rule__Function__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1059:1: ( rule__Function__NAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1059:2: rule__Function__NAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NAssignment_1_in_rule__Function__Group__1__Impl2263);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1069:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1073:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1074:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22293);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22296);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1081:1: rule__Function__Group__2__Impl : ( ( rule__Function__NomAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1085:1: ( ( ( rule__Function__NomAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1086:1: ( ( rule__Function__NomAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1086:1: ( ( rule__Function__NomAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1087:1: ( rule__Function__NomAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1088:1: ( rule__Function__NomAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1088:2: rule__Function__NomAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_2_in_rule__Function__Group__2__Impl2323);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1098:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1102:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1103:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32353);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32356);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1110:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1114:1: ( ( ':' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1115:1: ( ':' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1115:1: ( ':' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1116:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,24,FOLLOW_24_in_rule__Function__Group__3__Impl2384); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1129:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1133:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1134:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42415);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42418);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1141:1: rule__Function__Group__4__Impl : ( ( rule__Function__TAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1145:1: ( ( ( rule__Function__TAssignment_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1146:1: ( ( rule__Function__TAssignment_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1146:1: ( ( rule__Function__TAssignment_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1147:1: ( rule__Function__TAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getTAssignment_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1148:1: ( rule__Function__TAssignment_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1148:2: rule__Function__TAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__TAssignment_4_in_rule__Function__Group__4__Impl2445);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1158:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1162:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1163:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52475);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1169:1: rule__Function__Group__5__Impl : ( ( rule__Function__DAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1173:1: ( ( ( rule__Function__DAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1174:1: ( ( rule__Function__DAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1174:1: ( ( rule__Function__DAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1175:1: ( rule__Function__DAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1176:1: ( rule__Function__DAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1176:2: rule__Function__DAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DAssignment_5_in_rule__Function__Group__5__Impl2502);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1198:1: rule__Def__Group__0 : rule__Def__Group__0__Impl rule__Def__Group__1 ;
    public final void rule__Def__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1202:1: ( rule__Def__Group__0__Impl rule__Def__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1203:2: rule__Def__Group__0__Impl rule__Def__Group__1
            {
            pushFollow(FOLLOW_rule__Def__Group__0__Impl_in_rule__Def__Group__02544);
            rule__Def__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__1_in_rule__Def__Group__02547);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1210:1: rule__Def__Group__0__Impl : ( 'read' ) ;
    public final void rule__Def__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1214:1: ( ( 'read' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1215:1: ( 'read' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1215:1: ( 'read' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1216:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getReadKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Def__Group__0__Impl2575); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1229:1: rule__Def__Group__1 : rule__Def__Group__1__Impl rule__Def__Group__2 ;
    public final void rule__Def__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1233:1: ( rule__Def__Group__1__Impl rule__Def__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1234:2: rule__Def__Group__1__Impl rule__Def__Group__2
            {
            pushFollow(FOLLOW_rule__Def__Group__1__Impl_in_rule__Def__Group__12606);
            rule__Def__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__2_in_rule__Def__Group__12609);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1241:1: rule__Def__Group__1__Impl : ( ( rule__Def__LAssignment_1 ) ) ;
    public final void rule__Def__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1245:1: ( ( ( rule__Def__LAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1246:1: ( ( rule__Def__LAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1246:1: ( ( rule__Def__LAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1247:1: ( rule__Def__LAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getLAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1248:1: ( rule__Def__LAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1248:2: rule__Def__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Def__LAssignment_1_in_rule__Def__Group__1__Impl2636);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1258:1: rule__Def__Group__2 : rule__Def__Group__2__Impl rule__Def__Group__3 ;
    public final void rule__Def__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1262:1: ( rule__Def__Group__2__Impl rule__Def__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1263:2: rule__Def__Group__2__Impl rule__Def__Group__3
            {
            pushFollow(FOLLOW_rule__Def__Group__2__Impl_in_rule__Def__Group__22666);
            rule__Def__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__3_in_rule__Def__Group__22669);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1270:1: rule__Def__Group__2__Impl : ( ( rule__Def__InAssignment_2 ) ) ;
    public final void rule__Def__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1274:1: ( ( ( rule__Def__InAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1275:1: ( ( rule__Def__InAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1275:1: ( ( rule__Def__InAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1276:1: ( rule__Def__InAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getInAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1277:1: ( rule__Def__InAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1277:2: rule__Def__InAssignment_2
            {
            pushFollow(FOLLOW_rule__Def__InAssignment_2_in_rule__Def__Group__2__Impl2696);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1287:1: rule__Def__Group__3 : rule__Def__Group__3__Impl rule__Def__Group__4 ;
    public final void rule__Def__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1291:1: ( rule__Def__Group__3__Impl rule__Def__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1292:2: rule__Def__Group__3__Impl rule__Def__Group__4
            {
            pushFollow(FOLLOW_rule__Def__Group__3__Impl_in_rule__Def__Group__32726);
            rule__Def__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__4_in_rule__Def__Group__32729);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1299:1: rule__Def__Group__3__Impl : ( ( rule__Def__ZAssignment_3 ) ) ;
    public final void rule__Def__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1303:1: ( ( ( rule__Def__ZAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:1: ( ( rule__Def__ZAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1304:1: ( ( rule__Def__ZAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1305:1: ( rule__Def__ZAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getZAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1306:1: ( rule__Def__ZAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1306:2: rule__Def__ZAssignment_3
            {
            pushFollow(FOLLOW_rule__Def__ZAssignment_3_in_rule__Def__Group__3__Impl2756);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1316:1: rule__Def__Group__4 : rule__Def__Group__4__Impl rule__Def__Group__5 ;
    public final void rule__Def__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1320:1: ( rule__Def__Group__4__Impl rule__Def__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1321:2: rule__Def__Group__4__Impl rule__Def__Group__5
            {
            pushFollow(FOLLOW_rule__Def__Group__4__Impl_in_rule__Def__Group__42786);
            rule__Def__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__5_in_rule__Def__Group__42789);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1328:1: rule__Def__Group__4__Impl : ( '%' ) ;
    public final void rule__Def__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1332:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1333:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1333:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1334:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getPercentSignKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__Def__Group__4__Impl2817); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1347:1: rule__Def__Group__5 : rule__Def__Group__5__Impl rule__Def__Group__6 ;
    public final void rule__Def__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1351:1: ( rule__Def__Group__5__Impl rule__Def__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1352:2: rule__Def__Group__5__Impl rule__Def__Group__6
            {
            pushFollow(FOLLOW_rule__Def__Group__5__Impl_in_rule__Def__Group__52848);
            rule__Def__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__6_in_rule__Def__Group__52851);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1359:1: rule__Def__Group__5__Impl : ( ( rule__Def__VAssignment_5 ) ) ;
    public final void rule__Def__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1363:1: ( ( ( rule__Def__VAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1364:1: ( ( rule__Def__VAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1364:1: ( ( rule__Def__VAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1365:1: ( rule__Def__VAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getVAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1366:1: ( rule__Def__VAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1366:2: rule__Def__VAssignment_5
            {
            pushFollow(FOLLOW_rule__Def__VAssignment_5_in_rule__Def__Group__5__Impl2878);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1376:1: rule__Def__Group__6 : rule__Def__Group__6__Impl rule__Def__Group__7 ;
    public final void rule__Def__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1380:1: ( rule__Def__Group__6__Impl rule__Def__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1381:2: rule__Def__Group__6__Impl rule__Def__Group__7
            {
            pushFollow(FOLLOW_rule__Def__Group__6__Impl_in_rule__Def__Group__62908);
            rule__Def__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__7_in_rule__Def__Group__62911);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1388:1: rule__Def__Group__6__Impl : ( ( rule__Def__SAssignment_6 ) ) ;
    public final void rule__Def__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1392:1: ( ( ( rule__Def__SAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1393:1: ( ( rule__Def__SAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1393:1: ( ( rule__Def__SAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1394:1: ( rule__Def__SAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getSAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1395:1: ( rule__Def__SAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1395:2: rule__Def__SAssignment_6
            {
            pushFollow(FOLLOW_rule__Def__SAssignment_6_in_rule__Def__Group__6__Impl2938);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1405:1: rule__Def__Group__7 : rule__Def__Group__7__Impl rule__Def__Group__8 ;
    public final void rule__Def__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1409:1: ( rule__Def__Group__7__Impl rule__Def__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1410:2: rule__Def__Group__7__Impl rule__Def__Group__8
            {
            pushFollow(FOLLOW_rule__Def__Group__7__Impl_in_rule__Def__Group__72968);
            rule__Def__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__8_in_rule__Def__Group__72971);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1417:1: rule__Def__Group__7__Impl : ( '%' ) ;
    public final void rule__Def__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1421:1: ( ( '%' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1422:1: ( '%' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1422:1: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1423:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getPercentSignKeyword_7()); 
            }
            match(input,26,FOLLOW_26_in_rule__Def__Group__7__Impl2999); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1436:1: rule__Def__Group__8 : rule__Def__Group__8__Impl rule__Def__Group__9 ;
    public final void rule__Def__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1440:1: ( rule__Def__Group__8__Impl rule__Def__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1441:2: rule__Def__Group__8__Impl rule__Def__Group__9
            {
            pushFollow(FOLLOW_rule__Def__Group__8__Impl_in_rule__Def__Group__83030);
            rule__Def__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__9_in_rule__Def__Group__83033);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1448:1: rule__Def__Group__8__Impl : ( 'write' ) ;
    public final void rule__Def__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1452:1: ( ( 'write' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1453:1: ( 'write' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1453:1: ( 'write' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1454:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getWriteKeyword_8()); 
            }
            match(input,27,FOLLOW_27_in_rule__Def__Group__8__Impl3061); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1467:1: rule__Def__Group__9 : rule__Def__Group__9__Impl rule__Def__Group__10 ;
    public final void rule__Def__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1471:1: ( rule__Def__Group__9__Impl rule__Def__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1472:2: rule__Def__Group__9__Impl rule__Def__Group__10
            {
            pushFollow(FOLLOW_rule__Def__Group__9__Impl_in_rule__Def__Group__93092);
            rule__Def__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Def__Group__10_in_rule__Def__Group__93095);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1479:1: rule__Def__Group__9__Impl : ( ( rule__Def__UAssignment_9 ) ) ;
    public final void rule__Def__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1483:1: ( ( ( rule__Def__UAssignment_9 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1484:1: ( ( rule__Def__UAssignment_9 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1484:1: ( ( rule__Def__UAssignment_9 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1485:1: ( rule__Def__UAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getUAssignment_9()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1486:1: ( rule__Def__UAssignment_9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1486:2: rule__Def__UAssignment_9
            {
            pushFollow(FOLLOW_rule__Def__UAssignment_9_in_rule__Def__Group__9__Impl3122);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1496:1: rule__Def__Group__10 : rule__Def__Group__10__Impl ;
    public final void rule__Def__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1500:1: ( rule__Def__Group__10__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1501:2: rule__Def__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Def__Group__10__Impl_in_rule__Def__Group__103152);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1507:1: rule__Def__Group__10__Impl : ( ( rule__Def__OAssignment_10 ) ) ;
    public final void rule__Def__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1511:1: ( ( ( rule__Def__OAssignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1512:1: ( ( rule__Def__OAssignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1512:1: ( ( rule__Def__OAssignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1513:1: ( rule__Def__OAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getOAssignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1514:1: ( rule__Def__OAssignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1514:2: rule__Def__OAssignment_10
            {
            pushFollow(FOLLOW_rule__Def__OAssignment_10_in_rule__Def__Group__10__Impl3179);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1546:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1550:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1551:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__03231);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__03234);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1558:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1562:1: ( ( ( rule__Input__VAssignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1563:1: ( ( rule__Input__VAssignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1563:1: ( ( rule__Input__VAssignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1564:1: ( rule__Input__VAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1565:1: ( rule__Input__VAssignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1565:2: rule__Input__VAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_0_0_in_rule__Input__Group_0__0__Impl3261);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1575:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl rule__Input__Group_0__2 ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1579:1: ( rule__Input__Group_0__1__Impl rule__Input__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1580:2: rule__Input__Group_0__1__Impl rule__Input__Group_0__2
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__13291);
            rule__Input__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__2_in_rule__Input__Group_0__13294);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1587:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1591:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1592:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1592:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1593:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Input__Group_0__1__Impl3322); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1606:1: rule__Input__Group_0__2 : rule__Input__Group_0__2__Impl rule__Input__Group_0__3 ;
    public final void rule__Input__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1610:1: ( rule__Input__Group_0__2__Impl rule__Input__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1611:2: rule__Input__Group_0__2__Impl rule__Input__Group_0__3
            {
            pushFollow(FOLLOW_rule__Input__Group_0__2__Impl_in_rule__Input__Group_0__23353);
            rule__Input__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__3_in_rule__Input__Group_0__23356);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1618:1: rule__Input__Group_0__2__Impl : ( ( rule__Input__ZAssignment_0_2 ) ) ;
    public final void rule__Input__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1622:1: ( ( ( rule__Input__ZAssignment_0_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1623:1: ( ( rule__Input__ZAssignment_0_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1623:1: ( ( rule__Input__ZAssignment_0_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1624:1: ( rule__Input__ZAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getZAssignment_0_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1625:1: ( rule__Input__ZAssignment_0_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1625:2: rule__Input__ZAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Input__ZAssignment_0_2_in_rule__Input__Group_0__2__Impl3383);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1635:1: rule__Input__Group_0__3 : rule__Input__Group_0__3__Impl ;
    public final void rule__Input__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1639:1: ( rule__Input__Group_0__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1640:2: rule__Input__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__3__Impl_in_rule__Input__Group_0__33413);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1646:1: rule__Input__Group_0__3__Impl : ( ( rule__Input__InAssignment_0_3 ) ) ;
    public final void rule__Input__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1650:1: ( ( ( rule__Input__InAssignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1651:1: ( ( rule__Input__InAssignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1651:1: ( ( rule__Input__InAssignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1652:1: ( rule__Input__InAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getInAssignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1653:1: ( rule__Input__InAssignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1653:2: rule__Input__InAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Input__InAssignment_0_3_in_rule__Input__Group_0__3__Impl3440);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1671:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1675:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1676:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__03478);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__03481);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1683:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__NAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1687:1: ( ( ( rule__Output__NAssignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1688:1: ( ( rule__Output__NAssignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1688:1: ( ( rule__Output__NAssignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1689:1: ( rule__Output__NAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getNAssignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1690:1: ( rule__Output__NAssignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1690:2: rule__Output__NAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__NAssignment_0_0_in_rule__Output__Group_0__0__Impl3508);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1700:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl rule__Output__Group_0__2 ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1704:1: ( rule__Output__Group_0__1__Impl rule__Output__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1705:2: rule__Output__Group_0__1__Impl rule__Output__Group_0__2
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__13538);
            rule__Output__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__2_in_rule__Output__Group_0__13541);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1712:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1716:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1717:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1717:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1718:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Output__Group_0__1__Impl3569); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1731:1: rule__Output__Group_0__2 : rule__Output__Group_0__2__Impl rule__Output__Group_0__3 ;
    public final void rule__Output__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1735:1: ( rule__Output__Group_0__2__Impl rule__Output__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1736:2: rule__Output__Group_0__2__Impl rule__Output__Group_0__3
            {
            pushFollow(FOLLOW_rule__Output__Group_0__2__Impl_in_rule__Output__Group_0__23600);
            rule__Output__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__3_in_rule__Output__Group_0__23603);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1743:1: rule__Output__Group_0__2__Impl : ( ( rule__Output__QAssignment_0_2 ) ) ;
    public final void rule__Output__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1747:1: ( ( ( rule__Output__QAssignment_0_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1748:1: ( ( rule__Output__QAssignment_0_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1748:1: ( ( rule__Output__QAssignment_0_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1749:1: ( rule__Output__QAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getQAssignment_0_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1750:1: ( rule__Output__QAssignment_0_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1750:2: rule__Output__QAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Output__QAssignment_0_2_in_rule__Output__Group_0__2__Impl3630);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1760:1: rule__Output__Group_0__3 : rule__Output__Group_0__3__Impl ;
    public final void rule__Output__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1764:1: ( rule__Output__Group_0__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1765:2: rule__Output__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__3__Impl_in_rule__Output__Group_0__33660);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1771:1: rule__Output__Group_0__3__Impl : ( ( rule__Output__OAssignment_0_3 ) ) ;
    public final void rule__Output__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1775:1: ( ( ( rule__Output__OAssignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1776:1: ( ( rule__Output__OAssignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1776:1: ( ( rule__Output__OAssignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1777:1: ( rule__Output__OAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOAssignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1778:1: ( rule__Output__OAssignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1778:2: rule__Output__OAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Output__OAssignment_0_3_in_rule__Output__Group_0__3__Impl3687);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1796:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1800:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1801:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03725);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03728);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1808:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__AAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1812:1: ( ( ( rule__Commands__AAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1813:1: ( ( rule__Commands__AAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1813:1: ( ( rule__Commands__AAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1814:1: ( rule__Commands__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getAAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1815:1: ( rule__Commands__AAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1815:2: rule__Commands__AAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__AAssignment_0_in_rule__Commands__Group__0__Impl3755);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1825:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1829:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1830:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13785);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1836:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )? ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1840:1: ( ( ( rule__Commands__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1841:1: ( ( rule__Commands__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1841:1: ( ( rule__Commands__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1842:1: ( rule__Commands__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1843:1: ( rule__Commands__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1843:2: rule__Commands__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3812);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1857:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1861:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1862:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03847);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03850);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1869:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1873:1: ( ( ';' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1874:1: ( ';' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1874:1: ( ';' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1875:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Commands__Group_1__0__Impl3878); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1888:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1892:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1893:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13909);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13912);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1900:1: rule__Commands__Group_1__1__Impl : ( ( rule__Commands__LAssignment_1_1 ) ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1904:1: ( ( ( rule__Commands__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1905:1: ( ( rule__Commands__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1905:1: ( ( rule__Commands__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1906:1: ( rule__Commands__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1907:1: ( rule__Commands__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1907:2: rule__Commands__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Commands__LAssignment_1_1_in_rule__Commands__Group_1__1__Impl3939);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1917:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1921:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1922:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23969);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1928:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__SAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1932:1: ( ( ( rule__Commands__SAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1933:1: ( ( rule__Commands__SAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1933:1: ( ( rule__Commands__SAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1934:1: ( rule__Commands__SAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1935:1: ( rule__Commands__SAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1935:2: rule__Commands__SAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__SAssignment_1_2_in_rule__Commands__Group_1__2__Impl3996);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1951:1: rule__Assign__Group__0 : rule__Assign__Group__0__Impl rule__Assign__Group__1 ;
    public final void rule__Assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1955:1: ( rule__Assign__Group__0__Impl rule__Assign__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1956:2: rule__Assign__Group__0__Impl rule__Assign__Group__1
            {
            pushFollow(FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04032);
            rule__Assign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04035);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1963:1: rule__Assign__Group__0__Impl : ( ( rule__Assign__EAssignment_0 ) ) ;
    public final void rule__Assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1967:1: ( ( ( rule__Assign__EAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1968:1: ( ( rule__Assign__EAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1968:1: ( ( rule__Assign__EAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1969:1: ( rule__Assign__EAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getEAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1970:1: ( rule__Assign__EAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1970:2: rule__Assign__EAssignment_0
            {
            pushFollow(FOLLOW_rule__Assign__EAssignment_0_in_rule__Assign__Group__0__Impl4062);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1980:1: rule__Assign__Group__1 : rule__Assign__Group__1__Impl rule__Assign__Group__2 ;
    public final void rule__Assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1984:1: ( rule__Assign__Group__1__Impl rule__Assign__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1985:2: rule__Assign__Group__1__Impl rule__Assign__Group__2
            {
            pushFollow(FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14092);
            rule__Assign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14095);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1992:1: rule__Assign__Group__1__Impl : ( ( rule__Assign__LAssignment_1 ) ) ;
    public final void rule__Assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1996:1: ( ( ( rule__Assign__LAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1997:1: ( ( rule__Assign__LAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1997:1: ( ( rule__Assign__LAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1998:1: ( rule__Assign__LAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1999:1: ( rule__Assign__LAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1999:2: rule__Assign__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Assign__LAssignment_1_in_rule__Assign__Group__1__Impl4122);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2009:1: rule__Assign__Group__2 : rule__Assign__Group__2__Impl rule__Assign__Group__3 ;
    public final void rule__Assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2013:1: ( rule__Assign__Group__2__Impl rule__Assign__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2014:2: rule__Assign__Group__2__Impl rule__Assign__Group__3
            {
            pushFollow(FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24152);
            rule__Assign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24155);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2021:1: rule__Assign__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2025:1: ( ( ':=' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2026:1: ( ':=' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2026:1: ( ':=' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2027:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Assign__Group__2__Impl4183); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2040:1: rule__Assign__Group__3 : rule__Assign__Group__3__Impl rule__Assign__Group__4 ;
    public final void rule__Assign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2044:1: ( rule__Assign__Group__3__Impl rule__Assign__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2045:2: rule__Assign__Group__3__Impl rule__Assign__Group__4
            {
            pushFollow(FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34214);
            rule__Assign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34217);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2052:1: rule__Assign__Group__3__Impl : ( ( rule__Assign__CAssignment_3 ) ) ;
    public final void rule__Assign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2056:1: ( ( ( rule__Assign__CAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2057:1: ( ( rule__Assign__CAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2057:1: ( ( rule__Assign__CAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2058:1: ( rule__Assign__CAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getCAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2059:1: ( rule__Assign__CAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2059:2: rule__Assign__CAssignment_3
            {
            pushFollow(FOLLOW_rule__Assign__CAssignment_3_in_rule__Assign__Group__3__Impl4244);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2069:1: rule__Assign__Group__4 : rule__Assign__Group__4__Impl ;
    public final void rule__Assign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2073:1: ( rule__Assign__Group__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2074:2: rule__Assign__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44274);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2080:1: rule__Assign__Group__4__Impl : ( ( rule__Assign__NAssignment_4 ) ) ;
    public final void rule__Assign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2084:1: ( ( ( rule__Assign__NAssignment_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2085:1: ( ( rule__Assign__NAssignment_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2085:1: ( ( rule__Assign__NAssignment_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2086:1: ( rule__Assign__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getNAssignment_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2087:1: ( rule__Assign__NAssignment_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2087:2: rule__Assign__NAssignment_4
            {
            pushFollow(FOLLOW_rule__Assign__NAssignment_4_in_rule__Assign__Group__4__Impl4301);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2107:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2111:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2112:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04341);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04344);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2119:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2123:1: ( ( 'while' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2124:1: ( 'while' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2124:1: ( 'while' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2125:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__While__Group__0__Impl4372); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2138:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2142:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2143:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14403);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14406);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2150:1: rule__While__Group__1__Impl : ( ( rule__While__LlAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2154:1: ( ( ( rule__While__LlAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2155:1: ( ( rule__While__LlAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2155:1: ( ( rule__While__LlAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2156:1: ( rule__While__LlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLlAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2157:1: ( rule__While__LlAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2157:2: rule__While__LlAssignment_1
            {
            pushFollow(FOLLOW_rule__While__LlAssignment_1_in_rule__While__Group__1__Impl4433);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2167:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2171:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2172:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24463);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24466);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2179:1: rule__While__Group__2__Impl : ( ( rule__While__EeAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2183:1: ( ( ( rule__While__EeAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2184:1: ( ( rule__While__EeAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2184:1: ( ( rule__While__EeAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2185:1: ( rule__While__EeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getEeAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2186:1: ( rule__While__EeAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2186:2: rule__While__EeAssignment_2
            {
            pushFollow(FOLLOW_rule__While__EeAssignment_2_in_rule__While__Group__2__Impl4493);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2196:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2200:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2201:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34523);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34526);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2208:1: rule__While__Group__3__Impl : ( ( rule__While__CcAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2212:1: ( ( ( rule__While__CcAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ( rule__While__CcAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2213:1: ( ( rule__While__CcAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2214:1: ( rule__While__CcAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCcAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2215:1: ( rule__While__CcAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2215:2: rule__While__CcAssignment_3
            {
            pushFollow(FOLLOW_rule__While__CcAssignment_3_in_rule__While__Group__3__Impl4553);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2225:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2229:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2230:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44583);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44586);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2237:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2241:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2242:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2242:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2243:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__While__Group__4__Impl4614); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2256:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2260:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2261:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54645);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54648);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2268:1: rule__While__Group__5__Impl : ( ( rule__While__ZAssignment_5 ) ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2272:1: ( ( ( rule__While__ZAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2273:1: ( ( rule__While__ZAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2273:1: ( ( rule__While__ZAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2274:1: ( rule__While__ZAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getZAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2275:1: ( rule__While__ZAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2275:2: rule__While__ZAssignment_5
            {
            pushFollow(FOLLOW_rule__While__ZAssignment_5_in_rule__While__Group__5__Impl4675);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2285:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2289:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2290:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64705);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64708);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2297:1: rule__While__Group__6__Impl : ( ( rule__While__KAssignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2301:1: ( ( ( rule__While__KAssignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2302:1: ( ( rule__While__KAssignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2302:1: ( ( rule__While__KAssignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2303:1: ( rule__While__KAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getKAssignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2304:1: ( rule__While__KAssignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2304:2: rule__While__KAssignment_6
            {
            pushFollow(FOLLOW_rule__While__KAssignment_6_in_rule__While__Group__6__Impl4735);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2314:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2318:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2319:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74765);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__74768);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2326:1: rule__While__Group__7__Impl : ( ( rule__While__LcAssignment_7 ) ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2330:1: ( ( ( rule__While__LcAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2331:1: ( ( rule__While__LcAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2331:1: ( ( rule__While__LcAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2332:1: ( rule__While__LcAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLcAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2333:1: ( rule__While__LcAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2333:2: rule__While__LcAssignment_7
            {
            pushFollow(FOLLOW_rule__While__LcAssignment_7_in_rule__While__Group__7__Impl4795);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2343:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2347:1: ( rule__While__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2348:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84825);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2354:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2358:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2359:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2359:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2360:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,33,FOLLOW_33_in_rule__While__Group__8__Impl4853); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2391:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2395:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2396:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04902);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__04905);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2403:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2407:1: ( ( 'for' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2408:1: ( 'for' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2408:1: ( 'for' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2409:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__For__Group__0__Impl4933); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2422:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2426:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2427:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14964);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__14967);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2434:1: rule__For__Group__1__Impl : ( ( rule__For__CcAssignment_1 ) ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2438:1: ( ( ( rule__For__CcAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2439:1: ( ( rule__For__CcAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2439:1: ( ( rule__For__CcAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2440:1: ( rule__For__CcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCcAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2441:1: ( rule__For__CcAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2441:2: rule__For__CcAssignment_1
            {
            pushFollow(FOLLOW_rule__For__CcAssignment_1_in_rule__For__Group__1__Impl4994);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2451:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2455:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2456:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25024);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25027);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2463:1: rule__For__Group__2__Impl : ( ( rule__For__HhAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2467:1: ( ( ( rule__For__HhAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2468:1: ( ( rule__For__HhAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2468:1: ( ( rule__For__HhAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2469:1: ( rule__For__HhAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getHhAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2470:1: ( rule__For__HhAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2470:2: rule__For__HhAssignment_2
            {
            pushFollow(FOLLOW_rule__For__HhAssignment_2_in_rule__For__Group__2__Impl5054);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2480:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2484:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2485:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35084);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35087);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2492:1: rule__For__Group__3__Impl : ( ( rule__For__TtAssignment_3 ) ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2496:1: ( ( ( rule__For__TtAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2497:1: ( ( rule__For__TtAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2497:1: ( ( rule__For__TtAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2498:1: ( rule__For__TtAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getTtAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2499:1: ( rule__For__TtAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2499:2: rule__For__TtAssignment_3
            {
            pushFollow(FOLLOW_rule__For__TtAssignment_3_in_rule__For__Group__3__Impl5114);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2509:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2513:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2514:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45144);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45147);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2521:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2525:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2526:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2526:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2527:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__For__Group__4__Impl5175); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2540:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2544:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2545:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55206);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55209);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2552:1: rule__For__Group__5__Impl : ( ( rule__For__VvAssignment_5 ) ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2556:1: ( ( ( rule__For__VvAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2557:1: ( ( rule__For__VvAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2557:1: ( ( rule__For__VvAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2558:1: ( rule__For__VvAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getVvAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2559:1: ( rule__For__VvAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2559:2: rule__For__VvAssignment_5
            {
            pushFollow(FOLLOW_rule__For__VvAssignment_5_in_rule__For__Group__5__Impl5236);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2569:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2573:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2574:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65266);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65269);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2581:1: rule__For__Group__6__Impl : ( ( rule__For__C1Assignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2585:1: ( ( ( rule__For__C1Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2586:1: ( ( rule__For__C1Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2586:1: ( ( rule__For__C1Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2587:1: ( rule__For__C1Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getC1Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2588:1: ( rule__For__C1Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2588:2: rule__For__C1Assignment_6
            {
            pushFollow(FOLLOW_rule__For__C1Assignment_6_in_rule__For__Group__6__Impl5296);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2598:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2602:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2603:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75326);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75329);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2610:1: rule__For__Group__7__Impl : ( ( rule__For__SsAssignment_7 ) ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2614:1: ( ( ( rule__For__SsAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2615:1: ( ( rule__For__SsAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2615:1: ( ( rule__For__SsAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2616:1: ( rule__For__SsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSsAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2617:1: ( rule__For__SsAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2617:2: rule__For__SsAssignment_7
            {
            pushFollow(FOLLOW_rule__For__SsAssignment_7_in_rule__For__Group__7__Impl5356);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2627:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2631:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2632:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85386);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2638:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2642:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2643:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2643:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2644:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,33,FOLLOW_33_in_rule__For__Group__8__Impl5414); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2675:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2679:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2680:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05463);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05466);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2687:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2691:1: ( ( 'if' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2692:1: ( 'if' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2692:1: ( 'if' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2693:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group__0__Impl5494); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2706:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2710:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2711:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15525);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15528);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2718:1: rule__If__Group__1__Impl : ( ( rule__If__MmAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2722:1: ( ( ( rule__If__MmAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2723:1: ( ( rule__If__MmAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2723:1: ( ( rule__If__MmAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2724:1: ( rule__If__MmAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getMmAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2725:1: ( rule__If__MmAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2725:2: rule__If__MmAssignment_1
            {
            pushFollow(FOLLOW_rule__If__MmAssignment_1_in_rule__If__Group__1__Impl5555);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2735:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2739:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2740:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25585);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25588);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2747:1: rule__If__Group__2__Impl : ( ( rule__If__JjAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2751:1: ( ( ( rule__If__JjAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2752:1: ( ( rule__If__JjAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2752:1: ( ( rule__If__JjAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2753:1: ( rule__If__JjAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getJjAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2754:1: ( rule__If__JjAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2754:2: rule__If__JjAssignment_2
            {
            pushFollow(FOLLOW_rule__If__JjAssignment_2_in_rule__If__Group__2__Impl5615);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2764:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2768:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2769:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35645);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__35648);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2776:1: rule__If__Group__3__Impl : ( ( rule__If__KkAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2780:1: ( ( ( rule__If__KkAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2781:1: ( ( rule__If__KkAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2781:1: ( ( rule__If__KkAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2782:1: ( rule__If__KkAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getKkAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2783:1: ( rule__If__KkAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2783:2: rule__If__KkAssignment_3
            {
            pushFollow(FOLLOW_rule__If__KkAssignment_3_in_rule__If__Group__3__Impl5675);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2793:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2797:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2798:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45705);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__45708);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2805:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2809:1: ( ( 'then' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2810:1: ( 'then' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2810:1: ( 'then' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2811:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__If__Group__4__Impl5736); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2824:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2828:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2829:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55767);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__55770);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2836:1: rule__If__Group__5__Impl : ( ( rule__If__HgAssignment_5 ) ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2840:1: ( ( ( rule__If__HgAssignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2841:1: ( ( rule__If__HgAssignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2841:1: ( ( rule__If__HgAssignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2842:1: ( rule__If__HgAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getHgAssignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2843:1: ( rule__If__HgAssignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2843:2: rule__If__HgAssignment_5
            {
            pushFollow(FOLLOW_rule__If__HgAssignment_5_in_rule__If__Group__5__Impl5797);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2853:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2857:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2858:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65827);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__65830);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2865:1: rule__If__Group__6__Impl : ( ( rule__If__C2Assignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2869:1: ( ( ( rule__If__C2Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2870:1: ( ( rule__If__C2Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2870:1: ( ( rule__If__C2Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2871:1: ( rule__If__C2Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getC2Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2872:1: ( rule__If__C2Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2872:2: rule__If__C2Assignment_6
            {
            pushFollow(FOLLOW_rule__If__C2Assignment_6_in_rule__If__Group__6__Impl5857);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2882:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2886:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2887:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__75887);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__75890);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2894:1: rule__If__Group__7__Impl : ( ( rule__If__GgAssignment_7 ) ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2898:1: ( ( ( rule__If__GgAssignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2899:1: ( ( rule__If__GgAssignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2899:1: ( ( rule__If__GgAssignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2900:1: ( rule__If__GgAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGgAssignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2901:1: ( rule__If__GgAssignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2901:2: rule__If__GgAssignment_7
            {
            pushFollow(FOLLOW_rule__If__GgAssignment_7_in_rule__If__Group__7__Impl5917);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2911:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2915:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2916:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__85947);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__85950);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2923:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2927:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2928:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2928:1: ( ( rule__If__Group_8__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2929:1: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2930:1: ( rule__If__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2930:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl5977);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2940:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2944:1: ( rule__If__Group__9__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2945:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96008);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2951:1: rule__If__Group__9__Impl : ( 'fi' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2955:1: ( ( 'fi' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2956:1: ( 'fi' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2956:1: ( 'fi' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2957:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }
            match(input,37,FOLLOW_37_in_rule__If__Group__9__Impl6036); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2990:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2994:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:2995:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06087);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06090);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3002:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3006:1: ( ( 'else' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3007:1: ( 'else' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3007:1: ( 'else' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3008:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__If__Group_8__0__Impl6118); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3021:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3025:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3026:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16149);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16152);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3033:1: rule__If__Group_8__1__Impl : ( ( rule__If__FfAssignment_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3037:1: ( ( ( rule__If__FfAssignment_8_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3038:1: ( ( rule__If__FfAssignment_8_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3038:1: ( ( rule__If__FfAssignment_8_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3039:1: ( rule__If__FfAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFfAssignment_8_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3040:1: ( rule__If__FfAssignment_8_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3040:2: rule__If__FfAssignment_8_1
            {
            pushFollow(FOLLOW_rule__If__FfAssignment_8_1_in_rule__If__Group_8__1__Impl6179);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3050:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3054:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3055:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26209);
            rule__If__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26212);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3062:1: rule__If__Group_8__2__Impl : ( ( rule__If__OAssignment_8_2 ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3066:1: ( ( ( rule__If__OAssignment_8_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3067:1: ( ( rule__If__OAssignment_8_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3067:1: ( ( rule__If__OAssignment_8_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3068:1: ( rule__If__OAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOAssignment_8_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3069:1: ( rule__If__OAssignment_8_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3069:2: rule__If__OAssignment_8_2
            {
            pushFollow(FOLLOW_rule__If__OAssignment_8_2_in_rule__If__Group_8__2__Impl6239);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3079:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3083:1: ( rule__If__Group_8__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3084:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36269);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3090:1: rule__If__Group_8__3__Impl : ( ( rule__If__DdAssignment_8_3 ) ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3094:1: ( ( ( rule__If__DdAssignment_8_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3095:1: ( ( rule__If__DdAssignment_8_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3095:1: ( ( rule__If__DdAssignment_8_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3096:1: ( rule__If__DdAssignment_8_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getDdAssignment_8_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3097:1: ( rule__If__DdAssignment_8_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3097:2: rule__If__DdAssignment_8_3
            {
            pushFollow(FOLLOW_rule__If__DdAssignment_8_3_in_rule__If__Group_8__3__Impl6296);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3115:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3119:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3120:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06334);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06337);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3127:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3131:1: ( ( 'foreach' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3132:1: ( 'foreach' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3132:1: ( 'foreach' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3133:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Foreach__Group__0__Impl6365); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3146:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3150:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3151:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16396);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16399);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3158:1: rule__Foreach__Group__1__Impl : ( ( rule__Foreach__SqAssignment_1 ) ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3162:1: ( ( ( rule__Foreach__SqAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3163:1: ( ( rule__Foreach__SqAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3163:1: ( ( rule__Foreach__SqAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3164:1: ( rule__Foreach__SqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getSqAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3165:1: ( rule__Foreach__SqAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3165:2: rule__Foreach__SqAssignment_1
            {
            pushFollow(FOLLOW_rule__Foreach__SqAssignment_1_in_rule__Foreach__Group__1__Impl6426);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3175:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3179:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3180:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26456);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26459);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3187:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__WxAssignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3191:1: ( ( ( rule__Foreach__WxAssignment_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3192:1: ( ( rule__Foreach__WxAssignment_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3192:1: ( ( rule__Foreach__WxAssignment_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3193:1: ( rule__Foreach__WxAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getWxAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3194:1: ( rule__Foreach__WxAssignment_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3194:2: rule__Foreach__WxAssignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__WxAssignment_2_in_rule__Foreach__Group__2__Impl6486);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3204:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3208:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3209:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36516);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36519);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3216:1: rule__Foreach__Group__3__Impl : ( ( rule__Foreach__LcAssignment_3 ) ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3220:1: ( ( ( rule__Foreach__LcAssignment_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3221:1: ( ( rule__Foreach__LcAssignment_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3221:1: ( ( rule__Foreach__LcAssignment_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3222:1: ( rule__Foreach__LcAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLcAssignment_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3223:1: ( rule__Foreach__LcAssignment_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3223:2: rule__Foreach__LcAssignment_3
            {
            pushFollow(FOLLOW_rule__Foreach__LcAssignment_3_in_rule__Foreach__Group__3__Impl6546);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3233:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3237:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3238:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46576);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46579);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3245:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3249:1: ( ( 'in' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3250:1: ( 'in' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3250:1: ( 'in' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3251:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__Foreach__Group__4__Impl6607); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3264:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3268:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3269:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56638);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56641);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3276:1: rule__Foreach__Group__5__Impl : ( ( rule__Foreach__Lc2Assignment_5 ) ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3280:1: ( ( ( rule__Foreach__Lc2Assignment_5 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3281:1: ( ( rule__Foreach__Lc2Assignment_5 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3281:1: ( ( rule__Foreach__Lc2Assignment_5 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3282:1: ( rule__Foreach__Lc2Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc2Assignment_5()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3283:1: ( rule__Foreach__Lc2Assignment_5 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3283:2: rule__Foreach__Lc2Assignment_5
            {
            pushFollow(FOLLOW_rule__Foreach__Lc2Assignment_5_in_rule__Foreach__Group__5__Impl6668);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3293:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3297:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3298:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66698);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66701);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3305:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__E1Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3309:1: ( ( ( rule__Foreach__E1Assignment_6 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3310:1: ( ( rule__Foreach__E1Assignment_6 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3310:1: ( ( rule__Foreach__E1Assignment_6 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3311:1: ( rule__Foreach__E1Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getE1Assignment_6()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3312:1: ( rule__Foreach__E1Assignment_6 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3312:2: rule__Foreach__E1Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__E1Assignment_6_in_rule__Foreach__Group__6__Impl6728);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3322:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3326:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3327:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76758);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76761);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3334:1: rule__Foreach__Group__7__Impl : ( ( rule__Foreach__Lc3Assignment_7 ) ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3338:1: ( ( ( rule__Foreach__Lc3Assignment_7 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3339:1: ( ( rule__Foreach__Lc3Assignment_7 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3339:1: ( ( rule__Foreach__Lc3Assignment_7 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3340:1: ( rule__Foreach__Lc3Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc3Assignment_7()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3341:1: ( rule__Foreach__Lc3Assignment_7 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3341:2: rule__Foreach__Lc3Assignment_7
            {
            pushFollow(FOLLOW_rule__Foreach__Lc3Assignment_7_in_rule__Foreach__Group__7__Impl6788);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3351:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3355:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3356:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86818);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86821);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3363:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3367:1: ( ( 'do' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3368:1: ( 'do' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3368:1: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3369:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,32,FOLLOW_32_in_rule__Foreach__Group__8__Impl6849); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3382:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3386:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3387:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__96880);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__96883);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3394:1: rule__Foreach__Group__9__Impl : ( ( rule__Foreach__Lc4Assignment_9 ) ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3398:1: ( ( ( rule__Foreach__Lc4Assignment_9 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3399:1: ( ( rule__Foreach__Lc4Assignment_9 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3399:1: ( ( rule__Foreach__Lc4Assignment_9 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3400:1: ( rule__Foreach__Lc4Assignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc4Assignment_9()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3401:1: ( rule__Foreach__Lc4Assignment_9 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3401:2: rule__Foreach__Lc4Assignment_9
            {
            pushFollow(FOLLOW_rule__Foreach__Lc4Assignment_9_in_rule__Foreach__Group__9__Impl6910);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3411:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3415:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3416:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__106940);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__106943);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3423:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__C3Assignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3427:1: ( ( ( rule__Foreach__C3Assignment_10 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3428:1: ( ( rule__Foreach__C3Assignment_10 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3428:1: ( ( rule__Foreach__C3Assignment_10 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3429:1: ( rule__Foreach__C3Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getC3Assignment_10()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3430:1: ( rule__Foreach__C3Assignment_10 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3430:2: rule__Foreach__C3Assignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__C3Assignment_10_in_rule__Foreach__Group__10__Impl6970);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3440:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3444:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3445:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117000);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117003);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3452:1: rule__Foreach__Group__11__Impl : ( ( rule__Foreach__Lc5Assignment_11 ) ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3456:1: ( ( ( rule__Foreach__Lc5Assignment_11 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3457:1: ( ( rule__Foreach__Lc5Assignment_11 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3457:1: ( ( rule__Foreach__Lc5Assignment_11 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3458:1: ( rule__Foreach__Lc5Assignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc5Assignment_11()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3459:1: ( rule__Foreach__Lc5Assignment_11 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3459:2: rule__Foreach__Lc5Assignment_11
            {
            pushFollow(FOLLOW_rule__Foreach__Lc5Assignment_11_in_rule__Foreach__Group__11__Impl7030);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3469:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3473:1: ( rule__Foreach__Group__12__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3474:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127060);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3480:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3484:1: ( ( 'od' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3485:1: ( 'od' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3485:1: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3486:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,33,FOLLOW_33_in_rule__Foreach__Group__12__Impl7088); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3525:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3529:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3530:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07145);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07148);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3537:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__AAssignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3541:1: ( ( ( rule__Vars__AAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3542:1: ( ( rule__Vars__AAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3542:1: ( ( rule__Vars__AAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3543:1: ( rule__Vars__AAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getAAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3544:1: ( rule__Vars__AAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3544:2: rule__Vars__AAssignment_0
            {
            pushFollow(FOLLOW_rule__Vars__AAssignment_0_in_rule__Vars__Group__0__Impl7175);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3554:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3558:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3559:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17205);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3565:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3569:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3570:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3570:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3571:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3572:1: ( rule__Vars__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3572:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7232);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3586:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3590:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3591:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07267);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07270);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3598:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3602:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3603:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3603:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3604:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Vars__Group_1__0__Impl7298); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3617:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3621:1: ( rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3622:2: rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17329);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__17332);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3629:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__LAssignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3633:1: ( ( ( rule__Vars__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3634:1: ( ( rule__Vars__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3634:1: ( ( rule__Vars__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3635:1: ( rule__Vars__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3636:1: ( rule__Vars__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3636:2: rule__Vars__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__LAssignment_1_1_in_rule__Vars__Group_1__1__Impl7359);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3646:1: rule__Vars__Group_1__2 : rule__Vars__Group_1__2__Impl ;
    public final void rule__Vars__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3650:1: ( rule__Vars__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3651:2: rule__Vars__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__27389);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3657:1: rule__Vars__Group_1__2__Impl : ( ( rule__Vars__UAssignment_1_2 ) ) ;
    public final void rule__Vars__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3661:1: ( ( ( rule__Vars__UAssignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3662:1: ( ( rule__Vars__UAssignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3662:1: ( ( rule__Vars__UAssignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3663:1: ( rule__Vars__UAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getUAssignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3664:1: ( rule__Vars__UAssignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3664:2: rule__Vars__UAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Vars__UAssignment_1_2_in_rule__Vars__Group_1__2__Impl7416);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3680:1: rule__EXPRS__Group__0 : rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1 ;
    public final void rule__EXPRS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3684:1: ( rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3685:2: rule__EXPRS__Group__0__Impl rule__EXPRS__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__0__Impl_in_rule__EXPRS__Group__07452);
            rule__EXPRS__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group__1_in_rule__EXPRS__Group__07455);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3692:1: rule__EXPRS__Group__0__Impl : ( ( rule__EXPRS__FAssignment_0 ) ) ;
    public final void rule__EXPRS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3696:1: ( ( ( rule__EXPRS__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3697:1: ( ( rule__EXPRS__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3697:1: ( ( rule__EXPRS__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3698:1: ( rule__EXPRS__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3699:1: ( rule__EXPRS__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3699:2: rule__EXPRS__FAssignment_0
            {
            pushFollow(FOLLOW_rule__EXPRS__FAssignment_0_in_rule__EXPRS__Group__0__Impl7482);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3709:1: rule__EXPRS__Group__1 : rule__EXPRS__Group__1__Impl ;
    public final void rule__EXPRS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3713:1: ( rule__EXPRS__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3714:2: rule__EXPRS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRS__Group__1__Impl_in_rule__EXPRS__Group__17512);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3720:1: rule__EXPRS__Group__1__Impl : ( ( rule__EXPRS__Group_1__0 )? ) ;
    public final void rule__EXPRS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3724:1: ( ( ( rule__EXPRS__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3725:1: ( ( rule__EXPRS__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3725:1: ( ( rule__EXPRS__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3726:1: ( rule__EXPRS__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3727:1: ( rule__EXPRS__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3727:2: rule__EXPRS__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPRS__Group_1__0_in_rule__EXPRS__Group__1__Impl7539);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3741:1: rule__EXPRS__Group_1__0 : rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1 ;
    public final void rule__EXPRS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3745:1: ( rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3746:2: rule__EXPRS__Group_1__0__Impl rule__EXPRS__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__0__Impl_in_rule__EXPRS__Group_1__07574);
            rule__EXPRS__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group_1__1_in_rule__EXPRS__Group_1__07577);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3753:1: rule__EXPRS__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EXPRS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3757:1: ( ( ',' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3758:1: ( ',' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3758:1: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3759:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getCommaKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__EXPRS__Group_1__0__Impl7605); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3772:1: rule__EXPRS__Group_1__1 : rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2 ;
    public final void rule__EXPRS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3776:1: ( rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3777:2: rule__EXPRS__Group_1__1__Impl rule__EXPRS__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__1__Impl_in_rule__EXPRS__Group_1__17636);
            rule__EXPRS__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRS__Group_1__2_in_rule__EXPRS__Group_1__17639);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3784:1: rule__EXPRS__Group_1__1__Impl : ( ( rule__EXPRS__LAssignment_1_1 ) ) ;
    public final void rule__EXPRS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3788:1: ( ( ( rule__EXPRS__LAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3789:1: ( ( rule__EXPRS__LAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3789:1: ( ( rule__EXPRS__LAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3790:1: ( rule__EXPRS__LAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getLAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3791:1: ( rule__EXPRS__LAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3791:2: rule__EXPRS__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EXPRS__LAssignment_1_1_in_rule__EXPRS__Group_1__1__Impl7666);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3801:1: rule__EXPRS__Group_1__2 : rule__EXPRS__Group_1__2__Impl ;
    public final void rule__EXPRS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3805:1: ( rule__EXPRS__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3806:2: rule__EXPRS__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPRS__Group_1__2__Impl_in_rule__EXPRS__Group_1__27696);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3812:1: rule__EXPRS__Group_1__2__Impl : ( ( rule__EXPRS__E2Assignment_1_2 ) ) ;
    public final void rule__EXPRS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3816:1: ( ( ( rule__EXPRS__E2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3817:1: ( ( rule__EXPRS__E2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3817:1: ( ( rule__EXPRS__E2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3818:1: ( rule__EXPRS__E2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getE2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3819:1: ( rule__EXPRS__E2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3819:2: rule__EXPRS__E2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPRS__E2Assignment_1_2_in_rule__EXPRS__Group_1__2__Impl7723);
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


    // $ANTLR start "rule__EXPRSIMPLE__Group_3__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3835:1: rule__EXPRSIMPLE__Group_3__0 : rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1 ;
    public final void rule__EXPRSIMPLE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3839:1: ( rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3840:2: rule__EXPRSIMPLE__Group_3__0__Impl rule__EXPRSIMPLE__Group_3__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__0__Impl_in_rule__EXPRSIMPLE__Group_3__07759);
            rule__EXPRSIMPLE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__1_in_rule__EXPRSIMPLE__Group_3__07762);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3847:1: rule__EXPRSIMPLE__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3851:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3852:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3852:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3853:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EXPRSIMPLE__Group_3__0__Impl7790); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3866:1: rule__EXPRSIMPLE__Group_3__1 : rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2 ;
    public final void rule__EXPRSIMPLE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3870:1: ( rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3871:2: rule__EXPRSIMPLE__Group_3__1__Impl rule__EXPRSIMPLE__Group_3__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__1__Impl_in_rule__EXPRSIMPLE__Group_3__17821);
            rule__EXPRSIMPLE__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__2_in_rule__EXPRSIMPLE__Group_3__17824);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3878:1: rule__EXPRSIMPLE__Group_3__1__Impl : ( ( rule__EXPRSIMPLE__MotAssignment_3_1 ) ) ;
    public final void rule__EXPRSIMPLE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3882:1: ( ( ( rule__EXPRSIMPLE__MotAssignment_3_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3883:1: ( ( rule__EXPRSIMPLE__MotAssignment_3_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3883:1: ( ( rule__EXPRSIMPLE__MotAssignment_3_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3884:1: ( rule__EXPRSIMPLE__MotAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getMotAssignment_3_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3885:1: ( rule__EXPRSIMPLE__MotAssignment_3_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3885:2: rule__EXPRSIMPLE__MotAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__MotAssignment_3_1_in_rule__EXPRSIMPLE__Group_3__1__Impl7851);
            rule__EXPRSIMPLE__MotAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getMotAssignment_3_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3895:1: rule__EXPRSIMPLE__Group_3__2 : rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3 ;
    public final void rule__EXPRSIMPLE__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3899:1: ( rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3900:2: rule__EXPRSIMPLE__Group_3__2__Impl rule__EXPRSIMPLE__Group_3__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__2__Impl_in_rule__EXPRSIMPLE__Group_3__27881);
            rule__EXPRSIMPLE__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__3_in_rule__EXPRSIMPLE__Group_3__27884);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3907:1: rule__EXPRSIMPLE__Group_3__2__Impl : ( ( rule__EXPRSIMPLE__LexAssignment_3_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3911:1: ( ( ( rule__EXPRSIMPLE__LexAssignment_3_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3912:1: ( ( rule__EXPRSIMPLE__LexAssignment_3_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3912:1: ( ( rule__EXPRSIMPLE__LexAssignment_3_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3913:1: ( rule__EXPRSIMPLE__LexAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLexAssignment_3_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3914:1: ( rule__EXPRSIMPLE__LexAssignment_3_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3914:2: rule__EXPRSIMPLE__LexAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__LexAssignment_3_2_in_rule__EXPRSIMPLE__Group_3__2__Impl7911);
            rule__EXPRSIMPLE__LexAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLexAssignment_3_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3924:1: rule__EXPRSIMPLE__Group_3__3 : rule__EXPRSIMPLE__Group_3__3__Impl ;
    public final void rule__EXPRSIMPLE__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3928:1: ( rule__EXPRSIMPLE__Group_3__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3929:2: rule__EXPRSIMPLE__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_3__3__Impl_in_rule__EXPRSIMPLE__Group_3__37941);
            rule__EXPRSIMPLE__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3935:1: rule__EXPRSIMPLE__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3939:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3940:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3940:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3941:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__EXPRSIMPLE__Group_3__3__Impl7969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EXPRSIMPLE__Group_4__0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3962:1: rule__EXPRSIMPLE__Group_4__0 : rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1 ;
    public final void rule__EXPRSIMPLE__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3966:1: ( rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3967:2: rule__EXPRSIMPLE__Group_4__0__Impl rule__EXPRSIMPLE__Group_4__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__0__Impl_in_rule__EXPRSIMPLE__Group_4__08008);
            rule__EXPRSIMPLE__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__1_in_rule__EXPRSIMPLE__Group_4__08011);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3974:1: rule__EXPRSIMPLE__Group_4__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3978:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3979:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3979:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3980:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EXPRSIMPLE__Group_4__0__Impl8039); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3993:1: rule__EXPRSIMPLE__Group_4__1 : rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2 ;
    public final void rule__EXPRSIMPLE__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3997:1: ( rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:3998:2: rule__EXPRSIMPLE__Group_4__1__Impl rule__EXPRSIMPLE__Group_4__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__1__Impl_in_rule__EXPRSIMPLE__Group_4__18070);
            rule__EXPRSIMPLE__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__2_in_rule__EXPRSIMPLE__Group_4__18073);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4005:1: rule__EXPRSIMPLE__Group_4__1__Impl : ( ( rule__EXPRSIMPLE__MotAssignment_4_1 ) ) ;
    public final void rule__EXPRSIMPLE__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4009:1: ( ( ( rule__EXPRSIMPLE__MotAssignment_4_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4010:1: ( ( rule__EXPRSIMPLE__MotAssignment_4_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4010:1: ( ( rule__EXPRSIMPLE__MotAssignment_4_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4011:1: ( rule__EXPRSIMPLE__MotAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getMotAssignment_4_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4012:1: ( rule__EXPRSIMPLE__MotAssignment_4_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4012:2: rule__EXPRSIMPLE__MotAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__MotAssignment_4_1_in_rule__EXPRSIMPLE__Group_4__1__Impl8100);
            rule__EXPRSIMPLE__MotAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getMotAssignment_4_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4022:1: rule__EXPRSIMPLE__Group_4__2 : rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3 ;
    public final void rule__EXPRSIMPLE__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4026:1: ( rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4027:2: rule__EXPRSIMPLE__Group_4__2__Impl rule__EXPRSIMPLE__Group_4__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__2__Impl_in_rule__EXPRSIMPLE__Group_4__28130);
            rule__EXPRSIMPLE__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__3_in_rule__EXPRSIMPLE__Group_4__28133);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4034:1: rule__EXPRSIMPLE__Group_4__2__Impl : ( ( rule__EXPRSIMPLE__LAssignment_4_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4038:1: ( ( ( rule__EXPRSIMPLE__LAssignment_4_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4039:1: ( ( rule__EXPRSIMPLE__LAssignment_4_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4039:1: ( ( rule__EXPRSIMPLE__LAssignment_4_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4040:1: ( rule__EXPRSIMPLE__LAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLAssignment_4_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4041:1: ( rule__EXPRSIMPLE__LAssignment_4_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4041:2: rule__EXPRSIMPLE__LAssignment_4_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__LAssignment_4_2_in_rule__EXPRSIMPLE__Group_4__2__Impl8160);
            rule__EXPRSIMPLE__LAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLAssignment_4_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4051:1: rule__EXPRSIMPLE__Group_4__3 : rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4 ;
    public final void rule__EXPRSIMPLE__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4055:1: ( rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4056:2: rule__EXPRSIMPLE__Group_4__3__Impl rule__EXPRSIMPLE__Group_4__4
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__3__Impl_in_rule__EXPRSIMPLE__Group_4__38190);
            rule__EXPRSIMPLE__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__4_in_rule__EXPRSIMPLE__Group_4__38193);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4063:1: rule__EXPRSIMPLE__Group_4__3__Impl : ( ( rule__EXPRSIMPLE__ExAssignment_4_3 ) ) ;
    public final void rule__EXPRSIMPLE__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4067:1: ( ( ( rule__EXPRSIMPLE__ExAssignment_4_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4068:1: ( ( rule__EXPRSIMPLE__ExAssignment_4_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4068:1: ( ( rule__EXPRSIMPLE__ExAssignment_4_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4069:1: ( rule__EXPRSIMPLE__ExAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getExAssignment_4_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4070:1: ( rule__EXPRSIMPLE__ExAssignment_4_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4070:2: rule__EXPRSIMPLE__ExAssignment_4_3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__ExAssignment_4_3_in_rule__EXPRSIMPLE__Group_4__3__Impl8220);
            rule__EXPRSIMPLE__ExAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getExAssignment_4_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4080:1: rule__EXPRSIMPLE__Group_4__4 : rule__EXPRSIMPLE__Group_4__4__Impl ;
    public final void rule__EXPRSIMPLE__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4084:1: ( rule__EXPRSIMPLE__Group_4__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4085:2: rule__EXPRSIMPLE__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_4__4__Impl_in_rule__EXPRSIMPLE__Group_4__48250);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4091:1: rule__EXPRSIMPLE__Group_4__4__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4095:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4096:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4096:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4097:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__EXPRSIMPLE__Group_4__4__Impl8278); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4120:1: rule__EXPRSIMPLE__Group_5__0 : rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1 ;
    public final void rule__EXPRSIMPLE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4124:1: ( rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4125:2: rule__EXPRSIMPLE__Group_5__0__Impl rule__EXPRSIMPLE__Group_5__1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__0__Impl_in_rule__EXPRSIMPLE__Group_5__08319);
            rule__EXPRSIMPLE__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__1_in_rule__EXPRSIMPLE__Group_5__08322);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4132:1: rule__EXPRSIMPLE__Group_5__0__Impl : ( '(' ) ;
    public final void rule__EXPRSIMPLE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4136:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4137:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4137:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4138:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EXPRSIMPLE__Group_5__0__Impl8350); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4151:1: rule__EXPRSIMPLE__Group_5__1 : rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2 ;
    public final void rule__EXPRSIMPLE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4155:1: ( rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4156:2: rule__EXPRSIMPLE__Group_5__1__Impl rule__EXPRSIMPLE__Group_5__2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__1__Impl_in_rule__EXPRSIMPLE__Group_5__18381);
            rule__EXPRSIMPLE__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__2_in_rule__EXPRSIMPLE__Group_5__18384);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4163:1: rule__EXPRSIMPLE__Group_5__1__Impl : ( ( rule__EXPRSIMPLE__SymAssignment_5_1 ) ) ;
    public final void rule__EXPRSIMPLE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4167:1: ( ( ( rule__EXPRSIMPLE__SymAssignment_5_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4168:1: ( ( rule__EXPRSIMPLE__SymAssignment_5_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4168:1: ( ( rule__EXPRSIMPLE__SymAssignment_5_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4169:1: ( rule__EXPRSIMPLE__SymAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getSymAssignment_5_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4170:1: ( rule__EXPRSIMPLE__SymAssignment_5_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4170:2: rule__EXPRSIMPLE__SymAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__SymAssignment_5_1_in_rule__EXPRSIMPLE__Group_5__1__Impl8411);
            rule__EXPRSIMPLE__SymAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getSymAssignment_5_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4180:1: rule__EXPRSIMPLE__Group_5__2 : rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3 ;
    public final void rule__EXPRSIMPLE__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4184:1: ( rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4185:2: rule__EXPRSIMPLE__Group_5__2__Impl rule__EXPRSIMPLE__Group_5__3
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__2__Impl_in_rule__EXPRSIMPLE__Group_5__28441);
            rule__EXPRSIMPLE__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__3_in_rule__EXPRSIMPLE__Group_5__28444);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4192:1: rule__EXPRSIMPLE__Group_5__2__Impl : ( ( rule__EXPRSIMPLE__LexAssignment_5_2 ) ) ;
    public final void rule__EXPRSIMPLE__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4196:1: ( ( ( rule__EXPRSIMPLE__LexAssignment_5_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4197:1: ( ( rule__EXPRSIMPLE__LexAssignment_5_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4197:1: ( ( rule__EXPRSIMPLE__LexAssignment_5_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4198:1: ( rule__EXPRSIMPLE__LexAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLexAssignment_5_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4199:1: ( rule__EXPRSIMPLE__LexAssignment_5_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4199:2: rule__EXPRSIMPLE__LexAssignment_5_2
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__LexAssignment_5_2_in_rule__EXPRSIMPLE__Group_5__2__Impl8471);
            rule__EXPRSIMPLE__LexAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLexAssignment_5_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4209:1: rule__EXPRSIMPLE__Group_5__3 : rule__EXPRSIMPLE__Group_5__3__Impl ;
    public final void rule__EXPRSIMPLE__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4213:1: ( rule__EXPRSIMPLE__Group_5__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4214:2: rule__EXPRSIMPLE__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__Group_5__3__Impl_in_rule__EXPRSIMPLE__Group_5__38501);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4220:1: rule__EXPRSIMPLE__Group_5__3__Impl : ( ')' ) ;
    public final void rule__EXPRSIMPLE__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4224:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4225:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4225:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4226:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__EXPRSIMPLE__Group_5__3__Impl8529); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4247:1: rule__LEXPR__Group__0 : rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1 ;
    public final void rule__LEXPR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4251:1: ( rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4252:2: rule__LEXPR__Group__0__Impl rule__LEXPR__Group__1
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__0__Impl_in_rule__LEXPR__Group__08568);
            rule__LEXPR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LEXPR__Group__1_in_rule__LEXPR__Group__08571);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4259:1: rule__LEXPR__Group__0__Impl : ( ( rule__LEXPR__FAssignment_0 ) ) ;
    public final void rule__LEXPR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4263:1: ( ( ( rule__LEXPR__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4264:1: ( ( rule__LEXPR__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4264:1: ( ( rule__LEXPR__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4265:1: ( rule__LEXPR__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4266:1: ( rule__LEXPR__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4266:2: rule__LEXPR__FAssignment_0
            {
            pushFollow(FOLLOW_rule__LEXPR__FAssignment_0_in_rule__LEXPR__Group__0__Impl8598);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4276:1: rule__LEXPR__Group__1 : rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2 ;
    public final void rule__LEXPR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4280:1: ( rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4281:2: rule__LEXPR__Group__1__Impl rule__LEXPR__Group__2
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__1__Impl_in_rule__LEXPR__Group__18628);
            rule__LEXPR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LEXPR__Group__2_in_rule__LEXPR__Group__18631);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4288:1: rule__LEXPR__Group__1__Impl : ( ( rule__LEXPR__NAssignment_1 ) ) ;
    public final void rule__LEXPR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4292:1: ( ( ( rule__LEXPR__NAssignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4293:1: ( ( rule__LEXPR__NAssignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4293:1: ( ( rule__LEXPR__NAssignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4294:1: ( rule__LEXPR__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getNAssignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4295:1: ( rule__LEXPR__NAssignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4295:2: rule__LEXPR__NAssignment_1
            {
            pushFollow(FOLLOW_rule__LEXPR__NAssignment_1_in_rule__LEXPR__Group__1__Impl8658);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4305:1: rule__LEXPR__Group__2 : rule__LEXPR__Group__2__Impl ;
    public final void rule__LEXPR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4309:1: ( rule__LEXPR__Group__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4310:2: rule__LEXPR__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LEXPR__Group__2__Impl_in_rule__LEXPR__Group__28688);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4316:1: rule__LEXPR__Group__2__Impl : ( ( rule__LEXPR__TAssignment_2 )? ) ;
    public final void rule__LEXPR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4320:1: ( ( ( rule__LEXPR__TAssignment_2 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4321:1: ( ( rule__LEXPR__TAssignment_2 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4321:1: ( ( rule__LEXPR__TAssignment_2 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4322:1: ( rule__LEXPR__TAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getTAssignment_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4323:1: ( rule__LEXPR__TAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SYM && LA16_0<=RULE_LF)||LA16_0==41||LA16_0==45||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4323:2: rule__LEXPR__TAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LEXPR__TAssignment_2_in_rule__LEXPR__Group__2__Impl8715);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4339:1: rule__EXPRAND__Group__0 : rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1 ;
    public final void rule__EXPRAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4343:1: ( rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4344:2: rule__EXPRAND__Group__0__Impl rule__EXPRAND__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__0__Impl_in_rule__EXPRAND__Group__08752);
            rule__EXPRAND__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group__1_in_rule__EXPRAND__Group__08755);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4351:1: rule__EXPRAND__Group__0__Impl : ( ( rule__EXPRAND__FAssignment_0 ) ) ;
    public final void rule__EXPRAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4355:1: ( ( ( rule__EXPRAND__FAssignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4356:1: ( ( rule__EXPRAND__FAssignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4356:1: ( ( rule__EXPRAND__FAssignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4357:1: ( rule__EXPRAND__FAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getFAssignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4358:1: ( rule__EXPRAND__FAssignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4358:2: rule__EXPRAND__FAssignment_0
            {
            pushFollow(FOLLOW_rule__EXPRAND__FAssignment_0_in_rule__EXPRAND__Group__0__Impl8782);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4368:1: rule__EXPRAND__Group__1 : rule__EXPRAND__Group__1__Impl ;
    public final void rule__EXPRAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4372:1: ( rule__EXPRAND__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4373:2: rule__EXPRAND__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group__1__Impl_in_rule__EXPRAND__Group__18812);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4379:1: rule__EXPRAND__Group__1__Impl : ( ( rule__EXPRAND__Group_1__0 )? ) ;
    public final void rule__EXPRAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4383:1: ( ( ( rule__EXPRAND__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4384:1: ( ( rule__EXPRAND__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4384:1: ( ( rule__EXPRAND__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4385:1: ( rule__EXPRAND__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4386:1: ( rule__EXPRAND__Group_1__0 )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==43) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==43) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==43) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (LA17_4==43) ) {
                        alt17=1;
                    }
                    }
                    break;
                case 43:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4386:2: rule__EXPRAND__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPRAND__Group_1__0_in_rule__EXPRAND__Group__1__Impl8839);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4400:1: rule__EXPRAND__Group_1__0 : rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1 ;
    public final void rule__EXPRAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4404:1: ( rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4405:2: rule__EXPRAND__Group_1__0__Impl rule__EXPRAND__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__0__Impl_in_rule__EXPRAND__Group_1__08874);
            rule__EXPRAND__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__1_in_rule__EXPRAND__Group_1__08877);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4412:1: rule__EXPRAND__Group_1__0__Impl : ( ( rule__EXPRAND__Lc1Assignment_1_0 ) ) ;
    public final void rule__EXPRAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4416:1: ( ( ( rule__EXPRAND__Lc1Assignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4417:1: ( ( rule__EXPRAND__Lc1Assignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4417:1: ( ( rule__EXPRAND__Lc1Assignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4418:1: ( rule__EXPRAND__Lc1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc1Assignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4419:1: ( rule__EXPRAND__Lc1Assignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4419:2: rule__EXPRAND__Lc1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__EXPRAND__Lc1Assignment_1_0_in_rule__EXPRAND__Group_1__0__Impl8904);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4429:1: rule__EXPRAND__Group_1__1 : rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2 ;
    public final void rule__EXPRAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4433:1: ( rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4434:2: rule__EXPRAND__Group_1__1__Impl rule__EXPRAND__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__1__Impl_in_rule__EXPRAND__Group_1__18934);
            rule__EXPRAND__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__2_in_rule__EXPRAND__Group_1__18937);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4441:1: rule__EXPRAND__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__EXPRAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4445:1: ( ( 'and' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4446:1: ( 'and' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4446:1: ( 'and' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4447:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getAndKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__EXPRAND__Group_1__1__Impl8965); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4460:1: rule__EXPRAND__Group_1__2 : rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3 ;
    public final void rule__EXPRAND__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4464:1: ( rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4465:2: rule__EXPRAND__Group_1__2__Impl rule__EXPRAND__Group_1__3
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__2__Impl_in_rule__EXPRAND__Group_1__28996);
            rule__EXPRAND__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__3_in_rule__EXPRAND__Group_1__28999);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4472:1: rule__EXPRAND__Group_1__2__Impl : ( ( rule__EXPRAND__Lc2Assignment_1_2 ) ) ;
    public final void rule__EXPRAND__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4476:1: ( ( ( rule__EXPRAND__Lc2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4477:1: ( ( rule__EXPRAND__Lc2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4477:1: ( ( rule__EXPRAND__Lc2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4478:1: ( rule__EXPRAND__Lc2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4479:1: ( rule__EXPRAND__Lc2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4479:2: rule__EXPRAND__Lc2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPRAND__Lc2Assignment_1_2_in_rule__EXPRAND__Group_1__2__Impl9026);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4489:1: rule__EXPRAND__Group_1__3 : rule__EXPRAND__Group_1__3__Impl ;
    public final void rule__EXPRAND__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4493:1: ( rule__EXPRAND__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4494:2: rule__EXPRAND__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPRAND__Group_1__3__Impl_in_rule__EXPRAND__Group_1__39056);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4500:1: rule__EXPRAND__Group_1__3__Impl : ( ( rule__EXPRAND__EeAssignment_1_3 ) ) ;
    public final void rule__EXPRAND__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4504:1: ( ( ( rule__EXPRAND__EeAssignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4505:1: ( ( rule__EXPRAND__EeAssignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4505:1: ( ( rule__EXPRAND__EeAssignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4506:1: ( rule__EXPRAND__EeAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getEeAssignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4507:1: ( rule__EXPRAND__EeAssignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4507:2: rule__EXPRAND__EeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__EXPRAND__EeAssignment_1_3_in_rule__EXPRAND__Group_1__3__Impl9083);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4525:1: rule__EXPROR__Group__0 : rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1 ;
    public final void rule__EXPROR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4529:1: ( rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4530:2: rule__EXPROR__Group__0__Impl rule__EXPROR__Group__1
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__0__Impl_in_rule__EXPROR__Group__09121);
            rule__EXPROR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group__1_in_rule__EXPROR__Group__09124);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4537:1: rule__EXPROR__Group__0__Impl : ( ( rule__EXPROR__E1Assignment_0 ) ) ;
    public final void rule__EXPROR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4541:1: ( ( ( rule__EXPROR__E1Assignment_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4542:1: ( ( rule__EXPROR__E1Assignment_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4542:1: ( ( rule__EXPROR__E1Assignment_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4543:1: ( rule__EXPROR__E1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE1Assignment_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4544:1: ( rule__EXPROR__E1Assignment_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4544:2: rule__EXPROR__E1Assignment_0
            {
            pushFollow(FOLLOW_rule__EXPROR__E1Assignment_0_in_rule__EXPROR__Group__0__Impl9151);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4554:1: rule__EXPROR__Group__1 : rule__EXPROR__Group__1__Impl ;
    public final void rule__EXPROR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4558:1: ( rule__EXPROR__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4559:2: rule__EXPROR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPROR__Group__1__Impl_in_rule__EXPROR__Group__19181);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4565:1: rule__EXPROR__Group__1__Impl : ( ( rule__EXPROR__Group_1__0 )? ) ;
    public final void rule__EXPROR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4569:1: ( ( ( rule__EXPROR__Group_1__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4570:1: ( ( rule__EXPROR__Group_1__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4570:1: ( ( rule__EXPROR__Group_1__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4571:1: ( rule__EXPROR__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getGroup_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4572:1: ( rule__EXPROR__Group_1__0 )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==44) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==44) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3==44) ) {
                        alt18=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (LA18_4==44) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 44:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4572:2: rule__EXPROR__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EXPROR__Group_1__0_in_rule__EXPROR__Group__1__Impl9208);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4586:1: rule__EXPROR__Group_1__0 : rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1 ;
    public final void rule__EXPROR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4590:1: ( rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4591:2: rule__EXPROR__Group_1__0__Impl rule__EXPROR__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__0__Impl_in_rule__EXPROR__Group_1__09243);
            rule__EXPROR__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__1_in_rule__EXPROR__Group_1__09246);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4598:1: rule__EXPROR__Group_1__0__Impl : ( ( rule__EXPROR__Lc1Assignment_1_0 ) ) ;
    public final void rule__EXPROR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4602:1: ( ( ( rule__EXPROR__Lc1Assignment_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4603:1: ( ( rule__EXPROR__Lc1Assignment_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4603:1: ( ( rule__EXPROR__Lc1Assignment_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4604:1: ( rule__EXPROR__Lc1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc1Assignment_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4605:1: ( rule__EXPROR__Lc1Assignment_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4605:2: rule__EXPROR__Lc1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__EXPROR__Lc1Assignment_1_0_in_rule__EXPROR__Group_1__0__Impl9273);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4615:1: rule__EXPROR__Group_1__1 : rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2 ;
    public final void rule__EXPROR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4619:1: ( rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4620:2: rule__EXPROR__Group_1__1__Impl rule__EXPROR__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__1__Impl_in_rule__EXPROR__Group_1__19303);
            rule__EXPROR__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__2_in_rule__EXPROR__Group_1__19306);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4627:1: rule__EXPROR__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__EXPROR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4631:1: ( ( 'or' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4632:1: ( 'or' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4632:1: ( 'or' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4633:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getOrKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__EXPROR__Group_1__1__Impl9334); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4646:1: rule__EXPROR__Group_1__2 : rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3 ;
    public final void rule__EXPROR__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4650:1: ( rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4651:2: rule__EXPROR__Group_1__2__Impl rule__EXPROR__Group_1__3
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__2__Impl_in_rule__EXPROR__Group_1__29365);
            rule__EXPROR__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPROR__Group_1__3_in_rule__EXPROR__Group_1__29368);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4658:1: rule__EXPROR__Group_1__2__Impl : ( ( rule__EXPROR__Lc2Assignment_1_2 ) ) ;
    public final void rule__EXPROR__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4662:1: ( ( ( rule__EXPROR__Lc2Assignment_1_2 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4663:1: ( ( rule__EXPROR__Lc2Assignment_1_2 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4663:1: ( ( rule__EXPROR__Lc2Assignment_1_2 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4664:1: ( rule__EXPROR__Lc2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc2Assignment_1_2()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4665:1: ( rule__EXPROR__Lc2Assignment_1_2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4665:2: rule__EXPROR__Lc2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__EXPROR__Lc2Assignment_1_2_in_rule__EXPROR__Group_1__2__Impl9395);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4675:1: rule__EXPROR__Group_1__3 : rule__EXPROR__Group_1__3__Impl ;
    public final void rule__EXPROR__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4679:1: ( rule__EXPROR__Group_1__3__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4680:2: rule__EXPROR__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EXPROR__Group_1__3__Impl_in_rule__EXPROR__Group_1__39425);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4686:1: rule__EXPROR__Group_1__3__Impl : ( ( rule__EXPROR__E2Assignment_1_3 ) ) ;
    public final void rule__EXPROR__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4690:1: ( ( ( rule__EXPROR__E2Assignment_1_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4691:1: ( ( rule__EXPROR__E2Assignment_1_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4691:1: ( ( rule__EXPROR__E2Assignment_1_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4692:1: ( rule__EXPROR__E2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE2Assignment_1_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4693:1: ( rule__EXPROR__E2Assignment_1_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4693:2: rule__EXPROR__E2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__EXPROR__E2Assignment_1_3_in_rule__EXPROR__Group_1__3__Impl9452);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4711:1: rule__EXPRNOT__Group__0 : rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1 ;
    public final void rule__EXPRNOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4715:1: ( rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4716:2: rule__EXPRNOT__Group__0__Impl rule__EXPRNOT__Group__1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__0__Impl_in_rule__EXPRNOT__Group__09490);
            rule__EXPRNOT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRNOT__Group__1_in_rule__EXPRNOT__Group__09493);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4723:1: rule__EXPRNOT__Group__0__Impl : ( ( rule__EXPRNOT__Group_0__0 )? ) ;
    public final void rule__EXPRNOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4727:1: ( ( ( rule__EXPRNOT__Group_0__0 )? ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4728:1: ( ( rule__EXPRNOT__Group_0__0 )? )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4728:1: ( ( rule__EXPRNOT__Group_0__0 )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4729:1: ( rule__EXPRNOT__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getGroup_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4730:1: ( rule__EXPRNOT__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4730:2: rule__EXPRNOT__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EXPRNOT__Group_0__0_in_rule__EXPRNOT__Group__0__Impl9520);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4740:1: rule__EXPRNOT__Group__1 : rule__EXPRNOT__Group__1__Impl ;
    public final void rule__EXPRNOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4744:1: ( rule__EXPRNOT__Group__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4745:2: rule__EXPRNOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group__1__Impl_in_rule__EXPRNOT__Group__19551);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4751:1: rule__EXPRNOT__Group__1__Impl : ( ( rule__EXPRNOT__E1Assignment_1 ) ) ;
    public final void rule__EXPRNOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4755:1: ( ( ( rule__EXPRNOT__E1Assignment_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4756:1: ( ( rule__EXPRNOT__E1Assignment_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4756:1: ( ( rule__EXPRNOT__E1Assignment_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4757:1: ( rule__EXPRNOT__E1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getE1Assignment_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4758:1: ( rule__EXPRNOT__E1Assignment_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4758:2: rule__EXPRNOT__E1Assignment_1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__E1Assignment_1_in_rule__EXPRNOT__Group__1__Impl9578);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4772:1: rule__EXPRNOT__Group_0__0 : rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1 ;
    public final void rule__EXPRNOT__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4776:1: ( rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4777:2: rule__EXPRNOT__Group_0__0__Impl rule__EXPRNOT__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__0__Impl_in_rule__EXPRNOT__Group_0__09612);
            rule__EXPRNOT__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__1_in_rule__EXPRNOT__Group_0__09615);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4784:1: rule__EXPRNOT__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__EXPRNOT__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4788:1: ( ( 'not' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4789:1: ( 'not' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4789:1: ( 'not' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4790:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getNotKeyword_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EXPRNOT__Group_0__0__Impl9643); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4803:1: rule__EXPRNOT__Group_0__1 : rule__EXPRNOT__Group_0__1__Impl ;
    public final void rule__EXPRNOT__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4807:1: ( rule__EXPRNOT__Group_0__1__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4808:2: rule__EXPRNOT__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Group_0__1__Impl_in_rule__EXPRNOT__Group_0__19674);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4814:1: rule__EXPRNOT__Group_0__1__Impl : ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) ) ;
    public final void rule__EXPRNOT__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4818:1: ( ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4819:1: ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4819:1: ( ( rule__EXPRNOT__Lc1Assignment_0_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4820:1: ( rule__EXPRNOT__Lc1Assignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getLc1Assignment_0_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4821:1: ( rule__EXPRNOT__Lc1Assignment_0_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4821:2: rule__EXPRNOT__Lc1Assignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPRNOT__Lc1Assignment_0_1_in_rule__EXPRNOT__Group_0__1__Impl9701);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4835:1: rule__EXPREQ__Group_0__0 : rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1 ;
    public final void rule__EXPREQ__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4839:1: ( rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4840:2: rule__EXPREQ__Group_0__0__Impl rule__EXPREQ__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__0__Impl_in_rule__EXPREQ__Group_0__09735);
            rule__EXPREQ__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__1_in_rule__EXPREQ__Group_0__09738);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4847:1: rule__EXPREQ__Group_0__0__Impl : ( ( rule__EXPREQ__E1Assignment_0_0 ) ) ;
    public final void rule__EXPREQ__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4851:1: ( ( ( rule__EXPREQ__E1Assignment_0_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4852:1: ( ( rule__EXPREQ__E1Assignment_0_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4852:1: ( ( rule__EXPREQ__E1Assignment_0_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4853:1: ( rule__EXPREQ__E1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getE1Assignment_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4854:1: ( rule__EXPREQ__E1Assignment_0_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4854:2: rule__EXPREQ__E1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__EXPREQ__E1Assignment_0_0_in_rule__EXPREQ__Group_0__0__Impl9765);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4864:1: rule__EXPREQ__Group_0__1 : rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2 ;
    public final void rule__EXPREQ__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4868:1: ( rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4869:2: rule__EXPREQ__Group_0__1__Impl rule__EXPREQ__Group_0__2
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__1__Impl_in_rule__EXPREQ__Group_0__19795);
            rule__EXPREQ__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__2_in_rule__EXPREQ__Group_0__19798);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4876:1: rule__EXPREQ__Group_0__1__Impl : ( ( rule__EXPREQ__CccAssignment_0_1 ) ) ;
    public final void rule__EXPREQ__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4880:1: ( ( ( rule__EXPREQ__CccAssignment_0_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4881:1: ( ( rule__EXPREQ__CccAssignment_0_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4881:1: ( ( rule__EXPREQ__CccAssignment_0_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4882:1: ( rule__EXPREQ__CccAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getCccAssignment_0_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4883:1: ( rule__EXPREQ__CccAssignment_0_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4883:2: rule__EXPREQ__CccAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPREQ__CccAssignment_0_1_in_rule__EXPREQ__Group_0__1__Impl9825);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4893:1: rule__EXPREQ__Group_0__2 : rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3 ;
    public final void rule__EXPREQ__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4897:1: ( rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4898:2: rule__EXPREQ__Group_0__2__Impl rule__EXPREQ__Group_0__3
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__2__Impl_in_rule__EXPREQ__Group_0__29855);
            rule__EXPREQ__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__3_in_rule__EXPREQ__Group_0__29858);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4905:1: rule__EXPREQ__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__EXPREQ__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4909:1: ( ( '=?' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4910:1: ( '=?' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4910:1: ( '=?' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4911:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,46,FOLLOW_46_in_rule__EXPREQ__Group_0__2__Impl9886); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4924:1: rule__EXPREQ__Group_0__3 : rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4 ;
    public final void rule__EXPREQ__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4928:1: ( rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4929:2: rule__EXPREQ__Group_0__3__Impl rule__EXPREQ__Group_0__4
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__3__Impl_in_rule__EXPREQ__Group_0__39917);
            rule__EXPREQ__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__4_in_rule__EXPREQ__Group_0__39920);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4936:1: rule__EXPREQ__Group_0__3__Impl : ( ( rule__EXPREQ__Lc2Assignment_0_3 ) ) ;
    public final void rule__EXPREQ__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4940:1: ( ( ( rule__EXPREQ__Lc2Assignment_0_3 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4941:1: ( ( rule__EXPREQ__Lc2Assignment_0_3 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4941:1: ( ( rule__EXPREQ__Lc2Assignment_0_3 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4942:1: ( rule__EXPREQ__Lc2Assignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLc2Assignment_0_3()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4943:1: ( rule__EXPREQ__Lc2Assignment_0_3 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4943:2: rule__EXPREQ__Lc2Assignment_0_3
            {
            pushFollow(FOLLOW_rule__EXPREQ__Lc2Assignment_0_3_in_rule__EXPREQ__Group_0__3__Impl9947);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4953:1: rule__EXPREQ__Group_0__4 : rule__EXPREQ__Group_0__4__Impl ;
    public final void rule__EXPREQ__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4957:1: ( rule__EXPREQ__Group_0__4__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4958:2: rule__EXPREQ__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_0__4__Impl_in_rule__EXPREQ__Group_0__49977);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4964:1: rule__EXPREQ__Group_0__4__Impl : ( ( rule__EXPREQ__WAssignment_0_4 ) ) ;
    public final void rule__EXPREQ__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4968:1: ( ( ( rule__EXPREQ__WAssignment_0_4 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4969:1: ( ( rule__EXPREQ__WAssignment_0_4 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4969:1: ( ( rule__EXPREQ__WAssignment_0_4 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4970:1: ( rule__EXPREQ__WAssignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getWAssignment_0_4()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4971:1: ( rule__EXPREQ__WAssignment_0_4 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4971:2: rule__EXPREQ__WAssignment_0_4
            {
            pushFollow(FOLLOW_rule__EXPREQ__WAssignment_0_4_in_rule__EXPREQ__Group_0__4__Impl10004);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4991:1: rule__EXPREQ__Group_1__0 : rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1 ;
    public final void rule__EXPREQ__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4995:1: ( rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:4996:2: rule__EXPREQ__Group_1__0__Impl rule__EXPREQ__Group_1__1
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__0__Impl_in_rule__EXPREQ__Group_1__010044);
            rule__EXPREQ__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__1_in_rule__EXPREQ__Group_1__010047);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5003:1: rule__EXPREQ__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EXPREQ__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5007:1: ( ( '(' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5008:1: ( '(' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5008:1: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5009:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EXPREQ__Group_1__0__Impl10075); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5022:1: rule__EXPREQ__Group_1__1 : rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2 ;
    public final void rule__EXPREQ__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5026:1: ( rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5027:2: rule__EXPREQ__Group_1__1__Impl rule__EXPREQ__Group_1__2
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__1__Impl_in_rule__EXPREQ__Group_1__110106);
            rule__EXPREQ__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__2_in_rule__EXPREQ__Group_1__110109);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5034:1: rule__EXPREQ__Group_1__1__Impl : ( ( rule__EXPREQ__ExAssignment_1_1 ) ) ;
    public final void rule__EXPREQ__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5038:1: ( ( ( rule__EXPREQ__ExAssignment_1_1 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5039:1: ( ( rule__EXPREQ__ExAssignment_1_1 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5039:1: ( ( rule__EXPREQ__ExAssignment_1_1 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5040:1: ( rule__EXPREQ__ExAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getExAssignment_1_1()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5041:1: ( rule__EXPREQ__ExAssignment_1_1 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5041:2: rule__EXPREQ__ExAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EXPREQ__ExAssignment_1_1_in_rule__EXPREQ__Group_1__1__Impl10136);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5051:1: rule__EXPREQ__Group_1__2 : rule__EXPREQ__Group_1__2__Impl ;
    public final void rule__EXPREQ__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5055:1: ( rule__EXPREQ__Group_1__2__Impl )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5056:2: rule__EXPREQ__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPREQ__Group_1__2__Impl_in_rule__EXPREQ__Group_1__210166);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5062:1: rule__EXPREQ__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EXPREQ__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5066:1: ( ( ')' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5067:1: ( ')' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5067:1: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5068:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__EXPREQ__Group_1__2__Impl10194); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__ProgAssignment"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5088:1: rule__Model__ProgAssignment : ( ruleFunction ) ;
    public final void rule__Model__ProgAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5092:1: ( ( ruleFunction ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5093:1: ( ruleFunction )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5093:1: ( ruleFunction )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5094:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgFunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Model__ProgAssignment10236);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgFunctionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgAssignment"


    // $ANTLR start "rule__Function__NAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5103:1: rule__Function__NAssignment_1 : ( ruleLCs ) ;
    public final void rule__Function__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5107:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5108:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5108:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5109:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Function__NAssignment_110267);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5118:1: rule__Function__NomAssignment_2 : ( RULE_SYM ) ;
    public final void rule__Function__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5122:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5123:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5123:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5124:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__Function__NomAssignment_210298); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5133:1: rule__Function__TAssignment_4 : ( ruleLCs ) ;
    public final void rule__Function__TAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5137:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5138:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5138:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5139:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getTLCsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Function__TAssignment_410329);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5148:1: rule__Function__DAssignment_5 : ( ruleDef ) ;
    public final void rule__Function__DAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5152:1: ( ( ruleDef ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5153:1: ( ruleDef )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5153:1: ( ruleDef )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5154:1: ruleDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDDefParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDef_in_rule__Function__DAssignment_510360);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5163:1: rule__Def__LAssignment_1 : ( ruleLCs ) ;
    public final void rule__Def__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5167:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5168:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5168:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5169:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getLLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__LAssignment_110391);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5178:1: rule__Def__InAssignment_2 : ( ruleInput ) ;
    public final void rule__Def__InAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5182:1: ( ( ruleInput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5183:1: ( ruleInput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5183:1: ( ruleInput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5184:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getInInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Def__InAssignment_210422);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5193:1: rule__Def__ZAssignment_3 : ( ruleLCs ) ;
    public final void rule__Def__ZAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5197:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5198:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5198:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5199:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getZLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__ZAssignment_310453);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5208:1: rule__Def__VAssignment_5 : ( ruleCommands ) ;
    public final void rule__Def__VAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5212:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5213:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5213:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5214:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getVCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Def__VAssignment_510484);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5223:1: rule__Def__SAssignment_6 : ( ruleLCs ) ;
    public final void rule__Def__SAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5227:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5228:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5228:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5229:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getSLCsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__SAssignment_610515);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5238:1: rule__Def__UAssignment_9 : ( ruleLCs ) ;
    public final void rule__Def__UAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5242:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5243:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5243:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5244:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getULCsParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Def__UAssignment_910546);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5253:1: rule__Def__OAssignment_10 : ( ruleOutput ) ;
    public final void rule__Def__OAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5257:1: ( ( ruleOutput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5258:1: ( ruleOutput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5258:1: ( ruleOutput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5259:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefAccess().getOOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Def__OAssignment_1010577);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5268:1: rule__Input__VAssignment_0_0 : ( RULE_VAR ) ;
    public final void rule__Input__VAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5272:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5273:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5273:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5274:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__VAssignment_0_010608); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5283:1: rule__Input__ZAssignment_0_2 : ( ruleLCs ) ;
    public final void rule__Input__ZAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5287:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5288:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5288:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5289:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getZLCsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Input__ZAssignment_0_210639);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5298:1: rule__Input__InAssignment_0_3 : ( ruleInput ) ;
    public final void rule__Input__InAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5302:1: ( ( ruleInput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5303:1: ( ruleInput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5303:1: ( ruleInput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5304:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getInInputParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Input__InAssignment_0_310670);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5313:1: rule__Input__YAssignment_1 : ( RULE_VAR ) ;
    public final void rule__Input__YAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5317:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5318:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5318:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5319:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getYVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__YAssignment_110701); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5328:1: rule__Output__NAssignment_0_0 : ( RULE_VAR ) ;
    public final void rule__Output__NAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5332:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5333:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5333:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5334:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getNVARTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__NAssignment_0_010732); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5343:1: rule__Output__QAssignment_0_2 : ( ruleLCs ) ;
    public final void rule__Output__QAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5347:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5348:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5348:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5349:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getQLCsParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Output__QAssignment_0_210763);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5358:1: rule__Output__OAssignment_0_3 : ( ruleOutput ) ;
    public final void rule__Output__OAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5362:1: ( ( ruleOutput ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5363:1: ( ruleOutput )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5363:1: ( ruleOutput )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5364:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOOutputParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Output__OAssignment_0_310794);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5373:1: rule__Output__SAssignment_1 : ( RULE_VAR ) ;
    public final void rule__Output__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5377:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5378:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5378:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5379:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getSVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__SAssignment_110825); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5388:1: rule__Commands__AAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5392:1: ( ( ruleCommand ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5393:1: ( ruleCommand )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5393:1: ( ruleCommand )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5394:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getACommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__AAssignment_010856);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5403:1: rule__Commands__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__Commands__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5407:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5408:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5408:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5409:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Commands__LAssignment_1_110887);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5418:1: rule__Commands__SAssignment_1_2 : ( ruleCommands ) ;
    public final void rule__Commands__SAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5422:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5423:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5423:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5424:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSCommandsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Commands__SAssignment_1_210918);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5433:1: rule__Command__NopAssignment_0 : ( ruleNop ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5437:1: ( ( ruleNop ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5438:1: ( ruleNop )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5438:1: ( ruleNop )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5439:1: ruleNop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNop_in_rule__Command__NopAssignment_010949);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5448:1: rule__Command__AffectAssignment_1 : ( ruleAssign ) ;
    public final void rule__Command__AffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5452:1: ( ( ruleAssign ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5453:1: ( ruleAssign )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5453:1: ( ruleAssign )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5454:1: ruleAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAffectAssignParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_rule__Command__AffectAssignment_110980);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5463:1: rule__Command__WhAssignment_2 : ( ruleWhile ) ;
    public final void rule__Command__WhAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5467:1: ( ( ruleWhile ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5468:1: ( ruleWhile )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5468:1: ( ruleWhile )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5469:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211011);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5478:1: rule__Command__ForrAssignment_3 : ( ruleFor ) ;
    public final void rule__Command__ForrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5482:1: ( ( ruleFor ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5483:1: ( ruleFor )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5483:1: ( ruleFor )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5484:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForrForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Command__ForrAssignment_311042);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5493:1: rule__Command__ForeAssignment_4 : ( ruleForeach ) ;
    public final void rule__Command__ForeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5497:1: ( ( ruleForeach ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5498:1: ( ruleForeach )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5498:1: ( ruleForeach )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5499:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_411073);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5508:1: rule__Command__IffAssignment_5 : ( ruleIf ) ;
    public final void rule__Command__IffAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5512:1: ( ( ruleIf ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5513:1: ( ruleIf )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5513:1: ( ruleIf )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5514:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getIffIfParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Command__IffAssignment_511104);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5523:1: rule__Assign__EAssignment_0 : ( ruleVars ) ;
    public final void rule__Assign__EAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5527:1: ( ( ruleVars ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5528:1: ( ruleVars )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5528:1: ( ruleVars )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5529:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getEVarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Assign__EAssignment_011135);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5538:1: rule__Assign__LAssignment_1 : ( ruleLCs ) ;
    public final void rule__Assign__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5542:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5543:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5543:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5544:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getLLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Assign__LAssignment_111166);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5553:1: rule__Assign__CAssignment_3 : ( ruleLCs ) ;
    public final void rule__Assign__CAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5557:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5558:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5558:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5559:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getCLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Assign__CAssignment_311197);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5568:1: rule__Assign__NAssignment_4 : ( ruleEXPRS ) ;
    public final void rule__Assign__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5572:1: ( ( ruleEXPRS ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5573:1: ( ruleEXPRS )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5573:1: ( ruleEXPRS )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5574:1: ruleEXPRS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignAccess().getNEXPRSParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_rule__Assign__NAssignment_411228);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5583:1: rule__While__LlAssignment_1 : ( ruleLCs ) ;
    public final void rule__While__LlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5587:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5588:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5588:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5589:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLlLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__LlAssignment_111259);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5598:1: rule__While__EeAssignment_2 : ( ruleEXPR ) ;
    public final void rule__While__EeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5602:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5603:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5603:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5604:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getEeEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__While__EeAssignment_211290);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5613:1: rule__While__CcAssignment_3 : ( ruleLCs ) ;
    public final void rule__While__CcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5617:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5618:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5618:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5619:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCcLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__CcAssignment_311321);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5628:1: rule__While__ZAssignment_5 : ( ruleLCs ) ;
    public final void rule__While__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5632:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5633:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5633:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5634:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getZLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__ZAssignment_511352);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5643:1: rule__While__KAssignment_6 : ( ruleCommands ) ;
    public final void rule__While__KAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5647:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5648:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5648:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5649:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getKCommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__While__KAssignment_611383);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5658:1: rule__While__LcAssignment_7 : ( ruleLCs ) ;
    public final void rule__While__LcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5662:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5663:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5663:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5664:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLcLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__While__LcAssignment_711414);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5673:1: rule__For__CcAssignment_1 : ( ruleLCs ) ;
    public final void rule__For__CcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5677:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5678:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5678:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5679:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCcLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__CcAssignment_111445);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5688:1: rule__For__HhAssignment_2 : ( ruleEXPR ) ;
    public final void rule__For__HhAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5692:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5693:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5693:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5694:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getHhEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__For__HhAssignment_211476);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5703:1: rule__For__TtAssignment_3 : ( ruleLCs ) ;
    public final void rule__For__TtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5707:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5708:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5708:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5709:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getTtLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__TtAssignment_311507);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5718:1: rule__For__VvAssignment_5 : ( ruleLCs ) ;
    public final void rule__For__VvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5722:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5723:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5723:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5724:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getVvLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__VvAssignment_511538);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5733:1: rule__For__C1Assignment_6 : ( ruleCommands ) ;
    public final void rule__For__C1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5737:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5738:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5738:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5739:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getC1CommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__For__C1Assignment_611569);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5748:1: rule__For__SsAssignment_7 : ( ruleLCs ) ;
    public final void rule__For__SsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5752:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5753:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5753:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5754:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSsLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__For__SsAssignment_711600);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5763:1: rule__If__MmAssignment_1 : ( ruleLCs ) ;
    public final void rule__If__MmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5767:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5768:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5768:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5769:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getMmLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__MmAssignment_111631);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5778:1: rule__If__JjAssignment_2 : ( ruleEXPR ) ;
    public final void rule__If__JjAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5782:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5783:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5783:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5784:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getJjEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__If__JjAssignment_211662);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5793:1: rule__If__KkAssignment_3 : ( ruleLCs ) ;
    public final void rule__If__KkAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5797:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5798:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5798:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5799:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getKkLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__KkAssignment_311693);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5808:1: rule__If__HgAssignment_5 : ( ruleLCs ) ;
    public final void rule__If__HgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5812:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5813:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5813:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5814:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getHgLCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__HgAssignment_511724);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5823:1: rule__If__C2Assignment_6 : ( ruleCommands ) ;
    public final void rule__If__C2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5827:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5828:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5828:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5829:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getC2CommandsParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__C2Assignment_611755);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5838:1: rule__If__GgAssignment_7 : ( ruleLCs ) ;
    public final void rule__If__GgAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5842:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5843:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5843:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5844:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGgLCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__GgAssignment_711786);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5853:1: rule__If__FfAssignment_8_1 : ( ruleLCs ) ;
    public final void rule__If__FfAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5857:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5858:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5858:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5859:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFfLCsParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__FfAssignment_8_111817);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5868:1: rule__If__OAssignment_8_2 : ( ruleCommands ) ;
    public final void rule__If__OAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5872:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5873:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5873:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5874:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getOCommandsParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__If__OAssignment_8_211848);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5883:1: rule__If__DdAssignment_8_3 : ( ruleLCs ) ;
    public final void rule__If__DdAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5887:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5888:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5888:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5889:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getDdLCsParserRuleCall_8_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__If__DdAssignment_8_311879);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5898:1: rule__Foreach__SqAssignment_1 : ( ruleLCs ) ;
    public final void rule__Foreach__SqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5902:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5903:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5903:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5904:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getSqLCsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__SqAssignment_111910);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5913:1: rule__Foreach__WxAssignment_2 : ( ruleEXPR ) ;
    public final void rule__Foreach__WxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5917:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5918:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5918:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5919:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getWxEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__Foreach__WxAssignment_211941);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5928:1: rule__Foreach__LcAssignment_3 : ( ruleLCs ) ;
    public final void rule__Foreach__LcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5932:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5933:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5933:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5934:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLcLCsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__LcAssignment_311972);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5943:1: rule__Foreach__Lc2Assignment_5 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5947:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5948:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5948:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5949:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc2LCsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc2Assignment_512003);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5958:1: rule__Foreach__E1Assignment_6 : ( ruleEXPR ) ;
    public final void rule__Foreach__E1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5962:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5963:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5963:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5964:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getE1EXPRParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__Foreach__E1Assignment_612034);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5973:1: rule__Foreach__Lc3Assignment_7 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5977:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5978:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5978:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5979:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc3LCsParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc3Assignment_712065);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5988:1: rule__Foreach__Lc4Assignment_9 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc4Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5992:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5993:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5993:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:5994:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc4LCsParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc4Assignment_912096);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6003:1: rule__Foreach__C3Assignment_10 : ( ruleCommands ) ;
    public final void rule__Foreach__C3Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6007:1: ( ( ruleCommands ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6008:1: ( ruleCommands )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6008:1: ( ruleCommands )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6009:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getC3CommandsParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Foreach__C3Assignment_1012127);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6018:1: rule__Foreach__Lc5Assignment_11 : ( ruleLCs ) ;
    public final void rule__Foreach__Lc5Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6022:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6023:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6023:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6024:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLc5LCsParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Foreach__Lc5Assignment_1112158);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6033:1: rule__Vars__AAssignment_0 : ( RULE_VAR ) ;
    public final void rule__Vars__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6037:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6038:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6038:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6039:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getAVARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__AAssignment_012189); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6048:1: rule__Vars__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__Vars__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6052:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6053:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6053:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6054:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__Vars__LAssignment_1_112220);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6063:1: rule__Vars__UAssignment_1_2 : ( ruleVars ) ;
    public final void rule__Vars__UAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6067:1: ( ( ruleVars ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6068:1: ( ruleVars )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6068:1: ( ruleVars )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6069:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getUVarsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__UAssignment_1_212251);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6078:1: rule__EXPRS__FAssignment_0 : ( ruleEXPR ) ;
    public final void rule__EXPRS__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6082:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6083:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6083:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6084:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getFEXPRParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPRS__FAssignment_012282);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6093:1: rule__EXPRS__LAssignment_1_1 : ( ruleLCs ) ;
    public final void rule__EXPRS__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6097:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6098:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6098:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6099:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getLLCsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRS__LAssignment_1_112313);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6108:1: rule__EXPRS__E2Assignment_1_2 : ( ruleEXPRS ) ;
    public final void rule__EXPRS__E2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6112:1: ( ( ruleEXPRS ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6113:1: ( ruleEXPRS )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6113:1: ( ruleEXPRS )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6114:1: ruleEXPRS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSAccess().getE2EXPRSParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_rule__EXPRS__E2Assignment_1_212344);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6123:1: rule__EXPR__E1Assignment_0 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPR__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6127:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6128:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6128:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6129:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getE1EXPRSIMPLEParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPR__E1Assignment_012375);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6138:1: rule__EXPR__ExAssignment_1 : ( ruleEXPRAND ) ;
    public final void rule__EXPR__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6142:1: ( ( ruleEXPRAND ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6143:1: ( ruleEXPRAND )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6143:1: ( ruleEXPRAND )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6144:1: ruleEXPRAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRAccess().getExEXPRANDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_rule__EXPR__ExAssignment_112406);
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


    // $ANTLR start "rule__EXPRSIMPLE__NilAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6153:1: rule__EXPRSIMPLE__NilAssignment_0 : ( ( 'nil' ) ) ;
    public final void rule__EXPRSIMPLE__NilAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6157:1: ( ( ( 'nil' ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6158:1: ( ( 'nil' ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6158:1: ( ( 'nil' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6159:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getNilNilKeyword_0_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6160:1: ( 'nil' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6161:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getNilNilKeyword_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__EXPRSIMPLE__NilAssignment_012442); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getNilNilKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getNilNilKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__NilAssignment_0"


    // $ANTLR start "rule__EXPRSIMPLE__VAssignment_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6176:1: rule__EXPRSIMPLE__VAssignment_1 : ( RULE_VAR ) ;
    public final void rule__EXPRSIMPLE__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6180:1: ( ( RULE_VAR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6181:1: ( RULE_VAR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6181:1: ( RULE_VAR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6182:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getVVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__EXPRSIMPLE__VAssignment_112481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getVVARTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__VAssignment_1"


    // $ANTLR start "rule__EXPRSIMPLE__SymAssignment_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6191:1: rule__EXPRSIMPLE__SymAssignment_2 : ( RULE_SYM ) ;
    public final void rule__EXPRSIMPLE__SymAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6195:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6196:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6196:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6197:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getSymSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SymAssignment_212512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getSymSYMTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__SymAssignment_2"


    // $ANTLR start "rule__EXPRSIMPLE__MotAssignment_3_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6206:1: rule__EXPRSIMPLE__MotAssignment_3_1 : ( ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 ) ) ;
    public final void rule__EXPRSIMPLE__MotAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6210:1: ( ( ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6211:1: ( ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6211:1: ( ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6212:1: ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getMotAlternatives_3_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6213:1: ( rule__EXPRSIMPLE__MotAlternatives_3_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6213:2: rule__EXPRSIMPLE__MotAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__MotAlternatives_3_1_0_in_rule__EXPRSIMPLE__MotAssignment_3_112543);
            rule__EXPRSIMPLE__MotAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getMotAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__MotAssignment_3_1"


    // $ANTLR start "rule__EXPRSIMPLE__LexAssignment_3_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6222:1: rule__EXPRSIMPLE__LexAssignment_3_2 : ( ruleLEXPR ) ;
    public final void rule__EXPRSIMPLE__LexAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6226:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6227:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6227:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6228:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLexLEXPRParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__LexAssignment_3_212576);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLexLEXPRParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__LexAssignment_3_2"


    // $ANTLR start "rule__EXPRSIMPLE__MotAssignment_4_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6237:1: rule__EXPRSIMPLE__MotAssignment_4_1 : ( ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 ) ) ;
    public final void rule__EXPRSIMPLE__MotAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6241:1: ( ( ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 ) ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6242:1: ( ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 ) )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6242:1: ( ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6243:1: ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getMotAlternatives_4_1_0()); 
            }
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6244:1: ( rule__EXPRSIMPLE__MotAlternatives_4_1_0 )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6244:2: rule__EXPRSIMPLE__MotAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__EXPRSIMPLE__MotAlternatives_4_1_0_in_rule__EXPRSIMPLE__MotAssignment_4_112607);
            rule__EXPRSIMPLE__MotAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getMotAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__MotAssignment_4_1"


    // $ANTLR start "rule__EXPRSIMPLE__LAssignment_4_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6253:1: rule__EXPRSIMPLE__LAssignment_4_2 : ( ruleLCs ) ;
    public final void rule__EXPRSIMPLE__LAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6257:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6258:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6258:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6259:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLLCsParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__LAssignment_4_212640);
            ruleLCs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLLCsParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__LAssignment_4_2"


    // $ANTLR start "rule__EXPRSIMPLE__ExAssignment_4_3"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6268:1: rule__EXPRSIMPLE__ExAssignment_4_3 : ( ruleEXPR ) ;
    public final void rule__EXPRSIMPLE__ExAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6272:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6273:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6273:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6274:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getExEXPRParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__ExAssignment_4_312671);
            ruleEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getExEXPRParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__ExAssignment_4_3"


    // $ANTLR start "rule__EXPRSIMPLE__SymAssignment_5_1"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6283:1: rule__EXPRSIMPLE__SymAssignment_5_1 : ( RULE_SYM ) ;
    public final void rule__EXPRSIMPLE__SymAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6287:1: ( ( RULE_SYM ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6288:1: ( RULE_SYM )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6288:1: ( RULE_SYM )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6289:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getSymSYMTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SymAssignment_5_112702); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getSymSYMTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__SymAssignment_5_1"


    // $ANTLR start "rule__EXPRSIMPLE__LexAssignment_5_2"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6298:1: rule__EXPRSIMPLE__LexAssignment_5_2 : ( ruleLEXPR ) ;
    public final void rule__EXPRSIMPLE__LexAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6302:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6303:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6303:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6304:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRSIMPLEAccess().getLexLEXPRParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__LexAssignment_5_212733);
            ruleLEXPR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRSIMPLEAccess().getLexLEXPRParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRSIMPLE__LexAssignment_5_2"


    // $ANTLR start "rule__LEXPR__FAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6313:1: rule__LEXPR__FAssignment_0 : ( ruleLCs ) ;
    public final void rule__LEXPR__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6317:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6318:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6318:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6319:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getFLCsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__LEXPR__FAssignment_012764);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6328:1: rule__LEXPR__NAssignment_1 : ( ruleEXPR ) ;
    public final void rule__LEXPR__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6332:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6333:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6333:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6334:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getNEXPRParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__LEXPR__NAssignment_112795);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6343:1: rule__LEXPR__TAssignment_2 : ( ruleLEXPR ) ;
    public final void rule__LEXPR__TAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6347:1: ( ( ruleLEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6348:1: ( ruleLEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6348:1: ( ruleLEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6349:1: ruleLEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLEXPRAccess().getTLEXPRParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_rule__LEXPR__TAssignment_212826);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6358:1: rule__EXPRAND__FAssignment_0 : ( ruleEXPROR ) ;
    public final void rule__EXPRAND__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6362:1: ( ( ruleEXPROR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6363:1: ( ruleEXPROR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6363:1: ( ruleEXPROR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6364:1: ruleEXPROR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getFEXPRORParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_rule__EXPRAND__FAssignment_012857);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6373:1: rule__EXPRAND__Lc1Assignment_1_0 : ( ruleLCs ) ;
    public final void rule__EXPRAND__Lc1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6377:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6378:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6378:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6379:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRAND__Lc1Assignment_1_012888);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6388:1: rule__EXPRAND__Lc2Assignment_1_2 : ( ruleLCs ) ;
    public final void rule__EXPRAND__Lc2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6392:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6393:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6393:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6394:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRAND__Lc2Assignment_1_212919);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6403:1: rule__EXPRAND__EeAssignment_1_3 : ( ruleEXPRAND ) ;
    public final void rule__EXPRAND__EeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6407:1: ( ( ruleEXPRAND ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6408:1: ( ruleEXPRAND )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6408:1: ( ruleEXPRAND )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6409:1: ruleEXPRAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRANDAccess().getEeEXPRANDParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_rule__EXPRAND__EeAssignment_1_312950);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6418:1: rule__EXPROR__E1Assignment_0 : ( ruleEXPRNOT ) ;
    public final void rule__EXPROR__E1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6422:1: ( ( ruleEXPRNOT ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6423:1: ( ruleEXPRNOT )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6423:1: ( ruleEXPRNOT )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6424:1: ruleEXPRNOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE1EXPRNOTParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_rule__EXPROR__E1Assignment_012981);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6433:1: rule__EXPROR__Lc1Assignment_1_0 : ( ruleLCs ) ;
    public final void rule__EXPROR__Lc1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6437:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6438:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6438:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6439:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc1LCsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPROR__Lc1Assignment_1_013012);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6448:1: rule__EXPROR__Lc2Assignment_1_2 : ( ruleLCs ) ;
    public final void rule__EXPROR__Lc2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6452:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6453:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6453:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6454:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getLc2LCsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPROR__Lc2Assignment_1_213043);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6463:1: rule__EXPROR__E2Assignment_1_3 : ( ruleEXPROR ) ;
    public final void rule__EXPROR__E2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6467:1: ( ( ruleEXPROR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6468:1: ( ruleEXPROR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6468:1: ( ruleEXPROR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6469:1: ruleEXPROR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRORAccess().getE2EXPRORParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_rule__EXPROR__E2Assignment_1_313074);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6478:1: rule__EXPRNOT__Lc1Assignment_0_1 : ( ruleLCs ) ;
    public final void rule__EXPRNOT__Lc1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6482:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6483:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6483:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6484:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getLc1LCsParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPRNOT__Lc1Assignment_0_113105);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6493:1: rule__EXPRNOT__E1Assignment_1 : ( ruleEXPREQ ) ;
    public final void rule__EXPRNOT__E1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6497:1: ( ( ruleEXPREQ ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6498:1: ( ruleEXPREQ )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6498:1: ( ruleEXPREQ )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6499:1: ruleEXPREQ
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRNOTAccess().getE1EXPREQParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_rule__EXPRNOT__E1Assignment_113136);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6508:1: rule__EXPREQ__E1Assignment_0_0 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPREQ__E1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6512:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6513:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6513:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6514:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getE1EXPRSIMPLEParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__E1Assignment_0_013167);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6523:1: rule__EXPREQ__CccAssignment_0_1 : ( ruleLCs ) ;
    public final void rule__EXPREQ__CccAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6527:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6528:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6528:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6529:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getCccLCsParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPREQ__CccAssignment_0_113198);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6538:1: rule__EXPREQ__Lc2Assignment_0_3 : ( ruleLCs ) ;
    public final void rule__EXPREQ__Lc2Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6542:1: ( ( ruleLCs ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6543:1: ( ruleLCs )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6543:1: ( ruleLCs )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:1: ruleLCs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getLc2LCsParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_rule__EXPREQ__Lc2Assignment_0_313229);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6553:1: rule__EXPREQ__WAssignment_0_4 : ( ruleEXPRSIMPLE ) ;
    public final void rule__EXPREQ__WAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6557:1: ( ( ruleEXPRSIMPLE ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6558:1: ( ruleEXPRSIMPLE )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6558:1: ( ruleEXPRSIMPLE )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6559:1: ruleEXPRSIMPLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getWEXPRSIMPLEParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__WAssignment_0_413260);
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6568:1: rule__EXPREQ__ExAssignment_1_1 : ( ruleEXPR ) ;
    public final void rule__EXPREQ__ExAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6572:1: ( ( ruleEXPR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6573:1: ( ruleEXPR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6573:1: ( ruleEXPR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6574:1: ruleEXPR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPREQAccess().getExEXPRParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_rule__EXPREQ__ExAssignment_1_113291);
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


    // $ANTLR start "rule__LCs__LAssignment"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6584:1: rule__LCs__LAssignment : ( ruleLC ) ;
    public final void rule__LCs__LAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6588:1: ( ( ruleLC ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6589:1: ( ruleLC )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6589:1: ( ruleLC )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6590:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCsAccess().getLLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LCs__LAssignment13323);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCsAccess().getLLCParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCs__LAssignment"


    // $ANTLR start "rule__LC__AAssignment_0"
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6599:1: rule__LC__AAssignment_0 : ( RULE_SP ) ;
    public final void rule__LC__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6603:1: ( ( RULE_SP ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6604:1: ( RULE_SP )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6604:1: ( RULE_SP )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6605:1: RULE_SP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getASPTerminalRuleCall_0_0()); 
            }
            match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LC__AAssignment_013354); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6614:1: rule__LC__ZAssignment_1 : ( RULE_CR ) ;
    public final void rule__LC__ZAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6618:1: ( ( RULE_CR ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6619:1: ( RULE_CR )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6619:1: ( RULE_CR )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6620:1: RULE_CR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getZCRTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LC__ZAssignment_113385); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6629:1: rule__LC__EAssignment_2 : ( RULE_TAB ) ;
    public final void rule__LC__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6633:1: ( ( RULE_TAB ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6634:1: ( RULE_TAB )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6634:1: ( RULE_TAB )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6635:1: RULE_TAB
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getETABTerminalRuleCall_2_0()); 
            }
            match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LC__EAssignment_213416); if (state.failed) return ;
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
    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6644:1: rule__LC__RAssignment_3 : ( RULE_LF ) ;
    public final void rule__LC__RAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6648:1: ( ( RULE_LF ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6649:1: ( RULE_LF )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6649:1: ( RULE_LF )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6650:1: RULE_LF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getRLFTerminalRuleCall_3_0()); 
            }
            match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LC__RAssignment_313447); if (state.failed) return ;
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

    // $ANTLR start synpred10_InternalLangage_while
    public final void synpred10_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( ( ( rule__EXPR__E1Assignment_0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( ( rule__EXPR__E1Assignment_0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:836:1: ( ( rule__EXPR__E1Assignment_0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:837:1: ( rule__EXPR__E1Assignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRAccess().getE1Assignment_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:1: ( rule__EXPR__E1Assignment_0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:838:2: rule__EXPR__E1Assignment_0
        {
        pushFollow(FOLLOW_rule__EXPR__E1Assignment_0_in_synpred10_InternalLangage_while1751);
        rule__EXPR__E1Assignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLangage_while

    // $ANTLR start synpred18_InternalLangage_while
    public final void synpred18_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:956:1: ( ( ( rule__EXPREQ__Group_0__0 ) ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:956:1: ( ( rule__EXPREQ__Group_0__0 ) )
        {
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:956:1: ( ( rule__EXPREQ__Group_0__0 ) )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:957:1: ( rule__EXPREQ__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPREQAccess().getGroup_0()); 
        }
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:958:1: ( rule__EXPREQ__Group_0__0 )
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:958:2: rule__EXPREQ__Group_0__0
        {
        pushFollow(FOLLOW_rule__EXPREQ__Group_0__0_in_synpred18_InternalLangage_while2035);
        rule__EXPREQ__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalLangage_while

    // Delegated rules

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
    public final boolean synpred10_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLangage_while_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__Model__ProgAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_entryRuleDef188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDef195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__0_in_ruleDef221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_in_ruleInput281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Alternatives_in_ruleOutput341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNop_in_entryRuleNop488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNop495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNop522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0_in_ruleAssign583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0_in_ruleForeach823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_entryRuleEXPRS910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRS917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__0_in_ruleEXPRS943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_entryRuleEXPR970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPR977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__Alternatives_in_ruleEXPR1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRSIMPLE1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Alternatives_in_ruleEXPRSIMPLE1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_entryRuleLEXPR1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEXPR1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__0_in_ruleLEXPR1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRAND1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__0_in_ruleEXPRAND1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_entryRuleEXPROR1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPROR1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__0_in_ruleEXPROR1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRNOT1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__0_in_ruleEXPRNOT1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPREQ1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Alternatives_in_ruleEXPREQ1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_entryRuleLCs1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCs1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LCs__LAssignment_in_ruleLCs1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__Alternatives_in_ruleLC1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__YAssignment_1_in_rule__Input__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__SAssignment_1_in_rule__Output__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AffectAssignment_1_in_rule__Command__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__WhAssignment_2_in_rule__Command__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForrAssignment_3_in_rule__Command__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ForeAssignment_4_in_rule__Command__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__IffAssignment_5_in_rule__Command__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__E1Assignment_0_in_rule__EXPR__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__ExAssignment_1_in_rule__EXPR__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__NilAssignment_0_in_rule__EXPRSIMPLE__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__VAssignment_1_in_rule__EXPRSIMPLE__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__SymAssignment_2_in_rule__EXPRSIMPLE__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__0_in_rule__EXPRSIMPLE__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__0_in_rule__EXPRSIMPLE__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__0_in_rule__EXPRSIMPLE__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EXPRSIMPLE__MotAlternatives_3_1_01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EXPRSIMPLE__MotAlternatives_3_1_01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EXPRSIMPLE__MotAlternatives_4_1_01981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EXPRSIMPLE__MotAlternatives_4_1_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0_in_rule__EXPREQ__Alternatives2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__0_in_rule__EXPREQ__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__AAssignment_0_in_rule__LC__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__ZAssignment_1_in_rule__LC__Alternatives2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__EAssignment_2_in_rule__LC__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__RAssignment_3_in_rule__LC__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__02171 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__02174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Function__Group__0__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__12233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__12236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NAssignment_1_in_rule__Function__Group__1__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__22293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__22296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_2_in_rule__Function__Group__2__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32353 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Function__Group__3__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42415 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__TAssignment_4_in_rule__Function__Group__4__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DAssignment_5_in_rule__Function__Group__5__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__0__Impl_in_rule__Def__Group__02544 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Def__Group__1_in_rule__Def__Group__02547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Def__Group__0__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__1__Impl_in_rule__Def__Group__12606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Def__Group__2_in_rule__Def__Group__12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__LAssignment_1_in_rule__Def__Group__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__2__Impl_in_rule__Def__Group__22666 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Def__Group__3_in_rule__Def__Group__22669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__InAssignment_2_in_rule__Def__Group__2__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__3__Impl_in_rule__Def__Group__32726 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Def__Group__4_in_rule__Def__Group__32729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__ZAssignment_3_in_rule__Def__Group__3__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__4__Impl_in_rule__Def__Group__42786 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__Def__Group__5_in_rule__Def__Group__42789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Def__Group__4__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__5__Impl_in_rule__Def__Group__52848 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Def__Group__6_in_rule__Def__Group__52851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__VAssignment_5_in_rule__Def__Group__5__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__6__Impl_in_rule__Def__Group__62908 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Def__Group__7_in_rule__Def__Group__62911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__SAssignment_6_in_rule__Def__Group__6__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__7__Impl_in_rule__Def__Group__72968 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Def__Group__8_in_rule__Def__Group__72971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Def__Group__7__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__8__Impl_in_rule__Def__Group__83030 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Def__Group__9_in_rule__Def__Group__83033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Def__Group__8__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__9__Impl_in_rule__Def__Group__93092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Def__Group__10_in_rule__Def__Group__93095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__UAssignment_9_in_rule__Def__Group__9__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__Group__10__Impl_in_rule__Def__Group__103152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Def__OAssignment_10_in_rule__Def__Group__10__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__03231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__03234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_0_0_in_rule__Input__Group_0__0__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__13291 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Input__Group_0__2_in_rule__Input__Group_0__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Input__Group_0__1__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__2__Impl_in_rule__Input__Group_0__23353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group_0__3_in_rule__Input__Group_0__23356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__ZAssignment_0_2_in_rule__Input__Group_0__2__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__3__Impl_in_rule__Input__Group_0__33413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__InAssignment_0_3_in_rule__Input__Group_0__3__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__03478 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__NAssignment_0_0_in_rule__Output__Group_0__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__13538 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Output__Group_0__2_in_rule__Output__Group_0__13541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Output__Group_0__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__2__Impl_in_rule__Output__Group_0__23600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Output__Group_0__3_in_rule__Output__Group_0__23603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__QAssignment_0_2_in_rule__Output__Group_0__2__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__3__Impl_in_rule__Output__Group_0__33660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__OAssignment_0_3_in_rule__Output__Group_0__3__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03725 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__AAssignment_0_in_rule__Commands__Group__0__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03847 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Commands__Group_1__0__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13909 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__LAssignment_1_1_in_rule__Commands__Group_1__1__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__SAssignment_1_2_in_rule__Commands__Group_1__2__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04032 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__EAssignment_0_in_rule__Assign__Group__0__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14092 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__LAssignment_1_in_rule__Assign__Group__1__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24152 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Assign__Group__2__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34214 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__Assign__Group__4_in_rule__Assign__Group__34217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__CAssignment_3_in_rule__Assign__Group__3__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__4__Impl_in_rule__Assign__Group__44274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__NAssignment_4_in_rule__Assign__Group__4__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04341 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__While__Group__0__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14403 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__LlAssignment_1_in_rule__While__Group__1__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24463 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__EeAssignment_2_in_rule__While__Group__2__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34523 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__CcAssignment_3_in_rule__While__Group__3__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44583 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__While__Group__4__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54645 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ZAssignment_5_in_rule__While__Group__5__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64705 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__KAssignment_6_in_rule__While__Group__6__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74765 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__74768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__LcAssignment_7_in_rule__While__Group__7__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__While__Group__8__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04902 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__For__Group__0__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14964 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CcAssignment_1_in_rule__For__Group__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25024 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__HhAssignment_2_in_rule__For__Group__2__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35084 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__TtAssignment_3_in_rule__For__Group__3__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45144 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__For__Group__4__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55206 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__VvAssignment_5_in_rule__For__Group__5__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65266 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__C1Assignment_6_in_rule__For__Group__6__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75326 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__SsAssignment_7_in_rule__For__Group__7__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__For__Group__8__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05463 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group__0__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15525 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__MmAssignment_1_in_rule__If__Group__1__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25585 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__JjAssignment_2_in_rule__If__Group__2__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35645 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__35648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__KkAssignment_3_in_rule__If__Group__3__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45705 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__45708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__If__Group__4__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55767 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__55770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__HgAssignment_5_in_rule__If__Group__5__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65827 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__65830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__C2Assignment_6_in_rule__If__Group__6__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__75887 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__75890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__GgAssignment_7_in_rule__If__Group__7__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__85947 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__85950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__If__Group__9__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06087 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__If__Group_8__0__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16149 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__FfAssignment_8_1_in_rule__If__Group_8__1__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26209 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__OAssignment_8_2_in_rule__If__Group_8__2__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__DdAssignment_8_3_in_rule__If__Group_8__3__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06334 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Foreach__Group__0__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16396 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__SqAssignment_1_in_rule__Foreach__Group__1__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26456 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__WxAssignment_2_in_rule__Foreach__Group__2__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36516 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__LcAssignment_3_in_rule__Foreach__Group__3__Impl6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46576 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Foreach__Group__4__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56638 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc2Assignment_5_in_rule__Foreach__Group__5__Impl6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66698 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__E1Assignment_6_in_rule__Foreach__Group__6__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76758 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc3Assignment_7_in_rule__Foreach__Group__7__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86818 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Foreach__Group__8__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__96880 = new BitSet(new long[]{0x0000008C80040020L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__96883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc4Assignment_9_in_rule__Foreach__Group__9__Impl6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__106940 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__106943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__C3Assignment_10_in_rule__Foreach__Group__10__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117000 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Lc5Assignment_11_in_rule__Foreach__Group__11__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Foreach__Group__12__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07145 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__AAssignment_0_in_rule__Vars__Group__0__Impl7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07267 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Vars__Group_1__0__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17329 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__LAssignment_1_1_in_rule__Vars__Group_1__1__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__27389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__UAssignment_1_2_in_rule__Vars__Group_1__2__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__0__Impl_in_rule__EXPRS__Group__07452 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__1_in_rule__EXPRS__Group__07455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__FAssignment_0_in_rule__EXPRS__Group__0__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group__1__Impl_in_rule__EXPRS__Group__17512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__0_in_rule__EXPRS__Group__1__Impl7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__0__Impl_in_rule__EXPRS__Group_1__07574 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__1_in_rule__EXPRS__Group_1__07577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EXPRS__Group_1__0__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__1__Impl_in_rule__EXPRS__Group_1__17636 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__2_in_rule__EXPRS__Group_1__17639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__LAssignment_1_1_in_rule__EXPRS__Group_1__1__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__Group_1__2__Impl_in_rule__EXPRS__Group_1__27696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRS__E2Assignment_1_2_in_rule__EXPRS__Group_1__2__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__0__Impl_in_rule__EXPRSIMPLE__Group_3__07759 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__1_in_rule__EXPRSIMPLE__Group_3__07762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EXPRSIMPLE__Group_3__0__Impl7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__1__Impl_in_rule__EXPRSIMPLE__Group_3__17821 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__2_in_rule__EXPRSIMPLE__Group_3__17824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__MotAssignment_3_1_in_rule__EXPRSIMPLE__Group_3__1__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__2__Impl_in_rule__EXPRSIMPLE__Group_3__27881 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__3_in_rule__EXPRSIMPLE__Group_3__27884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__LexAssignment_3_2_in_rule__EXPRSIMPLE__Group_3__2__Impl7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_3__3__Impl_in_rule__EXPRSIMPLE__Group_3__37941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EXPRSIMPLE__Group_3__3__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__0__Impl_in_rule__EXPRSIMPLE__Group_4__08008 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__1_in_rule__EXPRSIMPLE__Group_4__08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EXPRSIMPLE__Group_4__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__1__Impl_in_rule__EXPRSIMPLE__Group_4__18070 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__2_in_rule__EXPRSIMPLE__Group_4__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__MotAssignment_4_1_in_rule__EXPRSIMPLE__Group_4__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__2__Impl_in_rule__EXPRSIMPLE__Group_4__28130 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__3_in_rule__EXPRSIMPLE__Group_4__28133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__LAssignment_4_2_in_rule__EXPRSIMPLE__Group_4__2__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__3__Impl_in_rule__EXPRSIMPLE__Group_4__38190 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__4_in_rule__EXPRSIMPLE__Group_4__38193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__ExAssignment_4_3_in_rule__EXPRSIMPLE__Group_4__3__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_4__4__Impl_in_rule__EXPRSIMPLE__Group_4__48250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EXPRSIMPLE__Group_4__4__Impl8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__0__Impl_in_rule__EXPRSIMPLE__Group_5__08319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__1_in_rule__EXPRSIMPLE__Group_5__08322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EXPRSIMPLE__Group_5__0__Impl8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__1__Impl_in_rule__EXPRSIMPLE__Group_5__18381 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__2_in_rule__EXPRSIMPLE__Group_5__18384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__SymAssignment_5_1_in_rule__EXPRSIMPLE__Group_5__1__Impl8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__2__Impl_in_rule__EXPRSIMPLE__Group_5__28441 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__3_in_rule__EXPRSIMPLE__Group_5__28444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__LexAssignment_5_2_in_rule__EXPRSIMPLE__Group_5__2__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__Group_5__3__Impl_in_rule__EXPRSIMPLE__Group_5__38501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EXPRSIMPLE__Group_5__3__Impl8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__0__Impl_in_rule__LEXPR__Group__08568 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__1_in_rule__LEXPR__Group__08571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__FAssignment_0_in_rule__LEXPR__Group__0__Impl8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__1__Impl_in_rule__LEXPR__Group__18628 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__2_in_rule__LEXPR__Group__18631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__NAssignment_1_in_rule__LEXPR__Group__1__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__Group__2__Impl_in_rule__LEXPR__Group__28688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEXPR__TAssignment_2_in_rule__LEXPR__Group__2__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__0__Impl_in_rule__EXPRAND__Group__08752 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__1_in_rule__EXPRAND__Group__08755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__FAssignment_0_in_rule__EXPRAND__Group__0__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group__1__Impl_in_rule__EXPRAND__Group__18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__0_in_rule__EXPRAND__Group__1__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__0__Impl_in_rule__EXPRAND__Group_1__08874 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__1_in_rule__EXPRAND__Group_1__08877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Lc1Assignment_1_0_in_rule__EXPRAND__Group_1__0__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__1__Impl_in_rule__EXPRAND__Group_1__18934 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__2_in_rule__EXPRAND__Group_1__18937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EXPRAND__Group_1__1__Impl8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__2__Impl_in_rule__EXPRAND__Group_1__28996 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__3_in_rule__EXPRAND__Group_1__28999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Lc2Assignment_1_2_in_rule__EXPRAND__Group_1__2__Impl9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__Group_1__3__Impl_in_rule__EXPRAND__Group_1__39056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRAND__EeAssignment_1_3_in_rule__EXPRAND__Group_1__3__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__0__Impl_in_rule__EXPROR__Group__09121 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__1_in_rule__EXPROR__Group__09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__E1Assignment_0_in_rule__EXPROR__Group__0__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group__1__Impl_in_rule__EXPROR__Group__19181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__0_in_rule__EXPROR__Group__1__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__0__Impl_in_rule__EXPROR__Group_1__09243 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__1_in_rule__EXPROR__Group_1__09246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Lc1Assignment_1_0_in_rule__EXPROR__Group_1__0__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__1__Impl_in_rule__EXPROR__Group_1__19303 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__2_in_rule__EXPROR__Group_1__19306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EXPROR__Group_1__1__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__2__Impl_in_rule__EXPROR__Group_1__29365 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__3_in_rule__EXPROR__Group_1__29368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Lc2Assignment_1_2_in_rule__EXPROR__Group_1__2__Impl9395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__Group_1__3__Impl_in_rule__EXPROR__Group_1__39425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPROR__E2Assignment_1_3_in_rule__EXPROR__Group_1__3__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__0__Impl_in_rule__EXPRNOT__Group__09490 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__1_in_rule__EXPRNOT__Group__09493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__0_in_rule__EXPRNOT__Group__0__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group__1__Impl_in_rule__EXPRNOT__Group__19551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__E1Assignment_1_in_rule__EXPRNOT__Group__1__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__0__Impl_in_rule__EXPRNOT__Group_0__09612 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__1_in_rule__EXPRNOT__Group_0__09615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EXPRNOT__Group_0__0__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Group_0__1__Impl_in_rule__EXPRNOT__Group_0__19674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRNOT__Lc1Assignment_0_1_in_rule__EXPRNOT__Group_0__1__Impl9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0__Impl_in_rule__EXPREQ__Group_0__09735 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__1_in_rule__EXPREQ__Group_0__09738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__E1Assignment_0_0_in_rule__EXPREQ__Group_0__0__Impl9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__1__Impl_in_rule__EXPREQ__Group_0__19795 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__2_in_rule__EXPREQ__Group_0__19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__CccAssignment_0_1_in_rule__EXPREQ__Group_0__1__Impl9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__2__Impl_in_rule__EXPREQ__Group_0__29855 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__3_in_rule__EXPREQ__Group_0__29858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EXPREQ__Group_0__2__Impl9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__3__Impl_in_rule__EXPREQ__Group_0__39917 = new BitSet(new long[]{0x0000820000000030L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__4_in_rule__EXPREQ__Group_0__39920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Lc2Assignment_0_3_in_rule__EXPREQ__Group_0__3__Impl9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__4__Impl_in_rule__EXPREQ__Group_0__49977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__WAssignment_0_4_in_rule__EXPREQ__Group_0__4__Impl10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__0__Impl_in_rule__EXPREQ__Group_1__010044 = new BitSet(new long[]{0x0000A20000000030L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__1_in_rule__EXPREQ__Group_1__010047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EXPREQ__Group_1__0__Impl10075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__1__Impl_in_rule__EXPREQ__Group_1__110106 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__2_in_rule__EXPREQ__Group_1__110109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__ExAssignment_1_1_in_rule__EXPREQ__Group_1__1__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_1__2__Impl_in_rule__EXPREQ__Group_1__210166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EXPREQ__Group_1__2__Impl10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Model__ProgAssignment10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Function__NAssignment_110267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__Function__NomAssignment_210298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Function__TAssignment_410329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_rule__Function__DAssignment_510360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__LAssignment_110391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Def__InAssignment_210422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__ZAssignment_310453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Def__VAssignment_510484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__SAssignment_610515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Def__UAssignment_910546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Def__OAssignment_1010577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__VAssignment_0_010608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Input__ZAssignment_0_210639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Input__InAssignment_0_310670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__YAssignment_110701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__NAssignment_0_010732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Output__QAssignment_0_210763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Output__OAssignment_0_310794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__SAssignment_110825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__AAssignment_010856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Commands__LAssignment_1_110887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Commands__SAssignment_1_210918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNop_in_rule__Command__NopAssignment_010949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_rule__Command__AffectAssignment_110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Command__WhAssignment_211011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Command__ForrAssignment_311042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Command__ForeAssignment_411073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Command__IffAssignment_511104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Assign__EAssignment_011135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Assign__LAssignment_111166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Assign__CAssignment_311197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_rule__Assign__NAssignment_411228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__LlAssignment_111259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__While__EeAssignment_211290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__CcAssignment_311321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__ZAssignment_511352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__While__KAssignment_611383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__While__LcAssignment_711414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__CcAssignment_111445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__For__HhAssignment_211476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__TtAssignment_311507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__VvAssignment_511538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__For__C1Assignment_611569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__For__SsAssignment_711600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__MmAssignment_111631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__If__JjAssignment_211662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__KkAssignment_311693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__HgAssignment_511724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__C2Assignment_611755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__GgAssignment_711786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__FfAssignment_8_111817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__If__OAssignment_8_211848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__If__DdAssignment_8_311879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__SqAssignment_111910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__Foreach__WxAssignment_211941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__LcAssignment_311972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc2Assignment_512003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__Foreach__E1Assignment_612034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc3Assignment_712065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc4Assignment_912096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Foreach__C3Assignment_1012127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Foreach__Lc5Assignment_1112158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__AAssignment_012189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__Vars__LAssignment_1_112220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__UAssignment_1_212251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPRS__FAssignment_012282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRS__LAssignment_1_112313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_rule__EXPRS__E2Assignment_1_212344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPR__E1Assignment_012375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_rule__EXPR__ExAssignment_112406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EXPRSIMPLE__NilAssignment_012442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__EXPRSIMPLE__VAssignment_112481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SymAssignment_212512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__MotAlternatives_3_1_0_in_rule__EXPRSIMPLE__MotAssignment_3_112543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__LexAssignment_3_212576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRSIMPLE__MotAlternatives_4_1_0_in_rule__EXPRSIMPLE__MotAssignment_4_112607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRSIMPLE__LAssignment_4_212640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPRSIMPLE__ExAssignment_4_312671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__EXPRSIMPLE__SymAssignment_5_112702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__EXPRSIMPLE__LexAssignment_5_212733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__LEXPR__FAssignment_012764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__LEXPR__NAssignment_112795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_rule__LEXPR__TAssignment_212826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_rule__EXPRAND__FAssignment_012857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRAND__Lc1Assignment_1_012888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRAND__Lc2Assignment_1_212919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_rule__EXPRAND__EeAssignment_1_312950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_rule__EXPROR__E1Assignment_012981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPROR__Lc1Assignment_1_013012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPROR__Lc2Assignment_1_213043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_rule__EXPROR__E2Assignment_1_313074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPRNOT__Lc1Assignment_0_113105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_rule__EXPRNOT__E1Assignment_113136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__E1Assignment_0_013167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPREQ__CccAssignment_0_113198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_rule__EXPREQ__Lc2Assignment_0_313229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_rule__EXPREQ__WAssignment_0_413260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_rule__EXPREQ__ExAssignment_1_113291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LCs__LAssignment13323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LC__AAssignment_013354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LC__ZAssignment_113385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LC__EAssignment_213416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LC__RAssignment_313447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPR__E1Assignment_0_in_synpred10_InternalLangage_while1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPREQ__Group_0__0_in_synpred18_InternalLangage_while2035 = new BitSet(new long[]{0x0000000000000002L});

}