
package teoria_programacion_secuencial.Ejemplos;

import java.util.Scanner;

/*
escriba un programa que le pida al usuario que ingrese un número decimal de punto flotante (tipo de datos float). 
El programa deberá mostrar el número ingresado por el usuario en la pantalla. Asegúrese de que el programa sea fácil 
de entender y proporciona instrucciones claras al usuario."
*/
public class Datos_Flotantes {
    public static void main(String[] args) {
        //-1,7E308
        Scanner teclado= new Scanner(System.in);
        float valor;
        
        System.out.println("introduce el numero de punto flotante ");
        valor= teclado.nextFloat();
        
        System.out.println("valor de tipo flotante " + valor);
        //aparecera valor de tipo flotante -Infinity porque tiene una gran cantidad de decimales
     
    }
}
