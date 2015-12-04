package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class NewObject extends Expression {
	
	public Identifier identifier;

	public NewObject(Identifier identifier) {
		this.identifier = identifier;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}