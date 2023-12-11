/*
pedir un número real y mostrar la siguiente figura:
____*
___***
__*****
_*******
*********

 */
package programacion_secuencial;

import java.util.Scanner;

public class Ejercicio_Piramide_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, contador_astericos, contador_Espacio;

        System.out.println("Introduce la altura del cuadrado: ");
        altura = teclado.nextInt();

        contador_astericos = 1;
        contador_Espacio = altura - 1;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= contador_Espacio; j++) {
                System.out.print("_");
            }

            for (int k = 1; k <= contador_astericos; k++) {
                System.out.print("*");
            }
                    
            contador_astericos= contador_astericos + 2;
            contador_Espacio= contador_Espacio - 1;
            System.out.println("");
        }

    }
}
