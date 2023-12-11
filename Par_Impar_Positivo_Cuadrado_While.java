/*
un programa que muestrs para cada numero introducido por teclado si es par, si 
es positivo y su cuadrado. El proceso se repetira 
hasta que su numero introducido sea cero 
 */
package ejercicio_clase;

import java.util.Scanner;

public class Par_Impar_Positivo_Cuadrado_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        double potencia;

        System.out.println("Introduce un número entero. 0 para terminar");
        num = teclado.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es par ");
            }
            if (num > -1) {
                System.out.println("El numero es positivo ");
            }
            
            potencia= Math.pow(num, 2);
            System.out.println("El cuadrado de " + num + " es " + potencia);

            System.out.println("Introduce un número entero. 0 para terminar");
            num = teclado.nextInt();
        }
    }
}
