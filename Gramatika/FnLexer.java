// Generated from Fn.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLEAN=18, NUMBER=19, WHITESPACE=20, NEWLINE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"DIGIT", "NONZERODIGIT", "TRUE", "FALSE", "MAYBE", "BOOLEAN", "NUMBER", 
			"WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'+'", "'^'", "'^@'", "'['", "'|'", "']'", 
			"'0'", "'<'", "'>'", "'=='", "'if'", "'{'", "'}'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEAN", "NUMBER", "WHITESPACE", 
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


	public FnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fn.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\5"+
		"\23a\n\23\3\24\5\24d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"n\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26z\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0086\n\27\3\30"+
		"\3\30\3\30\5\30\u008b\n\30\3\31\3\31\6\31\u008f\n\31\r\31\16\31\u0090"+
		"\5\31\u0093\n\31\3\32\3\32\3\32\3\32\3\33\5\33\u009a\n\33\3\33\3\33\6"+
		"\33\u009e\n\33\r\33\16\33\u009f\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2"+
		")\2+\2-\2/\24\61\25\63\26\65\27\3\2\5\4\2\62;AA\4\2\63;AA\4\2\13\13\""+
		"\"\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3"+
		"\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17D\3\2"+
		"\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3"+
		"\2\2\2\35S\3\2\2\2\37V\3\2\2\2!X\3\2\2\2#Z\3\2\2\2%`\3\2\2\2\'c\3\2\2"+
		"\2)m\3\2\2\2+y\3\2\2\2-\u0085\3\2\2\2/\u008a\3\2\2\2\61\u008c\3\2\2\2"+
		"\63\u0094\3\2\2\2\65\u009d\3\2\2\2\678\7*\2\28\4\3\2\2\29:\7+\2\2:\6\3"+
		"\2\2\2;<\7,\2\2<\b\3\2\2\2=>\7-\2\2>\n\3\2\2\2?@\7`\2\2@\f\3\2\2\2AB\7"+
		"`\2\2BC\7B\2\2C\16\3\2\2\2DE\7]\2\2E\20\3\2\2\2FG\7~\2\2G\22\3\2\2\2H"+
		"I\7_\2\2I\24\3\2\2\2JK\7\62\2\2K\26\3\2\2\2LM\7>\2\2M\30\3\2\2\2NO\7@"+
		"\2\2O\32\3\2\2\2PQ\7?\2\2QR\7?\2\2R\34\3\2\2\2ST\7k\2\2TU\7h\2\2U\36\3"+
		"\2\2\2VW\7}\2\2W \3\2\2\2XY\7\177\2\2Y\"\3\2\2\2Z[\7g\2\2[\\\7n\2\2\\"+
		"]\7u\2\2]^\7g\2\2^$\3\2\2\2_a\t\2\2\2`_\3\2\2\2a&\3\2\2\2bd\t\3\2\2cb"+
		"\3\2\2\2d(\3\2\2\2ef\7V\2\2fg\7t\2\2gh\7w\2\2hn\7g\2\2ij\7v\2\2jk\7t\2"+
		"\2kl\7w\2\2ln\7g\2\2me\3\2\2\2mi\3\2\2\2n*\3\2\2\2op\7H\2\2pq\7c\2\2q"+
		"r\7n\2\2rs\7u\2\2sz\7g\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xz\7g\2"+
		"\2yo\3\2\2\2yt\3\2\2\2z,\3\2\2\2{|\7O\2\2|}\7c\2\2}~\7{\2\2~\177\7d\2"+
		"\2\177\u0086\7g\2\2\u0080\u0081\7o\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7{\2\2\u0083\u0084\7d\2\2\u0084\u0086\7g\2\2\u0085{\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0086.\3\2\2\2\u0087\u008b\5)\25\2\u0088\u008b\5+\26\2\u0089"+
		"\u008b\5-\27\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\60\3\2\2\2\u008c\u0092\5\'\24\2\u008d\u008f\5%\23\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0093\3\2\2\2\u0093\62\3\2\2"+
		"\2\u0094\u0095\t\4\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\32\2\2\u0097"+
		"\64\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009e\7\f\2\2\u009c\u009e\7\17\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\33\2\2\u00a2"+
		"\66\3\2\2\2\16\2`cmy\u0085\u008a\u0090\u0092\u0099\u009d\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}