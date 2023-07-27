/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1.ejemplo1;

/**
 *
 * @author lobje
 */
public class Clase1Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int valorDer;
        int valorIzq;
        
        valorDer = 10;
        valorIzq = 5;
        
        
        System.out.println("El valor resultante es "+(valorDer + valorIzq));
        
        total = valorDer + valorIzq;
        System.out.println("El valor resultante es "+total);
        
        /* 
            Ejemplo aplicando un vector
        */
        int [] vector = new int[3];
        System.out.println("Posicion 1 indice 0 -> "+vector[0]);
        vector[0] = 23;
        System.out.println("Posicion 1 indice 0 -> "+vector[0]);
        vector[0] = total++;
        System.out.println("Posicion 1 indice 0 -> "+vector[0]);
        vector[0] = ++total;
        System.out.println("Posicion 1 indice 0 -> "+vector[0]);
        
        vector[0] += 3;
        System.out.println("Posicion 1 indice 0 -> "+vector[0]);
        
        
        
        /* 
            Ejemplo aplicando una matriz
        */
        String [][] estudiate = new String[2][3];
        System.out.println("Posicion 1 indice 0 -> "+estudiate[0][0]);
        estudiate[0][0] = "Salvador";
        estudiate[0][1] = "Lopez";
        estudiate[0][2] = "123456";
        System.out.println("Nombre -> "+estudiate[0][0]+ " Apellido -> "+estudiate[0][1] + " carnet -> "+estudiate[0][2]);
        
        System.out.print("Nombre -> "+estudiate[0][0]);
        System.out.print(" Apellido -> "+estudiate[0][1]);
        System.out.print(" carnet -> "+estudiate[0][2]);
        
    }
    
}
