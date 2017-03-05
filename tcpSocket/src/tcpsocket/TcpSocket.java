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
public class TcpSocket {

//https://systembash.com/a-simple-java-tcp-server-and-tcp-client/
    private static String ip;
    private static int port;
    private static Boolean ipSeleccionada = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Window v = new Window();
        v.setVisible(true);

        while (true) {
            if (ipSeleccionada) {
                TCPClient client = new TCPClient(ip, port);
            }
        }

        //TCPServer server = new TCPServer();
    }

    public static void setIp(String ip, int port) {

        TcpSocket.ip = ip;
        TcpSocket.port = port;
        TcpSocket.ipSeleccionada = true;
    }
}
