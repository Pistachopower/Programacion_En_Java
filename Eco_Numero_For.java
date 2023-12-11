/*
implementa una aplicacion que pida al usuario un numero entero positivo y muestre por 
pantalla la cadena eco tantas veces como indique ese número 
 */
package ejercicio_clase;

import java.util.Scanner;

public class Eco_Numero_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digita el número para el eco: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        for (int i = 0; i < numero; i++) {
            System.out.println("ECO");
        }

    }
}
