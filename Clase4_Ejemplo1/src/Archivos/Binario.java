/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Descuentos.ListDescuento;
import Clases.Vehiculos.ListaVehiculos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lobje
 */
public class Binario {
    private String pathDescuentos;
    private String pathVehiculos;
    /* IMPORTACION DE CLASES PARA ESCRITURA */
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    /* IMPORTACION DE CLASES PARA LECTURA */
    private FileInputStream fis;
    private ObjectInputStream ois; 
    
    public Binario() {
        this.pathDescuentos = "Archivos//Descuentos.bin";
        this.pathVehiculos = "Archivos//Vehiculos.bin";
    }
    
    /* **********************************************************************
     * ***************************** DESCUENTOS *****************************
     * ********************************************************************** */
    public boolean guardarDescuentos(ListDescuento lista){
        try {
            fos = new FileOutputStream(pathDescuentos);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ListDescuento obtenerDescuentos(){
        ListDescuento lista;
        try {
            File f = new File(pathDescuentos);
            if(f.exists()){
                fis = new FileInputStream(pathDescuentos);
                ois = new ObjectInputStream(fis);
                lista = (ListDescuento) ois.readObject();
                ois.close();
                fis.close();
                return lista;
            }
            return new ListDescuento();
        } catch (Exception e) {
            return new ListDescuento();
        }
    }
    
    /* **********************************************************************
     * ***************************** VEHICULOS  *****************************
     * ********************************************************************** */
    public boolean guardarVehiculos(ListaVehiculos lista){
        try {
            fos = new FileOutputStream(pathVehiculos);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ListaVehiculos obtenerVehiculos(){
        try {
            File f = new File(pathVehiculos);
            if(f.exists()){
                fis = new FileInputStream(pathVehiculos);
                ois = new ObjectInputStream(fis);
                ListaVehiculos lista = (ListaVehiculos) ois.readObject();
                ois.close();
                fis.close();
                return lista;
            }
            return new ListaVehiculos();
        } catch (Exception e) {
            return new ListaVehiculos();
        }
    }
    
}
