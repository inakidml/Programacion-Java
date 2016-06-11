/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotermostato;

import java.util.Random;

/**
 *
 * @author 7fprog02
 */
public class Termometro {

    private double temperatura;
    private Random r = new Random();

    /**
     * @return the temperatura
     */
    public Termometro() {
        this.temperatura = r.nextDouble() * 35 - 5;
    }

    public double getTemperatura() {

        return temperatura;
    }

}
