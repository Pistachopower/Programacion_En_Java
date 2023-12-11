
package teoria_programacion_secuencial.Ejemplos;
/*
 Escribe un programa java que declare una variable A de tipo entero 
y asígnale un valor. A continuación muestra un mensaje indicando si 
A es par o impar. Utiliza el operador condicional ( ? : ) dentro del 
println para resolverlo.
Si por ejemplo A = 14 la salida será

14 es par

Si fuese por ejemplo A = 15 la salida será:

15 es impar

Ejercicio 2
 Escribe un programa java que declare una variable B de tipo entero 
y asígnale un valor. A continuación muestra un mensaje indicando si 
el valor de B es positivo o negativo. Consideraremos el 0 como positivo. 
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo B = 1 la salida será

1 es positivo

Si fuese por ejemplo B = -1 la salida será:

-1 es negativo
*/
public class Operadores_Ternarios_Condicionales {
    public static void main(String[] args) {
//        int a= 15;
//        String par= " es par", impar= " es impar", resultado;
//        resultado= (a % 2 == 0) ? par: impar;
//        
//        System.out.println(a + resultado);

        int b= -5;
        System.out.println(b + ((b >= 0) ? " es positivo": " es negativo"));
        
    }
}
