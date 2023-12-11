package programacion_secuencial;

import java.util.Scanner;

/*
Algoritmo que nos diga si una persona puede acceder a cursar un ciclo formativo de 
grado superior o no. Podrá acceder a un grado superior si se tiene un titulo de bachiller, 
en caso de no tenerlo, se puede acceder si hemos superado una prueba de acceso.
 */
public class Acceso_Ciclo_If_Else {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Tienes título de bachiller?");
        String valor = teclado.nextLine();

        //usamos equals porque queremos comparar si el contenido de valor es igual que el contenido si
        //el == no se usa porque le estás preguntado al programa si los dos objetos (valor y "si" 
        //están en el mismo espacio de memoria)
        if (valor.equals("si")) {
            System.out.println("puedes estudiar ciclo superior");
        } else {
            System.out.println("has superado la prueba de acceso?");
            valor = teclado.nextLine();
            
            if (valor.equals("si")) {
                System.out.println("puedes estudiar ciclo superior");
                
            } else {
                System.out.println("no puedes estudiar ciclo superior");
            }
        }
            
        
    }
}
