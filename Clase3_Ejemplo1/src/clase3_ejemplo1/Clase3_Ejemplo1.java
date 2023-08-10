/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_ejemplo1;

import java.util.Scanner;

/**
 *
 * @author lobje
 */
public class Clase3_Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scaner = new Scanner(System.in);
    public static String [] estudiantes = {"Jose", "salvador", "Jaime", "Eduardo"};
    public static String [][] desc =    {{"S1", "45", "89", "69", "0"},
                                        {"S2", "85", "89", "59", "0"},
                                        {"S3", "78", "67", "69", "0"},
                                        {"S4", "55", "90", "71", "0"}}; 
    
    public static void main(String[] args) {
        // Entrar como admin o cliente
        // Eliminacion
        // Descuentos
        
        //ingresoAlSistema();
        mostrarListaEstudiate();
        eliminacionEstudiate("Jaime");
        mostrarListaEstudiate();
    }
    
    public static void ingresoAlSistema(){
        mensaje("Bienvenido al sistema de renta de vehiculos");
        int opcion = 0;
        
        while (opcion!=3) {
            opcion = menuInicio();
            if(opcion==1) mensaje("Entre al menu de cliente");
            else if(opcion==3) mensaje("Entre al menu de admin");
            System.out.println("***********************************************\n");
        }
    }
    
    public static int menuInicio(){
        mensaje("Menu principal");
        mensaje("1. Cliente");
        mensaje("2. Administrador");
        mensaje("3. Salir");
        
        return obteneOpcionConsola("Ingrese el numero de la opcion");
    }
    
    public static int obteneOpcionConsola(String msj){
        mensaje(msj);
        return scaner.nextInt();
    }
    
    public static void mensaje(String msj){
        System.out.println(msj);
    }
    
    /* Ejemplo de eliminacion de un arreglo */
    public static void eliminacionEstudiate(String nombre){
        int tam = estudiantes.length;
        
        for (int i = 0; i < tam; i++) {
            if(estudiantes[i].equals(nombre)){
                estudiantes[i] = "Vacio";
            }
        }
    }
    
    public static void mostrarListaEstudiate(){
        int tam = estudiantes.length;
        mensaje("**************************************");
        for (int i = 0; i < tam; i++) {
            mensaje((i+1)+" - "+estudiantes[i]);
        }
        mensaje("**************************************\n");
    }
    
    /* Descuentos */
    public static void ingresarDescuntos(){
        int tam = desc.length;
        
        for (int i = 0; i < tam; i++) {
            if(desc[i]!=0){
                estudiantes[i] = "Vacio";
            }
        }
    }
}
