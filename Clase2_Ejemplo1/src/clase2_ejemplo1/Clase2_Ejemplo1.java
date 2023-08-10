/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author lobje
 */
public class Clase2_Ejemplo1 {
    static Scanner scaner = new Scanner(System.in);
    static int [] datos = new int[4];
    /*
    posisiones
    1           Nombre
    2           Nota 1
    3           Nota 2
    4           Nota 3
    5           Promedio
    */
    //static String [][] datosEstudiante = new String[4][5];
    static String [][] datosEstudiante = {{"S1", "45", "89", "69", "0"},
                                          {"S2", "85", "89", "59", "0"},
                                          {"S3", "78", "67", "69", "0"},
                                          {"S4", "55", "90", "71", "0"}};
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
        //ordenamientoBurbuja(arreglo);
        //ordenamientoPorSeleccion(arreglo);
        //obtenerDatos();
        //menu();
        menuEstudiante();
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
        
        mostrarArreglo(arreglo);
        int tam = arreglo.length;
        for (int i = 0; i < tam - 1; i++) {
            System.out.println("\nIteracion No. "+(i+1));
            for (int j = 0; j < tam - i -1; j++) {
                System.out.println("Los valores a compara son "+arreglo[j]+" > " +arreglo[j+1]);
                if(arreglo[j]>arreglo[j+1]){
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    mostrarArreglo(arreglo);
                }
            }
        }
        mostrarArreglo(arreglo);
    }
    
       
    public static void ordenamientoPorSeleccion(int [] arreglo){
        mostrarArreglo(arreglo);
        int tam = arreglo.length;
        int pocisionInicio;
        
        for (int i = 0; i < tam - 1; i++) {
            pocisionInicio = i;
            System.out.println("\nIteracion No. "+(i+1));
            
            for (int j = i+1; j < tam; j++) {
                System.out.println("Los valores a compara son "+arreglo[j]+" < " +arreglo[pocisionInicio]);
                if(arreglo[j]<arreglo[pocisionInicio]){
                    pocisionInicio = j;
                }
            }
            
            int tmp = arreglo[pocisionInicio];
            arreglo[pocisionInicio] = arreglo[i];
            arreglo[i] = tmp;
            mostrarArreglo(arreglo);
        }
        mostrarArreglo(arreglo);
    }
    
    public static void mostrarArreglo(int [] arreglo){
        int tam = arreglo.length;
        for (int i = 0; i < tam ; i++) {
            System.out.print(arreglo[i]+" -> ");
        }
        System.out.println("");
    }
    
    /* Ingreso de datos desde consola */
    public static void menu(){
        int salida = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al sistema");
        
        while(salida!=3){
            System.out.println("Ingrese un numero de acuerdo a la opcion deseada:");
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("3. Salir");
            
            salida = s.nextInt();
            
            if(salida==1) obtenerDatos();
            else if(salida==2) ordenarDatos();
            System.out.println("\n");
        }
    }
    
    public static void obtenerDatos(){
        int cantidadDatos = 0;
        
        Scanner s = new Scanner(System.in);
        
        while(cantidadDatos<4){
            System.out.println("Ingrese el dato para el arreglo");
            datos[cantidadDatos] = s.nextInt();
            cantidadDatos++;
        }
        
        mostrarArreglo(datos);
    }
    
    public static void ordenarDatos(){
        int salida = 0;
        
        Scanner s = new Scanner(System.in);
        
        while(salida!=3){
            System.out.println("Ingrese un numero de acuerdo a la opcion deseada:");
            System.out.println("1. Ordenamiento de burbuja");
            System.out.println("2. Ordenamiento por Seleccion");
            System.out.println("3. Salir");
            
            salida = s.nextInt();
            
            if(salida==1) ordenamientoBurbuja(datos);
            else if(salida==2) ordenamientoPorSeleccion(datos);
            System.out.println("\n");
        }
    }
    
    /*
    Ejemplo ordenando una matriz
    */
    public static void menuEstudiante(){
        int salida = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al sistema");
        
        while(salida!=4){
            System.out.println("Ingrese un numero de acuerdo a la opcion deseada:");
            System.out.println("1. Llenar datos de estudiantes");
            System.out.println("2. Calcular promedio");
            System.out.println("3. Ordenar datos");
            System.out.println("4. Salir");
            
            salida = s.nextInt();
            
            if(salida==1) obtenerDatosEstudiante();
            else if(salida==2) calcularPromedio();
            else if(salida==3) ordenarDatosEstudiante();
            System.out.println("\n");
        }
    }
        
    public static void obtenerDatosEstudiante(){
        int cantidadDatos = 0;
        while(cantidadDatos<4){
            datosEstudiante[0][0] = mensaje("Ingrese el nombre");
            datosEstudiante[0][1] = mensaje("Ingrese el prime nota");
            datosEstudiante[0][2] = mensaje("Ingrese el segunda nota");
            datosEstudiante[0][3] = mensaje("Ingrese el tercer nota");
            System.out.println("\n");
            cantidadDatos++;
        }
        calcularPromedio();
    }

    public static void ordenarDatosEstudiante(){
 
        mostrarMatriz(datosEstudiante);
        int tam = datosEstudiante.length;
        double promedio1 = 0;
        double promedio2 = 0;
        String [] temp = new String[5];
        
        
        for (int i = 0; i < tam - 1; i++) {
                promedio1 = Double.parseDouble(datosEstudiante[i][4]);
                promedio2 = Double.parseDouble(datosEstudiante[i+1][4]);
                if(promedio1>promedio2){
                    temp[0] = datosEstudiante[i+1][0];
                    temp[1] = datosEstudiante[i+1][1];
                    temp[2] = datosEstudiante[i+1][2];
                    temp[3] = datosEstudiante[i+1][3];
                    temp[4] = datosEstudiante[i+1][4];
                    
                    datosEstudiante[i+1][0] =datosEstudiante[i][0];
                    datosEstudiante[i+1][1] =datosEstudiante[i][1];
                    datosEstudiante[i+1][2] =datosEstudiante[i][2];
                    datosEstudiante[i+1][3] =datosEstudiante[i][3];
                    datosEstudiante[i+1][4] =datosEstudiante[i][4];
                    
                    datosEstudiante[i][0] = temp[0];
                    datosEstudiante[i][1] = temp[1];
                    datosEstudiante[i][2] = temp[2];
                    datosEstudiante[i][3] = temp[3];
                    datosEstudiante[i][4] = temp[4];
                }
        }
        mostrarMatriz(datosEstudiante);
    }
    
    public static void calcularPromedio(){
        int tam = datosEstudiante.length;
        double promedio = 0;
        for (int i = 0; i < tam; i++) {
            for (int j = 1; j < 4; j++) {
                promedio += getNota(datosEstudiante[i][j]);
                System.out.println(promedio);
            }
            
            datosEstudiante[i][4] = String.valueOf(promedio/3);
            promedio = 0;
        }
        mostrarMatriz(datosEstudiante);
    }
    
    public static String mensaje(String msj){
        System.out.println(msj);
        return scaner.nextLine();
    }
    
    public static int getNota(String nota){
        return Integer.parseInt(nota);
    }
    
    public static void mostrarMatriz(String [][] arreglo){
        int tam = arreglo.length;

        for (int i = 0; i < tam ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j]+", ");
            }
            System.out.println("");
        }
    }
}
