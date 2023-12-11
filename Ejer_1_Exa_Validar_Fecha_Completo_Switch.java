//  Pedir al usuario tres números que corresponderán con una fecha 
//(primero el día, después el mes, y después el año). Se deberá comprobar que se 
//trata de una fecha válida y, si no lo es, se saldrá del programa mostrando un 
//mensaje de error. Si la fecha es correcta, el algoritmo la escribirá sustituyendo el
//número del mes por su nombre. Por ejemplo: si se introduce los números 9, 10 y 
//	2023, se deberá mostrar la cadena "9 de octubre de 2023".
//Nota 1: El año debe ser mayor que 0. 
//Nota 2: 30 de febrero no es una fecha válida. No hace falta comprobar si el año es 
//	bisiesto, supondremos que ninguno lo es.
package programacion_secuencial;

import java.util.Scanner;

public class Ejer_1_Exa_Validar_Fecha_Completo_Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;
        
        System.out.println("dia ");
        dia= teclado.nextInt();
        
        System.out.println("mes ");
        mes= teclado.nextInt();
        
        System.out.println("año ");
        anio= teclado.nextInt();
        
        if ((mes <= 12 && mes >=1) && (anio > 0)) {
            switch (mes) {
                case 1:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de enero de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <=28 ) {
                        System.out.println(dia +  " de febrero de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 3:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de marzo de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 4:
                    if (dia >= 1 && dia <=30 ) {
                        System.out.println(dia +  " de abril de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 5:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de mayo de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 6:
                    if (dia >= 1 && dia <=30 ) {
                        System.out.println(dia +  " de junio de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 7:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de julio de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 8:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de agosto de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 9:
                    if (dia >= 1 && dia <=30 ) {
                        System.out.println(dia +  " de septiembre de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 10:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de octubre de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 11:
                    if (dia >= 1 && dia <=30 ) {
                        System.out.println(dia +  " de noviembre de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                case 12:
                    if (dia >= 1 && dia <=31 ) {
                        System.out.println(dia +  " de diciembre de " + anio);
                    } else {
                        System.out.println("Error en el día");
                    }
                    break;
                
            }
            
        } else {
            System.out.println("Error en el mes o en el año");
        }
        
    }
}
