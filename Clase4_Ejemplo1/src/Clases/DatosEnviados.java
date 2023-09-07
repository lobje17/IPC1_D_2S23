/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Archivos.Binario;
import Clases.Descuentos.ListDescuento;
import Clases.Usuarios.ListaUsuarios;
import Clases.Vehiculos.ListaVehiculos;
import Clases.Vehiculos.Vehiculo;
import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class DatosEnviados implements Serializable{
    
    public ListDescuento listDescuentos;
    public ListaUsuarios listUsuarios;
    public ListaVehiculos listVehiculos;
    Binario binario;

    public DatosEnviados() {
        this.listDescuentos = new ListDescuento();
        this.listUsuarios = new ListaUsuarios();
        this.listVehiculos = new ListaVehiculos();
        this.binario = new Binario();
    }
    
    public Vehiculo getVehiculos(int i){
        return this.listVehiculos.getVehiculos(i);
    }
    
    public int cantidadVehiculos(){
        return this.listVehiculos.canticad();
    }
    
    public boolean almacenarDescuentosBin(){
        return this.binario.guardarDescuentos(this.listDescuentos);
    }
    
    public boolean almacenarVehiculosBin(){
        return this.binario.guardarVehiculos(this.listVehiculos);
    }
    
    public void obtenerDescuentos(){
        this.listDescuentos = this.binario.obtenerDescuentos();
    }
    
    public void obtenerVehiculos(){
        this.listVehiculos = this.binario.obtenerVehiculos();
    }
}
