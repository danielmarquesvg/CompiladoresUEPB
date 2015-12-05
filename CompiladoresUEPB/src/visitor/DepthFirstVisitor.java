package visitor;

import sintaxe.And;
import sintaxe.ArrayAssign;
import sintaxe.ArrayLength;
import sintaxe.ArrayLookup;
import sintaxe.Assign;
import sintaxe.Block;
import sintaxe.BooleanType;
import sintaxe.Call;
import sintaxe.ClassDeclarationExtends;
import sintaxe.ClassDeclarationSimple;
import sintaxe.False;
import sintaxe.Formal;
import sintaxe.Identifier;
import sintaxe.IdentifierExpression;
import sintaxe.IdentifierType;
import sintaxe.If;
import sintaxe.IntArrayType;
import sintaxe.IntegerLiteral;
import sintaxe.IntegerType;
import sintaxe.LessThan;
import sintaxe.MainClass;
import sintaxe.MethodDeclaration;
import sintaxe.Minus;
import sintaxe.NewArray;
import sintaxe.NewObject;
import sintaxe.Not;
import sintaxe.Plus;
import sintaxe.Print;
import sintaxe.Program;
import sintaxe.This;
import sintaxe.Times;
import sintaxe.True;
import sintaxe.VarDeclaration;
import sintaxe.While;

public class DepthFirstVisitor implements Visitor {

	// MainClass m;
	// ClassDeclList cl;
	public void visit(Program program) {
		program.mainClass.accept(this);
		for (int i = 0; i < program.classDeclarationList.size(); i++) {
			program.classDeclarationList.elementAt(i).accept(this);
		}
	}

	// Identifier i1,i2;
	// Statement s;
	public void visit(MainClass mainClass) {
		mainClass.identifier1.accept(this);
		mainClass.identifier2.accept(this);
		mainClass.statement.accept(this);
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclarationSimple classDeclarationSimple) {
		classDeclarationSimple.identifier.accept(this);
		for (int i = 0; i < classDeclarationSimple.varDeclarationList.size(); i++) {
			classDeclarationSimple.varDeclarationList.elementAt(i).accept(this);
		}
		for (int i = 0; i < classDeclarationSimple.methodDeclarationList.size(); i++) {
			classDeclarationSimple.methodDeclarationList.elementAt(i).accept(this);
		}
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclarationExtends classDeclarationExtends) {
		classDeclarationExtends.identifier1.accept(this);
		classDeclarationExtends.identifier2.accept(this);
		for (int i = 0; i < classDeclarationExtends.varDeclarationList.size(); i++) {
			classDeclarationExtends.varDeclarationList.elementAt(i).accept(this);
		}
		for (int i = 0; i < classDeclarationExtends.methodDeclarationList.size(); i++) {
			classDeclarationExtends.methodDeclarationList.elementAt(i).accept(this);
		}
	}

	// Type t;
	// Identifier i;
	public void visit(VarDeclaration varDeclaration) {
		varDeclaration.type.accept(this);
		varDeclaration.identifier.accept(this);
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public void visit(MethodDeclaration methodDeclaration) {
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
	}

	// Type t;
	// Identifier i;
	public void visit(Formal formal) {
		formal.type.accept(this);
		formal.identifier.accept(this);
	}

	public void visit(IntArrayType intArrayType) {
	}

	public void visit(BooleanType booleanType) {
	}

	public void visit(IntegerType integerType) {
	}

	// String s;
	public void visit(IdentifierType identifierType) {
	}

	// StatementList sl;
	public void visit(Block block) {
		for (int i = 0; i < block.statementList.size(); i++) {
			block.statementList.elementAt(i).accept(this);
		}
	}

	// Exp e;
	// Statement s1,s2;
	public void visit(If if_) {
		if_.expression.accept(this);
		if_.statement1.accept(this);
		if_.statement2.accept(this);
	}

	// Exp e;
	// Statement s;
	public void visit(While while_) {
		while_.expression.accept(this);
		while_.statement.accept(this);
	}

	// Exp e;
	public void visit(Print print) {
		print.expression.accept(this);
	}

	// Identifier i;
	// Exp e;
	public void visit(Assign assign) {
		assign.identifier.accept(this);
		assign.expression.accept(this);
	}

	// Identifier i;
	// Exp e1,e2;
	public void visit(ArrayAssign arrayAssign) {
		arrayAssign.identifier.accept(this);
		arrayAssign.expression1.accept(this);
		arrayAssign.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(And and) {
		and.expression1.accept(this);
		and.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(LessThan lessThan) {
		lessThan.expression1.accept(this);
		lessThan.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Plus plus) {
		plus.expression1.accept(this);
		plus.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Minus minus) {
		minus.expression1.accept(this);
		minus.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Times times) {
		times.expression1.accept(this);
		times.expression2.accept(this);
	}

	// Exp e1,e2;
	public void visit(ArrayLookup arrayLookup) {
		arrayLookup.expression1.accept(this);
		arrayLookup.expression2.accept(this);
	}

	// Exp e;
	public void visit(ArrayLength arrayLength) {
		arrayLength.expression.accept(this);
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public void visit(Call call) {
		call.expression.accept(this);
		call.identifier.accept(this);
		for (int i = 0; i < call.expressionList.size(); i++) {
			call.expressionList.elementAt(i).accept(this);
		}
	}

	// int i;
	public void visit(IntegerLiteral integerLiteral) {
	}

	public void visit(True true_) {
	}

	public void visit(False false_) {
	}

	// String s;
	public void visit(IdentifierExpression identifierExpression) {
	}

	public void visit(This this_) {
	}

	// Exp e;
	public void visit(NewArray newArray) {
		newArray.expression.accept(this);
	}

	// Identifier i;
	public void visit(NewObject newObject) {
	}

	// Exp e;
	public void visit(Not not) {
		not.expression.accept(this);
	}

	// String s;
	public void visit(Identifier identifier) {
	}
}