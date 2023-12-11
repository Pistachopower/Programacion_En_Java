/*
Programa que indique si podemos salir a la calle. Existen 
aspectos que influirán en esta decisión: si está lloviendo 
y si hemos terminado nuestras tareas. Sólo podremos salir a 
la calle si no está lloviendo y hemos finalizado nuestras tareas. 
Existe una opción en la que, indistintamente de lo anterior, 
podremos salir a la calle: el hecho de que tengamos que ir a 
la biblioteca (para realizar algún trabajo, entregar un libro, etc.). 
Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado 
las tareas y si necesita ir a la biblioteca. El programa debe mostrar 
mediante un booleano (true o false) si es posible que se le otorgue 
permiso para ir a la calle.

 */
package ejercicio_clase;

import java.util.Scanner;

public class Salir_Calle_Boleano_ {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salirCalle, lloviendo, tareaTerminada, irBiblioteca;

        System.out.println("¿Está lloviendo?");
        lloviendo = teclado.nextBoolean();

        System.out.println("¿Has terminado las tareas?");
        tareaTerminada = teclado.nextBoolean();

        System.out.println("¿Necesitas ir a la biblioteca?");
        irBiblioteca = teclado.nextBoolean();

        salirCalle = ((!lloviendo && tareaTerminada) || irBiblioteca == true);

        System.out.println(salirCalle);
    }
}
