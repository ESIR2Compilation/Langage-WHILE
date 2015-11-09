package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.Langage_whileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLangage_whileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CR", "RULE_SYM", "RULE_VAR", "RULE_SP", "RULE_TAB", "RULE_LF", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
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
    public String getGrammarFileName() { return "../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private Langage_whileGrammarAccess grammarAccess;
     	
        public InternalLangage_whileParser(TokenStream input, Langage_whileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Langage_whileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:82:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:85:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:87:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:87:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:88:3: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel136);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_0_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:112:1: entryRuleGreeting returns [String current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final String entryRuleGreeting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGreeting = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:113:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:114:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting173);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting184); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:121:1: ruleGreeting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Program_0= ruleProgram ;
    public final AntlrDatatypeRuleToken ruleGreeting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Program_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:124:28: (this_Program_0= ruleProgram )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:126:5: this_Program_0= ruleProgram
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGreetingAccess().getProgramParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleProgram_in_ruleGreeting230);
            this_Program_0=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Program_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:144:1: entryRuleProgram returns [String current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final String entryRuleProgram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProgram = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:145:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:146:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram275);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:153:1: ruleProgram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Function_0= ruleFunction (this_CR_1= RULE_CR this_Program_2= ruleProgram )? ) ;
    public final AntlrDatatypeRuleToken ruleProgram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CR_1=null;
        AntlrDatatypeRuleToken this_Function_0 = null;

        AntlrDatatypeRuleToken this_Program_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:156:28: ( (this_Function_0= ruleFunction (this_CR_1= RULE_CR this_Program_2= ruleProgram )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:157:1: (this_Function_0= ruleFunction (this_CR_1= RULE_CR this_Program_2= ruleProgram )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:157:1: (this_Function_0= ruleFunction (this_CR_1= RULE_CR this_Program_2= ruleProgram )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:158:5: this_Function_0= ruleFunction (this_CR_1= RULE_CR this_Program_2= ruleProgram )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProgramAccess().getFunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFunction_in_ruleProgram333);
            this_Function_0=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Function_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:168:1: (this_CR_1= RULE_CR this_Program_2= ruleProgram )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:168:6: this_CR_1= RULE_CR this_Program_2= ruleProgram
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleProgram354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getProgramAccess().getCRTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getProgramAccess().getProgramParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProgram_in_ruleProgram381);
                    this_Program_2=ruleProgram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Program_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:194:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:195:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:196:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction429);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction440); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:203:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_LCs_1= ruleLCs this_SYM_2= RULE_SYM kw= ':' this_LCs_4= ruleLCs this_Def_5= ruleDef ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SYM_2=null;
        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_LCs_4 = null;

        AntlrDatatypeRuleToken this_Def_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:206:28: ( (kw= 'function' this_LCs_1= ruleLCs this_SYM_2= RULE_SYM kw= ':' this_LCs_4= ruleLCs this_Def_5= ruleDef ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:207:1: (kw= 'function' this_LCs_1= ruleLCs this_SYM_2= RULE_SYM kw= ':' this_LCs_4= ruleLCs this_Def_5= ruleDef )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:207:1: (kw= 'function' this_LCs_1= ruleLCs this_SYM_2= RULE_SYM kw= ':' this_LCs_4= ruleLCs this_Def_5= ruleDef )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:208:2: kw= 'function' this_LCs_1= ruleLCs this_SYM_2= RULE_SYM kw= ':' this_LCs_4= ruleLCs this_Def_5= ruleDef
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleFunction478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionAccess().getLCsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleFunction500);
            this_LCs_1=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_SYM_2=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleFunction520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SYM_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SYM_2, grammarAccess.getFunctionAccess().getSYMTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,19,FOLLOW_19_in_ruleFunction538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFunctionAccess().getColonKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionAccess().getLCsParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleFunction560);
            this_LCs_4=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionAccess().getDefParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleDef_in_ruleFunction587);
            this_Def_5=ruleDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Def_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDef"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:267:1: entryRuleDef returns [String current=null] : iv_ruleDef= ruleDef EOF ;
    public final String entryRuleDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDef = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:268:2: (iv_ruleDef= ruleDef EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:269:2: iv_ruleDef= ruleDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRule()); 
            }
            pushFollow(FOLLOW_ruleDef_in_entryRuleDef633);
            iv_ruleDef=ruleDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDef.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDef644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:276:1: ruleDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'read' this_LCs_1= ruleLCs this_Input_2= ruleInput this_LCs_3= ruleLCs kw= '%' this_Commands_5= ruleCommands this_LCs_6= ruleLCs kw= '%' kw= 'write' this_LCs_9= ruleLCs this_Output_10= ruleOutput ) ;
    public final AntlrDatatypeRuleToken ruleDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_Input_2 = null;

        AntlrDatatypeRuleToken this_LCs_3 = null;

        AntlrDatatypeRuleToken this_Commands_5 = null;

        AntlrDatatypeRuleToken this_LCs_6 = null;

        AntlrDatatypeRuleToken this_LCs_9 = null;

        AntlrDatatypeRuleToken this_Output_10 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:279:28: ( (kw= 'read' this_LCs_1= ruleLCs this_Input_2= ruleInput this_LCs_3= ruleLCs kw= '%' this_Commands_5= ruleCommands this_LCs_6= ruleLCs kw= '%' kw= 'write' this_LCs_9= ruleLCs this_Output_10= ruleOutput ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:280:1: (kw= 'read' this_LCs_1= ruleLCs this_Input_2= ruleInput this_LCs_3= ruleLCs kw= '%' this_Commands_5= ruleCommands this_LCs_6= ruleLCs kw= '%' kw= 'write' this_LCs_9= ruleLCs this_Output_10= ruleOutput )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:280:1: (kw= 'read' this_LCs_1= ruleLCs this_Input_2= ruleInput this_LCs_3= ruleLCs kw= '%' this_Commands_5= ruleCommands this_LCs_6= ruleLCs kw= '%' kw= 'write' this_LCs_9= ruleLCs this_Output_10= ruleOutput )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:281:2: kw= 'read' this_LCs_1= ruleLCs this_Input_2= ruleInput this_LCs_3= ruleLCs kw= '%' this_Commands_5= ruleCommands this_LCs_6= ruleLCs kw= '%' kw= 'write' this_LCs_9= ruleLCs this_Output_10= ruleOutput
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleDef682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDefAccess().getReadKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getLCsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleDef704);
            this_LCs_1=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getInputParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleInput_in_ruleDef731);
            this_Input_2=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Input_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getLCsParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleDef758);
            this_LCs_3=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleDef776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDefAccess().getPercentSignKeyword_4()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getCommandsParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleDef798);
            this_Commands_5=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Commands_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getLCsParserRuleCall_6()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleDef825);
            this_LCs_6=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_6);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleDef843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDefAccess().getPercentSignKeyword_7()); 
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruleDef856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDefAccess().getWriteKeyword_8()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getLCsParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleDef878);
            this_LCs_9=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_9);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefAccess().getOutputParserRuleCall_10()); 
                  
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleDef905);
            this_Output_10=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Output_10);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:389:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:390:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:391:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput951);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:398:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput ) | this_VAR_4= RULE_VAR ) ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        Token this_VAR_4=null;
        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_Input_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:401:28: ( ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput ) | this_VAR_4= RULE_VAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:402:1: ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput ) | this_VAR_4= RULE_VAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:402:1: ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput ) | this_VAR_4= RULE_VAR )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VAR) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_CR||(LA3_1>=RULE_SP && LA3_1<=RULE_LF)||LA3_1==21) ) {
                    alt3=2;
                }
                else if ( (LA3_1==23) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:402:2: (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:402:2: (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:402:7: this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Input_3= ruleInput
                    {
                    this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput1003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VAR_0, grammarAccess.getInputAccess().getVARTerminalRuleCall_0_0()); 
                          
                    }
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleInput1021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputAccess().getLCsParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleInput1043);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputAccess().getInputParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInput_in_ruleInput1070);
                    this_Input_3=ruleInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Input_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:438:10: this_VAR_4= RULE_VAR
                    {
                    this_VAR_4=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput1097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VAR_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VAR_4, grammarAccess.getInputAccess().getVARTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:453:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:454:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:455:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput1143);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput1154); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:462:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput ) | this_VAR_4= RULE_VAR ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        Token this_VAR_4=null;
        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_Output_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:465:28: ( ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput ) | this_VAR_4= RULE_VAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:466:1: ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput ) | this_VAR_4= RULE_VAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:466:1: ( (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput ) | this_VAR_4= RULE_VAR )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_VAR) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_CR||LA4_1==18) ) {
                    alt4=2;
                }
                else if ( (LA4_1==23) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:466:2: (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:466:2: (this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:466:7: this_VAR_0= RULE_VAR kw= ',' this_LCs_2= ruleLCs this_Output_3= ruleOutput
                    {
                    this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput1195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VAR_0, grammarAccess.getOutputAccess().getVARTerminalRuleCall_0_0()); 
                          
                    }
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOutput1213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOutputAccess().getLCsParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleOutput1235);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOutputAccess().getOutputParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutput_in_ruleOutput1262);
                    this_Output_3=ruleOutput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Output_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:502:10: this_VAR_4= RULE_VAR
                    {
                    this_VAR_4=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput1289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VAR_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VAR_4, grammarAccess.getOutputAccess().getVARTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:517:1: entryRuleCommands returns [String current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final String entryRuleCommands() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommands = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:518:2: (iv_ruleCommands= ruleCommands EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:519:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands1335);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands1346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:526:1: ruleCommands returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Command_0= ruleCommand (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )? ) ;
    public final AntlrDatatypeRuleToken ruleCommands() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Command_0 = null;

        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_Commands_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:529:28: ( (this_Command_0= ruleCommand (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:530:1: (this_Command_0= ruleCommand (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:530:1: (this_Command_0= ruleCommand (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:531:5: this_Command_0= ruleCommand (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommandsAccess().getCommandParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommands1393);
            this_Command_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Command_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:541:1: (kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:542:2: kw= ';' this_LCs_2= ruleLCs this_Commands_3= ruleCommands
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleCommands1412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandsAccess().getLCsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommands1434);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandsAccess().getCommandsParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommands1461);
                    this_Commands_3=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commands_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:577:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:578:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:579:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1509);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:586:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nop' | (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS ) | (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' ) | (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' ) | (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' ) | (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' ) ) ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Vars_1 = null;

        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_LCs_4 = null;

        AntlrDatatypeRuleToken this_EXPRS_5 = null;

        AntlrDatatypeRuleToken this_LCs_7 = null;

        AntlrDatatypeRuleToken this_EXPR_8 = null;

        AntlrDatatypeRuleToken this_LCs_9 = null;

        AntlrDatatypeRuleToken this_LCs_11 = null;

        AntlrDatatypeRuleToken this_Commands_12 = null;

        AntlrDatatypeRuleToken this_LCs_13 = null;

        AntlrDatatypeRuleToken this_LCs_16 = null;

        AntlrDatatypeRuleToken this_EXPR_17 = null;

        AntlrDatatypeRuleToken this_LCs_18 = null;

        AntlrDatatypeRuleToken this_LCs_20 = null;

        AntlrDatatypeRuleToken this_Commands_21 = null;

        AntlrDatatypeRuleToken this_LCs_22 = null;

        AntlrDatatypeRuleToken this_LCs_25 = null;

        AntlrDatatypeRuleToken this_EXPR_26 = null;

        AntlrDatatypeRuleToken this_LCs_27 = null;

        AntlrDatatypeRuleToken this_LCs_29 = null;

        AntlrDatatypeRuleToken this_Commands_30 = null;

        AntlrDatatypeRuleToken this_LCs_31 = null;

        AntlrDatatypeRuleToken this_LCs_33 = null;

        AntlrDatatypeRuleToken this_Commands_34 = null;

        AntlrDatatypeRuleToken this_LCs_35 = null;

        AntlrDatatypeRuleToken this_LCs_38 = null;

        AntlrDatatypeRuleToken this_EXPR_39 = null;

        AntlrDatatypeRuleToken this_LCs_40 = null;

        AntlrDatatypeRuleToken this_LCs_42 = null;

        AntlrDatatypeRuleToken this_EXPR_43 = null;

        AntlrDatatypeRuleToken this_LCs_44 = null;

        AntlrDatatypeRuleToken this_LCs_46 = null;

        AntlrDatatypeRuleToken this_Commands_47 = null;

        AntlrDatatypeRuleToken this_LCs_48 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:589:28: ( (kw= 'nop' | (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS ) | (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' ) | (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' ) | (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' ) | (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:590:1: (kw= 'nop' | (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS ) | (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' ) | (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' ) | (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' ) | (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:590:1: (kw= 'nop' | (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS ) | (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' ) | (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' ) | (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' ) | (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case RULE_VAR:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 31:
                {
                alt7=5;
                }
                break;
            case 35:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:591:2: kw= 'nop'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleCommand1558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getNopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:597:6: (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:597:6: (this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:598:5: this_Vars_1= ruleVars this_LCs_2= ruleLCs kw= ':=' this_LCs_4= ruleLCs this_EXPRS_5= ruleEXPRS
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommand1587);
                    this_Vars_1=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Vars_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1614);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCommand1632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1654);
                    this_LCs_4=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRSParserRuleCall_1_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRS_in_ruleCommand1681);
                    this_EXPRS_5=ruleEXPRS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRS_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:648:6: (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:648:6: (kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:649:2: kw= 'while' this_LCs_7= ruleLCs this_EXPR_8= ruleEXPR this_LCs_9= ruleLCs kw= 'do' this_LCs_11= ruleLCs this_Commands_12= ruleCommands this_LCs_13= ruleLCs kw= 'od'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCommand1707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getWhileKeyword_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1729);
                    this_LCs_7=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleCommand1756);
                    this_EXPR_8=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_2_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1783);
                    this_LCs_9=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCommand1801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_2_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1823);
                    this_LCs_11=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_2_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1850);
                    this_Commands_12=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commands_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_2_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1877);
                    this_LCs_13=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCommand1895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:733:6: (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:733:6: (kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:734:2: kw= 'for' this_LCs_16= ruleLCs this_EXPR_17= ruleEXPR this_LCs_18= ruleLCs kw= 'do' this_LCs_20= ruleLCs this_Commands_21= ruleCommands this_LCs_22= ruleLCs kw= 'od'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleCommand1916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getForKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1938);
                    this_LCs_16=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleCommand1965);
                    this_EXPR_17=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_3_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand1992);
                    this_LCs_18=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCommand2010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_3_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2032);
                    this_LCs_20=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_3_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand2059);
                    this_Commands_21=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commands_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2086);
                    this_LCs_22=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCommand2104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:818:6: (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:818:6: (kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:819:2: kw= 'if' this_LCs_25= ruleLCs this_EXPR_26= ruleEXPR this_LCs_27= ruleLCs kw= 'then' this_LCs_29= ruleLCs this_Commands_30= ruleCommands this_LCs_31= ruleLCs (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )? kw= 'fi'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCommand2125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getIfKeyword_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2147);
                    this_LCs_25=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_25);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleCommand2174);
                    this_EXPR_26=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_26);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2201);
                    this_LCs_27=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_27);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCommand2219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getThenKeyword_4_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2241);
                    this_LCs_29=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_29);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_4_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand2268);
                    this_Commands_30=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commands_30);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2295);
                    this_LCs_31=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_31);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:896:1: (kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==33) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:897:2: kw= 'else' this_LCs_33= ruleLCs this_Commands_34= ruleCommands this_LCs_35= ruleLCs
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleCommand2314); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getCommandAccess().getElseKeyword_4_8_0()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_8_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLCs_in_ruleCommand2336);
                            this_LCs_33=ruleLCs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LCs_33);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_4_8_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleCommands_in_ruleCommand2363);
                            this_Commands_34=ruleCommands();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Commands_34);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_4_8_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLCs_in_ruleCommand2390);
                            this_LCs_35=ruleLCs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LCs_35);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCommand2410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getFiKeyword_4_9()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:942:6: (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:942:6: (kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:943:2: kw= 'foreach' this_LCs_38= ruleLCs this_EXPR_39= ruleEXPR this_LCs_40= ruleLCs kw= 'in' this_LCs_42= ruleLCs this_EXPR_43= ruleEXPR this_LCs_44= ruleLCs kw= 'do' this_LCs_46= ruleLCs this_Commands_47= ruleCommands this_LCs_48= ruleLCs kw= 'od'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCommand2431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getForeachKeyword_5_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2453);
                    this_LCs_38=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_38);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleCommand2480);
                    this_EXPR_39=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_39);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2507);
                    this_LCs_40=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_40);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCommand2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getInKeyword_5_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2547);
                    this_LCs_42=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_42);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getEXPRParserRuleCall_5_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleCommand2574);
                    this_EXPR_43=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_43);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2601);
                    this_LCs_44=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_44);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCommand2619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getDoKeyword_5_8()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2641);
                    this_LCs_46=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_46);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_5_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand2668);
                    this_Commands_47=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commands_47);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getLCsParserRuleCall_5_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleCommand2695);
                    this_LCs_48=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_48);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCommand2713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandAccess().getOdKeyword_5_12()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1073:1: entryRuleVars returns [String current=null] : iv_ruleVars= ruleVars EOF ;
    public final String entryRuleVars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVars = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1074:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1075:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars2755);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars2766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1082:1: ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )? ) ;
    public final AntlrDatatypeRuleToken ruleVars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_Vars_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1085:28: ( (this_VAR_0= RULE_VAR (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1086:1: (this_VAR_0= RULE_VAR (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1086:1: (this_VAR_0= RULE_VAR (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1086:6: this_VAR_0= RULE_VAR (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )?
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars2806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VAR_0, grammarAccess.getVarsAccess().getVARTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1093:1: (kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1094:2: kw= ',' this_LCs_2= ruleLCs this_Vars_3= ruleVars
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleVars2825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarsAccess().getLCsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleVars2847);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleVars2874);
                    this_Vars_3=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Vars_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleEXPRS"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1129:1: entryRuleEXPRS returns [String current=null] : iv_ruleEXPRS= ruleEXPRS EOF ;
    public final String entryRuleEXPRS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPRS = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1130:2: (iv_ruleEXPRS= ruleEXPRS EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1131:2: iv_ruleEXPRS= ruleEXPRS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRSRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRS_in_entryRuleEXPRS2922);
            iv_ruleEXPRS=ruleEXPRS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRS.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRS2933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRS"


    // $ANTLR start "ruleEXPRS"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1138:1: ruleEXPRS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPR_0= ruleEXPR (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )? ) ;
    public final AntlrDatatypeRuleToken ruleEXPRS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EXPR_0 = null;

        AntlrDatatypeRuleToken this_LCs_2 = null;

        AntlrDatatypeRuleToken this_EXPRS_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1141:28: ( (this_EXPR_0= ruleEXPR (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1142:1: (this_EXPR_0= ruleEXPR (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1142:1: (this_EXPR_0= ruleEXPR (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1143:5: this_EXPR_0= ruleEXPR (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRSAccess().getEXPRParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEXPR_in_ruleEXPRS2980);
            this_EXPR_0=ruleEXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1153:1: (kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1154:2: kw= ',' this_LCs_2= ruleLCs this_EXPRS_3= ruleEXPRS
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleEXPRS2999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRSAccess().getCommaKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRSAccess().getLCsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPRS3021);
                    this_LCs_2=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRSAccess().getEXPRSParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRS_in_ruleEXPRS3048);
                    this_EXPRS_3=ruleEXPRS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRS_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRS"


    // $ANTLR start "entryRuleEXPR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1189:1: entryRuleEXPR returns [String current=null] : iv_ruleEXPR= ruleEXPR EOF ;
    public final String entryRuleEXPR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPR = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1190:2: (iv_ruleEXPR= ruleEXPR EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1191:2: iv_ruleEXPR= ruleEXPR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleEXPR_in_entryRuleEXPR3096);
            iv_ruleEXPR=ruleEXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPR.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPR3107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPR"


    // $ANTLR start "ruleEXPR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1198:1: ruleEXPR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPRSIMPLE_0= ruleEXPRSIMPLE | this_EXPRAND_1= ruleEXPRAND ) ;
    public final AntlrDatatypeRuleToken ruleEXPR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EXPRSIMPLE_0 = null;

        AntlrDatatypeRuleToken this_EXPRAND_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1201:28: ( (this_EXPRSIMPLE_0= ruleEXPRSIMPLE | this_EXPRAND_1= ruleEXPRAND ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1202:1: (this_EXPRSIMPLE_0= ruleEXPRSIMPLE | this_EXPRAND_1= ruleEXPRAND )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1202:1: (this_EXPRSIMPLE_0= ruleEXPRSIMPLE | this_EXPRAND_1= ruleEXPRAND )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred14_InternalLangage_while()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred14_InternalLangage_while()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred14_InternalLangage_while()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred14_InternalLangage_while()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1203:5: this_EXPRSIMPLE_0= ruleEXPRSIMPLE
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRAccess().getEXPRSIMPLEParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRSIMPLE_in_ruleEXPR3154);
                    this_EXPRSIMPLE_0=ruleEXPRSIMPLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRSIMPLE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1215:5: this_EXPRAND_1= ruleEXPRAND
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRAccess().getEXPRANDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRAND_in_ruleEXPR3187);
                    this_EXPRAND_1=ruleEXPRAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRAND_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPR"


    // $ANTLR start "entryRuleEXPRSIMPLE"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1233:1: entryRuleEXPRSIMPLE returns [String current=null] : iv_ruleEXPRSIMPLE= ruleEXPRSIMPLE EOF ;
    public final String entryRuleEXPRSIMPLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPRSIMPLE = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1234:2: (iv_ruleEXPRSIMPLE= ruleEXPRSIMPLE EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1235:2: iv_ruleEXPRSIMPLE= ruleEXPRSIMPLE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRSIMPLERule()); 
            }
            pushFollow(FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE3233);
            iv_ruleEXPRSIMPLE=ruleEXPRSIMPLE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRSIMPLE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRSIMPLE3244); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRSIMPLE"


    // $ANTLR start "ruleEXPRSIMPLE"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1242:1: ruleEXPRSIMPLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM ) | ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) ) | ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) ) | (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleEXPRSIMPLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VAR_1=null;
        Token this_SYM_2=null;
        Token this_SYM_22=null;
        AntlrDatatypeRuleToken this_LEXPR_5 = null;

        AntlrDatatypeRuleToken this_LEXPR_9 = null;

        AntlrDatatypeRuleToken this_LCs_13 = null;

        AntlrDatatypeRuleToken this_EXPR_14 = null;

        AntlrDatatypeRuleToken this_LCs_18 = null;

        AntlrDatatypeRuleToken this_EXPR_19 = null;

        AntlrDatatypeRuleToken this_LEXPR_23 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1245:28: ( ( (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM ) | ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) ) | ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) ) | (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1246:1: ( (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM ) | ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) ) | ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) ) | (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1246:1: ( (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM ) | ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) ) | ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) ) | (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SYM && LA14_0<=RULE_VAR)||LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                switch ( input.LA(2) ) {
                case 39:
                case 41:
                    {
                    alt14=2;
                    }
                    break;
                case RULE_SYM:
                    {
                    alt14=4;
                    }
                    break;
                case 42:
                case 43:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1246:2: (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1246:2: (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_VAR:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_SYM:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1247:2: kw= 'nil'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleEXPRSIMPLE3283); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getNilKeyword_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1253:10: this_VAR_1= RULE_VAR
                            {
                            this_VAR_1=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleEXPRSIMPLE3304); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_VAR_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_VAR_1, grammarAccess.getEXPRSIMPLEAccess().getVARTerminalRuleCall_0_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1261:10: this_SYM_2= RULE_SYM
                            {
                            this_SYM_2=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleEXPRSIMPLE3330); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_SYM_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SYM_2, grammarAccess.getEXPRSIMPLEAccess().getSYMTerminalRuleCall_0_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1269:6: ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1269:6: ( (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' ) | (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==38) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==41) ) {
                            alt12=2;
                        }
                        else if ( (LA12_1==39) ) {
                            alt12=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1269:7: (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' )
                            {
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1269:7: (kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')' )
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1270:2: kw= '(' kw= 'cons' this_LEXPR_5= ruleLEXPR kw= ')'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPRSIMPLE3357); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_1_0_0()); 
                                  
                            }
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleEXPRSIMPLE3370); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getConsKeyword_1_0_1()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getLEXPRParserRuleCall_1_0_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3392);
                            this_LEXPR_5=ruleLEXPR();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LEXPR_5);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPRSIMPLE3410); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_1_0_3()); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1299:6: (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' )
                            {
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1299:6: (kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')' )
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1300:2: kw= '(' kw= 'list' this_LEXPR_9= ruleLEXPR kw= ')'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPRSIMPLE3431); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_1_1_0()); 
                                  
                            }
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleEXPRSIMPLE3444); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getListKeyword_1_1_1()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getLEXPRParserRuleCall_1_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3466);
                            this_LEXPR_9=ruleLEXPR();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LEXPR_9);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPRSIMPLE3484); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_1_1_3()); 
                                  
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1329:6: ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1329:6: ( (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' ) | (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==38) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==42) ) {
                            alt13=1;
                        }
                        else if ( (LA13_1==43) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1329:7: (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' )
                            {
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1329:7: (kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')' )
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1330:2: kw= '(' kw= 'hd' this_LCs_13= ruleLCs this_EXPR_14= ruleEXPR kw= ')'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPRSIMPLE3507); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_2_0_0()); 
                                  
                            }
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleEXPRSIMPLE3520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getHdKeyword_2_0_1()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getLCsParserRuleCall_2_0_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLCs_in_ruleEXPRSIMPLE3542);
                            this_LCs_13=ruleLCs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LCs_13);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getEXPRParserRuleCall_2_0_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleEXPR_in_ruleEXPRSIMPLE3569);
                            this_EXPR_14=ruleEXPR();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_EXPR_14);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPRSIMPLE3587); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_2_0_4()); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1370:6: (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' )
                            {
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1370:6: (kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')' )
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1371:2: kw= '(' kw= 'tl' this_LCs_18= ruleLCs this_EXPR_19= ruleEXPR kw= ')'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPRSIMPLE3608); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_2_1_0()); 
                                  
                            }
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleEXPRSIMPLE3621); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getTlKeyword_2_1_1()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getLCsParserRuleCall_2_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLCs_in_ruleEXPRSIMPLE3643);
                            this_LCs_18=ruleLCs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LCs_18);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getEXPRParserRuleCall_2_1_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleEXPR_in_ruleEXPRSIMPLE3670);
                            this_EXPR_19=ruleEXPR();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_EXPR_19);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPRSIMPLE3688); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_2_1_4()); 
                                  
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1411:6: (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1411:6: (kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1412:2: kw= '(' this_SYM_22= RULE_SYM this_LEXPR_23= ruleLEXPR kw= ')'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPRSIMPLE3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getLeftParenthesisKeyword_3_0()); 
                          
                    }
                    this_SYM_22=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleEXPRSIMPLE3725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYM_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYM_22, grammarAccess.getEXPRSIMPLEAccess().getSYMTerminalRuleCall_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRSIMPLEAccess().getLEXPRParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3752);
                    this_LEXPR_23=ruleLEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LEXPR_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPRSIMPLE3770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRSIMPLEAccess().getRightParenthesisKeyword_3_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRSIMPLE"


    // $ANTLR start "entryRuleLEXPR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1449:1: entryRuleLEXPR returns [String current=null] : iv_ruleLEXPR= ruleLEXPR EOF ;
    public final String entryRuleLEXPR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXPR = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1450:2: (iv_ruleLEXPR= ruleLEXPR EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1451:2: iv_ruleLEXPR= ruleLEXPR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLEXPRRule()); 
            }
            pushFollow(FOLLOW_ruleLEXPR_in_entryRuleLEXPR3812);
            iv_ruleLEXPR=ruleLEXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLEXPR.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEXPR3823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLEXPR"


    // $ANTLR start "ruleLEXPR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1458:1: ruleLEXPR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LCs_0= ruleLCs this_EXPR_1= ruleEXPR (this_LEXPR_2= ruleLEXPR )? ) ;
    public final AntlrDatatypeRuleToken ruleLEXPR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LCs_0 = null;

        AntlrDatatypeRuleToken this_EXPR_1 = null;

        AntlrDatatypeRuleToken this_LEXPR_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1461:28: ( (this_LCs_0= ruleLCs this_EXPR_1= ruleEXPR (this_LEXPR_2= ruleLEXPR )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1462:1: (this_LCs_0= ruleLCs this_EXPR_1= ruleEXPR (this_LEXPR_2= ruleLEXPR )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1462:1: (this_LCs_0= ruleLCs this_EXPR_1= ruleEXPR (this_LEXPR_2= ruleLEXPR )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1463:5: this_LCs_0= ruleLCs this_EXPR_1= ruleEXPR (this_LEXPR_2= ruleLEXPR )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLEXPRAccess().getLCsParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLCs_in_ruleLEXPR3870);
            this_LCs_0=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LCs_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLEXPRAccess().getEXPRParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEXPR_in_ruleLEXPR3897);
            this_EXPR_1=ruleEXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPR_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1484:1: (this_LEXPR_2= ruleLEXPR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_CR && LA15_0<=RULE_LF)||(LA15_0>=37 && LA15_0<=38)||LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1485:5: this_LEXPR_2= ruleLEXPR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLEXPRAccess().getLEXPRParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLEXPR_in_ruleLEXPR3925);
                    this_LEXPR_2=ruleLEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LEXPR_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEXPR"


    // $ANTLR start "entryRuleEXPRAND"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1503:1: entryRuleEXPRAND returns [String current=null] : iv_ruleEXPRAND= ruleEXPRAND EOF ;
    public final String entryRuleEXPRAND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPRAND = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1504:2: (iv_ruleEXPRAND= ruleEXPRAND EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1505:2: iv_ruleEXPRAND= ruleEXPRAND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRANDRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND3973);
            iv_ruleEXPRAND=ruleEXPRAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRAND.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRAND3984); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRAND"


    // $ANTLR start "ruleEXPRAND"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1512:1: ruleEXPRAND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPROR_0= ruleEXPROR (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )? ) ;
    public final AntlrDatatypeRuleToken ruleEXPRAND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EXPROR_0 = null;

        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_LCs_3 = null;

        AntlrDatatypeRuleToken this_EXPRAND_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1515:28: ( (this_EXPROR_0= ruleEXPROR (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1516:1: (this_EXPROR_0= ruleEXPROR (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1516:1: (this_EXPROR_0= ruleEXPROR (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1517:5: this_EXPROR_0= ruleEXPROR (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRANDAccess().getEXPRORParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEXPROR_in_ruleEXPRAND4031);
            this_EXPROR_0=ruleEXPROR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPROR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1527:1: (this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==44) ) {
                        alt16=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==44) ) {
                        alt16=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==44) ) {
                        alt16=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (LA16_4==44) ) {
                        alt16=1;
                    }
                    }
                    break;
                case 44:
                    {
                    alt16=1;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1528:5: this_LCs_1= ruleLCs kw= 'and' this_LCs_3= ruleLCs this_EXPRAND_4= ruleEXPRAND
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRANDAccess().getLCsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPRAND4059);
                    this_LCs_1=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleEXPRAND4077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRANDAccess().getAndKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRANDAccess().getLCsParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPRAND4099);
                    this_LCs_3=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRANDAccess().getEXPRANDParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRAND_in_ruleEXPRAND4126);
                    this_EXPRAND_4=ruleEXPRAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRAND_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRAND"


    // $ANTLR start "entryRuleEXPROR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1574:1: entryRuleEXPROR returns [String current=null] : iv_ruleEXPROR= ruleEXPROR EOF ;
    public final String entryRuleEXPROR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPROR = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1575:2: (iv_ruleEXPROR= ruleEXPROR EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1576:2: iv_ruleEXPROR= ruleEXPROR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRORRule()); 
            }
            pushFollow(FOLLOW_ruleEXPROR_in_entryRuleEXPROR4174);
            iv_ruleEXPROR=ruleEXPROR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPROR.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPROR4185); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPROR"


    // $ANTLR start "ruleEXPROR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1583:1: ruleEXPROR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPRNOT_0= ruleEXPRNOT (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )? ) ;
    public final AntlrDatatypeRuleToken ruleEXPROR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EXPRNOT_0 = null;

        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_LCs_3 = null;

        AntlrDatatypeRuleToken this_EXPROR_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1586:28: ( (this_EXPRNOT_0= ruleEXPRNOT (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )? ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1587:1: (this_EXPRNOT_0= ruleEXPRNOT (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )? )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1587:1: (this_EXPRNOT_0= ruleEXPRNOT (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1588:5: this_EXPRNOT_0= ruleEXPRNOT (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRORAccess().getEXPRNOTParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_ruleEXPROR4232);
            this_EXPRNOT_0=ruleEXPRNOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPRNOT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1598:1: (this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==45) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_CR:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==45) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_TAB:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==45) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_LF:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (LA17_4==45) ) {
                        alt17=1;
                    }
                    }
                    break;
                case 45:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1599:5: this_LCs_1= ruleLCs kw= 'or' this_LCs_3= ruleLCs this_EXPROR_4= ruleEXPROR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRORAccess().getLCsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPROR4260);
                    this_LCs_1=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleEXPROR4278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRORAccess().getOrKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRORAccess().getLCsParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPROR4300);
                    this_LCs_3=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRORAccess().getEXPRORParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPROR_in_ruleEXPROR4327);
                    this_EXPROR_4=ruleEXPROR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPROR_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPROR"


    // $ANTLR start "entryRuleEXPRNOT"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1645:1: entryRuleEXPRNOT returns [String current=null] : iv_ruleEXPRNOT= ruleEXPRNOT EOF ;
    public final String entryRuleEXPRNOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPRNOT = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1646:2: (iv_ruleEXPRNOT= ruleEXPRNOT EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1647:2: iv_ruleEXPRNOT= ruleEXPRNOT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRNOTRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT4375);
            iv_ruleEXPRNOT=ruleEXPRNOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRNOT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRNOT4386); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRNOT"


    // $ANTLR start "ruleEXPRNOT"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1654:1: ruleEXPRNOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' this_LCs_1= ruleLCs )? this_EXPREQ_2= ruleEXPREQ ) ;
    public final AntlrDatatypeRuleToken ruleEXPRNOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_EXPREQ_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1657:28: ( ( (kw= 'not' this_LCs_1= ruleLCs )? this_EXPREQ_2= ruleEXPREQ ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1658:1: ( (kw= 'not' this_LCs_1= ruleLCs )? this_EXPREQ_2= ruleEXPREQ )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1658:1: ( (kw= 'not' this_LCs_1= ruleLCs )? this_EXPREQ_2= ruleEXPREQ )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1658:2: (kw= 'not' this_LCs_1= ruleLCs )? this_EXPREQ_2= ruleEXPREQ
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1658:2: (kw= 'not' this_LCs_1= ruleLCs )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1659:2: kw= 'not' this_LCs_1= ruleLCs
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleEXPRNOT4425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPRNOTAccess().getNotKeyword_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPRNOTAccess().getLCsParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPRNOT4447);
                    this_LCs_1=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRNOTAccess().getEXPREQParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_ruleEXPRNOT4476);
            this_EXPREQ_2=ruleEXPREQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPREQ_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRNOT"


    // $ANTLR start "entryRuleEXPREQ"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1694:1: entryRuleEXPREQ returns [String current=null] : iv_ruleEXPREQ= ruleEXPREQ EOF ;
    public final String entryRuleEXPREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPREQ = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1695:2: (iv_ruleEXPREQ= ruleEXPREQ EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1696:2: iv_ruleEXPREQ= ruleEXPREQ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPREQRule()); 
            }
            pushFollow(FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ4522);
            iv_ruleEXPREQ=ruleEXPREQ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPREQ.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPREQ4533); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPREQ"


    // $ANTLR start "ruleEXPREQ"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1703:1: ruleEXPREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE ) | (kw= '(' this_EXPR_6= ruleEXPR kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleEXPREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EXPRSIMPLE_0 = null;

        AntlrDatatypeRuleToken this_LCs_1 = null;

        AntlrDatatypeRuleToken this_LCs_3 = null;

        AntlrDatatypeRuleToken this_EXPRSIMPLE_4 = null;

        AntlrDatatypeRuleToken this_EXPR_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1706:28: ( ( (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE ) | (kw= '(' this_EXPR_6= ruleEXPR kw= ')' ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:1: ( (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE ) | (kw= '(' this_EXPR_6= ruleEXPR kw= ')' ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:1: ( (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE ) | (kw= '(' this_EXPR_6= ruleEXPR kw= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SYM && LA19_0<=RULE_VAR)||LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                switch ( input.LA(2) ) {
                case 39:
                case 41:
                case 42:
                case 43:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_VAR:
                case 37:
                case 38:
                case 46:
                    {
                    alt19=2;
                    }
                    break;
                case RULE_SYM:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_SP:
                        {
                        int LA19_5 = input.LA(4);

                        if ( ((LA19_5>=RULE_SYM && LA19_5<=RULE_VAR)||(LA19_5>=37 && LA19_5<=38)||LA19_5==46) ) {
                            alt19=1;
                        }
                        else if ( (LA19_5==47) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_CR:
                        {
                        int LA19_6 = input.LA(4);

                        if ( ((LA19_6>=RULE_SYM && LA19_6<=RULE_VAR)||(LA19_6>=37 && LA19_6<=38)||LA19_6==46) ) {
                            alt19=1;
                        }
                        else if ( (LA19_6==47) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_TAB:
                        {
                        int LA19_7 = input.LA(4);

                        if ( ((LA19_7>=RULE_SYM && LA19_7<=RULE_VAR)||(LA19_7>=37 && LA19_7<=38)||LA19_7==46) ) {
                            alt19=1;
                        }
                        else if ( (LA19_7==47) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_LF:
                        {
                        int LA19_8 = input.LA(4);

                        if ( ((LA19_8>=RULE_SYM && LA19_8<=RULE_VAR)||(LA19_8>=37 && LA19_8<=38)||LA19_8==46) ) {
                            alt19=1;
                        }
                        else if ( (LA19_8==47) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 40:
                    case 47:
                        {
                        alt19=2;
                        }
                        break;
                    case RULE_SYM:
                    case RULE_VAR:
                    case 37:
                    case 38:
                    case 46:
                        {
                        alt19=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:2: (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:2: (this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1708:5: this_EXPRSIMPLE_0= ruleEXPRSIMPLE this_LCs_1= ruleLCs kw= '=?' this_LCs_3= ruleLCs this_EXPRSIMPLE_4= ruleEXPRSIMPLE
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPREQAccess().getEXPRSIMPLEParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRSIMPLE_in_ruleEXPREQ4581);
                    this_EXPRSIMPLE_0=ruleEXPRSIMPLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRSIMPLE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPREQAccess().getLCsParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPREQ4608);
                    this_LCs_1=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleEXPREQ4626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPREQAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPREQAccess().getLCsParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleEXPREQ4648);
                    this_LCs_3=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPREQAccess().getEXPRSIMPLEParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRSIMPLE_in_ruleEXPREQ4675);
                    this_EXPRSIMPLE_4=ruleEXPRSIMPLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPRSIMPLE_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1758:6: (kw= '(' this_EXPR_6= ruleEXPR kw= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1758:6: (kw= '(' this_EXPR_6= ruleEXPR kw= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1759:2: kw= '(' this_EXPR_6= ruleEXPR kw= ')'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleEXPREQ4701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPREQAccess().getLeftParenthesisKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEXPREQAccess().getEXPRParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPR_in_ruleEXPREQ4723);
                    this_EXPR_6=ruleEXPR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPR_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleEXPREQ4741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEXPREQAccess().getRightParenthesisKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPREQ"


    // $ANTLR start "entryRuleLCs"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1795:1: entryRuleLCs returns [String current=null] : iv_ruleLCs= ruleLCs EOF ;
    public final String entryRuleLCs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLCs = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1796:2: (iv_ruleLCs= ruleLCs EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1797:2: iv_ruleLCs= ruleLCs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCsRule()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_entryRuleLCs4789);
            iv_ruleLCs=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLCs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCs4800); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLCs"


    // $ANTLR start "ruleLCs"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1804:1: ruleLCs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LC_0= ruleLC )? ;
    public final AntlrDatatypeRuleToken ruleLCs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LC_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1807:28: ( (this_LC_0= ruleLC )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1808:1: (this_LC_0= ruleLC )?
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1808:1: (this_LC_0= ruleLC )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_CR||(LA20_0>=RULE_SP && LA20_0<=RULE_LF)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1809:5: this_LC_0= ruleLC
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLCsAccess().getLCParserRuleCall()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleLCs4847);
                    this_LC_0=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLCs"


    // $ANTLR start "entryRuleLC"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1827:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1828:2: (iv_ruleLC= ruleLC EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1829:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC4894);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC4905); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1836:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF ) ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1839:28: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1840:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1840:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt21=1;
                }
                break;
            case RULE_CR:
                {
                alt21=2;
                }
                break;
            case RULE_TAB:
                {
                alt21=3;
                }
                break;
            case RULE_LF:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1840:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleLC4945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1848:10: this_CR_1= RULE_CR
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleLC4971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1856:10: this_TAB_2= RULE_TAB
                    {
                    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLC4997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TAB_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1864:10: this_LF_3= RULE_LF
                    {
                    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleLC5023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LF_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_3, grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLC"

    // $ANTLR start synpred14_InternalLangage_while
    public final void synpred14_InternalLangage_while_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_EXPRSIMPLE_0 = null;


        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1203:5: (this_EXPRSIMPLE_0= ruleEXPRSIMPLE )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1203:5: this_EXPRSIMPLE_0= ruleEXPRSIMPLE
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getEXPRAccess().getEXPRSIMPLEParserRuleCall_0()); 
              
        }
        pushFollow(FOLLOW_ruleEXPRSIMPLE_in_synpred14_InternalLangage_while3154);
        this_EXPRSIMPLE_0=ruleEXPRSIMPLE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalLangage_while

    // Delegated rules

    public final boolean synpred14_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLangage_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel136 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram333 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleProgram354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleProgram381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunction478 = new BitSet(new long[]{0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleFunction500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleFunction520 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction538 = new BitSet(new long[]{0x0000000000100390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleFunction560 = new BitSet(new long[]{0x0000000000100390L});
    public static final BitSet FOLLOW_ruleDef_in_ruleFunction587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_entryRuleDef633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDef644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDef682 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleDef704 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleInput_in_ruleDef731 = new BitSet(new long[]{0x0000000000200390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleDef758 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDef776 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleDef798 = new BitSet(new long[]{0x0000000000200390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleDef825 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDef843 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDef856 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleDef878 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleDef905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput1003 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInput1021 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleInput1043 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleInput_in_ruleInput1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput1195 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOutput1213 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleOutput1235 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleOutput1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands1393 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCommands1412 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommands1434 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommands1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCommand1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommand1587 = new BitSet(new long[]{0x0000000004000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1614 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommand1632 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1654 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPRS_in_ruleCommand1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommand1707 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1729 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleCommand1756 = new BitSet(new long[]{0x0000000010000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1783 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand1801 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1823 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1850 = new BitSet(new long[]{0x0000000020000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1877 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCommand1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCommand1916 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1938 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleCommand1965 = new BitSet(new long[]{0x0000000010000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand1992 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand2010 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2032 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2059 = new BitSet(new long[]{0x0000000020000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2086 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCommand2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommand2125 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2147 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleCommand2174 = new BitSet(new long[]{0x0000000100000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2201 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommand2219 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2241 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2268 = new BitSet(new long[]{0x0000000600000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2295 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleCommand2314 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2336 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2363 = new BitSet(new long[]{0x0000000400000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2390 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCommand2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCommand2431 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2453 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleCommand2480 = new BitSet(new long[]{0x0000001000000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2507 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCommand2525 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2547 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleCommand2574 = new BitSet(new long[]{0x0000000010000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2601 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand2619 = new BitSet(new long[]{0x00000008CA0003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2641 = new BitSet(new long[]{0x00000008CA000040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2668 = new BitSet(new long[]{0x0000000020000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleCommand2695 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCommand2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars2755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars2806 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleVars2825 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleVars2847 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVars_in_ruleVars2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRS_in_entryRuleEXPRS2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRS2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleEXPRS2980 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleEXPRS2999 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRS3021 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPRS_in_ruleEXPRS3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPR_in_entryRuleEXPR3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPR3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_ruleEXPR3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_ruleEXPR3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_entryRuleEXPRSIMPLE3233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRSIMPLE3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEXPRSIMPLE3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleEXPRSIMPLE3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleEXPRSIMPLE3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPRSIMPLE3357 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEXPRSIMPLE3370 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3392 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPRSIMPLE3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPRSIMPLE3431 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEXPRSIMPLE3444 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3466 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPRSIMPLE3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPRSIMPLE3507 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEXPRSIMPLE3520 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRSIMPLE3542 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleEXPRSIMPLE3569 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPRSIMPLE3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPRSIMPLE3608 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEXPRSIMPLE3621 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRSIMPLE3643 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleEXPRSIMPLE3670 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPRSIMPLE3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPRSIMPLE3710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleEXPRSIMPLE3725 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLEXPR_in_ruleEXPRSIMPLE3752 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPRSIMPLE3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEXPR_in_entryRuleLEXPR3812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEXPR3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleLEXPR3870 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleLEXPR3897 = new BitSet(new long[]{0x00004060000003F2L});
    public static final BitSet FOLLOW_ruleLEXPR_in_ruleLEXPR3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_entryRuleEXPRAND3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRAND3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_ruleEXPRAND4031 = new BitSet(new long[]{0x0000100000000392L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRAND4059 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEXPRAND4077 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRAND4099 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPRAND_in_ruleEXPRAND4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPROR_in_entryRuleEXPROR4174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPROR4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_ruleEXPROR4232 = new BitSet(new long[]{0x0000200000000392L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPROR4260 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEXPROR4278 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPROR4300 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPROR_in_ruleEXPROR4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRNOT_in_entryRuleEXPRNOT4375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRNOT4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEXPRNOT4425 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPRNOT4447 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_ruleEXPRNOT4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPREQ_in_entryRuleEXPREQ4522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPREQ4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_ruleEXPREQ4581 = new BitSet(new long[]{0x0000800000000390L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPREQ4608 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleEXPREQ4626 = new BitSet(new long[]{0x00000060000003F0L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleEXPREQ4648 = new BitSet(new long[]{0x0000006000000060L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_ruleEXPREQ4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEXPREQ4701 = new BitSet(new long[]{0x00004060000003F0L});
    public static final BitSet FOLLOW_ruleEXPR_in_ruleEXPREQ4723 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXPREQ4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_entryRuleLCs4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCs4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_ruleLCs4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC4894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleLC4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleLC4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLC4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleLC5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRSIMPLE_in_synpred14_InternalLangage_while3154 = new BitSet(new long[]{0x0000000000000002L});

}