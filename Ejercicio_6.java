
package variables;
/*
solicitar un numero y ver si es par o impar 
*/
public class Ejercicio_6 {
    public static void main(String[] args) {
        int valor= 5;
        String evaluacion;
        
        evaluacion= (valor % 2 == 0)? "par": "impar";
        
        System.out.println("El numero " +  valor + " es " + evaluacion);
    }
}
