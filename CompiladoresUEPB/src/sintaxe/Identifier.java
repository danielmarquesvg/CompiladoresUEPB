package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Identifier {
  public String string;

  public Identifier(String string) { 
    this.string=string;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }

  public String toString(){
    return this.string;
  }
}