
package programacion_secuencial;
/*
Algoritmo que dado un año, nos diga si es bisiesto o no. 
Un año es bisiesto bajo las siguientes condiciones:
- Un año divisible por 4 es bisiesto y no debe ser divisible entre 100. 
- Si un año es divisible entre 100 y además es divisible entre 400, 
también resulta bisiesto. 

*/
public class Anio_Bisiesto_If_Else {
    public static void main(String[] args) {
        //2004 mod 2 = 0 Y 2004 mod 100 != 0 O 2004 mod 100 = 0 Y 2004 mod 400 = 0
        
        int anio= 1994;
        
//        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) 
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("es bisiesto");
        } else {
            System.out.println("no es bisiesto");
        }
        
    }
}
