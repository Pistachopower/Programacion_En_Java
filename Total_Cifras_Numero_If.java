/*
solicitar numero al usuario entero y mostrar cuantas cifras tiene. 0 a 99999

0 a 9 -> tiene 1 cifra 
10 al 99 -> tiene 2 cifra   
100 al 999 -> tiene 3 cifra
1000 al 9999 -> tiene 4 cifra
10000 al 99999-> tiene 5 cifra
 */
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Total_Cifras_Numero_If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int num;
        
        System.out.println("introduce numero: ");
        num= teclado.nextInt();
        
        if (num < 9) {
            System.out.println("el numero tiene 1 digito");
        }
        if (num < 99) {
            System.out.println("el numero tiene 2 digito");
        }
        if (num < 999) {
            System.out.println("el numero tiene 3 digito");
        }
        if (num < 9999) {
            System.out.println("el numero tiene 4 digito");
        }
        if (num < 99999) {
            System.out.println("el numero tiene 5 digito");
        }
        
    }
}
