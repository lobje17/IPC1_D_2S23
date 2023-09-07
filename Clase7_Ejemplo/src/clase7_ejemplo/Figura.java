/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7_ejemplo;

/**
 *
 * @author lobje
 */
public abstract class Figura{
    String nombre;
    double area;
    double perimetro;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarArea(){
        getArea();
        System.out.println("El area del "+nombre+" es "+area);
    }
    
    public abstract void getArea();
}
