
package variables;

public class OperadoresLogicosYDeComparacion {
    public static void main(String[] args) {
        /**
         * operadores de comparacion
         */
        
        int a1= 7;
        int b2= 6;
        
        boolean r1= a1 > b2;
        System.out.print(" a1 > b2 ");
        System.out.println(r1);
        
        int a4= 3;
        int b4= 4;
        boolean r4= a4 <= b4;
        System.out.print(" a4 <= b4 ");
        System.out.println(r4);
        
        boolean r5= a4 == b4;
        System.out.print(" a4 == b4 ");
        System.out.println(r5);
        
        boolean r6= a4 != b4;
        System.out.print(" a4 != b4 ");
        System.out.println(r6);
        
        /**
         * OPERADORES LOGICOS
         */
        int x1= 5;
        
        boolean c1= x1 > 0;
        boolean c2= x1 < 10;
        boolean c= c1 && c2;
        System.out.println("Ejemplo booleano por partes ");
        System.out.println(c);
        System.out.println("");
        
        System.out.println("Mismo ejemplo pero en una sola linea ");
        c= x1 > 0 && x1 < 10;
        System.out.println(c);
        System.out.println("");
        
        
        int x2= 5;
        c1= x2 <= 5;
        c2= x2 > 100;
        c= c1 || c2;
        System.out.println(c);
        
        boolean v= true;
        boolean f= !v;
        System.out.println(f);
        
        
    }
}
