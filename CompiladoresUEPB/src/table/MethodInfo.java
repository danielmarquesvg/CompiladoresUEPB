package table;

import java.util.ArrayList;
import java.util.Set;

import error.Erro;

import symbol.Symbol;

public class MethodInfo extends Table{

	public ArrayList<Symbol> parametroDeEntrada;
	public Symbol retorno;
	public VarTable paramEntrada;
	public VarTable listaDeVariaveis;
	public Symbol id;
	private boolean isParametro;
	
	public MethodInfo(Symbol retorno, Symbol id)
	{
		this.retorno = retorno;
		paramEntrada = new VarTable();
		listaDeVariaveis = new VarTable();
		parametroDeEntrada = new ArrayList<Symbol>();
		this.id = id;
		this.isParametro = true;
		
	}
	
	
	public void put(Symbol key, Object value) {
		if(isParametro)
		{
			if(paramEntrada.get(key) != null)
			{
				Erro.raiseError("Variavel de parametro" + key.toString() +" ja declarada");
				//Erro, ja foi adicionado
			}
			else
			{
				paramEntrada.put(key, value);
				parametroDeEntrada.add(Symbol.symbol(value.toString()));
			}
		}
		else
		{
			if(listaDeVariaveis.get(key) != null || paramEntrada.get(key) != null)
			{
				Erro.raiseError("Variavel "+ key.toString() + " ja declarada ou no escopo do metodo ou como parametro");
				//Erro, ja definido antes no parametro ou no proprio metodo
			}
			else
			{
				listaDeVariaveis.put(key, value);
			}
		}
		
		// TODO Auto-generated method stub
		
	}
	public void setisParametro(boolean isParametro) {
		this.isParametro = isParametro;
		
	}
	
	public Object get(Symbol key) {
		
		Object s;
		if(  (s =paramEntrada.get(key)) != null)
		{
			return s;
		}
	
		return listaDeVariaveis.get(key);
	}
	
	public Set<Symbol> keys() {
		Set<Symbol> retorno = paramEntrada.keys();
		retorno.addAll(listaDeVariaveis.keys());
	
		return retorno;
	}
	
	public String toString ()
	{
		String retorno = "\n";
		retorno += "Metodo " + this.id;
		retorno += " Parametros de Entrada ";
		retorno += this.paramEntrada.toString();
		retorno += " Variaveis declaradas ";
		retorno += this.listaDeVariaveis.toString();
		retorno += " Retorno ";
		retorno += this.retorno;
		return retorno;
	}
	
}