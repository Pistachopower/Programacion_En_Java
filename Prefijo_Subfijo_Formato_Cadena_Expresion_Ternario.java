package teoria_programacion_secuencial;

import java.util.Scanner;

public class Prefijo_Subfijo_Formato_Cadena_Expresion_Ternario {

    public static void main(String[] args) {
        /*
        En Java, los prefijos y posfijos son operadores unarios que se aplican a variables o valores.
        Aquí tienes ejemplos de cómo usar prefijos y posfijos en Java con la utilidad de incremento
        y decremento:
       
        Prefijo de incremento (++var):
        int a = 5;
        int b = ++a;
        // Ahora, 'a' es igual a 6 y 'b' es igual a 6

        Posfijo de incremento (var++):
        int a = 5;
        int b = a++;
        // Ahora, 'a' es igual a 6, pero 'b' es igual a 5
       
       
       
        El método printf en Java se utiliza para formatear y mostrar texto en la consola o en
        otros flujos de salida, como archivos. Permite especificar un formato para la salida de
        datos, lo que es especialmente útil cuando se desea controlar la apariencia de los números,
        cadenas y otros tipos de datos en la salida. Aquí tienes algunos ejemplos de cómo usar printf
        en Java:
       
        int num = 42;
        double pi = Math.PI;
        String name = "John";

        // Formatear un número entero
        System.out.printf("El número es: %d%n", num);

        // Formatear un número de punto flotante (con 2 decimales)
        System.out.printf("El valor de PI es: %.2f%n", pi);

        // Formatear una cadena
        System.out.printf("Hola, %s!%n", name);

        // Alinear a la derecha y rellenar con ceros
        int paddedNum = 7;
        System.out.printf("Número con relleno de ceros: %04d%n", paddedNum);

        // Especificar la longitud mínima del campo y la precisión
        double value = 12345.6789;
        System.out.printf("Valor formateado: %10.2f%n", value);

        // Formatear números en notación científica
        double scientificNum = 12345.6789;
        System.out.printf("Notación científica: %e%n", scientificNum);

        // Uso de banderas de formato (alinear a la izquierda)
        String leftAligned = "Texto alineado a la izquierda";
        System.out.printf("%-30s%n", leftAligned);
       
        
       
        //operador ternario o condicional
        //x--> verdadero / y--> falso
        int x = 8;
        int y = 20;
        boolean a= true;
        boolean b= false;
        boolean fin;
        int z;

        z = (x > y) ? x : y;
       
        fin= (a != b) ? a:b;

        System.out.println(z);
        System.out.println(fin);
        
                Scanner teclado= new Scanner(System.in);
        int num1, num2;
        String cadena;
     
        System.out.println("coloca un valor: ");
        num1= teclado.nextInt();
       
        System.out.println("coloca otro valor: ");
        num2= teclado.nextInt();
       
        cadena= (num1 == num2)? "iguales": "distintos";
       
        System.out.printf("Los numeros %d y %d son %s\n", num1,num2, cadena);
         */

        //ejemplo con uso del objeto scanner, formato de cadena, operador ternario
        //VISTO EN CLASE
        //Declarar variables:
        System.out.println("\\\\Declarar variables");

        int nombre_int = 8; //Numeros enteros
        double nombre_double = 4.5; //Numeros con decimales
        boolean nombre_true = true; //Verdadero
        boolean nombre_false = false; //Falso
        char nombre_char = 'N'; //Carcateres
        String nombre_string = "Nelson";

        System.out.println(nombre_int);
        System.out.println(nombre_double);
        System.out.println(nombre_true + " o " + nombre_false);
        System.out.println(nombre_char);
        /*Salto de linea*/ System.out.println("");

        //Print
        System.out.println("\\\\Print");

        //Concatenar
        System.out.println(nombre_string + " tiene una " + nombre_char);

        //printf
        int x = 5, y = 50;
        float a = 3.2f, b = 5.3f;
        double d = 23.2;
        // %s = mascara tipo string
        // %d = mascara numero enteros
        // %c = mascara caracteres
        // %b = mascara booleanos
        // %f = mascara float
        // \n = salto de linea (Secuencia de Escape)
        // %.4f = mascara para colocar la cantidad de decimales
        
        
        System.out.printf("%s\n %s %d\n", "Division entera:", "y / x = ", (y / x));
        System.out.printf("Un valor tipo short: %d\n", x);
        System.out.printf("Un valor tipo int: %d\n", x);
        System.out.printf("%d\n", y / x);
        System.out.printf("Ta,bien se puede poner literales: %d\n", 5);
        System.out.printf("Un valor tipo float: %f\n", a);
        System.out.printf("Un valor tipo float con 4 decimales: %.4f\n", a);
        System.out.printf("%f\n", a + b);
        System.out.printf("Un valor tipo double: %f\n", d);
        System.out.printf("Un valor tipo Caracter: %c\n", nombre_char);
        System.out.printf("Un valor tipo booleano: %b\n\n", nombre_true);

        //Secuencia de Escape    
        System.out.println("\\\\Secuencia de Escape");
        System.out.println("Hola\nMundo");
        System.out.println("Holaaa\tMundo");
        System.out.println("Holaaa\nMundo");
        System.out.println("Holaaa \'Mundo\'");
        /*Salto de linea*/ System.out.println("\n");

        //Operadores
        System.out.println("\\\\Operadores");
        int num1 = 2, num2 = 4;
        int div = num1 / num2;
        double div2, div3, div4;
        div2 = num1 / num2;
        div3 = (double) num1 / num2;
        div4 = num1 / (double) num2;

        System.out.println(div + "\t" + div2 + "\t" + div3 + "\t" + div4);

        //num1 = 2;
        int div5 = ++num1;
        int div6 = num1++;
        System.out.println(div5 + "\t" + div6 + "\t" + num1);
        /*Salto de linea*/ System.out.println("\n");

        //Condicion
        System.out.println("\\\\Condicion");
        x = 8;
        y = 20;
        int resultado;
        resultado = (x > y) ? x : y;
        //(x>y) ? x:y -> si es verdadero devuelve x , si es falso devuelve y
        System.out.println(resultado);
        //Otra manera de escribirlo -> System.out.println((x>y) ? x:y);

    }
}
