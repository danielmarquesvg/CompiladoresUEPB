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

public class PrettyPrintVisitor implements Visitor {

	// MainClass m;
	// ClassDeclList cl;
	public void visit(Program program) {
		program.mainClass.accept(this);
		for (int i = 0; i < program.classDeclarationList.size(); i++) {
			System.out.println();
			program.classDeclarationList.elementAt(i).accept(this);
		}
	}

	// Identifier i1,i2;
	// Statement s;
	public void visit(MainClass mainClass) {
		System.out.print("class ");
		mainClass.identifier1.accept(this);
		System.out.println(" {");
		System.out.print("  public static void main (String [] ");
		mainClass.identifier2.accept(this);
		System.out.println(") {");
		System.out.print("    ");
		mainClass.statement.accept(this);
		System.out.println("  }");
		System.out.println("}");
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclarationSimple classDeclarationSimple) {
		System.out.print("class ");
		classDeclarationSimple.identifier.accept(this);
		System.out.println(" { ");
		for (int i = 0; i < classDeclarationSimple.varDeclarationList.size(); i++) {
			System.out.print("  ");
			classDeclarationSimple.varDeclarationList.elementAt(i).accept(this);
			if (i + 1 < classDeclarationSimple.varDeclarationList.size()) {
				System.out.println();
			}
		}
		for (int i = 0; i < classDeclarationSimple.methodDeclarationList.size(); i++) {
			System.out.println();
			classDeclarationSimple.methodDeclarationList.elementAt(i).accept(this);
		}
		System.out.println();
		System.out.println("}");
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclarationExtends classDeclarationExtends) {
		System.out.print("class ");
		classDeclarationExtends.identifier1.accept(this);
		System.out.println(" extends ");
		classDeclarationExtends.identifier2.accept(this);
		System.out.println(" { ");
		for (int i = 0; i < classDeclarationExtends.varDeclarationList.size(); i++) {
			System.out.print("  ");
			classDeclarationExtends.varDeclarationList.elementAt(i).accept(this);
			if (i + 1 < classDeclarationExtends.varDeclarationList.size()) {
				System.out.println();
			}
		}
		for (int i = 0; i < classDeclarationExtends.methodDeclarationList.size(); i++) {
			System.out.println();
			classDeclarationExtends.methodDeclarationList.elementAt(i).accept(this);
		}
		System.out.println();
		System.out.println("}");
	}

