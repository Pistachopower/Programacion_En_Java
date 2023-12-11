package ejercicio_clase;
import java.util.Scanner;
public class Solicitar_Numero_Decir_Mes_Switch {
/*
solicitar un numero entre 1 y  7
y mostrar el dia de la semana que corresponde    
    
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_Dia_Semanas;
       
        System.out.println("Introduce el número del día: ");
        numero_Dia_Semanas = teclado.nextInt();

        switch (numero_Dia_Semanas) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
               
                System.out.println("Dia incorrecto");
                break;

        }
       
    }
}
