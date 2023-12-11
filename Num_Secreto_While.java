/*
 - Codificar el juego de "El número secreto", que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
Para ello, se introduce por teclado una serie de números, para los que se indica: "mayor" o "menor" según sea mayor o 
menor que el número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1). 
(Os dejo que investiguéis cómo generar el número aleatorio. Si no lo conseguís, poned el número que queráis).
 */
package ejercicio_clase;

import java.util.Scanner;

public class Num_Secreto_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_Aleatorio = (int) (Math.random() * 100 + 1); //75
        int valor_Usuario;

        System.out.println("Introduce el número a adivinar: ");
        valor_Usuario = teclado.nextInt(); //88

        while ((valor_Usuario != -1)) {
            //System.out.println("numero aleatorio " + num_Aleatorio);
         
            if (valor_Usuario > num_Aleatorio) {
                System.out.println("Tu número es mayor que el número a adivinar");
                System.out.println("");
            }
            if (valor_Usuario < num_Aleatorio) {
                System.out.println("Tu número es menor al número a adivinar");
                System.out.println("");
            }
            if ((valor_Usuario == num_Aleatorio)) {
                System.out.println("Has ganado");
                break;
            }


            System.out.println("Introduce el número a adivinar nuevamente: ");
            valor_Usuario = teclado.nextInt(); 

        }
        
        System.out.println("Has salido del programa");

    }
}
