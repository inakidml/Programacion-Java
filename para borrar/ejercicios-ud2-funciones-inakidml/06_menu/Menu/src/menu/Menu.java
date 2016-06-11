/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static String menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion;
        //String seleccion = null;
        System.out.println("a) Desayuno");
        System.out.println("b) comida");
        System.out.println("c) cena");
        do {
            System.out.print("Que te aptc? : ");
            opcion = br.readLine();
            /*switch (opcion) {
             case "a":
             seleccion = "Desayuno";
             break;
             case "b":
             seleccion = "Comida";
             break;
             case "c":
             seleccion = "cena";
             break;
             default:
             System.out.println("La opcion no es correcta, vuleva a intentarlo");
             }
             */
        } while (!opcion.equals("a") && !opcion.equals("b") && !opcion.equals("c"));
        return opcion;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("la opcióin elegida es: " + menu());
    }

}
