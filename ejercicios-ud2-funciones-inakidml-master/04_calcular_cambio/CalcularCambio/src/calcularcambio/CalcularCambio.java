/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularcambio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class CalcularCambio {

    /**
     * @param args the command line arguments
     */
    public static String calcularCambio(double cantidad, String moneda) {
        double usd = 0.9059f;
        double gbp = 1.3862f;
        double cny = 0.1408f;
        double jpy = 0.0075f;
        String cambio = "";
        switch (moneda) {
            case "USD":
                cambio = cantidad / usd + " $";
                break;
            case "GBP":
                cambio = cantidad / gbp + " £";
                break;
            case "CNY":
                cambio = cantidad / cny + " ¥";
                break;
            case "JPY":
                cambio = cantidad / jpy + " ¥";
                break;
            default:
                System.out.println("Error en la función calcularCambio");
        }

        return cambio;
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe cuantos €: ");
        double cantidad = Double.parseDouble(br.readLine());
        System.out.print("Escribe la moneda (USD, GBP, CNY, JPY: ");
        String moneda = br.readLine();

        System.out.println("El cambio a " + moneda + " es : " + calcularCambio(cantidad, moneda));
        /*
         System.out.println("el cambio a USD: " + calcularCambio(cantidad, "USD") + " $");
         System.out.println("el cambio a GBP: " + calcularCambio(cantidad, "GBP") + " £");
         System.out.println("el cambio a CNY: " + calcularCambio(cantidad, "CNY") + " ¥");
         System.out.println("el cambio a JPY: " + calcularCambio(cantidad, "JPY") + " ¥");
         */
    }

}
