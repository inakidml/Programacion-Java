/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacmd;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inaki
 */
public class PruebaCmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here

        Process process=null;
        try {
            process = Runtime.getRuntime().exec("ls -l");//Lanzamos comando
        } catch (IOException ex) {
            Logger.getLogger(PruebaCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
        InputStream inputstream = process.getInputStream(); // process nos devuelve un inputstream
        BufferedInputStream bis = new BufferedInputStream(inputstream); //lo pasamos a un buffer
        Thread.sleep(1);
        try {
            //System.out.println(bis.read());
            while(bis.available()>0)//vamos sacando los caráteres
            {
                // read the byte and convert the integer to character
                char c = (char)bis.read();
                
                // print the characters
                System.out.print(c);
            }
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("Error entrada salida");;
        }
        process.destroy();
        inputstream.close();
        try {
            bis.close();
        } catch (IOException ex) {
            Logger.getLogger(PruebaCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
