package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class MethodDeclaration {
  public Type type;
  public Identifier identifier;
  public FormalList formaList;
  public VarDeclList varDeclaLis;
  public StatementList statementList;
  public Expression expression;

  public MethodDeclaration (Type type, Identifier identifier, FormalList afl, VarDeclList avl, StatementList asl, Expression expression) {
    this.type = type; this.identifier = identifier; this.formaList = formaList; this.varDeclaLis = varDeclaLis; this.statementList = statementList; this.expression = expression;
  }
 
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor visitor) {
    return visitor.visit(this);
  }
}