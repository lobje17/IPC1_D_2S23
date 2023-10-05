/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9_ejemplo1;

import Hilos.Heredado;
import Hilos.Implementado;

/**
 *
 * @author lobje
 */
public class Clase9_Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Heredado h = new Heredado();
        Implementado i = new Implementado();
        
        h.start();
        i.iniciaHilo();
    }
    
}
