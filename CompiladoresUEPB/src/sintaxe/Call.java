package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Call extends Expression {
  public Expression expression;
  public Identifier identifier;
  public ExpressionList expressionList;
  
  public Call(Expression expression, Identifier identifier, ExpressionList expressionList) {
	  this.expression = expression;
	  this.identifier = identifier;
	  this.expressionList = expressionList;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor typeVisitor) {
    return typeVisitor.visit(this);
  }
}