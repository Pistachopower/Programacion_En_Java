/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota= 4) y suspenso
 */
package ejercicio_clase;

import java.util.Scanner;

public class Notas_6_Aprobados_Condicionados_Suspensos_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados=0, suspensos=0,condicionados=0; 

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduzca nota de 0 a 10:");
            int notas = teclado.nextInt();

            if (notas == 4) {
                condicionados++;
            } else if (notas >= 5) {
                aprobados++;
            } else if (notas < 4) {
                suspensos++;
            }
        }
        
        System.out.println("Aprobados " + aprobados);
        System.out.println("Suspensos " + suspensos);
        System.out.println("Condicionados " + condicionados);
    }
}
