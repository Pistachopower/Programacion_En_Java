//pedir 10 numeros por teclado y mostrar la media
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Media_10_Numeros_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        
        double media, suma, valor_Usuario;
        suma= 0;
        int contador=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número: ");
            valor_Usuario= teclado.nextInt();
            
            contador= contador + 1;
            suma= suma + valor_Usuario;
        }
        
        media= suma / contador;
        System.out.println("La media es " + (media));
    }
}
