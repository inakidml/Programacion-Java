/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String opcion;

        do {
            System.out.print("Escribe un número: ");
            double numero = Double.parseDouble(br.readLine());

            System.out.println("a) Km/h a m/s\n"
                    + "b) m/s a Km/h\n"
                    + "c) Mph a Km/h\n"
                    + "d) Km/h a Mph\n"
                    + "e) Salir\n"
                    + "Opción:");

            opcion = br.readLine();

            switch (opcion) {
                case "a":
                    System.out.println("Resultado: " + (numero * 1000 / 3600));
                    break;
                case "b":
                    System.out.println("Resultado: " + (numero / 1000 * 3600));
                    break;
                case "c":
                    System.out.println("Resultado: " + (numero * 1.60934));
                    break;
                case "d":
                    System.out.println("Resultado: " + (numero / 1.60934));
                    break;
                case "e":

                    break;
                default:
            }

        } while (!opcion.equals("e"));
    }

}
