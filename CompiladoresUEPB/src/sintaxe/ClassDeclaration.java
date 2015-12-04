package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class ClassDeclaration {

	  public abstract void accept(Visitor visitor);
	  public abstract Type accept(TypeVisitor visitor);
	  
}

