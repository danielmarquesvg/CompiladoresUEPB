package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class IntArrayType extends Type {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}