package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Nao extends Expression {
  public Expression expression;
  
  public Nao(Expression expression) {
    this.expression = expression; 
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}