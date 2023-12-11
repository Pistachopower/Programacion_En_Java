package programacion_secuencial;

import java.util.Scanner;

/*
pedir un numero entero y mostrar el mes al que corresponde el 
numero, sino es un valor correcto, mostrar un error
 */
public class Mostrar_Mes_Switch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //creamos el número a guardar 
        int numero;

        System.out.println("Introduce el numero para conocer el mes: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println(numero + " corresponde a enero ");
                break;

            case 2:
                System.out.println(numero + " corresponde a febrero ");
                break;

            case 3:
                System.out.println(numero + " corresponde a marzo ");
                break;

            case 4:
                System.out.println(numero + " corresponde a abril ");
                break;

            case 5:
                System.out.println(numero + " corresponde a mayo ");
                break;

            case 6:
                System.out.println(numero + " corresponde a junio ");
                break;

            case 7:
                System.out.println(numero + " corresponde a julio ");
                break;

            case 8:
                System.out.println(numero + " corresponde a agosto ");
                break;

            case 9:
                System.out.println(numero + " corresponde a septiembre ");
                break;

            case 10:
                System.out.println(numero + " corresponde a octubre ");
                break;
                
            case 11:
                System.out.println(numero + " corresponde a noviembre ");
                break;
                
            case 12:
                System.out.println(numero + " corresponde a diciembre ");
                break;
            default:
                System.out.println("Disculpe, el valor no es correcto. ");
        }
    }
}
