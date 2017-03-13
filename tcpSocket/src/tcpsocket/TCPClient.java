/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsocket;

/**
 *
 * @author txiki
 */
import java.io.*;
import java.net.*;

public class TCPClient {

    private Socket clientSocket;

    public TCPClient(String ip, int puerto) throws Exception {
        System.out.println("Cliente");
        clientSocket = new Socket(ip, puerto);
        //TODO comprobar la conexión
        TcpSocket.setConnected(true);
        //Instanciamos un hilo
        HiloRecepcion hiloRx = new HiloRecepcion();
        //pasamos la referencia del socket
        hiloRx.setClientSocket(clientSocket);
        hiloRx.start();

        /*
        String modifiedSentence = "";
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        inFromServer.close();
         */
        //outToServer.close();
        //TODO detener hilo
        //clientSocket.close();
    }

    public void enviarSentencia(String sentencia) throws IOException {
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        outToServer.writeBytes(sentencia + '\n');
        //outToServer.close();

    }
}
