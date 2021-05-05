// Generated from Calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MUL=10, DIV=11, MOD=12, ADD=13, SUB=14, INC=15, DEC=16, WHITESPACE=17, 
		ID=18, INT=19, FLOAT=20, NEWLINE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"MUL", "DIV", "MOD", "ADD", "SUB", "INC", "DEC", "WHITESPACE", "ID", 
			"INT", "FLOAT", "NEWLINE", "NUMBER", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'int'", "'float'", "'abs('", "')'", "'ceil('", "'floor('", 
			"'round('", "'('", "'*'", "'/'", "'%'", "'+'", "'-'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MUL", "DIV", 
			"MOD", "ADD", "SUB", "INC", "DEC", "WHITESPACE", "ID", "INT", "FLOAT", 
			"NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\6\23p\n\23\r\23\16"+
		"\23q\3\24\6\24u\n\24\r\24\16\24v\3\25\6\25z\n\25\r\25\16\25{\3\25\3\25"+
		"\6\25\u0080\n\25\r\25\16\25\u0081\5\25\u0084\n\25\3\26\6\26\u0087\n\26"+
		"\r\26\16\26\u0088\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\3\2\5\4\2\13\13\"\"\4\2C\\c|\4\2\f\f\17\17\2\u0091\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\67"+
		"\3\2\2\2\t=\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17J\3\2\2\2\21Q\3\2\2\2\23"+
		"X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2"+
		"\37d\3\2\2\2!g\3\2\2\2#j\3\2\2\2%o\3\2\2\2\'t\3\2\2\2)y\3\2\2\2+\u0086"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63\64"+
		"\7k\2\2\64\65\7p\2\2\65\66\7v\2\2\66\6\3\2\2\2\678\7h\2\289\7n\2\29:\7"+
		"q\2\2:;\7c\2\2;<\7v\2\2<\b\3\2\2\2=>\7c\2\2>?\7d\2\2?@\7u\2\2@A\7*\2\2"+
		"A\n\3\2\2\2BC\7+\2\2C\f\3\2\2\2DE\7e\2\2EF\7g\2\2FG\7k\2\2GH\7n\2\2HI"+
		"\7*\2\2I\16\3\2\2\2JK\7h\2\2KL\7n\2\2LM\7q\2\2MN\7q\2\2NO\7t\2\2OP\7*"+
		"\2\2P\20\3\2\2\2QR\7t\2\2RS\7q\2\2ST\7w\2\2TU\7p\2\2UV\7f\2\2VW\7*\2\2"+
		"W\22\3\2\2\2XY\7*\2\2Y\24\3\2\2\2Z[\7,\2\2[\26\3\2\2\2\\]\7\61\2\2]\30"+
		"\3\2\2\2^_\7\'\2\2_\32\3\2\2\2`a\7-\2\2a\34\3\2\2\2bc\7/\2\2c\36\3\2\2"+
		"\2de\7-\2\2ef\7-\2\2f \3\2\2\2gh\7/\2\2hi\7/\2\2i\"\3\2\2\2jk\t\2\2\2"+
		"kl\3\2\2\2lm\b\22\2\2m$\3\2\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2r&\3\2\2\2su\5-\27\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w(\3\2\2\2xz\5-\27\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0083"+
		"\3\2\2\2}\177\5/\30\2~\u0080\5-\27\2\177~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083}\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084*\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		",\3\2\2\2\u008a\u008b\4\62;\2\u008b.\3\2\2\2\u008c\u008d\7.\2\2\u008d"+
		"\60\3\2\2\2\t\2qv{\u0081\u0083\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}