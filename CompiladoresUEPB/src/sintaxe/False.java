package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class False extends Expression {
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}