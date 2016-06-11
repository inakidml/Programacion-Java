/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioCalculoN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el numero de operandos: ");
        int veces = Integer.parseInt(br.readLine());
        System.out.print("Introduzca la operación (+,-,*,/): ");
        String operacion = br.readLine();
        int operando = 0;
        int resultado = 0;
        switch (operacion) {
            case "+":
                for (int i = 0; i < veces; i++) {
                    System.out.print("Introduzca operador " + (i + 1) + " :");
                    operando = Integer.parseInt(br.readLine());
                    resultado = resultado + operando;
                }
                break;

            case "*":
                resultado = 1;
                for (int i = 0; i < veces; i++) {
                    System.out.print("Introduzca operador " + (i + 1) + " :");
                    operando = Integer.parseInt(br.readLine());
                    resultado = resultado * operando;
                }
                break;
            case "/":
                resultado = 1;
                for (int i = 0; i < veces; i++) {
                    System.out.print("Introduzca operador " + (i + 1) + " :");
                    operando = Integer.parseInt(br.readLine());
                    if (i == 0) {
                        resultado = operando;
                    } else {
                        resultado = resultado / operando;
                    }
                }
                break;
            case "-":
                for (int i = 0; i < veces; i++) {
                    System.out.print("Introduzca operador " + (i + 1) + " :");
                    operando = Integer.parseInt(br.readLine());
                    if (i == 0) {
                        resultado = operando;
                    } else {
                        resultado = resultado - operando;
                    }
                }
                break;
            default:
                System.out.println("la proxima vez, introduzca bien el simbolo de la operación");
        }
        System.out.println("La operacion es igual a: " + resultado);
    }
}
