
package programacion_secuencial;

import java.util.Scanner;

public class Valor_Absoluto_Ejer_Clase_Ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, valorAbsoluto;
        
        System.out.print("Introduce el valor absoluto: ");
        num= teclado.nextInt();
        
        /*
         (-1 * valor) : con las leyes de los signos (+ . += + / - . - = - / + . - = -)
         cambia el valor de negativo a positivo y de positivo lo mantiene en positivo
         */
        
        valorAbsoluto= (num < 0) ? -1 * num: num; 
        
        System.out.println("El valor absoluto es " + valorAbsoluto);
        
        
    }
}
