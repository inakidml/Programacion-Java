/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursividad;

/**
 *
 * @author widemos
 */
public class FactorialRecursividad {

    public static int factorial(int n) {

        if (n > 0) {

            return n * factorial(n - 1);
        } else {

            return 1;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El factorial de 5 es: " + factorial(5));
    }

}
