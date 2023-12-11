/*
pedir la edad y mostrar la edad que tendrá el proximo año
*/
package ejercicio_clase;

import java.util.Scanner;


public class Edad_Proximo_Anio_Matematica {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int edad;
        
        System.out.print("Introduce la edad: ");
        edad=teclado.nextInt();
        
        System.out.println("El año que viene tendrás " + (edad += 1) + " años. ");
        
    }
    
}
