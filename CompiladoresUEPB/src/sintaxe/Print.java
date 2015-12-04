package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Print extends Statement {
  public Expression expression;

  public Print(Expression expression) {
    this.expression = expression; 
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}