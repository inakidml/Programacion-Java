/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class ContarLetras {

    public static char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static int[] veces = new int[27];

    public static void contarLetras(String f) {

        for (int i = 0; i < abecedario.length; i++) {//paso por todas las letras del abecedario
            for (int j = 0; j < f.length(); j++) {//paso por cada una de las letras de la frase
                if (f.charAt(j) == abecedario[i]) {
                    veces[i]++;
                }
            }
        }
    }
    public static void visualizarRecuento() {
        for (int j = 0; j < 27; j++) {
            System.out.println("La letra " + abecedario[j] + " aparece " + veces[j] + " veces");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe una frase: ");
        String frase = br.readLine().toLowerCase();
        contarLetras(frase);
        visualizarRecuento();
    }

}
