
package variables;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //llamamos a la clase scanner y creamos el objeto scanner con otra libreria useLocale para poner a punto los decimales
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);
        double n1, n2, n3, nota_Final, nota_Final_R;
        
        String nota_Texto;
        
        System.out.println("nota 1: ");
        n1= sc.nextDouble();
        
        System.out.println("nota 2: ");
        n2= sc.nextDouble();
        
        System.out.println("nota 3: ");
        n3= sc.nextDouble();
        
        nota_Final= (n1+n2+n3) / 3.0;
        nota_Final_R= Math.round(nota_Final);
        System.out.println("La nota final es " + nota_Final_R);
        
        nota_Texto= (nota_Final >= 5)? "Aprobado":"Suspenso" ;
        
        System.out.println("Por lo tanto el alumno está en " + nota_Texto);
    }
}
