//Dada una secuencia de números leídos por teclado, que acabe con un -1, 
//por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; Realizar el algoritmo que calcule la media aritmética. 
//Suponemos que el usuario no insertara numero negativos.
package programacion_secuencial;

import java.util.Scanner;

public class MediaAritmetica_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, contador, suma;
        double media;
        contador= 0;
        suma= 0;
        
        System.out.println("introduce numero uno ");
        num = teclado.nextInt(); //5
        
        while (num != -1) {            
            contador= contador + 1; //2
            suma= suma + num;//15
            
            System.out.println("introduce numero uno ");
            num = teclado.nextInt(); //-1 
        }
        
        media= suma / contador;
        
        System.out.println("La media es " + (media));
    }
}
