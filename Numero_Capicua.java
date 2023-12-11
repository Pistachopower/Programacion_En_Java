/*
escribe una aplicacion que solicite al usuario un numero comprendido entre 0 y 9999. La 
aplicacion tendra que indicar si el numero introducido es capicua

161
1881
 */
package ejercicios_Libro;

import java.util.Scanner;

public class Numero_Capicua {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        while ((numero < 0) || (numero > 9999)) {
            System.out.println("Disculpe, el numero debe ser mayor a 0 o menor a 9999");
            System.out.println("Introduce el número: ");
            numero = teclado.nextInt();
        }

        int reversed = 0;
        int remainder;
        int original = numero;
        
        while (numero != 0) {
            remainder = numero % 10;
            reversed = reversed * 10 + remainder;
            numero /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " es un número capicúa.");
        } else {
            System.out.println(original + " no es un número capicúa.");
        }

    }
}
