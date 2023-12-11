
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

/*
solicitar el numero a un usuario y mostrar su valor absoluto

*/

public class Valor_Absoluto_Ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int valor, valorAbsoluto;
        
          System.out.println("Introduce el valor absoluto: ");
         valor= teclado.nextInt(); 
         
         /*
         (-1 * valor) : con las leyes de los signos (+ . += + / - . - = - / + . - = -)
         cambia el valor de negativo a positivo y de positivo lo mantiene en positivo 
         
         
         */
         
         valorAbsoluto= (valor < 0) ? -1 * valor : valor;
         System.out.println(valorAbsoluto);
         
         
        
    }
}
