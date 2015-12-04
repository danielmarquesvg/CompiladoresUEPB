package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Block extends Statement {
	
  public StatementList statementList;

  public Block(StatementList statementList) {
	  this.statementList = statementList;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor typeVisitor) {
    return typeVisitor.visit(this);
  }
}
