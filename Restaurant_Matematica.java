//El siguiente es el menú de un restaurante de bocadillos. 
//Diseñar un algoritmo capaz de leer el número de unidades 
//consumidas de cada alimento ordenado y calcular la cuenta total. 
//Vamos a suponer que estos precios son fijos, es decir, 
//que son constantes (recuerda que en PSeInt no se usa comas 
//para separar la parte decimal de la parte entera).
		
		//Producto         		Precio
		//Bocadillo de jamón 	1,5 
		//Refresco				1,05 
		//Cerveza				0,75
package programacion_secuencial;

import java.util.Scanner;

public class Restaurant_Matematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double boca_Jamon = 1.05; 
        final double refresco = 1.50; 
        final double cerveza = 0.75; 
        int total_B_J, total_R, total_C;
        
        System.out.println("Introduce el total de bocadillos de jamon ");
        total_B_J= teclado.nextInt();
        
        System.out.println("Introduce de refrescos ");
        total_R= teclado.nextInt();
        
        System.out.println("Introduce el total de cerveza ");
        total_C= teclado.nextInt();
        
        System.out.println("El precio a pagar es de " + ((boca_Jamon * total_B_J) + (refresco * total_R) + (cerveza *  total_C)) + " €");
    
    }
    
}
