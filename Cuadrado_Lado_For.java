/*
pedir un número real y mostrar la siguiente figura:
*****
*   *
*   *
*   *
*****

 */
package programacion_secuencial;

import java.util.Scanner;

public class Cuadrado_Lado_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce la altura del cuadrado: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 1; i <= numero - 2; i++) {
            System.out.print("*");

            for (int j = 1; j <= numero - 2; j++) {
                System.out.print("_");
            }

            System.out.print("*");
            System.out.println("");
        }

        for (int i = 1; i <= numero; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
