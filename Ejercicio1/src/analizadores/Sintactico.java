
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import arbol.Imprimir;
import arbol.Instruccion;
import arbol.Operacion;
import arbol.Nodo.Tipo;
import arbol.TablaSimbolos;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\043\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\007\000\002\004\004" +
    "\000\002\004\004\000\002\004\003\000\002\005\005\000" +
    "\002\006\005\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\011\005\000\002\011\003\000\002\012" +
    "\005\000\002\012\005\000\002\012\005\000\002\012\005" +
    "\000\002\012\005\000\002\012\005\000\002\010\005\000" +
    "\002\010\005\000\002\010\005\000\002\010\005\000\002" +
    "\010\004\000\002\010\005\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\013\003\000\002\013\003\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\012\003\011\004\005\006\004\034\013\001" +
    "\002\000\010\005\075\007\073\010\076\001\002\000\004" +
    "\014\067\001\002\000\014\002\ufffe\003\ufffe\004\ufffe\006" +
    "\ufffe\034\ufffe\001\002\000\004\013\066\001\002\000\004" +
    "\013\065\001\002\000\014\002\ufffa\003\ufffa\004\ufffa\006" +
    "\ufffa\034\ufffa\001\002\000\014\002\000\003\011\004\005" +
    "\006\004\034\013\001\002\000\004\030\016\001\002\000" +
    "\004\002\015\001\002\000\004\002\001\001\002\000\022" +
    "\011\022\012\031\014\030\017\021\032\023\033\020\034" +
    "\032\035\017\001\002\000\010\013\ufff3\015\ufff3\022\ufff3" +
    "\001\002\000\034\013\uffe5\015\uffe5\016\uffe5\017\uffe5\020" +
    "\uffe5\021\uffe5\022\uffe5\023\uffe5\024\uffe5\025\uffe5\026\uffe5" +
    "\027\uffe5\031\uffe5\001\002\000\020\011\022\012\031\014" +
    "\030\017\021\032\023\033\020\034\032\001\002\000\034" +
    "\013\uffe3\015\uffe3\016\uffe3\017\uffe3\020\uffe3\021\uffe3\022" +
    "\uffe3\023\uffe3\024\uffe3\025\uffe3\026\uffe3\027\uffe3\031\uffe3" +
    "\001\002\000\034\013\uffe6\015\uffe6\016\uffe6\017\uffe6\020" +
    "\uffe6\021\uffe6\022\uffe6\023\uffe6\024\uffe6\025\uffe6\026\uffe6" +
    "\027\uffe6\031\uffe6\001\002\000\004\013\ufff8\001\002\000" +
    "\010\013\ufff6\015\ufff6\022\ufff6\001\002\000\010\013\ufff7" +
    "\015\ufff7\022\061\001\002\000\034\013\ufff5\015\ufff5\016" +
    "\034\017\036\020\040\021\037\022\ufff5\023\046\024\050" +
    "\025\047\026\045\027\052\031\051\001\002\000\020\011" +
    "\022\012\031\014\030\017\021\032\023\033\020\034\032" +
    "\001\002\000\034\013\uffe2\015\uffe2\016\uffe2\017\uffe2\020" +
    "\uffe2\021\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026\uffe2" +
    "\027\uffe2\031\uffe2\001\002\000\034\013\uffe4\015\uffe4\016" +
    "\uffe4\017\uffe4\020\uffe4\021\uffe4\022\uffe4\023\uffe4\024\uffe4" +
    "\025\uffe4\026\uffe4\027\uffe4\031\uffe4\001\002\000\014\015" +
    "\035\016\034\017\036\020\040\021\037\001\002\000\020" +
    "\011\022\012\031\014\030\017\021\032\023\033\020\034" +
    "\032\001\002\000\034\013\uffe7\015\uffe7\016\uffe7\017\uffe7" +
    "\020\uffe7\021\uffe7\022\uffe7\023\uffe7\024\uffe7\025\uffe7\026" +
    "\uffe7\027\uffe7\031\uffe7\001\002\000\020\011\022\012\031" +
    "\014\030\017\021\032\023\033\020\034\032\001\002\000" +
    "\020\011\022\012\031\014\030\017\021\032\023\033\020" +
    "\034\032\001\002\000\020\011\022\012\031\014\030\017" +
    "\021\032\023\033\020\034\032\001\002\000\034\013\uffea" +
    "\015\uffea\016\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023" +
    "\uffea\024\uffea\025\uffea\026\uffea\027\uffea\031\uffea\001\002" +
    "\000\034\013\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\021" +
    "\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9\026\uffe9\027\uffe9" +
    "\031\uffe9\001\002\000\034\013\uffeb\015\uffeb\016\uffeb\017" +
    "\uffeb\020\040\021\037\022\uffeb\023\uffeb\024\uffeb\025\uffeb" +
    "\026\uffeb\027\uffeb\031\uffeb\001\002\000\034\013\uffec\015" +
    "\uffec\016\uffec\017\uffec\020\040\021\037\022\uffec\023\uffec" +
    "\024\uffec\025\uffec\026\uffec\027\uffec\031\uffec\001\002\000" +
    "\020\011\022\012\031\014\030\017\021\032\023\033\020" +
    "\034\032\001\002\000\020\011\022\012\031\014\030\017" +
    "\021\032\023\033\020\034\032\001\002\000\020\011\022" +
    "\012\031\014\030\017\021\032\023\033\020\034\032\001" +
    "\002\000\020\011\022\012\031\014\030\017\021\032\023" +
    "\033\020\034\032\001\002\000\020\011\022\012\031\014" +
    "\030\017\021\032\023\033\020\034\032\001\002\000\020" +
    "\011\022\012\031\014\030\017\021\032\023\033\020\034" +
    "\032\001\002\000\020\013\uffed\015\uffed\016\034\017\036" +
    "\020\040\021\037\022\uffed\001\002\000\020\013\ufff2\015" +
    "\ufff2\016\034\017\036\020\040\021\037\022\ufff2\001\002" +
    "\000\020\013\uffef\015\uffef\016\034\017\036\020\040\021" +
    "\037\022\uffef\001\002\000\020\013\ufff1\015\ufff1\016\034" +
    "\017\036\020\040\021\037\022\ufff1\001\002\000\020\013" +
    "\ufff0\015\ufff0\016\034\017\036\020\040\021\037\022\ufff0" +
    "\001\002\000\020\013\uffee\015\uffee\016\034\017\036\020" +
    "\040\021\037\022\uffee\001\002\000\022\011\022\012\031" +
    "\014\030\017\021\032\023\033\020\034\032\035\017\001" +
    "\002\000\010\013\ufff4\015\ufff4\022\ufff4\001\002\000\034" +
    "\013\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8\022" +
    "\uffe8\023\uffe8\024\uffe8\025\uffe8\026\uffe8\027\uffe8\031\uffe8" +
    "\001\002\000\014\002\uffff\003\uffff\004\uffff\006\uffff\034" +
    "\uffff\001\002\000\014\002\ufffc\003\ufffc\004\ufffc\006\ufffc" +
    "\034\ufffc\001\002\000\014\002\ufffb\003\ufffb\004\ufffb\006" +
    "\ufffb\034\ufffb\001\002\000\022\011\022\012\031\014\030" +
    "\017\021\032\023\033\020\034\032\035\017\001\002\000" +
    "\004\015\071\001\002\000\004\013\072\001\002\000\014" +
    "\002\ufffd\003\ufffd\004\ufffd\006\ufffd\034\ufffd\001\002\000" +
    "\004\034\uffe0\001\002\000\004\034\077\001\002\000\004" +
    "\034\uffe1\001\002\000\004\034\uffdf\001\002\000\004\013" +
    "\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\014\002\013\003\011\004\005\005\007\006" +
    "\006\001\001\000\004\013\073\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\004\063\005\007\006\006\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\007\023\010\026\011\025\012\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\062\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\043\001\001\000\002\001\001\000" +
    "\004\010\042\001\001\000\004\010\041\001\001\000\004" +
    "\010\040\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\057\001\001" +
    "\000\004\010\056\001\001\000\004\010\055\001\001\000" +
    "\004\010\054\001\001\000\004\010\053\001\001\000\004" +
    "\010\052\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\007\061\010\026\011\025\012\024\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\007\067\010" +
    "\026\011\025\012\024\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<Instruccion> AST;

    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        System.out.println("Error Sintáctico en la Línea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  

    public LinkedList<Instruccion> getAST() {
        return AST;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= sentencias 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		parser.AST=a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sentencias ::= sentencias instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=a; RESULT.add(b);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("sentencias",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sentencias ::= instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=new LinkedList<>(); RESULT.add(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("sentencias",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= RIMPRIMIR PARIZQ exp PARDER PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		RESULT=new Imprimir(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= declaracion PTCOMA 
            {
              Instruccion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= asignacion PTCOMA 
            {
              Instruccion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= error 
            {
              Instruccion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // declaracion ::= RDECLARE tipo IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // asignacion ::= IDENTIFICADOR IGUAL exp 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("asignacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= exp_cad 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= exp_bool 
            {
              Operacion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= exp_num 
            {
              Operacion RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp_cad ::= exp_cad CONCAT exp 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new Operacion(a, b,Operacion.Tipo_Operador.CONCATENACION);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_cad",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp_cad ::= CADENA 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new Operacion(a, Operacion.Tipo_Operador.CADENA);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_cad",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp_bool ::= exp_num IGUALIGUAL exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp_bool ::= exp_num MAYORQUE exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp_bool ::= exp_num MENORQUE exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp_bool ::= exp_num MENORIGUALQUE exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exp_bool ::= exp_num MAYORIGUALQUE exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // exp_bool ::= exp_num DISTINTO exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_bool",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // exp_num ::= exp_num MAS exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // exp_num ::= exp_num MENOS exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // exp_num ::= exp_num POR exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // exp_num ::= exp_num DIVISION exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // exp_num ::= MENOS exp_num 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // exp_num ::= PARIZQ exp_num PARDER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // exp_num ::= ENTERO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // exp_num ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // exp_num ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // exp_num ::= RTRUE 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // exp_num ::= RFALSE 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("exp_num",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // tipo ::= RNUMBER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipo",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // tipo ::= RSTRING 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipo",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // tipo ::= RBOOLEAN 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipo",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
