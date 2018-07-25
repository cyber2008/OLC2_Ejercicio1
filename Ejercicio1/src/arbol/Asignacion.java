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
public class Asignacion implements Instruccion{

    private final String id;
    private final Operacion valor;
    
    public Asignacion(String id, Operacion op) {
        this.id = id;
        this.valor = op;
    }

    @Override
    public Object ejecutar(TablaSimbolos TS) {
        TS.setValor(id,valor.ejecutar(TS));
        return null;
    }
    
}
