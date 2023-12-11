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

public class MenuRestaurante_Matematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double BOCADILLO_JAMON= 1.50; 
        final double REFRESCO= 1.05; 
        final double CERVEZA= 0.75;
        
        double total_Bocadillo_J, total_Refresco, total_Cervezas, total;
        
        int cantidad;
        
        System.out.println("Introduce la cantidad bocadillos de jamon: ");
        cantidad= teclado.nextInt();
        
        total_Bocadillo_J= (BOCADILLO_JAMON * cantidad);
        
        
        System.out.println("Introduce la cantidad refrescos: ");
        cantidad= teclado.nextInt();

        total_Refresco= (REFRESCO * cantidad);

        System.out.println("Introduce la cantidad de cervezas: ");
        cantidad= teclado.nextInt();
        
        total_Cervezas= (CERVEZA * cantidad);
        
        total= (total_Bocadillo_J + total_Refresco + total_Cervezas);
        
        System.out.println("El total a pagar es de " + (total) +  " €");
    }
}
