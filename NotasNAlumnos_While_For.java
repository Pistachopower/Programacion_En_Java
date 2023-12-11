// Calcular la nota de N alumnos, introduciendo su nota teórica (60%) y 
//su nota practica (40%). Mostrarlo por pantalla. 
//Se debe comprobar que los datos introducidos por el usuario (nº alumnos y notas) 
//sean valores válidos, volviéndolos a pedir en caso contrario.
package programacion_secuencial;

import java.util.Locale;
import java.util.Scanner;

public class NotasNAlumnos_While_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        
        int N_alumnos;
        double n_Teorica, n_Practica,F_N_Teorica, F_N_Practica,nota_Final ;

        System.out.println("Introduce el total de los alumnos ");
        N_alumnos = teclado.nextInt();

        while (N_alumnos <= 0) {
            System.out.println("Debes colocar en total alumnos un número mayor a 0 ");
            System.out.println("Introduce el total de los alumnos ");
            N_alumnos = teclado.nextInt();
        }
        //3
        for (int alumno = 1; alumno <= N_alumnos; alumno++) {
            System.out.println("Introduce la nota teorica del alumno " + alumno);
            n_Teorica = teclado.nextDouble();

            System.out.println("Introduce la nota practica del alumno " + alumno);
            n_Practica = teclado.nextDouble();

            //5 6
            while (n_Teorica < 0 || n_Practica < 0) {
                System.out.println("Debes colocar las notas mayores o iguales que 0 ");

                System.out.println("Introduce la nota teorica del alumno " + alumno);
                n_Teorica = teclado.nextDouble();

                System.out.println("Introduce la nota practica del alumno " + alumno);
                n_Practica = teclado.nextDouble();
            }
            
            //sacamos el porcentaje de la nota teorica y practica 
            F_N_Teorica= n_Teorica * 0.60;
            F_N_Practica= n_Practica * 0.40;
            nota_Final= F_N_Teorica + F_N_Practica;
            
            System.out.printf("La nota final del alumno %d es %.2f%n", alumno, nota_Final);
        }
    }
}
