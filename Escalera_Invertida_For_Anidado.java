/*
 pedir por consola un numero positivo y dibujar un triangulo de
N elementos de lado y verificar que el positivo
 */
package ejercicio_clase;

import java.util.Scanner;

public class Escalera_Invertida_For_Anidado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        
        
        System.out.println("Introduce al altura del triángulo: ");
        altura = teclado.nextInt();

        while (altura < 0) {
            System.out.println("Disculpe, la altura debe ser mayor a 0");
            System.out.println("Introduce la altura: ");
            altura = teclado.nextInt();
        }
        
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j <= altura; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        
    }
}
