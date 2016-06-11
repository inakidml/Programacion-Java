/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiasemana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioDiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce el número de día de la semana (1-7): ");
        String dia = br.readLine();
        switch (dia) {
            case "1":
                System.out.println("Lunes");
                break;
            case "2":
                System.out.println("Martes");
                break;
            case "3":
                System.out.println("Miércoles");
                break;
            case "4":
                System.out.println("Jueves");
                break;
            case "5":
                System.out.println("Viernes");
                break;
            case "6":
                System.out.println("Sabado");
                break;
            case "0":
            case "7":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El valor introducido no es correcto");
        }
    }
}
