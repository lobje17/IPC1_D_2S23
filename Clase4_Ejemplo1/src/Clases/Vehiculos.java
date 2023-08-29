/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author lobje
 */
public class Vehiculos {
    private String marca;
    private String linea;
    private int modelo;
    private String placa;
    private int costoDia;
    private boolean disponible;

    public Vehiculos(String marca, String linea, int modelo, String placa, int costoDia) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.placa = placa;
        this.costoDia = costoDia;
        this.disponible = true;
    }
    
    
    
    public void MostrarDatos(){
        System.out.print("Marca: "+marca);
        System.out.print("  Linea: "+linea);
        System.out.print("  Modelo: "+modelo);
        System.out.print("  Placa: "+placa);
        System.out.print("  Costo por dia: "+costoDia+"\n");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(int costoDia) {
        this.costoDia = costoDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
