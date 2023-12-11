package programacion_secuencial;

import java.util.Scanner;
//Escribir un Pseudocódigo que pida la edad y el sexo (H o M), y 
//muestre un mensaje indicando si es hombre o mujer 
//y si puede votar o no. Por ejemplo, para edad 13 y sexo H, 
//el mensaje será "Eres hombre y no puedes votar". 
//En caso de que el usuario introduzca un valor negativo 
//para la edad o un carácter distinto de H o M para el sexo, 
//deberá volver a introducir el dato erróneo.

public class Votar_Do_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        char sexo;

        do {
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();
        } while (edad < 0); //debe dar falso para que salga del bucle

        do {
            System.out.println("Introduce el sexo: ");
            //utilizamos el método next().charAt(0) para obtener el primer carácter de la cadena 
            //ingresada. El índice 0 se usa para acceder al primer carácter, ya que los índices en Java comienzan en 0
            sexo = teclado.next().charAt(0);          
        } while (sexo != 'm' && sexo != 'h');

        if (edad >= 18) {
            if (sexo == 'h') {
                System.out.println("Eres hombre y puedes votar ");
            } else {
                System.out.println("Eres mujer y puedes votar ");
            }
        }
        if (edad < 18) {
            if (sexo == 'h') {
                System.out.println("Eres un niño y no puedes votar ");
            } else {
                System.out.println("Eres un niña y no puedes votar ");
            }
        }
    }
}
