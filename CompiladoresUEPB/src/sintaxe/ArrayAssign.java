package sintaxe;
import visitor.Visitor;
import visitor.TypeVisitor;

public class ArrayAssign extends Statement {
	  public Identifier identifier;
	  public Expression expression1, expression2;

	  public ArrayAssign(Identifier identifier, Expression expression1, Expression expression2) {
	    this.identifier = identifier;
	    this.expression1 = expression1;
	    this.expression2 = expression2;
	  }

	  public void accept(Visitor v) {
	    v.visit(this);
	  }

	  public Type accept(TypeVisitor typeVisitor) {
	    return typeVisitor.visit(this);
	  }

}
