/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author widemos
 */
public class OperacionesMatrices {
    
    public static int[][] traspuesta(int[][]mA){
    int[][] matrizTraspuesta;
        matrizTraspuesta = new int[4][4];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                matrizTraspuesta[i][j] = mA[j][i];
            }
        }
        return matrizTraspuesta;
    }
    
    public static int[][] productoMatrices(int[][]mA, int[][]mB){
    int[][] productoMatrices;
        productoMatrices = new int[4][4];
        for (int n = 0; n < productoMatrices.length; n++) {
            for (int m = 0; m < productoMatrices.length; m++) {
                for (int i = 0; i < productoMatrices.length; i++) {
                    productoMatrices[n][m] += (mA[n][i] * mB[i][m]);
                }
            }
        }
    
    return productoMatrices;
    
    }
    
    public static int[][] productoEscalarMatriz(int a, int[][]mA){
    
    int[][] matrizProductoEscalar;
        matrizProductoEscalar = new int[4][4];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                matrizProductoEscalar[i][j] = a * mA[i][j];
            }
        }
    
    return matrizProductoEscalar;
    }

    public static int[][] sumaMatriz(int[][] mA, int[][] mB) {
        int[][] matrizSuma;
        matrizSuma = new int[4][4];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                matrizSuma[i][j] = mA[i][j] + mB[i][j];
            }
        }
        return matrizSuma;
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {

                System.out.format("%8d", matriz[i][j]);

            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("**********************************");
        System.out.println("");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrizA;
        matrizA = new int[4][4];
        int[][] matrizB;
        matrizB = new int[4][4];
        Random r = new Random();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = r.nextInt(100);
                matrizB[i][j] = r.nextInt(100);
            }
        }        
        System.out.print("Introduzca un escalar para Multiplicar por la matriz A : ");
        int escalar = Integer.parseInt(br.readLine());
        
        
        

        System.out.println("**********************************");
        System.out.println("");
        System.out.println("************Matriz A**************");
        imprimirMatriz(matrizA);
        System.out.println("************Matriz B**************");
        imprimirMatriz(matrizB);
        System.out.println("***********Matriz Suma************");
        imprimirMatriz(sumaMatriz(matrizA, matrizB));
        System.out.println("******Matriz Producto Escalar*****");
        imprimirMatriz(productoEscalarMatriz(escalar, matrizA));
        System.out.println("********Producto Matrices*********");
        imprimirMatriz(productoMatrices(matrizA, matrizB));
        System.out.println("******Traspuesta de matrizB*******");
        imprimirMatriz(traspuesta(matrizB));
       

    }

}
