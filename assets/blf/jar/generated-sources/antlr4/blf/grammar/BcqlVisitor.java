// Generated from blf/grammar/Bcql.g4 by ANTLR 4.7.2
package blf.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BcqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BcqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BcqlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(BcqlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#blockchain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockchain(BcqlParser.BlockchainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(BcqlParser.ConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#outputFolder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputFolder(BcqlParser.OutputFolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#optionalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParams(BcqlParser.OptionalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#errorOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorOutput(BcqlParser.ErrorOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emissionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmissionMode(BcqlParser.EmissionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#abortOnException}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbortOnException(BcqlParser.AbortOnExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BcqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(BcqlParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(BcqlParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#blockFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFilter(BcqlParser.BlockFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#transactionFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionFilter(BcqlParser.TransactionFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#logEntryFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEntryFilter(BcqlParser.LogEntryFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#smartContractFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractFilter(BcqlParser.SmartContractFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#genericFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFilter(BcqlParser.GenericFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#transactionInputFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionInputFilter(BcqlParser.TransactionInputFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(BcqlParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emitStatementCsv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatementCsv(BcqlParser.EmitStatementCsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emitStatementLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatementLog(BcqlParser.EmitStatementLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emitStatementXesEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatementXesEvent(BcqlParser.EmitStatementXesEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#emitStatementXesTrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatementXesTrace(BcqlParser.EmitStatementXesTraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#blockNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNumber(BcqlParser.BlockNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#addressList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressList(BcqlParser.AddressListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#logEntrySignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEntrySignature(BcqlParser.LogEntrySignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#logEntryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEntryParameter(BcqlParser.LogEntryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkippableLogEntryParameter(BcqlParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#smartContractQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractQuery(BcqlParser.SmartContractQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicVariableQuery(BcqlParser.PublicVariableQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicFunctionQuery(BcqlParser.PublicFunctionQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#smartContractParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractParameter(BcqlParser.SmartContractParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractQueryParameter(BcqlParser.SmartContractQueryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedEmitVariable(BcqlParser.NamedEmitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXesEmitVariable(BcqlParser.XesEmitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#xesTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXesTypes(BcqlParser.XesTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(BcqlParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#methodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodStatement(BcqlParser.MethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(BcqlParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(BcqlParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(BcqlParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(BcqlParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(BcqlParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(BcqlParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(BcqlParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalComparisonExpression(BcqlParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalNotExpression(BcqlParser.ConditionalNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalPrimaryExpression(BcqlParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(BcqlParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#comparators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparators(BcqlParser.ComparatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(BcqlParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BcqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(BcqlParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayLiteral(BcqlParser.StringArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayLiteral(BcqlParser.IntArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayLiteral(BcqlParser.BooleanArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytesArrayLiteral(BcqlParser.BytesArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#solTypeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolTypeRule(BcqlParser.SolTypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlParser#solType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolType(BcqlParser.SolTypeContext ctx);
}