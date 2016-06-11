/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Ticket ticket = new Ticket();
        int productos = 0;
        String continuar = "S";
        do {
            System.out.print("Introduzca el nombre del producto: ");
            ticket.getLineas()[productos].setNombreProducto(br.readLine());
            System.out.print("Precio Unitario= ");
            ticket.getLineas()[productos].setPrecioUnidad(Double.parseDouble(br.readLine()));
            System.out.print("Número de productos: ");
            ticket.getLineas()[productos].setUnidades(Integer.parseInt(br.readLine()));
            System.out.print("Quieres añadir mas productos? S/N: ");
            String p = br.readLine();
            productos++;
            if (p.equals("N")) {
                continuar = "N";
                
            }
            

        } while (continuar.equalsIgnoreCase("S") && productos < 10);
        //Mostrar
        for (int i = 0; i < productos; i++) {
            System.out.println(ticket.listado()[i]);
        }
        System.out.print("Total: ");
        System.out.println(ticket.total());
    }

}
