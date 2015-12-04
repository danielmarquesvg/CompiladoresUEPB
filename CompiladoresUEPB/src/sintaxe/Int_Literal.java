package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Int_Literal extends Expression {
  public int integer;

  public Int_Literal(int intLiteral) {
    integer = intLiteral;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}