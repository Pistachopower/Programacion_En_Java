package variables;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int base, altura, area, perimetro;
        base = 15;
        altura = 8;

        //aplicamos la formula 
        area = base * altura;
        perimetro = 2 * altura + 2 * base;
       
        System.out.println("El área del triángulo es " + area + " cm.");
        System.out.println("El perímetro del triángulo es " + perimetro + " cm.");


    }
}
