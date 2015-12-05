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
import table.ClassInfo;
import table.ClassTable;
import table.MethodInfo;
import table.MethodTable;
import table.Table;
import table.VarInfo;
import table.VarTable;

public class ImperativeSymbolTableVisitor implements SymTableVisitor {

	
	public Table visit(Program n) {
		ClassTable k = new ClassTable();
		ClassInfo s = n.m.accept(this,Symbol.symbol(n.m.i1.toString()));
		k.put(Symbol.symbol(n.m.i1.toString()), s);
		for (int i = 0; i < n.cl.size(); i++) {
			s = n.cl.elementAt(i).accept(this);
			if(n.cl.elementAt(i) instanceof ClassDeclarationExtends)
			{
				k.put(Symbol.symbol(((ClassDeclarationExtends) n.cl.elementAt(i)).toString()), s);
			}
			else
			{
				k.put(Symbol.symbol(((ClassDeclarationSimple) n.cl.elementAt(i)).toString()), s);
			}
		}
		
		return k;
	}

	
	public Table visit(ClassDeclarationSimple n) {
		VarInfo s;
		VarTable k = new VarTable();
		MethodInfo s1;
		MethodTable k1 = new MethodTable();
		for (int i = 0; i < n.vl.size(); i++) {
			s = n.vl.elementAt(i).accept(this);
			k.put(Symbol.symbol(n.vl.elementAt(i).toString()), s);
		}
		
		for (int i = 0; i < n.ml.size() ; i++) {
			s1 = (MethodInfo)n.ml.elementAt(i).accept(this);
			k1.put(Symbol.symbol(n.ml.elementAt(i).toString()), s1);
		}
		
		// TODO Auto-generated method stub
		ClassInfo retorno = new ClassInfo(Symbol.symbol(n.i.toString()));
		retorno.setatributos(k);
		retorno.setmetodos(k1);
		return retorno;//new ClassInfo(Symbol.symbol(n.i.toString()));
	}

	
	public Table visit(ClassDeclarationExtends n) {
		VarInfo s;
		VarTable k = new VarTable();
		MethodInfo s1;
		MethodTable k1 = new MethodTable();
		for (int i = 0; i < n.vl.size(); i++) {
			 s = n.vl.elementAt(i).accept(this);
			 k.put(Symbol.symbol(n.vl.elementAt(i).toString()), s);
		}
		
		for (int i = 0; i < n.ml.size() ; i++) {
			s1 = (MethodInfo)n.ml.elementAt(i).accept(this);
			k1.put(Symbol.symbol(n.ml.elementAt(i).toString()), s1);
		}
		
		// TODO Auto-generated method stub
		ClassInfo retorno = new ClassInfo(Symbol.symbol(n.i.toString()),Symbol.symbol(n.j.toString()));
		retorno.setatributos(k);
		retorno.setmetodos(k1);
		return retorno;
	}

	
	public Table visit(MethodDeclaration n) {
		MethodInfo s = new MethodInfo(Symbol.symbol(n.t.toString()), Symbol.symbol(n.id.toString()));
		s.setisParametro(true);
		for (int i = 0; i < n.fl.size(); i++) {
			s.put(Symbol.symbol(n.fl.elementAt(i).i.toString()),n.fl.elementAt(i).accept(this));	
			
		}
		s.setisParametro(false);
		for (int i = 0; i < n.vl.size(); i++) {
			s.put(Symbol.symbol(n.vl.elementAt(i).toString()), n.vl.elementAt(i).accept(this));
		}
		// TODO Auto-generated method stub
		return s;
	}

	
	public VarInfo visit(VarDeclaration n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public VarInfo visit(Formal n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public Symbol visit(Identifier n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public Symbol visit(IntegerType n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public Symbol visit(BooleanType n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public Symbol visit(IntArrayType n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}

	
	public Symbol visit(IdentifierType n) {
		// TODO Auto-generated method stub
		return n.accept(this);
	}
