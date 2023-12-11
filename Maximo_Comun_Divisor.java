/*
para dos numeros datos a y b es posible buscar el maximo comun divisor 
(el numero mas grande que divide a ambos) mediante un algoritmo ineficente 
pero sencillo: desde el menor de a y b, ir buscando de forma descreciente el primer numero
que divide a ambos simultaneamente. Realice un  programa que calcule el maximo comun divisor 
de dos numeros
 */
package ejercicios_Libro;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Maximo_Comun_Divisor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.println("Ingrese el primer número:");
        int a = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = teclado.nextInt();

        // Encontrar el mínimo de a y b
        int min = Math.min(a, b);

        // Buscar de forma descreciente el primer número que divide a ambos
        int mcd = 1;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
                break; // Salir del bucle cuando se encuentra el primer divisor común
            }
        }

        // Mostrar el resultado
        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
    }
}
