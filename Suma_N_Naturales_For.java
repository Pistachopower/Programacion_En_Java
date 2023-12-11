
package programacion_secuencial;
//Se pide representar el algoritmo que nos calcule la suma de los N primeros números naturales. N se leerá por teclado 
public class Suma_N_Naturales_For {
    public static void main(String[] args) {
        int valor=5;
        int suma=0;
        
        for (int i = 1; i < valor; i++) {
            suma= suma + i;
            System.out.println(suma);
        }
        
    }
    
}
