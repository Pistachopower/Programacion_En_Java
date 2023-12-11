package programacion_secuencial;

import java.util.Scanner;

/*
realizar un programa que pida por teclado dos numeros 
e intercambie los valores
*/

public class IntercambiaValores_Logica {

    public static void main(String[] args) {
        //creamos el objeto scanner para guardar los resultados en la variable
        Scanner teclado= new Scanner(System.in);
        int num1, num2;
        
        System.out.println("introduce numero  1: ");
        num1= teclado.nextInt(); //5
        
        System.out.println("introduce numero  2: ");
        num2= teclado.nextInt(); //7
        
        System.out.println("Los valores iniciales son ");
        System.out.println("numero 1= " + num1);
        System.out.println("numero 2= " + num2);
        
        //creamos la variable a donde vamos a guardar el valor a cambiar
        int temporal; 
        
        //cambiamos las variables 
        temporal= num1; //5
        num1= num2; //7
        num2= temporal; //5
        
        System.out.println("Los valores actuales son ");
        System.out.println("numero 1= " + num1);
        System.out.println("numero 2= " + num2);
        
    }
    
}
