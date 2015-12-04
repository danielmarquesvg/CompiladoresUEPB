package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Else extends Statement {
  public Expression expression;
  public Statement statement1,statement2;

  public Else(Expression expression, Statement statement1, Statement statement2) {
    this.expression = expression; this.statement1 = statement1; this.statement2 = statement2;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}