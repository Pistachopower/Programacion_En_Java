/*
solicitar dos numeros y ver si son iguales y sino ver cual es el mayor
 */
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Num_Iguales_O_Mayor_If {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int num1, num2;

        System.out.println("Introduce num 1: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce num 2: ");
        num2 = teclado.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {

            if (num1 > num2) {
                System.out.println(num1 + " es mayor");
            } else {

                System.out.println(num2 + " es mayor");
            }

        }
    }
}
