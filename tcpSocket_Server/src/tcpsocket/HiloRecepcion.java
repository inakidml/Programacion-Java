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

//http://www.chuidiang.com/java/hilos/hilos_java.php
    private Socket clientSocket;

    @Override
    public void run() {
        if (clientSocket != null) {
            while (true) {
                String modifiedSentence = "";
                BufferedReader inFromServer = null;
                try {
                   inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                } catch (IOException ex) {
                    System.out.println("Excepción IO en hilo recepción");
                }
                try {
                    modifiedSentence = inFromServer.readLine();
                } catch (IOException ex) {
                    System.out.println("Excepción IO en hilo recepción");
                }
                System.out.println("FROM SERVER: " + modifiedSentence);
            }
        } else {
            //TODO mostrar en la textbox que no tenemos socket
        }
    }
//TODO detener hilo
    public void setClientSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

}
