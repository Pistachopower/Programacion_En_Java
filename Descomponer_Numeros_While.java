/*
Ejercicio 2:
Programa que solicite al usuario un número y positivo, y muestre cada una de 
sus cifras empezando por las unidades. Por ejemplo, si el número es 123, mostrará un 3, 
después un 2 y, por último, un 1.

    Fórmula para descomponer número 
        Obtener el número a la derecha
            num (123) mod 10= 3  
        
        Obtener las otras partes del número 
            num (123) / 10= 12,3
 */
package ejercicio_clase;

import java.util.Scanner;

public class Descomponer_Numeros_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, temporal;

        do {
            System.out.println("Digita el número: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        while (numero != 0) {
            temporal = (numero % 10);
            numero = (int) (numero / 10);
            System.out.println(temporal);
        }

    }
}
