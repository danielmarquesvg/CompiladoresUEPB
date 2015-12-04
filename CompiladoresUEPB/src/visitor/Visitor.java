package visitor;


import sintaxe.And;

import sintaxe.BooleanType;
import sintaxe.Class;
import sintaxe.ClassDeclaration;
import sintaxe.Elinha;
import sintaxe.Else;
import sintaxe.Expression;

import sintaxe.False;

import sintaxe.Formal;

import sintaxe.Identifier;
import sintaxe.If;


import sintaxe.Length;


import sintaxe.MainClass;
import sintaxe.Plus;

import sintaxe.MethodDeclaration;

import sintaxe.Print;
import sintaxe.Program;

import sintaxe.Statement;

import sintaxe.This;
import sintaxe.True;
import sintaxe.Type;
import sintaxe.VarDeclaration;

import sintaxe.While;

public interface Visitor {
	

	 public void visit(And _and);

	 public void visit(BooleanType _boolean);
	 public void visit(Class _class);
	 public void visit(ClassDeclaration _classDeclaration);
	 public void visit(Elinha _elinha);
	 public void visit(Else _else);
	 public void visit(Expression _expression);

	 public void visit(Formal _formal);
	 public void visit(False _false);


	 public void visit(Identifier _identifier);
	 public void visit(If _if);


	 public void visit(Length _length);


	 public void visit(MainClass _mainClass);
	 public void visit(Plus _mais);

	 public void visit(MethodDeclaration _methodDeclaration);


	 public void visit(Program _program);

	 public void visit(Print _print);

	 public void visit(Statement _statement);

	 public void visit(This _this);
	 public void visit(True _true);
	 public void visit(Type _type);
	 public void visit(VarDeclaration _varDeclaration);

	 public void visit(Void _void);
	 public void visit(While _while);
	 
}
