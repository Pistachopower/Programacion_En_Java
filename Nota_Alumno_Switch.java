
package ejercicio_clase;

import java.util.Scanner;
/*
pedir la calificacion y mostrar la nota que tiene el alumno

CORREGIR QUE NO TE CUENTE LOS VALORES NULOS EN LA PEDIDA DE NOTA 
*/

public class Nota_Alumno_Switch {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int nota_Alumno;
        String calificacion= "";
        
        System.out.println("Introduce la nota ");
        nota_Alumno= teclado.nextInt();
        
        switch (nota_Alumno) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            //case 1,2,3,4 -> usa la flecha para sustituir el break en otras versiones    
                calificacion= "Insuficiente";
               
                break;
                
            case 5:
                calificacion= "Suficiente";
                break;
            case 6:
               calificacion= "Bien";
                break;
            case 7:
                calificacion="Notable";
                break;
            case 8:
                calificacion= "Notable";
                break;
            case 9:
                calificacion="Sobresaliente";
                break;
            case 10:
                calificacion="Sobresaliente";
                break;
                
            default:
                //throw new AssertionError("Nota incorrecta");
                System.out.println("Nota incorrecta" + calificacion);
                break;
                
                
        }
        System.out.println("La calificacion es: " + calificacion);
    }
}
