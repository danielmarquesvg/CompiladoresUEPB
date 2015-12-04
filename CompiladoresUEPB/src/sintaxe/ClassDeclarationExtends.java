package sintaxe;

import visitor.Visitor;
import visitor.TypeVisitor;

public class ClassDeclarationExtends extends ClassDeclaration {

	public Identifier identifier1, identifier2;
	public VarDeclarationList varDeclarationList;
	public MethodDeclarationList methodDeclarationList;

	public ClassDeclarationExtends(Identifier identifier1, Identifier identifier2, VarDeclarationList varDeclarationList,
			MethodDeclarationList methodDeclarationList) {
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
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