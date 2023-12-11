/*
pedir 3 numeros enteros, supondremos que todos son diferente
 y mostrarlos ordenados de mayor a menor

Valor descreciente, de mayor a menor

Probar las posibilidades: 
    a= a b c / a c b
    b= b a c / b c a
    c= c a b / c b a
        
 */
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Ordenar_Tres_Numeros_Mayor_Menor_If {
    public static void main(String[] args) {
   //pedir 3 numeros enteros, supondremos que todos son diferente
 //y mostrarlos ordenados de mayor a menor
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int a,b,c;
        
        System.out.println("Introduce num 1: ");
        a= teclado.nextInt();
        
        System.out.println("Introduce num 2: ");
        b= teclado.nextInt();
        
        System.out.println("Introduce num 3: ");
        c= teclado.nextInt();
        
        //probamos las posibilidades de a,b,c (de cada una) 
        //y sus combinaciones sin repetir
        //comenzamos por a
        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c + " ");
        }
        if (a > c && c > b) {
            System.out.println(a + " " + c + " " + b + " ");
        }
        //seguimos con b 
        if (b > c && c > a) {
            System.out.println(b + " " + c + " " + a + " ");
        }
        if (b > a && a > c) {
            System.out.println(b + " " + a + " " + c + " ");
        }
        //seguimos con la c
        if (c > a && a > b) {
            System.out.println(c + " " + a + " " + b + " ");
        }
        if (c > b && b > a) {
            System.out.println(c + " " + b + " " + a + " ");
        }
        
    }
}
