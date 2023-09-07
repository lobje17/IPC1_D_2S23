/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Descuentos.ListDescuento;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lobje
 */
public class Texto {

    public Texto() {
    }
    
    public String Buscar(){
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
        jfc.setFileFilter(filtro);
        
        int resp = jfc.showOpenDialog(jfc);
        if(resp==JFileChooser.APPROVE_OPTION){
            return jfc.getSelectedFile().getPath();
        }
        return "";
    }
    
    public void cargarDescuentos(String path, ListDescuento lista){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = "";
            String contenido = "";
            
            while ((linea=br.readLine())!= null) {                
                contenido += linea+"\n";
            }
            br.close();
            fr.close();
            System.out.println(contenido);
            cargarDatos(contenido, lista);
        } catch (Exception e) {
        }
    }
    
    private void cargarDatos(String contenido, ListDescuento lista){
        String [] listado = contenido.split("\n");
        int cant = listado.length;
        int dias;
        int porcentaje;
        
        for (int i = 0; i < cant; i++) {
            String [] valores = listado[i].split(",");
            dias = convertNum(valores[0]);
            porcentaje = convertNum(valores[1]);
            System.out.println(valores[0]+" - "+valores[1]);
            lista.Agregar(dias, porcentaje);
        }
    }
    
    private int convertNum(String val){
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {
            System.out.println("Los campos de dias y porcentaje solo acepta valores enteros");
            return -1;
        }
    }
        
}
