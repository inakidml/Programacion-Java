/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author widemos
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Excepción en tiempo de compilación
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        // Excepción en tiempo de ejecución: NumberFormatException
        String texto = "A113";
        int numero = Integer.parseInt(texto);
        System.out.println("El número es: "+numero);

        // Excepción en tiempo de ejecución ArrayIndexOutOfBounds
        double[] valores = { 1.0, 2.0, 3.0 };
        System.out.println("El valor que buscas es: "+valores[3]);

        // Excepción en tiempo de ejecución NullPointerException
        Random r = null;
        int aleatorio = r.nextInt(100);
        System.out.println("El valor aleatorio es: "+aleatorio);

        // Excepción "lanzada" por nuestro programa
        throw new Exception("Ha habido un error y no podemos continuar...");

    }
    
}
