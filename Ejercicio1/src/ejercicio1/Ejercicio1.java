/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import arbol.Instruccion;
import arbol.TablaSimbolos;
import java.io.FileInputStream;
import java.util.LinkedList;
/**
 *
 * @author eliu
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interprete("entrada.txt");
    }
     private static void interprete(String path){
     analizadores.Sintactico pars;
     LinkedList<Instruccion> AST_arbolSintacticoAbstracto = null;
     
     try{
     pars = new analizadores.Sintactico(new analizadores.Lexico(new FileInputStream(path)));
     pars.parse();
     AST_arbolSintacticoAbstracto = pars.getAST();
     }catch(Exception e){
         System.out.println("Error en la compilacion de entrada");
     }
     ejecutarAST(AST_arbolSintacticoAbstracto);
     }
     
         private static void ejecutarAST(LinkedList<Instruccion> ast) {
        if(ast==null){
            System.out.println("No es posible ejecutar las instrucciones porque\r\n"
                    + "el árbol no fue cargado de forma adecuada por la existencia\r\n"
                    + "de errores léxicos o sintácticos.");
            return;
        }
        //Se crea una tabla de símbolos global para ejecutar las instrucciones.
        TablaSimbolos ts=new TablaSimbolos();
        //Se ejecuta cada instruccion en el ast, es decir, cada instruccion de 
        //la lista principal de instrucciones.
        for(Instruccion ins:ast){
            //Si existe un error léxico o sintáctico en cierta instrucción esta
            //será inválida y se cargará como null, por lo tanto no deberá ejecutarse
            //es por esto que se hace esta validación.
            if(ins!=null)
                ins.ejecutar(ts);
        }
    }

}
