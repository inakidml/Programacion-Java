/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofuncionprimos;

/**
 *
 * @author widemos
 */
public class EjercicioFuncionPrimos {

    public static boolean esPrimo(int n) {

        int i = 2;

        while (i < n && n % i != 0) {
            i++;
        }

        if (i < n) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

    }

}
