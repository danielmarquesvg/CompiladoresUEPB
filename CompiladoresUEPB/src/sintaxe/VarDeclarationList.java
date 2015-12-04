package sintaxe;

import java.util.Vector;

public class VarDeclarationList {
	
	private Vector vector;

	public VarDeclarationList() {
		vector = new Vector();
	}

	public void addElement(VarDeclaration varDeclaration) {
		vector.addElement(varDeclaration);
	}

	public VarDeclaration elementAt(int i) {
		return (VarDeclaration)vector.elementAt(i);
	}

	public int size() {
		return vector.size();
	}
}