
package programacion_secuencial;
//Hacer un programa que indique la denominación en cuanto a su edad de una 
//persona según los siguientes criterios:

import java.util.Scanner;

    //- Cuando la edad es menor a 14, es un niño. 
    //- Cuando la edad es de 14 a 22, es un adolescente. 
    //- Cuando la edad es de 23 a 43, es un joven. 
    //- Cuando la edad es de 44 a 64, es un adulto joven. 
    //- Cuando la edad es de 65 a más es un adulto mayor.
public class DenominacionEdad_While_Rango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("¿Introduce la edad: ?");
        edad = teclado.nextInt();
        
        while (edad <= 0) {            
            System.out.println("Disculpe, la edad debe ser mayor a 0");
            System.out.println("¿Introduce la edad: ?");
            edad = teclado.nextInt();
        }
        
        if (edad < 14) {
            System.out.println("Es un niño");
            
        } 
        if ((edad >= 14) && (edad <= 22)) {
            System.out.println("Es un adolescente");
        }
        if ((edad >= 23) && (edad <= 43)) {
            System.out.println("Es un joven");
        }
        if ((edad >= 44) && (edad <= 64)) {
            System.out.println("Es un adulto joven");
        }
        if ((edad >= 65)) {
            System.out.println("Es un adulto mayor");
        }
        
    }
}
