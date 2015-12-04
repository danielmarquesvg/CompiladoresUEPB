package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class MainClass {
  public Identifier identifier1,identifier2;
  public Statement statement;

  public MainClass(Identifier identifier1, Identifier identifier2, Statement statement) {
    this.identifier1 = identifier1; this.identifier2 = identifier2; this.statement = statement;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}
