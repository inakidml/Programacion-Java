/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumacinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioSumaCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Introduzca un múmero: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Introduzca otro múmero: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Introduzca otro múmero: ");
        int c = Integer.parseInt(br.readLine());
        System.out.print("Introduzca otro múmero: ");
        int d = Integer.parseInt(br.readLine());
        System.out.print("Introduzca y otro múmero: ");
        int e = Integer.parseInt(br.readLine());
        int suma = a+b+c+d+e;
        
        System.out.println("La suma de los cinco numeros es = "+(suma));
    }
    
}
