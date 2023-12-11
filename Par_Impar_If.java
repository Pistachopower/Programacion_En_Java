package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Par_Impar_If {
//solicitar un numero y verificar si es par o impar
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int numero_A_Evaluar;

        System.out.println("Introduce el número: ");
        numero_A_Evaluar = teclado.nextInt();

        if (numero_A_Evaluar % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");

        }
        
        
    }
}
