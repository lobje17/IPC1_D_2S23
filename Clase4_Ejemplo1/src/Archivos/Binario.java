/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.ListDescuento;
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
    String descuentos;
    public Binario() {
        this.descuentos = "Archivos//Descuentos.bin";
    }
    
    public boolean guardar(ListDescuento lista){
        try {
            FileOutputStream fos = new FileOutputStream(descuentos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ListDescuento obtener(){
        ListDescuento lista = new ListDescuento();
        try {
            File f = new File(descuentos);
            if(f.exists()){
                FileInputStream fis = new FileInputStream(descuentos);
                ObjectInputStream ois = new ObjectInputStream(fis);
                lista = (ListDescuento) ois.readObject();
                ois.close();
                fis.close();
            }
            return lista;
        } catch (Exception e) {
            return lista;
        }
    }
    
}
