/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocambios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioCambios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba el precio del producto = ");
        double precio = Double.parseDouble(br.readLine());
        //System.out.println("precio; " + precio);
        System.out.print("Escriba el dinero introducido = ");
        double dinero = Double.parseDouble(br.readLine());
        int moneda2Euro;
        int moneda1Euro;
        int moneda50cent;
        int moneda20cent;
        int moneda10cent;
        int moneda5cent = 0;
        int moneda2cent;
        int restoEuro;

        int vueltas = (int)(dinero * 100 - precio * 100);
        //System.out.println("Vueltas: " + vueltas);
        if (vueltas < 0) {
            System.out.println("No LLega!!!!!");
        } else {

            if (!((vueltas % 2) == 0)) {

                // System.out.println("va por los impares");
                moneda2Euro = vueltas / 200;
                restoEuro = vueltas % 200;
                moneda1Euro = restoEuro / 100;
                restoEuro = restoEuro % 100;
                restoEuro = restoEuro - 5;
                moneda5cent = moneda5cent + 1;
                moneda50cent = restoEuro / 50;
                restoEuro = restoEuro % 50;
                moneda20cent = restoEuro / 20;
                restoEuro = restoEuro % 20;
                moneda10cent = restoEuro / 10;
                restoEuro = restoEuro % 10;
                //moneda5cent = moneda5cent + (restoEuro / 5);
                //restoEuro = restoEuro % 5;
                moneda2cent = restoEuro / 2;
                restoEuro = restoEuro % 2;

            } else {
                // System.out.println("va por los pares");
                moneda2Euro = vueltas / 200;
                restoEuro = vueltas % 200;
                moneda1Euro = restoEuro / 100;
                restoEuro = restoEuro % 100;
                moneda50cent = restoEuro / 50;
                restoEuro = restoEuro % 50;
                moneda20cent = restoEuro / 20;
                restoEuro = restoEuro % 20;
                moneda10cent = restoEuro / 10;
                restoEuro = restoEuro % 10;
                moneda2cent = restoEuro / 2;
                restoEuro = restoEuro % 2;

            }

            System.out.println("Las vueltas se componen de:");
            System.out.println("Monedas de 2 Euros: " + moneda2Euro);
            System.out.println("Monedas de 1 Euro: " + moneda1Euro);
            System.out.println("Monedas de 50 Centimos: " + moneda50cent);
            System.out.println("Monedas de 20 Centimos: " + moneda20cent);
            System.out.println("Monedas de 10 Centimos: " + moneda10cent);
            System.out.println("Monedas de 5 Centimos: " + moneda5cent);
            System.out.println("Monedas de 2 Centimos: " + moneda2cent);
            System.out.println("Resto, sobra: " + restoEuro);

        }
    }
    
}
