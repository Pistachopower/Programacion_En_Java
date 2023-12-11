
package teoria_programacion_secuencial;

public class Tipos_De_Datos_Primitivos {

    public static void main(String[] args) {
        //declarar variables primitivas
        byte mes = 12;
        int contador = 0;
        final double pi = 3.1415926535897932384626433832795;
        float interes = 4.25e2F; //4.25 ^2 F= tipo flotante
        char letra = 'Z';
        boolean encontrado = true;
        
        //imprimir valores
        System.out.println(mes); //imprimirá 12
        System.out.println(contador); //imprimirá 0
        System.out.println(pi); //imprimirá 3.141592653589793
        System.out.println(interes); //imprimirá 425.0
        System.out.println(letra); //imprimirá Z
        System.out.println(encontrado); //imprimirá true
        
        // genera error porque p no tiene valor y no puede escribirla en otra variable si está vacia
        //Es necesario inicialiar
        //int p;
        //int q= p;
    }
    
}
