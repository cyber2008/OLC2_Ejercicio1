/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.LinkedList;

/**
 *
 * @author eliu
 */
public class SentenciaIf implements Instruccion{

    private Operacion cond;
    private LinkedList<Instruccion> sent;
    private LinkedList<Instruccion> sentElse;
    
    public SentenciaIf(Operacion cond, LinkedList<Instruccion> sent) {
        this.cond = cond;
        this.sent = sent;
    }

    public SentenciaIf(Operacion cond, LinkedList<Instruccion> sent, LinkedList<Instruccion> sentElse) {
        this.cond = cond;
        this.sent = sent;
        this.sentElse = sentElse;
    }
        
    public SentenciaIf(Operacion cond) {
        this.cond = cond;
    }

        
    @Override
    public Object ejecutar(TablaSimbolos TS) {
        if((Boolean) cond.ejecutar(TS)){
               TablaSimbolos tablaLocal=new TablaSimbolos();
                tablaLocal.addAll(TS);
                for(Instruccion in: sent){
                    in.ejecutar(tablaLocal);
                }
        }else{
                TablaSimbolos tablaLocal=new TablaSimbolos();
                tablaLocal.addAll(TS);
                for(Instruccion in: sentElse){
                    in.ejecutar(tablaLocal);
                }
        }
         return null;

    }
    
}
