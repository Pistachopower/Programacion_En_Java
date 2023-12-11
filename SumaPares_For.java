// Se pide representar el algoritmo que nos calcule la suma de los 
//N primeros números pares. Es decir, si insertamos un 5, 
//nos haga la suma de 2+4+6+8+10.
package programacion_secuencial;

import java.util.Scanner;

public class SumaPares_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma;
        suma= 0;

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                suma= suma + i;
            }
        
        }
        
        System.out.println("El total de la suma de los números pares de " + numero + " es: " +  suma);
    }
}
