//Pedir por teclado el tamaño de un array de números enteros y pedir los 
//valores numéricos con los que se rellena. 
//Los valores no se pueden repetir. 
//Mostrar el array con los valores al final.
package programacion_secuencial;

import java.util.Scanner;

public class Num_Sin_Repetir_Pseudocodigo_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de iteraciones:");
        int cantidadIteraciones = teclado.nextInt();

        int ultimoValor = 0;

        for (int i = 0; i < cantidadIteraciones; i++) {
            int valor;

            do {
                System.out.println("Ingrese un valor:");
                valor = teclado.nextInt();

                // Verificar si el valor ya fue ingresado
                if (valor == ultimoValor) {
                    System.out.println("¡Valor repetido! Intente nuevamente.");
                }

            } while (valor == ultimoValor);  // Continuar el bucle si el valor ya fue ingresado

            // Actualizar el último valor ingresado
            ultimoValor = valor;
        }

        System.out.println("Valores ingresados:");
        System.out.println(ultimoValor);

    }
}
