/* Generated by JTB 1.4.10 */
package visitor;

import syntaxtree.*;

import java.util.*;

public class DepthFirstVoidVisitor implements IVoidVisitor {


  
  public void visit(final NodeChoice n) {
    n.choice.accept(this);
    return;
  }

  
  public void visit(final NodeList n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  
  public void visit(final NodeListOptional n) {
    if (n.present()) {
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        e.next().accept(this);
        }
      return;
    } else
      return;
  }

  
  public void visit(final NodeOptional n) {
    if (n.present()) {
      n.node.accept(this);
      return;
    } else
      return;
  }

  
  public void visit(final NodeSequence n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  
  public void visit(final NodeTCF n) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  
  public void visit(final NodeToken n) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  
  public void visit(final Start n) {
    // f0 -> Expression()
    n.f0.accept(this);
    // f1 -> ";"
    n.f1.accept(this);
  }

  
  public void visit(final Expression n) {
    // f0 -> AdditiveExpression()
    n.f0.accept(this);
  }

  
  public void visit(final AdditiveExpression n) {
    // f0 -> MultiplicativeExpression()
    n.f0.accept(this);
    // f1 -> ( #0 ( %0 "+"
    // .. .. . .. | %1 "-" )
    // .. .. . #1 MultiplicativeExpression() )*
    n.f1.accept(this);
  }

  
  public void visit(final MultiplicativeExpression n) {
    // f0 -> UnaryExpression()
    n.f0.accept(this);
    // f1 -> ( #0 ( %0 "*"
    // .. .. . .. | %1 "/"
    // .. .. . .. | %2 "%" )
    // .. .. . #1 UnaryExpression() )*
    n.f1.accept(this);
  }

  
  public void visit(final UnaryExpression n) {
    // f0 -> . %0 #0 "(" #1 Expression() #2 ")"
    // .. .. | %1 Identifier()
    // .. .. | %2 MyInteger()
    n.f0.accept(this);
  }

  
  public void visit(final Identifier n) {
    // f0 -> <IDENTIFIER>
    n.f0.accept(this);
  }

  
  public void visit(final MyInteger n) {
    // f0 -> <INTEGER_LITERAL>
    n.f0.accept(this);
  }

}
