package ejercicios_Libro;

import java.util.Scanner;

/*
un economista te ha encargado un programa para realizar calculos con el iva. La aplicacion debe solicitar 
la base imponible y el iva que se debe aplicar. Muestra por pantalla el importe correspondiente al iva y al total
 */
public class Economista_Iva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar la base imponible
        System.out.println("Ingrese la base imponible:");
        double baseImponible = teclado.nextDouble();

        // Solicitar el porcentaje de IVA
        System.out.println("Ingrese el porcentaje de IVA:");
        double porcentajeIVA = teclado.nextDouble();

        // Calcular el importe de IVA y el total
        double importeIVA = (baseImponible * porcentajeIVA) / 100;
        double total = baseImponible + importeIVA;

        // Mostrar resultados
        System.out.println("Importe de IVA: " + importeIVA);
        System.out.println("Total con IVA: " + total);
    }
}
