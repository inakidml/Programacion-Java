/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradosumas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuadradoSumas {

    public static int cuadrado(int n) {
        int cuadrado = 0;
        int impares = 1;
        /*
         for (int i = 0; i < n; i++) {
         cuadrado = n + cuadrado;
         }
         */
        for (int i = 0; i < n; i++) {
            cuadrado = cuadrado + impares;
            impares = impares + 2;
        }
        return cuadrado;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un numero: ");
        int numero = Integer.parseInt(br.readLine());
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado(numero));
    }
}
