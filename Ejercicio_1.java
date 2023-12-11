
package variables;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        double precioCoste, impuesto, margenGananciaVendedorSinImpuesto, precioFinal;
        String tipoGamaOrdenador;
        
        System.out.print("Introduce el precio de coste del ordenador: ");
        precioCoste= teclado.nextInt();
        
        //Calculamos la ganancia del vendedor (30% del coste de fabricación)
        double gananciaVendedor= 0.30 * precioCoste;
        
        //Calculamos el precio antes de impuestos sumando el coste de fabricación y la ganancia del vendedor
        margenGananciaVendedorSinImpuesto= gananciaVendedor + precioCoste;
        
        //Calculamos el impuesto aplicable (21% del precio antes de impuestos)
        double impuestoAplicable= 0.21 * margenGananciaVendedorSinImpuesto;
        
       
        // Calculamos el precio final sumando el precio antes de impuestos y el impuesto
        precioFinal= margenGananciaVendedorSinImpuesto + impuestoAplicable;
        
        //
        tipoGamaOrdenador= (precioFinal < 600)? "Normal":"De lujo";
        System.out.println("El precio final del portatil es: " + 
                precioFinal);
        System.out.println("El tipo de gama del ordenador es de " + 
                tipoGamaOrdenador);
        
        teclado.close();
    }
}
