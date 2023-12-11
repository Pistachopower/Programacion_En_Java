/*
// Escribe 
// el área de un círculo dado su radio. 

 */
package programacion_secuencial;

import java.util.Locale;
import java.util.Scanner;

public class Area_Circulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double radio, area_Circulo;
        
        System.out.println("Introduce el radio: ");
        radio = teclado.nextDouble();

        area_Circulo =  Math.PI *  Math.pow(radio, 2);

        System.out.printf("El área del círculo es:  %.2f\n",area_Circulo );

    }
}
