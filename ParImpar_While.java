//Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o impar. En el caso de ser 0, lo volverá a solicitar
package programacion_secuencial;

import java.util.Scanner;

public class ParImpar_While {

    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce numero ");
        num1 = teclado.nextInt();

        while (num1 <= 0) {
            System.out.println("introduce numero ");
            num1 = teclado.nextInt();
        }
        
        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es par");
        } else {
            System.out.println("El numero " + num1 + " no es par");
        }
    }
}
