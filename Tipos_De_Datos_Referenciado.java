package teoria_programacion_secuencial;

public class Tipos_De_Datos_Referenciado {

    public static void main(String[] args) {
        //tipos referenciado: se usa para array y objetos 
        //int [] arrayDeEntero se dice asi porque se refiere a la direccion de memoria donde va a guardar
        //el dato

        int i = 10;
        double d = 3.14;
        char c1 = 'a';
        char c2 = 65; //valor Unicode para 'A' es U+0041 en hexadecimal o 65 en decimal.
        boolean encontrado = true;
        String msj = "Bienvenido java";
        Long num1 = 150L;

        //ejemplo de secuencia de escape. Es útil para trabajar ficheros
        String prueba = "hola\nmundo"; //salto de linea
        String prueba2 = "hola  \"mundo\""; //poner comillas dentro de una cadena
        String prueba3 = "hola\tmundo"; //poner espacios en dos palabras

        //ejemplo de espacio de memoria float(4) y double (8) -no esta claro-
        //float num3= 8.5;
        //double num4= 8.5
//        System.out.println(prueba3);
//        System.out.println(prueba2);
//        System.out.println(prueba);
//        System.out.println(num1);
//        System.out.println(i);        
//        System.out.println(d);
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(encontrado);
//        System.out.println(msj);
        /*
        Literal: es un valor que se puede representar en cualquier tipo de dato. 
        Por ejemplo: int numero= 10 --> esto es un literar; boolean valor= false <-- literal.
        
        expresiones 
        suma = i + 1; //machaca el valor de suma y pone la suma de i + 1
        suma = suma + i + 1; //adiciona suma con i + 1
        
        tipo de operando
        Un operando de tipo long y ninguno real (float o double)--> devuelve long
        Ningún operando de tipo long ni real (float o double) --> devuelve int
        Al menos un operando de tipo double --> devuelve double
        Al menos un operando de tipo float y ninguno double --> devuelve float
        
        EJEMPLO
         */
        float v1 = 8.8f;
        double v2 = 3.1;
        int v3 = 2;
        int v4 = 4;
        double div = v2 / v3; //devuelve double

        System.out.println(div);

        int div1 = v3 / v4; //0,5 pero muestra 0 porque toma la parte entera

        System.out.println(div1);

        double div2 = v3 / v4; //resultado es 0,5 pero muestra 0,0

        System.out.println(div2);

        //
        double div3 = (double) v3 / v4; //(double)v3= 2 cambia a 2.0 porque lo pasaste a double

        System.out.println(div3);
    }

}
