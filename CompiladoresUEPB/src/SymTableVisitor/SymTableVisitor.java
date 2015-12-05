package SymTableVisitor;


import symbol.Symbol;
import sintaxe.BooleanType;
import sintaxe.ClassDeclarationExtends;
import sintaxe.ClassDeclarationSimple;
import sintaxe.Formal;
import sintaxe.Identifier;
import sintaxe.IdentifierType;
import sintaxe.IntArrayType;
import sintaxe.IntegerType;
import sintaxe.MethodDeclaration;
import sintaxe.Program;
import sintaxe.VarDeclaration;
import table.Table;
import table.VarInfo;

public  interface SymTableVisitor {
	
		public Table visit( Program n);
		public Table visit(ClassDeclarationSimple n);
		public Table visit(ClassDeclarationExtends n);
		public Table visit(MethodDeclaration n);
		public VarInfo visit(VarDeclaration n);
		public VarInfo visit(Formal n);
		public Symbol visit (Identifier n);
		public Symbol visit( IntegerType n);
		public Symbol visit(BooleanType n);
		public Symbol visit(IntArrayType n);
		public Symbol visit(IdentifierType n);		
		
		

}