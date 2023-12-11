package programacion_secuencial;

import java.util.Scanner;

/*
pedir 3 numeros y mostrar el mayor de los tres. Debes comprobar que los valores no sean iguales

 */
public class Mayor_De_Tres_Numeros_Bucle {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //creamos el número a guardar 
        int num1, num2, num3;

        System.out.println("Introduce los tres numeros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        // 1 2 1
        while (num1 == num2 || num1 == num3) {
            System.out.println("Disculpe, pero hay valores repetidos. ");
            System.out.println("Introduce de nuevo los tres numeros ");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            num3 = teclado.nextInt();
        }
        
        //5 3 2
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el numero mayor ");
        } else { ///1 5 3
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " es el numero mayor ");
            } else {///1 3 5
                System.out.println(num3 + " es el mayor");
            }
            
        }

    }
}
