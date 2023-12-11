/*
escribir un programa que pida la edad e indique 
si es mayor de edad o no con un operador lógico
*/

package ejercicio_clase;
import java.util.Scanner;

public class Edad_Booleano {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        boolean comprobacion;
        
        System.out.println("Indica tu edad: ");
        edad= teclado.nextInt();
        
        comprobacion= edad >= 18;
        
        System.out.println("Mayor de edad " + comprobacion);
        
        
    }

}
