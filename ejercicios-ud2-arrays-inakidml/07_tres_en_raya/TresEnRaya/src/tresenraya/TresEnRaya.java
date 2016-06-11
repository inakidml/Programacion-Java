/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class TresEnRaya {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean[] comprobarGanador(int[][] tablero) {
        boolean[] resultado;
        resultado = new boolean[4];//primera posicion ganador jugador 0, segunda jugador 1, tercera hay un ganador o dos, cuarta hay un empate
        for (int i = 0; i < 4; i++) {
            resultado[i] = false;
        }
        int ganador = 8;

        if (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] != 8) {
            ganador = tablero[0][0];
            resultado[ganador] = true;
            resultado[2] = true;
        }//primera fila
        if (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2] && tablero[1][0] != 8) {
            ganador = tablero[1][0];
            resultado[ganador] = true;
            resultado[2] = true;
        }//segunda fila
        if (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2] && tablero[2][0] != 8) {
            ganador = tablero[2][0];
            resultado[ganador] = true;
            resultado[2] = true;
        }//tercera fila
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != 8) {
            ganador = tablero[0][0];
            resultado[ganador] = true;
            resultado[2] = true;
        }//diagonal uno
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != 8) {
            ganador = tablero[0][2];
            resultado[ganador] = true;
            resultado[2] = true;
        }//diagonal dos
        if (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] != 8) {
            ganador = tablero[0][0];
            resultado[ganador] = true;
            resultado[2] = true;
        }//primera columna
        if (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][1] != 8) {
            ganador = tablero[0][1];
            resultado[ganador] = true;
            resultado[2] = true;
        }//segunda columna
        if (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][2] != 8) {
            ganador = tablero[0][2];
            resultado[ganador] = true;
            resultado[2] = true;
        }//tercera columna
        if (tablero[0][0] != 8 && tablero[0][1] != 8 && tablero[0][2] != 8 && tablero[1][0] != 8 && tablero[1][1] != 8 && tablero[1][2] != 8 && tablero[2][0] != 8 && tablero[2][1] != 8 && tablero[2][2] != 8) {
            resultado[3] = true;
        }
        return resultado;
    }

    public static int[] pedirCoordenadas() throws IOException {
        String coordenada;//Dato que vamos a pedir
        String[] casilla; //array para el split de la coordenada
        casilla = new String[2];
        int[] filaColumna;
        filaColumna = new int[2]; // array para devolver
        do {
            System.out.print("Introduzca la coordenada (Fila/Columna): ");
            coordenada = br.readLine().toUpperCase();
        } while (!(coordenada.equals("1/A") | coordenada.equals("2/A") | coordenada.equals("3/A")
                | coordenada.equals("1/B") | coordenada.equals("2/B") | coordenada.equals("3/B")
                | coordenada.equals("1/C") | coordenada.equals("2/C") | coordenada.equals("3/C")));//comprobamos que es una coordenada valida

        casilla = coordenada.split("/");
        filaColumna[0] = Integer.parseInt(casilla[0]) - 1; //convertimos a int y -1 para que sea direccion de array
        switch (casilla[1]) { //switch para la letra
            case "A":
                filaColumna[1] = 0;
                break;
            case "B":
                filaColumna[1] = 1;
                break;
            case "C":
                filaColumna[1] = 2;
                break;
        }
        return filaColumna; // devolvemos coordenada
    }

    public static void visualizarTablero(int[][] tablero) {
        String[][] tableroBonito;
        tableroBonito = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tablero[i][j]) {
                    case 0:
                        tableroBonito[i][j] = " O";
                        break;
                    case 1:
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
        System.out.println("    A B C");
        System.out.println("  ---------");
        System.out.print("1 |");
        for (int i = 0; i < 3; i++) {
            System.out.print(tableroBonito[i][0]);
        }
        System.out.println(" |");
        System.out.print("2 |");
        for (int i = 0; i < 3; i++) {
            System.out.print(tableroBonito[i][1]);
        }
        System.out.println(" |");
        System.out.print("3 |");
        for (int i = 0; i < 3; i++) {
            System.out.print(tableroBonito[i][2]);
        }
        System.out.println(" |");

        System.out.println("  ---------");
        /*
         System.out.println("    A B C");
         System.out.println("  ---------");
         System.out.print("1 |");
         for (int i = 0; i < 3; i++) {
         System.out.format("%2d", tablero[i][0]);
         }
         System.out.println(" |");
         System.out.print("2 |");
         for (int i = 0; i < 3; i++) {
         System.out.format("%2d", tablero[i][1]);
         }
         System.out.println(" |");
         System.out.print("3 |");
         for (int i = 0; i < 3; i++) {
         System.out.format("%2d", tablero[i][2]);
         }
         System.out.println(" |");

         System.out.println("  ---------");
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int[][] tablero;
        tablero = new int[3][3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                tablero[i][j] = 8;
            }
        }
        int[] coordenadas;
        coordenadas = new int[2];
        boolean[] fin;
        fin = new boolean[4];
        for (int i = 0; i < 4; i++) {
            fin[i] = false;
        }
        visualizarTablero(tablero);
        System.out.println("Introducir las coordenadas en formato 1/A, 2/C...");
        System.out.println("Comienza el juego");
        System.out.println("*************************************************");
        do {
            do {
                System.out.println("Jugador 0");
                System.out.println("---------");
                coordenadas = pedirCoordenadas();
                if (tablero[coordenadas[1]][coordenadas[0]] != 8) {//si esta ocupada repetimos
                    System.out.println("CUIDADO esta OCUPADA");
                    System.out.println("Vuelve a TIRAR");
                }
            } while (tablero[coordenadas[1]][coordenadas[0]] != 8);
            tablero[coordenadas[1]][coordenadas[0]] = 0;//ponemos un 0
            visualizarTablero(tablero);
            fin = comprobarGanador(tablero);//comprobamos que no hay un empate y el tablero esta lleno
            if (!fin[3] && !fin[2]) {//para que no se quede en bucle cuando el tablero esta lleno o si ya ha ganado el jugador 0
                do {
                    System.out.println("Jugador 1");
                    System.out.println("---------");
                    coordenadas = pedirCoordenadas();
                    if (tablero[coordenadas[1]][coordenadas[0]] != 8) {
                        System.out.println("CUIDADO!!! esta OCUPADA");
                        System.out.println("Vuelve a TIRAR");
                    }
                } while (tablero[coordenadas[1]][coordenadas[0]] != 8);
                tablero[coordenadas[1]][coordenadas[0]] = 1;//ponemos un uno en el tablero
                visualizarTablero(tablero);
            }
            fin = comprobarGanador(tablero);
        } while (!fin[2] && !fin[3]);
        //System.out.println("" + fin[0] + fin[1] + fin[2]);
        if (fin[0] == fin[1]) {
            System.out.println("Ha habido un empate");
        }
        if (fin[0] == true) {
            System.out.println("El ganador ha sido el Jugador 0");
        }
        if (fin[1] == true) {
            System.out.println("El ganador ha sido el Jugador 1");
        }
    }
}
