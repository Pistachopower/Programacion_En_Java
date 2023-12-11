/*
solicitar un numero y calcular y mostrar su factorial 
 */
package ejercicio_clase;

import java.util.Scanner;

public class Factorial_Numero_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int factorial= 1;

  
        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        while (numero <= 0) {
            System.out.println("Disculpe, el número debe ser mayor a 0");
            System.out.println("Introduce el número: ");
            numero = teclado.nextInt();
        }
        
        
        
        for (int i = numero; i > 0; i--) {
            System.out.println(i);
            //System.out.println(factorial  * i);
        }
        
    }
}
