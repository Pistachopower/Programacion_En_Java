package variables;

/*
calcular el area y perimetro de un circulo y mostrarlo por pantalla

area= pi * radio ^2
perimetro= 2 * pi * radio
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        double radio = 5.0;
        double area, perimetro;

        area = Math.PI * (Math.pow(radio, 2));

        perimetro = 2 * (Math.PI * radio);

        System.out.printf("El perímetro de un círculo es: %.2f cm.\n", perimetro);
        System.out.printf("El área de un círculo es: %.2f cm.\n", area);

    }
}
