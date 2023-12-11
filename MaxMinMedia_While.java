/*
Algoritmo que lea números enteros hasta teclear 0, y nos muestre el 
máximo, el mínimo y la media de todos ellos. 
Piensa como debemos inicializar las variables.
 */
package programacion_secuencial;

import java.util.Scanner;

public class MaxMinMedia_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minimo, maximo, num_Usuario, contador;
        double media, suma;
        contador= 0;
        suma= 0;
        
        System.out.println("Introduce el número: ");
        num_Usuario = teclado.nextInt();
        
        maximo= num_Usuario;
        minimo= num_Usuario;

        while (num_Usuario != 0) {
            contador= contador + 1;
            suma= suma + num_Usuario;
            
            if (num_Usuario > maximo) {
                maximo= num_Usuario;
            }
            if (num_Usuario < minimo) {
                minimo= num_Usuario;
            }
            
            
            System.out.println("Introduce el número: ");
            num_Usuario = teclado.nextInt();
            
        }
        
        media=  (suma / contador);
        System.out.println("el maximo es " + maximo);
        System.out.println("el minimo es " + minimo);
        System.out.println("La media es " + media);
    }
}
