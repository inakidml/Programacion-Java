/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioRobot {

    public static boolean comprobarMovimiento(int X, int Y) {
        if (X > 1 || Y > 1 || X < -1 || Y < -1) {
            return false;
        } else {
            if (X != Y) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // TODO code application logic here
        int movX = 0;
        int movY = 0;
        Robot Robbie = new Robot();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Introduzca el movimiento para X: ");
            movX = Integer.parseInt(br.readLine());
            System.out.print("Introduzca el movimiento para Y: ");
            movY = Integer.parseInt(br.readLine());
            if (comprobarMovimiento(movX, movY)) {
                Robbie.mover(movX, movY);
                System.out.println("La nueva posición es:");
                System.out.println("X: " + Robbie.getX());
                System.out.println("Y: " + Robbie.getY());
            }

        }
    }

}
