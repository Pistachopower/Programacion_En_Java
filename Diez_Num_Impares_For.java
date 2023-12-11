/*
REALIZAR UN PROGRAMA QUE MUESTRE LA SUMA DE LOS 10 PRIMEROS NÚMEROS IMPARES
 */
package ejercicio_clase;

public class Diez_Num_Impares_For {

    public static void main(String[] args) {
        int numero = 20;
        int suma_Impares= 0;

        for (int i = 1; i <= numero; i++) {
            if ( i % 2 != 0) {
                suma_Impares= suma_Impares + i;
                System.out.println(i);
            }
        }
        System.out.println("Suma impares: " + suma_Impares);
    }

}
