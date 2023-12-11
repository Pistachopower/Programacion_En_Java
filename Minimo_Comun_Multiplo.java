/*
sacar el minimo comun multiplo de dos numeros
 */
package ejercicios_Libro;

import java.util.Scanner;

public class Minimo_Comun_Multiplo {
    public static void main(String[] args) {
               Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.println("Ingrese el primer número:");
        int a = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = teclado.nextInt();

        // Encontrar el máximo de a y b
        int max = Math.max(a, b);

        // Iniciar desde el máximo y buscar el primer múltiplo común
        int mcm = max;
        while (true) {
            if (mcm % a == 0 && mcm % b == 0) {
                // Encontramos el primer múltiplo común
                break;
            }
            // Incrementar el múltiplo actual
            mcm += max;
        }

        // Mostrar el resultado
        System.out.println("El Mínimo Común Múltiplo de " + a + " y " + b + " es: " + mcm);
    }
    
}
