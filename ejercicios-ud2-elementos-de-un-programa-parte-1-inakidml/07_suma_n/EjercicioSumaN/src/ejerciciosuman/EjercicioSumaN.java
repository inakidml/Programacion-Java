/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioSumaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el numero de sumandos: ");

        int veces = Integer.parseInt(br.readLine());

        int suma = 0;

        for (int i = 0; i < veces; i++) {

            System.out.print("Introduzca sumando " + (i + 1) + " :");

            int sumando = Integer.parseInt(br.readLine());
            suma = suma + sumando;

        }

        System.out.println("La suma es: " + suma);

    }

}
