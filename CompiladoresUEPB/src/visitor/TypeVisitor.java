package visitor;

import sintaxe.And;
import sintaxe.ArrayAssign;
import sintaxe.ArrayLength;
import sintaxe.ArrayLookup;
import sintaxe.Assign;
import sintaxe.Block;
import sintaxe.BooleanType;
import sintaxe.Call;
import sintaxe.Class;
import sintaxe.ClassDeclaration;
import sintaxe.ClassDeclarationExtends;
import sintaxe.ClassDeclarationSimple;
import sintaxe.Elinha;
import sintaxe.Else;
import sintaxe.Expression;
import sintaxe.False;
import sintaxe.Formal;
import sintaxe.Identifier;
import sintaxe.IdentifierExpression;
import sintaxe.IdentifierType;
import sintaxe.If;
import sintaxe.IntArrayType;
import sintaxe.IntegerLiteral;
import sintaxe.IntegerType;
import sintaxe.Length;


import sintaxe.LessThan;
import sintaxe.MainClass;
import sintaxe.Minus;
import sintaxe.NewArray;
import sintaxe.NewObject;
import sintaxe.Not;
import sintaxe.Plus;
import sintaxe.MethodDeclaration;
import sintaxe.Print;
import sintaxe.Program;
import sintaxe.Statement;
import sintaxe.This;
import sintaxe.Times;
import sintaxe.True;
import sintaxe.Type;
import sintaxe.VarDeclaration;
import sintaxe.While;

public interface TypeVisitor {

	  public Type visit(Program program);
	  public Type visit(MainClass mainClass);
	  public Type visit(ClassDeclarationSimple classDeclarationSimple);
	  public Type visit(ClassDeclarationExtends classDeclarationExtends);
	  public Type visit(VarDeclaration varDeclaration);
	  public Type visit(MethodDeclaration methodDeclaration);
	  public Type visit(Formal formal);
	  public Type visit(IntArrayType intArrayType);
	  public Type visit(BooleanType booleanType);
	  public Type visit(IntegerType integerType);
	  public Type visit(IdentifierType identifierType);
	  public Type visit(Block block);
	  public Type visit(If if_);
	  public Type visit(While while_);
	  public Type visit(Print print);
	  public Type visit(Assign assign);
	  public Type visit(ArrayAssign arraySign);
	  public Type visit(And and);
	  public Type visit(LessThan lessThan);
	  public Type visit(Plus plus);
	  public Type visit(Minus minus);
	  public Type visit(Times times);
	  public Type visit(ArrayLookup arrayLookup);
	  public Type visit(ArrayLength arrayLength);
	  public Type visit(Call call);
	  public Type visit(IntegerLiteral integerLiteral);
	  public Type visit(True true_);
	  public Type visit(False false_);
	  public Type visit(IdentifierExpression identifierExpression);
	  public Type visit(This this_);
	  public Type visit(NewArray newArray);
	  public Type visit(NewObject newObject);
	  public Type visit(Not not);
	  public Type visit(Identifier identifier);

}
