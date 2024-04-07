/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_listas;

import ListaDoble.ListaD;
import ListaSimple.ListaS;

/**
 *
 * @author lobje
 */
public class Ejemplo_Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************************");
        ListaS ls = new ListaS();
        ls.agregar(0);
        ls.agregar(23);
        ls.agregar(3);
        ls.agregar(565);
        ls.verDatos();
        
        ListaD ld = new ListaD();
        ld.agregar(10);
        ld.agregar(25);
        ld.agregar(0);
        ld.agregar(25);
        ld.agregar(5);
        ld.verDatos();
    }
    
}
