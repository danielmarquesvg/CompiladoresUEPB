package sintaxe;

import java.util.Vector;

public class MethodDeclarationList {
	
   private Vector vector;

   public MethodDeclarationList() {
      vector = new Vector();
   }

   public void addElement(MethodDeclaration methodDeclaration) {
      vector.addElement(methodDeclaration);
   }

   public MethodDeclaration elementAt(int i)  { 
      return (MethodDeclaration)vector.elementAt(i); 
   }

   public int size() { 
      return vector.size(); 
   }
}