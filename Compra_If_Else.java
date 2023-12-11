
package programacion_secuencial;

/*Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. 
Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.
ejemplo: 250 * 0.15= 37.5
         250 - 37.5= 212.5
*/
import java.util.Scanner;


public class Compra_If_Else {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double porcentaje= 0.15;
        String mes;
        double total_Compra;
        double calculo_Porcentaje;
        
        System.out.println("Introduce el mes ");
        mes= teclado.nextLine();
        
        System.out.println("Introduce el importe de la compra ");
        total_Compra= teclado.nextDouble();
        
        calculo_Porcentaje= total_Compra * porcentaje;
        
        
        if (mes.equals("octubre")) {
            System.out.println("La cantidad a cobrar al cliente es " + (total_Compra - calculo_Porcentaje) );
        } else {
            System.out.println("La cantidad a cobrar al cliente es " + (total_Compra) );
        }
        
        
        
    }
}
