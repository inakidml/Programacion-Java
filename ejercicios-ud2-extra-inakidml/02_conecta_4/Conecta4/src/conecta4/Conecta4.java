/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Conecta4 {

    public static int comprobarGanador(int[][] tablero) {
        int ganador = 0;
        int[] jugador1 = new int[42];
        int[] jugador2 = new int[42];
        for (int i = 5; i >= 0; i--) {//para empezar la matriz por abajo
            for (int j = 0; j < 7; j++) {

                if (i > 3 && tablero[i][j] == tablero[i - 1][j] && tablero[i - 1][j] == tablero[i - 2][j] && tablero[i - 2][j] == tablero[i - 3][j] && tablero[i][j] != 8) {
                    ganador = tablero[i][j];
                }//verticales
                if (j < 4 && tablero[i][j] == tablero[i][j + 1] && tablero[i][j] == tablero[i][j + 2] && tablero[i][j] == tablero[i][j + 3] && tablero[i][j] != 8) {
                    ganador = tablero[i][j];
                }//horizontales
                if (i > 3 && j < 4 && tablero[i][j] == tablero[i - 1][j + 1] && tablero[i][j] == tablero[i - 2][j + 2] && tablero[i][j] == tablero[i - 3][j + 3] && tablero[i][j] != 8) {
                    ganador = tablero[i][j];
                }//diagonales hacia la derecha
                if (i > 3 && j > 2 && tablero[i][j] == tablero[i - 1][j - 1] && tablero[i][j] == tablero[i - 2][j - 2] && tablero[i][j] == tablero[i - 3][j - 3] && tablero[i][j] != 8) {
                    ganador = tablero[i][j];
                }//diagonal izquierda
            }
        }
        return ganador;
    }

    public static void colocarFicha(int tirada, int jugador, int[][] tablero) {
        int indice = 5;
        boolean marcada = false;
        do {
            if (tablero[indice][tirada] == 8) {
                tablero[indice][tirada] = jugador;
                marcada = true;
            } else if (indice > 0) {
                indice--;

            } else {
                marcada = true;
            }

        } while (!marcada);

    }

    public static void visualizarTablero(int[][] tablero) {
        String[][] tableroBonito;
        tableroBonito = new String[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                switch (tablero[i][j]) {
                    case 1:
                        tableroBonito[i][j] = " O";
                        break;
                    case 2:
                        tableroBonito[i][j] = " X";
                        break;
                    case 8:
                        tableroBonito[i][j] = "  ";
                        break;
                    default:
                        tableroBonito[i][j] = " ?";
                }
            }
        }
        System.out.println("  1 2 3 4 5 6 7 ");
        System.out.println("-----------------");
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                System.out.print(tableroBonito[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("-----------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tirada;
        int contadorTiradas = 0;
        int[][] tablero = new int[6][7];// inicializamos tablero y ponemos a 0
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = 8;
            }
        }
        visualizarTablero(tablero);
        do {

            System.out.print("Jugador 1 (O): ");
            tirada = Integer.parseInt(br.readLine()) - 1;
            colocarFicha(tirada, 1, tablero);
            visualizarTablero(tablero);
            if (comprobarGanador(tablero) == 0) {
                System.out.print("Jugador 2 (X): ");
                tirada = Integer.parseInt(br.readLine()) - 1;
                colocarFicha(tirada, 2, tablero);
                contadorTiradas++;
                visualizarTablero(tablero);
            }
            contadorTiradas++;
        } while (comprobarGanador(tablero) == 0 && contadorTiradas < 42);
        if (comprobarGanador(tablero) != 0) {
            System.out.println("El ganador es el jugador: " + comprobarGanador(tablero));
        } else {
            System.out.println("Empate");
        }

    }

}
