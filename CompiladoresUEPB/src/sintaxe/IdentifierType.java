package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class IdentifierType extends Type {
	
	public String string;

	public IdentifierType(String string) {
		this.string = string;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}