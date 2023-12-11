/*
un programa que solicite un numero N entero positivo y nos diga cuantos números 
hay entre 1 y N y decir cuáles son primo

es primo si es divisible por si mismo y por 1
 */
package ejercicio_clase;

import java.util.Scanner;

public class N_Primo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        // Bandera que se pondrá a true si se encuentra algún valor por el que sea divisible un número distinto de 1 o del propio número
        boolean noPrimo = false;
        int j;

        // Solicitamos al usuario el número tantas veces como sea necesario hasta que se introduzca un valor positivo
        do {
            System.out.println("Introduce un número entero y positivo");
            num = teclado.nextInt();
        } while (num <= 0);

        System.out.println("Los primos entre 1 y " + num + " son:");
        // El número 1 es primo, así que siempre saldrá en la lista 
        System.out.println("1 es primo");

        // Bucle externo que recorre los números entre 2 y num (el 1 ya lo hemos mostrado por eso empezamos en 2)
        for (int i = 2; i <= num; i++) {
            
            j = 2;
            //va de 2 hasta num - 1
            while (j <= (i - 1) && noPrimo == false) {
                //si i modulo j da 0 no es primo
                
                
                if (i % j == 0) {
                    noPrimo = true;
                }
                
                j++;
            }
            if (noPrimo == false) {
                System.out.println(i + " es primo");
            }
            // Reseteamos la bandera para la comprobación del siguiente valor de i
            noPrimo = false;
        }
    }

}
