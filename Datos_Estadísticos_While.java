/*
 - Programa para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades 
introducidas, la media, el número de alumnos y cuántos son mayores de edad.
 */
package ejercicio_clase;

import java.util.Scanner;

public class Datos_Estadísticos_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad, sum_Edades, num_Alum, num_Mayor_Edad;
       
        sum_Edades= 0;
        num_Alum=0;
        num_Mayor_Edad=0;
        
        System.out.println("edad: ");
        edad = teclado.nextInt(); //17

        while (edad != -1) {
            //sumamos las edades 
            sum_Edades= sum_Edades + edad; //17,24,27
            System.out.println(sum_Edades);
            
            //contamos num alumnos
            num_Alum= num_Alum + 1; //1, 2,3
            
            if (edad >= 18) {
                num_Mayor_Edad= num_Mayor_Edad + 1;
            }
            
            System.out.println("edad: "); //7,3
            edad = teclado.nextInt();
        }
        System.out.println("suma edades " + sum_Edades);
        System.out.println( "La media es " + (((double)(sum_Edades / num_Alum))));
        System.out.println("numero alumnos " + num_Alum);
        System.out.println("alumnos mayores de edad " + num_Mayor_Edad);
    }
}
