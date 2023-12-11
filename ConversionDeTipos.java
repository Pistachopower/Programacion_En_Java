package variables;

public class ConversionDeTipos {

    public static void main(String[] args) {
        /*
        Tipo de conversion o casting
        Conversion automatica o implicita: se hace cuando un tipo de dato 
        puede ser guardado en otro que tiene mas espacio de memoria, es decir
        tener un byte y guardarlo en un short
         */

        //Conversion automatica o implicita
        int i = 1234567;
        long l = i; //no hay perdida de informacion 
        //System.out.println(l);

        /*
        Conversion manual o explicita_: funciona de tipos mas pequeños 
        a mas grande, pero no al contrario.
        
        ¡OJO! Casos especiales con int o long hacia float o double
         */
//Con pérdida de precision (lo que hace es redondear el valor)
        long l2 = 123_456_123_456l;
        System.out.println("Conversion de long --> float");
        System.out.println(l2);
        float f2= l2;
        System.out.printf("%.2f\n", f2);
        System.out.println("");
        double d2= l2;
        System.out.println("Conversion de long --> double");
        System.out.println(l2);
        System.out.printf("%.2f\n", d2);
        System.out.println("");
        
        //ejemplo mas claro
        int big= 1234567890;
        float aprox= big;
        System.out.println("Conversion de int --> float");
        System.out.println(big);
        System.out.println(aprox);
        System.out.println(big - (int) aprox);
        System.out.println("");
        /**
         * Conversion explicita 
         * Se realiza de forma manual indicando el tipo de dato
         * entre parentesis a la izquierda del valor que queremos
         * transformar
         * /
         //ejemplo: int a short 
        */
        int i3=1234;
        short s3= (short) i3;
        System.out.println("Conversion de int --> short");
        System.out.println(i3);
        System.out.println(s3);
        System.out.println("");
        
        //de mayor a menor tamaño la conversion
        double d3= 123456.789;
        float f3= (float) d3;
        System.out.println("Conversion de double --> float");
        System.out.println(d3);
        System.out.println(f3);
        System.out.println("");
    }
}
