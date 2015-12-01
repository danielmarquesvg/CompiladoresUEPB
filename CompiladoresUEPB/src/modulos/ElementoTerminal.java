package modulos;

import visitor.Visitor;

public class ElementoTerminal {
	
	public String value;
	
	public ElementoTerminal(String value) {
		this.value = value;
	}

	public void accept(Visitor visitor) {
		visitor.visitaElemTerminal(this);
	}

}
