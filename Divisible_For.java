package programacion_secuencial;

//Muestra por pantalla los números del 1 al 100 (incluidos) que sean divisibles 
//entre 2 y 3. Usa un bucle Para.
public class Divisible_For {

    public static void main(String[] args) {
        int inicio, fin;
         fin= 100;

        for (int num1 = 1; num1 <= fin; num1++) {
            if (num1 % 2 == 0 || num1 % 3 == 0) {
                System.out.println(num1);
            }
        }
    }
}
