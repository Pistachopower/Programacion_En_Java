
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Num_Distintos_If {
    public static void main(String[] args) {
        //solicitar dos numero distintos y decir cual es el mayor
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int num1, num2;
        
        System.out.println("Introduce num 1: ");
        num1= teclado.nextInt();
        
        System.out.println("Introduce num 2: ");
        num2= teclado.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor ");
        } else {
            System.out.println(num2 + " es mayor ");

        }
        
        
    }
}
