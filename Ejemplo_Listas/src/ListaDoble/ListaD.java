/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author lobje
 */
public class ListaD {
    NodoD inicio;

    public ListaD() {
        this.inicio = null;
    }
    
    public void agregar(int valor){
        if(!existe(valor)){
            if(inicio==null){
                inicio = new NodoD(valor);
            }
            else{
                NodoD tmp = inicio;
                NodoD nuevo = new NodoD(valor);
                
                if(tmp.getValor()>valor){
                    nuevo.setNext(tmp);
                    inicio = nuevo;
                }
                
                while (tmp!=null) {
                    if(tmp.getValor()>valor){
                        nuevo.setNext(tmp);
                        nuevo.setBack(tmp.getBack());
                        if(tmp.getBack()!=null){
                            tmp.getBack().setNext(nuevo);
                        }
                        tmp.setBack(nuevo);
                        
                    }
                    tmp = tmp.getNext();
                }
            }
        }
    }
    
    
    private boolean existe(int valor){
        NodoD tmp = inicio;
        
        while (tmp!=null) {            
            if(tmp.getValor()== valor) return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    
    
    
    public void verDatos(){
        NodoD tmp = inicio;
        System.out.println("Lista doble ");
        while (tmp!=null) {            
            System.out.println("El valor es "+tmp.getValor());
            tmp = tmp.getNext();
        }
    }
}
