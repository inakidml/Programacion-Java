/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrepetitiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class FactorialRepetitiva {
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = n; i > 0; i--) {

            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println( n + "! = " + factorial(n));
    }

}
