/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author lobje
 */
public class Heredado extends Thread{
    
    
    public Heredado(){
        
    }
    
    @Override
    public void run(){
        System.out.println("Estamos en el hilo heredado");
        for (int i = 0; i < 100; i++) {
            System.out.println("heredado " + i);
        }
    }
}
