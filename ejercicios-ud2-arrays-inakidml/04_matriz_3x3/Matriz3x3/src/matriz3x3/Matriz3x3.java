/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz3x3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author widemos
 */
public class Matriz3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int[][] matriz;
        matriz = new int[3][3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Introduce el elemento de la matriz " + i + " : " + j + " = ");
                matriz[i][j] = Integer.parseInt(br.readLine());
            }

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("************************************");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("* ");
                System.out.format("%8d", matriz[i][j]);
                System.out.print(" *");
                //System.out.println("  ");
            }
            System.out.println();
        }
        System.out.println("************************************");
        System.out.println("");
    }

}
