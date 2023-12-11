
package ejercicio_clase;

import java.util.Scanner;

public class Media_Aritmetica_Matematica {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num1, num2;
        //double mediaAritmetica;
        
        System.out.println("Introduce el primer numero: ");
        num1=teclado.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2=teclado.nextInt();
        
        //mediaAritmetica= (double)(num1 + num2) / 2;
        
        //System.out.println("La media es " + mediaAritmetica);
        System.out.println("La media es " + ((double)(num1 + num2) / 2));
        
    }
}
