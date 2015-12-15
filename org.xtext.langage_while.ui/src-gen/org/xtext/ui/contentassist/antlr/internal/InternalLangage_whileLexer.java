package org.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangage_whileLexer extends Lexer {
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

    public InternalLangage_whileLexer() {;} 
    public InternalLangage_whileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLangage_whileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:11:7: ( 'cons' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:11:9: 'cons'
            {
            match("cons"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:12:7: ( 'list' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:12:9: 'list'
            {
            match("list"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:13:7: ( 'hd' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:13:9: 'hd'
            {
            match("hd"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:14:7: ( 'tl' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:14:9: 'tl'
            {
            match("tl"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:15:7: ( 'function' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:15:9: 'function'
            {
            match("function"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:16:7: ( ':' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:16:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:17:7: ( 'read' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:17:9: 'read'
            {
            match("read"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:18:7: ( '%' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:18:9: '%'
            {
            match('%'); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:19:7: ( 'write' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:19:9: 'write'
            {
            match("write"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:20:7: ( ',' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:20:9: ','
            {
            match(','); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:21:7: ( ';' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:21:9: ';'
            {
            match(';'); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:22:7: ( ':=' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:22:9: ':='
            {
            match(":="); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:23:7: ( 'while' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:23:9: 'while'
            {
            match("while"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:24:7: ( 'do' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:24:9: 'do'
            {
            match("do"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:25:7: ( 'od' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:25:9: 'od'
            {
            match("od"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:26:7: ( 'for' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:26:9: 'for'
            {
            match("for"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:27:7: ( 'if' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:27:9: 'if'
            {
            match("if"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:28:7: ( 'then' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:28:9: 'then'
            {
            match("then"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:29:7: ( 'else' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:29:9: 'else'
            {
            match("else"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:30:7: ( 'fi' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:30:9: 'fi'
            {
            match("fi"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:31:7: ( 'foreach' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:31:9: 'foreach'
            {
            match("foreach"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:32:7: ( 'in' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:32:9: 'in'
            {
            match("in"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:33:7: ( '(' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:33:9: '('
            {
            match('('); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:34:7: ( ')' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:34:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:35:7: ( 'and' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:35:9: 'and'
            {
            match("and"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:36:7: ( 'or' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:36:9: 'or'
            {
            match("or"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:37:7: ( 'not' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:37:9: 'not'
            {
            match("not"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:38:7: ( '=?' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:38:9: '=?'
            {
            match("=?"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:39:7: ( 'nop' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:39:9: 'nop'
            {
            match("nop"); 


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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:40:7: ( 'nil' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:40:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_BASEVAR"
    public final void mRULE_BASEVAR() throws RecognitionException {
        try {
            int _type = RULE_BASEVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6526:14: ( 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6526:16: 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            matchRange('A','Z'); 
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6526:25: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASEVAR"

    // $ANTLR start "RULE_BASESYMB"
    public final void mRULE_BASESYMB() throws RecognitionException {
        try {
            int _type = RULE_BASESYMB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6528:15: ( 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6528:17: 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            matchRange('a','z'); 
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6528:26: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASESYMB"

    // $ANTLR start "RULE_CONF"
    public final void mRULE_CONF() throws RecognitionException {
        try {
            int _type = RULE_CONF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:11: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' )
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
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:15: '-'
            	            {
            	            match('-'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:19: '+'
            	            {
            	            match('+'); 

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:23: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:27: '/'
            	            {
            	            match('/'); 

            	            }
            	            break;
            	        case 5 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:31: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;
            	        case 6 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:35: '&'
            	            {
            	            match('&'); 

            	            }
            	            break;
            	        case 7 :
            	            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:39: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:45: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
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

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6530:77: ( '?' | '!' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_CONF"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            int _type = RULE_SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6532:9: ( ' ' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6532:11: ' '
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6534:9: ( '\\n' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6534:11: '\\n'
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6536:10: ( '\\t' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6536:12: '\\t'
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6538:9: ( '\\r' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6538:11: '\\r'
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6540:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6540:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6540:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6540:11: '^'
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

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6540:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
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
            	    break loop8;
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6542:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6542:12: ( '0' .. '9' )+
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6542:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6542:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6544:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6546:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6546:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6546:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6546:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6548:41: '\\r'
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6550:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6550:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6550:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6552:16: ( . )
            // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:6552:18: .
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
        // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BASEVAR | RULE_BASESYMB | RULE_CONF | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=44;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:190: RULE_BASEVAR
                {
                mRULE_BASEVAR(); 

                }
                break;
            case 32 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:203: RULE_BASESYMB
                {
                mRULE_BASESYMB(); 

                }
                break;
            case 33 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:217: RULE_CONF
                {
                mRULE_CONF(); 

                }
                break;
            case 34 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:227: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 35 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:235: RULE_CR
                {
                mRULE_CR(); 

                }
                break;
            case 36 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:243: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 37 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:252: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 38 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:260: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:268: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:277: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:289: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:305: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:321: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../org.xtext.langage_while.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalLangage_while.g:1:329: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\36\5\52\1\64\1\52\1\uffff\1\52\2\uffff\4\52\2\uffff\2\52\1\47"+
        "\1\110\1\52\4\47\1\53\1\47\2\uffff\1\114\1\116\1\117\1\120\1\47"+
        "\1\uffff\2\47\1\uffff\2\52\2\uffff\1\52\1\125\1\126\3\52\1\132\2"+
        "\uffff\1\52\1\uffff\2\52\2\uffff\1\136\1\137\1\140\1\141\1\142\1"+
        "\52\2\uffff\3\52\1\uffff\1\110\3\uffff\1\36\7\uffff\2\52\2\uffff"+
        "\2\52\1\156\1\uffff\3\52\5\uffff\1\52\1\163\1\164\1\165\1\166\1"+
        "\53\1\167\1\170\1\171\2\52\1\uffff\1\174\2\52\1\177\7\uffff\2\52"+
        "\1\uffff\1\u0082\1\u0083\1\uffff\2\52\2\uffff\1\52\1\u0087\1\u0088"+
        "\2\uffff";
    static final String DFA18_eofS =
        "\u0089\uffff";
    static final String DFA18_minS =
        "\1\0\5\60\1\75\1\60\1\uffff\1\60\2\uffff\4\60\2\uffff\2\60\1\77"+
        "\5\60\1\52\2\60\2\uffff\4\11\1\101\1\uffff\2\0\1\uffff\2\60\2\uffff"+
        "\7\60\2\uffff\1\60\1\uffff\2\60\2\uffff\6\60\2\uffff\3\60\1\uffff"+
        "\1\60\3\uffff\1\60\7\uffff\2\60\2\uffff\3\60\1\uffff\3\60\5\uffff"+
        "\13\60\1\uffff\4\60\7\uffff\2\60\1\uffff\2\60\1\uffff\2\60\2\uffff"+
        "\3\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\5\172\1\75\1\172\1\uffff\1\172\2\uffff\4\172\2\uffff\2"+
        "\172\1\77\10\172\2\uffff\4\40\1\172\1\uffff\2\uffff\1\uffff\2\172"+
        "\2\uffff\7\172\2\uffff\1\172\1\uffff\2\172\2\uffff\6\172\2\uffff"+
        "\3\172\1\uffff\1\172\3\uffff\1\172\7\uffff\2\172\2\uffff\3\172\1"+
        "\uffff\3\172\5\uffff\13\172\1\uffff\4\172\7\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA18_acceptS =
        "\10\uffff\1\10\1\uffff\1\12\1\13\4\uffff\1\27\1\30\13\uffff\2\41"+
        "\5\uffff\1\47\2\uffff\1\54\2\uffff\1\40\1\46\7\uffff\1\14\1\6\1"+
        "\uffff\1\10\2\uffff\1\12\1\13\6\uffff\1\27\1\30\3\uffff\1\34\1\uffff"+
        "\1\37\1\51\1\52\1\uffff\1\42\1\53\1\43\1\44\1\45\1\47\1\50\2\uffff"+
        "\1\3\1\4\3\uffff\1\24\3\uffff\1\16\1\17\1\32\1\21\1\26\13\uffff"+
        "\1\20\4\uffff\1\31\1\33\1\35\1\36\1\1\1\2\1\22\2\uffff\1\7\2\uffff"+
        "\1\23\2\uffff\1\11\1\15\3\uffff\1\25\1\5";
    static final String DFA18_specialS =
        "\1\1\44\uffff\1\2\1\0\142\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\47\1\41\1\40\2\47\1\42\22\47\1\37\1\35\1\45\2\47\1\10\1"+
            "\34\1\46\1\20\1\21\1\47\1\30\1\12\1\27\1\31\1\32\12\44\1\6\1"+
            "\13\1\47\1\24\1\47\1\35\1\47\32\25\3\47\1\43\1\33\1\47\1\22"+
            "\1\26\1\1\1\14\1\17\1\5\1\26\1\3\1\16\2\26\1\2\1\26\1\23\1\15"+
            "\2\26\1\7\1\26\1\4\2\26\1\11\3\26\uff85\47",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\16\51\1\50\13\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\54\21\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\3\51\1\55\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\7\51\1\57\3\51\1"+
            "\56\16\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\62\5\51"+
            "\1\61\5\51\1\60\5\51",
            "\1\63",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\65\25\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\7\51\1\70\11\51"+
            "\1\67\10\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\16\51\1\73\13\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\3\51\1\74\15\51"+
            "\1\75\10\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\5\51\1\76\7\51\1"+
            "\77\14\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\13\51\1\100\16\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\15\51\1\103\14\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\105\5\51"+
            "\1\104\13\51",
            "\1\106",
            "\12\107\7\uffff\32\107\4\uffff\1\53\1\uffff\32\107",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\36\4\uffff\1\36\2\uffff\32\36\6\uffff\32\36",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\111\4\uffff\1\112\12\36\7\uffff\32\36\6\uffff\32\36",
            "\12\113\7\uffff\32\113\6\uffff\32\113",
            "\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "",
            "\2\115\2\uffff\1\115\22\uffff\1\115",
            "\2\115\2\uffff\1\115\22\uffff\1\115",
            "\2\115\2\uffff\1\115\22\uffff\1\115",
            "\2\115\2\uffff\1\115\22\uffff\1\115",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\122",
            "\0\122",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\15\51\1\123\14\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\22\51\1\124\7\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\127\25\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\15\51\1\130\14\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\21\51\1\131\10\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\1\133\31\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\134\21\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\135\21\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\22\51\1\143\7\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\3\51\1\144\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\17\51\1\146\3\51"+
            "\1\145\6\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\13\51\1\147\16\51",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\53\1\uffff\32\107",
            "",
            "",
            "",
            "\12\113\7\uffff\32\113\4\uffff\1\150\1\uffff\32\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\22\51\1\151\7\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\23\51\1\152\6\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\15\51\1\153\14\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\2\51\1\154\27\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\155\25\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\3\51\1\157\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\23\51\1\160\6\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\13\51\1\161\16\51",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\162\25\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\113\7\uffff\32\113\6\uffff\32\113",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\23\51\1\172\6\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\1\173\31\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\175\25\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\4\51\1\176\25\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\10\51\1\u0080\21"+
            "\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\2\51\1\u0081\27"+
            "\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\16\51\1\u0084\13"+
            "\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\7\51\1\u0085\22"+
            "\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\15\51\1\u0086\14"+
            "\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\53\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BASEVAR | RULE_BASESYMB | RULE_CONF | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_38 = input.LA(1);

                        s = -1;
                        if ( ((LA18_38>='\u0000' && LA18_38<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='c') ) {s = 1;}

                        else if ( (LA18_0=='l') ) {s = 2;}

                        else if ( (LA18_0=='h') ) {s = 3;}

                        else if ( (LA18_0=='t') ) {s = 4;}

                        else if ( (LA18_0=='f') ) {s = 5;}

                        else if ( (LA18_0==':') ) {s = 6;}

                        else if ( (LA18_0=='r') ) {s = 7;}

                        else if ( (LA18_0=='%') ) {s = 8;}

                        else if ( (LA18_0=='w') ) {s = 9;}

                        else if ( (LA18_0==',') ) {s = 10;}

                        else if ( (LA18_0==';') ) {s = 11;}

                        else if ( (LA18_0=='d') ) {s = 12;}

                        else if ( (LA18_0=='o') ) {s = 13;}

                        else if ( (LA18_0=='i') ) {s = 14;}

                        else if ( (LA18_0=='e') ) {s = 15;}

                        else if ( (LA18_0=='(') ) {s = 16;}

                        else if ( (LA18_0==')') ) {s = 17;}

                        else if ( (LA18_0=='a') ) {s = 18;}

                        else if ( (LA18_0=='n') ) {s = 19;}

                        else if ( (LA18_0=='=') ) {s = 20;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')) ) {s = 21;}

                        else if ( (LA18_0=='b'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||(LA18_0>='p' && LA18_0<='q')||LA18_0=='s'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 22;}

                        else if ( (LA18_0=='-') ) {s = 23;}

                        else if ( (LA18_0=='+') ) {s = 24;}

                        else if ( (LA18_0=='.') ) {s = 25;}

                        else if ( (LA18_0=='/') ) {s = 26;}

                        else if ( (LA18_0=='_') ) {s = 27;}

                        else if ( (LA18_0=='&') ) {s = 28;}

                        else if ( (LA18_0=='!'||LA18_0=='?') ) {s = 29;}

                        else if ( (LA18_0==' ') ) {s = 31;}

                        else if ( (LA18_0=='\n') ) {s = 32;}

                        else if ( (LA18_0=='\t') ) {s = 33;}

                        else if ( (LA18_0=='\r') ) {s = 34;}

                        else if ( (LA18_0=='^') ) {s = 35;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 36;}

                        else if ( (LA18_0=='\"') ) {s = 37;}

                        else if ( (LA18_0=='\'') ) {s = 38;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='$')||LA18_0=='*'||LA18_0=='<'||LA18_0=='>'||LA18_0=='@'||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 39;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_37 = input.LA(1);

                        s = -1;
                        if ( ((LA18_37>='\u0000' && LA18_37<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}