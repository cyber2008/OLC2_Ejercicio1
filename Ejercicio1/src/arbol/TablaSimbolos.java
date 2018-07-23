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
public class TablaSimbolos extends LinkedList<Nodo>{

    public TablaSimbolos() {
        super();
    }

    Object getValor(String id) {
        for(Nodo s:this){
            if(s.getId().equals(id)){
                return s.getValor();
            }
        }
        System.out.println("La variable "+id+" no existe en este ámbito.");
        return "Desconocido";
    }

    void setValor(String id, Object valor) {
        for(Nodo s:this){
            if(s.getId().equals(id)){
                s.setValor(valor);
                return;
            }
        }
        System.out.println("La variable "+id+" no existe en este ámbito, por lo "
                + "que no puede asignársele un valor.");
    }
    
    
}
