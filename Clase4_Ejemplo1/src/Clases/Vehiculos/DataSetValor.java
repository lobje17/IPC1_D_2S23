/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Vehiculos;

/**
 *
 * @author lobje
 */
public class DataSetValor {
    public int modelo;
    int contador;

    public DataSetValor(int modelo) {
        this.modelo = modelo;
        this.contador = 1;
    }
    
    public void incrementar(){
        this.contador++;
    }
    
    public boolean mismoModelo(int modelo){
        boolean ok = this.modelo == modelo;
        if(ok) incrementar();
        return ok;
    }
    
    public int getPorcentaje(int total){
        return 100*this.contador/total;
    }
}
