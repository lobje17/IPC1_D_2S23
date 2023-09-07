/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7_ejemplo;

/**
 *
 * @author lobje
 */
public class Clase7_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadro c = new Cuadro("Cuadro 1", 5);
        c.mostrarArea();
        Triangulo t = new Triangulo("Triangulo 1", 5, 6);
        t.mostrarArea();
    }
    
}
