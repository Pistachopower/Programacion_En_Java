
package programacion_secuencial;
/*
//Crea dos arrays que tengan el mismo tamaño 
//(lo pedirá por teclado), en uno de ellos almacenarás nombres de personas 
//como cadenas, en el otro array irá almacenando la longitud de los 
//nombres, para ello puedes usar la función Longitud(cadena) que viene 
//en PseInt. Muestra por pantalla el nombre y la longitud que tiene. 
//Puedes usar funciones si lo deseas.
*/
import java.util.Scanner;

public class Nombre_Longitud_Pseudocodigo_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los arrays:");
        int tamanoArrays = teclado.nextInt();

        // Declarar variables
        String nombre;
        int longitud;

        // Llenar e imprimir los nombres y longitudes
        for (int i = 0; i < tamanoArrays; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ":");
            nombre = teclado.next();
            longitud = nombre.length();

            System.out.println("Nombre: " + nombre + ", Longitud: " + longitud);
        }
    }
}
