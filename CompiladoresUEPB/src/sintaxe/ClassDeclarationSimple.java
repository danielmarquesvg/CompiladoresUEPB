package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class ClassDeclarationSimple extends ClassDeclaration {
	
	public Identifier identifier;
	public VarDeclarationList varDeclarationList;
	public MethodDeclarationList methodDeclarationList;

	public ClassDeclarationSimple(Identifier identifier, VarDeclarationList varDeclarationList, MethodDeclarationList methodDeclarationList) {
		this.identifier = identifier;
		this.varDeclarationList = varDeclarationList;
		this.methodDeclarationList = methodDeclarationList;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Type accept(TypeVisitor typeVisitor) {
		return typeVisitor.visit(this);
	}
}