
package teoria_programacion_secuencial;


public class Tipos_De_Datos_Enumerado {
    public enum  Dias {Lunes, martes, miercoles, juves, viernes, sabado, domingo};
    
    public static void main(String[] args) {
         //tipo de datos enumerados
        //codido aplicacion
        Dias diaActual= Dias.martes;
        Dias diaSiguiente= Dias.miercoles;
        
        System.out.println("hoy es :");
        System.out.println(diaActual);
        System.out.println("Mañana\nes\n"+diaSiguiente);
    }
}
