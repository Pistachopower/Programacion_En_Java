
package variables;

import java.util.Locale;
import java.util.Scanner;


public class EntradaDeDatos {
    public static void main(String[] args) {
        //var sc= new Scanner(System.in);
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("introduce la base: ");
        double base= sc.nextDouble();
        
        System.out.print("introduce la altura: ");
        double altura= sc.nextDouble();
        
        System.out.print("el area del rectangulo es ");
        System.out.println(base* altura);
        
        //especificadores de formato
        System.out.printf("%.1f\n", base *altura);
        sc.close();
    }
}
