package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class VarDeclaration {
  public Type type;
  public Identifier identifier;
  
  public VarDeclaration(Type type, Identifier identifier) {
    this.type = type; this.identifier = identifier;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}