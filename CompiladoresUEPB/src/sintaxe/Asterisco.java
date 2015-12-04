package sintaxe;


	import visitor.Visitor;
	import visitor.TypeVisitor;

	public class Asterisco extends Expression {
	  public Expression expression1, expression2;
	  
	  public Asterisco(Expression expression1, Expression expression2) {
	    this.expression1 = expression1; this.expression2 = expression2;
	  }

	  public void accept(Visitor v) {
	    v.visit(this);
	  }

	  public Type accept(TypeVisitor v) {
	    return v.visit(this);
	  }
	}