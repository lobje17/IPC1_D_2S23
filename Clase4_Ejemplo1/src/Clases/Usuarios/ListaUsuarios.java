package Clases.Usuarios;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lobje
 */
public class ListaUsuarios  implements Serializable{
    private ArrayList<Usuario> listUsuarios;

    public ListaUsuarios() {
        listUsuarios = new ArrayList<>();
        listUsuarios.add(new Usuario("a", "a", "a", 1));
    }
    
    public boolean agregarUsuario(String nit, String nombre, String apellido){
        
        if(!existeUsuario(nit)){
//            Usuario nuevo = new Usuario(nit, nombre, apellido);
//            listUsuarios.add(nuevo);
            listUsuarios.add(new Usuario(nit, nombre, apellido));
            return true; // "Se registro el usuario"
        }
        else return false; // "El usuario ya esta registrado"
    }
    
    public int loginOk(String nit, String nombre){
        /*
            1 = Todos los datos estan correcto
            2 = El nit no existe
            3 = El nombre no concide
        */
        Usuario user = existeUsuarioLogin(nit);
        if(user!=null) {
            if(user.getNombre().equals(nombre)) return user.getRol();
            return 4;
        }
        return 3;
    }
    
    private boolean existeUsuario(String nit){
        int tam = listUsuarios.size();
        
        for (int i = 0; i < tam; i++) {
            if(listUsuarios.get(i).getNit().equals(nit)) return true;
        }
        return false;
    }
    
    private Usuario existeUsuarioLogin(String nit){
        int tam = listUsuarios.size();
        
        for (int i = 0; i < tam; i++) {
            if(listUsuarios.get(i).getNit().equals(nit)) return listUsuarios.get(i);
        }
        return null;
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
