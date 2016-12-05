/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoresresolucion;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

/**
 *
 * @author inaki
 */
public class MonitoresResolucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        GraphicsDevice[] gdL = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        for (GraphicsDevice graphicsDevice : gdL) {
            System.out.println(graphicsDevice);
            //graphicsDevice.getFullScreenWindow();
            int width = graphicsDevice.getDisplayMode().getWidth();
            int height = graphicsDevice.getDisplayMode().getHeight();
            System.out.println("W= " + width + ", H= " + height);

        }
        System.out.println("Default Screen");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//solo el monitor default        
        System.out.println(screenSize);
        System.out.println(screenSize.getHeight());
        System.out.println(screenSize.getWidth());

    }

}
