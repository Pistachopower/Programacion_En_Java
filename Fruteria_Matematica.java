/*
Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
Por este motivo, es necesario diseñar un programa que solicite las ventas (en kilos) de cada 
semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del 
kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
*/
package ejercicio_clase;

import java.util.Scanner;

public class Fruteria_Matematica {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
         final double PRECIO_MANZANA= 2.35;
         final double PRECIO_PERA= 1.95;
         double ventas_Manzana_Primer_S, ventas_Manzana_Segundo_S, ventas_Peras_Primer_S, ventas_Peras_Segundo_S, suma_M, suma_P,
                 importe_Total;
         
         System.out.println("Introduce las ventas de manzanas del primer semestre: ");
         ventas_Manzana_Primer_S= teclado.nextInt(); //1000
         
         System.out.println("Introduce las ventas de manzanas del segundo semestre: ");
         ventas_Manzana_Segundo_S= teclado.nextInt(); //1200
         
         System.out.println("Introduce las ventas de peras del primer semestre: ");
         ventas_Peras_Primer_S= teclado.nextInt(); //800
         
         System.out.println("Introduce las ventas de peras del segundo semestre: ");
         ventas_Peras_Segundo_S= teclado.nextInt(); //900
         
         suma_M= ventas_Manzana_Primer_S + ventas_Manzana_Segundo_S;
         suma_P= ventas_Peras_Primer_S + ventas_Peras_Segundo_S;
         
         importe_Total=  ((suma_M * PRECIO_MANZANA) + (suma_P * PRECIO_PERA));
         
         System.out.println("El importe total es " + importe_Total + " €"); //8485
    }
}
