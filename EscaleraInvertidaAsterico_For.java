/*
//Algoritmo que lea un número entero y a partir de él 
//cree una escalera invertida de asteriscos con esa altura. 
// *****
//  ****
//   ***
//    **
//     *
 */
package programacion_secuencial;

import java.util.Scanner;

public class EscaleraInvertidaAsterico_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, asteriscos, espacios;

        System.out.println("Introduce altura: ");
        altura = teclado.nextInt();
        
        asteriscos= altura;
        espacios= 0;
        
        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= asteriscos; k++) {
                System.out.print("*");
            }
            
            asteriscos= asteriscos - 1;
            espacios= espacios + 1;
            System.out.println("");
        }
    }
}
