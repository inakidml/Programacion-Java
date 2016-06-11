/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalatemperatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EscalaTemperatura {

    public static float convertirTemperatura(float grados, String escala) {
        float conversion = 0;
        
        switch (escala.toUpperCase()) {
            case "F":
                conversion = (grados * 1.8f) + 32;
                break;
            case "K":
                conversion = grados + 273.15f;
                break;
                }
        return conversion;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la temperatura en Grados Centigrados : ");
        float n = Float.parseFloat(br.readLine());
        System.out.print("Introduce la escala ( F o K ) : ");
        String escala = br.readLine();
        System.out.println(n + " º Celsius son = " + convertirTemperatura(n, escala) + " º"+escala);
        /*
        if (escala.equals("F")) {
            System.out.println("La temperatura en grados Farenheit es: " + convertirTemperatura(n, escala));
        } else {
            if (escala.equals("K")) {
                System.out.println("La temperatura en grados Kelvin es: " + convertirTemperatura(n, escala));

            } else {
                System.out.println("Alguno de los datos no es correcto");
            }

        }
*/
    }

}
