/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocronometro;

/**
 *
 * @author 7fprog02
 */
public class Cronometro {
    
    private long horaInicio;
    public Cronometro(){
    this.horaInicio=System.nanoTime();
    }
    public void tiempoTranscurrido(){
        System.out.print((System.nanoTime()-horaInicio)/1000000000);
    }
    
}
