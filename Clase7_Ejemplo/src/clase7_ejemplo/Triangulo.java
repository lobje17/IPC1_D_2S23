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
public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(String nombre,int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        this.area = 0.5*base*altura;
    }
}
