/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class ParImpar {

    public static String parImpar(int numero) {
        if (numero % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un mumero: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("El número introducido es " + parImpar(n));
    }

}
