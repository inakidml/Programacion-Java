/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        String texto;

        double suma = 0;
        int contador = 0;

        int max = 0;    
        int min = 0;    // También puede ser Integer.MAX_VALUE

        do {
            do {
                System.out.print("Escribe un número o TERMINAR: ");
                texto = br.readLine().toLowerCase();

                if (!texto.equals("terminar")) {
                    // Tengo un NUMERO
                    numero = Integer.parseInt(texto);
                }

            } while (numero <= 0 && !texto.equals("terminar"));

            if (!texto.equals("terminar")) {
                // Hacer las operaciones de MAX, MIN y SUMA (para la media)

                // Calcular la suma
                suma += numero;
                contador++;

                // Calcular el máximo
                if (numero > max) {
                    max = numero;
                }

                if (contador == 1) {
                    min = numero;
                } else {
                    // Calcular el mínimo
                    if (numero < min) {
                        min = numero;
                    }
                }
            }

        } while (!texto.equals("terminar"));

        System.out.println("Media: " + (suma / contador));
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

    }

}
