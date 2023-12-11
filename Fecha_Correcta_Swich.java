/*
pedir el dia, mes y año (a partir de una) de una fecha, e indicar que 
la fecha sea correcta y no se considerará año bisiesto

otra solucion: 
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;
        
        System.out.println("Introduce el día: ");
        dia= teclado.nextInt();
        
        System.out.println("Introduce el mes: ");
        mes= teclado.nextInt();
        
        System.out.println("Introduce el año: ");
        anio= teclado.nextInt();
        
        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (anio > -1)) {
            switch (mes) {
                case 1:
                    System.out.println("La fecha es correcta. ");
                    break;
                case 2:
                    if (dia <= 28 ) {
                        System.out.println("La fecha de febrero es correcta. ");
                    } 
                    else {
                        System.out.println("Disculpa, pero " + dia + " no es un día correcto para febrero. ");
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("La fecha es correcta. ");
                    break;
                
            }
        } else {
            System.out.println("La fecha no es correcto");
        }
        
 */
package ejercicio_clase;

import java.util.Scanner;

public class Fecha_Correcta_Swich {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        anio = teclado.nextInt();

        if ((mes <= 12 && mes >= 1) && anio > 0) {
            switch (mes) {
                case 1:
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("La fecha es válida");
                    } else {
                        System.out.println("Error en el día");

                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("La fecha es válida");
                    } else {
                        System.out.println("Error en el día");

                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("La fecha es válida");
                    } else {
                        System.out.println("Error en el día");

                    }
                    break;
                    
                    
            }
        } else {
            System.out.println("Error en el mes o en el año ");

        }
    }
}
