/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirtemperatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertirTemperatura {

    public static float convertirTemperatura(float grados) {
        return (grados * 1.8f) + 32;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la temperatura en Grados Centigrados : ");
        float n = Float.parseFloat(br.readLine());
        System.out.println("La temperatura en grados Farenheit es: " + convertirTemperatura(n));
    }

}
