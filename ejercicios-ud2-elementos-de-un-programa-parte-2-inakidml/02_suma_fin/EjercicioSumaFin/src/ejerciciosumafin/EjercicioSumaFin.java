/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumafin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioSumaFin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int suma = 0;
        int sumando;
        String dato = "False";
        while (!dato.equals("FIN")) {
            System.out.print("Introduzca sumando o (FIN) :");
            dato = br.readLine();
            if (!dato.equals("FIN")) {
                sumando = Integer.parseInt(dato);
                suma += sumando;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
