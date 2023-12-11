/*
 Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
Para ello, se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de 
datos cuando se utilice -1 como altura). Los árboles se identifican mediante etiquetas con números únicos 
correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado.
 */
package ejercicio_clase;

import java.util.Locale;
import java.util.Scanner;

public class Arbol_Mas_Alto_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        //num_Mayor: seleccionamos el valor mayor
        double altura, num_Mayor;
        
        //etiqueta_General: asigna un numero por cada valor de la altura
        //etiqueta_Arbol_Alto= asigna un número al arbol más alto
        int etiqueta_General, etiqueta_Arbol_Alto;
        etiqueta_General= 0;
        etiqueta_Arbol_Alto= 0;
        

        System.out.println("Introduce la altura del árbol: . Pulsa -1 para salir");
        altura = teclado.nextDouble();
        
        //rellenamos num_Mayor con el primer valor como máximo
        num_Mayor= altura;

        while (altura != -1) {
            
            //verificamos si altura > num_Mayor
            if (altura > num_Mayor) {
                num_Mayor= altura;
                etiqueta_Arbol_Alto= etiqueta_General;
            }
            
            etiqueta_General= etiqueta_General + 1;
            
            System.out.println("Introduce la altura del árbol: . Pulsa -1 para salir");
            altura = teclado.nextDouble();

        }
        
        System.out.println("El árbol más alto tiene " + num_Mayor +  " y tiene el código " + etiqueta_Arbol_Alto);
    }
}
