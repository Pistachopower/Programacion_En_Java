package programacion_secuencial;

import java.util.Locale;
import java.util.Scanner;

/*
realizar un programa que pida un numero y calcule la 
raiz cuadrada de un número. Debe controlarse que el numero
sea mayor a 0

 */
public class RaizCuadrada_Do_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //cambiamos la coma por el punto para los decimales
        teclado.useLocale(Locale.US);
        
        //creamos el número a guardar 
        double numero;
        do {
            

            System.out.println("Introduce el numero: ");
            numero = teclado.nextDouble();
        } while ( numero <= 0);
                
        System.out.println("La raiz cuadrada de " + numero + " es " + (Math.sqrt(numero)));
        
    }
}
