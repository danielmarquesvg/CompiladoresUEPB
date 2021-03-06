/* Generated by JTB 1.4.10 */
package visitor;

import syntaxtree.*;

import java.util.*;

public class DepthFirstRetVisitor<R> implements IRetVisitor<R> {


  
  public R visit(final NodeChoice n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    final R nRes = n.choice.accept(this);
    return nRes;
  }

  
  public R visit(final NodeList n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      final R sRes = e.next().accept(this);
    }
    return nRes;
  }

  
  public R visit(final NodeListOptional n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    if (n.present()) {
      R nRes = null;
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        @SuppressWarnings("unused")
        R sRes = e.next().accept(this);
        }
      return nRes;
    } else
      return null;
  }

  
  public R visit(final NodeOptional n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    if (n.present()) {
      final R nRes = n.node.accept(this);
      return nRes;
    } else
      return null;
  }

  
  public R visit(final NodeSequence n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      R subRet = e.next().accept(this);
    }
    return nRes;
  }

  
  public R visit(final NodeTCF n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return nRes;
  }

  
  public R visit(final NodeToken n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return nRes;
  }

  
  public R visit(final Start n) {
    R nRes = null;
    // f0 -> Expression()
    n.f0.accept(this);
    // f1 -> ";"
    n.f1.accept(this);
    return nRes;
  }

  
  public R visit(final Expression n) {
    R nRes = null;
    // f0 -> AdditiveExpression()
    n.f0.accept(this);
    return nRes;
  }

  
  public R visit(final AdditiveExpression n) {
    R nRes = null;
    // f0 -> MultiplicativeExpression()
    n.f0.accept(this);
    // f1 -> ( #0 ( %0 "+"
    // .. .. . .. | %1 "-" )
    // .. .. . #1 MultiplicativeExpression() )*
    n.f1.accept(this);
    return nRes;
  }

  
  public R visit(final MultiplicativeExpression n) {
    R nRes = null;
    // f0 -> UnaryExpression()
    n.f0.accept(this);
    // f1 -> ( #0 ( %0 "*"
    // .. .. . .. | %1 "/"
    // .. .. . .. | %2 "%" )
    // .. .. . #1 UnaryExpression() )*
    n.f1.accept(this);
    return nRes;
  }

  
  public R visit(final UnaryExpression n) {
    R nRes = null;
    // f0 -> . %0 #0 "(" #1 Expression() #2 ")"
    // .. .. | %1 Identifier()
    // .. .. | %2 MyInteger()
    n.f0.accept(this);
    return nRes;
  }

  
  public R visit(final Identifier n) {
    R nRes = null;
    // f0 -> <IDENTIFIER>
    n.f0.accept(this);
    return nRes;
  }

  
  public R visit(final MyInteger n) {
    R nRes = null;
    // f0 -> <INTEGER_LITERAL>
    n.f0.accept(this);
    return nRes;
  }

}
