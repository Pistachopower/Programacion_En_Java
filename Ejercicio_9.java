package variables;

/**
 * 9. Escribe un programa en Java que intercambie el valor de dos variables.
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        //valores iniciales 
        int a, b, c;
        a = 5;
        b = 3;
        
        System.out.println("Valores sin cambiar " + a + " " + b);
        //intercambiamos valore s
        c= b; // 3
        b= a; //5
        a= c; //3
        
        System.out.println("Valores cambiados " + a + " " + b);

    }

}
