/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomenuaplicaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioMenuAplicaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MENÚ");
        System.out.println("----");
        System.out.println("a) Procesador de texto.");
        System.out.println("b) Hojas de cálculo.");
        System.out.println("c) Base de datos.");
        System.out.print("Elija su opción: ");
        String seleccion = br.readLine();
        switch (seleccion) {
            case "a":
                System.out.println("a seleccionado \"Procesador de texto\"");
                break;
            case "b":
                System.out.println("a seleccionado \"Hojas de calculo\"");
                break;
            case "c":
                System.out.println("a seleccionado \"base de datos\"");
                break;
            default:
                System.out.println("la opción no es correcta");;
        }
    }
}
