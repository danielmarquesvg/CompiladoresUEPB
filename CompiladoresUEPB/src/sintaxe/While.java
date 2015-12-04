package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class While extends Statement {
  public Expression expression;
  public Statement statement;

  public While(Expression expression, Statement statement) {
    this.expression=expression; this.statement=statement; 
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}