/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class DatosEnviados implements Serializable{
    
    public ListDescuento listDescuentos;
    public ListaUsuarios listUsuarios;
    public ListaVehiculo listVehiculos;

    public DatosEnviados() {
        this.listDescuentos = new ListDescuento();
        this.listUsuarios = new ListaUsuarios();
        this.listVehiculos = new ListaVehiculo();
    }    
}
