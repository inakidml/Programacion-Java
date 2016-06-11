/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturasdia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class TemperaturasDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int contador = 0;
        int max = 0;
        int min = 0;
        //System.out.println(min + " " + max);
        double suma = 0;
        //double[] temperaturas;
        //temperaturas = new double[24];
        double[] temperaturas = {15.0, 15.2, 15.1, 15.2,
            15.1, 15.1, 14.9, 16.1, 16.5,
            17.2, 19.5, 20.0, 22.1,
            23.3, 25.2, 26.3, 25.9,
            25.8, 24.2, 24.1, 20.7,
            19.6, 17.3, 16.5};
        for (int i = 0; i < 24; i++) {
            //System.out.print("Introduzca la Tª a las " + i + " : ");
            //temperaturas[i] = Double.parseDouble(br.readLine());
            suma += temperaturas[i];
            if (temperaturas[min] > temperaturas[i]) {
                min = i;
            }
            if (temperaturas[max] < temperaturas[i]) {
                max = i;
            }
        }
        for (int i = 0; i < 24; i++) {
            System.out.format(" %02d ", i);
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" " + temperaturas[i]);
            if (i == min) {
                System.out.print(" ---> min");
            }
            if (i == max) {
                System.out.print(" ---> max");
            }
            System.out.println();
        }
        System.out.format("Media: %2.2f%n", (suma / 24));
    }
}
