/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_ejemplo1;

import Clases.DatosEnviados;
import Grafico.Principal;

/**
 *
 * @author lobje
 */
public class Clase4_Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Figura f1 = new Figura("Cuadro", 4);
//        Figura f2 = new Figura("Triangulo", 3);

//        ListaUsuarios listUser = new ListaUsuarios();
//        listUser.agregarUsuario(123456, "Salvador", "Lopez");
//        listUser.mostrarUsuarios();
//        listUser.agregarUsuario(123456, "Salvador", "Lopez");

        DatosEnviados datosEnviados = new DatosEnviados();
        //datosEnviados.listDescuentos.Agregar(3, 4)
        
        Principal p = new Principal();
        p.setVisible(true);
        p.recibirDatos(datosEnviados);
        
//        PrincipalAdmin admin = new PrincipalAdmin();
//        admin.setVisible(true);
//        admin.recibirDatos(datosEnviados);
        
        
    }
    
}
