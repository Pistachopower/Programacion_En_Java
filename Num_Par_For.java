package programacion_secuencial;

import java.util.Scanner;

/*
pide un número por teclado y mostrar los números pares
 */
public class Num_Par_For {

    public static void main(String[] args) {
        //llamamos a la funcion scanner y creamos el objeto scanner
        Scanner teclado = new Scanner(System.in);

        //creamos el número a guardar 
        int numero;

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par ");
            } else {
                System.out.println(i + " no es par ");
            }
        }
    }
}
