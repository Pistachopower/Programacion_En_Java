/*
una aplicacion que pida al usuario un numero de 1 y 10 (el numero debe estar entre ese rango, sino pedirlo de nuevo)
y mostrar la tabla de multiplicar de dicho número 
 */
package ejercicio_clase;

import java.util.Scanner;

public class Tabla_Multiplicar_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce el número: ");
            numero = teclado.nextInt();
        } while (!(1 <= numero && numero <= 10));
        
          for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

    }
}
