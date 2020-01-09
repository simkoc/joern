package ast.statements.blockstarters;

import ast.expressions.Identifier;
import ast.expressions.IdentifierList;
import ast.expressions.Variable;
import ast.logical.statements.BlockStarterWithStmtAndCnd;
import ast.logical.statements.CompoundStatement;
import ast.walking.ASTNodeVisitor;

public class CatchStatement extends BlockStarterWithStmtAndCnd
{
	private IdentifierList exceptionIdentifier = null;
	private Variable variable = null;
	private CompoundStatement content = null;

	public IdentifierList getExceptionIdentifier()
	{
		return this.exceptionIdentifier;
	}

	public void setExceptionIdentifier(IdentifierList exceptionIdentifier)
	{
		this.exceptionIdentifier = exceptionIdentifier;
		super.addChild(exceptionIdentifier);
	}

	public Variable getVariable()
	{
		return this.variable;
	}

	public void setVariable(Variable variable)
	{
		this.variable = variable;
		super.addChild(variable);
	}

	public CompoundStatement getContent()
	{
		return this.content;
	}

	public void setContent(CompoundStatement content)
	{
		this.content = content;
		super.addChild(content);
	}

	public void accept(ASTNodeVisitor visitor)
	{
		visitor.visit(this);
	}

}
