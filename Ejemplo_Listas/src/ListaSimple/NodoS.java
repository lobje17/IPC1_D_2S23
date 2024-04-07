/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimple;

/**
 *
 * @author lobje
 */
public class NodoS {
    private int valor;
    private NodoS next;

    public NodoS(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoS getNext() {
        return next;
    }

    public void setNext(NodoS next) {
        this.next = next;
    }
}
