/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocast;

/**
 *
 * @author 7fprog02
 */
public class EjercicioCast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a = "hola";
        int b = 234;
        char c = 'a';
        
        c = (char)b;
        a = (""+(b));
        
        System.out.println("cadena " + a);
        System.out.println("entero " + b);
        System.out.println("Caracter " + c);
        
        
        
    }
    
}
