
package variables;

public class Operadores_Aritmeticos {
    public static void main(String[] args) {
        //operadores binarios: es decir que requiere dos operadores de tipo 
        //numericos. Por ejemplo, suma, resta, multiplicacion, division, resto
        
        System.out.println("OPERADORES ARITMETICOS BASICOS ");
        int i1= 7;
        int i2= 5;
        int i= i1 + i2;
        System.out.println(i);
        System.out.println("");
        
        float f1= 123.45f;
        float f2= 456.34f;
        float f= f1 - f2; 
        System.out.println(f);
        System.out.println("");
        
        //No es lo mismo division entera que con decimales
        int resultadoDivisionEntera= 3 / 2;//1
        float resultadoDivisionDecimales= 3.0f / 2.0f;
        System.out.println("Resultado division entera ->" +  resultadoDivisionEntera);
        System.out.println("Resultado division con decimales ->" +  resultadoDivisionDecimales);
        System.out.println("");
        
        int resto= i1 % i2;
        System.out.println(resto);
        System.out.println("");

        System.out.println("OPERADORES ARITMETICOS DE ASIGNACION");
        int a= 7;
        //a= a + 1;
        a += 1;
        System.out.println(a);
        
        int c= 3;
        //c= c * 2;
        c *= 2;
        System.out.println(c);
        System.out.println("");
        
        System.out.println("OPERADORES ARITMETICOS UNARIOS ");
        int e= 8;
        int eNegativo= - e;
        System.out.println(eNegativo);
        System.out.println("");
        
        //PREINCREMENTO
        System.out.println("Preincremento");
        int inc= 8;
        int preIncremento= ++inc; //9
        System.out.println(preIncremento);
        System.out.println(inc);
        System.out.println("");
        
        //POSTINCREMENTO 
        System.out.println("Posincremento");
        inc= 8;
        int postIncremento= inc++; //8
        System.out.println(postIncremento);
        System.out.println(inc);
        System.out.println("");
        
        System.out.println("PRECEDENCIA DE OPERADORES");
        int r1= 1 + 3 * 4; //13 tiene prioridad la multiplicacion
        int r2= (1 + 3) * 4; //16
        System.out.println(r1);
        System.out.println(r2);
        
        
        
        
        
        
        
        
    }
}
