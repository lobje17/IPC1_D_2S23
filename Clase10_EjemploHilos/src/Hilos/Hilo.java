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
public abstract class Hilo extends Thread{
    protected JLabel actual;
    
    protected int tiempo;
    protected int posicionInicialX;
    protected int posicionFinalX;
    protected int posicionInicialY;
    protected int posicionFinalY;
    protected int dimension;

    public Hilo(JLabel actual, int tiempo, int posicionInicialX, int posicionFinalX, int posicionInicialY, int posicionFinalY) {
        this.actual = actual;
        this.tiempo = tiempo;
        this.posicionInicialX = posicionInicialX;
        this.posicionFinalX = posicionFinalX;
        this.posicionInicialY = posicionInicialY;
        this.posicionFinalY = posicionFinalY;
        this.dimension = 100;
    }
    
    @Override
    public void run(){
        while (true) {            
            moverse();
        }
    }
    
    public abstract void moverse();
    
}
