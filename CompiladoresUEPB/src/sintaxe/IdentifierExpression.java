package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class IdentifierExpression extends Expression {
	
	public String string;

	public IdentifierExpression(String string) {
		this.string = string;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}