/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Usuarios;

import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class Usuario implements Serializable{
    private String nit;
    private String nombre;
    private String apellido;
    private int rol;
    private String password;

    public Usuario(String nit, String nombre, String apellido) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = 2;
        this.password = "1234";
    }

    public Usuario(String nit, String nombre, String apellido, int rol) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    public void mostrarDatos(){
        System.out.print("Nit "+nit);
        System.out.print("  Nombre "+nombre);
        System.out.print("  Apellido "+apellido+"\n");
    }
}
