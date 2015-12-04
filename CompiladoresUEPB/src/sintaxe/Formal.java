package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Formal {
	
	public Type type;
	public Identifier identifier;

	public Formal(Type type, Identifier identifier) {
		this.type = type;
		this.identifier = identifier;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}