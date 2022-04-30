// Generated from blf/grammar/Bcql.g4 by ANTLR 4.7.2
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
public class BcqlParser extends Parser {
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
		RULE_document = 0, RULE_blockchain = 1, RULE_connection = 2, RULE_outputFolder = 3, 
		RULE_optionalParams = 4, RULE_errorOutput = 5, RULE_emissionMode = 6, 
		RULE_abortOnException = 7, RULE_statement = 8, RULE_scope = 9, RULE_filter = 10, 
		RULE_blockFilter = 11, RULE_transactionFilter = 12, RULE_logEntryFilter = 13, 
		RULE_smartContractFilter = 14, RULE_genericFilter = 15, RULE_transactionInputFilter = 16, 
		RULE_emitStatement = 17, RULE_emitStatementCsv = 18, RULE_emitStatementLog = 19, 
		RULE_emitStatementXesEvent = 20, RULE_emitStatementXesTrace = 21, RULE_blockNumber = 22, 
		RULE_addressList = 23, RULE_logEntrySignature = 24, RULE_logEntryParameter = 25, 
		RULE_skippableLogEntryParameter = 26, RULE_smartContractQuery = 27, RULE_publicVariableQuery = 28, 
		RULE_publicFunctionQuery = 29, RULE_smartContractParameter = 30, RULE_smartContractQueryParameter = 31, 
		RULE_namedEmitVariable = 32, RULE_xesEmitVariable = 33, RULE_xesTypes = 34, 
		RULE_expressionStatement = 35, RULE_methodStatement = 36, RULE_methodInvocation = 37, 
		RULE_variableDeclarationStatement = 38, RULE_variableAssignmentStatement = 39, 
		RULE_statementExpression = 40, RULE_conditionalExpression = 41, RULE_conditionalOrExpression = 42, 
		RULE_conditionalAndExpression = 43, RULE_conditionalComparisonExpression = 44, 
		RULE_conditionalNotExpression = 45, RULE_conditionalPrimaryExpression = 46, 
		RULE_valueExpression = 47, RULE_comparators = 48, RULE_variableName = 49, 
		RULE_literal = 50, RULE_arrayLiteral = 51, RULE_stringArrayLiteral = 52, 
		RULE_intArrayLiteral = 53, RULE_booleanArrayLiteral = 54, RULE_bytesArrayLiteral = 55, 
		RULE_solTypeRule = 56, RULE_solType = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "blockchain", "connection", "outputFolder", "optionalParams", 
			"errorOutput", "emissionMode", "abortOnException", "statement", "scope", 
			"filter", "blockFilter", "transactionFilter", "logEntryFilter", "smartContractFilter", 
			"genericFilter", "transactionInputFilter", "emitStatement", "emitStatementCsv", 
			"emitStatementLog", "emitStatementXesEvent", "emitStatementXesTrace", 
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
			null, "';'", "'{'", "'}'", "'('", "')'", "','", "'='", "'xs:string'", 
			"'xs:date'", "'xs:int'", "'xs:float'", "'xs:boolean'", "'=='", "'!='", 
			"'>='", "'>'", "'<'", "'<='", "':'", "'.'", "'['", "']'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'indexed'", "'!'", 
			"'&&'", "'||'", null, null, "'_indexed_'", "'_'", null, null, null, null, 
			null, null, "'address'", "'bool'", null, "'u'", null, null, "'string'"
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
	public String getGrammarFileName() { return "Bcql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BcqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public BlockchainContext blockchain() {
			return getRuleContext(BlockchainContext.class,0);
		}
		public OutputFolderContext outputFolder() {
			return getRuleContext(OutputFolderContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BcqlParser.EOF, 0); }
		public List<OptionalParamsContext> optionalParams() {
			return getRuleContexts(OptionalParamsContext.class);
		}
		public OptionalParamsContext optionalParams(int i) {
			return getRuleContext(OptionalParamsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			blockchain();
			setState(117);
			outputFolder();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					optionalParams();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(124);
			connection();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (KEY_BLOCK_RANGE - 31)) | (1L << (KEY_TRANSACTIONS - 31)) | (1L << (KEY_SMART_CONTRACT - 31)) | (1L << (KEY_LOG_ENTRIES - 31)) | (1L << (KEY_IF - 31)) | (1L << (KEY_TRANSACTION_INPUT - 31)) | (1L << (KEY_EMIT - 31)) | (1L << (SOL_BYTE_TYPE - 31)) | (1L << (SOL_INT_TYPE - 31)) | (1L << (SOL_ADDRESS_TYPE - 31)) | (1L << (SOL_BOOL_TYPE - 31)) | (1L << (SOL_STRING_TYPE - 31)) | (1L << (Identifier - 31)))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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

