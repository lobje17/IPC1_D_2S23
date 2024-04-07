/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author lobje
 */
public class NodoD {
    
    private int valor;
    private NodoD next;
    private NodoD back;

    public NodoD(int valor) {
        this.valor = valor;
        this.next = null;
        this.back = null;
    }
    
    public NodoD(int valor, NodoD next, NodoD back) {
        this.valor = valor;
        this.next = next;
        this.back = back;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoD getNext() {
        return next;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }

    public NodoD getBack() {
        return back;
    }

    public void setBack(NodoD back) {
        this.back = back;
    }
    
        
}
