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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        MainWindow v=new MainWindow();
        v.setVisible(true);
        //TCPServer server = new TCPServer();
        while (true) {
            TCPClient client = new TCPClient("www.inaki.bid", 80);    
        }
       
    }
    
}
