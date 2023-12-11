package programacion_secuencial;

import java.util.Scanner;

/*
//Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros números naturales
 */
public class Cuadrado9Naturales_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.println("introduce el numero ");
        valor = teclado.nextInt();

        for (int i = 1; i <= valor; i++) {
            System.out.println("El cuadrado de " + i + " es " + (Math.pow(i, 2)));
        }
    }
}
