package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Program {
  public MainClass mainClass;
  public ClassDeclarationList classDecList;

  public Program(MainClass mainClass, ClassDeclarationList classDecList) {
    this.mainClass = mainClass; this.classDecList = classDecList; 
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}