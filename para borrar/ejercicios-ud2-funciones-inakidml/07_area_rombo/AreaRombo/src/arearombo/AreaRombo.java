/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearombo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class AreaRombo {

    public static int areaRombo(int a, int b) {
        int area;
        area = a * b / 2;
        return area;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe una diagonal del rombo: ");
        int dprimera = Integer.parseInt(br.readLine());
        System.out.print("Escribe la otra diagonal del rombo: ");
        int dsegunda = Integer.parseInt(br.readLine());
        System.out.println("El area del rombo es: " + areaRombo(dprimera, dsegunda));
    }

}
