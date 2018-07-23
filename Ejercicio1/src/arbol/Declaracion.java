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
public class Declaracion implements Instruccion {
    private final String id;
    
    Nodo.Tipo tipo;

    public Declaracion(String id, Nodo.Tipo tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    @Override
    public Object ejecutar(TablaSimbolos TS) {
        TS.add(new Nodo(id, tipo));
        return null;
    }
    
    
}
