/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoparametro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class HolaMundoParametro {
 public static void holaMundo(String nombre) {
        System.out.println("¡Hola "+nombre+ " !");
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe el nombre: ");
        String nombre = br.readLine();
        holaMundo(nombre);
        
        
    }
    
}
