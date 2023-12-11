
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

/*

solicitar dos numero enteros y decir si son iguales o no
*/
public class Verificar_Dos_Numero_Iguales_If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int num1, num2;
        
        System.out.println("Introduce num 1: ");
        num1= teclado.nextInt();
        
        System.out.println("Introduce num 2: ");
        num2= teclado.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");

        }
        
    }
}
