
package variables;


public class OperadoresBits {
    public static void main(String[] args) {
        int x1= 10; //00001010
        int y1= x1 << 2; //0000101000 desplaza 2 ceros al final
        
        System.out.println("Ejemplo de bit que se desplazan a la izquierda");
        System.out.println(x1 + " - " + Integer.toBinaryString(x1));
        System.out.println(y1 + " - " + Integer.toBinaryString(y1));
        System.out.println("");
        
        int x2= 40; //00101000
        int y2= x2 >> 2; //00001010 desplaza 2 ceros al final
        
        System.out.println("Ejemplo de bit que se desplazan a la derecha ");
        System.out.println(x2 + " - " + Integer.toBinaryString(x2));
        System.out.println(y2 + " - " + Integer.toBinaryString(y2));
        System.out.println("");
        
        int x3= -40; //
        int y3= x3 >>> 2; //desplaza 2 ceros al final
        
        System.out.println("Ejemplo de bit que se desplazan a la derecha sin signo ");
        System.out.println(x3 + " - " + Integer.toBinaryString(x3));
        System.out.println(y3 + " - " + Integer.toBinaryString(y3));
        System.out.println("");
        
        //int x4= 10; //00001010
        //int y4= 20; //00010100
        //int res2= x4 & y4;
        //int res2= x4 | y4;
        
        int x4= 1; //uso con ^
        int y4= 1; //uso con ^
        
        int res2= x4 ^ y4;
        
        System.out.println("Ejemplo  operadores AND, OR, XOR");
        System.out.print(x4 + " - " + Integer.toBinaryString(x4));
        System.out.println("");
        System.out.println(y4 + " - " + Integer.toBinaryString(y4));
        //System.out.println("");
        System.out.println(res2 + " - " + Integer.toBinaryString(res2));
        
    }
}
