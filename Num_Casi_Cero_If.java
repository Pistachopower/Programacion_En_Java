package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Num_Casi_Cero_If {
/*
Programa que pida por teclado un número decimal e indique si es un número casi-cero, 
que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, 
aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números 
casi-ceros son: 0.3, -0.99, 0.123. Algunos números que no se consideran casi-ceros 
son: 12.3, 0, ó -1.    
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double num;
  
        System.out.println("Introduce el número: ");
        num= teclado.nextDouble();
        
        //0.3
        //es lo mismo: numero > -1 && numero < 1 && numero != 0
        if ((-1 < num) && (num < 1) && (num != 0)) {
            System.out.println("El numero es casi cero");
        } else {
            System.out.println("El numero no es casi cero");
        }
        
    }
}
