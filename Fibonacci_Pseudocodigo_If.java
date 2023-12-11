
package programacion_secuencial;
//Escribe una función en pseudocódigo que devuelva el término N (siendo N un número entero positivo) 
//de la serie de Fibonacci, esta sigue la siguiente serie: 1, 1, 2, 3, 5, 8, 13, 21? y así sucesivamente. 
//Date cuenta, que para obtener un numero, suma los dos números anteriores. 
//Por ejemplo, si introducimos un 3, la función nos devuelve el 2.
import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Fibonacci_Pseudocodigo_If {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de N para la serie de Fibonacci:");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            int a = 1;
            int b = 1;
            int resultado = 0;

            if (n == 1 || n == 2) {
                resultado = 1;
            } else {
                for (int i = 3; i <= n; i++) {
                    resultado = a + b;
                    a = b;
                    b = resultado;
                }
            }

            System.out.println("El término " + n + " de la serie de Fibonacci es: " + resultado);
        }
    }
}
