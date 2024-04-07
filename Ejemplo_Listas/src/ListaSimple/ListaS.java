/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimple;

/**
 *
 * @author lobje
 */
public class ListaS {
    NodoS inicio;

    public ListaS() {
        this.inicio = null;
    }
    
    public void agregar(int valor){
        if(!existe(valor)){
            System.out.println("Valor "+valor);
            NodoS nuevo = new NodoS(valor);
            if(inicio==null) this.inicio = nuevo;
            else{
                NodoS primero = null;
                NodoS segundo = inicio;
                if(segundo.getNext()!=null)primero = inicio.getNext();
                System.out.println("66666666666666666666");
                if(segundo.getValor()>valor){
                    nuevo.setNext(segundo);
                    inicio = nuevo;
                }
                else{
                    boolean insertado = false;
                    while (primero!=null) {
                        System.out.println("Buscando datos");
                        if(primero.getValor()>valor){
                            nuevo.setNext(primero);
                            segundo.setNext(nuevo);
                            insertado = true;
                            break;
                        }
                        primero = primero.getNext();
                        segundo = segundo.getNext();
                    }
                    if(insertado) segundo.setNext(nuevo);
                }
            }
        }
        else{
            System.out.println("Ya existe el valor "+valor+" en la lista");
        }
    }
    
    private boolean existe(int valor){
        NodoS tmp = inicio;
        
        while (tmp!=null) {            
            if(tmp.getValor()== valor) return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    
    public void verDatos(){
        NodoS tmp = inicio;
        
        while (tmp!=null) {            
            System.out.println("El valor es "+tmp.getValor());
            tmp = tmp.getNext();
        }
    }
}
