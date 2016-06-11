/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrorectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class PerimetroRectangulo {

    public static double perimetroRectangulo(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca la altura del rectangulo: ");
        double altura = Double.parseDouble(br.readLine());
        System.out.print("Introduzca la base del rectangulo: ");
        double base = Double.parseDouble(br.readLine());
        System.out.println(perimetroRectangulo(altura, base));
    }

}
