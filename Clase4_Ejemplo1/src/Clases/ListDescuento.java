/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lobje
 */
public class ListDescuento  implements Serializable{
    
    private ArrayList<Descuento> listDescuento;

    public ListDescuento() {
        this.listDescuento = new ArrayList<>();
    }
    
    public boolean Agregar(int numDias, int porcentaje){
        if(!existeDescuento(numDias)){
            listDescuento.add(new Descuento(numDias, porcentaje));
            mensaje("Se registro el descuento");
            return true;
        }
        else{
            mensaje("Ya existe un descuento para "+numDias+" dias");
            return false;
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
    
    public void ordenarDescuento(){
        Collections.sort(listDescuento);
    }
    
    public int cantidad(){
        return this.listDescuento.size();
    }
    
    public Descuento getElemento(int i){
        return this.listDescuento.get(i);
    }
}
