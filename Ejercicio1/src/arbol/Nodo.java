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
public class Nodo {
    private final Tipo tipo;
    private final String id;
    private Object valor;
    
    public Nodo(String id, Tipo tipo){
        this.tipo = tipo;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    public static enum Tipo{
        NUMERO
    }
}
