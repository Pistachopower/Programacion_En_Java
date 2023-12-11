package programacion_secuencial;
// Algoritmo que lea dos números y nos diga cual de ellos es mayor o bien si son iguales

import java.util.Scanner;

public class Mayor_Iguales_If_Else_Anidados {

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce numero uno ");
        num1 = teclado.nextInt();

        System.out.println("introduce numero dos ");
        num2 = teclado.nextInt();
        
        if (num1 == num2) {
            System.out.println("son iguales");
        } else {
            if (num1 > num2) {
                 System.out.println(num1 + " es mayor que " + num2);
            } else {
                System.out.println(num2 + " es mayor que " + num1);
            }
        }
    }
}
