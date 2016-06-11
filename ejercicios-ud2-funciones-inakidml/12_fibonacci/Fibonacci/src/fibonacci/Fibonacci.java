/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Fibonacci {

    public static long fibonacciRepetitiva(int n) {
        long numero1 = 0;
        long numero2 = 1;
        long fibo = 0;

        for (int i = 0; i < n; i++) {

            fibo = numero1 + numero2;
            //System.out.println(fibo);
            numero2 = numero1;
            numero1 = fibo;

        }
        return fibo;
    }

    public static long fibonacciRecursiva(long n) {
        if (n < 2) {
            return n;
        } else {

            return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" n-ésimo término de la sucesión de Fibonacci n = ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("repetitiva: " + fibonacciRepetitiva(n));
        System.out.println("recursiva: " + fibonacciRecursiva(n));

    }
   
}
