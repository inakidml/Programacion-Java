/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioticket;

/**
 *
 * @author 7fprog02
 */
public class Ticket {
private LineaTicket[] lineas = new LineaTicket[10];
    public Ticket() {
        for (int i = 0; i < 10; i++) {
            this.lineas[i]=new LineaTicket();
        }
        
    }

    public double total() {
        double suma=0;
        for (int i = 0; i < 10; i++) {
            suma += this.lineas[i].getPrecioUnidad()*this.lineas[i].getUnidades();
        }
        
        return suma;
    }

    public String[] listado() {
        String[] listado = new String[10];
        for (int i = 0; i < 10; i++) {
           listado[i]= this.lineas[i].getNombreProducto()+" "+this.lineas[i].getPrecioUnidad()+" X "+this.lineas[i].getUnidades()+" = "+this.lineas[i].sumaLinea();
        }
        return listado;
    }

    /**
     * @return the lineas
     */
    public LineaTicket[] getLineas() {
        return lineas;
    }
}
