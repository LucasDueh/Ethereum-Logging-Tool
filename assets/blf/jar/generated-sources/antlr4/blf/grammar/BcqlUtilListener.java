// Generated from blf/grammar/BcqlUtil.g4 by ANTLR 4.7.2
package blf.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BcqlUtilParser}.
 */
public interface BcqlUtilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#blockNumber}.
	 * @param ctx the parse tree
	 */
	void enterBlockNumber(BcqlUtilParser.BlockNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#blockNumber}.
	 * @param ctx the parse tree
	 */
	void exitBlockNumber(BcqlUtilParser.BlockNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#addressList}.
	 * @param ctx the parse tree
	 */
	void enterAddressList(BcqlUtilParser.AddressListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#addressList}.
	 * @param ctx the parse tree
	 */
	void exitAddressList(BcqlUtilParser.AddressListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#logEntrySignature}.
	 * @param ctx the parse tree
	 */
	void enterLogEntrySignature(BcqlUtilParser.LogEntrySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#logEntrySignature}.
	 * @param ctx the parse tree
	 */
	void exitLogEntrySignature(BcqlUtilParser.LogEntrySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#logEntryParameter}.
	 * @param ctx the parse tree
	 */
	void enterLogEntryParameter(BcqlUtilParser.LogEntryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#logEntryParameter}.
	 * @param ctx the parse tree
	 */
	void exitLogEntryParameter(BcqlUtilParser.LogEntryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 */
	void enterSkippableLogEntryParameter(BcqlUtilParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#skippableLogEntryParameter}.
	 * @param ctx the parse tree
	 */
	void exitSkippableLogEntryParameter(BcqlUtilParser.SkippableLogEntryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#smartContractQuery}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractQuery(BcqlUtilParser.SmartContractQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#smartContractQuery}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractQuery(BcqlUtilParser.SmartContractQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 */
	void enterPublicVariableQuery(BcqlUtilParser.PublicVariableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#publicVariableQuery}.
	 * @param ctx the parse tree
	 */
	void exitPublicVariableQuery(BcqlUtilParser.PublicVariableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 */
	void enterPublicFunctionQuery(BcqlUtilParser.PublicFunctionQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#publicFunctionQuery}.
	 * @param ctx the parse tree
	 */
	void exitPublicFunctionQuery(BcqlUtilParser.PublicFunctionQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#smartContractParameter}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractParameter(BcqlUtilParser.SmartContractParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#smartContractParameter}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractParameter(BcqlUtilParser.SmartContractParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 */
	void enterSmartContractQueryParameter(BcqlUtilParser.SmartContractQueryParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#smartContractQueryParameter}.
	 * @param ctx the parse tree
	 */
	void exitSmartContractQueryParameter(BcqlUtilParser.SmartContractQueryParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 */
	void enterNamedEmitVariable(BcqlUtilParser.NamedEmitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#namedEmitVariable}.
	 * @param ctx the parse tree
	 */
	void exitNamedEmitVariable(BcqlUtilParser.NamedEmitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 */
	void enterXesEmitVariable(BcqlUtilParser.XesEmitVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#xesEmitVariable}.
	 * @param ctx the parse tree
	 */
	void exitXesEmitVariable(BcqlUtilParser.XesEmitVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#xesTypes}.
	 * @param ctx the parse tree
	 */
	void enterXesTypes(BcqlUtilParser.XesTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#xesTypes}.
	 * @param ctx the parse tree
	 */
	void exitXesTypes(BcqlUtilParser.XesTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(BcqlUtilParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(BcqlUtilParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(BcqlUtilParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(BcqlUtilParser.MethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(BcqlUtilParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(BcqlUtilParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(BcqlUtilParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(BcqlUtilParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(BcqlUtilParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(BcqlUtilParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(BcqlUtilParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(BcqlUtilParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(BcqlUtilParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(BcqlUtilParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(BcqlUtilParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(BcqlUtilParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(BcqlUtilParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(BcqlUtilParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalComparisonExpression(BcqlUtilParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalComparisonExpression(BcqlUtilParser.ConditionalComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalNotExpression(BcqlUtilParser.ConditionalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalNotExpression(BcqlUtilParser.ConditionalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalPrimaryExpression(BcqlUtilParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#conditionalPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalPrimaryExpression(BcqlUtilParser.ConditionalPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(BcqlUtilParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(BcqlUtilParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#comparators}.
	 * @param ctx the parse tree
	 */
	void enterComparators(BcqlUtilParser.ComparatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#comparators}.
	 * @param ctx the parse tree
	 */
	void exitComparators(BcqlUtilParser.ComparatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(BcqlUtilParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(BcqlUtilParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BcqlUtilParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BcqlUtilParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(BcqlUtilParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(BcqlUtilParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayLiteral(BcqlUtilParser.StringArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#stringArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayLiteral(BcqlUtilParser.StringArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayLiteral(BcqlUtilParser.IntArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#intArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayLiteral(BcqlUtilParser.IntArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayLiteral(BcqlUtilParser.BooleanArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#booleanArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayLiteral(BcqlUtilParser.BooleanArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBytesArrayLiteral(BcqlUtilParser.BytesArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#bytesArrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBytesArrayLiteral(BcqlUtilParser.BytesArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#solTypeRule}.
	 * @param ctx the parse tree
	 */
	void enterSolTypeRule(BcqlUtilParser.SolTypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#solTypeRule}.
	 * @param ctx the parse tree
	 */
	void exitSolTypeRule(BcqlUtilParser.SolTypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcqlUtilParser#solType}.
	 * @param ctx the parse tree
	 */
	void enterSolType(BcqlUtilParser.SolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcqlUtilParser#solType}.
	 * @param ctx the parse tree
	 */
	void exitSolType(BcqlUtilParser.SolTypeContext ctx);
}