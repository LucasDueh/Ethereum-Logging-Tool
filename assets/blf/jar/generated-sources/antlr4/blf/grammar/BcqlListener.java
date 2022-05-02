// Generated from blf/grammar/Bcql.g4 by ANTLR 4.7.2
package blf.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BcqlParser}.
 */
public interface BcqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BcqlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(BcqlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(BcqlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#blockchain}.
	 * @param ctx the parse tree
	 */
	void enterBlockchain(BcqlParser.BlockchainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#blockchain}.
	 * @param ctx the parse tree
	 */
	void exitBlockchain(BcqlParser.BlockchainContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(BcqlParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(BcqlParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#outputFolder}.
	 * @param ctx the parse tree
	 */
	void enterOutputFolder(BcqlParser.OutputFolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#outputFolder}.
	 * @param ctx the parse tree
	 */
	void exitOutputFolder(BcqlParser.OutputFolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#optionalParams}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParams(BcqlParser.OptionalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#optionalParams}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParams(BcqlParser.OptionalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#errorOutput}.
	 * @param ctx the parse tree
	 */
	void enterErrorOutput(BcqlParser.ErrorOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#errorOutput}.
	 * @param ctx the parse tree
	 */
	void exitErrorOutput(BcqlParser.ErrorOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emissionMode}.
	 * @param ctx the parse tree
	 */
	void enterEmissionMode(BcqlParser.EmissionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emissionMode}.
	 * @param ctx the parse tree
	 */
	void exitEmissionMode(BcqlParser.EmissionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#abortOnException}.
	 * @param ctx the parse tree
	 */
	void enterAbortOnException(BcqlParser.AbortOnExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#abortOnException}.
	 * @param ctx the parse tree
	 */
	void exitAbortOnException(BcqlParser.AbortOnExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BcqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BcqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(BcqlParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(BcqlParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(BcqlParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(BcqlParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#blockFilter}.
	 * @param ctx the parse tree
	 */
	void enterBlockFilter(BcqlParser.BlockFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#blockFilter}.
	 * @param ctx the parse tree
	 */
	void exitBlockFilter(BcqlParser.BlockFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#transactionFilter}.
	 * @param ctx the parse tree
	 */
	void enterTransactionFilter(BcqlParser.TransactionFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#transactionFilter}.
	 * @param ctx the parse tree
	 */
	void exitTransactionFilter(BcqlParser.TransactionFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#logEntryFilter}.
	 * @param ctx the parse tree
	 */
	void enterLogEntryFilter(BcqlParser.LogEntryFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#logEntryFilter}.
	 * @param ctx the parse tree
	 */
	void exitLogEntryFilter(BcqlParser.LogEntryFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#smartContractFilter}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractFilter(BcqlParser.SmartContractFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#smartContractFilter}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractFilter(BcqlParser.SmartContractFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#genericFilter}.
	 * @param ctx the parse tree
	 */
	void enterGenericFilter(BcqlParser.GenericFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#genericFilter}.
	 * @param ctx the parse tree
	 */
	void exitGenericFilter(BcqlParser.GenericFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#transactionInputFilter}.
	 * @param ctx the parse tree
	 */
	void enterTransactionInputFilter(BcqlParser.TransactionInputFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#transactionInputFilter}.
	 * @param ctx the parse tree
	 */
	void exitTransactionInputFilter(BcqlParser.TransactionInputFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#transactionReplay}.
	 * @param ctx the parse tree
	 */
	void enterTransactionReplay(BcqlParser.TransactionReplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#transactionReplay}.
	 * @param ctx the parse tree
	 */
	void exitTransactionReplay(BcqlParser.TransactionReplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(BcqlParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(BcqlParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emitStatementCsv}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatementCsv(BcqlParser.EmitStatementCsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emitStatementCsv}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatementCsv(BcqlParser.EmitStatementCsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emitStatementLog}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatementLog(BcqlParser.EmitStatementLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emitStatementLog}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatementLog(BcqlParser.EmitStatementLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emitStatementXesEvent}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatementXesEvent(BcqlParser.EmitStatementXesEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emitStatementXesEvent}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatementXesEvent(BcqlParser.EmitStatementXesEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#emitStatementXesTrace}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatementXesTrace(BcqlParser.EmitStatementXesTraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#emitStatementXesTrace}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatementXesTrace(BcqlParser.EmitStatementXesTraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#blockNumber}.
	 * @param ctx the parse tree
	 */
	void enterBlockNumber(BcqlParser.BlockNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#blockNumber}.
	 * @param ctx the parse tree
	 */
	void exitBlockNumber(BcqlParser.BlockNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#addressList}.
	 * @param ctx the parse tree
	 */
	void enterAddressList(BcqlParser.AddressListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#addressList}.
	 * @param ctx the parse tree
	 */
	void exitAddressList(BcqlParser.AddressListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#logEntrySignature}.
	 * @param ctx the parse tree
	 */
	void enterLogEntrySignature(BcqlParser.LogEntrySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#logEntrySignature}.
	 * @param ctx the parse tree
	 */
	void exitLogEntrySignature(BcqlParser.LogEntrySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#logEntryParameter}.
	 * @param ctx the parse tree
	 */
	void enterLogEntryParameter(BcqlParser.LogEntryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#logEntryParameter}.
	 * @param ctx the parse tree
	 */
	void exitLogEntryParameter(BcqlParser.LogEntryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 */
	void enterSkippableLogEntryParameter(BcqlParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 */
	void exitSkippableLogEntryParameter(BcqlParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#smartContractQuery}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractQuery(BcqlParser.SmartContractQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#smartContractQuery}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractQuery(BcqlParser.SmartContractQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 */
	void enterPublicVariableQuery(BcqlParser.PublicVariableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 */
	void exitPublicVariableQuery(BcqlParser.PublicVariableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 */
	void enterPublicFunctionQuery(BcqlParser.PublicFunctionQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 */
	void exitPublicFunctionQuery(BcqlParser.PublicFunctionQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#smartContractParameter}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractParameter(BcqlParser.SmartContractParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#smartContractParameter}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractParameter(BcqlParser.SmartContractParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractQueryParameter(BcqlParser.SmartContractQueryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractQueryParameter(BcqlParser.SmartContractQueryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 */
	void enterNamedEmitVariable(BcqlParser.NamedEmitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 */
	void exitNamedEmitVariable(BcqlParser.NamedEmitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 */
	void enterXesEmitVariable(BcqlParser.XesEmitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 */
	void exitXesEmitVariable(BcqlParser.XesEmitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#xesTypes}.
	 * @param ctx the parse tree
	 */
	void enterXesTypes(BcqlParser.XesTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#xesTypes}.
	 * @param ctx the parse tree
	 */
	void exitXesTypes(BcqlParser.XesTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(BcqlParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(BcqlParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(BcqlParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(BcqlParser.MethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(BcqlParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(BcqlParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(BcqlParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(BcqlParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(BcqlParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(BcqlParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(BcqlParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(BcqlParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(BcqlParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(BcqlParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(BcqlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(BcqlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(BcqlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(BcqlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalComparisonExpression(BcqlParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalComparisonExpression(BcqlParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalNotExpression(BcqlParser.ConditionalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalNotExpression(BcqlParser.ConditionalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalPrimaryExpression(BcqlParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalPrimaryExpression(BcqlParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(BcqlParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(BcqlParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#comparators}.
	 * @param ctx the parse tree
	 */
	void enterComparators(BcqlParser.ComparatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#comparators}.
	 * @param ctx the parse tree
	 */
	void exitComparators(BcqlParser.ComparatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(BcqlParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(BcqlParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BcqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BcqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(BcqlParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(BcqlParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayLiteral(BcqlParser.StringArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayLiteral(BcqlParser.StringArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayLiteral(BcqlParser.IntArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayLiteral(BcqlParser.IntArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayLiteral(BcqlParser.BooleanArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayLiteral(BcqlParser.BooleanArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBytesArrayLiteral(BcqlParser.BytesArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBytesArrayLiteral(BcqlParser.BytesArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#solTypeRule}.
	 * @param ctx the parse tree
	 */
	void enterSolTypeRule(BcqlParser.SolTypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#solTypeRule}.
	 * @param ctx the parse tree
	 */
	void exitSolTypeRule(BcqlParser.SolTypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlParser#solType}.
	 * @param ctx the parse tree
	 */
	void enterSolType(BcqlParser.SolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlParser#solType}.
	 * @param ctx the parse tree
	 */
	void exitSolType(BcqlParser.SolTypeContext ctx);
}