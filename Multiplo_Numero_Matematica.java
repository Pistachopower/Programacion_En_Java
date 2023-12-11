
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Multiplo_Numero_Matematica {
/*
solicitar dos numeros enteros y mostrar true si el segundo numero es multiplo del primero    
5 y 15 true
7 y 2 false
    
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int a, b;
        boolean desicion;
        
        System.out.println("num 1: ");
        a= teclado.nextInt();
        
        System.out.println("num 2: ");
        b= teclado.nextInt();

        desicion= a % b == 0; 
        
        System.out.println(desicion);

    }
}
