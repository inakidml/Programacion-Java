/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuadradosumas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioCuadradoSumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿De que número quieres saber el Cuadrado?: ");
        int numero = Integer.parseInt(br.readLine());
        int cuadrado = 0;

        for (int i = 0; i < numero; i++) {

            cuadrado = cuadrado + numero;

        }

        System.out.println("el cuadrado es: " + cuadrado);
    }

}
