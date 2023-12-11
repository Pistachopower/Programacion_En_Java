/*
escribir un programa que pida una hora de la siguiente forma: hora, minutos, segundos.
El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual [10:41:59] -> hora actual + 1 segundo: [10:42:00]
 */
package ejercicios_Libro;

import java.util.Scanner;

public class Sumar_Horas_Minutos_Segundos {

    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        int hora=0, minutos=0, segundos=0;

        System.out.println("Hora: ");
        hora = teclado.nextInt();

        while ((hora < 0) || (hora > 23)) {
            System.out.println("Disculpe, la hora debe tener un número positivo");
            System.out.println("Introduce la hora: ");
            hora = teclado.nextInt();
        }

        System.out.println("Minutos: ");
        minutos = teclado.nextInt();

        while ((minutos < 0) || ( minutos > 59)) {
            System.out.println("Disculpe, los minutos deben tener un número positivo");
            System.out.println("Introduce los minutos: ");
            hora = teclado.nextInt();
        }

        System.out.println("Segundos: ");
        segundos = teclado.nextInt();
        
        while ((segundos < 0) || ( segundos > 59)) {
            System.out.println("Disculpe, los segundos deben tener un número positivo");
            System.out.println("Introduce los segundos: ");
            segundos = teclado.nextInt();
        }

        segundos += 1;

        if (segundos > 59) {
            segundos = 0;
            minutos += 1;

            if (minutos > 59) {
                minutos = 0;
                hora += 1;

                if (hora > 24) {
                    hora = 0;
                }
            }
        }
        
        /*
        %02d significa que queremos imprimir un número entero (d significa “decimal”, que es un 
        número entero en este contexto) con al menos 2 dígitos (02). Si el número tiene menos de 2 
        dígitos, se rellena con ceros a la izquierda.
        */
        System.out.printf("Hora: %02d:%02d:%02d\n", hora, minutos, segundos);
        
        
    }
}
