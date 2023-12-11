package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

/**
 * pedir un numero real y lo muestre al entero más proximo
 */
public class Redondeo_Numeros_Matematica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         teclado.useLocale(Locale.US);
         double numero_A_Proximar, num_Proximo;
         int num_Redondeado_Maximo;
         
         System.out.print("Introduce el numero real para aproximarlo a un entero: ");
         numero_A_Proximar= teclado.nextDouble();
         
         /*
         aplica la suma con decimales 0.5 + numero lo que hace es realizar la suma digito por digito y mostrar el valor
         mas proximo
         */
         num_Proximo= 0.5 + numero_A_Proximar;
         num_Redondeado_Maximo= (int) num_Proximo;
         
         System.out.println(num_Redondeado_Maximo);
        

    }
}
