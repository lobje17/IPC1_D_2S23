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
public class Reloj extends Thread{
    private int horas, minutos, segundo;
    private JLabel txtHoras, txtMinutos, txtSegundo;

    public Reloj(JLabel txtHoras, JLabel txtMinutos, JLabel txtSegundo) {
        this.horas = 0;
        this.minutos = 0;
        this.segundo = 0;
        this.txtHoras = txtHoras;
        this.txtMinutos = txtMinutos;
        this.txtSegundo = txtSegundo;
    }
    
    @Override
    public void run(){
        System.out.println("Iniciando cronometro");
        while(true){
            cronometro();
        }
    }
    
    private void cronometro(){
        try {
                this.segundo++;
                Thread.sleep(100);
                if(segundo==60){
                    this.segundo = 0;
                    this.minutos++;

                    if(minutos==60){
                        this.minutos = 0;
                        this.horas++;
                    }
                }
                System.out.println(horas+" : "+minutos+" : "+segundo);
                cargarDatos();
            
        } catch (Exception e) {
        }
    }
    private void cargarDatos(){
        this.txtHoras.setText(getValor(this.horas));
        this.txtMinutos.setText(getValor(this.minutos));
        this.txtSegundo.setText(getValor(this.segundo));
    }
    
    public String getValor(int val){
        if(val<10) return "0"+val;
        return String.valueOf(val);
    }
    
    public int[] getData(){
        int [] arr = {horas, minutos, segundo};
        return arr;
    }
}
