package ejercicios_Libro;

import java.util.Scanner;

/*
realizar un programa que convierta un numero decimal en su representacion binaria. Hay
que tener en cuenta qye desconocemos cuantas cifras tiene el numero que introduce el 
usuario. Por simplicidad iremos mostrando el numero binario con un digito por linea
 */
public class Num_Decimal_A_Binario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar un número decimal
        System.out.println("Ingrese un número decimal:");
        int decimal = teclado.nextInt();

        // Mostrar la representación binaria con un dígito por línea
        System.out.println("La representación binaria es:");

        if (decimal == 0) {
            System.out.println(0);
        } else {
            while (decimal > 0) {
                System.out.println(decimal % 2);
                decimal /= 2;
            }
        }
    }
}
