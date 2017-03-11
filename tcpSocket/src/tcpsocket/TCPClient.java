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

public class TCPClient
{
 public TCPClient(String ip, int puerto) throws Exception
 {
     System.out.println("Cliente");
  String sentence;
  
  BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
  Socket clientSocket = new Socket(ip, puerto);
  //Instanciamos un hilo
  HiloRecepcion hiloRx = new HiloRecepcion();
  //pasmos la referencia del socket
  hiloRx.setClientSocket(clientSocket);
  hiloRx.start();
  
  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  sentence = inFromUser.readLine();
  outToServer.writeBytes(sentence + '\n');
  
  
  //TODO detener hilo
  clientSocket.close();
 }
}

