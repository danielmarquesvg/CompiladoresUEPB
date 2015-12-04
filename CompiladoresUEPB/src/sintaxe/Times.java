package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Times extends Expression {
	public Expression expression1, expression2;

	public Times(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}
