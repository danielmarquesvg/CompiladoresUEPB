package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class NewArray extends Expression {
	public Expression expression;

	public NewArray(Expression expression) {
		this.expression = expression;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}