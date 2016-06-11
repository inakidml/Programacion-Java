/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofibonacci;

/**
 *
 * @author widemos
 */
public class EjercicioFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long numero1 = 0;
        long numero2 = 1;
        long fibo = 0;
        long tope = 92233720368547758L;
        double relacion = 0;
        while (tope > fibo) {
            fibo = numero1 + numero2;
            System.out.print(fibo);
            //System.out.println("fibo:"+fibo);
            //System.out.println("numero1:"+numero1);
            if (numero1 > 0) {
                relacion = (double) fibo / (double) numero1;
            }
            System.out.println("   ...   phi: " + relacion);
            numero2 = numero1;
            numero1 = fibo;

        }

    }

}
