/*
escribir todos los multiplos de 7 menores que 100

 */
package ejercicio_clase;

import java.util.Scanner;

public class Multiplos_7_Menores_100 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digita el número: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

       // for (int i = 0; i < numero; i++) {
        for (int i = 0; i < numero; i+=7) {
            System.out.println(i);
//            if (i % 7 == 0) {
//                System.out.println("Multiplo de 7 " + (i));
//            }
        }
    }
}
