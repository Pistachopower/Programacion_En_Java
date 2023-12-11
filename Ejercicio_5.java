
package variables;

/**
realizar un programa que pida un cantidad en euros y diga lo
que vale en dólares
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        double euros= 100;
        double tasa_Dolares= 1.09;
        double cambio_Euros_Dolares= euros * tasa_Dolares;
        
        //System.out.println("Según la tasa de cambio en dólares de " + tasa_Dolares + " $, " + euros + " € vale en dólares " + cambio_Euros_Dolares);
        System.out.printf("Según la tasa de cambio en dólares de %.2f $, %.2f € vale en dólares %.2f $\n", tasa_Dolares, euros, cambio_Euros_Dolares);
    }
   
}
