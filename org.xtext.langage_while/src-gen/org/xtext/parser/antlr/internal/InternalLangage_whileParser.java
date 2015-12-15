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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BASEVAR", "RULE_CONF", "RULE_BASESYMB", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "'list'", "')'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_LF=10;
    public static final int RULE_CR=8;
    public static final int RULE_TAB=9;
    public static final int RULE_BASESYMB=6;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int RULE_SP=7;
    public static final int RULE_ID=11;
    public static final int RULE_CONF=5;
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
    public static final int RULE_BASEVAR=4;
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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:82:1: ruleModel returns [EObject current=null] : ( ( (lv_prog_0_0= ruleFunction ) ) ( ruleLC )? )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_prog_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:85:28: ( ( ( (lv_prog_0_0= ruleFunction ) ) ( ruleLC )? )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:1: ( ( (lv_prog_0_0= ruleFunction ) ) ( ruleLC )? )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:1: ( ( (lv_prog_0_0= ruleFunction ) ) ( ruleLC )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:2: ( (lv_prog_0_0= ruleFunction ) ) ( ruleLC )?
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:86:2: ( (lv_prog_0_0= ruleFunction ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:87:1: (lv_prog_0_0= ruleFunction )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:87:1: (lv_prog_0_0= ruleFunction )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:88:3: lv_prog_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProgFunctionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleModel137);
            	    lv_prog_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"prog",
            	              		lv_prog_0_0, 
            	              		"Function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:104:2: ( ruleLC )?
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	        case RULE_SP:
            	        case RULE_CR:
            	        case RULE_TAB:
            	        case RULE_LF:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        case EOF:
            	            {
            	            int LA1_2 = input.LA(2);

            	            if ( (synpred1_InternalLangage_while()) ) {
            	                alt1=1;
            	            }
            	            }
            	            break;
            	        case 18:
            	            {
            	            int LA1_3 = input.LA(2);

            	            if ( (synpred1_InternalLangage_while()) ) {
            	                alt1=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:105:2: ruleLC
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getModelAccess().getLCParserRuleCall_1()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleLC_in_ruleModel157);
            	            ruleLC();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:123:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:124:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:125:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction195);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction205); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:132:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ruleLC ( (lv_name_2_0= ruleSYMB ) ) otherlv_3= ':' ruleLC ( (lv_def_5_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;

        EObject lv_def_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:135:28: ( (otherlv_0= 'function' ruleLC ( (lv_name_2_0= ruleSYMB ) ) otherlv_3= ':' ruleLC ( (lv_def_5_0= ruleDefinition ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:136:1: (otherlv_0= 'function' ruleLC ( (lv_name_2_0= ruleSYMB ) ) otherlv_3= ':' ruleLC ( (lv_def_5_0= ruleDefinition ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:136:1: (otherlv_0= 'function' ruleLC ( (lv_name_2_0= ruleSYMB ) ) otherlv_3= ':' ruleLC ( (lv_def_5_0= ruleDefinition ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:136:3: otherlv_0= 'function' ruleLC ( (lv_name_2_0= ruleSYMB ) ) otherlv_3= ':' ruleLC ( (lv_def_5_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFunction242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFunction261);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:151:1: ( (lv_name_2_0= ruleSYMB ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:152:1: (lv_name_2_0= ruleSYMB )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:152:1: (lv_name_2_0= ruleSYMB )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:153:3: lv_name_2_0= ruleSYMB
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getNameSYMBParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSYMB_in_ruleFunction281);
            lv_name_2_0=ruleSYMB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"SYMB");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunction293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_3());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFunction312);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:184:1: ( (lv_def_5_0= ruleDefinition ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:185:1: (lv_def_5_0= ruleDefinition )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:185:1: (lv_def_5_0= ruleDefinition )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:186:3: lv_def_5_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getDefDefinitionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDefinition_in_ruleFunction332);
            lv_def_5_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_5_0, 
                      		"Definition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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


    // $ANTLR start "entryRuleDefinition"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:210:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:211:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:212:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition368);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition378); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:219:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ruleLC ( (lv_in_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ( (lv_com_5_0= ruleCommands ) ) ruleLC otherlv_7= '%' otherlv_8= 'write' ruleLC ( (lv_out_10_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_in_2_0 = null;

        EObject lv_com_5_0 = null;

        EObject lv_out_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:222:28: ( (otherlv_0= 'read' ruleLC ( (lv_in_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ( (lv_com_5_0= ruleCommands ) ) ruleLC otherlv_7= '%' otherlv_8= 'write' ruleLC ( (lv_out_10_0= ruleOutput ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:223:1: (otherlv_0= 'read' ruleLC ( (lv_in_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ( (lv_com_5_0= ruleCommands ) ) ruleLC otherlv_7= '%' otherlv_8= 'write' ruleLC ( (lv_out_10_0= ruleOutput ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:223:1: (otherlv_0= 'read' ruleLC ( (lv_in_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ( (lv_com_5_0= ruleCommands ) ) ruleLC otherlv_7= '%' otherlv_8= 'write' ruleLC ( (lv_out_10_0= ruleOutput ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:223:3: otherlv_0= 'read' ruleLC ( (lv_in_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ( (lv_com_5_0= ruleCommands ) ) ruleLC otherlv_7= '%' otherlv_8= 'write' ruleLC ( (lv_out_10_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDefinition415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleDefinition434);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:238:1: ( (lv_in_2_0= ruleInput ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:239:1: (lv_in_2_0= ruleInput )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:239:1: (lv_in_2_0= ruleInput )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:240:3: lv_in_2_0= ruleInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getInInputParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInput_in_ruleDefinition454);
            lv_in_2_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"in",
                      		lv_in_2_0, 
                      		"Input");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleDefinition473);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleDefinition484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:271:1: ( (lv_com_5_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:272:1: (lv_com_5_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:272:1: (lv_com_5_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:273:3: lv_com_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getComCommandsParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleDefinition505);
            lv_com_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"com",
                      		lv_com_5_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_6()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleDefinition524);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleDefinition535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getPercentSignKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleDefinition547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getWriteKeyword_8());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleDefinition566);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:319:1: ( (lv_out_10_0= ruleOutput ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:320:1: (lv_out_10_0= ruleOutput )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:320:1: (lv_out_10_0= ruleOutput )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:321:3: lv_out_10_0= ruleOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getOutOutputParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleDefinition586);
            lv_out_10_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"out",
                      		lv_out_10_0, 
                      		"Output");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:345:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:346:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:347:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput622);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput632); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:354:1: ruleInput returns [EObject current=null] : ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_v_0_0 = null;

        EObject lv_v_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:357:28: ( ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:358:1: ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:358:1: ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:358:2: ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:358:2: ( (lv_v_0_0= ruleVAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:359:1: (lv_v_0_0= ruleVAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:359:1: (lv_v_0_0= ruleVAR )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:360:3: lv_v_0_0= ruleVAR
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputAccess().getVVARParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVAR_in_ruleInput678);
            lv_v_0_0=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputRule());
              	        }
                     		add(
                     			current, 
                     			"v",
                      		lv_v_0_0, 
                      		"VAR");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:376:2: (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:376:4: otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInput691); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:380:1: ( (lv_v_2_0= ruleVAR ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:381:1: (lv_v_2_0= ruleVAR )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:381:1: (lv_v_2_0= ruleVAR )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:382:3: lv_v_2_0= ruleVAR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputAccess().getVVARParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVAR_in_ruleInput712);
            	    lv_v_2_0=ruleVAR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInputRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"v",
            	              		lv_v_2_0, 
            	              		"VAR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:406:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:407:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:408:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput750);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput760); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:415:1: ruleOutput returns [EObject current=null] : ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_v_0_0 = null;

        EObject lv_v_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:418:28: ( ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:419:1: ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:419:1: ( ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:419:2: ( (lv_v_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:419:2: ( (lv_v_0_0= ruleVAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:420:1: (lv_v_0_0= ruleVAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:420:1: (lv_v_0_0= ruleVAR )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:421:3: lv_v_0_0= ruleVAR
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputAccess().getVVARParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVAR_in_ruleOutput806);
            lv_v_0_0=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputRule());
              	        }
                     		add(
                     			current, 
                     			"v",
                      		lv_v_0_0, 
                      		"VAR");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:437:2: (otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:437:4: otherlv_1= ',' ( (lv_v_2_0= ruleVAR ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleOutput819); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:441:1: ( (lv_v_2_0= ruleVAR ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:442:1: (lv_v_2_0= ruleVAR )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:442:1: (lv_v_2_0= ruleVAR )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:443:3: lv_v_2_0= ruleVAR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOutputAccess().getVVARParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVAR_in_ruleOutput840);
            	    lv_v_2_0=ruleVAR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOutputRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"v",
            	              		lv_v_2_0, 
            	              		"VAR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:467:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:468:2: (iv_ruleCommands= ruleCommands EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:469:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands878);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands888); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:476:1: ruleCommands returns [EObject current=null] : ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:479:28: ( ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:480:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:480:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:480:2: ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:480:2: ( (lv_c_0_0= ruleCommand ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:481:1: (lv_c_0_0= ruleCommand )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:481:1: (lv_c_0_0= ruleCommand )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:482:3: lv_c_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommands934);
            lv_c_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandsRule());
              	        }
                     		add(
                     			current, 
                     			"c",
                      		lv_c_0_0, 
                      		"Command");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:498:2: (otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:498:4: otherlv_1= ';' ruleLC ( (lv_c_3_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCommands947); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleCommands966);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:513:1: ( (lv_c_3_0= ruleCommand ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:514:1: (lv_c_3_0= ruleCommand )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:514:1: (lv_c_3_0= ruleCommand )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:515:3: lv_c_3_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommands986);
            	    lv_c_3_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"c",
            	              		lv_c_3_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:539:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:540:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:541:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1024);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1034); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:548:1: ruleCommand returns [EObject current=null] : ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_fore_5_0= ruleForeach ) ) | ( (lv_ifc_6_0= ruleIfconfort ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;
        EObject lv_assign_1_0 = null;

        EObject lv_wh_2_0 = null;

        EObject lv_for_3_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_fore_5_0 = null;

        EObject lv_ifc_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:551:28: ( ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_fore_5_0= ruleForeach ) ) | ( (lv_ifc_6_0= ruleIfconfort ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:552:1: ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_fore_5_0= ruleForeach ) ) | ( (lv_ifc_6_0= ruleIfconfort ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:552:1: ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_fore_5_0= ruleForeach ) ) | ( (lv_ifc_6_0= ruleIfconfort ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case RULE_BASEVAR:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                int LA6_5 = input.LA(2);

                if ( (synpred10_InternalLangage_while()) ) {
                    alt6=5;
                }
                else if ( (true) ) {
                    alt6=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:552:2: ( (lv_nop_0_0= 'nop' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:552:2: ( (lv_nop_0_0= 'nop' ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:553:1: (lv_nop_0_0= 'nop' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:553:1: (lv_nop_0_0= 'nop' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:554:3: lv_nop_0_0= 'nop'
                    {
                    lv_nop_0_0=(Token)match(input,25,FOLLOW_25_in_ruleCommand1077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nop_0_0, grammarAccess.getCommandAccess().getNopNopKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:568:6: ( (lv_assign_1_0= ruleAssign ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:568:6: ( (lv_assign_1_0= ruleAssign ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:569:1: (lv_assign_1_0= ruleAssign )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:569:1: (lv_assign_1_0= ruleAssign )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:570:3: lv_assign_1_0= ruleAssign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getAssignAssignParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssign_in_ruleCommand1117);
                    lv_assign_1_0=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"assign",
                              		lv_assign_1_0, 
                              		"Assign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:587:6: ( (lv_wh_2_0= ruleWhile ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:587:6: ( (lv_wh_2_0= ruleWhile ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:588:1: (lv_wh_2_0= ruleWhile )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:588:1: (lv_wh_2_0= ruleWhile )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:589:3: lv_wh_2_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleCommand1144);
                    lv_wh_2_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"wh",
                              		lv_wh_2_0, 
                              		"While");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:606:6: ( (lv_for_3_0= ruleFor ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:606:6: ( (lv_for_3_0= ruleFor ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:607:1: (lv_for_3_0= ruleFor )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:607:1: (lv_for_3_0= ruleFor )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:608:3: lv_for_3_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getForForParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleCommand1171);
                    lv_for_3_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"for",
                              		lv_for_3_0, 
                              		"For");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:625:6: ( (lv_if_4_0= ruleIf ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:625:6: ( (lv_if_4_0= ruleIf ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:626:1: (lv_if_4_0= ruleIf )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:626:1: (lv_if_4_0= ruleIf )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:627:3: lv_if_4_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getIfIfParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleCommand1198);
                    lv_if_4_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"if",
                              		lv_if_4_0, 
                              		"If");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:644:6: ( (lv_fore_5_0= ruleForeach ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:644:6: ( (lv_fore_5_0= ruleForeach ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:645:1: (lv_fore_5_0= ruleForeach )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:645:1: (lv_fore_5_0= ruleForeach )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:646:3: lv_fore_5_0= ruleForeach
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeach_in_ruleCommand1225);
                    lv_fore_5_0=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"fore",
                              		lv_fore_5_0, 
                              		"Foreach");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:663:6: ( (lv_ifc_6_0= ruleIfconfort ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:663:6: ( (lv_ifc_6_0= ruleIfconfort ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:664:1: (lv_ifc_6_0= ruleIfconfort )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:664:1: (lv_ifc_6_0= ruleIfconfort )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:665:3: lv_ifc_6_0= ruleIfconfort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getIfcIfconfortParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfconfort_in_ruleCommand1252);
                    lv_ifc_6_0=ruleIfconfort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"ifc",
                              		lv_ifc_6_0, 
                              		"Ifconfort");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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


    // $ANTLR start "entryRuleAssign"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:689:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:690:2: (iv_ruleAssign= ruleAssign EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:691:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign1288);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign1298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:698:1: ruleAssign returns [EObject current=null] : ( ( (lv_vs_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_ex_4_0= ruleExprs ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_vs_0_0 = null;

        EObject lv_ex_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:701:28: ( ( ( (lv_vs_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_ex_4_0= ruleExprs ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:702:1: ( ( (lv_vs_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_ex_4_0= ruleExprs ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:702:1: ( ( (lv_vs_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_ex_4_0= ruleExprs ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:702:2: ( (lv_vs_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_ex_4_0= ruleExprs ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:702:2: ( (lv_vs_0_0= ruleVars ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:703:1: (lv_vs_0_0= ruleVars )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:703:1: (lv_vs_0_0= ruleVars )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:704:3: lv_vs_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignAccess().getVsVarsParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVars_in_ruleAssign1344);
            lv_vs_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignRule());
              	        }
                     		set(
                     			current, 
                     			"vs",
                      		lv_vs_0_0, 
                      		"Vars");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleAssign1363);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAssign1374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleAssign1393);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:746:1: ( (lv_ex_4_0= ruleExprs ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:747:1: (lv_ex_4_0= ruleExprs )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:747:1: (lv_ex_4_0= ruleExprs )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:748:3: lv_ex_4_0= ruleExprs
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignAccess().getExExprsParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprs_in_ruleAssign1413);
            lv_ex_4_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_4_0, 
                      		"Exprs");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:772:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:773:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:774:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1449);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:781:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_ex_2_0 = null;

        EObject lv_c_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:784:28: ( (otherlv_0= 'while' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:785:1: (otherlv_0= 'while' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:785:1: (otherlv_0= 'while' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:785:3: otherlv_0= 'while' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleWhile1496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1515);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:800:1: ( (lv_ex_2_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:801:1: (lv_ex_2_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:801:1: (lv_ex_2_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:802:3: lv_ex_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleWhile1535);
            lv_ex_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1554);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleWhile1565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getDoKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1584);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:844:1: ( (lv_c_6_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:845:1: (lv_c_6_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:845:1: (lv_c_6_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:846:3: lv_c_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getCCommandsParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleWhile1604);
            lv_c_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"c",
                      		lv_c_6_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1623);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleWhile1634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getWhileAccess().getOdKeyword_8());
                  
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:885:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:886:2: (iv_ruleFor= ruleFor EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:887:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1670);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:894:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_ex_2_0 = null;

        EObject lv_c_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:897:28: ( (otherlv_0= 'for' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:898:1: (otherlv_0= 'for' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:898:1: (otherlv_0= 'for' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:898:3: otherlv_0= 'for' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFor1717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1736);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:913:1: ( (lv_ex_2_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:914:1: (lv_ex_2_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:914:1: (lv_ex_2_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:915:3: lv_ex_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getExExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleFor1756);
            lv_ex_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1775);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFor1786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForAccess().getDoKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1805);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:957:1: ( (lv_c_6_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:958:1: (lv_c_6_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:958:1: (lv_c_6_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:959:3: lv_c_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getCCommandsParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleFor1825);
            lv_c_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"c",
                      		lv_c_6_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1844);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFor1855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getForAccess().getOdKeyword_8());
                  
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:998:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:999:2: (iv_ruleIf= ruleIf EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1000:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1891);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1007:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_ct_6_0= ruleCommands ) ) ruleLC otherlv_8= 'else' ruleLC ( (lv_ce_10_0= ruleCommands ) ) ruleLC otherlv_12= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_ex_2_0 = null;

        EObject lv_ct_6_0 = null;

        EObject lv_ce_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1010:28: ( (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_ct_6_0= ruleCommands ) ) ruleLC otherlv_8= 'else' ruleLC ( (lv_ce_10_0= ruleCommands ) ) ruleLC otherlv_12= 'fi' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1011:1: (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_ct_6_0= ruleCommands ) ) ruleLC otherlv_8= 'else' ruleLC ( (lv_ce_10_0= ruleCommands ) ) ruleLC otherlv_12= 'fi' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1011:1: (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_ct_6_0= ruleCommands ) ) ruleLC otherlv_8= 'else' ruleLC ( (lv_ce_10_0= ruleCommands ) ) ruleLC otherlv_12= 'fi' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1011:3: otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_ct_6_0= ruleCommands ) ) ruleLC otherlv_8= 'else' ruleLC ( (lv_ce_10_0= ruleCommands ) ) ruleLC otherlv_12= 'fi'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleIf1938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1957);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1026:1: ( (lv_ex_2_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1027:1: (lv_ex_2_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1027:1: (lv_ex_2_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1028:3: lv_ex_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleIf1977);
            lv_ex_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1996);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleIf2007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getThenKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf2026);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1070:1: ( (lv_ct_6_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1071:1: (lv_ct_6_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1071:1: (lv_ct_6_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1072:3: lv_ct_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getCtCommandsParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleIf2046);
            lv_ct_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"ct",
                      		lv_ct_6_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf2065);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleIf2076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf2095);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1114:1: ( (lv_ce_10_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1115:1: (lv_ce_10_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1115:1: (lv_ce_10_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1116:3: lv_ce_10_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getCeCommandsParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleIf2115);
            lv_ce_10_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"ce",
                      		lv_ce_10_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_11()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf2134);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleIf2145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getIfAccess().getFiKeyword_12());
                  
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeach"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1155:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1156:2: (iv_ruleForeach= ruleForeach EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1157:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach2181);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach2191); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1164:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ruleLC ( (lv_ex1_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_ex2_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_c_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_ex1_2_0 = null;

        EObject lv_ex2_6_0 = null;

        EObject lv_c_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1167:28: ( (otherlv_0= 'foreach' ruleLC ( (lv_ex1_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_ex2_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_c_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1168:1: (otherlv_0= 'foreach' ruleLC ( (lv_ex1_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_ex2_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_c_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1168:1: (otherlv_0= 'foreach' ruleLC ( (lv_ex1_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_ex2_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_c_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1168:3: otherlv_0= 'foreach' ruleLC ( (lv_ex1_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_ex2_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_c_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleForeach2228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2247);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1183:1: ( (lv_ex1_2_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1184:1: (lv_ex1_2_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1184:1: (lv_ex1_2_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1185:3: lv_ex1_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getEx1ExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleForeach2267);
            lv_ex1_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"ex1",
                      		lv_ex1_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2286);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleForeach2297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getInKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2316);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1227:1: ( (lv_ex2_6_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1228:1: (lv_ex2_6_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1228:1: (lv_ex2_6_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1229:3: lv_ex2_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getEx2ExprParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleForeach2336);
            lv_ex2_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"ex2",
                      		lv_ex2_6_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2355);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleForeach2366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getForeachAccess().getDoKeyword_8());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2385);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1271:1: ( (lv_c_10_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1272:1: (lv_c_10_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1272:1: (lv_c_10_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1273:3: lv_c_10_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getCCommandsParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleForeach2405);
            lv_c_10_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"c",
                      		lv_c_10_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2424);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleForeach2435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getForeachAccess().getOdKeyword_12());
                  
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
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleIfconfort"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1312:1: entryRuleIfconfort returns [EObject current=null] : iv_ruleIfconfort= ruleIfconfort EOF ;
    public final EObject entryRuleIfconfort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfconfort = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1313:2: (iv_ruleIfconfort= ruleIfconfort EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1314:2: iv_ruleIfconfort= ruleIfconfort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfconfortRule()); 
            }
            pushFollow(FOLLOW_ruleIfconfort_in_entryRuleIfconfort2471);
            iv_ruleIfconfort=ruleIfconfort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfconfort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfconfort2481); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfconfort"


    // $ANTLR start "ruleIfconfort"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1321:1: ruleIfconfort returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'fi' ) ;
    public final EObject ruleIfconfort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_ex_2_0 = null;

        EObject lv_c_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1324:28: ( (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'fi' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1325:1: (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'fi' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1325:1: (otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'fi' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1325:3: otherlv_0= 'if' ruleLC ( (lv_ex_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_c_6_0= ruleCommands ) ) ruleLC otherlv_8= 'fi'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleIfconfort2518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfconfortAccess().getIfKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfconfortAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIfconfort2537);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1340:1: ( (lv_ex_2_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1341:1: (lv_ex_2_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1341:1: (lv_ex_2_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1342:3: lv_ex_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfconfortAccess().getExExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleIfconfort2557);
            lv_ex_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfconfortRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfconfortAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIfconfort2576);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleIfconfort2587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfconfortAccess().getThenKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfconfortAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIfconfort2606);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1384:1: ( (lv_c_6_0= ruleCommands ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1385:1: (lv_c_6_0= ruleCommands )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1385:1: (lv_c_6_0= ruleCommands )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1386:3: lv_c_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfconfortAccess().getCCommandsParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleIfconfort2626);
            lv_c_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfconfortRule());
              	        }
                     		set(
                     			current, 
                     			"c",
                      		lv_c_6_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfconfortAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIfconfort2645);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleIfconfort2656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getIfconfortAccess().getFiKeyword_8());
                  
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
    // $ANTLR end "ruleIfconfort"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1425:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1426:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1427:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars2692);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars2702); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1434:1: ruleVars returns [EObject current=null] : ( ( (lv_vs_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vs_0_0 = null;

        EObject lv_vs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1437:28: ( ( ( (lv_vs_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1438:1: ( ( (lv_vs_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1438:1: ( ( (lv_vs_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1438:2: ( (lv_vs_0_0= ruleVAR ) ) (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1438:2: ( (lv_vs_0_0= ruleVAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1439:1: (lv_vs_0_0= ruleVAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1439:1: (lv_vs_0_0= ruleVAR )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1440:3: lv_vs_0_0= ruleVAR
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarsAccess().getVsVARParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVAR_in_ruleVars2748);
            lv_vs_0_0=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarsRule());
              	        }
                     		add(
                     			current, 
                     			"vs",
                      		lv_vs_0_0, 
                      		"VAR");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1456:2: (otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1456:4: otherlv_1= ',' ( (lv_vs_2_0= ruleVAR ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVars2761); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1460:1: ( (lv_vs_2_0= ruleVAR ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1461:1: (lv_vs_2_0= ruleVAR )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1461:1: (lv_vs_2_0= ruleVAR )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1462:3: lv_vs_2_0= ruleVAR
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVarsAccess().getVsVARParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVAR_in_ruleVars2782);
            	    lv_vs_2_0=ruleVAR();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVarsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vs",
            	              		lv_vs_2_0, 
            	              		"VAR");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1486:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1487:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1488:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs2820);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs2830); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1495:1: ruleExprs returns [EObject current=null] : ( ( (lv_ex_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ex_0_0 = null;

        EObject lv_ex_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1498:28: ( ( ( (lv_ex_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1499:1: ( ( (lv_ex_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1499:1: ( ( (lv_ex_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1499:2: ( (lv_ex_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1499:2: ( (lv_ex_0_0= ruleExpr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1500:1: (lv_ex_0_0= ruleExpr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1500:1: (lv_ex_0_0= ruleExpr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1501:3: lv_ex_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs2876);
            lv_ex_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprsRule());
              	        }
                     		add(
                     			current, 
                     			"ex",
                      		lv_ex_0_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1517:2: (otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1517:4: otherlv_1= ',' ( (lv_ex_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleExprs2889); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1521:1: ( (lv_ex_2_0= ruleExpr ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1522:1: (lv_ex_2_0= ruleExpr )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1522:1: (lv_ex_2_0= ruleExpr )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1523:3: lv_ex_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs2910);
            	    lv_ex_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ex",
            	              		lv_ex_2_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1547:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1548:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1549:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2948);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1556:1: ruleExpr returns [EObject current=null] : ( ( (lv_exs_0_0= ruleExprSimple ) ) | ( (lv_exa_1_0= ruleExprAnd ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exs_0_0 = null;

        EObject lv_exa_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1559:28: ( ( ( (lv_exs_0_0= ruleExprSimple ) ) | ( (lv_exa_1_0= ruleExprAnd ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:1: ( ( (lv_exs_0_0= ruleExprSimple ) ) | ( (lv_exa_1_0= ruleExprAnd ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:1: ( ( (lv_exs_0_0= ruleExprSimple ) ) | ( (lv_exa_1_0= ruleExprAnd ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_BASEVAR:
            case RULE_BASESYMB:
            case 37:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred14_InternalLangage_while()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:2: ( (lv_exs_0_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:2: ( (lv_exs_0_0= ruleExprSimple ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1561:1: (lv_exs_0_0= ruleExprSimple )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1561:1: (lv_exs_0_0= ruleExprSimple )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1562:3: lv_exs_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExsExprSimpleParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr3004);
                    lv_exs_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exs",
                              		lv_exs_0_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1579:6: ( (lv_exa_1_0= ruleExprAnd ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1579:6: ( (lv_exa_1_0= ruleExprAnd ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1580:1: (lv_exa_1_0= ruleExprAnd )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1580:1: (lv_exa_1_0= ruleExprAnd )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1581:3: lv_exa_1_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExaExprAndParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr3031);
                    lv_exa_1_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exa",
                              		lv_exa_1_0, 
                              		"ExprAnd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1605:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1606:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1607:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple3067);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple3077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1614:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_v_1_0= ruleVAR ) ) | ( (lv_sym_2_0= ruleSYMB ) ) | (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;
        Token otherlv_3=null;
        Token lv_mot_4_1=null;
        Token lv_mot_4_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mot_8_1=null;
        Token lv_mot_8_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_v_1_0 = null;

        EObject lv_sym_2_0 = null;

        EObject lv_lex_5_0 = null;

        EObject lv_ex_10_0 = null;

        EObject lv_sym_13_0 = null;

        EObject lv_lex_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1617:28: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_v_1_0= ruleVAR ) ) | ( (lv_sym_2_0= ruleSYMB ) ) | (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1618:1: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_v_1_0= ruleVAR ) ) | ( (lv_sym_2_0= ruleSYMB ) ) | (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1618:1: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_v_1_0= ruleVAR ) ) | ( (lv_sym_2_0= ruleSYMB ) ) | (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case RULE_BASEVAR:
                {
                alt12=2;
                }
                break;
            case RULE_BASESYMB:
                {
                alt12=3;
                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 39:
                case 40:
                    {
                    alt12=4;
                    }
                    break;
                case RULE_BASESYMB:
                    {
                    alt12=6;
                    }
                    break;
                case 42:
                case 43:
                    {
                    alt12=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1618:2: ( (lv_nil_0_0= 'nil' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1618:2: ( (lv_nil_0_0= 'nil' ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1619:1: (lv_nil_0_0= 'nil' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1619:1: (lv_nil_0_0= 'nil' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1620:3: lv_nil_0_0= 'nil'
                    {
                    lv_nil_0_0=(Token)match(input,37,FOLLOW_37_in_ruleExprSimple3120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1634:6: ( (lv_v_1_0= ruleVAR ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1634:6: ( (lv_v_1_0= ruleVAR ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1635:1: (lv_v_1_0= ruleVAR )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1635:1: (lv_v_1_0= ruleVAR )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1636:3: lv_v_1_0= ruleVAR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getVVARParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVAR_in_ruleExprSimple3160);
                    lv_v_1_0=ruleVAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"v",
                              		lv_v_1_0, 
                              		"VAR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1653:6: ( (lv_sym_2_0= ruleSYMB ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1653:6: ( (lv_sym_2_0= ruleSYMB ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1654:1: (lv_sym_2_0= ruleSYMB )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1654:1: (lv_sym_2_0= ruleSYMB )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1655:3: lv_sym_2_0= ruleSYMB
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSYMB_in_ruleExprSimple3187);
                    lv_sym_2_0=ruleSYMB();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"sym",
                              		lv_sym_2_0, 
                              		"SYMB");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1672:6: (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1672:6: (otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1672:8: otherlv_3= '(' ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) ) ( (lv_lex_5_0= ruleLExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple3206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1676:1: ( ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1677:1: ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1677:1: ( (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1678:1: (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1678:1: (lv_mot_4_1= 'cons' | lv_mot_4_2= 'list' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==39) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==40) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1679:3: lv_mot_4_1= 'cons'
                            {
                            lv_mot_4_1=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple3226); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_4_1, grammarAccess.getExprSimpleAccess().getMotConsKeyword_3_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_4_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1691:8: lv_mot_4_2= 'list'
                            {
                            lv_mot_4_2=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple3255); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_4_2, grammarAccess.getExprSimpleAccess().getMotListKeyword_3_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_4_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1706:2: ( (lv_lex_5_0= ruleLExpr ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:1: (lv_lex_5_0= ruleLExpr )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1707:1: (lv_lex_5_0= ruleLExpr )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1708:3: lv_lex_5_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple3292);
                    lv_lex_5_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"lex",
                              		lv_lex_5_0, 
                              		"LExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple3304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1729:6: (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1729:6: (otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1729:8: otherlv_7= '(' ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) ) ruleLC ( (lv_ex_10_0= ruleExpr ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple3324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1733:1: ( ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1734:1: ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1734:1: ( (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1735:1: (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1735:1: (lv_mot_8_1= 'hd' | lv_mot_8_2= 'tl' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==42) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==43) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1736:3: lv_mot_8_1= 'hd'
                            {
                            lv_mot_8_1=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple3344); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_8_1, grammarAccess.getExprSimpleAccess().getMotHdKeyword_4_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_8_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1748:8: lv_mot_8_2= 'tl'
                            {
                            lv_mot_8_2=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple3373); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_8_2, grammarAccess.getExprSimpleAccess().getMotTlKeyword_4_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_8_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple3408);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1774:1: ( (lv_ex_10_0= ruleExpr ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1775:1: (lv_ex_10_0= ruleExpr )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1775:1: (lv_ex_10_0= ruleExpr )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1776:3: lv_ex_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExExprParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple3428);
                    lv_ex_10_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"ex",
                              		lv_ex_10_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple3440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1797:6: (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1797:6: (otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1797:8: otherlv_12= '(' ( (lv_sym_13_0= ruleSYMB ) ) ( (lv_lex_14_0= ruleLExpr ) ) otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple3460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1801:1: ( (lv_sym_13_0= ruleSYMB ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1802:1: (lv_sym_13_0= ruleSYMB )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1802:1: (lv_sym_13_0= ruleSYMB )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1803:3: lv_sym_13_0= ruleSYMB
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getSymSYMBParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSYMB_in_ruleExprSimple3481);
                    lv_sym_13_0=ruleSYMB();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"sym",
                              		lv_sym_13_0, 
                              		"SYMB");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1819:2: ( (lv_lex_14_0= ruleLExpr ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1820:1: (lv_lex_14_0= ruleLExpr )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1820:1: (lv_lex_14_0= ruleLExpr )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1821:3: lv_lex_14_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLexLExprParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple3502);
                    lv_lex_14_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"lex",
                              		lv_lex_14_0, 
                              		"LExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple3514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                          
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
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLExpr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1849:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1850:2: (iv_ruleLExpr= ruleLExpr EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1851:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr3551);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr3561); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1858:1: ruleLExpr returns [EObject current=null] : ( ruleLC ( (lv_e_1_0= ruleExpr ) ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_e_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1861:28: ( ( ruleLC ( (lv_e_1_0= ruleExpr ) ) )+ )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1862:1: ( ruleLC ( (lv_e_1_0= ruleExpr ) ) )+
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1862:1: ( ruleLC ( (lv_e_1_0= ruleExpr ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_BASEVAR||(LA13_0>=RULE_BASESYMB && LA13_0<=RULE_LF)||(LA13_0>=37 && LA13_0<=38)||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1863:2: ruleLC ( (lv_e_1_0= ruleExpr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleLExpr3605);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1873:1: ( (lv_e_1_0= ruleExpr ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1874:1: (lv_e_1_0= ruleExpr )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1874:1: (lv_e_1_0= ruleExpr )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1875:3: lv_e_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLExprAccess().getEExprParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLExpr3625);
            	    lv_e_1_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"e",
            	              		lv_e_1_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprAnd"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1899:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1900:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1901:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3662);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3672); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1908:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_exo1_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exo1_0_0 = null;

        EObject lv_exo2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1911:28: ( ( ( (lv_exo1_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1912:1: ( ( (lv_exo1_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1912:1: ( ( (lv_exo1_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1912:2: ( (lv_exo1_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1912:2: ( (lv_exo1_0_0= ruleExprOr ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1913:1: (lv_exo1_0_0= ruleExprOr )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1913:1: (lv_exo1_0_0= ruleExprOr )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1914:3: lv_exo1_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprAndAccess().getExo1ExprOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3718);
            lv_exo1_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprAndRule());
              	        }
                     		set(
                     			current, 
                     			"exo1",
                      		lv_exo1_0_0, 
                      		"ExprOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1930:2: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 44:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1931:2: ruleLC otherlv_2= 'and' ruleLC ( (lv_exo2_4_0= ruleExprOr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3738);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleExprAnd3749); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3768);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1956:1: ( (lv_exo2_4_0= ruleExprOr ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1957:1: (lv_exo2_4_0= ruleExprOr )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1957:1: (lv_exo2_4_0= ruleExprOr )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1958:3: lv_exo2_4_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getExo2ExprOrParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3788);
            	    lv_exo2_4_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exo2",
            	              		lv_exo2_4_0, 
            	              		"ExprOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1982:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1983:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1984:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3826);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3836); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1991:1: ruleExprOr returns [EObject current=null] : ( ( (lv_exn1_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exn1_0_0 = null;

        EObject lv_exn2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1994:28: ( ( ( (lv_exn1_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )* ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1995:1: ( ( (lv_exn1_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )* )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1995:1: ( ( (lv_exn1_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1995:2: ( (lv_exn1_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1995:2: ( (lv_exn1_0_0= ruleExprNot ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1996:1: (lv_exn1_0_0= ruleExprNot )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1996:1: (lv_exn1_0_0= ruleExprNot )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1997:3: lv_exn1_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprOrAccess().getExn1ExprNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3882);
            lv_exn1_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprOrRule());
              	        }
                     		set(
                     			current, 
                     			"exn1",
                      		lv_exn1_0_0, 
                      		"ExprNot");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2013:2: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) ) )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 45:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2014:2: ruleLC otherlv_2= 'or' ruleLC ( (lv_exn2_4_0= ruleExprNot ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3902);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleExprOr3913); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3932);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2039:1: ( (lv_exn2_4_0= ruleExprNot ) )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2040:1: (lv_exn2_4_0= ruleExprNot )
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2040:1: (lv_exn2_4_0= ruleExprNot )
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2041:3: lv_exn2_4_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getExn2ExprNotParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3952);
            	    lv_exn2_4_0=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exn2",
            	              		lv_exn2_4_0, 
            	              		"ExprNot");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2065:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2066:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2067:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot3990);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot4000); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2074:1: ruleExprNot returns [EObject current=null] : ( (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) ) | ( (lv_exQ2_3_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exQ1_2_0 = null;

        EObject lv_exQ2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2077:28: ( ( (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) ) | ( (lv_exQ2_3_0= ruleExprEq ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2078:1: ( (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) ) | ( (lv_exQ2_3_0= ruleExprEq ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2078:1: ( (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) ) | ( (lv_exQ2_3_0= ruleExprEq ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2078:2: (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2078:2: (otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2078:4: otherlv_0= 'not' ruleLC ( (lv_exQ1_2_0= ruleExprEq ) )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleExprNot4038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprNot4057);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2093:1: ( (lv_exQ1_2_0= ruleExprEq ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2094:1: (lv_exQ1_2_0= ruleExprEq )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2094:1: (lv_exQ1_2_0= ruleExprEq )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2095:3: lv_exQ1_2_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprNotAccess().getExQ1ExprEqParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot4077);
                    lv_exQ1_2_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprNotRule());
                      	        }
                             		set(
                             			current, 
                             			"exQ1",
                              		lv_exQ1_2_0, 
                              		"ExprEq");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2112:6: ( (lv_exQ2_3_0= ruleExprEq ) )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2112:6: ( (lv_exQ2_3_0= ruleExprEq ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2113:1: (lv_exQ2_3_0= ruleExprEq )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2113:1: (lv_exQ2_3_0= ruleExprEq )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2114:3: lv_exQ2_3_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprNotAccess().getExQ2ExprEqParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot4105);
                    lv_exQ2_3_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprNotRule());
                      	        }
                             		set(
                             			current, 
                             			"exQ2",
                              		lv_exQ2_3_0, 
                              		"ExprEq");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2138:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2139:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2140:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq4141);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq4151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2147:1: ruleExprEq returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exS1_1_0 = null;

        EObject lv_exS2_3_0 = null;

        EObject lv_ex_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2150:28: ( ( (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:1: ( (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:1: ( (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' ) | (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred26_InternalLangage_while()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:2: (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:2: (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:4: otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleExprEq4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2155:1: ( (lv_exS1_1_0= ruleExprSimple ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2156:1: (lv_exS1_1_0= ruleExprSimple )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2156:1: (lv_exS1_1_0= ruleExprSimple )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2157:3: lv_exS1_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExS1ExprSimpleParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq4210);
                    lv_exS1_1_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"exS1",
                              		lv_exS1_1_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleExprEq4222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_2());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2177:1: ( (lv_exS2_3_0= ruleExprSimple ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2178:1: (lv_exS2_3_0= ruleExprSimple )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2178:1: (lv_exS2_3_0= ruleExprSimple )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2179:3: lv_exS2_3_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExS2ExprSimpleParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq4243);
                    lv_exS2_3_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"exS2",
                              		lv_exS2_3_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleExprEq4255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2200:6: (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2200:6: (otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')' )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2200:8: otherlv_5= '(' ( (lv_ex_6_0= ruleExpr ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleExprEq4275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2204:1: ( (lv_ex_6_0= ruleExpr ) )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2205:1: (lv_ex_6_0= ruleExpr )
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2205:1: (lv_ex_6_0= ruleExpr )
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2206:3: lv_ex_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq4296);
                    lv_ex_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"ex",
                              		lv_ex_6_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleExprEq4308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleVAR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2234:1: entryRuleVAR returns [EObject current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final EObject entryRuleVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2235:2: (iv_ruleVAR= ruleVAR EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2236:2: iv_ruleVAR= ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_entryRuleVAR4345);
            iv_ruleVAR=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR4355); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2243:1: ruleVAR returns [EObject current=null] : ( ( (lv_bv_0_0= RULE_BASEVAR ) ) ( (lv_cf_1_0= RULE_CONF ) ) ) ;
    public final EObject ruleVAR() throws RecognitionException {
        EObject current = null;

        Token lv_bv_0_0=null;
        Token lv_cf_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2246:28: ( ( ( (lv_bv_0_0= RULE_BASEVAR ) ) ( (lv_cf_1_0= RULE_CONF ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2247:1: ( ( (lv_bv_0_0= RULE_BASEVAR ) ) ( (lv_cf_1_0= RULE_CONF ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2247:1: ( ( (lv_bv_0_0= RULE_BASEVAR ) ) ( (lv_cf_1_0= RULE_CONF ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2247:2: ( (lv_bv_0_0= RULE_BASEVAR ) ) ( (lv_cf_1_0= RULE_CONF ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2247:2: ( (lv_bv_0_0= RULE_BASEVAR ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2248:1: (lv_bv_0_0= RULE_BASEVAR )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2248:1: (lv_bv_0_0= RULE_BASEVAR )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2249:3: lv_bv_0_0= RULE_BASEVAR
            {
            lv_bv_0_0=(Token)match(input,RULE_BASEVAR,FOLLOW_RULE_BASEVAR_in_ruleVAR4397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bv_0_0, grammarAccess.getVARAccess().getBvBASEVARTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVARRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bv",
                      		lv_bv_0_0, 
                      		"BASEVAR");
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2265:2: ( (lv_cf_1_0= RULE_CONF ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2266:1: (lv_cf_1_0= RULE_CONF )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2266:1: (lv_cf_1_0= RULE_CONF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2267:3: lv_cf_1_0= RULE_CONF
            {
            lv_cf_1_0=(Token)match(input,RULE_CONF,FOLLOW_RULE_CONF_in_ruleVAR4419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_cf_1_0, grammarAccess.getVARAccess().getCfCONFTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVARRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"cf",
                      		lv_cf_1_0, 
                      		"CONF");
              	    
            }

            }


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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleSYMB"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2291:1: entryRuleSYMB returns [EObject current=null] : iv_ruleSYMB= ruleSYMB EOF ;
    public final EObject entryRuleSYMB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSYMB = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2292:2: (iv_ruleSYMB= ruleSYMB EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2293:2: iv_ruleSYMB= ruleSYMB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSYMBRule()); 
            }
            pushFollow(FOLLOW_ruleSYMB_in_entryRuleSYMB4460);
            iv_ruleSYMB=ruleSYMB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSYMB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSYMB4470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSYMB"


    // $ANTLR start "ruleSYMB"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2300:1: ruleSYMB returns [EObject current=null] : ( ( (lv_bs_0_0= RULE_BASESYMB ) ) ( (lv_cf_1_0= RULE_CONF ) ) ) ;
    public final EObject ruleSYMB() throws RecognitionException {
        EObject current = null;

        Token lv_bs_0_0=null;
        Token lv_cf_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2303:28: ( ( ( (lv_bs_0_0= RULE_BASESYMB ) ) ( (lv_cf_1_0= RULE_CONF ) ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2304:1: ( ( (lv_bs_0_0= RULE_BASESYMB ) ) ( (lv_cf_1_0= RULE_CONF ) ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2304:1: ( ( (lv_bs_0_0= RULE_BASESYMB ) ) ( (lv_cf_1_0= RULE_CONF ) ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2304:2: ( (lv_bs_0_0= RULE_BASESYMB ) ) ( (lv_cf_1_0= RULE_CONF ) )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2304:2: ( (lv_bs_0_0= RULE_BASESYMB ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2305:1: (lv_bs_0_0= RULE_BASESYMB )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2305:1: (lv_bs_0_0= RULE_BASESYMB )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2306:3: lv_bs_0_0= RULE_BASESYMB
            {
            lv_bs_0_0=(Token)match(input,RULE_BASESYMB,FOLLOW_RULE_BASESYMB_in_ruleSYMB4512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bs_0_0, grammarAccess.getSYMBAccess().getBsBASESYMBTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSYMBRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bs",
                      		lv_bs_0_0, 
                      		"BASESYMB");
              	    
            }

            }


            }

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2322:2: ( (lv_cf_1_0= RULE_CONF ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2323:1: (lv_cf_1_0= RULE_CONF )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2323:1: (lv_cf_1_0= RULE_CONF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2324:3: lv_cf_1_0= RULE_CONF
            {
            lv_cf_1_0=(Token)match(input,RULE_CONF,FOLLOW_RULE_CONF_in_ruleSYMB4534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_cf_1_0, grammarAccess.getSYMBAccess().getCfCONFTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSYMBRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"cf",
                      		lv_cf_1_0, 
                      		"CONF");
              	    
            }

            }


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
    // $ANTLR end "ruleSYMB"


    // $ANTLR start "entryRuleLC"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2348:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2349:2: (iv_ruleLC= ruleLC EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2350:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC4576);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC4587); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2357:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LCs_0= ruleLCs )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LCs_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2360:28: ( (this_LCs_0= ruleLCs )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2361:1: (this_LCs_0= ruleLCs )?
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2361:1: (this_LCs_0= ruleLCs )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_SP && LA18_0<=RULE_LF)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2362:5: this_LCs_0= ruleLCs
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLCAccess().getLCsParserRuleCall()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLCs_in_ruleLC4634);
                    this_LCs_0=ruleLCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCs_0);
                          
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
    // $ANTLR end "ruleLC"


    // $ANTLR start "entryRuleLCs"
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2380:1: entryRuleLCs returns [String current=null] : iv_ruleLCs= ruleLCs EOF ;
    public final String entryRuleLCs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLCs = null;


        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2381:2: (iv_ruleLCs= ruleLCs EOF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2382:2: iv_ruleLCs= ruleLCs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCsRule()); 
            }
            pushFollow(FOLLOW_ruleLCs_in_entryRuleLCs4681);
            iv_ruleLCs=ruleLCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLCs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCs4692); if (state.failed) return current;

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
    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2389:1: ruleLCs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF ) ;
    public final AntlrDatatypeRuleToken ruleLCs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2392:28: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2393:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2393:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt19=1;
                }
                break;
            case RULE_CR:
                {
                alt19=2;
                }
                break;
            case RULE_TAB:
                {
                alt19=3;
                }
                break;
            case RULE_LF:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2393:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleLCs4732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SP_0, grammarAccess.getLCsAccess().getSPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2401:10: this_CR_1= RULE_CR
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleLCs4758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getLCsAccess().getCRTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2409:10: this_TAB_2= RULE_TAB
                    {
                    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLCs4784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TAB_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_2, grammarAccess.getLCsAccess().getTABTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2417:10: this_LF_3= RULE_LF
                    {
                    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleLCs4810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LF_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_3, grammarAccess.getLCsAccess().getLFTerminalRuleCall_3()); 
                          
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

    // $ANTLR start synpred1_InternalLangage_while
    public final void synpred1_InternalLangage_while_fragment() throws RecognitionException {   
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:105:2: ( ruleLC )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:105:2: ruleLC
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleLC_in_synpred1_InternalLangage_while157);
        ruleLC();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLangage_while

    // $ANTLR start synpred10_InternalLangage_while
    public final void synpred10_InternalLangage_while_fragment() throws RecognitionException {   
        EObject lv_if_4_0 = null;


        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:625:6: ( ( (lv_if_4_0= ruleIf ) ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:625:6: ( (lv_if_4_0= ruleIf ) )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:625:6: ( (lv_if_4_0= ruleIf ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:626:1: (lv_if_4_0= ruleIf )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:626:1: (lv_if_4_0= ruleIf )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:627:3: lv_if_4_0= ruleIf
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCommandAccess().getIfIfParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIf_in_synpred10_InternalLangage_while1198);
        lv_if_4_0=ruleIf();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLangage_while

    // $ANTLR start synpred14_InternalLangage_while
    public final void synpred14_InternalLangage_while_fragment() throws RecognitionException {   
        EObject lv_exs_0_0 = null;


        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:2: ( ( (lv_exs_0_0= ruleExprSimple ) ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:2: ( (lv_exs_0_0= ruleExprSimple ) )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1560:2: ( (lv_exs_0_0= ruleExprSimple ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1561:1: (lv_exs_0_0= ruleExprSimple )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1561:1: (lv_exs_0_0= ruleExprSimple )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1562:3: lv_exs_0_0= ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprAccess().getExsExprSimpleParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred14_InternalLangage_while3004);
        lv_exs_0_0=ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalLangage_while

    // $ANTLR start synpred26_InternalLangage_while
    public final void synpred26_InternalLangage_while_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exS1_1_0 = null;

        EObject lv_exS2_3_0 = null;


        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:2: ( (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:2: (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:2: (otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')' )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2151:4: otherlv_0= '(' ( (lv_exS1_1_0= ruleExprSimple ) ) otherlv_2= '=?' ( (lv_exS2_3_0= ruleExprSimple ) ) otherlv_4= ')'
        {
        otherlv_0=(Token)match(input,38,FOLLOW_38_in_synpred26_InternalLangage_while4189); if (state.failed) return ;
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2155:1: ( (lv_exS1_1_0= ruleExprSimple ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2156:1: (lv_exS1_1_0= ruleExprSimple )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2156:1: (lv_exS1_1_0= ruleExprSimple )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2157:3: lv_exS1_1_0= ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprEqAccess().getExS1ExprSimpleParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred26_InternalLangage_while4210);
        lv_exS1_1_0=ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,47,FOLLOW_47_in_synpred26_InternalLangage_while4222); if (state.failed) return ;
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2177:1: ( (lv_exS2_3_0= ruleExprSimple ) )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2178:1: (lv_exS2_3_0= ruleExprSimple )
        {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2178:1: (lv_exS2_3_0= ruleExprSimple )
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:2179:3: lv_exS2_3_0= ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprEqAccess().getExS2ExprSimpleParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred26_InternalLangage_while4243);
        lv_exS2_3_0=ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,41,FOLLOW_41_in_synpred26_InternalLangage_while4255); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalLangage_while

    // Delegated rules

    public final boolean synpred1_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLangage_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred26_InternalLangage_while() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalLangage_while_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleModel137 = new BitSet(new long[]{0x0000000000040780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleModel157 = new BitSet(new long[]{0x0000000000040782L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunction242 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFunction261 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_ruleSYMB_in_ruleFunction281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction293 = new BitSet(new long[]{0x0000000000100780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFunction312 = new BitSet(new long[]{0x0000000000100780L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleFunction332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefinition415 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleDefinition434 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleInput_in_ruleDefinition454 = new BitSet(new long[]{0x0000000000200780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleDefinition473 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDefinition484 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleDefinition505 = new BitSet(new long[]{0x0000000000200780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleDefinition524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDefinition535 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDefinition547 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleDefinition566 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleDefinition586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleInput678 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleInput691 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleInput712 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleOutput806 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleOutput819 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleOutput840 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands934 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCommands947 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommands966 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands986 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCommand1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleCommand1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleCommand1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleCommand1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleCommand1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_ruleCommand1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfconfort_in_ruleCommand1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleAssign1344 = new BitSet(new long[]{0x0000000004000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleAssign1363 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssign1374 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleAssign1393 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleAssign1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleWhile1496 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1515 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleWhile1535 = new BitSet(new long[]{0x0000000010000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleWhile1565 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1584 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleWhile1604 = new BitSet(new long[]{0x0000000020000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1623 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWhile1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFor1717 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1736 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFor1756 = new BitSet(new long[]{0x0000000010000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1775 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFor1786 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1805 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleFor1825 = new BitSet(new long[]{0x0000000020000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1844 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFor1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIf1938 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1957 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIf1977 = new BitSet(new long[]{0x0000000100000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1996 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIf2007 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2026 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleIf2046 = new BitSet(new long[]{0x0000000200000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2065 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIf2076 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2095 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleIf2115 = new BitSet(new long[]{0x0000000400000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2134 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIf2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleForeach2228 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2247 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForeach2267 = new BitSet(new long[]{0x0000001000000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2286 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleForeach2297 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2316 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForeach2336 = new BitSet(new long[]{0x0000000010000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2355 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForeach2366 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2385 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleForeach2405 = new BitSet(new long[]{0x0000000020000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2424 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleForeach2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfconfort_in_entryRuleIfconfort2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfconfort2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIfconfort2518 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIfconfort2537 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfconfort2557 = new BitSet(new long[]{0x0000000100000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIfconfort2576 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIfconfort2587 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIfconfort2606 = new BitSet(new long[]{0x00000008CA000790L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleIfconfort2626 = new BitSet(new long[]{0x0000000400000780L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIfconfort2645 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIfconfort2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleVars2748 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleVars2761 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleVars2782 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2876 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleExprs2889 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2910 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExprSimple3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleExprSimple3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_ruleExprSimple3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple3206 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple3226 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple3255 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple3292 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple3324 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple3344 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple3373 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple3408 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple3428 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple3460 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_ruleSYMB_in_ruleExprSimple3481 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple3502 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr3551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_ruleLExpr3605 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLExpr3625 = new BitSet(new long[]{0x00004060000007D2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3718 = new BitSet(new long[]{0x0000100000000782L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3738 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExprAnd3749 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3768 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3788 = new BitSet(new long[]{0x0000100000000782L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3882 = new BitSet(new long[]{0x0000200000000782L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3902 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExprOr3913 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3932 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3952 = new BitSet(new long[]{0x0000200000000782L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot3990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprNot4038 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprNot4057 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprEq4189 = new BitSet(new long[]{0x00000060000007D0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq4210 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprEq4222 = new BitSet(new long[]{0x00000060000007D0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq4243 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprEq4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprEq4275 = new BitSet(new long[]{0x00004060000007D0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq4296 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprEq4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_entryRuleVAR4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASEVAR_in_ruleVAR4397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CONF_in_ruleVAR4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSYMB_in_entryRuleSYMB4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSYMB4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASESYMB_in_ruleSYMB4512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CONF_in_ruleSYMB4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC4576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_ruleLC4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCs_in_entryRuleLCs4681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCs4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleLCs4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleLCs4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLCs4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleLCs4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_synpred1_InternalLangage_while157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_synpred10_InternalLangage_while1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred14_InternalLangage_while3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred26_InternalLangage_while4189 = new BitSet(new long[]{0x00000060000007D0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred26_InternalLangage_while4210 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred26_InternalLangage_while4222 = new BitSet(new long[]{0x00000060000007D0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred26_InternalLangage_while4243 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred26_InternalLangage_while4255 = new BitSet(new long[]{0x0000000000000002L});

}