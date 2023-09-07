/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class DataSetGrafica {
    
    ListaVehiculos lista;
    ArrayList<DataSetValor> datos;

    public DataSetGrafica(ListaVehiculos lista) {
        this.lista = lista;
        this.datos = new ArrayList<>();
    }
    
    public void calcularDatos(){
        /* CANTIDAD DE ELEMENTOS REGISTRADOS */
        int cantida = lista.canticad();
        /* CANTIDAD DE DATOS ALMACENADOS EN EL DATASET
            PARA LA GRAFICA */
        int cantidaDatos;
        
        Vehiculo v;
        boolean agregado;
        /* RECORRE LA LISTA DE VEHICULOS */
        for (int i = 0; i < cantida; i++) {            
            v = lista.getVehiculos(i);
            agregado = false;
            /* RECORRE LA LISTA DE DATASET */
            cantidaDatos = datos.size();
            for (int j = 0; j < cantidaDatos; j++) {
                /* VERIFICA SI ES EL MISMO MODELO */
                if(datos.get(j).mismoModelo(v.getModelo())) {
                    agregado = true;
                    break;
                }
            }
            
            if(!agregado) datos.add(new DataSetValor(v.getModelo()));
        }
        System.out.println("Grafica generada");
    }
    
    public int cantidad(){
        return this.datos.size();
    }
    
    public DataSetValor getVal(int i){
        return this.datos.get(i);
    }
}
