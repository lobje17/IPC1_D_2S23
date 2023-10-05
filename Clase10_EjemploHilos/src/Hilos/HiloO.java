/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import javax.swing.JLabel;

/**
 *
 * @author lobje
 */
public class HiloO extends Hilo{

    public HiloO(JLabel actual, int tiempo, int posicionInicialX, int posicionFinalX, int posicionInicialY, int posicionFinalY) {
        super(actual, tiempo, posicionInicialX, posicionFinalX, posicionInicialY, posicionFinalY);
    }

    @Override
    public void moverse() {
        try {
            Thread.sleep(this.tiempo);
            if(posicionInicialX>posicionFinalX){
                this.actual.setBounds(this.posicionInicialX, posicionInicialY, dimension, dimension);
                this.posicionInicialX -= 1;
            }
            
            if(posicionInicialY<posicionFinalY){
                this.actual.setBounds(this.posicionInicialX, posicionInicialY, dimension, dimension);
                this.posicionInicialY += 1;
            }
            
            if (posicionInicialX<posicionFinalX && posicionInicialY>posicionFinalY) {
                this.stop();
            }
        } catch (Exception e) {
        }
    }
    
}