	// Type t;
	// Identifier i;
	public void visit(VarDeclaration varDeclaration) {
		varDeclaration.type.accept(this);
		System.out.print(" ");
		varDeclaration.identifier.accept(this);
		System.out.print(";");
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public void visit(MethodDeclaration methodDeclaration) {
		System.out.print("  public ");
		methodDeclaration.type.accept(this);
		System.out.print(" ");
		methodDeclaration.identifier.accept(this);
		System.out.print(" (");
		for (int i = 0; i < methodDeclaration.formalList.size(); i++) {
			methodDeclaration.formalList.elementAt(i).accept(this);
			if (i + 1 < methodDeclaration.formalList.size()) {
				System.out.print(", ");
			}
		}
		System.out.println(") { ");
		for (int i = 0; i < methodDeclaration.varDeclarationList.size(); i++) {
			System.out.print("    ");
			methodDeclaration.varDeclarationList.elementAt(i).accept(this);
			System.out.println("");
		}
		for (int i = 0; i < methodDeclaration.statementList.size(); i++) {
			System.out.print("    ");
			methodDeclaration.statementList.elementAt(i).accept(this);
			if (i < methodDeclaration.statementList.size()) {
				System.out.println("");
			}
		}
		System.out.print("    return ");
		methodDeclaration.expression.accept(this);
		System.out.println(";");
		System.out.print("  }");
	}

	// Type t;
	// Identifier i;
	public void visit(Formal formal) {
		formal.type.accept(this);
		System.out.print(" ");
		formal.identifier.accept(this);
	}

	public void visit(IntArrayType intArrayType) {
		System.out.print("int []");
	}

	public void visit(BooleanType booleanType) {
		System.out.print("boolean");
	}

	public void visit(IntegerType integerType) {
		System.out.print("int");
	}

	// String s;
	public void visit(IdentifierType identifierType) {
		System.out.print(identifierType.string);
	}

	// StatementList sl;
	public void visit(Block block) {
		System.out.println("{ ");
		for (int i = 0; i < block.statementList.size(); i++) {
			System.out.print("      ");
			block.statementList.elementAt(i).accept(this);
			System.out.println();
		}
		System.out.print("    } ");
	}

	// Exp e;
	// Statement s1,s2;
	public void visit(If if_) {
		System.out.print("if (");
		if_.expression.accept(this);
		System.out.println(") ");
		System.out.print("    ");
		if_.statement1.accept(this);
		System.out.println();
		System.out.print("    else ");
		if_.statement2.accept(this);
	}

	// Exp e;
	// Statement s;
	public void visit(While while_) {
		System.out.print("while (");
		while_.expression.accept(this);
		System.out.print(") ");
		while_.statement.accept(this);
	}

	// Exp e;
	public void visit(Print print) {
		System.out.print("System.out.println(");
		print.expression.accept(this);
		System.out.print(");");
	}

	// Identifier i;
	// Exp e;
	public void visit(Assign assign) {
		assign.identifier.accept(this);
		System.out.print(" = ");
		assign.expression.accept(this);
		System.out.print(";");
	}

	// Identifier i;
	// Exp e1,e2;
	public void visit(ArrayAssign arrayAssign) {
		arrayAssign.identifier.accept(this);
		System.out.print("[");
		arrayAssign.expression1.accept(this);
		System.out.print("] = ");
		arrayAssign.expression2.accept(this);
		System.out.print(";");
	}

	// Exp e1,e2;
	public void visit(And and) {
		System.out.print("(");
		and.expression1.accept(this);
		System.out.print(" && ");
		and.expression2.accept(this);
		System.out.print(")");
	}

	// Exp e1,e2;
	public void visit(LessThan lessThan) {
		System.out.print("(");
		lessThan.expression1.accept(this);
		System.out.print(" < ");
		lessThan.expression2.accept(this);
		System.out.print(")");
	}

	// Exp e1,e2;
	public void visit(Plus plus) {
		System.out.print("(");
		plus.expression1.accept(this);
		System.out.print(" + ");
		plus.expression2.accept(this);
		System.out.print(")");
	}

	// Exp e1,e2;
	public void visit(Minus minus) {
		System.out.print("(");
		minus.expression1.accept(this);
		System.out.print(" - ");
		minus.expression2.accept(this);
		System.out.print(")");
	}

	// Exp e1,e2;
	public void visit(Times times) {
		System.out.print("(");
		times.expression1.accept(this);
		System.out.print(" * ");
		times.expression2.accept(this);
		System.out.print(")");
	}

	// Exp e1,e2;
	public void visit(ArrayLookup arrayLookup) {
		arrayLookup.expression1.accept(this);
		System.out.print("[");
		arrayLookup.expression2.accept(this);
		System.out.print("]");
	}

	// Exp e;
	public void visit(ArrayLength arrayLength) {
		arrayLength.expression.accept(this);
		System.out.print(".length");
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public void visit(Call call) {
		call.expression.accept(this);
		System.out.print(".");
		call.identifier.accept(this);
		System.out.print("(");
		for (int i = 0; i < call.expressionList.size(); i++) {
			call.expressionList.elementAt(i).accept(this);
			if (i + 1 < call.expressionList.size()) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	// int i;
	public void visit(IntegerLiteral integerLiteral) {
		System.out.print(integerLiteral.integerLiteral);
	}

	public void visit(True true_) {
		System.out.print("true");
	}

	public void visit(False false_) {
		System.out.print("false");
	}

	// String s;
	public void visit(IdentifierExpression identifierExpression) {
		System.out.print(identifierExpression.string);
	}

	public void visit(This this_) {
		System.out.print("this");
	}

	// Exp e;
	public void visit(NewArray newArray) {
		System.out.print("new int [");
		newArray.expression.accept(this);
		System.out.print("]");
	}

	// Identifier i;
	public void visit(NewObject newObject) {
		System.out.print("new ");
		System.out.print(newObject.identifier.string);
		System.out.print("()");
	}

	// Exp e;
	public void visit(Not not) {
		System.out.print("!");
		not.expression.accept(this);
	}

	// String s;
	public void visit(Identifier identifier) {
		System.out.print(identifier.string);
	}

	
}