/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz10x10;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class Matriz10x10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[10][10];

        Random r = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = r.nextInt(100);

            }

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("**********************************************************************");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("* ");
                System.out.format("%3d", matriz[i][j]);
                System.out.print(" *");
                //System.out.println("  ");
            }
            System.out.println();
        }
        System.out.println("**********************************************************************");
        System.out.println("");
    }

}
