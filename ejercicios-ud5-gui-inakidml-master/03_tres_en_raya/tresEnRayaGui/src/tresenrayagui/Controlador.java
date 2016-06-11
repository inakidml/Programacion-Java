/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenrayagui;

/**
 *
 * @author 7fprog02
 */
public class Controlador {

    private int turno = 0;
    private int[] coordenadas;
    private Ventana ventana;
    private Modelo mod;

    public Controlador(Ventana v, Modelo mod) {
        coordenadas = new int[2];
        ventana = v;
        this.mod = mod;
        mod.setCont(this);

    }

    public int tirada(int x, int y) {
       
        turno++;
        if (mod.getTablero()[x][y] == 8) {//si esta libre
            if (turno % 2 == 0) {
                mod.guardarTirada(x, y, 2);
                
                return 2;
            } else {
                mod.guardarTirada(x, y, 1);
                return 1;
            }
        } else {//si no esta libre
            return 9;
        }

    }

    public boolean[] comprobarGanador(int[][] tablero) {
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
    public void reiniciarJuego(){
        
        mod.borrarTablero();
       
    
    }
}
