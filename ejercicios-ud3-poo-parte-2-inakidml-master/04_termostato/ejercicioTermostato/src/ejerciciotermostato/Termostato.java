/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotermostato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 7fprog02
 */
public class Termostato {

    private double temperaturaObjetivo;
    private Termometro t;
    private Calefactor c;
   
    public Termostato(){
    t = new Termometro();
    c = new Calefactor();
    }
    

    public void init() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Que temperatura quieres?: ");
        try {
            this.temperaturaObjetivo = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Termostato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() throws InterruptedException {
        double temperaturaActual = t.getTemperatura();
        if (temperaturaActual < temperaturaObjetivo) {
            c.encender();
            
            while (temperaturaActual<temperaturaObjetivo) {
                System.out.format("Tª: %.4f\n ",temperaturaActual);
            temperaturaActual+=1;
            Thread.sleep(200);
            }
            
            
            c.apagar();
        } else {
            c.apagar();
        }
    }

   
    

}
