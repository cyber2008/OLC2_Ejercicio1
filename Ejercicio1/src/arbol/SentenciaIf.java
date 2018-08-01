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
    
    public SentenciaIf(Operacion cond, LinkedList<Instruccion> sent) {
        this.cond = cond;
        this.sent = sent;
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
            System.out.println("condicion no se cumple");
        }
         return null;

    }
    
}
