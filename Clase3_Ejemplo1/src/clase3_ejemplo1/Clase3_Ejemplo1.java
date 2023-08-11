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

    
    public static void main(String[] args) {
        // Entrar como admin o cliente
        // Eliminacion
        // Descuentos
        
        //ingresoAlSistema();
//        mostrarListaEstudiate();
//        eliminacionEstudiate("Jaime");
//        mostrarListaEstudiate();
        ingresarPorcentajeExoneracion();
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
    
    /*  Descuentos
        Problema semejante a aplicar un descueto en la practica 1
    
        Se tiene un listado de estudiantes con los siguientes datos
            - Nombre
            - Promedio
        
        Se podran ingresar un porcentaje que beneficiara al estudiante
        en la nota del examen final.
    
        Por ejemplo:
            Si el estudiante tiene un promedio de 95 o superior se le dara
            el 100 de la nota del examen final
        
    */
    /* 
        Arreglo que almacena los datos de los estudiantes
            Nombre
            Promedio
    */
    public static String [][] infoEstudiantes = {{"Estudiante1", "95"},
                                                 {"Estudiante2", "60"},
                                                 {"Estudiante3", "85"},
                                                 {"Estudiante4", "70"}};

    /* 
        Arregl que almacenar los datos de
            Promedio:   El cual utilizara para comparar con las notas de
                        los estudiantes y de acuedo al valor se podra
                        o no aplicar el porcentaje
            Porcentaje: Valor a plicar
    */
    public static int [][] porcentajeExoneracion = new int[5][2];
    /*  Variable para llevar el conteo de los datos almacenados y tener una
        una ubicacion para en data a almacenar */
    public static int conteoPorcentajes = 0;

    /* Metodo principal que iniciara el programa */
    public static void ingresarPorcentajeExoneracion(){
        mensaje("Bienvenidos al control de notas de estudiantes");
        /* Variable que recibira el valor de la opcion ingresada por el usuario */
        int opcion = 0;

        /* Ciclo que dejara de repetira cuando el usuario ingrese el numero 3 */
        while (opcion!=3) {
            /* la cariable opcion recibe el valor de la funcion del menu principal */
            opcion = menuNotasEstudiantes();
            /* Si el usuario ingresa "1" se llamara al menu de porcentaje
                en el que se ingresar el promedio y porcentaje*/
            if(opcion==1) menuPorcentaje();
            /* Si el usuario ingresa "2" se llamara a aplicar porcentaje
                de exoneracion el cual buscara a traves del promedio que 
                porcentaje se le aplicara */
            else if(opcion==2) aplicarPorcejateExoneracion();
        }
    }

    /* 
        Funcion que muentra los mensajes de las opciones que se puede realizar
        Asi mismo obtiene el valor que ingresa el usuario desde la consola
    */
    public static int menuNotasEstudiantes(){
        /* Mensajes que se mostraran en consola*/
        mensaje("\n*****************************************************");
        mensaje("1. Ingresar porcentje");
        mensaje("2. Aplicar porcentaje de exoneracion");
        mensaje("3. Salir");
        /* Devolvera el valor que obtenga de la funcion obteneOpcionConsola */
        return obteneOpcionConsola("Ingrese el numero de la opcion a realizar");
    }

    /*
        Metodo que solicitara y obtendra los datos del usuario desde la consola y
        los almacenara en el arreglo previamente declarado
    */
    public static void menuPorcentaje(){
        /* Se verifica que la cantidad de datos ingresados no supere la
            la capacidad del arreglo */
        if(conteoPorcentajes < porcentajeExoneracion.length){
            mensaje("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            /* A traves de la funcion obteneOpcionConsola que recibe una 
                cadena la cual sera el mensaje que se muestre en la consola
                y devolvera el valor que ingresa el usuario. Se obtendra
                el promedio y porcentaje*/
            int promedio = obteneOpcionConsola("Ingrese el promedio a aplicar");
            int porcentaje = obteneOpcionConsola("Ingrese el porcentaje(Solo valores enteros)");

            /* Funcion confirmacionIngreso que devuelve un 0 o 1
                    - 1: Indica que el usuario si desea almaceanr los
                         datos ingresados
                    - 0: No se quiere almacenar lo datos 
            */
            int confirmacion = confirmacionIngreso();
            /* Se verifica si se quiere guardar los datos */
            if(confirmacion==1){
                /*  Se almacena en el arreglo porcentajeExoneracion
                    los datos ingresados
                        Indice 0 el promedio ingresado
                        Indice 1 el porcentaje ingresado*/
                porcentajeExoneracion[conteoPorcentajes][0] = promedio;
                porcentajeExoneracion[conteoPorcentajes][1] = porcentaje;
                /*  Se incrementa en uno el contador.
                    Al incrementarlo el contador tambien que listo el indice
                    para los siguientes datos a almacenar */
                conteoPorcentajes++;
                mensaje("Datos almacenados correctamente");
                /* Se ordenan los datos de mayor a menor  con respecto
                    al promediocon el objetivo de que sea mas facil 
                    poder buscar que porcentaje se le puede aplicar */
                ordenamientoBurbuja(porcentajeExoneracion);
            }
        }
        else mensaje("Ya no se tiene espacio disponible para almacenar datos");
    }

    /*
        Funcion utilizada como confirmacion para el usuario
        el podra elegir si lo quiere almacenar o cancelar
    */
    public static int confirmacionIngreso(){
        /* Mensajae de las opciones disponibles */
        mensaje("\n------------------------------------------------------");
        mensaje("Confirmar si desea guadar los datos");
        mensaje("\t0. Cancelar");
        mensaje("\t1. Aceptar");
        
        /* Se le asigna a la variable opcion el valor que obtenga
            de la funcion obteneOpcionConsola que devuelve el valor 
            ingresado a traves de la consola por el usuario */
        int opcion = obteneOpcionConsola("Ingrese el numero de la opcion");
        mensaje("------------------------------------------------------");
        /* Devolvera el valor ingresado por el usuario */
        return opcion;
    }

    /* 
        Metodo que muestra los datos del esudiante asi como el porcentaje
        de exoneracion aplicado al estudiante y cual sera el valor en puntos
        del examen.
        Tome como valor de punto para el final 25
    */
    public static void aplicarPorcejateExoneracion(){
        /* Se obtiene la cantidad de elementos del arreglo */
        int cantidadEst = infoEstudiantes.length;
        /* variable en la que se almacenara el valor del promedio
            del arreglo infoEstudiantes que se usara para buscar cual es
            el porcentaje a aplicar */
        int promedio = 0;
        /* Variable que almacenara el valor del porcentaje de exoneracion
            obtenido del arreglo porcentajeExoneracion*/
        int porcentaje = 0;

        /* Se recorrera y mostrara los datos del estudiante */
        for (int i = 0; i < cantidadEst; i++) {
            /* Al estar trabajando con un arreglo de tipo String para los
                datos de los estudiante se debe convertir el promedio
                de String a int y se almacena en la variable promedio
                El promedio se encuentra en la posicion 2(Indice 1)*/
            promedio = Integer.parseInt(infoEstudiantes[i][1]);
            /* A traves de la funcion buscarPorcentajeExoneracion que reciibe
                el promedio del estudiante devuenle cual es el porcentaje
                y se asigna a la variabel porcentaje */
            porcentaje = buscarPorcentajeExoneracion(promedio);
            /* Se imprimen en consola los datos del estudiante */
            System.out.print("El estudiante "+infoEstudiantes[i][0]);
            System.out.print(" tiene un promedio de "+infoEstudiantes[i][1]);
            /* Se imprimen en consola el porcentaje objetenido */
            System.out.print(" tiene un porcentaje de exoneracion de "+porcentaje);
            /* Se imprimen en consola el porcentaje de exoneracio aplicado
                se resta a la nota del examen final(25) el porcentaje obtenido
                por ejemplo:
                    si el porcentaje obtenido es 60 quedaria de la siguiente forma
                    25 - (25*60/100) = 10 
                Lo que indicaria que el estudiante ya tiene 15 puntos del final
                y ya solo 10 puntos valdria su final */
            System.out.print(" por lo tanto el final de 25 valdra "+(25-(25*porcentaje/100)+"\n"));
        }
    }
    
    /*
        Funcion que devuelve el porcentaje de exoneracion
        Recibe un parametro el cual es el promedio del estudiante
    */
    public static int buscarPorcentajeExoneracion(int promedio){
        /* Se obtiene el tamaño del arreglo */
        int cantidadPor = porcentajeExoneracion.length;
        /* Se recorre el arreglo de porcentajes */
        for (int j = 0; j < cantidadPor; j++) {
            /*
                Si el promedio del estudiante es mayor o igual que la primera
                posicion del arreglo de porcetajes el cual esta ordenado de 
                mayor a menor automaticamente devolvera ese valor
                Si no es mayor se analizara la siguiete posicion haste que
                cumpla la condicion
            */
            if(promedio>=porcentajeExoneracion[j][0])return porcentajeExoneracion[j][1];
        }
        /* Si se termina de recorrer el arreglo y no se encontro un posible
            valor devolvera 0 */
        return 0;
    }
    
    
    /* Metodo que ordena de mayor a menor el arreglo de los porcentajes */
    public static void ordenamientoBurbuja(int [][] arreglo){
        
        int tam = arreglo.length;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - i -1; j++) {
                
                if(arreglo[j][0]<arreglo[j+1][0]){
                    // Se cambia de posicion el valor del promedio
                    int tmp = arreglo[j+1][0];
                    arreglo[j+1][0] = arreglo[j][0];
                    arreglo[j][0] = tmp;
                    
                    // Se cambia de posicion el valor del porcentaje
                    tmp = arreglo[j+1][1];
                    arreglo[j+1][1] = arreglo[j][1];
                    arreglo[j][1] = tmp;
                }
            }
        }
        mostrarPorcentajes(arreglo);
    }
    
    /* Metodo que muestra el arreglo de porcentajes */
    public static void mostrarPorcentajes(int [][] arreglo){
        int tam = arreglo.length;
        for (int i = 0; i < tam; i++) {
            mensaje("Promedio: "+arreglo[i][0]+"  Porcentaje: "+arreglo[i][1]);
        }
    }
}
