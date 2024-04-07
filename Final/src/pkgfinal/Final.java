/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.util.Arrays;

/**
 *
 * @author lobje
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Validado "+validar("79927398713"));
    }
    
    public static boolean validar(String numero) {
        int[] digitos = Arrays.stream(numero.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int suma = 0;
        for (int i = digitos.length - 1; i >= 0; i--) {
            int digito = digitos[i];

            if (i % 2 == 0) {
                digito *= 2;
            }

            if (digito > 9) {
                digito -= 9;
            }

            suma += digito;
        }
        System.out.println("Suma "+suma+" modulo "+((suma * 9) % 10)+" posicion 0 "+digitos[0]);
        return (suma * 9) % 10 == digitos[0];
    }
}
