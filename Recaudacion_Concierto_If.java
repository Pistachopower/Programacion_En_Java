/*
Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación 
solicitará el aforo máximo del local, el precio por entrada (suponemos que todas las 
entradas tienen el mismo precio) y el número de entradas vendidas. Hay que tener en 
cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, 
se cancela el concierto. Si el número de entradas vendidas no supera el 50% del aforo, 
se realiza una rebaja del 25% del precio de la entrada.
 */
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Recaudacion_Concierto_If {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int aforo_Local, num_E_V;
        double precio_E, porcentaje_Aforo_20, porcentaje_Aforo_50,
                porcentaje_Rebaja, precio_Con_Descuento, precio_Total_Descuento_E;

        System.out.println("introduce el aforo del local: ");
        aforo_Local = teclado.nextInt();

        System.out.println("introduce el numero de entradas vendidas: ");
        num_E_V = teclado.nextInt();

        System.out.println("introduce el precio del entrada: ");
        precio_E = teclado.nextDouble();

        //sacamos el 20 % del aforo del local para controlar que se pueda hacer el concierto o no
        porcentaje_Aforo_20 = aforo_Local * 0.20;

        //sacamos el 50 % del aforo para hacer el descuento de la entrada 
        porcentaje_Aforo_50 = aforo_Local * 0.50; //500

        //System.out.println(porcentaje_Aforo_20);
        if (num_E_V < porcentaje_Aforo_20) {
            System.out.println("No se puede realizar el concierto. ");
        }
        if (num_E_V < porcentaje_Aforo_50) {
            //sacamos el 25 % del precio entrada
            porcentaje_Rebaja = precio_E * 0.25; //3.8

            //aplicamos el descuento
            precio_Con_Descuento = precio_E - porcentaje_Rebaja; //11.62

            //calculamos el dinero recaudado  de todas las entradas vendidas breviamente hecho el descuento del 25 % 
            precio_Total_Descuento_E = precio_Con_Descuento * num_E_V;

            System.out.println("El dinero recaudado es de " + precio_Total_Descuento_E + "€");

        } else {

            System.out.println("El dinero recaudado es de " + (precio_E * num_E_V) + "€");

        }

    }
}
