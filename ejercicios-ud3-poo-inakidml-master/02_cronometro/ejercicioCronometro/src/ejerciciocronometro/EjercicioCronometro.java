/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocronometro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioCronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int opcion = 0;
        int opcion2 = 0;
        int contadorCronos = 0;
        Cronometro[] crono;
        crono = new Cronometro[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        crono[0] = new Cronometro();
        do {

            System.out.print("Elija la Opción:\n"
                    + "1 - Nuevo cronómetro:\n"
                    + "2 - Consultar cronómetro\n"
                    + "3 - Salir\n"
                    + "->");
            opcion = Integer.parseInt(br.readLine());
            if (opcion == 2) {
                System.out.println("Introduzca el numero de cronómetro: ");
                opcion2 = Integer.parseInt(br.readLine());
            }

            switch (opcion) {
                case 1:
                    if (contadorCronos <= 9) {
                        crono[contadorCronos] = new Cronometro();
                        System.out.println("Cronometro " + contadorCronos + " en marcha");
                        contadorCronos++;
                    } else {
                        System.out.println("Numero máximo de cronometros creado");
                    }
                    break;
                case 2:
                    if (crono[opcion2] != null) {
                        System.out.println("El cronometro " + opcion2 + " marca: ");
                        crono[opcion2].tiempoTranscurrido();
                        System.out.println(" segundos\n" + "\n");
                    }
                    break;
                case 3:
                    break;

            }
        } while (opcion != 3);
    }

}
