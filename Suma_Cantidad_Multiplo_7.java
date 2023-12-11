/*
escribe un programa en que tome como entrada un numero entero e indique que cantidad hay 
que sumarle para que el resultado sea multiplo de 7. Un ejemplo, a 2 hay que sumarle 5 para
que el resultado (2+5= 7) sea multiplo de 7. A 13 hay que sumarle 1 para que el resultado 
(13+1=14) sea multiplo de 7. Si proporcionas el numero 2 o el 13, la salida de la aplicacion
debe ser 5 ó 1. El operador modulo puede ser muy util para solucionar esta actividad
 */
package ejercicios_Libro;

import java.util.Scanner;

public class Suma_Cantidad_Multiplo_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar un número entero
        System.out.println("Ingrese un número entero:");
        int numero = teclado.nextInt();

        // Calcular la cantidad que hay que sumar para que sea múltiplo de 7
        int cantidadASumar = 7 - (numero % 7);

        // Mostrar el resultado
        System.out.println("Para que " + numero + " sea múltiplo de 7, hay que sumarle: " + cantidadASumar);
    }
}
