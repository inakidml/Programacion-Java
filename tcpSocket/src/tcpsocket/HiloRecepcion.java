/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inaki
 */
public class HiloRecepcion extends Thread {
//ya no se usa
//http://www.chuidiang.com/java/hilos/hilos_java.php
    private Socket clientSocket;

    @Override
    public void run() {
        if (clientSocket != null) {
            while (true) {
                try {
                    String modifiedSentence = "";
                    if (clientSocket.getInputStream() != null) {
                        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        while((modifiedSentence = inFromServer.readLine()) != null){
                        //modifiedSentence = inFromServer.readLine();
                        System.out.println("FROM SERVER: " + modifiedSentence);
                        }
                        
                        
                        //inFromServer.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(HiloRecepcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            //TODO mostrar en la textbox que no tenemos socket
            System.out.println("no hay socket");
        }
    }
//TODO detener hilo

    public void setClientSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

}
