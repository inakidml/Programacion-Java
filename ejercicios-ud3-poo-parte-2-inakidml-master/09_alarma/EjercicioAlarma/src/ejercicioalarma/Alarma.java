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
public class Alarma {

    private int pin;
    private boolean activada;
    private int telefonoAviso;
    SensorMovimiento[] sensores = new SensorMovimiento[EjercicioAlarma.MAX_SENSORES];
    private Random r = new Random();
    private int numSensores;
    private int intentos = 0;

    public Alarma() {
        numSensores = r.nextInt(5) + 1;
        for (int i = 0; i < numSensores; i++) {
            SensorMovimiento sensor = new SensorMovimiento();
            sensor.setUmbral(r.nextInt(100) + 1);
            sensores[i] = sensor;
        }
    }

    public void consultarSensores() {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].hayMovimiento()) {
                System.out.println("Movimiento detectado en sensor " + i);
                System.out.println("Alarma Sonando!!!");
                System.out.println("");
                System.out.println("Llamando al nº de telefono " + telefonoAviso);
            } else {
                System.out.println("Todo Bien!! en el " + i);
            }

        }
    }

    public void activar() {
        this.activada = true;
    }

    public void desactivar(int pin) {
        if (pin == this.pin) {
            System.out.println("Alarma desactivada");
            this.activada = false;
            intentos = 0;
        } else {
            System.out.println("Codigo Erroneo");
            intentos++;
            if (intentos >= 3) {
            System.out.println("Alarma Sonando, MAXIMO número de Fallos PIN\n"
                    + "Ahora viene la policia");
        }
        }
        
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the activada
     */
    public boolean isActivada() {
        return activada;
    }

    /**
     * @param activada the activada to set
     */
    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    /**
     * @return the telefonoAviso
     */
    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    /**
     * @param telefonoAviso the telefonoAviso to set
     */
    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }
}
