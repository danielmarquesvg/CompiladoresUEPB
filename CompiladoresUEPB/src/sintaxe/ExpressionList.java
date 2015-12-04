package sintaxe;


import java.util.Vector;

public class ExpressionList {
   private Vector list;

   public ExpressionList() {
      list = new Vector();
   }

   public void addElement(Expression nume) {
      list.addElement(nume);
   }

   public Expression elementAt(int i)  { 
      return (Expression)list.elementAt(i); 
   }

   public int size() { 
      return list.size(); 
   }
}