
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

/**
solicita dos numeros enteros y mostrar true si ambos numeros son distintos entre si o 
* algunos de ellos es cero y false en caso contrario
 */
public class Numeros_Iguales_Matematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int a, b; 
        boolean decision;
        
        System.out.println("Introduce num 1: ");
        a= teclado.nextInt();
        
        System.out.println("Introduce num 2: ");
        b= teclado.nextInt();
        
         decision= (a != b) || (a == 0 || b == 0);
        
        System.out.println(decision);
        
    }
}
