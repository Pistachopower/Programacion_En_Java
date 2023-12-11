package variables;

import java.util.Locale;
import java.util.Scanner;

/*
8. Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int a,b, c;
        double media;
        
        System.out.println("Introduce A, B, C: ");
        a= teclado.nextInt();
        b= teclado.nextInt();
        c= teclado.nextInt();
        
        media= (a+b+c) / 3;
        
        System.out.println("La media es " + media);
        
        
    }
}
