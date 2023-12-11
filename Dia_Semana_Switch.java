/*
idear un programa que solicite al usuario un numero comprendido entre 1 y 7, 
correspondiente a un dia de la semana. Se debe mostrar el nombre del dia de la semana 
al que corresponde. Por ejemplo, el número 1 corresponde a Lunes y el 6 a Sábado 
 */
package ejercicio_clase;

import java.util.Scanner;

public class Dia_Semana_Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;
        
        System.out.println("Introduce el dia:");
        dia= teclado.nextInt();

        //controlamos que los valores estén en el rango correcto 
        while (dia <= 0 || dia >= 8 ) {
            System.out.println("Disculpe, el dia debe ser mayor a 0 y menor a 8");
            System.out.println("¿Introduce el dia: ");
            dia = teclado.nextInt();
        }
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }
    }
}
