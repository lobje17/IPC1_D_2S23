package Clases;

import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaUsuarios {
    private ArrayList<Usuarios> listUsuarios;

    public ListaUsuarios() {
        listUsuarios = new ArrayList<>();
    }
    
    public boolean agregarUsuario(String nit, String nombre, String apellido){
        
        if(!existeUsuario(nit)){
//            Usuarios nuevo = new Usuarios(nit, nombre, apellido);
//            listUsuarios.add(nuevo);
            listUsuarios.add(new Usuarios(nit, nombre, apellido));
            return true; // "Se registro el usuario"
        }
        else return false; // "El usuario ya esta registrado"
    }
    
    public boolean loginOk(String nit){
        if(!existeUsuario(nit)) return true;
        
        mensaje("No existe un usuario con el nit "+nit);
        return false;
    }
    
    private boolean existeUsuario(String nit){
        int tam = listUsuarios.size();
        
        for (int i = 0; i < tam; i++) {
            if(listUsuarios.get(i).getNit().equals(nit)) return true;
        }
        return false;
    }
    
    public void mostrarUsuarios(){
        int tam = listUsuarios.size();
       for (int i = 0; i < tam; i++) {
            listUsuarios.get(i).mostrarDatos();
        } 
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
