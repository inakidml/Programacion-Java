/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocoche;

/**
 *
 * @author 7fprog02
 */
public class Coche {

    private String marca;
    private String modelo;
    private int color;
    private int numeroMotores;
    private int numeroPuertas;
    private Motor[] motor;
    private Rueda[] ruedas = new Rueda[4];
    private Puerta[] puertas;

    public Coche(int numeroMotores, int numeroPuertas) {
        this.numeroMotores = numeroMotores;
        this.numeroPuertas = numeroPuertas;
  
        motor = new Motor[numeroMotores];
        puertas = new Puerta[numeroPuertas];
        for (int i = 0; i < this.numeroMotores; i++) {
            motor[i] = new Motor();
        }
        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda();
        }
        for (int i = 0; i < this.numeroPuertas; i++) {
            puertas[i] = new Puerta();
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return the numeroMotores
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }

    /**
     * @param numeroMotores the numeroMotores to set
     */
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    /**
     * @return the numeroPuertas
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * @param numeroPuertas the numeroPuertas to set
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * @return the motor
     */
    public Motor[] getMotor() {
        return motor;
    }

    /**
     * @return the ruedas
     */
    public Rueda[] getRuedas() {
        return ruedas;
    }

    /**
     * @return the puertas
     */
    public Puerta[] getPuertas() {
        return puertas;
    }
}
