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

public interface TypeVisitor {

	public Type visit(And _and);

	public Type visit(BooleanType _boolean);

	public Type visit(Class _class);

	public Type visit(ClassDeclaration _classDeclaration);

	public Type visit(Elinha _elinha);

	public Type visit(Else _else);

	public Type visit(Expression _expression);

	public Type visit(Formal _formal);

	public Type visit(False _false);

	public Type visit(Identifier _identifier);

	public Type visit(If _if);

	public Type visit(Length _length);

	public Type visit(MainClass _mainClass);

	public Type visit(Plus _mais);

	public Type visit(MethodDeclaration _methodDeclaration);

	public Type visit(Program _program);

	public Type visit(Print _print);

	public Type visit(Statement _statement);

	public Type visit(This _this);

	public Type visit(True _true);

	public Type visit(Type _type);

	public Type visit(VarDeclaration _varDeclaration);

	public Type visit(Void _void);

	public Type visit(While _while);

}
