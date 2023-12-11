/*
implementa una aplicacion que pida al usuario un numero entero positivo y muestre por 
pantalla de 1 hasta ese número
 */
package ejercicio_clase;

import java.util.Scanner;

public class De_Uno_A_N_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digita el número: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
