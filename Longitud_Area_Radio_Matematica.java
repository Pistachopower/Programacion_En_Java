package ejercicio_clase;
import java.util.Scanner;
public class Longitud_Area_Radio_Matematica {
/*
calcular el area y perimetro de una circunferencia
*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, longitud, area;
        final double PI = Math.PI;

        System.out.println("Introduce el radio: ");
        radio = teclado.nextDouble();

        longitud = (2 * PI * radio);
        
        area = PI * Math.pow(radio, 2);
        System.out.printf("El área es: %f\n ", area);
        

        System.out.println("La longitud es " + longitud);
        //System.out.println("El área es " + area);

    }
}
