/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocienparimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioCienParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Desea ver los 100 primeros números pare o impares?, (P,I): ");
        String seleccion = br.readLine();
        int contador;
        switch (seleccion.toUpperCase()) {
            case "P":
               contador =2;
                for (int i = 0; i < 100; i++) {
                    System.out.println(contador);
                    contador=contador+2;
                }
                break;
            case "I":
               contador=1;
               for (int i = 0; i < 100; i++) {
                    System.out.println(contador);
                    contador=contador+2;
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
