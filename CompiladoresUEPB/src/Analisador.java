/* Generated By:JJTree&JavaCC: Do not edit this line. Analisador.java */
public class Analisador/*@bgen(jjtree)*/implements AnalisadorTreeConstants, AnalisadorConstants {/*@bgen(jjtree)*/
  protected JJTAnalisadorState jjtree = new JJTAnalisadorState();public static void main(String args[]) throws ParseException {
  }

/** Producao inicial. */
  final public SimpleNode Start() throws ParseException {
                      /*@bgen(jjtree) Start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Goal();
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public void Goal() throws ParseException {
               /*@bgen(jjtree) Goal */
  SimpleNode jjtn000 = new SimpleNode(JJTGOAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      MainClass();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case CLASS:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        ClassDeclaration();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MainClass() throws ParseException {
                    /*@bgen(jjtree) MainClass */
  SimpleNode jjtn000 = new SimpleNode(JJTMAINCLASS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ABRE_CHAVE);
      jj_consume_token(PUBLIC);
      jj_consume_token(STATIC);
      jj_consume_token(VOID);
      jj_consume_token(MAIN);
      jj_consume_token(ABRE_PARENTESES);
      jj_consume_token(STRING);
      jj_consume_token(ABRE_COLCHETE);
      jj_consume_token(FECHA_COLCHETE);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(FECHA_PARENTESES);
      jj_consume_token(ABRE_CHAVE);
      Statement();
      jj_consume_token(FECHA_CHAVE);
      jj_consume_token(FECHA_CHAVE);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ClassDeclaration() throws ParseException {
                           /*@bgen(jjtree) ClassDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTCLASSDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EXTENDS:
        jj_consume_token(EXTENDS);
        jj_consume_token(IDENTIFIER);
        break;
      default:
        jj_la1[1] = jj_gen;
        ;
      }
      jj_consume_token(ABRE_CHAVE);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case BOOLEAN:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
        VarDeclaration();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PUBLIC:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
        MethodDeclaration();
      }
      jj_consume_token(FECHA_CHAVE);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void VarDeclaration() throws ParseException {
                         /*@bgen(jjtree) VarDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTVARDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Type();
      jj_consume_token(IDENTIFIER);
      jj_consume_token(PONTOVIRGULA);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MethodDeclaration() throws ParseException {
                            /*@bgen(jjtree) MethodDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTMETHODDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(PUBLIC);
      Type();
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ABRE_PARENTESES);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case IDENTIFIER:
        Type();
        jj_consume_token(IDENTIFIER);
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case VIRGULA:
            ;
            break;
          default:
            jj_la1[4] = jj_gen;
            break label_4;
          }
          jj_consume_token(VIRGULA);
          Type();
          jj_consume_token(IDENTIFIER);
        }
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(FECHA_PARENTESES);
      jj_consume_token(ABRE_CHAVE);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case BOOLEAN:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_5;
        }
        VarDeclaration();
      }
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ABRE_CHAVE:
        case IF:
        case WHILE:
        case PRINT:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_6;
        }
        Statement();
      }
      jj_consume_token(RETURN);
      Expression();
      jj_consume_token(PONTOVIRGULA);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Type() throws ParseException {
               /*@bgen(jjtree) Type */
  SimpleNode jjtn000 = new SimpleNode(JJTTYPE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        jj_consume_token(INT);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ABRE_COLCHETE:
          jj_consume_token(ABRE_COLCHETE);
          jj_consume_token(FECHA_COLCHETE);
          break;
        default:
          jj_la1[8] = jj_gen;
                                             jjtree.closeNodeScope(jjtn000, true);
                                             jjtc000 = false;

        }
        break;
      case BOOLEAN:
        jj_consume_token(BOOLEAN);
        break;
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Statement() throws ParseException {
                    /*@bgen(jjtree) Statement */
  SimpleNode jjtn000 = new SimpleNode(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ABRE_CHAVE:
        jj_consume_token(ABRE_CHAVE);
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case ABRE_CHAVE:
          case IF:
          case WHILE:
          case PRINT:
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[10] = jj_gen;
            break label_7;
          }
          Statement();
        }
        jj_consume_token(FECHA_CHAVE);
        break;
      case IF:
        jj_consume_token(IF);
        jj_consume_token(ABRE_PARENTESES);
        Expression();
        jj_consume_token(FECHA_PARENTESES);
        Statement();
        jj_consume_token(ELSE);
        Statement();
        break;
      case WHILE:
        jj_consume_token(WHILE);
        jj_consume_token(ABRE_PARENTESES);
        Expression();
        jj_consume_token(FECHA_PARENTESES);
        Statement();
        break;
      case PRINT:
        jj_consume_token(PRINT);
        jj_consume_token(ABRE_PARENTESES);
        Expression();
        jj_consume_token(FECHA_PARENTESES);
        jj_consume_token(PONTOVIRGULA);
        break;
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IGUAL:
          jj_consume_token(IGUAL);
          Expression();
          jj_consume_token(PONTOVIRGULA);
          break;
        case ABRE_COLCHETE:
          jj_consume_token(ABRE_COLCHETE);
          Expression();
          jj_consume_token(FECHA_COLCHETE);
          jj_consume_token(IGUAL);
          Expression();
          jj_consume_token(PONTOVIRGULA);
          break;
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Elinha() throws ParseException {
                 /*@bgen(jjtree) Elinha */
  SimpleNode jjtn000 = new SimpleNode(JJTELINHA);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIS:
      case MENOS:
      case ASTERISCO:
      case AND:
      case MENOR:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AND:
          jj_consume_token(AND);
          break;
        case MENOR:
          jj_consume_token(MENOR);
          break;
        case MAIS:
          jj_consume_token(MAIS);
          break;
        case MENOS:
          jj_consume_token(MENOS);
          break;
        case ASTERISCO:
          jj_consume_token(ASTERISCO);
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        Expression();
        break;
      case ABRE_COLCHETE:
        jj_consume_token(ABRE_COLCHETE);
        Expression();
        jj_consume_token(FECHA_COLCHETE);
        break;
      case PONTO:
        jj_consume_token(PONTO);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LENGTH:
          jj_consume_token(LENGTH);
          break;
        case IDENTIFIER:
          jj_consume_token(IDENTIFIER);
          jj_consume_token(ABRE_PARENTESES);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NAO:
          case ABRE_PARENTESES:
          case THIS:
          case TRUE:
          case FALSE:
          case NEW:
          case INT_LITERAL:
          case IDENTIFIER:
            Expression();
            label_8:
            while (true) {
              switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
              case VIRGULA:
                ;
                break;
              default:
                jj_la1[14] = jj_gen;
                break label_8;
              }
              jj_consume_token(VIRGULA);
              Expression();
            }
            break;
          default:
            jj_la1[15] = jj_gen;
            ;
          }
          jj_consume_token(FECHA_PARENTESES);
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[17] = jj_gen;
       jjtree.closeNodeScope(jjtn000, true);
       jjtc000 = false;

      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

// METODO COM GAMBIARRA
  final public void Expression() throws ParseException {
                     /*@bgen(jjtree) Expression */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT_LITERAL:
        jj_consume_token(INT_LITERAL);
        Elinha();
        break;
      case TRUE:
        jj_consume_token(TRUE);
        Elinha();
        break;
      case FALSE:
        jj_consume_token(FALSE);
        Elinha();
        break;
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        Elinha();
        break;
      case THIS:
        jj_consume_token(THIS);
        Elinha();
        break;
      case NEW:
        jj_consume_token(NEW);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
          jj_consume_token(INT);
          jj_consume_token(ABRE_COLCHETE);
          Expression();
          jj_consume_token(FECHA_COLCHETE);
          Elinha();
          break;
        case IDENTIFIER:
          jj_consume_token(IDENTIFIER);
          jj_consume_token(ABRE_PARENTESES);
          jj_consume_token(FECHA_PARENTESES);
          Elinha();
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      case NAO:
        jj_consume_token(NAO);
        Expression();
        Elinha();
        break;
      case ABRE_PARENTESES:
        jj_consume_token(ABRE_PARENTESES);
        Expression();
        jj_consume_token(FECHA_PARENTESES);
        Elinha();
        break;
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

  /** Generated Token Manager. */
  public AnalisadorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000000,0x0,0x30000000,0x0,0x2000000,0x30000000,0x30000000,0x80200000,0x80000,0x30000000,0x80200000,0x90000,0x80200000,0x7c00,0x2000000,0x40028000,0x0,0x1087c00,0x10000000,0x40028000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x20,0x4000,0x80,0x0,0x4000,0x4000,0x4402,0x0,0x4000,0x4402,0x0,0x4402,0x0,0x0,0x700c,0x4800,0x0,0x4000,0x700c,};
   }

  /** Constructor with InputStream. */
  public Analisador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Analisador(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalisadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Analisador(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalisadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Analisador(AnalisadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalisadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[49];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 49; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
