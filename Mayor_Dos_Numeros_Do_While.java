
package programacion_secuencial;
//Algoritmo que lea dos números, que deben ser diferentes, y nos diga cual de ellos es mayor

import java.util.Scanner;

public class Mayor_Dos_Numeros_Do_While {
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        do {     
            System.out.println("introduce numero uno ");
            num1= teclado.nextInt();
            
            System.out.println("introduce numero dos ");
            num2= teclado.nextInt();
            
        } while (num1 == num2);//debe dar falso para salir
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
