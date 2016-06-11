/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomayormenor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba un numero = ");
        int numero1 = Integer.parseInt(br.readLine());
        System.out.print("Escriba otro numero = ");
        int numero2 = Integer.parseInt(br.readLine());

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
        } else {
            if (numero2 > numero1) {
                System.out.println("El numero " + numero2 + " es mayor que " + numero1);

            } else {
                System.out.println("El numero " + numero1 + " es igual que " + numero2);
            }
        }
    }

}
