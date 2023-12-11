/*
escribir un programa que pida edad máxima y minima de un grupo de alumnos. 
El usuario ira introduciendo las edades e indicara que ha terminado escribiendo un -1
 */
package ejercicio_clase;

import java.util.Scanner;

public class Edad_Minima_Maxima_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, maximo, minimo, suma, contador, aleatorio;
        suma = 0;
        contador = 0;

        System.out.println("Introduce un número entero. -1 para terminar");
        num = teclado.nextInt();

        minimo = num;
        maximo = num;

        while (num != -1) {
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }
            suma = suma + num;
            contador = contador + 1; //1,2,3

            System.out.println("Introduce un número entero. -1 para terminar");
            num = teclado.nextInt();
        }
        
        System.out.println("El maximo es " + maximo);
        System.out.println("El minimo es " + minimo);
        System.out.println("");

    }
}
