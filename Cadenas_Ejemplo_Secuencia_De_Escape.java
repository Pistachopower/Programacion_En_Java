package teoria_programacion_secuencial.Ejemplos;

public class Cadenas_Ejemplo_Secuencia_De_Escape {

    /*
    realiza un programa que al colocar una cadena unida las separe, aparezca separada y una palabra en comillas
     */
    public static void main(String[] args) {
        String cadena1 = "holamundo";
        
        String cadenaConSecuenciaEscape_Tabulada= "hola\tmundo";
        String cadenaConSecuenciaEscape_Salto_Linea= "hola\nmundo";
        String cadenaConSecuenciaEscape_Comillas= "hola\t  \"mundo\"";
        
        System.out.println("cadena anterior: " + cadena1 + " | " + "La cadena separada: " + cadenaConSecuenciaEscape_Tabulada);
        System.out.println("cadena anterior: " + cadena1 + " | " + "La cadena con salto de linea: " + cadenaConSecuenciaEscape_Salto_Linea);        
        System.out.println("cadena anterior: " + cadena1 + " | " + "La cadena con salto de linea: " + cadenaConSecuenciaEscape_Comillas);         
                
    }

}
