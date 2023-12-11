
package teoria_programacion_secuencial.Ejemplos;

import java.util.Scanner;

public class Ejemplo_Cateo {
    /*
    Escribe un programa que solicite al usuario ingresar un número entero (int). Luego, el programa convertirá ese 
    número a un valor de tipo double y mostrará el resultado. Asegúrate de utilizar casting (conversión explícita) para realizar la conversión.
    */
    public static void main(String[] args) {
        //creamos el objeto scanner 
        Scanner teclado= new Scanner(System.in);
        int valor_A_Castear;
        double valor_Casteado_Decimal;
        
        
        //pedimos y leemos valor
        System.out.println("Introduce el numero entero para pasarlo a decimal ");
        valor_A_Castear= teclado.nextInt();
        
        //cambiamos el valor de entero a decimal
        valor_Casteado_Decimal= (double)valor_A_Castear;
        
        System.out.println("Valor antiguo " + valor_A_Castear + " | valor nuevo: " + valor_Casteado_Decimal);
        
        teclado.close();
    }
}
