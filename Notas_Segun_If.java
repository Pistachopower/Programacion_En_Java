package programacion_secuencial;

import java.util.Scanner;

/*
solicitar una nota y mostrar dependiendo del valor lo siguiente:
    		0,1,2,3,4:
			Escribir "Suspenso"
		5,6:
			Escribir "Suficiente"
		7,8:
			Escribir "Notable"
		9,10:
			Escribir "Sobresaliente"
En caso contrario, mostrar un error. 
*/
public class Notas_Segun_If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //creamos el número a guardar 
        int numero;

        System.out.println("Introduce el numero de la nota: ");
        numero = teclado.nextInt();
        
        if (numero == 0 || numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            System.out.println("Suspenso");
            
        }
        if (numero == 5 || numero == 6) {
            System.out.println("Suficiente");
        }
        if (numero == 7 || numero == 8) {
            System.out.println("Notable");
        }
        if (numero == 9 || numero == 10) {
            System.out.println("Sobresaliente");
        } 
        
        if (numero < 0 || numero > 10) {
            System.out.println("Disculpe, pero el valor no es correcto. ");
        }
    }
}
