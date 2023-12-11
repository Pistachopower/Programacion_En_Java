package ejercicio_clase;
import java.util.Scanner;
public class Par_Impar_Boleano {
/*
pedir un numero e indicar con un booleano si es par o impar    
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean evaluacion;
        
        System.out.println("Introduce el numero: ");
        numero= teclado.nextInt();
        
        evaluacion= numero % 2 == 0;
        
        System.out.println("Par: " + evaluacion); 
        
        
    }

}
