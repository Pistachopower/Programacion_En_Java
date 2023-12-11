/*
// Calcular y mostrar la suma de los números múltiplos de 3
//comprendidos entre dos números solicitados al usuario. Supondremos que el
//primer número introducido será menor que el segundo.
 */
package programacion_secuencial;

import java.util.Scanner;

public class Multiplo_Dos_Numeros_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;
        suma= 0;
        
        System.out.println("Introduce el primer número: ");
        num1= teclado.nextInt();
        
        System.out.println("Introduce el segundo número:");
        num2= teclado.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                suma+=i;
            }
        }
        
        System.out.println("La suma de los múltiplos de 3 es: " + suma);
        
    }
}
