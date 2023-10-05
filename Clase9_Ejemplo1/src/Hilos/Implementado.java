/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author lobje
 */
public class Implementado implements Runnable{
    Thread hilo;
    
    public Implementado() {
    }

    @Override
    public void run() {
        System.out.println("Estamos en el hilo implementado");
        for (int i = 0; i < 100; i++) {
            System.out.println("implementado " + i);
        }
    }
    
    public void iniciaHilo(){
        this.hilo = new Thread(this);
        this.hilo.start();
    }
    
}
