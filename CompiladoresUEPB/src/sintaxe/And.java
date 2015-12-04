package sintaxe;
import visitor.Visitor;
import visitor.TypeVisitor;

public class And extends Expression {
	  public Expression expression1, expression2;
	  
	  public And(Expression expression1, Expression expression2) { 
		  this.expression1 = expression1; this.expression2 = expression2;
	  }

	  public void accept(Visitor visitor) {
	    visitor.visit(this);
	  }

	  public Type accept(TypeVisitor visitor) {
	    return visitor.visit(this);
	  }
	}