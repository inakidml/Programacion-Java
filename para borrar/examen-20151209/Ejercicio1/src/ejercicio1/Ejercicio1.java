/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Ejercicio1 {

    public static boolean esPrimo(int n) {

        int i = 2;

        while (i < n && n % i != 0) {
            i++;
        }

        return i >= n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        do {
            System.out.print("Escribe un valor entre 100 y 1000: ");
            numero = Integer.parseInt(br.readLine());
        } while( numero < 100 || numero > 1000 );
        
        for (int i = 1; i <= numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

}
