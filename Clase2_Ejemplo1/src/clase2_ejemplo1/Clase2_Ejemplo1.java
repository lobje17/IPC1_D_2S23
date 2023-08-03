/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author lobje
 */
public class Clase2_Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        creacionArrayList();
//        creacionArrayList();
       /* sumar(5,6);
        sumar(54,76);
        */
       /*
        String saludo = saludar(10);
        // String saludo = "Buenos dias";
        System.out.println("Saludo " + saludo);
        
        System.out.println("Saludo " + saludar(12));
        
        saludo = saludar(21);
        System.out.println("Saludo " + saludo);
        */
        
        /*  */
        //System.out.println("El factorial de 5 es "+fact(5));
        
        
        /**/
        int [] arreglo = {1,58,6,8,12,89,0};
        //int [] arreglo2 = new int[15];
        ordenamientoBurbuja(arreglo);
    }
    
    /* Ejemplos de metodos */
    public static void creacionArrayList(){
        ArrayList <String> nombre = new ArrayList<>();
        nombre.add("Salvador");
        nombre.add("Jose");
        
        for (int i = 0; i < nombre.size(); i++) {
            String get = nombre.get(i);
            System.out.println("Nombre "+get+"  en la posicion "+i);
        }
    }
    
    public static void creacionLinkendList(){
        LinkedList<String> carnet = new LinkedList<>();
        carnet.add("123456");
        carnet.add("658899");
        
        for (int i = 0; i < carnet.size(); i++) {
            String get = carnet.get(i);
            System.out.println("carnet "+get+"  en la posicion "+i);
        }
    }
    
    public static void sumar(int izq, int der){
        System.out.println("La suma de "+izq+" y "+der+" es "+(izq+der));
    }
    
    /* Ejemplo de funcion */
    public static String saludar(int hora){
        if(hora<12) return "Buenos dias";
        if(hora>=12 && hora<18) return "Buenas tardes";
        return "Buenas noches";
    }
    
    /* Recursividad
        factorial de un numero
        4!  = 4 * 3 * 2 * 1
        -5! = 1
        1!  = 1
    */
    
    public static int fact(int num){
        System.out.println("El valor de ingreso es "+num);
        if(num<0) return 1;
        if(num==1) {
            System.out.println("El valor que va a retornar es "+1);
            return 1;
        }
        int solucion = num * fact(num-1);
        System.out.println("El valor que va a retornar es "+solucion);
        return solucion;
    }
    
    
    public static void ordenamientoBurbuja(int [] arreglo){
        int tam = arreglo.length;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - i -1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        mostrarArreglo(arreglo);
    }
    
    public static void mostrarArreglo(int [] arreglo){
        int tam = arreglo.length;
        for (int i = 0; i < tam ; i++) {
            System.out.print(arreglo[i]+" -> ");
        }
    }
    
}
