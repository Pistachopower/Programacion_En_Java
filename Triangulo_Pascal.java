/*
dibuje el triangulo de pascal, para n filas. Numerando las filas 
y elementos desde 0.

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
package ejercicios_Libro;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Triangulo_Pascal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //5

        // Solicitar al usuario ingresar el número de filas
        System.out.println("Ingrese el número de filas para el Triángulo de Pascal:");
        int numFilas = teclado.nextInt();

        // Imprimir el Triángulo de Pascal
        for (int i = 0; i < numFilas; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficiente + " ");
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
