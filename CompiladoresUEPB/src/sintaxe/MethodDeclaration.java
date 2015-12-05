package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class MethodDeclaration {
	public Type type;
	public Identifier identifier;
	public FormalList formalList;
	public VarDeclarationList varDeclarationList;
	public StatementList statementList;
	public Expression expression;

	public MethodDeclaration(Type type, Identifier identifier,
			FormalList formalList, VarDeclarationList varDeclarationList,
			StatementList statementList, Expression expression) {
		this.type = type;
		this.identifier = identifier;
		this.formalList = formalList;
		this.varDeclarationList = varDeclarationList;
		this.statementList = statementList;
		this.expression = expression;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor visitor) {
		return visitor.visit(this);
	}
}