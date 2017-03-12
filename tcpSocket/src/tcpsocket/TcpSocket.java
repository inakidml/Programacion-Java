/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsocket;

import java.io.IOException;

/**
 *
 * @author txiki
 */
public class TcpSocket {

//https://systembash.com/a-simple-java-tcp-server-and-tcp-client/
    private static String ip;
    private static int port;
    private static Boolean ipSeleccionada = false;
    private static TCPClient client;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Window v = new Window();
        v.setVisible(true);


        

        //TCPServer server = new TCPServer();
    }

    public static void setIp(String ip, int port) throws Exception {

        TcpSocket.ip = ip;
        TcpSocket.port = port;
        TcpSocket.ipSeleccionada = true;
        System.out.println("setIp ejecutada");
        arrancarCliente();
    }
    public static void arrancarCliente() throws Exception{
                if (ipSeleccionada) {
                client = new TCPClient(ip, port);              
            }
    }
    
    public static void enviarSentencia(String sentencia) throws IOException{
    client.enviarSentencia(sentencia);
    }
}
