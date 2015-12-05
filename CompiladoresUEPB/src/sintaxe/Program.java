package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class Program {
	
  public MainClass mainClass;
  public ClassDeclarationList classDeclarationList;

  public Program(MainClass mainClass, ClassDeclarationList classDeclarationList) {
    this.mainClass = mainClass;
    this.classDeclarationList = classDeclarationList;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public Type accept(TypeVisitor typeVisitor) {
    return typeVisitor.visit(this);
  }
  
  /*
  public Table accept(ImperativeSymbolTableVisitor v)
  {
	  return v.visit(this);
  }
  
  public translate.Exp accept(TreeIRVisitor v) {
		return v.visit(this);
		// TODO Auto-generated method stub
		
	}
	*/
}