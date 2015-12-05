package visitor;

import sintaxe.*;

public class TypeDepthFirstVisitor implements TypeVisitor {

	MainClass mainClass;
	ClassDeclarationList classDeclarationList;

	public Type visit(Program program) {
		program.mainClass.accept(this);
		for (int i = 0; i < program.classDeclarationList.size(); i++) {
			program.classDeclarationList.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass mainClass) {
		mainClass.identifier1.accept(this);
		mainClass.identifier2.accept(this);
		mainClass.statement.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclarationSimple classDeclarationSimple) {
		classDeclarationSimple.identifier.accept(this);
		for (int i = 0; i < classDeclarationSimple.varDeclarationList.size(); i++) {
			classDeclarationSimple.varDeclarationList.elementAt(i).accept(this);
		}
		for (int i = 0; i < classDeclarationSimple.methodDeclarationList.size(); i++) {
			classDeclarationSimple.methodDeclarationList.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclarationExtends classDeclarationExtends) {
		classDeclarationExtends.identifier1.accept(this);
		classDeclarationExtends.identifier2.accept(this);
		for (int i = 0; i < classDeclarationExtends.varDeclarationList.size(); i++) {
			classDeclarationExtends.varDeclarationList.elementAt(i).accept(this);
		}
		for (int i = 0; i < classDeclarationExtends.methodDeclarationList.size(); i++) {
			classDeclarationExtends.methodDeclarationList.elementAt(i).accept(this);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDeclaration varDeclaration) {
		varDeclaration.type.accept(this);
		varDeclaration.identifier.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDeclaration methodDeclaration) {
		methodDeclaration.type.accept(this);
		methodDeclaration.identifier.accept(this);
		for (int i = 0; i < methodDeclaration.formalList.size(); i++) {
			methodDeclaration.formalList.elementAt(i).accept(this);
		}
		for (int i = 0; i < methodDeclaration.varDeclarationList.size(); i++) {
			methodDeclaration.varDeclarationList.elementAt(i).accept(this);
		}
		for (int i = 0; i < methodDeclaration.statementList.size(); i++) {
			methodDeclaration.statementList.elementAt(i).accept(this);
		}
		methodDeclaration.expression.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal formal) {
		formal.type.accept(this);
		formal.identifier.accept(this);
		return null;
	}

	public Type visit(IntArrayType intArrayType) {
		return null;
	}

	public Type visit(BooleanType booleanType) {
		return null;
	}

	public Type visit(IntegerType integerType) {
		return null;
	}

	// String s;
	public Type visit(IdentifierType identifierType) {
		return null;
	}

	// StatementList sl;
	public Type visit(Block block) {
		for (int i = 0; i < block.statementList.size(); i++) {
			block.statementList.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If if_) {
		if_.expression.accept(this);
		if_.statement1.accept(this);
		if_.statement2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While while_) {
		while_.expression.accept(this);
		while_.statement.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print print) {
		print.expression.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign assign) {
		assign.identifier.accept(this);
		assign.expression.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign arrayAssign) {
		arrayAssign.identifier.accept(this);
		arrayAssign.expression1.accept(this);
		arrayAssign.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(And and) {
		and.expression1.accept(this);
		and.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(LessThan lessThan) {
		lessThan.expression1.accept(this);
		lessThan.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(Plus plus) {
		plus.expression1.accept(this);
		plus.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(Minus minus) {
		minus.expression1.accept(this);
		minus.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(Times times) {
		times.expression1.accept(this);
		times.expression2.accept(this);
		return null;
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup arrayLookup) {
		arrayLookup.expression1.accept(this);
		arrayLookup.expression2.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(ArrayLength arrayLength) {
		arrayLength.expression.accept(this);
		return null;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call call) {
		call.expression.accept(this);
		call.identifier.accept(this);
		for (int i = 0; i < call.expressionList.size(); i++) {
			call.expressionList.elementAt(i).accept(this);
		}
		return null;
	}

	// int i;
	public Type visit(IntegerLiteral integerLiteral) {
		return null;
	}

	public Type visit(True true_) {
		return null;
	}

	public Type visit(False false_) {
		return null;
	}

	// String s;
	public Type visit(IdentifierExpression identifierExpression) {
		return null;
	}

	public Type visit(This this_) {
		return null;
	}

	// Exp e;
	public Type visit(NewArray newArray) {
		newArray.expression.accept(this);
		return null;
	}

	// Identifier i;
	public Type visit(NewObject newObject) {
		return null;
	}

	// Exp e;
	public Type visit(Not not) {
		not.expression.accept(this);
		return null;
	}

	// String s;
	public Type visit(Identifier identifier) {
		return null;
	}
}