	public static class BlockchainContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_BLOCKCHAIN() { return getToken(BcqlParser.KEY_BLOCKCHAIN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BlockchainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockchain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterBlockchain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitBlockchain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitBlockchain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockchainContext blockchain() throws RecognitionException {
		BlockchainContext _localctx = new BlockchainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockchain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(KEY_SET);
			setState(134);
			match(KEY_BLOCKCHAIN);
			setState(135);
			literal();
			setState(136);
			match(T__0);
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

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_CONNECTION() { return getToken(BcqlParser.KEY_CONNECTION, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode KEY_IPC() { return getToken(BcqlParser.KEY_IPC, 0); }
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(KEY_SET);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_IPC) {
				{
				setState(139);
				match(KEY_IPC);
				}
			}

			setState(142);
			match(KEY_CONNECTION);
			setState(143);
			literal();
			setState(144);
			match(T__0);
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

	public static class OutputFolderContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_OUTPUT_FOLDER() { return getToken(BcqlParser.KEY_OUTPUT_FOLDER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OutputFolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputFolder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterOutputFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitOutputFolder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitOutputFolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputFolderContext outputFolder() throws RecognitionException {
		OutputFolderContext _localctx = new OutputFolderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputFolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(KEY_SET);
			setState(147);
			match(KEY_OUTPUT_FOLDER);
			setState(148);
			literal();
			setState(149);
			match(T__0);
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

	public static class OptionalParamsContext extends ParserRuleContext {
		public EmissionModeContext emissionMode() {
			return getRuleContext(EmissionModeContext.class,0);
		}
		public AbortOnExceptionContext abortOnException() {
			return getRuleContext(AbortOnExceptionContext.class,0);
		}
		public ErrorOutputContext errorOutput() {
			return getRuleContext(ErrorOutputContext.class,0);
		}
		public OptionalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterOptionalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitOptionalParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitOptionalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParamsContext optionalParams() throws RecognitionException {
		OptionalParamsContext _localctx = new OptionalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionalParams);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				emissionMode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				abortOnException();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				errorOutput();
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

	public static class ErrorOutputContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_ERROR_OUTPUT() { return getToken(BcqlParser.KEY_ERROR_OUTPUT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BcqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BcqlParser.STRING_LITERAL, i);
		}
		public ErrorOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterErrorOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitErrorOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitErrorOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorOutputContext errorOutput() throws RecognitionException {
		ErrorOutputContext _localctx = new ErrorOutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_errorOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(KEY_SET);
			setState(157);
			match(KEY_ERROR_OUTPUT);
			setState(158);
			match(STRING_LITERAL);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(159);
				match(STRING_LITERAL);
				}
			}

			setState(162);
			match(T__0);
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

	public static class EmissionModeContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_EMISSION_MODE() { return getToken(BcqlParser.KEY_EMISSION_MODE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public EmissionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emissionMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmissionMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmissionMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmissionMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmissionModeContext emissionMode() throws RecognitionException {
		EmissionModeContext _localctx = new EmissionModeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emissionMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(KEY_SET);
			setState(165);
			match(KEY_EMISSION_MODE);
			setState(166);
			literal();
			setState(167);
			match(T__0);
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

	public static class AbortOnExceptionContext extends ParserRuleContext {
		public TerminalNode KEY_SET() { return getToken(BcqlParser.KEY_SET, 0); }
		public TerminalNode KEY_ABORT_ON_EXCEPTION() { return getToken(BcqlParser.KEY_ABORT_ON_EXCEPTION, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(BcqlParser.BOOLEAN_LITERAL, 0); }
		public AbortOnExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abortOnException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterAbortOnException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitAbortOnException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitAbortOnException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbortOnExceptionContext abortOnException() throws RecognitionException {
		AbortOnExceptionContext _localctx = new AbortOnExceptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abortOnException);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(KEY_SET);
			setState(170);
			match(KEY_ABORT_ON_EXCEPTION);
			setState(171);
			match(BOOLEAN_LITERAL);
			setState(172);
			match(T__0);
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

	public static class StatementContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_RANGE:
			case KEY_TRANSACTIONS:
			case KEY_SMART_CONTRACT:
			case KEY_LOG_ENTRIES:
			case KEY_IF:
			case KEY_TRANSACTION_INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				scope();
				}
				break;
			case SOL_BYTE_TYPE:
			case SOL_INT_TYPE:
			case SOL_ADDRESS_TYPE:
			case SOL_BOOL_TYPE:
			case SOL_STRING_TYPE:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				expressionStatement();
				}
				break;
			case KEY_EMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				emitStatement();
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

	public static class ScopeContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			filter();
			setState(180);
			match(T__1);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (KEY_BLOCK_RANGE - 31)) | (1L << (KEY_TRANSACTIONS - 31)) | (1L << (KEY_SMART_CONTRACT - 31)) | (1L << (KEY_LOG_ENTRIES - 31)) | (1L << (KEY_IF - 31)) | (1L << (KEY_TRANSACTION_INPUT - 31)) | (1L << (KEY_EMIT - 31)) | (1L << (SOL_BYTE_TYPE - 31)) | (1L << (SOL_INT_TYPE - 31)) | (1L << (SOL_ADDRESS_TYPE - 31)) | (1L << (SOL_BOOL_TYPE - 31)) | (1L << (SOL_STRING_TYPE - 31)) | (1L << (Identifier - 31)))) != 0)) {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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

	public static class FilterContext extends ParserRuleContext {
		public BlockFilterContext blockFilter() {
			return getRuleContext(BlockFilterContext.class,0);
		}
		public TransactionFilterContext transactionFilter() {
			return getRuleContext(TransactionFilterContext.class,0);
		}
		public LogEntryFilterContext logEntryFilter() {
			return getRuleContext(LogEntryFilterContext.class,0);
		}
		public SmartContractFilterContext smartContractFilter() {
			return getRuleContext(SmartContractFilterContext.class,0);
		}
		public GenericFilterContext genericFilter() {
			return getRuleContext(GenericFilterContext.class,0);
		}
		public TransactionInputFilterContext transactionInputFilter() {
			return getRuleContext(TransactionInputFilterContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_filter);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				blockFilter();
				}
				break;
			case KEY_TRANSACTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				transactionFilter();
				}
				break;
			case KEY_LOG_ENTRIES:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				logEntryFilter();
				}
				break;
			case KEY_SMART_CONTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				smartContractFilter();
				}
				break;
			case KEY_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				genericFilter();
				}
				break;
			case KEY_TRANSACTION_INPUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				transactionInputFilter();
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

	public static class BlockFilterContext extends ParserRuleContext {
		public BlockNumberContext from;
		public BlockNumberContext to;
		public TerminalNode KEY_BLOCK_RANGE() { return getToken(BcqlParser.KEY_BLOCK_RANGE, 0); }
		public List<BlockNumberContext> blockNumber() {
			return getRuleContexts(BlockNumberContext.class);
		}
		public BlockNumberContext blockNumber(int i) {
			return getRuleContext(BlockNumberContext.class,i);
		}
		public BlockFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterBlockFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitBlockFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitBlockFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockFilterContext blockFilter() throws RecognitionException {
		BlockFilterContext _localctx = new BlockFilterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(KEY_BLOCK_RANGE);
			setState(198);
			match(T__3);
			setState(199);
			((BlockFilterContext)_localctx).from = blockNumber();
			setState(200);
			match(T__4);
			setState(201);
			match(T__3);
			setState(202);
			((BlockFilterContext)_localctx).to = blockNumber();
			setState(203);
			match(T__4);
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

	public static class TransactionFilterContext extends ParserRuleContext {
		public AddressListContext senders;
		public AddressListContext recipients;
		public TerminalNode KEY_TRANSACTIONS() { return getToken(BcqlParser.KEY_TRANSACTIONS, 0); }
		public List<AddressListContext> addressList() {
			return getRuleContexts(AddressListContext.class);
		}
		public AddressListContext addressList(int i) {
			return getRuleContext(AddressListContext.class,i);
		}
		public TransactionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterTransactionFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitTransactionFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitTransactionFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionFilterContext transactionFilter() throws RecognitionException {
		TransactionFilterContext _localctx = new TransactionFilterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_transactionFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(KEY_TRANSACTIONS);
			setState(206);
			match(T__3);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (KEY_ANY - 45)) | (1L << (STRING_LITERAL - 45)) | (1L << (BYTES_LITERAL - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(207);
				((TransactionFilterContext)_localctx).senders = addressList();
				}
			}

			setState(210);
			match(T__4);
			setState(211);
			match(T__3);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (KEY_ANY - 45)) | (1L << (STRING_LITERAL - 45)) | (1L << (BYTES_LITERAL - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(212);
				((TransactionFilterContext)_localctx).recipients = addressList();
				}
			}

			setState(215);
			match(T__4);
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

	public static class LogEntryFilterContext extends ParserRuleContext {
		public TerminalNode KEY_LOG_ENTRIES() { return getToken(BcqlParser.KEY_LOG_ENTRIES, 0); }
		public AddressListContext addressList() {
			return getRuleContext(AddressListContext.class,0);
		}
		public LogEntrySignatureContext logEntrySignature() {
			return getRuleContext(LogEntrySignatureContext.class,0);
		}
		public LogEntryFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logEntryFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterLogEntryFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitLogEntryFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitLogEntryFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogEntryFilterContext logEntryFilter() throws RecognitionException {
		LogEntryFilterContext _localctx = new LogEntryFilterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logEntryFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KEY_LOG_ENTRIES);
			setState(218);
			match(T__3);
			setState(219);
			addressList();
			setState(220);
			match(T__4);
			setState(221);
			match(T__3);
			setState(222);
			logEntrySignature();
			setState(223);
			match(T__4);
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

	public static class SmartContractFilterContext extends ParserRuleContext {
		public ValueExpressionContext contractAddress;
		public ValueExpressionContext blockOffset;
		public TerminalNode KEY_SMART_CONTRACT() { return getToken(BcqlParser.KEY_SMART_CONTRACT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public List<SmartContractQueryContext> smartContractQuery() {
			return getRuleContexts(SmartContractQueryContext.class);
		}
		public SmartContractQueryContext smartContractQuery(int i) {
			return getRuleContext(SmartContractQueryContext.class,i);
		}
		public SmartContractFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartContractFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSmartContractFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSmartContractFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSmartContractFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractFilterContext smartContractFilter() throws RecognitionException {
		SmartContractFilterContext _localctx = new SmartContractFilterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_smartContractFilter);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(KEY_SMART_CONTRACT);
				setState(226);
				match(T__3);
				setState(227);
				((SmartContractFilterContext)_localctx).contractAddress = valueExpression();
				setState(228);
				match(T__4);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					match(T__3);
					setState(230);
					smartContractQuery();
					setState(231);
					match(T__4);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(KEY_SMART_CONTRACT);
				setState(238);
				match(T__3);
				setState(239);
				((SmartContractFilterContext)_localctx).blockOffset = valueExpression();
				setState(240);
				match(T__4);
				setState(241);
				match(T__3);
				setState(242);
				((SmartContractFilterContext)_localctx).contractAddress = valueExpression();
				setState(243);
				match(T__4);
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					match(T__3);
					setState(245);
					smartContractQuery();
					setState(246);
					match(T__4);
					}
					}
					setState(250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
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

	public static class GenericFilterContext extends ParserRuleContext {
		public TerminalNode KEY_IF() { return getToken(BcqlParser.KEY_IF, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public GenericFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterGenericFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitGenericFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitGenericFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFilterContext genericFilter() throws RecognitionException {
		GenericFilterContext _localctx = new GenericFilterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(KEY_IF);
			setState(255);
			match(T__3);
			setState(256);
			conditionalExpression();
			setState(257);
			match(T__4);
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

	public static class TransactionInputFilterContext extends ParserRuleContext {
		public ValueExpressionContext functionIdentifier;
		public TerminalNode KEY_TRANSACTION_INPUT() { return getToken(BcqlParser.KEY_TRANSACTION_INPUT, 0); }
		public AddressListContext addressList() {
			return getRuleContext(AddressListContext.class,0);
		}
		public List<SmartContractParameterContext> smartContractParameter() {
			return getRuleContexts(SmartContractParameterContext.class);
		}
		public SmartContractParameterContext smartContractParameter(int i) {
			return getRuleContext(SmartContractParameterContext.class,i);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TransactionInputFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionInputFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterTransactionInputFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitTransactionInputFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitTransactionInputFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionInputFilterContext transactionInputFilter() throws RecognitionException {
		TransactionInputFilterContext _localctx = new TransactionInputFilterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transactionInputFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(KEY_TRANSACTION_INPUT);
			setState(260);
			match(T__3);
			setState(261);
			addressList();
			setState(262);
			match(T__4);
			setState(263);
			match(T__3);
			setState(264);
			((TransactionInputFilterContext)_localctx).functionIdentifier = valueExpression();
			setState(265);
			match(T__4);
			setState(266);
			match(T__3);
			setState(267);
			smartContractParameter();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(268);
				match(T__5);
				setState(269);
				smartContractParameter();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(T__4);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public EmitStatementCsvContext emitStatementCsv() {
			return getRuleContext(EmitStatementCsvContext.class,0);
		}
		public EmitStatementLogContext emitStatementLog() {
			return getRuleContext(EmitStatementLogContext.class,0);
		}
		public EmitStatementXesEventContext emitStatementXesEvent() {
			return getRuleContext(EmitStatementXesEventContext.class,0);
		}
		public EmitStatementXesTraceContext emitStatementXesTrace() {
			return getRuleContext(EmitStatementXesTraceContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_emitStatement);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				emitStatementCsv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				emitStatementLog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				emitStatementXesEvent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				emitStatementXesTrace();
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

	public static class EmitStatementCsvContext extends ParserRuleContext {
		public ValueExpressionContext tableName;
		public TerminalNode KEY_EMIT() { return getToken(BcqlParser.KEY_EMIT, 0); }
		public TerminalNode KEY_CSV_ROW() { return getToken(BcqlParser.KEY_CSV_ROW, 0); }
		public List<NamedEmitVariableContext> namedEmitVariable() {
			return getRuleContexts(NamedEmitVariableContext.class);
		}
		public NamedEmitVariableContext namedEmitVariable(int i) {
			return getRuleContext(NamedEmitVariableContext.class,i);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public EmitStatementCsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatementCsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmitStatementCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmitStatementCsv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmitStatementCsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementCsvContext emitStatementCsv() throws RecognitionException {
		EmitStatementCsvContext _localctx = new EmitStatementCsvContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_emitStatementCsv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(KEY_EMIT);
			setState(284);
			match(KEY_CSV_ROW);
			setState(285);
			match(T__3);
			setState(286);
			((EmitStatementCsvContext)_localctx).tableName = valueExpression();
			setState(287);
			match(T__4);
			setState(288);
			match(T__3);
			setState(289);
			namedEmitVariable();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(290);
				match(T__5);
				setState(291);
				namedEmitVariable();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__4);
			setState(298);
			match(T__0);
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

	public static class EmitStatementLogContext extends ParserRuleContext {
		public TerminalNode KEY_EMIT() { return getToken(BcqlParser.KEY_EMIT, 0); }
		public TerminalNode KEY_LOG_LINE() { return getToken(BcqlParser.KEY_LOG_LINE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public EmitStatementLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatementLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmitStatementLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmitStatementLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmitStatementLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementLogContext emitStatementLog() throws RecognitionException {
		EmitStatementLogContext _localctx = new EmitStatementLogContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_emitStatementLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(KEY_EMIT);
			setState(301);
			match(KEY_LOG_LINE);
			setState(302);
			match(T__3);
			setState(303);
			valueExpression();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(304);
				match(T__5);
				setState(305);
				valueExpression();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__4);
			setState(312);
			match(T__0);
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

	public static class EmitStatementXesEventContext extends ParserRuleContext {
		public ValueExpressionContext pid;
		public ValueExpressionContext piid;
		public ValueExpressionContext eid;
		public TerminalNode KEY_EMIT() { return getToken(BcqlParser.KEY_EMIT, 0); }
		public TerminalNode KEY_XES_EVENT() { return getToken(BcqlParser.KEY_XES_EVENT, 0); }
		public List<XesEmitVariableContext> xesEmitVariable() {
			return getRuleContexts(XesEmitVariableContext.class);
		}
		public XesEmitVariableContext xesEmitVariable(int i) {
			return getRuleContext(XesEmitVariableContext.class,i);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public EmitStatementXesEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatementXesEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmitStatementXesEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmitStatementXesEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmitStatementXesEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementXesEventContext emitStatementXesEvent() throws RecognitionException {
		EmitStatementXesEventContext _localctx = new EmitStatementXesEventContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_emitStatementXesEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(KEY_EMIT);
			setState(315);
			match(KEY_XES_EVENT);
			setState(316);
			match(T__3);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(317);
				((EmitStatementXesEventContext)_localctx).pid = valueExpression();
				}
			}

			setState(320);
			match(T__4);
			setState(321);
			match(T__3);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(322);
				((EmitStatementXesEventContext)_localctx).piid = valueExpression();
				}
			}

			setState(325);
			match(T__4);
			setState(326);
			match(T__3);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(327);
				((EmitStatementXesEventContext)_localctx).eid = valueExpression();
				}
			}

			setState(330);
			match(T__4);
			setState(331);
			match(T__3);
			setState(332);
			xesEmitVariable();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(333);
				match(T__5);
				setState(334);
				xesEmitVariable();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(T__4);
			setState(341);
			match(T__0);
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

	public static class EmitStatementXesTraceContext extends ParserRuleContext {
		public ValueExpressionContext pid;
		public ValueExpressionContext piid;
		public TerminalNode KEY_EMIT() { return getToken(BcqlParser.KEY_EMIT, 0); }
		public TerminalNode KEY_XES_TRACE() { return getToken(BcqlParser.KEY_XES_TRACE, 0); }
		public List<XesEmitVariableContext> xesEmitVariable() {
			return getRuleContexts(XesEmitVariableContext.class);
		}
		public XesEmitVariableContext xesEmitVariable(int i) {
			return getRuleContext(XesEmitVariableContext.class,i);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public EmitStatementXesTraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatementXesTrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterEmitStatementXesTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitEmitStatementXesTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitEmitStatementXesTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementXesTraceContext emitStatementXesTrace() throws RecognitionException {
		EmitStatementXesTraceContext _localctx = new EmitStatementXesTraceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_emitStatementXesTrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(KEY_EMIT);
			setState(344);
			match(KEY_XES_TRACE);
			setState(345);
			match(T__3);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(346);
				((EmitStatementXesTraceContext)_localctx).pid = valueExpression();
				}
			}

			setState(349);
			match(T__4);
			setState(350);
			match(T__3);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(351);
				((EmitStatementXesTraceContext)_localctx).piid = valueExpression();
				}
			}

			setState(354);
			match(T__4);
			setState(355);
			match(T__3);
			setState(356);
			xesEmitVariable();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(357);
				match(T__5);
				setState(358);
				xesEmitVariable();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(T__4);
			setState(365);
			match(T__0);
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

	public static class BlockNumberContext extends ParserRuleContext {
		public TerminalNode KEY_CURRENT() { return getToken(BcqlParser.KEY_CURRENT, 0); }
		public TerminalNode KEY_EARLIEST() { return getToken(BcqlParser.KEY_EARLIEST, 0); }
		public TerminalNode KEY_CONTINUOUS() { return getToken(BcqlParser.KEY_CONTINUOUS, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public BlockNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterBlockNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitBlockNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitBlockNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNumberContext blockNumber() throws RecognitionException {
		BlockNumberContext _localctx = new BlockNumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockNumber);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_CURRENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(KEY_CURRENT);
				}
				break;
			case KEY_EARLIEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(KEY_EARLIEST);
				}
				break;
			case KEY_CONTINUOUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(KEY_CONTINUOUS);
				}
				break;
			case T__1:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
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
		public List<TerminalNode> BYTES_LITERAL() { return getTokens(BcqlParser.BYTES_LITERAL); }
		public TerminalNode BYTES_LITERAL(int i) {
			return getToken(BcqlParser.BYTES_LITERAL, i);
		}
		public TerminalNode KEY_ANY() { return getToken(BcqlParser.KEY_ANY, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BcqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BcqlParser.STRING_LITERAL, i);
		}
		public AddressListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterAddressList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitAddressList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitAddressList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressListContext addressList() throws RecognitionException {
		AddressListContext _localctx = new AddressListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addressList);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(BYTES_LITERAL);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(374);
					match(T__5);
					setState(375);
					match(BYTES_LITERAL);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KEY_ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(KEY_ANY);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				variableName();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(STRING_LITERAL);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(384);
					match(T__5);
					setState(385);
					match(STRING_LITERAL);
					}
					}
					setState(390);
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
		public TerminalNode Identifier() { return getToken(BcqlParser.Identifier, 0); }
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterLogEntrySignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitLogEntrySignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitLogEntrySignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogEntrySignatureContext logEntrySignature() throws RecognitionException {
		LogEntrySignatureContext _localctx = new LogEntrySignatureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logEntrySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((LogEntrySignatureContext)_localctx).methodName = match(Identifier);
			setState(394);
			match(T__3);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SOL_BYTE_TYPE - 58)) | (1L << (SOL_INT_TYPE - 58)) | (1L << (SOL_ADDRESS_TYPE - 58)) | (1L << (SOL_BOOL_TYPE - 58)) | (1L << (SOL_STRING_TYPE - 58)))) != 0)) {
				{
				setState(395);
				logEntryParameter();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(396);
					match(T__5);
					setState(397);
					logEntryParameter();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(405);
			match(T__4);
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
		public TerminalNode KEY_INDEXED() { return getToken(BcqlParser.KEY_INDEXED, 0); }
		public LogEntryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logEntryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterLogEntryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitLogEntryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitLogEntryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogEntryParameterContext logEntryParameter() throws RecognitionException {
		LogEntryParameterContext _localctx = new LogEntryParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logEntryParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			solType(0);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_INDEXED) {
				{
				setState(408);
				match(KEY_INDEXED);
				}
			}

			setState(411);
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
		public TerminalNode KEY_SKIP_INDEXED() { return getToken(BcqlParser.KEY_SKIP_INDEXED, 0); }
		public TerminalNode KEY_SKIP_DATA() { return getToken(BcqlParser.KEY_SKIP_DATA, 0); }
		public SkippableLogEntryParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skippableLogEntryParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSkippableLogEntryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSkippableLogEntryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSkippableLogEntryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkippableLogEntryParameterContext skippableLogEntryParameter() throws RecognitionException {
		SkippableLogEntryParameterContext _localctx = new SkippableLogEntryParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_skippableLogEntryParameter);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOL_BYTE_TYPE:
			case SOL_INT_TYPE:
			case SOL_ADDRESS_TYPE:
			case SOL_BOOL_TYPE:
			case SOL_STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				logEntryParameter();
				}
				break;
			case KEY_SKIP_INDEXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(KEY_SKIP_INDEXED);
				}
				break;
			case KEY_SKIP_DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSmartContractQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSmartContractQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSmartContractQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractQueryContext smartContractQuery() throws RecognitionException {
		SmartContractQueryContext _localctx = new SmartContractQueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_smartContractQuery);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				publicVariableQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterPublicVariableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitPublicVariableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitPublicVariableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicVariableQueryContext publicVariableQuery() throws RecognitionException {
		PublicVariableQueryContext _localctx = new PublicVariableQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_publicVariableQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode Identifier() { return getToken(BcqlParser.Identifier, 0); }
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterPublicFunctionQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitPublicFunctionQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitPublicFunctionQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicFunctionQueryContext publicFunctionQuery() throws RecognitionException {
		PublicFunctionQueryContext _localctx = new PublicFunctionQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_publicFunctionQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			smartContractParameter();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(425);
				match(T__5);
				setState(426);
				smartContractParameter();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(T__6);
			setState(433);
			((PublicFunctionQueryContext)_localctx).methodName = match(Identifier);
			setState(434);
			match(T__3);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SOL_BYTE_TYPE - 58)) | (1L << (SOL_INT_TYPE - 58)) | (1L << (SOL_ADDRESS_TYPE - 58)) | (1L << (SOL_BOOL_TYPE - 58)) | (1L << (SOL_STRING_TYPE - 58)) | (1L << (Identifier - 58)))) != 0)) {
				{
				setState(435);
				smartContractQueryParameter();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(436);
					match(T__5);
					setState(437);
					smartContractQueryParameter();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(445);
			match(T__4);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSmartContractParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSmartContractParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSmartContractParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractParameterContext smartContractParameter() throws RecognitionException {
		SmartContractParameterContext _localctx = new SmartContractParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_smartContractParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			solType(0);
			setState(448);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSmartContractQueryParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSmartContractQueryParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSmartContractQueryParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartContractQueryParameterContext smartContractQueryParameter() throws RecognitionException {
		SmartContractQueryParameterContext _localctx = new SmartContractQueryParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_smartContractQueryParameter);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
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
				setState(451);
				solType(0);
				setState(452);
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
		public TerminalNode KEY_AS() { return getToken(BcqlParser.KEY_AS, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public NamedEmitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedEmitVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterNamedEmitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitNamedEmitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitNamedEmitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedEmitVariableContext namedEmitVariable() throws RecognitionException {
		NamedEmitVariableContext _localctx = new NamedEmitVariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_namedEmitVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			valueExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(457);
				match(KEY_AS);
				setState(458);
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
		public TerminalNode KEY_AS() { return getToken(BcqlParser.KEY_AS, 0); }
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterXesEmitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitXesEmitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitXesEmitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XesEmitVariableContext xesEmitVariable() throws RecognitionException {
		XesEmitVariableContext _localctx = new XesEmitVariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_xesEmitVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			valueExpression();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(462);
				match(KEY_AS);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					setState(463);
					xesTypes();
					}
				}

				setState(466);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterXesTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitXesTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitXesTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XesTypesContext xesTypes() throws RecognitionException {
		XesTypesContext _localctx = new XesTypesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_xesTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionStatement);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				methodStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				variableDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_methodStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			methodInvocation();
			setState(477);
			match(T__0);
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
		public TerminalNode Identifier() { return getToken(BcqlParser.Identifier, 0); }
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((MethodInvocationContext)_localctx).methodName = match(Identifier);
			setState(480);
			match(T__3);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << INT_LITERAL) | (1L << BYTES_LITERAL))) != 0) || _la==Identifier) {
				{
				setState(481);
				valueExpression();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(482);
					match(T__5);
					setState(483);
					valueExpression();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(491);
			match(T__4);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			solType(0);
			setState(494);
			variableName();
			setState(495);
			match(T__6);
			setState(496);
			statementExpression();
			setState(497);
			match(T__0);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentStatementContext variableAssignmentStatement() throws RecognitionException {
		VariableAssignmentStatementContext _localctx = new VariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			variableName();
			setState(500);
			match(T__6);
			setState(501);
			statementExpression();
			setState(502);
			match(T__0);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statementExpression);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				valueExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		public TerminalNode KEY_OR() { return getToken(BcqlParser.KEY_OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(511);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(513);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(514);
					match(KEY_OR);
					setState(515);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode KEY_AND() { return getToken(BcqlParser.KEY_AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(522);
			conditionalComparisonExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(524);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(525);
					match(KEY_AND);
					setState(526);
					conditionalComparisonExpression();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalComparisonExpressionContext conditionalComparisonExpression() throws RecognitionException {
		ConditionalComparisonExpressionContext _localctx = new ConditionalComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionalComparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			conditionalNotExpression();
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(533);
				comparators();
				setState(534);
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
		public TerminalNode KEY_NOT() { return getToken(BcqlParser.KEY_NOT, 0); }
		public ConditionalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalNotExpressionContext conditionalNotExpression() throws RecognitionException {
		ConditionalNotExpressionContext _localctx = new ConditionalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_conditionalNotExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_NOT) {
				{
				setState(538);
				match(KEY_NOT);
				}
			}

			setState(541);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterConditionalPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitConditionalPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitConditionalPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalPrimaryExpressionContext conditionalPrimaryExpression() throws RecognitionException {
		ConditionalPrimaryExpressionContext _localctx = new ConditionalPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditionalPrimaryExpression);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				valueExpression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(T__3);
				setState(545);
				conditionalOrExpression(0);
				setState(546);
				match(T__4);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_valueExpression);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case BOOLEAN_LITERAL:
			case STRING_LITERAL:
			case INT_LITERAL:
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
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
		public TerminalNode KEY_IN() { return getToken(BcqlParser.KEY_IN, 0); }
		public ComparatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterComparators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitComparators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitComparators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorsContext comparators() throws RecognitionException {
		ComparatorsContext _localctx = new ComparatorsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << KEY_IN))) != 0)) ) {
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
		public List<TerminalNode> Identifier() { return getTokens(BcqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BcqlParser.Identifier, i);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableName);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(Identifier);
				setState(558);
				match(T__18);
				setState(559);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(Identifier);
				setState(561);
				match(T__19);
				setState(562);
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
		public TerminalNode STRING_LITERAL() { return getToken(BcqlParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(BcqlParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode BYTES_LITERAL() { return getToken(BcqlParser.BYTES_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(BcqlParser.INT_LITERAL, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(BOOLEAN_LITERAL);
				}
				break;
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(BYTES_LITERAL);
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(INT_LITERAL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
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
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayLiteral);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				stringArrayLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				intArrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				booleanArrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
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
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BcqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BcqlParser.STRING_LITERAL, i);
		}
		public StringArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterStringArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitStringArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitStringArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrayLiteralContext stringArrayLiteral() throws RecognitionException {
		StringArrayLiteralContext _localctx = new StringArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_stringArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__1);
			setState(579);
			match(STRING_LITERAL);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(580);
				match(T__5);
				setState(581);
				match(STRING_LITERAL);
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
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

	public static class IntArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> INT_LITERAL() { return getTokens(BcqlParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(BcqlParser.INT_LITERAL, i);
		}
		public IntArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterIntArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitIntArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitIntArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrayLiteralContext intArrayLiteral() throws RecognitionException {
		IntArrayLiteralContext _localctx = new IntArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_intArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__1);
			{
			setState(590);
			match(INT_LITERAL);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(591);
				match(T__5);
				setState(592);
				match(INT_LITERAL);
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
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

	public static class BooleanArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN_LITERAL() { return getTokens(BcqlParser.BOOLEAN_LITERAL); }
		public TerminalNode BOOLEAN_LITERAL(int i) {
			return getToken(BcqlParser.BOOLEAN_LITERAL, i);
		}
		public BooleanArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterBooleanArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitBooleanArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitBooleanArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanArrayLiteralContext booleanArrayLiteral() throws RecognitionException {
		BooleanArrayLiteralContext _localctx = new BooleanArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_booleanArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__1);
			setState(601);
			match(BOOLEAN_LITERAL);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(602);
				match(T__5);
				setState(603);
				match(BOOLEAN_LITERAL);
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
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

	public static class BytesArrayLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BYTES_LITERAL() { return getTokens(BcqlParser.BYTES_LITERAL); }
		public TerminalNode BYTES_LITERAL(int i) {
			return getToken(BcqlParser.BYTES_LITERAL, i);
		}
		public BytesArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytesArrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterBytesArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitBytesArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitBytesArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesArrayLiteralContext bytesArrayLiteral() throws RecognitionException {
		BytesArrayLiteralContext _localctx = new BytesArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bytesArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__1);
			setState(612);
			match(BYTES_LITERAL);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(613);
				match(T__5);
				setState(614);
				match(BYTES_LITERAL);
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
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

	public static class SolTypeRuleContext extends ParserRuleContext {
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BcqlParser.EOF, 0); }
		public SolTypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solTypeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSolTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSolTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSolTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolTypeRuleContext solTypeRule() throws RecognitionException {
		SolTypeRuleContext _localctx = new SolTypeRuleContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_solTypeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			solType(0);
			setState(623);
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
		public TerminalNode SOL_ADDRESS_TYPE() { return getToken(BcqlParser.SOL_ADDRESS_TYPE, 0); }
		public TerminalNode SOL_BOOL_TYPE() { return getToken(BcqlParser.SOL_BOOL_TYPE, 0); }
		public TerminalNode SOL_BYTE_TYPE() { return getToken(BcqlParser.SOL_BYTE_TYPE, 0); }
		public TerminalNode SOL_INT_TYPE() { return getToken(BcqlParser.SOL_INT_TYPE, 0); }
		public TerminalNode SOL_STRING_TYPE() { return getToken(BcqlParser.SOL_STRING_TYPE, 0); }
		public SolTypeContext solType() {
			return getRuleContext(SolTypeContext.class,0);
		}
		public SolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).enterSolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BcqlListener ) ((BcqlListener)listener).exitSolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BcqlVisitor ) return ((BcqlVisitor<? extends T>)visitor).visitSolType(this);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_solType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOL_ADDRESS_TYPE:
				{
				setState(626);
				match(SOL_ADDRESS_TYPE);
				}
				break;
			case SOL_BOOL_TYPE:
				{
				setState(627);
				match(SOL_BOOL_TYPE);
				}
				break;
			case SOL_BYTE_TYPE:
				{
				setState(628);
				match(SOL_BYTE_TYPE);
				}
				break;
			case SOL_INT_TYPE:
				{
				setState(629);
				match(SOL_INT_TYPE);
				}
				break;
			case SOL_STRING_TYPE:
				{
				setState(630);
				match(SOL_STRING_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SolTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_solType);
					setState(633);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(634);
					match(T__20);
					setState(635);
					match(T__21);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		case 42:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 43:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0284\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\7\2z\n\2\f\2\16\2}\13\2\3\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u009d\n\6\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b4\n"+
		"\n\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\16\5\16\u00d8\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\6\20\u00ec\n\20\r\20\16\20\u00ed\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\6\20\u00fb\n\20\r\20\16\20\u00fc\5\20\u00ff"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0127\n\24\f\24\16\24\u012a\13\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0135\n\25\f\25\16\25\u0138\13\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3\26\3\26\3\26\5\26\u0146\n"+
		"\26\3\26\3\26\3\26\5\26\u014b\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0152"+
		"\n\26\f\26\16\26\u0155\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u015e"+
		"\n\27\3\27\3\27\3\27\5\27\u0163\n\27\3\27\3\27\3\27\3\27\3\27\7\27\u016a"+
		"\n\27\f\27\16\27\u016d\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0176"+
		"\n\30\3\31\3\31\3\31\7\31\u017b\n\31\f\31\16\31\u017e\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0185\n\31\f\31\16\31\u0188\13\31\5\31\u018a\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0191\n\32\f\32\16\32\u0194\13\32\5\32"+
		"\u0196\n\32\3\32\3\32\3\33\3\33\5\33\u019c\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\5\34\u01a3\n\34\3\35\3\35\5\35\u01a7\n\35\3\36\3\36\3\37\3\37\3\37"+
		"\7\37\u01ae\n\37\f\37\16\37\u01b1\13\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u01b9\n\37\f\37\16\37\u01bc\13\37\5\37\u01be\n\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\5!\u01c9\n!\3\"\3\"\3\"\5\"\u01ce\n\"\3#\3#\3#\5#\u01d3"+
		"\n#\3#\5#\u01d6\n#\3$\3$\3%\3%\3%\5%\u01dd\n%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u01e7\n\'\f\'\16\'\u01ea\13\'\5\'\u01ec\n\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\5*\u01fd\n*\3+\3+\3,\3,\3,\3,\3,\3,\7,"+
		"\u0207\n,\f,\16,\u020a\13,\3-\3-\3-\3-\3-\3-\7-\u0212\n-\f-\16-\u0215"+
		"\13-\3.\3.\3.\3.\5.\u021b\n.\3/\5/\u021e\n/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0227\n\60\3\61\3\61\5\61\u022b\n\61\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u0236\n\63\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u023d\n\64\3\65\3\65\3\65\3\65\5\65\u0243\n\65\3\66\3\66\3\66\3\66\7"+
		"\66\u0249\n\66\f\66\16\66\u024c\13\66\3\66\3\66\3\67\3\67\3\67\3\67\7"+
		"\67\u0254\n\67\f\67\16\67\u0257\13\67\3\67\3\67\38\38\38\38\78\u025f\n"+
		"8\f8\168\u0262\138\38\38\39\39\39\39\79\u026a\n9\f9\169\u026d\139\39\3"+
		"9\3:\3:\3:\3;\3;\3;\3;\3;\3;\5;\u027a\n;\3;\3;\3;\7;\u027f\n;\f;\16;\u0282"+
		"\13;\3;\2\5VXt<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\4\3\2\n\16\4\2\17\24\64\64\2"+
		"\u029b\2v\3\2\2\2\4\u0087\3\2\2\2\6\u008c\3\2\2\2\b\u0094\3\2\2\2\n\u009c"+
		"\3\2\2\2\f\u009e\3\2\2\2\16\u00a6\3\2\2\2\20\u00ab\3\2\2\2\22\u00b3\3"+
		"\2\2\2\24\u00b5\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00cf\3\2"+
		"\2\2\34\u00db\3\2\2\2\36\u00fe\3\2\2\2 \u0100\3\2\2\2\"\u0105\3\2\2\2"+
		"$\u011b\3\2\2\2&\u011d\3\2\2\2(\u012e\3\2\2\2*\u013c\3\2\2\2,\u0159\3"+
		"\2\2\2.\u0175\3\2\2\2\60\u0189\3\2\2\2\62\u018b\3\2\2\2\64\u0199\3\2\2"+
		"\2\66\u01a2\3\2\2\28\u01a6\3\2\2\2:\u01a8\3\2\2\2<\u01aa\3\2\2\2>\u01c1"+
		"\3\2\2\2@\u01c8\3\2\2\2B\u01ca\3\2\2\2D\u01cf\3\2\2\2F\u01d7\3\2\2\2H"+
		"\u01dc\3\2\2\2J\u01de\3\2\2\2L\u01e1\3\2\2\2N\u01ef\3\2\2\2P\u01f5\3\2"+
		"\2\2R\u01fc\3\2\2\2T\u01fe\3\2\2\2V\u0200\3\2\2\2X\u020b\3\2\2\2Z\u0216"+
		"\3\2\2\2\\\u021d\3\2\2\2^\u0226\3\2\2\2`\u022a\3\2\2\2b\u022c\3\2\2\2"+
		"d\u0235\3\2\2\2f\u023c\3\2\2\2h\u0242\3\2\2\2j\u0244\3\2\2\2l\u024f\3"+
		"\2\2\2n\u025a\3\2\2\2p\u0265\3\2\2\2r\u0270\3\2\2\2t\u0279\3\2\2\2vw\5"+
		"\4\3\2w{\5\b\5\2xz\5\n\6\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3"+
		"\2\2\2}{\3\2\2\2~\u0082\5\6\4\2\177\u0081\5\22\n\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u0088"+
		"\7\31\2\2\u0088\u0089\7\32\2\2\u0089\u008a\5f\64\2\u008a\u008b\7\3\2\2"+
		"\u008b\5\3\2\2\2\u008c\u008e\7\31\2\2\u008d\u008f\7\35\2\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\34\2\2"+
		"\u0091\u0092\5f\64\2\u0092\u0093\7\3\2\2\u0093\7\3\2\2\2\u0094\u0095\7"+
		"\31\2\2\u0095\u0096\7\33\2\2\u0096\u0097\5f\64\2\u0097\u0098\7\3\2\2\u0098"+
		"\t\3\2\2\2\u0099\u009d\5\16\b\2\u009a\u009d\5\20\t\2\u009b\u009d\5\f\7"+
		"\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\13"+
		"\3\2\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\7 \2\2\u00a0\u00a2\79\2\2\u00a1"+
		"\u00a3\79\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\7\3\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8"+
		"\7\36\2\2\u00a8\u00a9\5f\64\2\u00a9\u00aa\7\3\2\2\u00aa\17\3\2\2\2\u00ab"+
		"\u00ac\7\31\2\2\u00ac\u00ad\7\37\2\2\u00ad\u00ae\78\2\2\u00ae\u00af\7"+
		"\3\2\2\u00af\21\3\2\2\2\u00b0\u00b4\5\24\13\2\u00b1\u00b4\5H%\2\u00b2"+
		"\u00b4\5$\23\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00ba\7\4\2\2\u00b7\u00b9"+
		"\5\22\n\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be"+
		"\7\5\2\2\u00be\25\3\2\2\2\u00bf\u00c6\5\30\r\2\u00c0\u00c6\5\32\16\2\u00c1"+
		"\u00c6\5\34\17\2\u00c2\u00c6\5\36\20\2\u00c3\u00c6\5 \21\2\u00c4\u00c6"+
		"\5\"\22\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\27"+
		"\3\2\2\2\u00c7\u00c8\7!\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\5.\30\2\u00ca"+
		"\u00cb\7\7\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\5.\30\2\u00cd\u00ce\7\7"+
		"\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d2\7\6\2\2\u00d1\u00d3"+
		"\5\60\31\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\7\7\2\2\u00d5\u00d7\7\6\2\2\u00d6\u00d8\5\60\31\2\u00d7\u00d6"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\7\2\2\u00da"+
		"\33\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\5\60\31"+
		"\2\u00de\u00df\7\7\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5\62\32\2\u00e1"+
		"\u00e2\7\7\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7\6\2\2"+
		"\u00e5\u00e6\5`\61\2\u00e6\u00eb\7\7\2\2\u00e7\u00e8\7\6\2\2\u00e8\u00e9"+
		"\58\35\2\u00e9\u00ea\7\7\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ff\3\2"+
		"\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00f2\5`\61\2\u00f2"+
		"\u00f3\7\7\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\5`\61\2\u00f5\u00fa\7\7"+
		"\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\7\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00e3\3\2\2\2\u00fe"+
		"\u00ef\3\2\2\2\u00ff\37\3\2\2\2\u0100\u0101\7%\2\2\u0101\u0102\7\6\2\2"+
		"\u0102\u0103\5T+\2\u0103\u0104\7\7\2\2\u0104!\3\2\2\2\u0105\u0106\7&\2"+
		"\2\u0106\u0107\7\6\2\2\u0107\u0108\5\60\31\2\u0108\u0109\7\7\2\2\u0109"+
		"\u010a\7\6\2\2\u010a\u010b\5`\61\2\u010b\u010c\7\7\2\2\u010c\u010d\7\6"+
		"\2\2\u010d\u0112\5> \2\u010e\u010f\7\b\2\2\u010f\u0111\5> \2\u0110\u010e"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\7\2\2\u0116#\3\2\2\2"+
		"\u0117\u011c\5&\24\2\u0118\u011c\5(\25\2\u0119\u011c\5*\26\2\u011a\u011c"+
		"\5,\27\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c%\3\2\2\2\u011d\u011e\7\'\2\2\u011e\u011f\7(\2\2\u011f"+
		"\u0120\7\6\2\2\u0120\u0121\5`\61\2\u0121\u0122\7\7\2\2\u0122\u0123\7\6"+
		"\2\2\u0123\u0128\5B\"\2\u0124\u0125\7\b\2\2\u0125\u0127\5B\"\2\u0126\u0124"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\7\2\2\u012c\u012d\7\3"+
		"\2\2\u012d\'\3\2\2\2\u012e\u012f\7\'\2\2\u012f\u0130\7)\2\2\u0130\u0131"+
		"\7\6\2\2\u0131\u0136\5`\61\2\u0132\u0133\7\b\2\2\u0133\u0135\5`\61\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\7\2\2\u013a"+
		"\u013b\7\3\2\2\u013b)\3\2\2\2\u013c\u013d\7\'\2\2\u013d\u013e\7*\2\2\u013e"+
		"\u0140\7\6\2\2\u013f\u0141\5`\61\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\7\2\2\u0143\u0145\7\6\2\2\u0144"+
		"\u0146\5`\61\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\7\7\2\2\u0148\u014a\7\6\2\2\u0149\u014b\5`\61\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\7"+
		"\2\2\u014d\u014e\7\6\2\2\u014e\u0153\5D#\2\u014f\u0150\7\b\2\2\u0150\u0152"+
		"\5D#\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\7"+
		"\2\2\u0157\u0158\7\3\2\2\u0158+\3\2\2\2\u0159\u015a\7\'\2\2\u015a\u015b"+
		"\7+\2\2\u015b\u015d\7\6\2\2\u015c\u015e\5`\61\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\7\2\2\u0160\u0162\7\6"+
		"\2\2\u0161\u0163\5`\61\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\7\7\2\2\u0165\u0166\7\6\2\2\u0166\u016b\5D"+
		"#\2\u0167\u0168\7\b\2\2\u0168\u016a\5D#\2\u0169\u0167\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7\7\2\2\u016f\u0170\7\3\2\2\u0170-\3\2\2\2"+
		"\u0171\u0176\7-\2\2\u0172\u0176\7,\2\2\u0173\u0176\7.\2\2\u0174\u0176"+
		"\5`\61\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176/\3\2\2\2\u0177\u017c\7;\2\2\u0178\u0179\7\b\2\2\u0179"+
		"\u017b\7;\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u018a\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u018a\7/\2\2\u0180\u018a\5d\63\2\u0181\u0186\79\2\2\u0182\u0183\7\b\2"+
		"\2\u0183\u0185\79\2\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u0177\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0180\3\2\2\2\u0189\u0181\3\2"+
		"\2\2\u018a\61\3\2\2\2\u018b\u018c\7H\2\2\u018c\u0195\7\6\2\2\u018d\u0192"+
		"\5\64\33\2\u018e\u018f\7\b\2\2\u018f\u0191\5\64\33\2\u0190\u018e\3\2\2"+
		"\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\7\7\2\2\u0198\63\3\2\2\2\u0199\u019b\5t;\2"+
		"\u019a\u019c\7\60\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019e\5d\63\2\u019e\65\3\2\2\2\u019f\u01a3\5\64\33\2\u01a0"+
		"\u01a3\7\66\2\2\u01a1\u01a3\7\67\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3"+
		"\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\67\3\2\2\2\u01a4\u01a7\5:\36\2\u01a5"+
		"\u01a7\5<\37\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a79\3\2\2\2"+
		"\u01a8\u01a9\5> \2\u01a9;\3\2\2\2\u01aa\u01af\5> \2\u01ab\u01ac\7\b\2"+
		"\2\u01ac\u01ae\5> \2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\7\t\2\2\u01b3\u01b4\7H\2\2\u01b4\u01bd\7\6\2\2\u01b5\u01ba\5@!"+
		"\2\u01b6\u01b7\7\b\2\2\u01b7\u01b9\5@!\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c0\7\7\2\2\u01c0=\3\2\2\2\u01c1\u01c2\5t;\2\u01c2\u01c3"+
		"\5d\63\2\u01c3?\3\2\2\2\u01c4\u01c9\5d\63\2\u01c5\u01c6\5t;\2\u01c6\u01c7"+
		"\5f\64\2\u01c7\u01c9\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9"+
		"A\3\2\2\2\u01ca\u01cd\5`\61\2\u01cb\u01cc\7\65\2\2\u01cc\u01ce\5d\63\2"+
		"\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceC\3\2\2\2\u01cf\u01d5\5"+
		"`\61\2\u01d0\u01d2\7\65\2\2\u01d1\u01d3\5F$\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5d\63\2\u01d5\u01d0\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6E\3\2\2\2\u01d7\u01d8\t\2\2\2\u01d8G\3\2"+
		"\2\2\u01d9\u01dd\5J&\2\u01da\u01dd\5N(\2\u01db\u01dd\5P)\2\u01dc\u01d9"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddI\3\2\2\2\u01de"+
		"\u01df\5L\'\2\u01df\u01e0\7\3\2\2\u01e0K\3\2\2\2\u01e1\u01e2\7H\2\2\u01e2"+
		"\u01eb\7\6\2\2\u01e3\u01e8\5`\61\2\u01e4\u01e5\7\b\2\2\u01e5\u01e7\5`"+
		"\61\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01e3\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\7\2\2\u01ee"+
		"M\3\2\2\2\u01ef\u01f0\5t;\2\u01f0\u01f1\5d\63\2\u01f1\u01f2\7\t\2\2\u01f2"+
		"\u01f3\5R*\2\u01f3\u01f4\7\3\2\2\u01f4O\3\2\2\2\u01f5\u01f6\5d\63\2\u01f6"+
		"\u01f7\7\t\2\2\u01f7\u01f8\5R*\2\u01f8\u01f9\7\3\2\2\u01f9Q\3\2\2\2\u01fa"+
		"\u01fd\5`\61\2\u01fb\u01fd\5L\'\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fdS\3\2\2\2\u01fe\u01ff\5V,\2\u01ffU\3\2\2\2\u0200\u0201\b,\1"+
		"\2\u0201\u0202\5X-\2\u0202\u0208\3\2\2\2\u0203\u0204\f\3\2\2\u0204\u0205"+
		"\7\63\2\2\u0205\u0207\5X-\2\u0206\u0203\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209W\3\2\2\2\u020a\u0208\3\2\2\2"+
		"\u020b\u020c\b-\1\2\u020c\u020d\5Z.\2\u020d\u0213\3\2\2\2\u020e\u020f"+
		"\f\3\2\2\u020f\u0210\7\62\2\2\u0210\u0212\5Z.\2\u0211\u020e\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214Y\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0216\u021a\5\\/\2\u0217\u0218\5b\62\2\u0218\u0219"+
		"\5\\/\2\u0219\u021b\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"[\3\2\2\2\u021c\u021e\7\61\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2"+
		"\u021e\u021f\3\2\2\2\u021f\u0220\5^\60\2\u0220]\3\2\2\2\u0221\u0227\5"+
		"`\61\2\u0222\u0223\7\6\2\2\u0223\u0224\5V,\2\u0224\u0225\7\7\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0222\3\2\2\2\u0227_\3\2\2\2"+
		"\u0228\u022b\5f\64\2\u0229\u022b\5d\63\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022ba\3\2\2\2\u022c\u022d\t\3\2\2\u022dc\3\2\2\2\u022e\u0236"+
		"\7H\2\2\u022f\u0230\7H\2\2\u0230\u0231\7\25\2\2\u0231\u0236\7H\2\2\u0232"+
		"\u0233\7H\2\2\u0233\u0234\7\26\2\2\u0234\u0236\7H\2\2\u0235\u022e\3\2"+
		"\2\2\u0235\u022f\3\2\2\2\u0235\u0232\3\2\2\2\u0236e\3\2\2\2\u0237\u023d"+
		"\79\2\2\u0238\u023d\78\2\2\u0239\u023d\7;\2\2\u023a\u023d\7:\2\2\u023b"+
		"\u023d\5h\65\2\u023c\u0237\3\2\2\2\u023c\u0238\3\2\2\2\u023c\u0239\3\2"+
		"\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023dg\3\2\2\2\u023e\u0243"+
		"\5j\66\2\u023f\u0243\5l\67\2\u0240\u0243\5n8\2\u0241\u0243\5p9\2\u0242"+
		"\u023e\3\2\2\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2"+
		"\2\2\u0243i\3\2\2\2\u0244\u0245\7\4\2\2\u0245\u024a\79\2\2\u0246\u0247"+
		"\7\b\2\2\u0247\u0249\79\2\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u024e\7\5\2\2\u024ek\3\2\2\2\u024f\u0250\7\4\2\2\u0250\u0255"+
		"\7:\2\2\u0251\u0252\7\b\2\2\u0252\u0254\7:\2\2\u0253\u0251\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7\5\2\2\u0259m\3\2\2\2\u025a\u025b"+
		"\7\4\2\2\u025b\u0260\78\2\2\u025c\u025d\7\b\2\2\u025d\u025f\78\2\2\u025e"+
		"\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7\5\2\2\u0264"+
		"o\3\2\2\2\u0265\u0266\7\4\2\2\u0266\u026b\7;\2\2\u0267\u0268\7\b\2\2\u0268"+
		"\u026a\7;\2\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\7\5\2\2\u026fq\3\2\2\2\u0270\u0271\5t;\2\u0271\u0272\7\2\2\3\u0272"+
		"s\3\2\2\2\u0273\u0274\b;\1\2\u0274\u027a\7>\2\2\u0275\u027a\7?\2\2\u0276"+
		"\u027a\7<\2\2\u0277\u027a\7=\2\2\u0278\u027a\7D\2\2\u0279\u0273\3\2\2"+
		"\2\u0279\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a\u0280\3\2\2\2\u027b\u027c\f\3\2\2\u027c\u027d\7\27\2\2"+
		"\u027d\u027f\7\30\2\2\u027e\u027b\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281u\3\2\2\2\u0282\u0280\3\2\2\2={\u0082"+
		"\u008e\u009c\u00a2\u00b3\u00ba\u00c5\u00d2\u00d7\u00ed\u00fc\u00fe\u0112"+
		"\u011b\u0128\u0136\u0140\u0145\u014a\u0153\u015d\u0162\u016b\u0175\u017c"+
		"\u0186\u0189\u0192\u0195\u019b\u01a2\u01a6\u01af\u01ba\u01bd\u01c8\u01cd"+
		"\u01d2\u01d5\u01dc\u01e8\u01eb\u01fc\u0208\u0213\u021a\u021d\u0226\u022a"+
		"\u0235\u023c\u0242\u024a\u0255\u0260\u026b\u0279\u0280";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}