/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalarma;

import java.util.Random;

/**
 *
 * @author 7fprog02
 */
public class SensorMovimiento {

    private int umbral;
    private Random r = new Random();

    public boolean hayMovimiento() {
        int nivel = r.nextInt(100) + 1;
        return nivel > umbral;

    }

    /**
     * @param umbral the umbral to set
     */
    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }
}
