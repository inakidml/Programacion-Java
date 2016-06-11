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
public class Modelo {

    private int[][] tablero;
    private Ventana ventana; 
    private Controlador cont;
    public Modelo(Ventana v) {
        tablero = new int[3][3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                tablero[i][j] = 8;
            }
        }
        ventana=v;
    }

    /**
     * @return the tablero
     */
  

    /**
     * @param cont the cont to set
     */
    public void setCont(Controlador cont) {
        this.cont = cont;
    }
    public void guardarTirada(int x, int y, int jugador){
    tablero[x][y]=jugador;
    }

    /**
     * @return the tablero
     */
    public int[][] getTablero() {
        return tablero;
    }

    /**
     * @param tablero the tablero to set
     */
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    public void borrarTablero(){
    for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                tablero[i][j] = 8;
            }
        }
    }

    /**
     * @param tablero the tablero to set
     */
   
}
