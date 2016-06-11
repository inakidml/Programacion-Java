/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String texto;
        int total = 0;
        int recuento = 0;

        do {
            System.out.print("Escribe un número (o FIN para terminar): ");
            texto = br.readLine();

            if (!texto.equals("FIN")) {
                int n = Integer.parseInt(texto);
                total += n;
                recuento++;
            }

        } while (!texto.equals("FIN"));

        if (recuento > 0) {
            System.out.println("La media es: " + (total / recuento));
        }

    }

}
