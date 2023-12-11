/*
Solicitar dos números al usuario y mostrarlos ordenados de manera decreciente. 
Debes hacerlo de dos formas: usando el operador ternario, y usando if-else. 
Ambas en el mismo archivo, comentando la opción que no vayas a ejecutar en cada momento.
 */
package ejercicio_clase;

import java.util.Scanner;

public class Numeros_Decrecientes_TernarioIf {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        String result_Ter;

        System.out.println("Introduce el valor de A: ");
        a = teclado.nextInt(); //8

        System.out.println("Introduce el valor de A: ");
        b = teclado.nextInt(); //7

        while (a == b) {
            System.out.println("Disculpe, los valores son iguales");
            System.out.println("Introduce el valor de A: ");
            a = teclado.nextInt(); //8

            System.out.println("Introduce el valor de A: ");
            b = teclado.nextInt(); //7
        }
        
//        if (a > b) {
//            System.out.println(a + "," + b);
//        }
//        else {
//            System.out.println(b + "," + a);
//        }

        result_Ter = (a > b) ? a + "," + b : b + "," + a;

        System.out.println(result_Ter);
    }
}
