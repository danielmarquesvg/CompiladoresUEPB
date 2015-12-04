package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Identifier {
  public java.lang.String string;

  public Identifier(java.lang.String string) { 
    this.string=string;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }

  public java.lang.String toString(){
    return string;
  }
}