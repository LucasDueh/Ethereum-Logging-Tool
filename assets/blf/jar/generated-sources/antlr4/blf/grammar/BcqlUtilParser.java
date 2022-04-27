// Generated from blf/grammar/BcqlUtil.g4 by ANTLR 4.7.2
package blf.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BcqlUtilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, KEY_SET=23, KEY_BLOCKCHAIN=24, 
		KEY_OUTPUT_FOLDER=25, KEY_CONNECTION=26, KEY_IPC=27, KEY_EMISSION_MODE=28, 
		KEY_ABORT_ON_EXCEPTION=29, KEY_ERROR_OUTPUT=30, KEY_BLOCK_RANGE=31, KEY_TRANSACTIONS=32, 
		KEY_SMART_CONTRACT=33, KEY_LOG_ENTRIES=34, KEY_IF=35, KEY_TRANSACTION_INPUT=36, 
		KEY_EMIT=37, KEY_CSV_ROW=38, KEY_LOG_LINE=39, KEY_XES_EVENT=40, KEY_XES_TRACE=41, 
		KEY_EARLIEST=42, KEY_CURRENT=43, KEY_CONTINUOUS=44, KEY_ANY=45, KEY_INDEXED=46, 
		KEY_NOT=47, KEY_AND=48, KEY_OR=49, KEY_IN=50, KEY_AS=51, KEY_SKIP_INDEXED=52, 
		KEY_SKIP_DATA=53, BOOLEAN_LITERAL=54, STRING_LITERAL=55, INT_LITERAL=56, 
		BYTES_LITERAL=57, SOL_BYTE_TYPE=58, SOL_INT_TYPE=59, SOL_ADDRESS_TYPE=60, 
		SOL_BOOL_TYPE=61, SOL_BYTES_LENGTH=62, SOL_UNSIGNED=63, SOL_NUMBER_LENGTH=64, 
		SOL_FIXED_N=65, SOL_STRING_TYPE=66, WS=67, COMMENT=68, LINE_COMMENT=69, 
		Identifier=70;
	public static final int
		RULE_blockNumber = 0, RULE_addressList = 1, RULE_logEntrySignature = 2, 
		RULE_logEntryParameter = 3, RULE_skippableLogEntryParameter = 4, RULE_smartContractQuery = 5, 
		RULE_publicVariableQuery = 6, RULE_publicFunctionQuery = 7, RULE_smartContractParameter = 8, 
		RULE_smartContractQueryParameter = 9, RULE_namedEmitVariable = 10, RULE_xesEmitVariable = 11, 
		RULE_xesTypes = 12, RULE_expressionStatement = 13, RULE_methodStatement = 14, 
		RULE_methodInvocation = 15, RULE_variableDeclarationStatement = 16, RULE_variableAssignmentStatement = 17, 
		RULE_statementExpression = 18, RULE_conditionalExpression = 19, RULE_conditionalOrExpression = 20, 
		RULE_conditionalAndExpression = 21, RULE_conditionalComparisonExpression = 22, 
		RULE_conditionalNotExpression = 23, RULE_conditionalPrimaryExpression = 24, 
		RULE_valueExpression = 25, RULE_comparators = 26, RULE_variableName = 27, 
		RULE_literal = 28, RULE_arrayLiteral = 29, RULE_stringArrayLiteral = 30, 
		RULE_intArrayLiteral = 31, RULE_booleanArrayLiteral = 32, RULE_bytesArrayLiteral = 33, 
		RULE_solTypeRule = 34, RULE_solType = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"blockNumber", "addressList", "logEntrySignature", "logEntryParameter", 
			"skippableLogEntryParameter", "smartContractQuery", "publicVariableQuery", 
			"publicFunctionQuery", "smartContractParameter", "smartContractQueryParameter", 
			"namedEmitVariable", "xesEmitVariable", "xesTypes", "expressionStatement", 
			"methodStatement", "methodInvocation", "variableDeclarationStatement", 
			"variableAssignmentStatement", "statementExpression", "conditionalExpression", 
			"conditionalOrExpression", "conditionalAndExpression", "conditionalComparisonExpression", 
			"conditionalNotExpression", "conditionalPrimaryExpression", "valueExpression", 
			"comparators", "variableName", "literal", "arrayLiteral", "stringArrayLiteral", 
			"intArrayLiteral", "booleanArrayLiteral", "bytesArrayLiteral", "solTypeRule", 
			"solType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'='", "'xs:string'", "'xs:date'", "'xs:int'", 
			"'xs:float'", "'xs:boolean'", "';'", "'=='", "'!='", "'>='", "'>'", "'<'", 
			"'<='", "':'", "'.'", "'{'", "'}'", "'['", "']'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'indexed'", "'!'", "'&&'", 
			"'||'", null, null, "'_indexed_'", "'_'", null, null, null, null, null, 
			null, "'address'", "'bool'", null, "'u'", null, null, "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "KEY_SET", 
			"KEY_BLOCKCHAIN", "KEY_OUTPUT_FOLDER", "KEY_CONNECTION", "KEY_IPC", "KEY_EMISSION_MODE", 
			"KEY_ABORT_ON_EXCEPTION", "KEY_ERROR_OUTPUT", "KEY_BLOCK_RANGE", "KEY_TRANSACTIONS", 
			"KEY_SMART_CONTRACT", "KEY_LOG_ENTRIES", "KEY_IF", "KEY_TRANSACTION_INPUT", 
			"KEY_EMIT", "KEY_CSV_ROW", "KEY_LOG_LINE", "KEY_XES_EVENT", "KEY_XES_TRACE", 
			"KEY_EARLIEST", "KEY_CURRENT", "KEY_CONTINUOUS", "KEY_ANY", "KEY_INDEXED", 
			"KEY_NOT", "KEY_AND", "KEY_OR", "KEY_IN", "KEY_AS", "KEY_SKIP_INDEXED", 
			"KEY_SKIP_DATA", "BOOLEAN_LITERAL", "STRING_LITERAL", "INT_LITERAL", 
			"BYTES_LITERAL", "SOL_BYTE_TYPE", "SOL_INT_TYPE", "SOL_ADDRESS_TYPE", 
			"SOL_BOOL_TYPE", "SOL_BYTES_LENGTH", "SOL_UNSIGNED", "SOL_NUMBER_LENGTH", 
			"SOL_FIXED_N", "SOL_STRING_TYPE", "WS", "COMMENT", "LINE_COMMENT", "Identifier"
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

	@Override
	public String getGrammarFileName() { return "BcqlUtil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BcqlUtilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BlockNumberContext extends ParserRuleContext {
		public TerminalNode KEY_CURRENT() { return getToken(BcqlUtilParser.KEY_CURRENT, 0); }
		public TerminalNode KEY_EARLIEST() { return getToken(BcqlUtilParser.KEY_EARLIEST, 0); }
		public TerminalNode KEY_CONTINUOUS() { return getToken(BcqlUtilParser.KEY_CONTINUOUS, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public BlockNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterBlockNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitBlockNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitBlockNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNumberContext blockNumber() throws RecognitionException {
		BlockNumberContext _localctx = new BlockNumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_blockNumber);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_CURRENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(KEY_CURRENT);
				}
				break;
			case KEY_EARLIEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(KEY_EARLIEST);
				}
				break;
			case KEY_CONTINUOUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(KEY_CONTINUOUS);
				}
				break;
			case T__18:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				valueExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressListContext extends ParserRuleContext {
		public List<TerminalNode> BYTES_LITERAL() { return getTokens(BcqlUtilParser.BYTES_LITERAL); }
		public TerminalNode BYTES_LITERAL(int i) {
			return getToken(BcqlUtilParser.BYTES_LITERAL, i);
		}
		public TerminalNode KEY_ANY() { return getToken(BcqlUtilParser.KEY_ANY, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BcqlUtilParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BcqlUtilParser.STRING_LITERAL, i);
		}
		public AddressListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterAddressList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitAddressList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitAddressList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressListContext addressList() throws RecognitionException {
		AddressListContext _localctx = new AddressListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addressList);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(BYTES_LITERAL);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(79);
					match(T__0);
					setState(80);
					match(BYTES_LITERAL);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KEY_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(KEY_ANY);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				variableName();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(STRING_LITERAL);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(89);
					match(T__0);
					setState(90);
					match(STRING_LITERAL);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogEntrySignatureContext extends ParserRuleContext {
		public Token methodName;
		public TerminalNode Identifier() { return getToken(BcqlUtilParser.Identifier, 0); }
		public List<LogEntryParameterContext> logEntryParameter() {
			return getRuleContexts(LogEntryParameterContext.class);
		}
		public LogEntryParameterContext logEntryParameter(int i) {
			return getRuleContext(LogEntryParameterContext.class,i);
		}
		public LogEntrySignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logEntrySignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterLogEntrySignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitLogEntrySignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitLogEntrySignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogEntrySignatureContext logEntrySignature() throws RecognitionException {
		LogEntrySignatureContext _localctx = new LogEntrySignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_logEntrySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((LogEntrySignatureContext)_localctx).methodName = match(Identifier);
			setState(99);
			match(T__1);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SOL_BYTE_TYPE - 58)) | (1L << (SOL_INT_TYPE - 58)) | (1L << (SOL_ADDRESS_TYPE - 58)) | (1L << (SOL_BOOL_TYPE - 58)) | (1L << (SOL_STRING_TYPE - 58)))) != 0)) {
				{
				setState(100);
				logEntryParameter();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(101);
					match(T__0);
					setState(102);
					logEntryParameter();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogEntryParameterContext extends ParserRuleContext {
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode KEY_INDEXED() { return getToken(BcqlUtilParser.KEY_INDEXED, 0); }
		public LogEntryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logEntryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterLogEntryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitLogEntryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitLogEntryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogEntryParameterContext logEntryParameter() throws RecognitionException {
		LogEntryParameterContext _localctx = new LogEntryParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logEntryParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			solType(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_INDEXED) {
				{
				setState(113);
				match(KEY_INDEXED);
				}
			}

			setState(116);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkippableLogEntryParameterContext extends ParserRuleContext {
		public LogEntryParameterContext logEntryParameter() {
			return getRuleContext(LogEntryParameterContext.class,0);
		}
		public TerminalNode KEY_SKIP_INDEXED() { return getToken(BcqlUtilParser.KEY_SKIP_INDEXED, 0); }
		public TerminalNode KEY_SKIP_DATA() { return getToken(BcqlUtilParser.KEY_SKIP_DATA, 0); }
		public SkippableLogEntryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skippableLogEntryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSkippableLogEntryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSkippableLogEntryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSkippableLogEntryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkippableLogEntryParameterContext skippableLogEntryParameter() throws RecognitionException {
		SkippableLogEntryParameterContext _localctx = new SkippableLogEntryParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_skippableLogEntryParameter);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOL_BYTE_TYPE:
			case SOL_INT_TYPE:
			case SOL_ADDRESS_TYPE:
			case SOL_BOOL_TYPE:
			case SOL_STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				logEntryParameter();
				}
				break;
			case KEY_SKIP_INDEXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(KEY_SKIP_INDEXED);
				}
				break;
			case KEY_SKIP_DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(KEY_SKIP_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmartContractQueryContext extends ParserRuleContext {
		public PublicVariableQueryContext publicVariableQuery() {
			return getRuleContext(PublicVariableQueryContext.class,0);
		}
		public PublicFunctionQueryContext publicFunctionQuery() {
			return getRuleContext(PublicFunctionQueryContext.class,0);
		}
		public SmartContractQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartContractQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSmartContractQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSmartContractQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSmartContractQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractQueryContext smartContractQuery() throws RecognitionException {
		SmartContractQueryContext _localctx = new SmartContractQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_smartContractQuery);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				publicVariableQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				publicFunctionQuery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicVariableQueryContext extends ParserRuleContext {
		public SmartContractParameterContext smartContractParameter() {
			return getRuleContext(SmartContractParameterContext.class,0);
		}
		public PublicVariableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicVariableQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterPublicVariableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitPublicVariableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitPublicVariableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicVariableQueryContext publicVariableQuery() throws RecognitionException {
		PublicVariableQueryContext _localctx = new PublicVariableQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_publicVariableQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			smartContractParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicFunctionQueryContext extends ParserRuleContext {
		public Token methodName;
		public List<SmartContractParameterContext> smartContractParameter() {
			return getRuleContexts(SmartContractParameterContext.class);
		}
		public SmartContractParameterContext smartContractParameter(int i) {
			return getRuleContext(SmartContractParameterContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(BcqlUtilParser.Identifier, 0); }
		public List<SmartContractQueryParameterContext> smartContractQueryParameter() {
			return getRuleContexts(SmartContractQueryParameterContext.class);
		}
		public SmartContractQueryParameterContext smartContractQueryParameter(int i) {
			return getRuleContext(SmartContractQueryParameterContext.class,i);
		}
		public PublicFunctionQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicFunctionQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterPublicFunctionQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitPublicFunctionQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitPublicFunctionQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicFunctionQueryContext publicFunctionQuery() throws RecognitionException {
		PublicFunctionQueryContext _localctx = new PublicFunctionQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_publicFunctionQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			smartContractParameter();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(130);
				match(T__0);
				setState(131);
				smartContractParameter();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(T__3);
			setState(138);
			((PublicFunctionQueryContext)_localctx).methodName = match(Identifier);
			setState(139);
			match(T__1);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SOL_BYTE_TYPE - 58)) | (1L << (SOL_INT_TYPE - 58)) | (1L << (SOL_ADDRESS_TYPE - 58)) | (1L << (SOL_BOOL_TYPE - 58)) | (1L << (SOL_STRING_TYPE - 58)) | (1L << (Identifier - 58)))) != 0)) {
				{
				setState(140);
				smartContractQueryParameter();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(141);
					match(T__0);
					setState(142);
					smartContractQueryParameter();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmartContractParameterContext extends ParserRuleContext {
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SmartContractParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartContractParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSmartContractParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSmartContractParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSmartContractParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractParameterContext smartContractParameter() throws RecognitionException {
		SmartContractParameterContext _localctx = new SmartContractParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_smartContractParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			solType(0);
			setState(153);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmartContractQueryParameterContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SmartContractQueryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartContractQueryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSmartContractQueryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSmartContractQueryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSmartContractQueryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractQueryParameterContext smartContractQueryParameter() throws RecognitionException {
		SmartContractQueryParameterContext _localctx = new SmartContractQueryParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_smartContractQueryParameter);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				variableName();
				}
				break;
			case SOL_BYTE_TYPE:
			case SOL_INT_TYPE:
			case SOL_ADDRESS_TYPE:
			case SOL_BOOL_TYPE:
			case SOL_STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				solType(0);
				setState(157);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedEmitVariableContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode KEY_AS() { return getToken(BcqlUtilParser.KEY_AS, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public NamedEmitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedEmitVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterNamedEmitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitNamedEmitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitNamedEmitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedEmitVariableContext namedEmitVariable() throws RecognitionException {
		NamedEmitVariableContext _localctx = new NamedEmitVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namedEmitVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			valueExpression();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(162);
				match(KEY_AS);
				setState(163);
				variableName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XesEmitVariableContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode KEY_AS() { return getToken(BcqlUtilParser.KEY_AS, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public XesTypesContext xesTypes() {
			return getRuleContext(XesTypesContext.class,0);
		}
		public XesEmitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xesEmitVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterXesEmitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitXesEmitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitXesEmitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XesEmitVariableContext xesEmitVariable() throws RecognitionException {
		XesEmitVariableContext _localctx = new XesEmitVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_xesEmitVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			valueExpression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(167);
				match(KEY_AS);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(168);
					xesTypes();
					}
				}

				setState(171);
				variableName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XesTypesContext extends ParserRuleContext {
		public XesTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xesTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterXesTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitXesTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitXesTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XesTypesContext xesTypes() throws RecognitionException {
		XesTypesContext _localctx = new XesTypesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_xesTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public MethodStatementContext methodStatement() {
			return getRuleContext(MethodStatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public VariableAssignmentStatementContext variableAssignmentStatement() {
			return getRuleContext(VariableAssignmentStatementContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				methodStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				variableDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				variableAssignmentStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodStatementContext extends ParserRuleContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			methodInvocation();
			setState(182);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public Token methodName;
		public TerminalNode Identifier() { return getToken(BcqlUtilParser.Identifier, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((MethodInvocationContext)_localctx).methodName = match(Identifier);
			setState(185);
			match(T__1);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (BOOLEAN_LITERAL - 19)) | (1L << (STRING_LITERAL - 19)) | (1L << (INT_LITERAL - 19)) | (1L << (BYTES_LITERAL - 19)) | (1L << (Identifier - 19)))) != 0)) {
				{
				setState(186);
				valueExpression();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(187);
					match(T__0);
					setState(188);
					valueExpression();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			solType(0);
			setState(199);
			variableName();
			setState(200);
			match(T__3);
			setState(201);
			statementExpression();
			setState(202);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public VariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentStatementContext variableAssignmentStatement() throws RecognitionException {
		VariableAssignmentStatementContext _localctx = new VariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			variableName();
			setState(205);
			match(T__3);
			setState(206);
			statementExpression();
			setState(207);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementExpression);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				valueExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				methodInvocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			conditionalOrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode KEY_OR() { return getToken(BcqlUtilParser.KEY_OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(218);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(219);
					match(KEY_OR);
					setState(220);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public ConditionalComparisonExpressionContext conditionalComparisonExpression() {
			return getRuleContext(ConditionalComparisonExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode KEY_AND() { return getToken(BcqlUtilParser.KEY_AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			conditionalComparisonExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(230);
					match(KEY_AND);
					setState(231);
					conditionalComparisonExpression();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalComparisonExpressionContext extends ParserRuleContext {
		public List<ConditionalNotExpressionContext> conditionalNotExpression() {
			return getRuleContexts(ConditionalNotExpressionContext.class);
		}
		public ConditionalNotExpressionContext conditionalNotExpression(int i) {
			return getRuleContext(ConditionalNotExpressionContext.class,i);
		}
		public ComparatorsContext comparators() {
			return getRuleContext(ComparatorsContext.class,0);
		}
		public ConditionalComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalComparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalComparisonExpressionContext conditionalComparisonExpression() throws RecognitionException {
		ConditionalComparisonExpressionContext _localctx = new ConditionalComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionalComparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			conditionalNotExpression();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(238);
				comparators();
				setState(239);
				conditionalNotExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalNotExpressionContext extends ParserRuleContext {
		public ConditionalPrimaryExpressionContext conditionalPrimaryExpression() {
			return getRuleContext(ConditionalPrimaryExpressionContext.class,0);
		}
		public TerminalNode KEY_NOT() { return getToken(BcqlUtilParser.KEY_NOT, 0); }
		public ConditionalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalNotExpressionContext conditionalNotExpression() throws RecognitionException {
		ConditionalNotExpressionContext _localctx = new ConditionalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionalNotExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_NOT) {
				{
				setState(243);
				match(KEY_NOT);
				}
			}

			setState(246);
			conditionalPrimaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalPrimaryExpressionContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalPrimaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterConditionalPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitConditionalPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitConditionalPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalPrimaryExpressionContext conditionalPrimaryExpression() throws RecognitionException {
		ConditionalPrimaryExpressionContext _localctx = new ConditionalPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalPrimaryExpression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				valueExpression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__1);
				setState(250);
				conditionalOrExpression(0);
				setState(251);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valueExpression);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorsContext extends ParserRuleContext {
		public TerminalNode KEY_IN() { return getToken(BcqlUtilParser.KEY_IN, 0); }
		public ComparatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterComparators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitComparators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitComparators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorsContext comparators() throws RecognitionException {
		ComparatorsContext _localctx = new ComparatorsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << KEY_IN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BcqlUtilParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BcqlUtilParser.Identifier, i);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableName);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(Identifier);
				setState(263);
				match(T__16);
				setState(264);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(Identifier);
				setState(266);
				match(T__17);
				setState(267);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BcqlUtilParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(BcqlUtilParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode BYTES_LITERAL() { return getToken(BcqlUtilParser.BYTES_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(BcqlUtilParser.INT_LITERAL, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(BOOLEAN_LITERAL);
				}
				break;
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(BYTES_LITERAL);
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(INT_LITERAL);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				arrayLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public StringArrayLiteralContext stringArrayLiteral() {
			return getRuleContext(StringArrayLiteralContext.class,0);
		}
		public IntArrayLiteralContext intArrayLiteral() {
			return getRuleContext(IntArrayLiteralContext.class,0);
		}
		public BooleanArrayLiteralContext booleanArrayLiteral() {
			return getRuleContext(BooleanArrayLiteralContext.class,0);
		}
		public BytesArrayLiteralContext bytesArrayLiteral() {
			return getRuleContext(BytesArrayLiteralContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLiteral);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				stringArrayLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				intArrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				booleanArrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				bytesArrayLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BcqlUtilParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BcqlUtilParser.STRING_LITERAL, i);
		}
		public StringArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterStringArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitStringArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitStringArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrayLiteralContext stringArrayLiteral() throws RecognitionException {
		StringArrayLiteralContext _localctx = new StringArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__18);
			setState(284);
			match(STRING_LITERAL);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(285);
				match(T__0);
				setState(286);
				match(STRING_LITERAL);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> INT_LITERAL() { return getTokens(BcqlUtilParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(BcqlUtilParser.INT_LITERAL, i);
		}
		public IntArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterIntArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitIntArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitIntArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrayLiteralContext intArrayLiteral() throws RecognitionException {
		IntArrayLiteralContext _localctx = new IntArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_intArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__18);
			{
			setState(295);
			match(INT_LITERAL);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(296);
				match(T__0);
				setState(297);
				match(INT_LITERAL);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN_LITERAL() { return getTokens(BcqlUtilParser.BOOLEAN_LITERAL); }
		public TerminalNode BOOLEAN_LITERAL(int i) {
			return getToken(BcqlUtilParser.BOOLEAN_LITERAL, i);
		}
		public BooleanArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterBooleanArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitBooleanArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitBooleanArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanArrayLiteralContext booleanArrayLiteral() throws RecognitionException {
		BooleanArrayLiteralContext _localctx = new BooleanArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booleanArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__18);
			setState(306);
			match(BOOLEAN_LITERAL);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(307);
				match(T__0);
				setState(308);
				match(BOOLEAN_LITERAL);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BytesArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BYTES_LITERAL() { return getTokens(BcqlUtilParser.BYTES_LITERAL); }
		public TerminalNode BYTES_LITERAL(int i) {
			return getToken(BcqlUtilParser.BYTES_LITERAL, i);
		}
		public BytesArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytesArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterBytesArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitBytesArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitBytesArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesArrayLiteralContext bytesArrayLiteral() throws RecognitionException {
		BytesArrayLiteralContext _localctx = new BytesArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bytesArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__18);
			setState(317);
			match(BYTES_LITERAL);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(318);
				match(T__0);
				setState(319);
				match(BYTES_LITERAL);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SolTypeRuleContext extends ParserRuleContext {
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BcqlUtilParser.EOF, 0); }
		public SolTypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solTypeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSolTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSolTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSolTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolTypeRuleContext solTypeRule() throws RecognitionException {
		SolTypeRuleContext _localctx = new SolTypeRuleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_solTypeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			solType(0);
			setState(328);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SolTypeContext extends ParserRuleContext {
		public TerminalNode SOL_ADDRESS_TYPE() { return getToken(BcqlUtilParser.SOL_ADDRESS_TYPE, 0); }
		public TerminalNode SOL_BOOL_TYPE() { return getToken(BcqlUtilParser.SOL_BOOL_TYPE, 0); }
		public TerminalNode SOL_BYTE_TYPE() { return getToken(BcqlUtilParser.SOL_BYTE_TYPE, 0); }
		public TerminalNode SOL_INT_TYPE() { return getToken(BcqlUtilParser.SOL_INT_TYPE, 0); }
		public TerminalNode SOL_STRING_TYPE() { return getToken(BcqlUtilParser.SOL_STRING_TYPE, 0); }
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public SolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).enterSolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlUtilListener ) ((BcqlUtilListener)listener).exitSolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlUtilVisitor ) return ((BcqlUtilVisitor<? extends T>)visitor).visitSolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolTypeContext solType() throws RecognitionException {
		return solType(0);
	}

	private SolTypeContext solType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SolTypeContext _localctx = new SolTypeContext(_ctx, _parentState);
		SolTypeContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_solType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOL_ADDRESS_TYPE:
				{
				setState(331);
				match(SOL_ADDRESS_TYPE);
				}
				break;
			case SOL_BOOL_TYPE:
				{
				setState(332);
				match(SOL_BOOL_TYPE);
				}
				break;
			case SOL_BYTE_TYPE:
				{
				setState(333);
				match(SOL_BYTE_TYPE);
				}
				break;
			case SOL_INT_TYPE:
				{
				setState(334);
				match(SOL_INT_TYPE);
				}
				break;
			case SOL_STRING_TYPE:
				{
				setState(335);
				match(SOL_STRING_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SolTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_solType);
					setState(338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(339);
					match(T__20);
					setState(340);
					match(T__21);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 21:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 35:
			return solType_sempred((SolTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean solType_sempred(SolTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\5\2O\n\2\3\3\3\3\3\3\7\3"+
		"T\n\3\f\3\16\3W\13\3\3\3\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\5\3c"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\5\4o\n\4\3\4\3\4\3\5"+
		"\3\5\5\5u\n\5\3\5\3\5\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\5\7\u0080\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\5\t\u0097\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r"+
		"\3\r\5\r\u00ac\n\r\3\r\5\r\u00af\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u00b6"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00c0\n\21\f\21\16"+
		"\21\u00c3\13\21\5\21\u00c5\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00d6\n\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00e0\n\26\f\26\16\26\u00e3\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u00eb\n\27\f\27\16\27\u00ee\13\27\3\30\3\30"+
		"\3\30\3\30\5\30\u00f4\n\30\3\31\5\31\u00f7\n\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0100\n\32\3\33\3\33\5\33\u0104\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u010f\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0116\n\36\3\37\3\37\3\37\3\37\5\37\u011c\n\37\3 \3 \3 \3 \7 \u0122"+
		"\n \f \16 \u0125\13 \3 \3 \3!\3!\3!\3!\7!\u012d\n!\f!\16!\u0130\13!\3"+
		"!\3!\3\"\3\"\3\"\3\"\7\"\u0138\n\"\f\"\16\"\u013b\13\"\3\"\3\"\3#\3#\3"+
		"#\3#\7#\u0143\n#\f#\16#\u0146\13#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%"+
		"\u0153\n%\3%\3%\3%\7%\u0158\n%\f%\16%\u015b\13%\3%\2\5*,H&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\4\3\2\7\13"+
		"\4\2\r\22\64\64\2\u016a\2N\3\2\2\2\4b\3\2\2\2\6d\3\2\2\2\br\3\2\2\2\n"+
		"{\3\2\2\2\f\177\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u009a\3\2"+
		"\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a8\3\2\2\2\32\u00b0\3\2\2"+
		"\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00ba\3\2\2\2\"\u00c8\3\2\2\2$\u00ce"+
		"\3\2\2\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00e4\3\2\2\2."+
		"\u00ef\3\2\2\2\60\u00f6\3\2\2\2\62\u00ff\3\2\2\2\64\u0103\3\2\2\2\66\u0105"+
		"\3\2\2\28\u010e\3\2\2\2:\u0115\3\2\2\2<\u011b\3\2\2\2>\u011d\3\2\2\2@"+
		"\u0128\3\2\2\2B\u0133\3\2\2\2D\u013e\3\2\2\2F\u0149\3\2\2\2H\u0152\3\2"+
		"\2\2JO\7-\2\2KO\7,\2\2LO\7.\2\2MO\5\64\33\2NJ\3\2\2\2NK\3\2\2\2NL\3\2"+
		"\2\2NM\3\2\2\2O\3\3\2\2\2PU\7;\2\2QR\7\3\2\2RT\7;\2\2SQ\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2Vc\3\2\2\2WU\3\2\2\2Xc\7/\2\2Yc\58\35\2Z_\79\2"+
		"\2[\\\7\3\2\2\\^\79\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2bP\3\2\2\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2c\5\3\2\2\2de\7"+
		"H\2\2en\7\4\2\2fk\5\b\5\2gh\7\3\2\2hj\5\b\5\2ig\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7"+
		"\5\2\2q\7\3\2\2\2rt\5H%\2su\7\60\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5"+
		"8\35\2w\t\3\2\2\2x|\5\b\5\2y|\7\66\2\2z|\7\67\2\2{x\3\2\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|\13\3\2\2\2}\u0080\5\16\b\2~\u0080\5\20\t\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\5\22\n\2\u0082\17\3\2\2\2\u0083"+
		"\u0088\5\22\n\2\u0084\u0085\7\3\2\2\u0085\u0087\5\22\n\2\u0086\u0084\3"+
		"\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7H"+
		"\2\2\u008d\u0096\7\4\2\2\u008e\u0093\5\24\13\2\u008f\u0090\7\3\2\2\u0090"+
		"\u0092\5\24\13\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u008e\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\5"+
		"\2\2\u0099\21\3\2\2\2\u009a\u009b\5H%\2\u009b\u009c\58\35\2\u009c\23\3"+
		"\2\2\2\u009d\u00a2\58\35\2\u009e\u009f\5H%\2\u009f\u00a0\5:\36\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\25\3\2\2"+
		"\2\u00a3\u00a6\5\64\33\2\u00a4\u00a5\7\65\2\2\u00a5\u00a7\58\35\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00ae\5\64\33"+
		"\2\u00a9\u00ab\7\65\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\58\35\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\33"+
		"\3\2\2\2\u00b2\u00b6\5\36\20\2\u00b3\u00b6\5\"\22\2\u00b4\u00b6\5$\23"+
		"\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\35"+
		"\3\2\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7\f\2\2\u00b9\37\3\2\2\2\u00ba"+
		"\u00bb\7H\2\2\u00bb\u00c4\7\4\2\2\u00bc\u00c1\5\64\33\2\u00bd\u00be\7"+
		"\3\2\2\u00be\u00c0\5\64\33\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7\5\2\2\u00c7!\3\2\2\2\u00c8\u00c9\5H%\2\u00c9\u00ca\58\35\2\u00ca"+
		"\u00cb\7\6\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\7\f\2\2\u00cd#\3\2\2\2"+
		"\u00ce\u00cf\58\35\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2"+
		"\7\f\2\2\u00d2%\3\2\2\2\u00d3\u00d6\5\64\33\2\u00d4\u00d6\5 \21\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\'\3\2\2\2\u00d7\u00d8\5*\26\2"+
		"\u00d8)\3\2\2\2\u00d9\u00da\b\26\1\2\u00da\u00db\5,\27\2\u00db\u00e1\3"+
		"\2\2\2\u00dc\u00dd\f\3\2\2\u00dd\u00de\7\63\2\2\u00de\u00e0\5,\27\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2+\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\27\1\2\u00e5\u00e6"+
		"\5.\30\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\3\2\2\u00e8\u00e9\7\62\2\2"+
		"\u00e9\u00eb\5.\30\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f3\5\60\31\2\u00f0\u00f1\5\66\34\2\u00f1\u00f2\5\60\31\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4/\3\2\2\2\u00f5"+
		"\u00f7\7\61\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f9\5\62\32\2\u00f9\61\3\2\2\2\u00fa\u0100\5\64\33\2\u00fb"+
		"\u00fc\7\4\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\7\5\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\63\3\2\2\2\u0101\u0104"+
		"\5:\36\2\u0102\u0104\58\35\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\65\3\2\2\2\u0105\u0106\t\3\2\2\u0106\67\3\2\2\2\u0107\u010f\7H\2\2\u0108"+
		"\u0109\7H\2\2\u0109\u010a\7\23\2\2\u010a\u010f\7H\2\2\u010b\u010c\7H\2"+
		"\2\u010c\u010d\7\24\2\2\u010d\u010f\7H\2\2\u010e\u0107\3\2\2\2\u010e\u0108"+
		"\3\2\2\2\u010e\u010b\3\2\2\2\u010f9\3\2\2\2\u0110\u0116\79\2\2\u0111\u0116"+
		"\78\2\2\u0112\u0116\7;\2\2\u0113\u0116\7:\2\2\u0114\u0116\5<\37\2\u0115"+
		"\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116;\3\2\2\2\u0117\u011c\5> \2\u0118\u011c"+
		"\5@!\2\u0119\u011c\5B\"\2\u011a\u011c\5D#\2\u011b\u0117\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c=\3\2\2\2"+
		"\u011d\u011e\7\25\2\2\u011e\u0123\79\2\2\u011f\u0120\7\3\2\2\u0120\u0122"+
		"\79\2\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\26"+
		"\2\2\u0127?\3\2\2\2\u0128\u0129\7\25\2\2\u0129\u012e\7:\2\2\u012a\u012b"+
		"\7\3\2\2\u012b\u012d\7:\2\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0132\7\26\2\2\u0132A\3\2\2\2\u0133\u0134\7\25\2\2\u0134\u0139"+
		"\78\2\2\u0135\u0136\7\3\2\2\u0136\u0138\78\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\26\2\2\u013dC\3\2\2\2\u013e\u013f"+
		"\7\25\2\2\u013f\u0144\7;\2\2\u0140\u0141\7\3\2\2\u0141\u0143\7;\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\26\2\2\u0148"+
		"E\3\2\2\2\u0149\u014a\5H%\2\u014a\u014b\7\2\2\3\u014bG\3\2\2\2\u014c\u014d"+
		"\b%\1\2\u014d\u0153\7>\2\2\u014e\u0153\7?\2\2\u014f\u0153\7<\2\2\u0150"+
		"\u0153\7=\2\2\u0151\u0153\7D\2\2\u0152\u014c\3\2\2\2\u0152\u014e\3\2\2"+
		"\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0159"+
		"\3\2\2\2\u0154\u0155\f\3\2\2\u0155\u0156\7\27\2\2\u0156\u0158\7\30\2\2"+
		"\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015aI\3\2\2\2\u015b\u0159\3\2\2\2%NU_bknt{\177\u0088\u0093\u0096"+
		"\u00a1\u00a6\u00ab\u00ae\u00b5\u00c1\u00c4\u00d5\u00e1\u00ec\u00f3\u00f6"+
		"\u00ff\u0103\u010e\u0115\u011b\u0123\u012e\u0139\u0144\u0152\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}