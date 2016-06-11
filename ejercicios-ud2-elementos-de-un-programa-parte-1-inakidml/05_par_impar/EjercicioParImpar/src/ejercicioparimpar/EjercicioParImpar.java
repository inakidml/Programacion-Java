/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioparimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba un numero = ");
        int numero1 = Integer.parseInt(br.readLine());

        if (numero1 % 2 == 0 ) {

            System.out.println("El número es par");

        } else {
            
                System.out.println("el numero es impar");
            }

        }
    }
