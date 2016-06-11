/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioesprimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioEsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca el numero: ");
        int candidato = Integer.parseInt(br.readLine());
        boolean esPrimo = false;
        int divisor = 2;
        while (!esPrimo) {
            //System.out.println(candidato);
            //System.out.println(divisor);
            double resto;
            resto = candidato % divisor;
            if (candidato == divisor) {
                System.out.println("Es primo");
                esPrimo = true;
            } else {
                if (resto == 0) {
                    System.out.println("No es Primo, es divisible por lo menos por :" + divisor);
                    esPrimo = true;
                } else {
                    divisor++;
                }
            }
        }
    }
}


/* Ejercicio de Ion

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el número a comprobar: ");
        int n = Integer.parseInt(br.readLine());

        int i = 2;
        
        while ( i < n && n % i != 0) {
            i++;
        }

        if ( i < n ) {
            System.out.println("NO ES PRIMO");
        } else {
            System.out.println("ES PRIMO");
        }

*/