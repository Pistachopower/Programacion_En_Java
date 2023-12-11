/*
Teniendo en cuenta que la clave es "eureka", escribir un algoritmo que nos 
pida una clave. Sólo tenemos 3 intentos para acertar, si fallamos los 3 intentos 
nos mostrará un mensaje indicándonos que hemos agotado esos 3 intentos. 
(Recomiendo utilizar un interruptor). Si acertamos la clave, 
saldremos directamente del programa.
 */
package programacion_secuencial;

import java.util.Scanner;

public class Eureka_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String contrasena = "eureka";
        String valor_Usuario;
        boolean interruptor = false;
        int contador = 0;

        while ((contador < 3) && (interruptor == false)) {
            System.out.println("Introduce la clave: ");
            valor_Usuario = teclado.nextLine();

            if (contrasena.equalsIgnoreCase(valor_Usuario)) {
                interruptor = true;
            }

            contador++;
        }

        if (interruptor == true) {
            System.out.println("La contraseña es correcta. ");
        } else {
            System.out.println("Has agotado tus intentos. ");
        }
    }
}
