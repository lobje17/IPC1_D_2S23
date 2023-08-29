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
public class ListDescuento {
    
    private ArrayList<Descuento> listDescuento;

    public ListDescuento() {
        listDescuento = new ArrayList<>();
    }
    
    public void Agregar(int numDias, int porcentaje){
        if(!existeDescuento(numDias)){
            listDescuento.add(new Descuento(numDias, porcentaje));
            mensaje("Se registro el descuento");
        }
        else{
            mensaje("Ya existe un descuento para "+numDias+" dias");
        }
    }
    
    private boolean existeDescuento(int numDias){
        int tam = listDescuento.size();
        
        for (int i = 0; i < tam; i++) {
            if(listDescuento.get(i).getNumDias()==numDias) return true;
        }
        return false;
    }
    
    private int getDescuento(int numDias){
        int tam = listDescuento.size();
        
        for (int i = 0; i < tam; i++) {
            if(listDescuento.get(i).getNumDias()>=numDias) return listDescuento.get(i).getPorcentaje();
        }
        return 0;
    }
    
    public void mostrarDescuentos(){
        int tam = listDescuento.size();
        for (int i = 0; i < tam; i++) {
            listDescuento.get(i).MostrarDatos();
        } 
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
