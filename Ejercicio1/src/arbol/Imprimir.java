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
public class Imprimir implements Instruccion{
    
    private final Instruccion exp;

    public Imprimir(Instruccion exp) {
        this.exp = exp;
    }

    @Override
    public Object ejecutar(TablaSimbolos TS) {
        System.out.println(exp.ejecutar(TS).toString());
        return null;
    }
    
    
}
