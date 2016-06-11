/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author widemos
 */
public class Ejercicio2 {

    public static int comparar( int n1, int n2 ) {

        int resultado = 0;

        if ( n1 > n2 ) {
            resultado = 1;
        } else {
            if ( n2 > n1 ) {
                resultado = -1;
            } else {
                resultado = 0;
            }
        }
        
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("El resultado es: "+comparar(2,7));
        // -1
    }
    
}
