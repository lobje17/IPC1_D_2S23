/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Descuentos;

import java.io.Serializable;

/**
 *
 * @author lobje
 */
public class Descuento implements Comparable<Descuento>, Serializable{
    private int numDias;
    private int porcentaje;

    public Descuento(int numDias, int porcentaje) {
        this.numDias = numDias;
        this.porcentaje = porcentaje;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void MostrarDatos(){
        System.out.print("Numero de dias: "+numDias);
        System.out.print("  Porcentaje de descuento: "+porcentaje+"\n");
    }

    @Override
    public int compareTo(Descuento desc) {
        return Integer.compare(this.numDias, desc.getNumDias());
    }
}
