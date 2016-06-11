/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        do {
            System.out.print("Escribe un número: ");
            double numero = Double.parseDouble(br.readLine());

            System.out.print("1. Libras a kilogramos\n"
                    + "2. Onzas a gramos\n"
                    + "3. Stone a libras\n"
                    + "4. Salir\n"
                    + "Opción: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    System.out.println(numero + " libras son " + (numero * 0.453592) + " kilogramos.");
                    break;
                case 2:
                    System.out.println(numero + " onzas son " + (numero * 28.3495) + " gramos.");
                    break;
                case 3:
                    System.out.println(numero + " stones son " + (numero * 14) + " libras.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR");
            }

        } while (opcion != 4);
    }

}
