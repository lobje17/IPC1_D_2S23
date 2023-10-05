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
public class Temporizador extends Thread{
    private int horas, minutos, segundo, num;
    private JLabel txtHoras, txtMinutos, txtSegundo;
    private boolean cont;

    public Temporizador(int num, int horas, int minutos, int segundo, JLabel txtHoras, JLabel txtMinutos, JLabel txtSegundo) {
        this.num = num;
        this.horas = horas;
        this.minutos = minutos;
        this.segundo = segundo;
        this.txtHoras = txtHoras;
        this.txtMinutos = txtMinutos;
        this.txtSegundo = txtSegundo;
        this.cont = true;
    }
    
    @Override
    public void run(){
        System.out.println("Iniciando temporizador");
        while(cont){
            temp();
        }
    }
    
    private void temp(){
        try {
            if(segDisponible() || minDisponible() || horaDisponible()){
                this.segundo--;
                Thread.sleep(100);
                
                if(segundo==-1 && (minDisponible() || horaDisponible())){
                    this.segundo = 59;
                    this.minutos--;

                    if(minutos==-1 && horaDisponible()){
                        this.minutos = 59;
                        this.horas--;
                    }
                }
                mostrarDatos();
                cargarDatos();
            }
            else cont = false;
        } catch (Exception e) {
        }
    }
    
    private boolean segDisponible(){
        return this.segundo > 0;
    }
    
    private boolean minDisponible(){
        return this.minutos > 0;
    }
    
    private boolean horaDisponible(){
        return this.horas > 0;
    }
    
    private void cargarDatos(){
        this.txtHoras.setText(getValor(this.horas));
        this.txtMinutos.setText(getValor(this.minutos));
        this.txtSegundo.setText(getValor(this.segundo));
    }
    
    private String getValor(int val){
        if(val<10) return "0"+val;
        return String.valueOf(val);
    }
    
    private void mostrarDatos(){
        System.out.println("Temp "+num +"  "+ getValor(horas)+" : "+getValor(minutos)+" : "+getValor(segundo));
    }
}
