
package teoria_programacion_secuencial.Ejemplos;

import java.util.Scanner;

/*
Escribe un programa en Java que solicite al usuario ingresar un número entero. 
Luego, realiza las siguientes operaciones:

    Utiliza el operador de incremento para aumentar el valor del número en 1 y muestra el resultado.
    Utiliza el operador de decremento para disminuir el valor del número en 1 y muestra el resultado.
    Realiza una operación de incremento que afecte al número, pero esta vez, muestra el número antes 
y después de la operación.

Puedes utilizar las variables que desees para almacenar el número y los resultados intermedios. 
Recuerda pedir al usuario que ingrese el número y mostrar los resultados de manera adecuada. Cuando hayas completado el programa o tengas preguntas, puedes solicitarme la solución o aclaraciones.

*/
public class Prefijo_Subfijo {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a= 5,  b= ++a;
        //int a= 5,  b= a++; a=6 y b=5
        System.out.println("valor de a " + a);
        System.out.println("valor de b " + b);
        
//        System.out.println("introduce un numero entero ");
//        numero= teclado.nextInt();
        
//        System.out.println("valor inicial " + numero);
//        
//        numero++;
//        
//        System.out.println("valor con incremento " + numero);
//        
//        numero--;
//        
//        System.out.println("valor con decremento " + numero);
        
        
    }
}
