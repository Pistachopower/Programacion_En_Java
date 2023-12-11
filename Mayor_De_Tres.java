
package programacion_secuencial;
//Algoritmo que lea tres números distintos y nos diga cual de ellos es el mayor

import java.util.Scanner;

public class Mayor_De_Tres {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        
        do {     
            System.out.println("introduce numero uno ");
            num1= teclado.nextInt();
            
            System.out.println("introduce numero dos ");
            num2= teclado.nextInt();
            
            System.out.println("introduce numero tres ");
            num3= teclado.nextInt();
            
            //3 4 5
            //f f= f
        } while (num1 == num2 || num1 == num3);//debe dar falso para salir
        
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es mayor que " + num2 + " y " + num3);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es mayor que " + num1 + " y " + num3);
        }else {
            System.out.println(num3 + " es mayor que " + num1 + " y " + num2);
        
        }
        
    }
            
}
