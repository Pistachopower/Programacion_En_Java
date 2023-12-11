
package variables;


public class EjemploInferencia {
    public static void main(String[] args) {
        /*
        Java es un lenguaje de programacion fuertemente tipado 
        Una variable no puede cambiar de tipo si no es a traves
        de una conversion
        
        Usualmente, asignamos el tipo de forma estatica (al declarar
        la variable). Ejemplo: int x;
        
        El uso es cuando no nos interesa tanto la memoria
        
        */
        //ejemplo de tipado estatico
        String cadena_a= "Hola Mundo";
        int x_1= 9;
        double decimal_1= 123.5484;
        float decimal_Flotante_1= 1234785.4894945F;
        
        //pero permite hacer inferencia con java10 en variables locales
        //es decir que puede colocar la palabra var seguido del nombre 
        //de la variable y el dato que quieres
        //ejemplo tipado local
        var cadena= "Hola a todos";
        var x= 7;
        var decimal= 123.456;
        var decimal_Flotante= 123.456f;
        
        //no permite solamente la inicializacion
        //var prueba;
        
        
        
        
    }
}
