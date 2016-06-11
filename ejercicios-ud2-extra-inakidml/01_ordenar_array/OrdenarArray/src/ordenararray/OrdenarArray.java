/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenararray;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class OrdenarArray {

    public static void visualizarArray(int[] array) {
        for (int i = 0; i < 10; i++) {

            System.out.format("%3d", array[i]);

        }
        System.out.println("");
    }

    public static int[] ordenar(int[] array) {
        int[] arrayOrdenado = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i] < array[j]) {
                    contador++;
                }

            }
            if (arrayOrdenado[9 - contador] == array[i]) {//por si salen repetidos, que es bastante habitual por cierto...
                arrayOrdenado[9 - (contador + 1)] = array[i];
            } else {
                arrayOrdenado[9 - contador] = array[i];

            }
            contador = 0;
        }

        return arrayOrdenado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        visualizarArray(array);
        visualizarArray(ordenar(array));
    }

}
