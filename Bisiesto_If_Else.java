//Algoritmo que dado un año, nos diga si es bisiesto o no. 
//Un año es bisiesto bajo las siguientes condiciones:
//  - Un año divisible por 4 es bisiesto y no debe ser divisible entre 100. 
//- Si un año es divisible entre 100 y además es divisible entre 400, 
//también resulta bisiesto. 
package programacion_secuencial;

import java.util.Scanner;

public class Bisiesto_If_Else {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio;
        
        System.out.println("Introduce el año para determinar si es bisiesto o no: ");
        anio= teclado.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        }
        else {
            System.out.println("No es bisiesto");
        }
    }
}
