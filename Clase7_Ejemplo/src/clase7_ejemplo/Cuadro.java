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
public class Cuadro extends Figura{
    private int lado;
    public Cuadro(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public void getArea() {
        this.area = lado * lado;
    }
}
