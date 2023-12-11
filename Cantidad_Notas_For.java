/*
solicitar 6 notas entre 0 y 10 y escribir la cantidad de alumnos aprobados, condicionamos (4) y suspensos (3,2,1,0)
 */
package ejercicio_clase;

import java.util.Scanner;

public class Cantidad_Notas_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        int total_Notas = 6;
        int suspensos = 0, condicionados = 0, aprobados = 0;

        for (int i = 1; i <= total_Notas; i++) {
            //controlamos que esté dentro del rango
            do {
                System.out.println("Introduce la nota " + i + ":");
                nota = teclado.nextInt();
            } while (!(0 <= nota && nota <= 10));

            if (nota <= 0 || nota <= 3) {
                suspensos = suspensos + 1;
                //System.out.println("suspenso " + suspensos);  
            }
            if (nota == 4) {
                condicionados = condicionados + 1;
                //System.out.println("condicionado " + condicionados);  
            }
            if (nota >= 5 && nota <= 10) {
                aprobados += 1;
                //System.out.println("aprobado " + aprobados);
            }
        }

        System.out.println("Total de aprobados: " + aprobados);
        System.out.println("Total de condicionados: " + condicionados);
        System.out.println("Total de suspensos: " + suspensos);

    }

}
