
package ejercicio_clase;

import java.util.Scanner;

/*
escribir año actual y fecha de nacimiento del usuario , debe calcular su edad suponiendo que el año en curso el usuario a cumplido año

*/
public class Calcular_Anio_Matematica {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int anio_Actual, fec_Nac;
        
        
        System.out.print("Introduce el año actual: ");
        anio_Actual=teclado.nextInt();
        
        System.out.print("Introduce el año actual: ");
        fec_Nac=teclado.nextInt();
        
        System.out.println("Tu edad es " + (anio_Actual  - fec_Nac) + " años. ");
    }
}
