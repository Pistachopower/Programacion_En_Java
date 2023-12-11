package programacion_secuencial;

import java.util.Scanner;

/*
solicita un número natural y muestra la suma de dichos números. Hacerlo con 
bucle mientras
Definir N, suma, indice Como Entero
	
	Escribir "Introduzca un número natural"
	Leer N //5
	
	suma<-0
	indice<-1
	
	Mientras indice<=N Hacer
		suma<-suma+indice //1
		indice<-indice+1 //2
	Fin Mientras
	
	Escribir suma

*/
public class Suma_Numeros_Naturales_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, contador, suma;
        contador= 1;
        suma= 0;
        
        System.out.println("introduce numero: ");
        numero= teclado.nextInt(); //5
        
        while (contador <= numero) {  
            suma= suma + contador; //1,3,6,10,15
            System.out.println("Valor de suma: " + suma);
            contador= contador + 1; //5
            
            System.out.println("Valor de contador: " + suma);
        }
        
        
    }
}
