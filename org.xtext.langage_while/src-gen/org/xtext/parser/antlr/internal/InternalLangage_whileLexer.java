package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangage_whileLexer extends Lexer {
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

    public InternalLangage_whileLexer() {;} 
    public InternalLangage_whileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLangage_whileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:11:7: ( 'function' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:12:7: ( ':' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:13:7: ( 'read' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:14:7: ( '%' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:15:7: ( 'write' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:16:7: ( ',' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:17:7: ( ';' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:18:7: ( 'nop' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:19:7: ( ':=' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:20:7: ( 'while' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:20:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:21:7: ( 'do' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:22:7: ( 'od' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:22:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:23:7: ( 'for' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:23:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:24:7: ( 'if' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:25:7: ( 'then' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:25:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:26:7: ( 'else' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:27:7: ( 'fi' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:27:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:28:7: ( 'foreach' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:28:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:29:7: ( 'in' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:30:7: ( 'nil' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:30:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:31:7: ( '(' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:32:7: ( 'cons' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:32:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:33:7: ( ')' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:34:7: ( 'list' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:34:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:35:7: ( 'hd' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:35:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:36:7: ( 'tl' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:36:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:37:7: ( 'and' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:37:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:38:7: ( 'or' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:39:7: ( 'not' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:39:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:40:7: ( '=?' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:40:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_VAR"
    public final void mRULE_VAR() throws RecognitionException {
        try {
            int _type = RULE_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1945:10: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1945:12: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('A','Z'); 
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1945:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_CONF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR"

    // $ANTLR start "RULE_SYM"
    public final void mRULE_SYM() throws RecognitionException {
        try {
            int _type = RULE_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1947:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1947:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('a','z'); 
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1947:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_CONF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYM"

    // $ANTLR start "RULE_CONF"
    public final void mRULE_CONF() throws RecognitionException {
        try {
            int _type = RULE_CONF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:11: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' )
            	    int alt3=7;
            	    switch ( input.LA(1) ) {
            	    case '-':
            	        {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='>') ) {
            	            alt3=7;
            	        }
            	        else if ( ((LA3_1>='0' && LA3_1<='9')||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='a' && LA3_1<='z')) ) {
            	            alt3=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case '+':
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case '.':
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case '/':
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case '_':
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case '&':
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:15: '-'
            	            {
            	            match('-'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:19: '+'
            	            {
            	            match('+'); 

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:23: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:27: '/'
            	            {
            	            match('/'); 

            	            }
            	            break;
            	        case 5 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:31: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;
            	        case 6 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:35: '&'
            	            {
            	            match('&'); 

            	            }
            	            break;
            	        case 7 :
            	            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:39: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1949:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONF"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            int _type = RULE_SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1951:9: ( ' ' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1951:11: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_CR"
    public final void mRULE_CR() throws RecognitionException {
        try {
            int _type = RULE_CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1953:9: ( '\\n' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1953:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CR"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1955:10: ( '\\t' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1955:12: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_LF"
    public final void mRULE_LF() throws RecognitionException {
        try {
            int _type = RULE_LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1957:9: ( '\\r' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1957:11: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1959:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1959:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1959:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1959:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1959:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1961:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1961:12: ( '0' .. '9' )+
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1961:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1961:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1963:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1965:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1965:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1965:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1965:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1967:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1969:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1969:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1969:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1971:16: ( . )
            // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1971:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=44;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:190: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 32 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:199: RULE_SYM
                {
                mRULE_SYM(); 

                }
                break;
            case 33 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:208: RULE_CONF
                {
                mRULE_CONF(); 

                }
                break;
            case 34 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:218: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 35 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:226: RULE_CR
                {
                mRULE_CR(); 

                }
                break;
            case 36 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:234: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 37 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:243: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 38 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:251: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:259: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:268: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:280: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:296: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:312: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../org.xtext.langage_while/src-gen/org/xtext/parser/antlr/internal/InternalLangage_while.g:1:320: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\52\1\57\1\52\1\uffff\1\52\2\uffff\6\52\1\uffff\1\52"+
        "\1\uffff\3\52\1\46\2\52\4\46\1\52\1\46\1\uffff\1\116\1\120\1\121"+
        "\1\122\1\46\1\uffff\2\46\1\uffff\2\52\1\127\1\uffff\1\52\1\uffff"+
        "\1\52\2\uffff\1\52\1\uffff\2\52\2\uffff\2\52\1\137\1\140\1\141\1"+
        "\142\1\143\1\52\1\145\1\52\1\uffff\1\52\1\uffff\1\52\1\151\1\52"+
        "\1\uffff\1\52\1\uffff\1\52\3\uffff\1\52\7\uffff\1\52\1\157\1\uffff"+
        "\4\52\1\163\1\164\1\165\5\uffff\1\52\1\uffff\3\52\1\uffff\1\172"+
        "\4\52\1\uffff\1\175\2\52\3\uffff\1\u0080\1\u0081\1\u0082\1\u0083"+
        "\1\uffff\2\52\1\uffff\1\u0086\1\u0087\4\uffff\2\52\2\uffff\1\52"+
        "\1\u008b\1\u008c\2\uffff";
    static final String DFA17_eofS =
        "\u008d\uffff";
    static final String DFA17_minS =
        "\1\0\1\41\1\75\1\41\1\uffff\1\41\2\uffff\6\41\1\uffff\1\41\1\uffff"+
        "\3\41\1\77\2\41\3\60\1\52\2\60\1\uffff\4\11\1\101\1\uffff\2\0\1"+
        "\uffff\3\41\1\uffff\1\41\1\uffff\1\60\2\uffff\1\41\1\uffff\2\41"+
        "\2\uffff\12\41\1\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1"+
        "\60\3\uffff\1\41\7\uffff\2\41\1\uffff\7\41\5\uffff\1\41\1\uffff"+
        "\3\41\1\uffff\2\41\1\60\2\41\1\uffff\3\41\3\uffff\4\41\1\uffff\2"+
        "\41\1\uffff\2\41\4\uffff\2\41\2\uffff\3\41\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1"+
        "\172\1\uffff\3\172\1\77\10\172\1\uffff\4\40\1\172\1\uffff\2\uffff"+
        "\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff"+
        "\2\172\2\uffff\12\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172"+
        "\1\uffff\1\172\3\uffff\1\172\7\uffff\2\172\1\uffff\7\172\5\uffff"+
        "\1\172\1\uffff\3\172\1\uffff\5\172\1\uffff\3\172\3\uffff\4\172\1"+
        "\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\uffff\1\27\14\uffff"+
        "\1\41\5\uffff\1\47\2\uffff\1\54\3\uffff\1\46\1\uffff\1\40\1\uffff"+
        "\1\11\1\2\1\uffff\1\4\2\uffff\1\6\1\7\12\uffff\1\25\1\uffff\1\27"+
        "\3\uffff\1\36\1\uffff\1\37\1\uffff\1\41\1\51\1\52\1\uffff\1\42\1"+
        "\53\1\43\1\44\1\45\1\47\1\50\2\uffff\1\21\7\uffff\1\13\1\14\1\34"+
        "\1\16\1\23\1\uffff\1\32\3\uffff\1\31\5\uffff\1\15\3\uffff\1\10\1"+
        "\35\1\24\4\uffff\1\33\2\uffff\1\3\2\uffff\1\17\1\20\1\26\1\30\2"+
        "\uffff\1\5\1\12\3\uffff\1\22\1\1";
    static final String DFA17_specialS =
        "\1\0\43\uffff\1\2\1\1\147\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\46\1\40\1\37\2\46\1\41\22\46\1\36\1\35\1\44\2\46\1\4\1"+
            "\34\1\45\1\16\1\20\1\46\1\30\1\6\1\27\1\31\1\32\12\43\1\2\1"+
            "\7\1\46\1\24\1\46\1\35\1\46\32\25\3\46\1\42\1\33\1\46\1\23\1"+
            "\26\1\17\1\11\1\15\1\1\1\26\1\22\1\13\2\26\1\21\1\26\1\10\1"+
            "\12\2\26\1\3\1\26\1\14\2\26\1\5\3\26\uff85\46",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\51\5\53\1\50"+
            "\5\53\1\47\5\53",
            "\1\56",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\60\25\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\7\53\1\63\11\53\1\62"+
            "\10\53",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\67\5\53\1\66"+
            "\13\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\16\53\1\70\13\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\3\53\1\71\15\53\1\72"+
            "\10\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\5\53\1\73\7\53\1\74"+
            "\14\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\7\53\1\75\3\53\1\76"+
            "\16\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\13\53\1\77\16\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\16\53\1\101\13\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\103\21\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\3\53\1\104\26\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\15\53\1\105\14\53",
            "\1\106",
            "\1\110\4\uffff\1\110\4\uffff\1\110\1\uffff\3\110\12\107\5"+
            "\uffff\1\110\1\uffff\32\107\4\uffff\1\111\1\uffff\32\107",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\12\112\4\uffff\1\112\2\uffff\32\112\6\uffff\32\112",
            "\12\112\7\uffff\32\112\6\uffff\32\112",
            "\12\112\7\uffff\32\112\6\uffff\32\112",
            "\1\113\4\uffff\1\114\12\112\7\uffff\32\112\6\uffff\32\112",
            "\12\115\7\uffff\32\115\6\uffff\32\115",
            "\12\112\7\uffff\32\112\6\uffff\32\112",
            "",
            "\2\117\2\uffff\1\117\22\uffff\1\117",
            "\2\117\2\uffff\1\117\22\uffff\1\117",
            "\2\117\2\uffff\1\117\22\uffff\1\117",
            "\2\117\2\uffff\1\117\22\uffff\1\117",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\124",
            "\0\124",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\15\53\1\125\14\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\21\53\1\126\10\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            "\12\130\7\uffff\32\130\6\uffff\32\130",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\1\131\31\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\132\21\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\133\21\53",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\17\53\1\134\3\53\1"+
            "\135\6\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\13\53\1\136\16\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\144\25\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\22\53\1\146\7\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\15\53\1\147\14\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\22\53\1\150\7\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\3\53\1\152\26\53",
            "",
            "\1\110\4\uffff\1\110\4\uffff\1\110\1\uffff\3\110\12\107\5"+
            "\uffff\1\110\1\uffff\32\107\4\uffff\1\111\1\uffff\32\107",
            "",
            "\12\153\7\uffff\32\153\6\uffff\32\153",
            "",
            "",
            "",
            "\1\112\4\uffff\1\112\4\uffff\1\112\1\uffff\3\112\12\115\5"+
            "\uffff\1\112\1\uffff\32\115\4\uffff\1\154\1\uffff\32\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\2\53\1\155\27\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\156\25\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\130\5\uffff"+
            "\1\54\1\uffff\32\130\4\uffff\1\55\1\uffff\32\130",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\3\53\1\160\26\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\23\53\1\161\6\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\13\53\1\162\16\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\15\53\1\166\14\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\167\25\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\22\53\1\170\7\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\23\53\1\171\6\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\110\4\uffff\1\110\4\uffff\1\110\1\uffff\3\110\12\153\5"+
            "\uffff\1\110\1\uffff\32\153\4\uffff\1\111\1\uffff\32\153",
            "\12\115\7\uffff\32\115\6\uffff\32\115",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\23\53\1\173\6\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\1\174\31\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\176\25\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\4\53\1\177\25\53",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\10\53\1\u0084\21\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\2\53\1\u0085\27\53",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\16\53\1\u0088\13\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\7\53\1\u0089\22\53",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\15\53\1\u008a\14\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\53\5\uffff"+
            "\1\54\1\uffff\32\53\4\uffff\1\55\1\uffff\32\53",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0==':') ) {s = 2;}

                        else if ( (LA17_0=='r') ) {s = 3;}

                        else if ( (LA17_0=='%') ) {s = 4;}

                        else if ( (LA17_0=='w') ) {s = 5;}

                        else if ( (LA17_0==',') ) {s = 6;}

                        else if ( (LA17_0==';') ) {s = 7;}

                        else if ( (LA17_0=='n') ) {s = 8;}

                        else if ( (LA17_0=='d') ) {s = 9;}

                        else if ( (LA17_0=='o') ) {s = 10;}

                        else if ( (LA17_0=='i') ) {s = 11;}

                        else if ( (LA17_0=='t') ) {s = 12;}

                        else if ( (LA17_0=='e') ) {s = 13;}

                        else if ( (LA17_0=='(') ) {s = 14;}

                        else if ( (LA17_0=='c') ) {s = 15;}

                        else if ( (LA17_0==')') ) {s = 16;}

                        else if ( (LA17_0=='l') ) {s = 17;}

                        else if ( (LA17_0=='h') ) {s = 18;}

                        else if ( (LA17_0=='a') ) {s = 19;}

                        else if ( (LA17_0=='=') ) {s = 20;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')) ) {s = 21;}

                        else if ( (LA17_0=='b'||LA17_0=='g'||(LA17_0>='j' && LA17_0<='k')||LA17_0=='m'||(LA17_0>='p' && LA17_0<='q')||LA17_0=='s'||(LA17_0>='u' && LA17_0<='v')||(LA17_0>='x' && LA17_0<='z')) ) {s = 22;}

                        else if ( (LA17_0=='-') ) {s = 23;}

                        else if ( (LA17_0=='+') ) {s = 24;}

                        else if ( (LA17_0=='.') ) {s = 25;}

                        else if ( (LA17_0=='/') ) {s = 26;}

                        else if ( (LA17_0=='_') ) {s = 27;}

                        else if ( (LA17_0=='&') ) {s = 28;}

                        else if ( (LA17_0=='!'||LA17_0=='?') ) {s = 29;}

                        else if ( (LA17_0==' ') ) {s = 30;}

                        else if ( (LA17_0=='\n') ) {s = 31;}

                        else if ( (LA17_0=='\t') ) {s = 32;}

                        else if ( (LA17_0=='\r') ) {s = 33;}

                        else if ( (LA17_0=='^') ) {s = 34;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 35;}

                        else if ( (LA17_0=='\"') ) {s = 36;}

                        else if ( (LA17_0=='\'') ) {s = 37;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='$')||LA17_0=='*'||LA17_0=='<'||LA17_0=='>'||LA17_0=='@'||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( ((LA17_37>='\u0000' && LA17_37<='\uFFFF')) ) {s = 84;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( ((LA17_36>='\u0000' && LA17_36<='\uFFFF')) ) {s = 84;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}