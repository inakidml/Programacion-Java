/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistaprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioListaPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca el numero: ");
        int candidato = Integer.parseInt(br.readLine());
        boolean esPrimo = false; // variable para salir del while
        int numero = 2; // variable para cada numero hasta el candidato
        if (candidato == 1 || candidato == 0) {
            System.out.println("La proxima vez ni 0 ni 1"); //descarto 0's y 1's
        } else {
            System.out.println("1 - es primo");  // mensaje para el 1
            for (int i = 0; i < candidato; i++) { // bucle para llegar hasta el candidato
                int divisor = 2;
                while (!esPrimo) {   //bucle para saber si es primo o no cada numero
                    double resto;
                    resto = numero % divisor;
                    if (numero == divisor) {// si llego al tope no es divisible por ninguno, imprimo y salgo del while
                        System.out.println(numero + " - es primo");
                        esPrimo = true;
                    } else {
                        if (resto == 0) {
                            if (numero == candidato) {// solo digo que es divisible el candidato
                                System.out.println(numero + " - No es Primo, es divisible por lo menos por :" + divisor);
                            }
                            esPrimo = true; // me voy del while
                        } else {
                            divisor++; // nos acercamos a numero
                        }
                    }
                }
                numero++; // subo uno para seguir hasta candidato
                esPrimo = false; // para poder entrar en el while de nuevo
            }
        }
    }

}

/* Ejercicio de Ion


long t1 = System.currentTimeMillis();        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el número límite: ");
        int n = Integer.parseInt(br.readLine());
        
        System.out.println("1");
        
        for (int j = 0; j < n; j++) {

            int i = 2;

            while (i < j && j % i != 0) {
                i++;
            }

            if (i == j) {
                System.out.println(j);
            }

        }

        long t2 = System.currentTimeMillis();
        
        System.out.println("Intervalo: "+((t2-t1)/1000));


*/