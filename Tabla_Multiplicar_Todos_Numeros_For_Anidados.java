/*
realizar las tablas de multiplicar de 1 a 10


 */
package ejercicio_clase;

public class Tabla_Multiplicar_Todos_Numeros_For_Anidados {

    public static void main(String[] args) {
        int numero = 10;

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabla del " + i );
            for (int j = 1; j <= numero; j++) {
                System.out.println(i + " * " + j + "= " + (i * j));
            }
            System.out.println("");
        }
    }
}
