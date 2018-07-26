/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author eliu
 */
public class Operacion implements Instruccion{

    public static enum Tipo_Operador{
        SUMA,
        RESTA,
        MULTIPLICACION,
        DIVISION,
        NEGATIVO,
        NUMERO,
        IDENTIFICADOR,
        CADENA,
        MAYORQUE,
        MENORQUE,
        MAYORIGUALQUE,
        MENORIGUALQUE,
        IGUALIGUAL,
        DISTINTO,
        CONCATENACION,
        VERDADERO,
        FALSO,
        AND,
        OR,
        NOT
    }
    
    private final Tipo_Operador tipo;
    
    private Operacion opIzq;
    
    private Operacion opDer;
    
    private Object valor;

    public Operacion(Operacion opIzq, Operacion opDer, Tipo_Operador tipo) {
        this.tipo = tipo;
        this.opIzq = opIzq;
        this.opDer = opDer;
    }    

    public Operacion(String strValor, Tipo_Operador tipo) {
        this.valor = strValor;
        this.tipo = tipo;
    } 
    
    public Operacion(Operacion opIzq, Tipo_Operador tipo) {
        this.tipo = tipo;
        this.opIzq = opIzq;
    } 
    
    public Operacion(Double a) {
        this.valor=a;
        this.tipo = Tipo_Operador.NUMERO;
    }
        
    @Override
    public Object ejecutar(TablaSimbolos TS) {
        
        switch(tipo){
            case SUMA:
                return (Double) opIzq.ejecutar(TS)+(Double) opDer.ejecutar(TS);
            case RESTA:
                return (Double) opIzq.ejecutar(TS)-(Double) opDer.ejecutar(TS);
            case MULTIPLICACION:
                return (Double) opIzq.ejecutar(TS)*(Double) opDer.ejecutar(TS);
            case DIVISION:
                return (Double) opIzq.ejecutar(TS)/(Double) opDer.ejecutar(TS);
            case NEGATIVO:
                return (Double) opIzq.ejecutar(TS)*-1;
            case NUMERO:
                return new Double(valor.toString());
            case IDENTIFICADOR:
                return TS.getValor(valor.toString());
            case CADENA:
                return valor.toString();
            case MAYORQUE:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() > ((Double) opDer.ejecutar(TS)).doubleValue();
            case MAYORIGUALQUE:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() >= ((Double) opDer.ejecutar(TS)).doubleValue();
            case MENORQUE:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() < ((Double) opDer.ejecutar(TS)).doubleValue();
            case MENORIGUALQUE:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() <= ((Double) opDer.ejecutar(TS)).doubleValue();
            case IGUALIGUAL:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() == ((Double) opDer.ejecutar(TS)).doubleValue();
            case DISTINTO:
                return ((Double) opIzq.ejecutar(TS)).doubleValue() != ((Double) opDer.ejecutar(TS)).doubleValue();                            
            case CONCATENACION:
                return opIzq.ejecutar(TS).toString()+opDer.ejecutar(TS).toString();
            case VERDADERO:
                return valor = true;
            case FALSO:
                return valor = false;
            case NOT:
                return !Boolean.valueOf(opIzq.ejecutar(TS).toString());
            case AND:
                return Boolean.valueOf(opIzq.ejecutar(TS).toString()) && Boolean.valueOf(opDer.ejecutar(TS).toString());
            case OR:
                return Boolean.valueOf(opIzq.ejecutar(TS).toString()) || Boolean.valueOf(opDer.ejecutar(TS).toString());
            default:
                return null;              
        }
    }           
}
