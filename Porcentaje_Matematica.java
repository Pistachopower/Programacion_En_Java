//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual. Diseñar un algoritmo para este propósito
package programacion_secuencial;

import java.util.Scanner;

public class Porcentaje_Matematica {
    public static void main(String[] args) {
        int ninos, ninas, porcentaje_ninios,porcentaje_ninias ;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("total niños ");
        ninos= teclado.nextInt();
        
        System.out.println("total niñas ");
        ninas= teclado.nextInt();
        
        porcentaje_ninios= ((ninos * 100) / (ninos + ninas));
        porcentaje_ninias= 100 - porcentaje_ninios;
        
        System.out.println("Del total de " + (ninos + ninas) + " hay " + porcentaje_ninios + " niños ");
        System.out.println("Del total de " + (ninos + ninas) + " hay " + porcentaje_ninias + " niñas ");
        
    }
    
}
