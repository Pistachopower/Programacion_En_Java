/*
//Pediremos los IDs (números) de alumnos de dos clases, de 10 alumnos 
//cada una, álgebra y análisis. 
//Queremos mostrar todos los alumnos comunes en las dos asignaturas.
//Estos alumnos se guardarán en un tercer array y ése será el que se muestre. 
//También indicará el número de alumnos que se repiten.
//Usar una función para rellenar los arrays (álgebra y análisis).

*/
package programacion_secuencial;

import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class AlgebraAnaliticaComunes_Pseudocodigo_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = teclado.nextInt();

        int numAlumnosComunes = 0;

        System.out.println("Ingrese IDs de alumnos de Álgebra:");
        int idAlgebra;
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("ID del alumno " + (i + 1) + ":");
            idAlgebra = teclado.nextInt();

            System.out.println("Ingrese IDs de alumnos de Análisis:");
            int idAnalisis;
            for (int j = 0; j < cantidadAlumnos; j++) {
                System.out.println("ID del alumno " + (j + 1) + ":");
                idAnalisis = teclado.nextInt();

                if (idAlgebra == idAnalisis) {
                    System.out.println("ID: " + idAlgebra);
                    numAlumnosComunes++;
                }
            }
        }

        System.out.println("Número de alumnos que se repiten: " + numAlumnosComunes);
    }
}

