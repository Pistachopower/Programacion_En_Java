/*
desarrollar un juego que ayude a mejorar el calculo mental de la suma, el jugador tendrá 
que introducir la solucion de la suma 
de dos numeros aleatorios comprendidos entre 1 y 100, mientras la solucion introducida 
sea correcta el juego continuará, en caso
contrario, el programa terminará y mostrara el numero de operaciones realizadas correctramente

ejemplo Math.random 
    comienza desde 0.9999 * 100= 9999 + 1 = (int) 100.95= 100
 */
package ejercicio_clase;

import java.util.Scanner;

public class Juego_Suma_Do_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatorio1, aleatorio2, resultado, solucion, numOperaciones;
        numOperaciones= 0;
        //(int) Math.random()*100+1;
        aleatorio1 = (int) (Math.random()*100+1);
        aleatorio2 = (int) (Math.random()*100+1);

        do {
            System.out.println("Introduce la solucion: ");
            System.out.print(aleatorio1);
            System.out.print(" + " + aleatorio2 + "= \n");
            solucion= aleatorio1 + aleatorio2;
            resultado= teclado.nextInt();
            numOperaciones++;

        } while (solucion == resultado);
        
        System.out.println("Has conseguido realizar : " + (numOperaciones -1) + " sumas consecutivas");
    }
}
