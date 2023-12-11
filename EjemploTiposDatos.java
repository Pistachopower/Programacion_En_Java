/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author nelson
 */
public class EjemploTiposDatos {
    public static void main(String[] args) {
        //tipos primitivos
        byte b= 8;
        short peque= 123;
        int entero= 123456789;
        long grande= 16549848484846848L;  //se usa la L para decirle que es un numero grande. Es valido la L en mayuscula o minuscula
        long otroGrande= 123_456_789l; //el _ es un ejemplo separador de miles aunque con los . es igual
        
        //numeros decimales
        float decimalPeque= 123.456f; //debe terminar con f para indicar que es float. f: es el literal de tipo float que se adigna en la variable
        double decimalGrande= 123456985954654.5485265484;
        double notacionCientifica= 1.1234123E-10; //E-10: elevada a la -10
        
        //booleanas
        boolean condicion= true;
        
        //tipo para caracter char
        /**
         * El caracter que guarda es un valor numero que hace referencia 
         * a la tabla unicode y luego se representa el caracter
         */
        
        char a= 'A'+ 2; //ejemplo que se puede hacer operaciones matematicas con caracteres usando la tabla unicode
        System.out.println(a);
        
        //tipo no primitivo String. Se usa para crear literales grandes
        String mensaje= "Hola Mundo"; //String viene en mayuscula porque corresponde a la clase String 
        
    }   
    
}
