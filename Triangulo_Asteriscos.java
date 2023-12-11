/*
solicita al usuario un numero n y dibuja un triangulo de base y altura n, de la 
forma (para n igual a 4)
 */
package ejercicios_Libro;

import java.util.Scanner;

public class Triangulo_Asteriscos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar un número n
        System.out.println("Ingrese un número para la base y altura del triángulo:");
        int n = teclado.nextInt();

        // Dibujar el triángulo
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Imprimir números ascendentes
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Imprimir números descendentes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Ir a la siguiente línea
            System.out.println();
        }
    }
}
