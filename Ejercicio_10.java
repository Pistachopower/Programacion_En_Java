package variables;

/*
  Escribe un programa en Java que calcule cuál es el espacio recorrido por un
  objeto, como por ejemplo, una sonda espacial, que se mueve a velocidad
  constante. Podemos suponer que el objeto ha recorrido un espacio inicial de
  150.000 km y se mueve a una velocidad 17 km por segundo.

 Espacio recorrido= lo que ha recorrido la sonda espacial del punto A al punto B. 
 
 Velocidad por segundo= quiere decir que por cada segundo, avanza 17 KM

 Se aplica la siguiente fórmula porque la velocidad es constante.

 Fórmula:
    Para calcular cuál es el espacio recorrido, see debe calcular el tiempo 
    transcurrido en segundo de la siguiente manera:
        tiempo_Transcurrido_Segundos= espacio_Inicial / velocidad

    Con el resultado del tiempo_Transcurrido_Segundos, ahora se puede calcular el 
    espacio recorrido:
        espacio_Recorrido= velocidad * tiempo_Transcurrido_Segundos

 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        double tiempo_Transcurrido_Segundos, espacio_Inicial,espacio_Recorrido;
        final double velocidad=17;
        
        espacio_Inicial= 150.000;
        
        tiempo_Transcurrido_Segundos= espacio_Inicial / velocidad;
        
        espacio_Recorrido= velocidad * tiempo_Transcurrido_Segundos;
        
        System.out.println("El espacio transcurrido de la sonda espacial es de " + espacio_Recorrido + "km");
 
    }

}
