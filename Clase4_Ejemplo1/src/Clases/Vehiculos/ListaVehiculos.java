/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Vehiculos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaVehiculos  implements Serializable{
    private ArrayList<Vehiculo> listVehiculo;

    public ListaVehiculos() {
        listVehiculo = new ArrayList<>();
    }
    
    public boolean Agregar(String marca, String linea, int modelo, String placa, int costoDia){
        if(existeVehiculo(placa))return false;
        
        listVehiculo.add(new Vehiculo(marca, linea, modelo, placa, costoDia));
        return true;
    }
    
    private boolean existeVehiculo(String placa){
        int tam = listVehiculo.size();
        
        for (int i = 0; i < tam; i++) {
            if(listVehiculo.get(i).getPlaca().equals(placa)) return true;
        }
        return false;
    }
    
    public Vehiculo getVehiculos(int i){
        return this.listVehiculo.get(i);
    }
    
    public int canticad(){
        return this.listVehiculo.size();
    }
}
