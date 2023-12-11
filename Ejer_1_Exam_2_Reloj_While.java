//Realiza el algoritmo para simular un reloj que nunca se pare. Debe mostrar la hora en formato
//	00:00:00 (hora:minuto:segundo). Por ejemplo, 05:37:09 corresponde a las 5 horas, 37 minutos
//	y 9 segundos.
//	También debes hacer que espere un segundo real para darle más realismo. Para ello, usa la
//	siguiente instrucción: Esperar 1 segundos
//	Mostrará la hora una vez por segundo, comenzando por las 23:59:59.
package programacion_secuencial;

import java.util.Scanner;

public class Ejer_1_Exam_2_Reloj_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas, minutos, segundos;

        System.out.println("Hora: ");
        horas = teclado.nextInt();

        System.out.println("Minutos: ");
        minutos = teclado.nextInt();

        System.out.println("Segundos: ");
        segundos = teclado.nextInt();

        while (true) {
            if (horas < 10) {
                System.out.print("0");
            }

            System.out.print(horas + ":");

            if (minutos < 10) {
                System.out.print("0");
            }

            System.out.print(minutos + ":");

            if (segundos < 10) {
                System.out.print("0");
            }

            System.out.println(segundos);

            segundos = segundos + 1;

            if (segundos == 60) {
                minutos = minutos + 1;
                segundos = 0;

                if (minutos == 60) {
                    horas = horas + 1;
                    minutos = 0;

                    if (horas == 24) {
                        horas = 0;
                    }
                }

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
