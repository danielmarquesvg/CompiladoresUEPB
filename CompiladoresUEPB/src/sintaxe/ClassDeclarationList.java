package sintaxe;

import java.util.Vector;

public class ClassDeclarationList {
	
   private Vector vector;

   public ClassDeclarationList() {
      vector = new Vector();
   }

   public void addElement(ClassDeclaration classDeclaration) {
      vector.addElement(classDeclaration);
   }

   public ClassDeclaration elementAt(int i)  { 
      return (ClassDeclaration)vector.elementAt(i); 
   }

   public int size() { 
      return vector.size(); 
   }
}