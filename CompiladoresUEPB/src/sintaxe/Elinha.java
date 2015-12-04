package sintaxe;

import visitor.TypeVisitor;
import visitor.Visitor;

public abstract class Elinha {

	public abstract void accept(Visitor visitor);
	public abstract Type accept(TypeVisitor typevisitor);
	
}
