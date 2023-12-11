/*
solicitar 5 notas alumnos, comprobar entre 0 y  10 y decir al final si hay algún suspenso
HACERLO CON UN FOR Y QUE ME ITERE LAS 5 VECES
 */
package ejercicio_clase;

import java.util.Scanner;

public class Notas_Alumnos_Suspenso_Bandera_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean suspenso=false;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca nota de 0 a 10:");
            int notas= teclado.nextInt();
            
            if (notas < 5) {
                suspenso= true;
            }
        }
        
        if (suspenso) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
    }
}
