package sintaxe;

import java.util.Vector;

public class FormalList {
	
	private Vector vector;

	public FormalList() {
		vector = new Vector();
	}

	public void addElement(Formal formal) {
		vector.addElement(formal);
	}

	public Formal elementAt(int i) {
		return (Formal) vector.elementAt(i);
	}

	public int size() {
		return vector.size();
	}
}