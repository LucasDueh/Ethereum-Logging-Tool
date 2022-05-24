// Generated from blf/grammar/BcqlUtil.g4 by ANTLR 4.7.2
package blf.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BcqlUtilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BcqlUtilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#blockNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNumber(BcqlUtilParser.BlockNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#addressList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressList(BcqlUtilParser.AddressListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#logEntrySignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEntrySignature(BcqlUtilParser.LogEntrySignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#logEntryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEntryParameter(BcqlUtilParser.LogEntryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkippableLogEntryParameter(BcqlUtilParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#smartContractQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractQuery(BcqlUtilParser.SmartContractQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicVariableQuery(BcqlUtilParser.PublicVariableQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicFunctionQuery(BcqlUtilParser.PublicFunctionQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#smartContractParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractParameter(BcqlUtilParser.SmartContractParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmartContractQueryParameter(BcqlUtilParser.SmartContractQueryParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedEmitVariable(BcqlUtilParser.NamedEmitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXesEmitVariable(BcqlUtilParser.XesEmitVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#xesTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXesTypes(BcqlUtilParser.XesTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(BcqlUtilParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#methodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodStatement(BcqlUtilParser.MethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(BcqlUtilParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(BcqlUtilParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(BcqlUtilParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(BcqlUtilParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(BcqlUtilParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(BcqlUtilParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(BcqlUtilParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalComparisonExpression(BcqlUtilParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalNotExpression(BcqlUtilParser.ConditionalNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalPrimaryExpression(BcqlUtilParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(BcqlUtilParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#comparators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparators(BcqlUtilParser.ComparatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(BcqlUtilParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BcqlUtilParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(BcqlUtilParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayLiteral(BcqlUtilParser.StringArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayLiteral(BcqlUtilParser.IntArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayLiteral(BcqlUtilParser.BooleanArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytesArrayLiteral(BcqlUtilParser.BytesArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#solTypeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolTypeRule(BcqlUtilParser.SolTypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcqlUtilParser#solType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolType(BcqlUtilParser.SolTypeContext ctx);
}