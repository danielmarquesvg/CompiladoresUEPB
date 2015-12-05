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


public interface Visitor {
	

	 public void visit(Program program);
	  public void visit(MainClass mainClass);
	  public void visit(ClassDeclarationSimple classDeclarationSimple);
	  public void visit(ClassDeclarationExtends classDeclarationExtends);
	  public void visit(VarDeclaration varDeclaration);
	  public void visit(MethodDeclaration methodDeclaration);
	  public void visit(Formal formal);
	  public void visit(IntArrayType intArrayType);
	  public void visit(BooleanType booleanType);
	  public void visit(IntegerType integerType);
	  public void visit(IdentifierType identifierType);
	  public void visit(Block block);
	  public void visit(If if_);
	  public void visit(While while_);
	  public void visit(Print print);
	  public void visit(Assign assign);
	  public void visit(ArrayAssign arrayAssign);
	  public void visit(And and);
	  public void visit(LessThan lessThan);
	  public void visit(Plus plus);
	  public void visit(Minus minus);
	  public void visit(Times times);
	  public void visit(ArrayLookup arrayLookup);
	  public void visit(ArrayLength arrayLength);
	  public void visit(Call call);
	  public void visit(IntegerLiteral integerLiteral);
	  public void visit(True true_);
	  public void visit(False false_);
	  public void visit(IdentifierExpression identifierExpression);
	  public void visit(This this_);
	  public void visit(NewArray newArray);
	  public void visit(NewObject newObject);
	  public void visit(Not not);
	  public void visit(Identifier identifier);
	 
}
