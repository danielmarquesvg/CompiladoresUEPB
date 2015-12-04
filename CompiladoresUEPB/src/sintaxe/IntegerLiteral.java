package sintaxe;

import visitor.TypeVisitor;
import visitor.Visitor;

public class IntegerLiteral extends Expression {

	 public int integerLiteral;

	  public IntegerLiteral(int integerLiteral) {
	    this.integerLiteral = integerLiteral;
	  }

	  public void accept(Visitor visitor) {
	    visitor.visit(this);
	  }

	  public Type accept(TypeVisitor typeVisitor) {
	    return typeVisitor.visit(this);
	  }
		
	
	
}
