/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaVehiculo {
    private ArrayList<Vehiculos> listVehiculo;

    public ListaVehiculo() {
        listVehiculo = new ArrayList<>();
    }
    
    public void Agregar(String marca, String linea, int modelo, String placa, int costoDia){
        if(!existeVehiculo(placa)){
            listVehiculo.add(new Vehiculos(marca, linea, modelo, placa, costoDia));
            mensaje("Se registro el vehiculo");
        }
        else{
            mensaje("El vehiculo con placa "+placa+" ya esta registrado");
        }
    }
    
    private boolean existeVehiculo(String placa){
        int tam = listVehiculo.size();
        
        for (int i = 0; i < tam; i++) {
            if(listVehiculo.get(i).getPlaca().equals(placa)) return true;
        }
        return false;
    }
    
    public void mostrarVehiculos(){
        int tam = listVehiculo.size();
       for (int i = 0; i < tam; i++) {
            listVehiculo.get(i).MostrarDatos();
        } 
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
