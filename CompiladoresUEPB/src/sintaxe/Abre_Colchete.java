package sintaxe;

import visitor.TypeVisitor;
import visitor.Visitor;

public class Abre_Colchete extends Expression{

	
		  public void accept(Visitor visitor) {
		    visitor.visit(this);
		  }

		  public Type accept(TypeVisitor visitor) {
		    return visitor.visit(this);
		  }
		
	
}
