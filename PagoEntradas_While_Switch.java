
package programacion_secuencial;

import java.util.Scanner;

/*
//Realice un algoritmo que determine el pago a realizar por las entradas de un 
//espectáculo donde se pueden comprar sólo hasta cuatro entradas y cada una 
//cuesta 15 euros, sabiendo que al costo de dos entradas se les descuenta el 10% del total, 
//al de tres entradas el 15% y a la compra de cuatro entradas se le descuenta el 20%. 
//El número de entradas a comprar se le solicitará al usuario, y se comprobará 
//que ha introducido un número correcto, volviéndoselo a pedir en caso contrario.
*/
public class PagoEntradas_While_Switch {
    public static void main(String[] args) {
        final double entrada= 15.0;
        double cantidad, porcentaje, monto_Final_Cobrar;
        Scanner teclado = new Scanner(System.in);
        int total_Entrada;
        
        System.out.println("Introduce el total de entrada");
        total_Entrada= teclado.nextInt();
        
        while (total_Entrada > 4) {            
            System.out.println("Disculpe, pero solo puede comprar 4 entradas");
            System.out.println("Introduce el total de entrada");
            total_Entrada= teclado.nextInt();
        }
        
        switch (total_Entrada) {
            case 2:
                //cantidad
                cantidad= (entrada * total_Entrada);
                porcentaje= cantidad * 0.10;
                monto_Final_Cobrar= cantidad - porcentaje; 
                System.out.println("El monto a pagar es el siguiente: " + monto_Final_Cobrar);
                break;
            case 3:
                cantidad= (entrada * total_Entrada);
                porcentaje= cantidad * 0.15;
                monto_Final_Cobrar= cantidad - porcentaje; 
                System.out.println("El monto a pagar es el siguiente: " + monto_Final_Cobrar);
                break;
            case 4:
                cantidad= (entrada * total_Entrada);
                porcentaje= cantidad * 0.20;
                monto_Final_Cobrar= cantidad - porcentaje; 
                System.out.println("El monto a pagar es el siguiente: " + monto_Final_Cobrar);
                break;
            default:
                System.out.println("El valor a pagar es " + entrada);
        }
                
        
        
        
        
        
    }
}
