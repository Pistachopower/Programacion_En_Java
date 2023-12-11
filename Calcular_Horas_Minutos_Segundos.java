/*
solicita al usuario que introduzca una cantidad de segundos . EL programa debe mostrar cuantas horas, minutos, segundos 
hay en el numero de segundos introducidos por el usuario
 */
package ejercicios_Libro;

import java.util.Scanner;


public class Calcular_Horas_Minutos_Segundos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar la cantidad de segundos
        System.out.println("Ingrese la cantidad de segundos:");
        int segundos = teclado.nextInt();

        // Calcular horas, minutos y segundos
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        // Mostrar resultados
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosRestantes);
    }
}
