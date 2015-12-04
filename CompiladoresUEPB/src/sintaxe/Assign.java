package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Assign extends Statement {
  public Identifier identifier;
  public Expression expression;

  public Assign(Identifier identifier, Expression expression) {
	  this.identifier = identifier;
	  this.expression = expression;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor typeVisitor) {
    return typeVisitor.visit(this);
  }
}